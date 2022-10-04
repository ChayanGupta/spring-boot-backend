use planmytrip;
show tables;
desc activity; desc activity_package; desc area_of_interest; desc interest_package; desc package; desc type; desc type_package;
insert into activity values (1,"cycling",99.99); 
insert into activity values (2,"camping",79.99); 
insert into activity values (3,"hiking",89.99);
insert into area_of_interest values (1,"Beaches"); 
insert into area_of_interest values (2,"Hill Station"); 
insert into area_of_interest values (3,"Mountains");
insert into type values (1,"Best Selling"); 
insert into type values (2,"Hot and New"); 
insert into type values (3,"Recommend");
insert into package values (1,"Singapore","https://images.pexels.com/photos/777059/pexels-photo-777059.jpeg?auto=compress&cs=tinysrgb&w=600",239.99); 
insert into package values (2,"Gohati","https://images.pexels.com/photos/326691/pexels-photo-326691.jpeg?auto=compress&cs=tinysrgb&w=600",279.99); 
insert into package values (3,"Goa","https://images.pexels.com/photos/994605/pexels-photo-994605.jpeg?auto=compress&cs=tinysrgb&w=600",139.99);
insert into activity_package values (1,1,1); 
insert into activity_package values (2,1,2); 
insert into activity_package values (3,2,3);
insert into interest_package values (1,2,1); 
insert into interest_package values (2,3,1); 
insert into interest_package values (3,2,2); 
insert into interest_package values (4,2,3);
insert into type_package values (1,1,3); 
insert into type_package values (2,2,1); 
insert into type_package values (3,1,2);
insert into type_package values (4,3,2);
select * from activity_package;
select * from interest_package;
select * from type_package;