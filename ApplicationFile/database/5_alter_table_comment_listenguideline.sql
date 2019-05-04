use toeiconline;

alter table comment add constraint fk_user_comment foreign key (userid) references userEntity(userid);
alter table comment add constraint fk_user_listenguideline foreign key (listenguidelineid) references userEntity(listenguidelineid);