# team6_claim-table
 create table claim(claimNumber number PRIMARY KEY, claimReason varchar2(30), accidentLocationStreet varchar2(40), 
 accidentCity varchar2(15), accidentState varchar2(15), accidentZip number, claimtype varchar2(30), policyNumber number);
 
 insert into claim values(501,'Accident','Nizampet','Hyderabad','Telangana',50000,'Injury',1234);
  
 insert into claim values(502,'Theft','DHarwad','Hubli','Karnataka',50001,'Repair',4321);
 
 insert into claim values(503,'HitAndRun','MarinaBeach','Chennai','TamilNadu',50011,'Repair',4312);
 
 insert into claim values(504,'Accident','KovalamBeachRoad','Trivandrum','Kerala',50234,'Injury',4213);
 
