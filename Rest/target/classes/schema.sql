DROP TABLE IF EXISTS eais;

CREATE TABLE eais (
  ID INT NOT NULL AUTO_INCREMENT, -- 자동생성되는 ID
  MGM_BLDRGST_PK VARCHAR(255),  -- 관리_건축물대장_PK
  EXPOS_PUBUSE_GB_CD VARCHAR(255), -- 전유_공용_구분_코드
  EXPOS_PUBUSE_GB_CD_NM VARCHAR(255), -- 전유_공용_구분_코드_명  
  MAIN_PURPS_CD_NM VARCHAR(255), -- 주_용도_코드_명
  SIGUNGU_CD VARCHAR(255), -- 시군구_코드
  FLR_NO_NM VARCHAR(255), -- 층_번호_명
  REGSTR_KIND_CD VARCHAR(255), -- 대장_종류_코드
  FLR_GB_CD_NM VARCHAR(255), -- 층_구분_코드_명
  AREA DOUBLE, -- 면적(㎡)
  FLR_GB_CD VARCHAR(255), -- 층_구분_코드
  FLR_NO INT, -- 층_번호
  REGSTR_KIND_CD_NM VARCHAR(255),-- 대장_종류_코드_명
  NA_ROAD_CD VARCHAR(255), -- 새주소_도로_코드
  MAIN_PURPS_CD VARCHAR(255), -- 주_용도_코드
  NEW_PLAT_PLC VARCHAR(255), -- 도로명_대지_위치
  NA_UGRND_CD VARCHAR(255), -- 새주소_지상지하_코드
  DONG_NM VARCHAR(255), -- 동_명칭
  REGSTR_GB_CD_NM VARCHAR(255), -- 대장_구분_코드_명
  BUN VARCHAR(255), -- 번
  STRCT_CD_NM VARCHAR(255), -- 구조_코드_명
  NA_MAIN_BUN INT, -- 새주소_본_번
  REGSTR_GB_CD VARCHAR(255), -- 대장_구분_코드
  MAIN_ATCH_GB_CD VARCHAR(255), -- 주_부속_구분_코드
  BLD_NM VARCHAR(255), -- 건물_명
  ETC_PURPS VARCHAR(255), -- 기타_용도
  CRTN_DAY VARCHAR(255), -- 생성_일자
  NA_BJDONG_CD VARCHAR(255), -- 새주소_법정동_코드
  SPLOT_NM VARCHAR(255), -- 특수지_명
  BLOCK VARCHAR(255), -- 블록
  NA_SUB_BUN INT, -- 새주소_부_번
  LOT VARCHAR(255), -- 로트
  BJDONG_CD VARCHAR(255), -- 법정동_코드
  PLAT_GB_CD VARCHAR(255), -- 대지_구분_코드
  ETC_STRCT VARCHAR(255), -- 기타_구조
  PLAT_PLC VARCHAR(255), -- 대지_위치
  HO_NM VARCHAR(255), -- 호_명칭
  MAIN_ATCH_GB_CD_NM VARCHAR(255), -- 주_부속_구분_코드_명
  STRCT_CD VARCHAR(255), -- 구조_코드
  JI VARCHAR(255), -- 지

  PRIMARY KEY(ID)
);
