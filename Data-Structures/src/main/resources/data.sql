insert into post (id, content,is_display,name,no_of_likes)
values (1,'Java is a oop language and it is a one of most popular open source language',true,'About Java',6);

insert into post (id, content,is_display,name,no_of_likes)
values (2,'GraphQL is a query language for APIs and a runtime for fulfilling those queries with your existing data.',true,'About GraphQl',10);

insert into post (id, content,is_display,name,no_of_likes)
values (3,'React is a free and open-source front-end JavaScript library for building user interfaces based on components',true,'About React',8);

insert into post_comments (id,coment_content,post_id)
values (1,'Very informative', 1);

insert into post_comments (id,coment_content,post_id)
values (2,'Very nice post', 1);

insert into post_comments (id,coment_content,post_id)
values (3,'Please give sample code', 2);

insert into post_comments (id,coment_content,post_id)
values (4,'Very informative', 2);

insert into post_comments (id,coment_content,post_id)
values (5,'You make my day,thanks in advanced', 1);

insert into post_comments (id,coment_content,post_id)
values (6,'Nice article', 3);