# TP6
Première Partie : Développer un micro-service
   - MIcro Service avec Web Service RESTFUL :
Donc on a commencé par choisir la deuxième option afin de créer le projet dont son nom est le suivant: bank-account-service  et par la suite on a ajouté les dépendances nécessaires pour le travail.
Ensuite on a emmanché la création du package de l'application nommée entities et à l'intérieur de ce dernier on va créer la classe java BankAccount:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/7cb0b427-7137-4000-b3ac-9d9a186ca894)
On a passe par la suite à la création du package de l'application nommée enums et à l'intérieur de ce dernier on va créer  un énumerateur AccountType:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/2522b998-ab8a-4d3d-9ea9-7bae81a788db)
Ensuite on va créer un package nommée repositories à l'intérieur de ce dernier y'aura la création de l'interface BankAccountRepository :
![image](https://github.com/baayaouiimane/TP6/assets/167249908/4cd51834-8bd1-42f8-8d71-f06da96dbaee)
Ensuite on va passer pour faire un petit test :
![image](https://github.com/baayaouiimane/TP6/assets/167249908/597cd22b-2385-46d2-8b1e-ba6f33cace0e)
![image](https://github.com/baayaouiimane/TP6/assets/167249908/55af515b-60f9-4235-b7f7-9579dc28a8b0)
mais avant de le faire il faut parametrer la base donnée:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/6beb6dfc-bf97-425e-9bbc-49ffb27ad84a)
Alors en visitant le localhost:8081/h2-console on aura le résultat suivant:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/ba156c90-29bb-42a6-b05c-ca6ee19baeea)
Cette fois ci nous voudrions exposer les fonctionnalités de notre microservices pour le monde extérieur et on a le choix de passer via un webservice basée sur rest pour cela on va créer un package web et a l'intérieur de ce dernier on va créer une classe dont son nom est:AccountRestController
![image](https://github.com/baayaouiimane/TP6/assets/167249908/c4d49196-a5d5-4582-a918-2eabc61459de)
![image](https://github.com/baayaouiimane/TP6/assets/167249908/86cd72b2-2fbb-4bc8-b9ea-faadba7f8fc5)
Faisant un petit test pour voir si notre rest fonctionne :
![image](https://github.com/baayaouiimane/TP6/assets/167249908/4b0e1c71-2057-4f9f-bbb1-ed2fd7ad8bcb)
![image](https://github.com/baayaouiimane/TP6/assets/167249908/8c735f69-45a8-4af4-8483-f29fd4807f2d)
Et pour consulter juste un compte  on a le résultat ci dessous :
![image](https://github.com/baayaouiimane/TP6/assets/167249908/3a32e901-c735-4368-8f1b-82dfb175b20d)
Ensuite on va ajouter un compte et pour effectuer cette tache il faut ajouter des modifications dans AccountRestController:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/70d649a7-5a49-46fe-98d7-5de68c609c54)
Et en faisant la petite modification du type double afin de l'écrire de la sorte:Double dans BankAccount
![image](https://github.com/baayaouiimane/TP6/assets/167249908/2175f2eb-88ed-4370-bb97-abe91344da74)
Et avant de faire le test il faut apporter des modifications a AccountRestController:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/af975847-0c39-4949-83a8-f4ca09cb2120)
On va tester par la suite  les méthodes dans postMan:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/a0e37c7d-9e1d-4d36-a1b0-59a58edd473d)
Voila un deuxiéme test afin de consulter juste un compte souhaité:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/6571e3bb-baa3-4016-9131-8fbbc8a651d0)
Cette fois ci avec un post, j'envoye les headers:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/437a2a5b-344a-4958-9608-39a6a19ed61f)
Et en cliquant sur Body je vais utilser les données que je dois envoyer:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/370e7e66-c6bd-4427-b788-1f0dd6c881bd)
En cliquant sur send on aura un compte qui a été créer :
![image](https://github.com/baayaouiimane/TP6/assets/167249908/941c099e-9325-4182-8501-27ee455aee50)
Pour résoudre l'erreur  interne qui apparait ci dessus  il faut ajouter une instruction dans AccountRestController et plus précisemment dans la méthode save:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/feabb7d6-898f-4809-a2d6-a0a40c929db0)
Et par la suite en recliquant sur le bouton send on obtient l'affichage ci dessous:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/2787806b-754e-4394-a844-e7b2a61f0420)
Si on teste cette fois ci avec Put et on aura le résultat qui apparait ci dessous:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/eb19e489-9c4a-4a98-ac2d-663162adb695)
Avec Springboot pour pouvoir utiliser la documentation swagger d'une restapi il faut ajouter la dépendance dans le fichier pom.xml:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/3fa5c291-24de-4f64-90bd-839058eff11b)
Pour utiliser Spring Datarest il faut ajouter cette dépendance:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/97c99095-a990-4ae7-aee1-d3069adfa1da)
Lorsqu'on ajoute cette dépendance bein spring crée un webservice générique qui peut fonctionner avec n'importe quelle entité donc au final mon restController crée je n'ai pas besoin de le faire,il suffit d'aller vers le repository plus précisemment dans l'interface BankAccountRepository on va ajouter une annotation comme il est présenté ci desssous:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/df252a2f-b7c2-4fb6-aacc-d95467fd971a)
Et Maintenant pour pouvoir tester je vais revenir vers le Controlleur comme il apparait ci dessous:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/967ecb0e-93f7-457e-be42-3b9bdce79c93)
En démarrant et ensuite en visitant le localhost:8081/bankAccounts on aura le résultat ci dessous:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/64cf56ec-5481-4ec8-8690-ed338c4c37b7)
Et en visitant:http://localhost:8081/api/bankAccounts
![image](https://github.com/baayaouiimane/TP6/assets/167249908/64679ea2-98cb-4471-aed7-85ed53af1d61)







