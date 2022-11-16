CREATE SCHEMA RTDM_DICT;
CREATE TABLE RTDM_DICT.DICT_RTDM_PARAMETERS ([DIAGRAM_ID] [nvarchar](50), [PARAMETER_NAME] [nvarchar](50), [DESCRIPTION] [nvarchar](1000),
    [PARAMETER_VALUE] [numeric](15, 2), [PARAMETER_TEXT] [nvarchar](100), [PROGRAM_CODE] [nvarchar](1000),
    [CREDITTYPE] [nvarchar](1000), [CLIENT_TYPE] [varchar](15), [ARRAY_INDEX] [smallint]);

INSERT INTO RTDM_DICT.DICT_RTDM_PARAMETERS (DIAGRAM_ID, PARAMETER_NAME, DESCRIPTION, PARAMETER_VALUE, PARAMETER_TEXT, PROGRAM_CODE, CREDITTYPE, CLIENT_TYPE, ARRAY_INDEX) VALUES
--('CALL_1_RKK2', 'Fact_Salary_Cnt', 'Количество зачислений за N полных месяцев, которое необходимо для формирования предложений', 2.00, NULL, NULL, '01.00.00', 'borrower', 1),
('CALL_1_RKK2', 'Fact_Salary_Cnt', 'Количество зачислений за N полных месяцев, которое необходимо для формирования предложений', 2.00, NULL, '02.03.00', '02.00.00', 'borrower', 1),
--('CLIENT_CATEGORY_ALL', 'empConfirmDateThreshold', 'Максимальный cрок актуальности выписки', 30.00, NULL, NULL, '01.00.00', 'borrower', 1),
('CLIENT_CATEGORY_ALL', 'empConfirmDateThreshold', 'Максимальный cрок актуальности выписки', 30.00, NULL, NULL, '02.00.00', 'borrower', 1);