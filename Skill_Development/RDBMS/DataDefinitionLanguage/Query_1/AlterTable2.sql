---Refer the following schema and add a constraint CHECK_FEES in course table to ensure that the fee is more than five hundred.
ALTER TABLE COURSE ADD CONSTRAINT CHECK_FEES CHECK(Fees >500);
