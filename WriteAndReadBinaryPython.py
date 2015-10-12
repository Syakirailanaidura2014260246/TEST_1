with open ('syakira.bin', 'wb') as f:
    f.write(b'NAME: NUR SYAKIRA BINTI AB HALIM \n')
    f.write(b'MATRIX NO: 2014260246 \n')
    f.write(b'GENDER: FEMALE \n')
    f.write(b'AGE: 24 \n')
    f.write(b'E-MAILS: cahaysyakira09@gmail.com \n')
    f.write(b'MOBILE PHONE: 0136257730 \n')
    
with open('syakira.bin', 'rb') as f:
    data = f.read()
