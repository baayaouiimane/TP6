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
Cette fois en changeant l'url on aura le résultat ci dessous:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/93fd7ad6-6ce1-4862-aeb0-2b2b1ed6bb41)
Cette fois ci on décide de créer une méthode on est redirigé vers BankAccountRepository:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/dfb93b30-da83-4372-9ada-978eaeab97c7)
En visitant l'url qui apparait ci dessous on aura le résultat suivant:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/aa016c21-de3a-41ba-9662-3f4dd8feed7d)
Cette fois ci en changeant l'url on aura le résultat suivant:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/a066a69c-9dc3-4efc-9f05-1cf1abea80b4)
Spring datarest nous donne la possibilité d'utiliser les projections c'est par exemple quand je consulte un compte il me donne par défaut l'id il le masque et donc il suffit juste de creer une interface dont son nom est AccountProjection dans le package entities:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/b1555aa7-2e44-433c-bea4-66b8d2146be6)
 En démarrant une autre fois on aura l'affichage suivant:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/2712f604-3e69-4b45-a598-88fd83e19a08)
En ajoutant cette instruction dans l'interface AccountProjection:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/abb46577-801a-4f8a-ae25-5b938c92288c)
On redémarre et on obtient le résultat ci dessous:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/5bbfb314-ef1e-4dad-ba82-1bc6bfb4ed7a)
Ensuite on va ajouter des annotations dans l'interface bankAccountRepository :
![image](https://github.com/baayaouiimane/TP6/assets/167249908/d5fc2df1-893f-4c51-a8ce-53718dc593bb)
Cette fois ci si vous souhaitez faire la recherche il suffit de taper cet url qui apparait ci dessous:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/af2962bd-e527-4890-89fa-e8b2384fdc1c)
Jusqu'a présent on a pas respecter les normes et pour etre dans les normes, il faut utiliser les DTO et la couche service et pour cela on va effectuer la création de la couche service:donc on va créer un package nommée service et a l'intérieur de ce dernier y'aura la création d'une interface :AccountService
![image](https://github.com/baayaouiimane/TP6/assets/167249908/9f77cf15-2cf9-4ff8-8bf3-1f6f98b599be)
Ensuite on va créer un package nommée dto dans lequel on va créer les classes BankAccountResponseDTO et BankAccountRequestDTO:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/1f92efb9-f0a8-42ef-948d-0a8ea1712c1a)
![image](https://github.com/baayaouiimane/TP6/assets/167249908/75418aa1-7ecc-4b05-a35e-8d3fc2cb31a9)
Ensuite on va faire une implémentation de l'interface AccountService:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/20cafa06-68cd-467e-bd77-bee5420a91a8)
![image](https://github.com/baayaouiimane/TP6/assets/167249908/9410a64a-3ac7-4daf-9cd4-fbe9f9cd274c)
Et ensuite on va faire un petit changement dans AccountRestController:
Comme l'ajout de cette déclaration:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/2dc1d6a9-c685-4a3c-898f-5f6d7a0898c0)
Ainsi que des petites modifications au niveau de la méthode save:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/7a83a408-b192-4e50-90f3-ef2aea93ab99)
Et le dernier point qui faut respecter les normes c il faut ajouter un package qu porte comme nom:mappers
dans lequel on va créer une classe AccountMapper:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/19f375c3-c255-4e8f-9398-ed606c2c0a86)
 Et pour utiliser cette méthode dans le controlleur:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/bb03c4cd-a44e-4ca5-bfac-ca8353e2767f)
Et aussi dans AccountServiceImpl on effectuer des modifications:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/ddf0bf77-cb20-4e4f-9485-0709250d350b)

Deuxième Partie :
Cette fois ci on va utiliser un Micro-SERVICE avec web service GRAPHQL mais tout d'abords il faut créer a l'intérieur du dossier graphql un fichier schéma.graphqls :
![image](https://github.com/baayaouiimane/TP6/assets/167249908/3733abe2-3c94-4ac3-9475-f0077185f064)
Ensuite on va savoir comment implémenter le service dans le dossier web tout d'abords il faut construire une classe:BankAccountGraphQLController
![image](https://github.com/baayaouiimane/TP6/assets/167249908/c6165341-eb4f-4220-be27-29762ca0bda0)
Faisant un test mais avant ca il faut ajouter dans le fichier application.properties le contenu ci dessous  pour que graghql puisse fonctionner:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/89b017d2-2782-4082-bcc4-0705f2d1a6d7)
En visitant l'url qui apparait ci dessous on aura l'affichage suivant:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/58fc4da8-fe06-43b6-9662-790d195999c1)
Supposons que je veux récuperer un compte  on va apporter a la classe BankAccountGraphQLController des modifications:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/6aaede04-0fb8-47ca-bb50-5f1bf4c25a5b)
Et pour pouvoir utiliser la méthode qui apparait ci dessus il va falloir faire ce travail dans schema.graphqls:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/b5b06419-9d83-4913-bcb9-5e060ca7bab1)
Et on va faire un  test:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/fb60cea5-91ed-4a30-8df0-70210b269884)
![image](https://github.com/baayaouiimane/TP6/assets/167249908/37e14a91-f976-46f8-a0a8-9f35948e1706)
On remarque d'apres le résultat ci dessus on a null car il n'a pas pu mapper et pour résoudre ce probleme voila la solution
![image](https://github.com/baayaouiimane/TP6/assets/167249908/ea24fe0e-3fdd-4919-87d0-f5cd1065cb84)
![image](https://github.com/baayaouiimane/TP6/assets/167249908/0770a8be-21c9-43df-be77-7cfe1d8f40ab)
Maintenant on va voir le cas des exceptions si je demande un compte qui n'existe pas:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/52017ee5-570e-4c9b-9352-626d213541c6)
Et donc pour récuperer le message d'exception il faut ajouter un handler d'exception, tout simplement il faut creer un package dont son nom est exceptions et dans ce dernier je vais créer une classe CustomDataFetcherExceptionResolver
![image](https://github.com/baayaouiimane/TP6/assets/167249908/0e765457-17a8-47a1-888e-4e08eb1d5f62)
![image](https://github.com/baayaouiimane/TP6/assets/167249908/f416dba5-52e1-4866-8c2f-a0d6cb7698c9)
Et on va obtenir ce résultat:






 






