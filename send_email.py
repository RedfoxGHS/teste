import smtplib, ssl
import os
import email.message


corpo_email = """
    <p><h2>aaaaa<b>aaa</b>aaaak</h2></p>
    <p>;-;</p>
"""

msg = email.message.Message()
msg['Subject'] = "Teste s207 ;-;"
msg['From'] = os.environ.get('USER_EMAIL')
msg['TO'] = os.environ.get('USER_EMAIL')
password = os.environ.get('USER_PASSWORD')
msg.add_header('Content-Type', 'text/html')
msg.set_payload(corpo_email)

s = smtplib.SMTP("smtp.gmail.com: 587")
s.starttls()
s.login(msg['From'], password)
s.sendmail(msg['From'], [msg['to']], msg.as_string().encode('utf-8'))
print("email enviado")

# port = 465
# smtp_server = "smtp.gmail.com"
# USERNAME = os.environ.get('USER_EMAIL')
# PASSWORD = os.environ.get('USER_PASSWORD')
# message = """\
# Subject: Testando
#
# agora essa ..... tem que ir.
# """
#
# context = ssl.create_default_context()
# with smtplib.SMTP_SSL(smtp_server, port, context=context) as server:
#     server.login(USERNAME,PASSWORD)
#     server.sendmail(USERNAME,USERNAME,message)