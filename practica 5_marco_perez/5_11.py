import random
import time
random.seed(time.time())
minim=int(raw_input("valorminimo:"))
maxim=int(raw_input("valormaximo:"))
secret=random.randint(minim,maxim)
num=int
while num!=secret:
    print('Intenta adivinar el numero')
    num=int(raw_input("dime un numero"))
    break
if num<secret:
         print('Tu estimación es muy baja.')      
if num>secret:
         print('Tu estimación es muy alta.')         
if num == secret:
    print 'correto'
