username = input()

if username == "admin":
    password = input()
    if password == "secret123":
        print("Login Successful")
    else:
        print("Incorrect Password")
elif username == "guest":
    print("Guest Access Granted")
else:
    print("User Not Found")
    