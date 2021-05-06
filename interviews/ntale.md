Request to encrypt the url/shorten it

request = await axios.post('https://my_domain/<encrypt_url>, {
  data: {
    url: "full_url"
  },
  headers: {
    "Authorization":  "token including identifying data"
  }
})

- verification of the caller/client
- hasing(to generate a unique string to append to the domain)
- string the mapping in the database(check for existance of the url to avoid conflicts)
- look up the full url using the short string(the previously hased/randomly generated one)
- return to the frontend
- let the frontend do the redirect

postgresql

ROUTES:
 - /encrypt_url [BODY/url_param = full_url] -> [POST]
 - /decrypt_url [short string as url param] -> [GET]

 two different users request to encrypt the same url
  the same url ==> same hash

  Lifespan 3 years 

  TIMESTAMP field

  - everytime a request comes in I would first check the sqlite db/file if the requested url is existing. if so, return early and don't hit postgresql db.
  - otherwise, 

 - I would have a count column in the db
 - 

 Ratio of requests
 encrypt:decrypt_url
 1:100
 1. User encrypts url
 2. User shares enc url with 100 people