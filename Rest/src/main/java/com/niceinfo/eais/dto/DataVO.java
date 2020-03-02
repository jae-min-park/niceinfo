package com.niceinfo.eais.dto;

public class DataVO {
	int ID;
	String MGM_BLDRGST_PK; // 관리_건축물대장_PK
	String EXPOS_PUBUSE_GB_CD; // 전유_공용_구분_코드
	String MAIN_PURPS_CD; // 주_용도_코드
	String EXPOS_PUBUSE_GB_CD_NM; // 전유_공용_구분_코드_명
	String MAIN_PURPS_CD_NM; // 주_용도_코드_명
	String SIGUNGU_CD; // 시군구_코드
	String FLR_NO_NM; // 층_번호_명
	String REGSTR_KIND_CD; // 대장_종류_코드
	String FLR_GB_CD_NM; // 층_구분_코드_명
	double AREA; // 면적(㎡)
	String FLR_GB_CD; // 층_구분_코드
	int FLR_NO; // 층_번호
	String REGSTR_KIND_CD_NM;// 대장_종류_코드_명
	String NA_ROAD_CD; // 새주소_도로_코드
	String NEW_PLAT_PLC; // 도로명_대지_위치
	String NA_UGRND_CD; // 새주소_지상지하_코드
	String DONG_NM; // 동_명칭	//
	String REGSTR_GB_CD_NM; // 대장_구분_코드_명
	String BUN; // 번
	String STRCT_CD_NM; // 구조_코드_명
	int NA_MAIN_BUN; // 새주소_본_번
	String REGSTR_GB_CD; // 대장_구분_코드
	String MAIN_ATCH_GB_CD; // 주_부속_구분_코드
	String BLD_NM; // 건물_명	//
	String ETC_PURPS; // 기타_용도
	String CRTN_DAY; // 생성_일자
	String NA_BJDONG_CD; // 새주소_법정동_코드
	String SPLOT_NM; // 특수지_명	//
	String BLOCK; // 블록	//
	int NA_SUB_BUN; // 새주소_부_번
	String LOT; // 로트
	String BJDONG_CD; // 법정동_코드
	String PLAT_GB_CD; // 대지_구분_코드
	String ETC_STRCT; // 기타_구조
	String PLAT_PLC; // 대지_위치
	String HO_NM; // 호_명칭
	String MAIN_ATCH_GB_CD_NM; // 주_부속_구분_코드_명
	String STRCT_CD; // 구조_코드
	String JI;// 지
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getMGM_BLDRGST_PK() {
		return MGM_BLDRGST_PK;
	}
	public void setMGM_BLDRGST_PK(String mGM_BLDRGST_PK) {
		MGM_BLDRGST_PK = mGM_BLDRGST_PK;
	}
	public String getEXPOS_PUBUSE_GB_CD() {
		return EXPOS_PUBUSE_GB_CD;
	}
	public void setEXPOS_PUBUSE_GB_CD(String eXPOS_PUBUSE_GB_CD) {
		EXPOS_PUBUSE_GB_CD = eXPOS_PUBUSE_GB_CD;
	}
	public String getMAIN_PURPS_CD() {
		return MAIN_PURPS_CD;
	}
	public void setMAIN_PURPS_CD(String mAIN_PURPS_CD) {
		MAIN_PURPS_CD = mAIN_PURPS_CD;
	}
	public String getEXPOS_PUBUSE_GB_CD_NM() {
		return EXPOS_PUBUSE_GB_CD_NM;
	}
	public void setEXPOS_PUBUSE_GB_CD_NM(String eXPOS_PUBUSE_GB_CD_NM) {
		EXPOS_PUBUSE_GB_CD_NM = eXPOS_PUBUSE_GB_CD_NM;
	}
	public String getMAIN_PURPS_CD_NM() {
		return MAIN_PURPS_CD_NM;
	}
	public void setMAIN_PURPS_CD_NM(String mAIN_PURPS_CD_NM) {
		MAIN_PURPS_CD_NM = mAIN_PURPS_CD_NM;
	}
	public String getSIGUNGU_CD() {
		return SIGUNGU_CD;
	}
	public void setSIGUNGU_CD(String sIGUNGU_CD) {
		SIGUNGU_CD = sIGUNGU_CD;
	}
	public String getFLR_NO_NM() {
		return FLR_NO_NM;
	}
	public void setFLR_NO_NM(String fLR_NO_NM) {
		FLR_NO_NM = fLR_NO_NM;
	}
	public String getREGSTR_KIND_CD() {
		return REGSTR_KIND_CD;
	}
	public void setREGSTR_KIND_CD(String rEGSTR_KIND_CD) {
		REGSTR_KIND_CD = rEGSTR_KIND_CD;
	}
	public String getFLR_GB_CD_NM() {
		return FLR_GB_CD_NM;
	}
	public void setFLR_GB_CD_NM(String fLR_GB_CD_NM) {
		FLR_GB_CD_NM = fLR_GB_CD_NM;
	}
	public double getAREA() {
		return AREA;
	}
	public void setAREA(double aREA) {
		AREA = aREA;
	}
	public String getFLR_GB_CD() {
		return FLR_GB_CD;
	}
	public void setFLR_GB_CD(String fLR_GB_CD) {
		FLR_GB_CD = fLR_GB_CD;
	}
	public int getFLR_NO() {
		return FLR_NO;
	}
	public void setFLR_NO(int fLR_NO) {
		FLR_NO = fLR_NO;
	}
	public String getREGSTR_KIND_CD_NM() {
		return REGSTR_KIND_CD_NM;
	}
	public void setREGSTR_KIND_CD_NM(String rEGSTR_KIND_CD_NM) {
		REGSTR_KIND_CD_NM = rEGSTR_KIND_CD_NM;
	}
	public String getNA_ROAD_CD() {
		return NA_ROAD_CD;
	}
	public void setNA_ROAD_CD(String nA_ROAD_CD) {
		NA_ROAD_CD = nA_ROAD_CD;
	}
	public String getNEW_PLAT_PLC() {
		return NEW_PLAT_PLC;
	}
	public void setNEW_PLAT_PLC(String nEW_PLAT_PLC) {
		NEW_PLAT_PLC = nEW_PLAT_PLC;
	}
	public String getNA_UGRND_CD() {
		return NA_UGRND_CD;
	}
	public void setNA_UGRND_CD(String nA_UGRND_CD) {
		NA_UGRND_CD = nA_UGRND_CD;
	}
	public String getDONG_NM() {
		return DONG_NM;
	}
	public void setDONG_NM(String dONG_NM) {
		DONG_NM = dONG_NM;
	}
	public String getREGSTR_GB_CD_NM() {
		return REGSTR_GB_CD_NM;
	}
	public void setREGSTR_GB_CD_NM(String rEGSTR_GB_CD_NM) {
		REGSTR_GB_CD_NM = rEGSTR_GB_CD_NM;
	}
	public String getBUN() {
		return BUN;
	}
	public void setBUN(String bUN) {
		BUN = bUN;
	}
	public String getSTRCT_CD_NM() {
		return STRCT_CD_NM;
	}
	public void setSTRCT_CD_NM(String sTRCT_CD_NM) {
		STRCT_CD_NM = sTRCT_CD_NM;
	}
	public int getNA_MAIN_BUN() {
		return NA_MAIN_BUN;
	}
	public void setNA_MAIN_BUN(int nA_MAIN_BUN) {
		NA_MAIN_BUN = nA_MAIN_BUN;
	}
	public String getREGSTR_GB_CD() {
		return REGSTR_GB_CD;
	}
	public void setREGSTR_GB_CD(String rEGSTR_GB_CD) {
		REGSTR_GB_CD = rEGSTR_GB_CD;
	}
	public String getMAIN_ATCH_GB_CD() {
		return MAIN_ATCH_GB_CD;
	}
	public void setMAIN_ATCH_GB_CD(String mAIN_ATCH_GB_CD) {
		MAIN_ATCH_GB_CD = mAIN_ATCH_GB_CD;
	}
	public String getBLD_NM() {
		return BLD_NM;
	}
	public void setBLD_NM(String bLD_NM) {
		BLD_NM = bLD_NM;
	}
	public String getETC_PURPS() {
		return ETC_PURPS;
	}
	public void setETC_PURPS(String eTC_PURPS) {
		ETC_PURPS = eTC_PURPS;
	}
	public String getCRTN_DAY() {
		return CRTN_DAY;
	}
	public void setCRTN_DAY(String cRTN_DAY) {
		CRTN_DAY = cRTN_DAY;
	}
	public String getNA_BJDONG_CD() {
		return NA_BJDONG_CD;
	}
	public void setNA_BJDONG_CD(String nA_BJDONG_CD) {
		NA_BJDONG_CD = nA_BJDONG_CD;
	}
	public String getSPLOT_NM() {
		return SPLOT_NM;
	}
	public void setSPLOT_NM(String sPLOT_NM) {
		SPLOT_NM = sPLOT_NM;
	}
	public String getBLOCK() {
		return BLOCK;
	}
	public void setBLOCK(String bLOCK) {
		BLOCK = bLOCK;
	}
	public int getNA_SUB_BUN() {
		return NA_SUB_BUN;
	}
	public void setNA_SUB_BUN(int nA_SUB_BUN) {
		NA_SUB_BUN = nA_SUB_BUN;
	}
	public String getLOT() {
		return LOT;
	}
	public void setLOT(String lOT) {
		LOT = lOT;
	}
	public String getBJDONG_CD() {
		return BJDONG_CD;
	}
	public void setBJDONG_CD(String bJDONG_CD) {
		BJDONG_CD = bJDONG_CD;
	}
	public String getPLAT_GB_CD() {
		return PLAT_GB_CD;
	}
	public void setPLAT_GB_CD(String pLAT_GB_CD) {
		PLAT_GB_CD = pLAT_GB_CD;
	}
	public String getETC_STRCT() {
		return ETC_STRCT;
	}
	public void setETC_STRCT(String eTC_STRCT) {
		ETC_STRCT = eTC_STRCT;
	}
	public String getPLAT_PLC() {
		return PLAT_PLC;
	}
	public void setPLAT_PLC(String pLAT_PLC) {
		PLAT_PLC = pLAT_PLC;
	}
	public String getHO_NM() {
		return HO_NM;
	}
	public void setHO_NM(String hO_NM) {
		HO_NM = hO_NM;
	}
	public String getMAIN_ATCH_GB_CD_NM() {
		return MAIN_ATCH_GB_CD_NM;
	}
	public void setMAIN_ATCH_GB_CD_NM(String mAIN_ATCH_GB_CD_NM) {
		MAIN_ATCH_GB_CD_NM = mAIN_ATCH_GB_CD_NM;
	}
	public String getSTRCT_CD() {
		return STRCT_CD;
	}
	public void setSTRCT_CD(String sTRCT_CD) {
		STRCT_CD = sTRCT_CD;
	}
	public String getJI() {
		return JI;
	}
	public void setJI(String jI) {
		JI = jI;
	}
	
