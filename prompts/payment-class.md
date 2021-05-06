# Prompt

Design a class(es) to represent a credit card payment.

PaymentMethod 
- paymentMethodId 
- Credit Card
  - CardNumber
  - Security Code
  - Zip Code
  - Name on card 
- Debit Card 

Payment 
- Payment Amount 
- paymentMethodId 
- Payment status - processed, pending, cancelled, refunded
- Audit information 

UserInformation 
- userId
- userEmail
- paymentMethodIds 