	@Override
	public String toString() {
		return "VO [MGM_BLDRGST_PK=" + MGM_BLDRGST_PK + ", EXPOS_PUBUSE_GB_CD=" + EXPOS_PUBUSE_GB_CD
				+ ", MAIN_PURPS_CD=" + MAIN_PURPS_CD + ", EXPOS_PUBUSE_GB_CD_NM=" + EXPOS_PUBUSE_GB_CD_NM
				+ ", MAIN_PURPS_CD_NM=" + MAIN_PURPS_CD_NM + ", SIGUNGU_CD=" + SIGUNGU_CD + ", FLR_NO_NM=" + FLR_NO_NM
				+ ", REGSTR_KIND_CD=" + REGSTR_KIND_CD + ", FLR_GB_CD_NM=" + FLR_GB_CD_NM + ", AREA=" + AREA
				+ ", FLR_GB_CD=" + FLR_GB_CD + ", FLR_NO=" + FLR_NO + ", REGSTR_KIND_CD_NM=" + REGSTR_KIND_CD_NM
				+ ", NA_ROAD_CD=" + NA_ROAD_CD + ", NEW_PLAT_PLC=" + NEW_PLAT_PLC + ", NA_UGRND_CD=" + NA_UGRND_CD
				+ ", DONG_NM=" + DONG_NM + ", REGSTR_GB_CD_NM=" + REGSTR_GB_CD_NM + ", BUN=" + BUN + ", STRCT_CD_NM="
				+ STRCT_CD_NM + ", NA_MAIN_BUN=" + NA_MAIN_BUN + ", REGSTR_GB_CD=" + REGSTR_GB_CD + ", MAIN_ATCH_GB_CD="
				+ MAIN_ATCH_GB_CD + ", BLD_NM=" + BLD_NM + ", ETC_PURPS=" + ETC_PURPS + ", CRTN_DAY=" + CRTN_DAY
				+ ", NA_BJDONG_CD=" + NA_BJDONG_CD + ", SPLOT_NM=" + SPLOT_NM + ", BLOCK=" + BLOCK + ", NA_SUB_BUN="
				+ NA_SUB_BUN + ", LOT=" + LOT + ", BJDONG_CD=" + BJDONG_CD + ", PLAT_GB_CD=" + PLAT_GB_CD
				+ ", ETC_STRCT=" + ETC_STRCT + ", PLAT_PLC=" + PLAT_PLC + ", HO_NM=" + HO_NM + ", MAIN_ATCH_GB_CD_NM="
				+ MAIN_ATCH_GB_CD_NM + ", STRCT_CD=" + STRCT_CD + ", JI=" + JI + "]";
	}
	
}

