package mcframe.serverMSUD.MSUDL5010;

import java.util.*;

import static mcframe.serverCore.queryapi.MCQueryExecution.*;
import static mcframe.serverCore.cache.MCJoinerList.*;

import static mcframe.commonCore.util.MCCollectionUtil.*;

import mcframe.serverMBBE.MBBEL0080.MBBEL_DataChecker;
import mcframe.serverMS.dbc.*;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonMA.constant.MAC_ITM_GRP_TYP;
import mcframe.serverCore.cache.MCJoinerList;
import mcframe.serverCore.queryapi.MCDBContainer;

import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;

public class MSUDL_DataChecker_MC extends MBBEL_DataChecker {

	protected List<String> getItmBaseTables() {
		List<String> itmBaseTables = new ArrayList<String>();
		itmBaseTables.add(MST_PRMS_RECV_IF_R.TABLE_NAME);
		itmBaseTables.add(MST_INSP_ACT_IF_R.TABLE_NAME);
		itmBaseTables.add(MST_ORDSND_ACT_QTY_IF_R.TABLE_NAME);
		itmBaseTables.add(MST_ORDSND_DLYDMND_IF_R.TABLE_NAME);
		itmBaseTables.add(MST_ORDSND_ITMOPER_IF_R.TABLE_NAME);
		itmBaseTables.add(MST_ORDSND_ITM_DTL_IF_R.TABLE_NAME);
		itmBaseTables.add(MST_ORDSND_ORD_LNK_IF_R.TABLE_NAME);
		itmBaseTables.add(MST_BILL_RECV_IF_R.TABLE_NAME);
		itmBaseTables.add(MST_ARR_ACT_RECV_IF_R.TABLE_NAME);
		itmBaseTables.add(MST_ESHIP_ACT_RECV_IF_R.TABLE_NAME);
		itmBaseTables.add(MST_ARR_PR_IF_R.TABLE_NAME);
		itmBaseTables.add(MST_SHIP_PR_IF_R.TABLE_NAME);
		return itmBaseTables;
	}

	protected List<String> getSundryItmBaseTables() {
		List<String> sundryItmBaseTables = new ArrayList<String>();
		sundryItmBaseTables.add(MST_ACXFR_ACT_RECV_IF_R.TABLE_NAME);
		sundryItmBaseTables.add(MST_SHIP_ACT_RECV_IF_R.TABLE_NAME);
		sundryItmBaseTables.add(MST_XFR_ACT_RECV_IF_R.TABLE_NAME);
		sundryItmBaseTables.add(MST_MLY_STK_IF_R.TABLE_NAME);
		sundryItmBaseTables.add(MST_NON_MOV_STK_IF_R.TABLE_NAME);
		sundryItmBaseTables.add(MST_IO_SCHD_IF_R.TABLE_NAME);
		sundryItmBaseTables.add(MST_ITM_ORDER_IF_R.TABLE_NAME);
		sundryItmBaseTables.add(MST_ORDSND_GI_SCHD_IF_R.TABLE_NAME);
		sundryItmBaseTables.add(MST_ORDSND_GR_SCHD_IF_R.TABLE_NAME);
		sundryItmBaseTables.add(MST_ORDSND_STK_IF_R.TABLE_NAME);
		sundryItmBaseTables.add(MST_WK_ACT_RECV_IF_R.TABLE_NAME);
		sundryItmBaseTables.add(MST_INPT_ACT_RECV_IF_R.TABLE_NAME);
		sundryItmBaseTables.add(MST_YIELD_ACT_RECV_IF_R.TABLE_NAME);
		sundryItmBaseTables.add(MSVT_MES_IF_R.TABLE_NAME);
		return sundryItmBaseTables;
	}

	protected List<String> getMfgItmBaseTables() {
		List<String> itmBaseTables = new ArrayList<String>();
		itmBaseTables.add(MST_INPT_ACT_RECV_IF_R.TABLE_NAME);
		itmBaseTables.add(MST_OPER_ACT_RECV_IF_R.TABLE_NAME);
		itmBaseTables.add(MST_YIELD_ACT_RECV_IF_R.TABLE_NAME);
		itmBaseTables.add(MSVT_MES_IF_R.TABLE_NAME);
		return itmBaseTables;
	}

	protected List<String> getBdItmBaseTables() {
		List<String> itmBaseTables = new ArrayList<String>();
		itmBaseTables.add(MST_PO_RECV_IF_R.TABLE_NAME);
		itmBaseTables.add(MST_ACXFR_ACT_RECV_IF_R.TABLE_NAME);
		return itmBaseTables;
	}

	protected List<String> getParAndChdItmBaseTables() {
		List<String> itmBaseTables = new ArrayList<String>();
		itmBaseTables.add(MST_ORDSND_BOM_IF_R.TABLE_NAME);
		itmBaseTables.add(MST_ORDSND_DTL_BOM_IF_R.TABLE_NAME);
		return itmBaseTables;
	}

	protected List<String> getAltGrpBaseTables() {
		List<String> altGrpBaseTables = new ArrayList<String>();
		altGrpBaseTables.add(MST_ORDSND_BOM_IF_R.TABLE_NAME);
		altGrpBaseTables.add(MST_ORDSND_DTL_BOM_IF_R.TABLE_NAME);
		altGrpBaseTables.add(MST_ORDSND_GI_SCHD_IF_R.TABLE_NAME);
		return altGrpBaseTables;
	}

	protected List<String> getItmGrpBaseTables() {
		List<String> itmGrpTables = new ArrayList<String>();
		itmGrpTables.add(MST_ORDSND_ITM_IF_R.TABLE_NAME);
		return itmGrpTables;
	}

	protected List<String> getItmJnlBaseTables() {
		List<String> itmJnlTables = new ArrayList<String>();
		itmJnlTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		return itmJnlTables;
	}

	protected List<String> getParItmJnlBaseTables() {
		List<String> ParitmJnlTables = new ArrayList<String>();
		ParitmJnlTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		return ParitmJnlTables;
	}

	protected List<String> getStkGdBaseTables() {
		List<String> stkGdTables = new ArrayList<String>();
		stkGdTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		stkGdTables.add(MST_IO_SCHD_IF_R.TABLE_NAME);
		stkGdTables.add(MST_MLY_STK_IF_R.TABLE_NAME);
		stkGdTables.add(MST_NON_MOV_STK_IF_R.TABLE_NAME);
		stkGdTables.add(MST_XFR_ACT_RECV_IF_R.TABLE_NAME);
		stkGdTables.add(MST_ACXFR_ACT_RECV_IF_R.TABLE_NAME);
		stkGdTables.add(MST_ARR_ACT_RECV_IF_R.TABLE_NAME);
		stkGdTables.add(MST_SHIP_ACT_RECV_IF_R.TABLE_NAME);
		stkGdTables.add(MST_SLO_RECV_IF_R.TABLE_NAME);
		stkGdTables.add(MSVT_MES_IF_R.TABLE_NAME);
		stkGdTables.add(MST_INSP_ACT_IF_R.TABLE_NAME);
		stkGdTables.add(MST_ORDSND_GI_SCHD_IF_R.TABLE_NAME);
		stkGdTables.add(MST_ORDSND_STK_IF_R.TABLE_NAME);
		stkGdTables.add(MST_INPT_ACT_RECV_IF_R.TABLE_NAME);
		stkGdTables.add(MST_YIELD_ACT_RECV_IF_R.TABLE_NAME);
		return stkGdTables;
	}

	protected List<String> getSmplStkGdBaseTables() {
		List<String> smplStkGdTables = new ArrayList<String>();
		smplStkGdTables.add(MST_INSP_ACT_RECV_IF_R.TABLE_NAME);
		return smplStkGdTables;
	}

	protected List<String> getTtlStkGdBaseTables() {
		List<String> ttlStkGdTables = new ArrayList<String>();
		ttlStkGdTables.add(MST_INSP_ACT_RECV_IF_R.TABLE_NAME);
		return ttlStkGdTables;
	}

	protected List<String> getTrdBaseTables() {
		List<String> trdTables = new ArrayList<String>();
		trdTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		trdTables.add(MST_XFR_ACT_RECV_IF_R.TABLE_NAME);
		trdTables.add(MST_ACXFR_ACT_RECV_IF_R.TABLE_NAME);
		trdTables.add(MST_ARR_PR_IF_R.TABLE_NAME);
		trdTables.add(MST_SHIP_ACT_RECV_IF_R.TABLE_NAME);
		trdTables.add(MST_SHIP_PR_IF_R.TABLE_NAME);
		trdTables.add(MST_PO_RECV_IF_R.TABLE_NAME);
		trdTables.add(MST_BILL_RECV_IF_R.TABLE_NAME);
		return trdTables;
	}

	protected List<String> getBizRsnBaseTables() {
		List<String> bizRsnTables = new ArrayList<String>();
		bizRsnTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		bizRsnTables.add(MST_XFR_ACT_RECV_IF_R.TABLE_NAME);
		bizRsnTables.add(MST_ACXFR_ACT_RECV_IF_R.TABLE_NAME);
		bizRsnTables.add(MST_ARR_PR_IF_R.TABLE_NAME);
		bizRsnTables.add(MST_SHIP_ACT_RECV_IF_R.TABLE_NAME);
		bizRsnTables.add(MST_SHIP_PR_IF_R.TABLE_NAME);
		return bizRsnTables;
	}

	protected List<String> getDscntBizRsnBaseTables() {
		List<String> bizRsnTables = new ArrayList<String>();
		bizRsnTables.add(MST_ACCPT_RECV_IF_R.TABLE_NAME);
		bizRsnTables.add(MST_SLO_RECV_IF_R.TABLE_NAME);
		bizRsnTables.add(MST_PO_RECV_IF_R.TABLE_NAME);
		return bizRsnTables;
	}

	protected List<String> getAcRsnBaseTables() {
		List<String> acRsnTables = new ArrayList<String>();
		acRsnTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		return acRsnTables;
	}
	
	protected List<String> getDfctRsnBaseTables() {
		List<String> dfctRsnTables = new ArrayList<String>();
		dfctRsnTables.add(MST_INSP_ACT_IF_R.TABLE_NAME);
		return dfctRsnTables;
	}
	
	protected List<String> getNoteRsnBaseTables() {
		List<String> noteRsnTables = new ArrayList<String>();
		noteRsnTables.add(MST_RCV_RECV_IF_R.TABLE_NAME);
		return noteRsnTables;
	}

	protected List<String> getPurcRsnBaseTables() {
		List<String> purcTables = new ArrayList<String>();
		purcTables.add(MST_PO_RECV_IF_R.TABLE_NAME);
		return purcTables;
	}

	protected List<String> getLossRsnBaseTables() {
		List<String> lossRsnTables = new ArrayList<String>();
		lossRsnTables.add(MST_INPT_ACT_RECV_IF_R.TABLE_NAME);
		lossRsnTables.add(MSVT_MES_IF_R.TABLE_NAME);
		return lossRsnTables;
	}

	protected List<String> getOldLossRsnBaseTables() {
		List<String> oldLossRsnTables = new ArrayList<String>();
		oldLossRsnTables.add(MST_INPT_ACT_RECV_IF_R.TABLE_NAME);
		oldLossRsnTables.add(MSVT_MES_IF_R.TABLE_NAME);
		return oldLossRsnTables;
	}

	protected List<String> getInptRsnBaseTables() {
		List<String> inptRsnTables = new ArrayList<String>();
		inptRsnTables.add(MST_INPT_ACT_RECV_IF_R.TABLE_NAME);
		inptRsnTables.add(MSVT_MES_IF_R.TABLE_NAME);
		return inptRsnTables;
	}

	protected List<String> getAcxfrRsnBaseTables() {
		List<String> acxfrRsnTables = new ArrayList<String>();
		acxfrRsnTables.add(MST_INPT_ACT_RECV_IF_R.TABLE_NAME);
		acxfrRsnTables.add(MSVT_MES_IF_R.TABLE_NAME);
		return acxfrRsnTables;
	}

	protected List<String> getYieldRsnBaseTables() {
		List<String> yieldRsnTables = new ArrayList<String>();
		yieldRsnTables.add(MST_YIELD_ACT_RECV_IF_R.TABLE_NAME);
		yieldRsnTables.add(MSVT_MES_IF_R.TABLE_NAME);
		return yieldRsnTables;
	}

	protected List<String> getSmplDfctRsnBaseTables() {
		List<String> smplDfctRsnTables = new ArrayList<String>();
		smplDfctRsnTables.add(MST_INSP_ACT_RECV_IF_R.TABLE_NAME);
		return smplDfctRsnTables;
	}

	protected List<String> getTtlDfctRsnBaseTables() {
		List<String> ttlDfctRsnTables = new ArrayList<String>();
		ttlDfctRsnTables.add(MST_INSP_ACT_RECV_IF_R.TABLE_NAME);
		return ttlDfctRsnTables;
	}

	protected List<String> getAcItmGrpBaseTables() {
		List<String> acItmGrpTables = new ArrayList<String>();
		acItmGrpTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		return acItmGrpTables;
	}

	protected List<String> getParAcItmGrpBaseTables() {
		List<String> ParAcItmGrpTables = new ArrayList<String>();
		ParAcItmGrpTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		return ParAcItmGrpTables;
	}

	protected List<String> getWgBaseTables() {
		List<String> wgTables = new ArrayList<String>();
		wgTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		wgTables.add(MST_IO_SCHD_IF_R.TABLE_NAME);
		wgTables.add(MST_ESHIP_ACT_SEND_IF_R.TABLE_NAME);
		wgTables.add(MST_SLO_PRMS_SEND_IF_R.TABLE_NAME);
		wgTables.add(MST_PO_SEND_IF_R.TABLE_NAME);
		wgTables.add(MST_ACCPT_SEND_IF_R.TABLE_NAME);
		wgTables.add(MST_ITM_ORDER_IF_R.TABLE_NAME);
		wgTables.add(MST_ORDSND_ACT_QTY_IF_R.TABLE_NAME);
		wgTables.add(MST_ORDSND_CAL_EXT_IF_R.TABLE_NAME);
		wgTables.add(MST_ORDSND_CAL_IF_R.TABLE_NAME);
		wgTables.add(MST_ORDSND_DLYDMND_IF_R.TABLE_NAME);
		wgTables.add(MST_ORDSND_DTL_BOM_IF_R.TABLE_NAME);
		wgTables.add(MST_ORDSND_GI_SCHD_IF_R.TABLE_NAME);
		wgTables.add(MST_ORDSND_GR_SCHD_IF_R.TABLE_NAME);
		wgTables.add(MST_ORDSND_ITMOPER_IF_R.TABLE_NAME);
		wgTables.add(MST_ORDSND_ITM_DTL_IF_R.TABLE_NAME);
		wgTables.add(MST_ORDSND_ITM_IF_R.TABLE_NAME);
		wgTables.add(MST_ORDSND_LOC_IF_R.TABLE_NAME);
		wgTables.add(MST_ORDSND_OPE_ACT_IF_R.TABLE_NAME);
		wgTables.add(MST_ORDSND_ORD_LNK_IF_R.TABLE_NAME);
		wgTables.add(MST_ORDSND_STK_IF_R.TABLE_NAME);
		wgTables.add(MST_ORDSND_BOM_IF_R.TABLE_NAME);
		return wgTables;
	}

	protected List<String> getGiWgBaseTables() {
		List<String> giWgTables = new ArrayList<String>();
		giWgTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		return giWgTables;
	}

	protected List<String> getGrWgBaseTables() {
		List<String> grWgTables = new ArrayList<String>();
		grWgTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		return grWgTables;
	}

	protected List<String> getRqstWgBaseTables() {
		List<String> rqstWgTables = new ArrayList<String>();
		rqstWgTables.add(MST_ARR_PR_IF_R.TABLE_NAME);
		rqstWgTables.add(MST_ITM_ORDER_IF_R.TABLE_NAME);
		return rqstWgTables;
	}

	protected List<String> getActUsrBaseTables() {
		List<String> actUsrTables = new ArrayList<String>();
		actUsrTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		actUsrTables.add(MST_XFR_ACT_RECV_IF_R.TABLE_NAME);
		actUsrTables.add(MST_ACXFR_ACT_RECV_IF_R.TABLE_NAME);
		actUsrTables.add(MSVT_MES_IF_R.TABLE_NAME);
		actUsrTables.add(MST_INSP_ACT_IF_R.TABLE_NAME);
		actUsrTables.add(MST_INSP_ACT_RECV_IF_R.TABLE_NAME);
		return actUsrTables;
	}

	protected List<String> getSlsUsrBaseTables() {
		List<String> slsUsrTables = new ArrayList<String>();
		slsUsrTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		slsUsrTables.add(MST_SLO_RECV_IF_R.TABLE_NAME);
		return slsUsrTables;
	}

	protected List<String> getMfgUsrBaseTables() {
		List<String> mfgUsrTables = new ArrayList<String>();
		mfgUsrTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		return mfgUsrTables;
	}

	protected List<String> getPurcUsrBaseTables() {
		List<String> purcUsrTables = new ArrayList<String>();
		purcUsrTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		purcUsrTables.add(MST_PO_RECV_IF_R.TABLE_NAME);
		return purcUsrTables;
	}

	protected List<String> getArrUsrBaseTables() {
		List<String> arrUsrTables = new ArrayList<String>();
		arrUsrTables.add(MST_ARR_ACT_RECV_IF_R.TABLE_NAME);
		return arrUsrTables;
	}

	protected List<String> getRqstUsrBaseTables() {
		List<String> rqstUsrTables = new ArrayList<String>();
		rqstUsrTables.add(MST_ARR_PR_IF_R.TABLE_NAME);
		rqstUsrTables.add(MST_SHIP_ACT_RECV_IF_R.TABLE_NAME);
		rqstUsrTables.add(MST_SHIP_PR_IF_R.TABLE_NAME);
		return rqstUsrTables;
	}

	protected List<String> getShipUsrBaseTables() {
		List<String> shipUsrTables = new ArrayList<String>();
		shipUsrTables.add(MST_SHIP_ACT_RECV_IF_R.TABLE_NAME);
		return shipUsrTables;
	}

	protected List<String> getRcvUsrBaseTables() {
		List<String> rcvUsrTables = new ArrayList<String>();
		rcvUsrTables.add(MST_RCV_RECV_IF_R.TABLE_NAME);
		return rcvUsrTables;
	}

	protected List<String> getWkUsrBaseTables() {
		List<String> wkUsrTables = new ArrayList<String>();
		wkUsrTables.add(MST_WK_ACT_RECV_IF_R.TABLE_NAME);
		return wkUsrTables;
	}

	protected List<String> getMfgActUsrBaseTables() {
		List<String> mfgActUsrTables = new ArrayList<String>();
		mfgActUsrTables.add(MST_YIELD_ACT_RECV_IF_R.TABLE_NAME);
		return mfgActUsrTables;
	}

	protected List<String> getJudgUsrBaseTables() {
		List<String> judgUsrTables = new ArrayList<String>();
		judgUsrTables.add(MST_INSP_ACT_RECV_IF_R.TABLE_NAME);
		return judgUsrTables;
	}

	protected List<String> getLocBaseTables() {
		List<String> locTables = new ArrayList<String>();
		locTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		locTables.add(MST_IO_SCHD_IF_R.TABLE_NAME);
		locTables.add(MST_MLY_STK_IF_R.TABLE_NAME);
		locTables.add(MST_NON_MOV_STK_IF_R.TABLE_NAME);
		locTables.add(MST_ACXFR_ACT_RECV_IF_R.TABLE_NAME);
		locTables.add(MST_SHIP_PR_IF_R.TABLE_NAME);
		locTables.add(MST_INSP_ACT_IF_R.TABLE_NAME);
		locTables.add(MST_ORDER_RECV_IF_R.TABLE_NAME);
		locTables.add(MST_ORDSND_BOM_IF_R.TABLE_NAME);
		locTables.add(MST_ORDSND_GI_SCHD_IF_R.TABLE_NAME);
		locTables.add(MST_ORDSND_GR_SCHD_IF_R.TABLE_NAME);
		locTables.add(MST_ORDSND_ITMOPER_IF_R.TABLE_NAME);
		locTables.add(MST_ORDSND_STK_IF_R.TABLE_NAME);
		locTables.add(MST_WK_ACT_RECV_IF_R.TABLE_NAME);
		return locTables;
	}

	protected List<String> getGiLocBaseTables() {
		List<String> giLocTables = new ArrayList<String>();
		giLocTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		giLocTables.add(MST_IO_SCHD_IF_R.TABLE_NAME);
		giLocTables.add(MST_XFR_ACT_RECV_IF_R.TABLE_NAME);
		giLocTables.add(MSVT_MES_IF_R.TABLE_NAME);
		return giLocTables;
	}

	protected List<String> getGrLocBaseTables() {
		List<String> grLocTables = new ArrayList<String>();
		grLocTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		grLocTables.add(MST_IO_SCHD_IF_R.TABLE_NAME);
		grLocTables.add(MST_XFR_ACT_RECV_IF_R.TABLE_NAME);
		grLocTables.add(MSVT_MES_IF_R.TABLE_NAME);
		return grLocTables;
	}

	protected List<String> getBdLocBaseTables() {
		List<String> bdLocTables = new ArrayList<String>();
		bdLocTables.add(MST_ACXFR_ACT_RECV_IF_R.TABLE_NAME);
		bdLocTables.add(MST_PO_RECV_IF_R.TABLE_NAME);
		return bdLocTables;
	}

	protected List<String> getArrLocBaseTables() {
		List<String> arrLocTables = new ArrayList<String>();
		arrLocTables.add(MST_ARR_ACT_RECV_IF_R.TABLE_NAME);
		return arrLocTables;
	}

	protected List<String> getInToIdBaseTables() {
		List<String> inToIdTables = new ArrayList<String>();
		inToIdTables.add(MST_ESHIP_ACT_RECV_IF_R.TABLE_NAME);
		return inToIdTables;
	}

	protected List<String> getShipLocBaseTables() {
		List<String> shipLocTables = new ArrayList<String>();
		shipLocTables.add(MST_SHIP_ACT_RECV_IF_R.TABLE_NAME);
		return shipLocTables;
	}

	protected List<String> getInToLocBaseTables() {
		List<String> inToLocTables = new ArrayList<String>();
		inToLocTables.add(MST_PO_RECV_IF_R.TABLE_NAME);
		return inToLocTables;
	}

	protected List<String> getMfgLocBaseTables() {
		List<String> mfgLocTables = new ArrayList<String>();
		mfgLocTables.add(MST_PO_RECV_IF_R.TABLE_NAME);
		mfgLocTables.add(MSVT_MES_IF_R.TABLE_NAME);
		mfgLocTables.add(MST_INSP_ACT_IF_R.TABLE_NAME);
		mfgLocTables.add(MST_ITM_ORDER_IF_R.TABLE_NAME);
		mfgLocTables.add(MST_OPER_ACT_RECV_IF_R.TABLE_NAME);
		mfgLocTables.add(MST_ORDER_RECV_IF_R.TABLE_NAME);
		mfgLocTables.add(MST_ORDSND_BOM_IF_R.TABLE_NAME);
		mfgLocTables.add(MST_ORDSND_DTL_BOM_IF_R.TABLE_NAME);
		mfgLocTables.add(MST_ORDSND_ITM_DTL_IF_R.TABLE_NAME);
		mfgLocTables.add(MST_INPT_ACT_RECV_IF_R.TABLE_NAME);
		mfgLocTables.add(MST_YIELD_ACT_RECV_IF_R.TABLE_NAME);
		return mfgLocTables;
	}

	protected List<String> getStrgLocBaseTables() {
		List<String> strgLocTables = new ArrayList<String>();
		strgLocTables.add(MSVT_MES_IF_R.TABLE_NAME);
		strgLocTables.add(MST_ITM_ORDER_IF_R.TABLE_NAME);
		strgLocTables.add(MST_ORDER_RECV_IF_R.TABLE_NAME);
		strgLocTables.add(MST_ORDSND_BOM_IF_R.TABLE_NAME);
		strgLocTables.add(MST_YIELD_ACT_RECV_IF_R.TABLE_NAME);
		return strgLocTables;
	}

	protected List<String> getInptLocBaseTables() {
		List<String> inptLocTables = new ArrayList<String>();
		inptLocTables.add(MSVT_MES_IF_R.TABLE_NAME);
		inptLocTables.add(MST_INPT_ACT_RECV_IF_R.TABLE_NAME);
		return inptLocTables;
	}

	protected List<String> getAcxfrLocBaseTables() {
		List<String> acxfrLocTables = new ArrayList<String>();
		acxfrLocTables.add(MSVT_MES_IF_R.TABLE_NAME);
		return acxfrLocTables;
	}

	protected List<String> getMstMfgLocBaseTables() {
		List<String> mstMfgLocTables = new ArrayList<String>();
		mstMfgLocTables.add(MST_ITM_ORDER_IF_R.TABLE_NAME);
		return mstMfgLocTables;
	}

	protected List<String> getRqstLocBaseTables() {
		List<String> rqstLocTables = new ArrayList<String>();
		rqstLocTables.add(MST_ITM_ORDER_IF_R.TABLE_NAME);
		return rqstLocTables;
	}

	protected List<String> getDmndLocBaseTables() {
		List<String> dmndLocTables = new ArrayList<String>();
		dmndLocTables.add(MST_ORDSND_DLYDMND_IF_R.TABLE_NAME);
		return dmndLocTables;
	}

	protected List<String> getOperLocBaseTables() {
		List<String> operLocTables = new ArrayList<String>();
		operLocTables.add(MST_ORDSND_ITMOPER_IF_R.TABLE_NAME);
		return operLocTables;
	}

	protected List<String> getStkLocBaseTables() {
		List<String> stkLocTables = new ArrayList<String>();
		stkLocTables.add(MST_INSP_ACT_RECV_IF_R.TABLE_NAME);
		return stkLocTables;
	}

	protected List<String> getTrnsptBaseTables() {
		List<String> trnsptTables = new ArrayList<String>();
		trnsptTables.add(MST_SLO_RECV_IF_R.TABLE_NAME);
		return trnsptTables;
	}

	protected List<String> getLoadPortBaseTables() {
		List<String> loadPortTables = new ArrayList<String>();
		loadPortTables.add(MST_SLO_RECV_IF_R.TABLE_NAME);
		return loadPortTables;
	}

	protected List<String> getDschrgPortBaseTables() {
		List<String> dschrgPortTables = new ArrayList<String>();
		dschrgPortTables.add(MST_SLO_RECV_IF_R.TABLE_NAME);
		return dschrgPortTables;
	}

	protected List<String> getViaPortBaseTables() {
		List<String> viaPortTables = new ArrayList<String>();
		viaPortTables.add(MST_SLO_RECV_IF_R.TABLE_NAME);
		return viaPortTables;
	}

	protected List<String> getTterm1BaseTables() {
		List<String> tterm1Tables = new ArrayList<String>();
		tterm1Tables.add(MST_SLO_RECV_IF_R.TABLE_NAME);
		tterm1Tables.add(MST_PO_RECV_IF_R.TABLE_NAME);
		return tterm1Tables;
	}

	protected List<String> getTterm2BaseTables() {
		List<String> tterm2Tables = new ArrayList<String>();
		tterm2Tables.add(MST_SLO_RECV_IF_R.TABLE_NAME);
		tterm2Tables.add(MST_PO_RECV_IF_R.TABLE_NAME);
		return tterm2Tables;
	}

	protected List<String> getTterm3BaseTables() {
		List<String> tterm3Tables = new ArrayList<String>();
		tterm3Tables.add(MST_SLO_RECV_IF_R.TABLE_NAME);
		tterm3Tables.add(MST_PO_RECV_IF_R.TABLE_NAME);
		return tterm3Tables;
	}

	protected List<String> getPoPrintBaseTables() {
		List<String> poPrinTables = new ArrayList<String>();
		poPrinTables.add(MST_PO_RECV_IF_R.TABLE_NAME);
		return poPrinTables;
	}

	protected List<String> getBankBaseTables() {
		List<String> bankTables = new ArrayList<String>();
		bankTables.add(MST_RCV_RECV_IF_R.TABLE_NAME);
		return bankTables;
	}
	
	protected List<String> getBankAcBaseTables() {
		List<String> bankAcTables = new ArrayList<String>();
		bankAcTables.add(MST_RCV_RECV_IF_R.TABLE_NAME);
		bankAcTables.add(MST_BILL_SEND_IF_R.TABLE_NAME);
		bankAcTables.add(MST_BILL_RECV_IF_R.TABLE_NAME);
		return bankAcTables;
	}
	
	protected List<String> getBankBranchBaseTables() {
		List<String> bankBranchTables = new ArrayList<String>();
		bankBranchTables.add(MST_RCV_RECV_IF_R.TABLE_NAME);
		return bankBranchTables;
	}

	protected List<String> getStrLnBaseTables() {
		List<String> strLnTables = new ArrayList<String>();
		strLnTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		strLnTables.add(MST_IO_SCHD_IF_R.TABLE_NAME);
		strLnTables.add(MST_MLY_STK_IF_R.TABLE_NAME);
		strLnTables.add(MST_NON_MOV_STK_IF_R.TABLE_NAME);
		strLnTables.add(MST_ACXFR_ACT_RECV_IF_R.TABLE_NAME);
		strLnTables.add(MST_INSP_ACT_IF_R.TABLE_NAME);
		strLnTables.add(MST_WK_ACT_RECV_IF_R.TABLE_NAME);
		return strLnTables;
	}

	protected List<String> getGiStrLnBaseTables() {
		List<String> giStrLnTables = new ArrayList<String>();
		giStrLnTables.add(MST_XFR_ACT_RECV_IF_R.TABLE_NAME);
		giStrLnTables.add(MSVT_MES_IF_R.TABLE_NAME);
		return giStrLnTables;
	}

	protected List<String> getGrStrLnBaseTables() {
		List<String> grStrLnTables = new ArrayList<String>();
		grStrLnTables.add(MST_XFR_ACT_RECV_IF_R.TABLE_NAME);
		grStrLnTables.add(MSVT_MES_IF_R.TABLE_NAME);
		return grStrLnTables;
	}

	protected List<String> getArrStrLnBaseTables() {
		List<String> arrStrLnTables = new ArrayList<String>();
		arrStrLnTables.add(MST_ARR_ACT_RECV_IF_R.TABLE_NAME);
		return arrStrLnTables;
	}

	protected List<String> getDlvStrLnBaseTables() {
		List<String> dlvStrLnTables = new ArrayList<String>();
		dlvStrLnTables.add(MST_SHIP_ACT_RECV_IF_R.TABLE_NAME);
		return dlvStrLnTables;
	}

	protected List<String> getShipStrLnBaseTables() {
		List<String> shipStrLnTables = new ArrayList<String>();
		shipStrLnTables.add(MST_SHIP_ACT_RECV_IF_R.TABLE_NAME);
		return shipStrLnTables;
	}
	
	protected List<String> getInToStrLnBaseTables() {
		List<String> shipInToStrLnTables = new ArrayList<String>();
		shipInToStrLnTables.add(MST_PO_RECV_IF_R.TABLE_NAME);
		return shipInToStrLnTables;
	}

	protected List<String> getInptStrLnBaseTables() {
		List<String> inptStrLnTables = new ArrayList<String>();
		inptStrLnTables.add(MST_INPT_ACT_RECV_IF_R.TABLE_NAME);
		inptStrLnTables.add(MSVT_MES_IF_R.TABLE_NAME);
		return inptStrLnTables;
	}

	protected List<String> getMfgStrLnBaseTables() {
		List<String> mfgStrLnTables = new ArrayList<String>();
		mfgStrLnTables.add(MST_YIELD_ACT_RECV_IF_R.TABLE_NAME);
		return mfgStrLnTables;
	}

	protected List<String> getStrgStrLnBaseTables() {
		List<String> strgStrLnTables = new ArrayList<String>();
		strgStrLnTables.add(MST_YIELD_ACT_RECV_IF_R.TABLE_NAME);
		strgStrLnTables.add(MSVT_MES_IF_R.TABLE_NAME);
		return strgStrLnTables;
	}

	protected List<String> getAcxfrStrLnBaseTables() {
		List<String> strgStrLnTables = new ArrayList<String>();
		strgStrLnTables.add(MSVT_MES_IF_R.TABLE_NAME);
		return strgStrLnTables;
	}

	protected List<String> getStkStrLnBaseTables() {
		List<String> stkStrLnTables = new ArrayList<String>();
		stkStrLnTables.add(MST_INSP_ACT_RECV_IF_R.TABLE_NAME);
		return stkStrLnTables;
	}

	protected List<String> getStkArrvBpBaseTables() {
		List<String> stkArrvBpTables = new ArrayList<String>();
		stkArrvBpTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		stkArrvBpTables.add(MST_IO_SCHD_IF_R.TABLE_NAME);
		stkArrvBpTables.add(MST_MLY_STK_IF_R.TABLE_NAME);
		stkArrvBpTables.add(MST_NON_MOV_STK_IF_R.TABLE_NAME);
		stkArrvBpTables.add(MST_ACXFR_ACT_RECV_IF_R.TABLE_NAME);
		stkArrvBpTables.add(MST_SHIP_ACT_RECV_IF_R.TABLE_NAME);
		stkArrvBpTables.add(MSVT_MES_IF_R.TABLE_NAME);
		stkArrvBpTables.add(MST_INSP_ACT_IF_R.TABLE_NAME);
		stkArrvBpTables.add(MST_INPT_ACT_RECV_IF_R.TABLE_NAME);
		return stkArrvBpTables;
	}

	protected List<String> getStkBpBaseTables() {
		List<String> stkBpTables = new ArrayList<String>();
		stkBpTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		stkBpTables.add(MST_IO_SCHD_IF_R.TABLE_NAME);
		stkBpTables.add(MST_MLY_STK_IF_R.TABLE_NAME);
		stkBpTables.add(MST_NON_MOV_STK_IF_R.TABLE_NAME);
		stkBpTables.add(MST_XFR_ACT_RECV_IF_R.TABLE_NAME);
		stkBpTables.add(MST_ACXFR_ACT_RECV_IF_R.TABLE_NAME);
		stkBpTables.add(MST_SHIP_ACT_RECV_IF_R.TABLE_NAME);
		stkBpTables.add(MSVT_MES_IF_R.TABLE_NAME);
		stkBpTables.add(MST_INSP_ACT_IF_R.TABLE_NAME);
		stkBpTables.add(MST_INPT_ACT_RECV_IF_R.TABLE_NAME);
		return stkBpTables;
	}

	protected List<String> getDlvBaseTables() {
		List<String> dlvTables = new ArrayList<String>();
		dlvTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		dlvTables.add(MST_SHIP_PR_IF_R.TABLE_NAME);
		return dlvTables;
	}

	protected List<String> getTdlvBaseTables() {
		List<String> tdlvTables = new ArrayList<String>();
		tdlvTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		tdlvTables.add(MST_SHIP_PR_IF_R.TABLE_NAME);
		return tdlvTables;
	}

	protected List<String> getCstBaseTables() {
		List<String> cstTables = new ArrayList<String>();
		cstTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		cstTables.add(MST_ARR_PR_IF_R.TABLE_NAME);
		cstTables.add(MST_SHIP_ACT_RECV_IF_R.TABLE_NAME);
		cstTables.add(MST_SHIP_PR_IF_R.TABLE_NAME);
		cstTables.add(MST_DLV_INST_RECV_IF_R.TABLE_NAME);
		cstTables.add(MST_ACCPT_RECV_IF_R.TABLE_NAME);
		cstTables.add(MST_SLO_RECV_IF_R.TABLE_NAME);
		return cstTables;
	}

	protected List<String> getAcstBaseTables() {
		List<String> acstTables = new ArrayList<String>();
		acstTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		return acstTables;
	}

	protected List<String> getBcstBaseTables() {
		List<String> bcstTables = new ArrayList<String>();
		bcstTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		bcstTables.add(MST_RCV_RECV_IF_R.TABLE_NAME);
		return bcstTables;
	}

	protected List<String> getRcstBaseTables() {
		List<String> rcstTables = new ArrayList<String>();
		rcstTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		rcstTables.add(MST_RCV_RECV_IF_R.TABLE_NAME);
		return rcstTables;
	}

	protected List<String> getDest1BaseTables() {
		List<String> dest1Tables = new ArrayList<String>();
		dest1Tables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		dest1Tables.add(MST_SLO_RECV_IF_R.TABLE_NAME);
		return dest1Tables;
	}

	protected List<String> getDest2BaseTables() {
		List<String> dest2Tables = new ArrayList<String>();
		dest2Tables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		dest2Tables.add(MST_SLO_RECV_IF_R.TABLE_NAME);
		return dest2Tables;
	}

	protected List<String> getDest3BaseTables() {
		List<String> dest3Tables = new ArrayList<String>();
		dest3Tables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		dest3Tables.add(MST_SLO_RECV_IF_R.TABLE_NAME);
		return dest3Tables;
	}

	protected List<String> getSpplBaseTables() {
		List<String> spplTables = new ArrayList<String>();
		spplTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		spplTables.add(MST_IO_SCHD_IF_R.TABLE_NAME);
		spplTables.add(MST_ESHIP_ACT_RECV_IF_R.TABLE_NAME);
		spplTables.add(MST_ARR_PR_IF_R.TABLE_NAME);
		spplTables.add(MST_PRMS_RECV_IF_R.TABLE_NAME);
		spplTables.add(MST_PO_RECV_IF_R.TABLE_NAME);
		spplTables.add(MST_INSP_ACT_IF_R.TABLE_NAME);
		spplTables.add(MST_ITM_ORDER_IF_R.TABLE_NAME);
		return spplTables;
	}

	protected List<String> getAspplBaseTables() {
		List<String> aspplTables = new ArrayList<String>();
		aspplTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		return aspplTables;
	}

	protected List<String> getBspplBaseTables() {
		List<String> bspplTables = new ArrayList<String>();
		bspplTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		return bspplTables;
	}

	protected List<String> getPspplBaseTables() {
		List<String> pspplTables = new ArrayList<String>();
		pspplTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		return pspplTables;
	}

	protected List<String> getCredBaseTables() {
		List<String> credTables = new ArrayList<String>();
		credTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		return credTables;
	}

	protected List<String> getDbBpBaseTables() {
		List<String> dbBpTables = new ArrayList<String>();
		dbBpTables.add(MST_ACXFR_ACT_RECV_IF_R.TABLE_NAME);
		return dbBpTables;
	}

	protected List<String> getSretFrBaseTables() {
		List<String> sretFrTables = new ArrayList<String>();
		sretFrTables.add(MST_ARR_PR_IF_R.TABLE_NAME);
		return sretFrTables;
	}

	protected List<String> getRetStkArrvBpBaseTables() {
		List<String> retStkArrvBpTables = new ArrayList<String>();
		retStkArrvBpTables.add(MST_ARR_PR_IF_R.TABLE_NAME);
		retStkArrvBpTables.add(MSVT_MES_IF_R.TABLE_NAME);
		return retStkArrvBpTables;
	}

	protected List<String> getMakerBaseTables() {
		List<String> makerTables = new ArrayList<String>();
		makerTables.add(MST_SLO_RECV_IF_R.TABLE_NAME);
		makerTables.add(MST_PO_RECV_IF_R.TABLE_NAME);
		makerTables.add(MST_INSP_ACT_IF_R.TABLE_NAME);
		makerTables.add(MST_ITM_ORDER_IF_R.TABLE_NAME);
		return makerTables;
	}

	protected List<String> getBillSrcBaseTables() {
		List<String> billSrcTables = new ArrayList<String>();
		billSrcTables.add(MST_BILL_RECV_IF_R.TABLE_NAME);
		return billSrcTables;
	}

	protected List<String> getBdBpBaseTables() {
		List<String> billSrcTables = new ArrayList<String>();
		billSrcTables.add(MST_ACXFR_ACT_RECV_IF_R.TABLE_NAME);
		return billSrcTables;
	}

	protected List<String> getBaseUnitBaseTables() {
		List<String> baseUnitTables = new ArrayList<String>();
		baseUnitTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		baseUnitTables.add(MST_IO_SCHD_IF_R.TABLE_NAME);
		baseUnitTables.add(MST_NON_MOV_STK_IF_R.TABLE_NAME);
		baseUnitTables.add(MST_ARR_PR_IF_R.TABLE_NAME);
		baseUnitTables.add(MST_SHIP_PR_IF_R.TABLE_NAME);
		baseUnitTables.add(MST_INSP_ACT_IF_R.TABLE_NAME);
		baseUnitTables.add(MST_INSP_ACT_RECV_IF_R.TABLE_NAME);
		return baseUnitTables;
	}

	protected List<String> getTrdUnitBaseTables() {
		List<String> trdUnitTables = new ArrayList<String>();
		trdUnitTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		trdUnitTables.add(MST_XFR_ACT_RECV_IF_R.TABLE_NAME);
		trdUnitTables.add(MST_ACXFR_ACT_RECV_IF_R.TABLE_NAME);
		trdUnitTables.add(MST_ARR_ACT_RECV_IF_R.TABLE_NAME);
		trdUnitTables.add(MST_ESHIP_ACT_RECV_IF_R.TABLE_NAME);
		trdUnitTables.add(MST_ARR_PR_IF_R.TABLE_NAME);
		trdUnitTables.add(MST_SHIP_PR_IF_R.TABLE_NAME);
		trdUnitTables.add(MST_DLV_INST_RECV_IF_R.TABLE_NAME);
		trdUnitTables.add(MST_ACCPT_RECV_IF_R.TABLE_NAME);
		trdUnitTables.add(MST_SLO_RECV_IF_R.TABLE_NAME);
		trdUnitTables.add(MST_PRMS_RECV_IF_R.TABLE_NAME);
		trdUnitTables.add(MSVT_MES_IF_R.TABLE_NAME);
		trdUnitTables.add(MST_PO_RECV_IF_R.TABLE_NAME);
		trdUnitTables.add(MST_BILL_RECV_IF_R.TABLE_NAME);
		trdUnitTables.add(MST_YIELD_ACT_RECV_IF_R.TABLE_NAME);
		return trdUnitTables;
	}

	protected List<String> getPackUnitBaseTables() {
		List<String> packUnitTables = new ArrayList<String>();
		packUnitTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		packUnitTables.add(MST_IO_SCHD_IF_R.TABLE_NAME);
		packUnitTables.add(MST_MLY_STK_IF_R.TABLE_NAME);
		packUnitTables.add(MST_NON_MOV_STK_IF_R.TABLE_NAME);
		packUnitTables.add(MST_ARR_PR_IF_R.TABLE_NAME);
		packUnitTables.add(MST_INSP_ACT_IF_R.TABLE_NAME);
		packUnitTables.add(MST_INSP_ACT_RECV_IF_R.TABLE_NAME);
		return packUnitTables;
	}

	protected List<String> getEntUnitBaseTables() {
		List<String> entUnitTables = new ArrayList<String>();
		entUnitTables.add(MST_SHIP_ACT_RECV_IF_R.TABLE_NAME);
		entUnitTables.add(MSVT_MES_IF_R.TABLE_NAME);
		return entUnitTables;
	}

	protected List<String> getUnitTables() {
		List<String> unitTables = new ArrayList<String>();
		unitTables.add(MST_ORDSND_ITM_IF_R.TABLE_NAME);
		return unitTables;
	}

	protected List<String> getSmplPackXfrPackUnitTables() {
		List<String> smplPackXfrPackUnitTables = new ArrayList<String>();
		smplPackXfrPackUnitTables.add(MST_INSP_ACT_RECV_IF_R.TABLE_NAME);
		return smplPackXfrPackUnitTables;
	}

	protected List<String> getTtlPackXfrPackUnitTables() {
		List<String> ttlPackXfrPackUnitTables = new ArrayList<String>();
		ttlPackXfrPackUnitTables.add(MST_INSP_ACT_RECV_IF_R.TABLE_NAME);
		return ttlPackXfrPackUnitTables;
	}

	protected List<String> getBaseCurBaseTables() {
		List<String> baseCurTables = new ArrayList<String>();
		baseCurTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		baseCurTables.add(MST_NON_MOV_STK_IF_R.TABLE_NAME);
		return baseCurTables;
	}

	protected List<String> getTrdCurBaseTables() {
		List<String> trdCurTables = new ArrayList<String>();
		trdCurTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		trdCurTables.add(MST_ESHIP_ACT_RECV_IF_R.TABLE_NAME);
		trdCurTables.add(MST_ARR_PR_IF_R.TABLE_NAME);
		trdCurTables.add(MST_ESHIP_ACT_SEND_IF_R.TABLE_NAME);
		trdCurTables.add(MST_SHIP_PR_IF_R.TABLE_NAME);
		trdCurTables.add(MST_ACCPT_RECV_IF_R.TABLE_NAME);
		trdCurTables.add(MST_SLO_RECV_IF_R.TABLE_NAME);
		trdCurTables.add(MST_PO_SEND_IF_R.TABLE_NAME);
		trdCurTables.add(MST_ACCPT_SEND_IF_R.TABLE_NAME);
		trdCurTables.add(MST_PO_RECV_IF_R.TABLE_NAME);
		trdCurTables.add(MST_RCV_RECV_IF_R.TABLE_NAME);
		trdCurTables.add(MST_BILL_SEND_IF_R.TABLE_NAME);
		trdCurTables.add(MST_BILL_RECV_IF_R.TABLE_NAME);
		return trdCurTables;
	}

	protected List<String> getPtaxCurBaseTables() {
		List<String> ptaxCurTables = new ArrayList<String>();
		ptaxCurTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		return ptaxCurTables;
	}

	protected List<String> getTaxBaseTables() {
		List<String> taxTables = new ArrayList<String>();
		taxTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		taxTables.add(MST_PO_RECV_IF_R.TABLE_NAME);
		taxTables.add(MST_BILL_RECV_IF_R.TABLE_NAME);
		return taxTables;
	}

	protected List<String> getXrateBaseTables() {
		List<String> xrateTables = new ArrayList<String>();
		xrateTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		return xrateTables;
	}

	protected List<String> getPtaxXrateBaseTables() {
		List<String> ptaxXrateTables = new ArrayList<String>();
		ptaxXrateTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		return ptaxXrateTables;
	}

	protected List<String> getSttlBaseTables() {
		List<String> sttlTables = new ArrayList<String>();
		sttlTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		return sttlTables;
	}

	protected List<String> getRcvMtdBaseTables() {
		List<String> rcvMtdTables = new ArrayList<String>();
		rcvMtdTables.add(MST_RCV_RECV_IF_R.TABLE_NAME);
		return rcvMtdTables;
	}

	protected List<String> getPayMtd1BaseTables() {
		List<String> payMtd1Tables = new ArrayList<String>();
		payMtd1Tables.add(MST_BILL_RECV_IF_R.TABLE_NAME);
		return payMtd1Tables;
	}
	
	protected List<String> getPayMtd2BaseTables() {
		List<String> payMtd2Tables = new ArrayList<String>();
		payMtd2Tables.add(MST_BILL_RECV_IF_R.TABLE_NAME);
		return payMtd2Tables;
	}
	
	protected List<String> getPayMtd3BaseTables() {
		List<String> payMtd3Tables = new ArrayList<String>();
		payMtd3Tables.add(MST_BILL_RECV_IF_R.TABLE_NAME);
		return payMtd3Tables;
	}
	
	protected List<String> getPayMtd4BaseTables() {
		List<String> payMtd4Tables = new ArrayList<String>();
		payMtd4Tables.add(MST_BILL_RECV_IF_R.TABLE_NAME);
		return payMtd4Tables;
	}
	
	protected List<String> getPayMtd5BaseTables() {
		List<String> payMtd5Tables = new ArrayList<String>();
		payMtd5Tables.add(MST_BILL_RECV_IF_R.TABLE_NAME);
		return payMtd5Tables;
	}
	
	protected List<String> getPayMtd6BaseTables() {
		List<String> payMtd6Tables = new ArrayList<String>();
		payMtd6Tables.add(MST_BILL_RECV_IF_R.TABLE_NAME);
		return payMtd6Tables;
	}
	
	protected List<String> getPayMtd7BaseTables() {
		List<String> payMtd7Tables = new ArrayList<String>();
		payMtd7Tables.add(MST_BILL_RECV_IF_R.TABLE_NAME);
		return payMtd7Tables;
	}
	
	protected List<String> getPayMtd8BaseTables() {
		List<String> payMtd8Tables = new ArrayList<String>();
		payMtd8Tables.add(MST_BILL_RECV_IF_R.TABLE_NAME);
		return payMtd8Tables;
	}
	
	protected List<String> getPayMtd9BaseTables() {
		List<String> payMtd9Tables = new ArrayList<String>();
		payMtd9Tables.add(MST_BILL_RECV_IF_R.TABLE_NAME);
		return payMtd9Tables;
	}

	protected List<String> getPayMtd10BaseTables() {
		List<String> payMtd10Tables = new ArrayList<String>();
		payMtd10Tables.add(MST_BILL_RECV_IF_R.TABLE_NAME);
		return payMtd10Tables;
	}

	protected List<String> getAreaBaseTables() {
		List<String> areaTables = new ArrayList<String>();
		areaTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		return areaTables;
	}

	protected List<String> getCntryBaseTables() {
		List<String> cntryTables = new ArrayList<String>();
		cntryTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		cntryTables.add(MST_ESHIP_ACT_SEND_IF_R.TABLE_NAME);
		cntryTables.add(MST_SLO_PRMS_SEND_IF_R.TABLE_NAME);
		cntryTables.add(MST_PO_SEND_IF_R.TABLE_NAME);
		cntryTables.add(MST_ACCPT_SEND_IF_R.TABLE_NAME);
		cntryTables.add(MST_DLV_INST_SEND_IF_R.TABLE_NAME);
		cntryTables.add(MST_BILL_SEND_IF_R.TABLE_NAME);
		return cntryTables;
	}

	protected List<String> getCstCntryBaseTables() {
		List<String> cstCntryTables = new ArrayList<String>();
		cstCntryTables.add(MST_ESHIP_ACT_SEND_IF_R.TABLE_NAME);
		cstCntryTables.add(MST_SLO_PRMS_SEND_IF_R.TABLE_NAME);
		return cstCntryTables;
	}

	protected List<String> getDlvCntryBaseTables() {
		List<String> dlvCntryTables = new ArrayList<String>();
		dlvCntryTables.add(MST_ESHIP_ACT_SEND_IF_R.TABLE_NAME);
		dlvCntryTables.add(MST_DLV_INST_RECV_IF_R.TABLE_NAME);
		dlvCntryTables.add(MST_SLO_RECV_IF_R.TABLE_NAME);
		return dlvCntryTables;
	}

	protected List<String> getTdlvCntryBaseTables() {
		List<String> tdlvCntryTables = new ArrayList<String>();
		tdlvCntryTables.add(MST_ESHIP_ACT_SEND_IF_R.TABLE_NAME);
		tdlvCntryTables.add(MST_DLV_INST_RECV_IF_R.TABLE_NAME);
		tdlvCntryTables.add(MST_SLO_RECV_IF_R.TABLE_NAME);
		tdlvCntryTables.add(MST_PO_SEND_IF_R.TABLE_NAME);
		tdlvCntryTables.add(MST_ACCPT_SEND_IF_R.TABLE_NAME);
		tdlvCntryTables.add(MST_DLV_INST_SEND_IF_R.TABLE_NAME);
		return tdlvCntryTables;
	}

	protected List<String> getOrgCntryBaseTables() {
		List<String> orgCntryTables = new ArrayList<String>();
		orgCntryTables.add(MST_SLO_RECV_IF_R.TABLE_NAME);
		return orgCntryTables;
	}

	protected List<String> getSpplCntryBaseTables() {
		List<String> spplCntryTables = new ArrayList<String>();
		spplCntryTables.add(MST_PO_SEND_IF_R.TABLE_NAME);
		spplCntryTables.add(MST_ACCPT_SEND_IF_R.TABLE_NAME);
		spplCntryTables.add(MST_DLV_INST_SEND_IF_R.TABLE_NAME);
		return spplCntryTables;
	}

	protected List<String> getIntoCntryBaseTables() {
		List<String> intoCntryTables = new ArrayList<String>();
		intoCntryTables.add(MST_PO_SEND_IF_R.TABLE_NAME);
		intoCntryTables.add(MST_ACCPT_SEND_IF_R.TABLE_NAME);
		intoCntryTables.add(MST_DLV_INST_SEND_IF_R.TABLE_NAME);
		return intoCntryTables;
	}

	protected List<String> getDrctDlvCntryBaseTables() {
		List<String> drctdlvCntryTables = new ArrayList<String>();
		drctdlvCntryTables.add(MST_PO_SEND_IF_R.TABLE_NAME);
		drctdlvCntryTables.add(MST_ACCPT_SEND_IF_R.TABLE_NAME);
		return drctdlvCntryTables;
	}

	protected List<String> getBcstCntryBaseTables() {
		List<String> bcstCntryTables = new ArrayList<String>();
		bcstCntryTables.add(MST_BILL_SEND_IF_R.TABLE_NAME);
		return bcstCntryTables;
	}

	protected List<String> getOperBaseTables() {
		List<String> operTables = new ArrayList<String>();
		operTables.add(MST_IO_ACT_IF_R.TABLE_NAME);
		operTables.add(MSVT_MES_IF_R.TABLE_NAME);
		operTables.add(MST_OPER_ACT_RECV_IF_R.TABLE_NAME);
		operTables.add(MST_ORDER_RECV_IF_R.TABLE_NAME);
		operTables.add(MST_ORDSND_BOM_IF_R.TABLE_NAME);
		operTables.add(MST_ORDSND_DTL_BOM_IF_R.TABLE_NAME);
		operTables.add(MST_ORDSND_GI_SCHD_IF_R.TABLE_NAME);
		operTables.add(MST_ORDSND_ORD_LNK_IF_R.TABLE_NAME);
		operTables.add(MST_WK_ACT_RECV_IF_R.TABLE_NAME);
		operTables.add(MST_INPT_ACT_RECV_IF_R.TABLE_NAME);
		operTables.add(MST_YIELD_ACT_RECV_IF_R.TABLE_NAME);
		return operTables;
	}

	protected List<String> getDbOperBaseTables() {
		List<String> dbOperTables = new ArrayList<String>();
		dbOperTables.add(MST_ACXFR_ACT_RECV_IF_R.TABLE_NAME);
		return dbOperTables;
	}

	protected List<String> getBdOperBaseTables() {
		List<String> bdOperTables = new ArrayList<String>();
		bdOperTables.add(MST_PO_RECV_IF_R.TABLE_NAME);
		bdOperTables.add(MST_ACXFR_ACT_RECV_IF_R.TABLE_NAME);
		return bdOperTables;
	}

	protected List<String> getLgGrpBaseTables() {
		List<String> lgGrpTables = new ArrayList<String>();
		lgGrpTables.add(MST_XFR_ACT_RECV_IF_R.TABLE_NAME);
		lgGrpTables.add(MST_ACXFR_ACT_RECV_IF_R.TABLE_NAME);
		return lgGrpTables;
	}

	protected List<String> getArrLgGrpBaseTables() {
		List<String> arrLgGrpTables = new ArrayList<String>();
		arrLgGrpTables.add(MST_ARR_ACT_RECV_IF_R.TABLE_NAME);
		return arrLgGrpTables;
	}

	protected List<String> getShipFrLgGrpBaseTables() {
		List<String> shipFrLgGrpTables = new ArrayList<String>();
		shipFrLgGrpTables.add(MST_SHIP_ACT_RECV_IF_R.TABLE_NAME);
		return shipFrLgGrpTables;
	}

	protected List<String> getShipToLgGrpBaseTables() {
		List<String> shipToLgGrpTables = new ArrayList<String>();
		shipToLgGrpTables.add(MST_SHIP_PR_IF_R.TABLE_NAME);
		return shipToLgGrpTables;
	}

	protected List<String> getGiLgGrpBaseTables() {
		List<String> giLgGrpTables = new ArrayList<String>();
		giLgGrpTables.add(MSVT_MES_IF_R.TABLE_NAME);
		return giLgGrpTables;
	}

	protected List<String> getGrLgGrpBaseTables() {
		List<String> grLgGrpTables = new ArrayList<String>();
		grLgGrpTables.add(MSVT_MES_IF_R.TABLE_NAME);
		return grLgGrpTables;
	}

	protected List<String> getAcxfrLgGrpBaseTables() {
		List<String> acxfrLgGrpTables = new ArrayList<String>();
		acxfrLgGrpTables.add(MSVT_MES_IF_R.TABLE_NAME);
		return acxfrLgGrpTables;
	}

	protected List<String> getSiteCoBaseTables() {
		List<String> siteCoTables = new ArrayList<String>();
		siteCoTables.add(MST_XFR_ACT_RECV_IF_R.TABLE_NAME);
		siteCoTables.add(MST_ACXFR_ACT_RECV_IF_R.TABLE_NAME);
		siteCoTables.add(MST_ARR_ACT_RECV_IF_R.TABLE_NAME);
		siteCoTables.add(MST_SHIP_ACT_RECV_IF_R.TABLE_NAME);
		siteCoTables.add(MSVT_MES_IF_R.TABLE_NAME);
		return siteCoTables;
	}

	protected List<String> getDbCtgBaseTables() {
		List<String> dbCtgTables = new ArrayList<String>();
		dbCtgTables.add(MST_ACXFR_ACT_RECV_IF_R.TABLE_NAME);
		return dbCtgTables;
	}

	protected List<String> getBdCtgBaseTables() {
		List<String> bdCtgTables = new ArrayList<String>();
		bdCtgTables.add(MST_PO_RECV_IF_R.TABLE_NAME);
		bdCtgTables.add(MST_ACXFR_ACT_RECV_IF_R.TABLE_NAME);
		return bdCtgTables;
	}

	protected List<String> getCalBaseTables() {
		List<String> calBaseTables = new ArrayList<String>();
		calBaseTables.add(MST_ORDSND_CAL_EXT_IF_R.TABLE_NAME);
		calBaseTables.add(MST_ORDSND_LOC_IF_R.TABLE_NAME);
		calBaseTables.add(MST_ORDSND_ORD_LNK_IF_R.TABLE_NAME);
		return calBaseTables;
	}

	protected List<String> getItmTypDBaseTables() {
		List<String> itmTypDBaseTables = new ArrayList<String>();
		itmTypDBaseTables.add(MST_ORDSND_ITM_IF_R.TABLE_NAME);
		return itmTypDBaseTables;
	}

	protected List<String> getSiteBaseTables() {
		List<String> siteBaseTables = new ArrayList<String>();
		siteBaseTables.add(MST_ORDSND_LOC_IF_R.TABLE_NAME);
		return siteBaseTables;
	}

	protected List<String> getLocGrpBaseTables() {
		List<String> locGrpBaseTables = new ArrayList<String>();
		locGrpBaseTables.add(MST_ORDSND_LOC_IF_R.TABLE_NAME);
		return locGrpBaseTables;
	}

	protected List<String> getDbShipTermTables() {
		List<String> shipTermTables = new ArrayList<String>();
		shipTermTables.add(MST_SHIP_PR_IF_R.TABLE_NAME);
		return shipTermTables;
	}

	protected List<String> getDbWkCostTables() {
		List<String> wkCostTables = new ArrayList<String>();
		wkCostTables.add(MSVT_MES_IF_R.TABLE_NAME);
		wkCostTables.add(MST_WK_ACT_RECV_IF_R.TABLE_NAME);
		return wkCostTables;
	}

	protected List<String> getDbWkDayTables() {
		List<String> wkDayTables = new ArrayList<String>();
		wkDayTables.add(MSVT_MES_IF_R.TABLE_NAME);
		wkDayTables.add(MST_WK_ACT_RECV_IF_R.TABLE_NAME);
		return wkDayTables;
	}

	protected List<String> getDbWkRsnTables() {
		List<String> wkRsnTables = new ArrayList<String>();
		wkRsnTables.add(MSVT_MES_IF_R.TABLE_NAME);
		wkRsnTables.add(MST_WK_ACT_RECV_IF_R.TABLE_NAME);
		return wkRsnTables;
	}
	
	protected List<String> getDbPoCrctRsnTables() {
		List<String> poCrctRsnTables = new ArrayList<String>();
		poCrctRsnTables.add(MST_PO_RECV_IF_R.TABLE_NAME);
		return poCrctRsnTables;
	}

	@Override
	protected void setValuesDbc(MCList<MCDBContainer> dbL) {
		super.setValuesDbc(dbL);
		setValuesDbcItms(dbL);
		setValuesDbcSundryItms(dbL);
		setValuesDbcAltGrps(dbL);
		setValuesDbcDpts(dbL);
		setValuesDbcItmGrps(dbL);
		setValuesDbcItmJnls(dbL);
		setValuesDbcTrds(dbL);
		setValuesDbcBizRsns(dbL);
		setValuesDbcNoteRsns(dbL);
		setValuesDbcAcRsns(dbL);
		setValuesDbcAcItmGrps(dbL);
		setValuesDbcWgs(dbL);
		setValuesDbcUsrs(dbL);
		setValuesDbcLocs(dbL);
		setValuesDbcStrLns(dbL);
		setValuesDbcBps(dbL);
		setValuesDbcStkGds(dbL);
		setValuesDbcUnits(dbL);
		setValuesDbcCurs(dbL);
		setValuesDbcTaxs(dbL);
		setValuesDbcXrates(dbL);
		setValuesDbcSttls(dbL);
		setValuesDbcAreas(dbL);
		setValuesDbcCntries(dbL);
		setValuesDbcOpers(dbL);
		setValuesDbcLgGrps(dbL);
		setValuesDbcSiteCos(dbL);
		setValuesDbcCostCtgs(dbL);
		setValuesDbcShipTerms(dbL);
		setValuesDbcTrnspt(dbL);
		setValuesDbcEximPort(dbL);
		setValuesDbcTterm(dbL);
		setValuesDbcPoPrint(dbL);
		setValuesDbcWkCosts(dbL);
		setValuesDbcWkDays(dbL);
		setValuesDbcWkRsns(dbL);
		setValuesDbcBank(dbL);
		setValuesDbcBankAc(dbL);
		setValuesDbcBankBranch(dbL);
		setValuesDbcCal(dbL);
		setValuesDbcItmTypD(dbL);
		setValuesDbcSite(dbL);
		setValuesDbcLocGrp(dbL);
		setValuesDbcPoCrctRsn(dbL);
	}

	protected void setValuesDbcItms(MCList<MCDBContainer> dbL) {
		if (getItmBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcItm(dbL, "itm_cd", "itm_sub1", "itm_sub2", "itm_sub3", "itm_nm");
		}
		if (getBdItmBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcItm(dbL, "bd_itm_cd", "bd_itm_sub1", "bd_itm_sub2", "bd_itm_sub3", "bd_itm_nm");
		}
		if (getParAndChdItmBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcItm(dbL, "par_itm_cd", "par_itm_sub1", "par_itm_sub2", "par_itm_sub3", "par_itm_nm");
			setValuesDbcItm(dbL, "chd_itm_cd", "chd_itm_sub1", "chd_itm_sub2", "chd_itm_sub3", "chd_itm_nm");
		}
		if (getMfgItmBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcItm(dbL, "mfg_itm_cd", "mfg_itm_sub1", "mfg_itm_sub2", "mfg_itm_sub3", "mfg_itm_nm");
		}
	}
	
	protected void setValuesDbcSundryItms(MCList<MCDBContainer> dbL) {
		if (getSundryItmBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcSundryItm(dbL, "itm_cd", "itm_sub1", "itm_sub2", "itm_sub3", "sno1", "sno2", "sno3", "sno4", "itm_nm");
		}
	}

	protected void setValuesDbcTrds(MCList<MCDBContainer> dbL) {
		if (getTrdBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcTrd(dbL, "trd_cd", "trd_nm");
		}
	}

	protected void setValuesDbcAltGrps(MCList<MCDBContainer> dbL) {
		if (getAltGrpBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcAltGrp(dbL, "alt_grp_cd", "wg_cd", "alt_grp_nm");
		}
	}

	protected void setValuesDbcBizRsns(MCList<MCDBContainer> dbL) {
		if (getBizRsnBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBizRsn(dbL, "rsn_cd", "rsn_nm");
		}
		if (getDscntBizRsnBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBizRsn(dbL, "dscnt_rsn_cd", "dscnt_rsn_nm");
		}
		if (getPurcRsnBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBizRsn(dbL, "purc_rsn_cd", "purc_rsn_nm");
		}
		if (getDfctRsnBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBizRsn(dbL, "dfct_rsn_cd", "dfct_rsn_nm");
		}
		if (getLossRsnBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBizRsn(dbL, "loss_rsn_cd", "loss_rsn_nm");
		}
		if (getOldLossRsnBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBizRsn(dbL, "old_loss_rsn_cd", "old_loss_rsn_nm");
		}
		if (getInptRsnBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBizRsn(dbL, "inpt_rsn_cd", "inpt_rsn_nm");
		}
		if (getAcxfrRsnBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBizRsn(dbL, "acxfr_rsn_cd", "acxfr_rsn_nm");
		}
		if (getYieldRsnBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBizRsn(dbL, "yield_rsn_cd", "yield_rsn_nm");
		}
		if (getSmplDfctRsnBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBizRsn(dbL, "smpl_dfct_rsn_cd", "smpl_dfct_rsn_nm");
		}
		if (getTtlDfctRsnBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBizRsn(dbL, "ttl_dfct_rsn_cd", "ttl_dfct_rsn_nm");
		}
	}

	protected void setValuesDbcNoteRsns(MCList<MCDBContainer> dbL) {
		if (getNoteRsnBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcNoteRsn(dbL, "note_rsn_cd", "note_rsn_nm");
		}
	}

	protected void setValuesDbcAcRsns(MCList<MCDBContainer> dbL) {
		if (getAcRsnBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcAcRsn(dbL, "ac_rsn_cd", "ac_rsn_nm");
		}
	}

	protected void setValuesDbcAcItmGrps(MCList<MCDBContainer> dbL) {
		if (getAcItmGrpBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcAcItmGrp(dbL, "ac_itm_grp_cd", "ac_itm_grp_nm");
		}
		if (getParAcItmGrpBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcAcItmGrp(dbL, "par_ac_itm_grp_cd", "par_ac_itm_grp_nm");
		}
	}

	protected void setValuesDbcWgs(MCList<MCDBContainer> dbL) {
		if (getWgBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcWg(dbL, "wg_cd", "wg_nm");
		}
		if (getGiWgBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcWg(dbL, "gi_wg_cd", "gi_wg_nm");
		}
		if (getGrWgBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcWg(dbL, "gr_wg_cd", "gr_wg_nm");
		}
		if (getRqstWgBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcWg(dbL, "rqst_wg_cd", "rqst_wg_nm");
		}
	}

	protected void setValuesDbcUsrs(MCList<MCDBContainer> dbL) {
		if (getActUsrBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcUsr(dbL, "act_usr_cd", "act_usr_nm");
		}
		if (getSlsUsrBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcUsr(dbL, "sls_usr_cd", "sls_usr_nm");
		}
		if (getMfgUsrBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcUsr(dbL, "mfg_usr_cd", "mfg_usr_nm");
		}
		if (getPurcUsrBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcUsr(dbL, "purc_usr_cd", "purc_usr_nm");
		}
		if (getArrUsrBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcUsr(dbL, "arr_usr_cd", "arr_usr_nm");
		}
		if (getRqstUsrBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcUsr(dbL, "rqst_usr_cd", "rqst_usr_nm");
		}
		if (getShipUsrBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcUsr(dbL, "ship_usr_cd", "ship_usr_nm");
		}
		if (getRcvUsrBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcUsr(dbL, "rcv_usr_cd", "rcv_usr_nm");
		}
		if (getWkUsrBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcUsr(dbL, "wk_usr_cd", "wk_usr_nm");
		}
		if (getMfgActUsrBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcUsr(dbL, "mfg_act_usr_cd", "mfg_act_usr_nm");
		}
		if (getJudgUsrBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcUsr(dbL, "judg_usr_cd", "judg_usr_nm");
		}
	}

	protected void setValuesDbcLocs(MCList<MCDBContainer> dbL) {
		if (getLocBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLoc(dbL, "loc_cd", "loc_nm");
		}
		if (getGiLocBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLoc(dbL, "gi_loc_cd", "gi_loc_nm");
		}
		if (getGrLocBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLoc(dbL, "gr_loc_cd", "gr_loc_nm");
		}
		if (getBdLocBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLoc(dbL, "bd_loc_cd", "bd_loc_nm");
		}
		if (getArrLocBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLoc(dbL, "arr_loc_cd", "arr_loc_nm");
		}
		if (getInToIdBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLoc(dbL, "in_to_id_cd", "in_to_id_nm");
		}
		if (getShipLocBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLoc(dbL, "ship_loc_cd", "ship_loc_nm");
		}
		if (getInToLocBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLoc(dbL, "in_to_loc_cd", "in_to_loc_nm");
		}
		if (getMfgLocBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLoc(dbL, "mfg_loc_cd", "mfg_loc_nm");
		}
		if (getStrgLocBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLoc(dbL, "strg_loc_cd", "strg_loc_nm");
		}
		if (getInptLocBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLoc(dbL, "inpt_loc_cd", "inpt_loc_nm");
		}
		if (getAcxfrLocBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLoc(dbL, "acxfr_loc_cd", "acxfr_loc_nm");
		}
		if (getMstMfgLocBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLoc(dbL, "mst_mfg_loc_cd", "mst_mfg_loc_nm");
		}
		if (getRqstLocBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLoc(dbL, "rqst_loc_cd", "rqst_loc_nm");
		}
		if (getDmndLocBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLoc(dbL, "dmnd_loc_cd", "dmnd_loc_nm");
		}
		if (getOperLocBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLoc(dbL, "oper_loc_cd", "oper_loc_nm");
		}
		if (getStkLocBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLoc(dbL, "stk_loc_cd", "stk_loc_nm");
		}
	}

	protected void setValuesDbcTrnspt(MCList<MCDBContainer> dbL) {
		if (getTrnsptBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcTrnspt(dbL, "trnspt_cd", "trnspt_nm");
		}
	}

	protected void setValuesDbcEximPort(MCList<MCDBContainer> dbL) {
		if (getLoadPortBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcEximPort(dbL, "load_port_cd", "load_port_nm");
		}
		if (getDschrgPortBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcEximPort(dbL, "dschrg_port_cd", "dschrg_port_nm");
		}
		if (getViaPortBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcEximPort(dbL, "via_port_cd", "via_port_nm");
		}
	}

	protected void setValuesDbcPoPrint(MCList<MCDBContainer> dbL) {
		if (getPoPrintBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcPoPrint(dbL, "po_print_cd", "po_print_nm");
		}
	}

	protected void setValuesDbcBank(MCList<MCDBContainer> dbL) {
		if (getBankBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBank(dbL, "bank_cd", "bank_nm");
		}
		if (getBankBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBank(dbL, "draw_bank_cd", "draw_bank_nm");
		}
	}

	protected void setValuesDbcBankAc(MCList<MCDBContainer> dbL) {
		if (getBankAcBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBankAc(dbL, "bank_ac_cd", "bank_ac_nm");
		}
	}

	protected void setValuesDbcBankBranch(MCList<MCDBContainer> dbL) {
		if (getBankBranchBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBankBranch(dbL, "draw_bank_cd", "draw_branch_cd", "draw_branch_nm");
		}
	}

	protected void setValuesDbcTterm(MCList<MCDBContainer> dbL) {
		if (getTterm1BaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcTterm(dbL, "tterm_cd1", "tterm_nm1");
		}
		if (getTterm2BaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcTterm(dbL, "tterm_cd2", "tterm_nm2");
		}
		if (getTterm3BaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcTterm(dbL, "tterm_cd3", "tterm_nm3");
		}
	}

	protected void setValuesDbcStrLns(MCList<MCDBContainer> dbL) {
		if (getStrLnBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcStrLn(dbL, "loc_cd", "str_ln_cd", "str_ln_nm");
		}
		if (getGiStrLnBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcStrLn(dbL, "gi_loc_cd", "gi_str_ln_cd", "gi_str_ln_nm");
		}
		if (getGrStrLnBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcStrLn(dbL, "gr_loc_cd", "gr_str_ln_cd", "gr_str_ln_nm");
		}
		if (getArrStrLnBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcStrLn(dbL, "arr_loc_cd", "arr_str_ln_cd", "arr_str_ln_nm");
		}
		if (getDlvStrLnBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcStrLn(dbL, "dlv_id_cd", "dlv_str_ln_cd", "dlv_str_ln_nm");
		}
		if (getShipStrLnBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcStrLn(dbL, "ship_loc_cd", "ship_str_ln_cd", "ship_str_ln_nm");
		}
		if (getInToStrLnBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcStrLn(dbL, "in_to_loc_cd", "str_ln_cd", "str_ln_nm");
		}
		if (getInptStrLnBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcStrLn(dbL, "inpt_loc_cd", "inpt_str_ln_cd", "inpt_str_ln_nm");
		}
		if (getMfgStrLnBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcStrLn(dbL, "mfg_loc_cd", "mfg_str_ln_cd", "mfg_str_ln_nm");
		}
		if (getStrgStrLnBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcStrLn(dbL, "strg_loc_cd", "strg_str_ln_cd", "strg_str_ln_nm");
		}
		if (getAcxfrStrLnBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcStrLn(dbL, "acxfr_loc_cd", "acxfr_str_ln_cd", "acxfr_str_ln_nm");
		}
		if (getStkStrLnBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcStrLn(dbL, "stk_loc_cd", "stk_str_ln_cd", "stk_str_ln_nm");
		}
	}

	protected void setValuesDbcBps(MCList<MCDBContainer> dbL) {
		if (getStkArrvBpBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "stk_arrv_bp_cd", "stk_arrv_bp_nm");
		}
		if (getStkBpBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "stk_bp_cd", "stk_bp_nm");
		}
		if (getDlvBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "dlv_cd", "dlv_nm");
		}
		if (getTdlvBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "tdlv_cd", "tdlv_nm");
		}
		if (getCstBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "cst_cd", "cst_nm");
		}
		if (getAcstBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "acst_cd", "acst_nm");
		}
		if (getBcstBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "bcst_cd", "bcst_nm");
		}
		if (getRcstBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "rcst_cd", "rcst_nm");
		}
		if (getDest1BaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "dest_cd1", "dest_nm1");
		}
		if (getDest2BaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "dest_cd2", "dest_nm2");
		}
		if (getDest3BaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "dest_cd3", "dest_nm3");
		}
		if (getSpplBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "sppl_cd", "sppl_nm");
		}
		if (getAspplBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "asppl_cd", "asppl_nm");
		}
		if (getBspplBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "bsppl_cd", "bsppl_nm");
		}
		if (getPspplBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "psppl_cd", "psppl_nm");
		}
		if (getCredBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "cred_cd", "cred_nm");
		}
		if (getDbBpBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "db_bp_cd", "db_bp_nm");
		}
		if (getSretFrBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "sret_fr_cd", "sret_fr_nm");
		}
		if (getRetStkArrvBpBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "ret_stk_arrv_bp_cd", "ret_stk_arrv_bp_nm");
		}
		if (getMakerBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "maker_cd", "maker_nm");
		}
		if (getBillSrcBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "bill_src_cd", "bill_src_nm");
		}
		if (getBdBpBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "bd_bp_cd", "bd_bp_nm");
		}
	}

	protected void setValuesDbcUnits(MCList<MCDBContainer> dbL) {
		if (getBaseUnitBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcUnit(dbL, "base_unit_cd", "base_unit_nm");
		}
		if (getTrdUnitBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcUnit(dbL, "trd_unit_cd", "trd_unit_nm");
		}
		if (getPackUnitBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcUnit(dbL, "pack_unit_cd", "pack_unit_nm");
		}
		if (getEntUnitBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcUnit(dbL, "ent_unit_cd", "ent_unit_nm");
		}
		if (getUnitTables().contains(dbL.createRow().tableName())) {
			setValuesDbcUnit(dbL, "unit_cd", "unit_nm");
		}
		if (getSmplPackXfrPackUnitTables().contains(dbL.createRow().tableName())) {
			setValuesDbcUnit(dbL, "smpl_pack_xfr_pack_unit_cd", "smpl_pack_xfr_pack_unit_nm");
		}
		if (getTtlPackXfrPackUnitTables().contains(dbL.createRow().tableName())) {
			setValuesDbcUnit(dbL, "ttl_pack_xfr_pack_unit_cd", "ttl_pack_xfr_pack_unit_nm");
		}
	}

	protected void setValuesDbcCurs(MCList<MCDBContainer> dbL) {
		if (getBaseCurBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcCur(dbL, "base_cur_cd", "base_cur_nm");
		}
		if (getTrdCurBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcCur(dbL, "trd_cur_cd", "trd_cur_nm");
		}
		if (getPtaxCurBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcCur(dbL, "ptax_cur_cd", "ptax_cur_nm");
		}
	}

	protected void setValuesDbcTaxs(MCList<MCDBContainer> dbL) {
		if (getTaxBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcTax(dbL, "tax_cd", "tax_nm");
		}
	}

	protected void setValuesDbcXrates(MCList<MCDBContainer> dbL) {
		if (getXrateBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcXrate(dbL, "xrate_cd", "xrate_nm");
		}
		if (getPtaxXrateBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcXrate(dbL, "ptax_xrate_cd", "ptax_xrate_nm");
		}
	}

	protected void setValuesDbcSttls(MCList<MCDBContainer> dbL) {
		if (getSttlBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcSttl(dbL, "sttl_cd", "sttl_nm");
		}
		if (getRcvMtdBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcSttl(dbL, "rcv_mtd_cd", "rcv_mtd_nm");
		}
		if (getPayMtd1BaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcSttl(dbL, "pay_mtd_cd1", "pay_mtd_nm1");
		}
		if (getPayMtd2BaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcSttl(dbL, "pay_mtd_cd2", "pay_mtd_nm2");
		}
		if (getPayMtd3BaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcSttl(dbL, "pay_mtd_cd3", "pay_mtd_nm3");
		}
		if (getPayMtd4BaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcSttl(dbL, "pay_mtd_cd4", "pay_mtd_nm4");
		}
		if (getPayMtd5BaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcSttl(dbL, "pay_mtd_cd5", "pay_mtd_nm5");
		}
		if (getPayMtd6BaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcSttl(dbL, "pay_mtd_cd6", "pay_mtd_nm6");
		}
		if (getPayMtd7BaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcSttl(dbL, "pay_mtd_cd7", "pay_mtd_nm7");
		}
		if (getPayMtd8BaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcSttl(dbL, "pay_mtd_cd8", "pay_mtd_nm8");
		}
		if (getPayMtd9BaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcSttl(dbL, "pay_mtd_cd9", "pay_mtd_nm9");
		}
		if (getPayMtd10BaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcSttl(dbL, "pay_mtd_cd10", "pay_mtd_nm10");
		}
	}

	protected void setValuesDbcAreas(MCList<MCDBContainer> dbL) {
		if (getAreaBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcArea(dbL, "area_cd", "area_nm");
		}
	}

	protected void setValuesDbcCntries(MCList<MCDBContainer> dbL) {
		if (getCntryBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcCntry(dbL, "cntry_cd", "cntry_nm");
		}
		if (getCstCntryBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcCntry(dbL, "cst_cntry_cd", "cst_cntry_nm");
		}
		if (getDlvCntryBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcCntry(dbL, "dlv_cntry_cd", "dlv_cntry_nm");
		}
		if (getTdlvCntryBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcCntry(dbL, "tdlv_cntry_cd", "tdlv_cntry_nm");
		}
		if (getOrgCntryBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcCntry(dbL, "cntry_org_cd", "cntry_org_nm");
		}
		if (getSpplCntryBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcCntry(dbL, "sppl_cntry_cd", "sppl_cntry_nm");
		}
		if (getIntoCntryBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcCntry(dbL, "in_to_cntry_cd", "in_to_cntry_nm");
		}
		if (getDrctDlvCntryBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcCntry(dbL, "drct_dlv_cntry_cd", "drct_dlv_cntry_nm");
		}
		if (getBcstCntryBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcCntry(dbL, "bcst_cntry_cd", "bcst_cntry_nm");
		}
	}

	protected void setValuesDbcOpers(MCList<MCDBContainer> dbL) {
		if (getOperBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcOper(dbL, "oper_cd", "oper_nm");
		}
		if (getDbOperBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcOper(dbL, "db_oper_cd", "db_oper_nm");
		}
		if (getBdOperBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcOper(dbL, "bd_oper_cd", "bd_oper_nm");
		}
	}

	protected void setValuesDbcLgGrps(MCList<MCDBContainer> dbL) {
		if (getLgGrpBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLgGrp(dbL, "lg_grp_cd", "lg_grp_nm");
		}
		if (getArrLgGrpBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLgGrp(dbL, "arr_lg_grp_cd", "arr_lg_grp_nm");
		}
		if (getShipFrLgGrpBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLgGrp(dbL, "ship_fr_lg_grp_cd", "ship_fr_lg_grp_nm");
		}
		if (getShipToLgGrpBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLgGrp(dbL, "ship_to_lg_grp_cd", "ship_to_lg_grp_nm");
		}
		if (getGiLgGrpBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLgGrp(dbL, "gi_lg_grp_cd", "gi_lg_grp_nm");
		}
		if (getGrLgGrpBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLgGrp(dbL, "gr_lg_grp_cd", "gr_lg_grp_nm");
		}
		if (getAcxfrLgGrpBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLgGrp(dbL, "acxfr_lg_grp_cd", "acxfr_lg_grp_nm");
		}
	}

	protected void setValuesDbcSiteCos(MCList<MCDBContainer> dbL) {
		if (getSiteCoBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcSiteCo(dbL, "site_co_cd", "site_co_nm");
		}
	}

	protected void setValuesDbcCostCtgs(MCList<MCDBContainer> dbL) {
		if (getDbCtgBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcCostCtg(dbL, "db_ctg_cd", "db_ctg_nm");
		}
		if (getBdCtgBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcCostCtg(dbL, "bd_ctg_cd", "bd_ctg_nm");
		}
	}

	protected void setValuesDbcShipTerms(MCList<MCDBContainer> dbL) {
		if (getDbShipTermTables().contains(dbL.createRow().tableName())) {
			setValuesDbcShipTerm(dbL, "ship_term_cd", "ship_term_nm");
		}
	}
	
	protected void setValuesDbcWkCosts(MCList<MCDBContainer> dbL) {
		if (getDbWkCostTables().contains(dbL.createRow().tableName())) {
			setValuesDbcWkCost(dbL, "wk_cost_cd", "wk_cost_nm");
		}
	}
	
	protected void setValuesDbcWkDays(MCList<MCDBContainer> dbL) {
		if (getDbWkDayTables().contains(dbL.createRow().tableName())) {
			setValuesDbcWkDay(dbL, "wk_day_cd", "wk_day_nm");
		}
	}
	
	protected void setValuesDbcWkRsns(MCList<MCDBContainer> dbL) {
		if (getDbWkRsnTables().contains(dbL.createRow().tableName())) {
			setValuesDbcWkRsn(dbL, "wk_rsn_cd", "wk_rsn_nm");
		}
	}
	
	protected void setValuesDbcItmJnls(MCList<MCDBContainer> dbL) {
		if (getItmJnlBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcItmJnl(dbL, "itm_jnl_cd", "itm_jnl_nm");
		}
		if (getParItmJnlBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcItmJnl(dbL, "par_itm_jnl_cd", "par_itm_jnl_nm");
		}
	}

	protected void setValuesDbcStkGds(MCList<MCDBContainer> dbL) {
		if (getStkGdBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcStkGd(dbL, "gd_cd", "gd_nm");
		}
		if (getSmplStkGdBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcStkGd(dbL, "smpl_gd_cd", "smpl_gd_nm");
		}
		if (getTtlStkGdBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcStkGd(dbL, "ttl_gd_cd", "ttl_gd_nm");
		}
	}

	protected void setValuesDbcItmGrps(MCList<MCDBContainer> dbL) {
		if (getItmGrpBaseTables().contains(dbL.createRow().tableName())) {
			for (int i = 1; i <= getItmGrpTyps().length; i++) {
				String grpCdColumn = "itm_grp_cd" + i;
				String grpNmAlias = "itm_grp_nm" + i;
				setValuesDbcItmGrp(dbL, grpCdColumn, grpNmAlias, getItmGrpTyps()[i - 1]);
			}
		}
	}

	protected void setValuesDbcCal(MCList<MCDBContainer> dbL) {
		if (getCalBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcCal(dbL, "cal_cd", "cal_nm");
		}
	}

	protected void setValuesDbcItmTypD(MCList<MCDBContainer> dbL) {
		if (getItmTypDBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcItmTypD(dbL,"itm_typ", "itm_typ_d_cd", "itm_typ_d_nm");
		}
	}

	protected void setValuesDbcSite(MCList<MCDBContainer> dbL) {
		if (getSiteBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcSite(dbL, "site_cd", "site_nm");
		}
	}

	protected void setValuesDbcLocGrp(MCList<MCDBContainer> dbL) {
		if (getLocGrpBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLocGrp(dbL, "loc_grp_cd", "loc_grp_nm");
		}
	}
	
	protected void setValuesDbcPoCrctRsn(MCList<MCDBContainer> dbL) {
		if (getDbPoCrctRsnTables().contains(dbL.createRow().tableName())) {
			setValuesDbcPoCrctRsn(dbL, "crct_rsn_cd", "crct_rsn_nm");
		}
	}

	protected void setValuesDbcDpts(MCList<MCDBContainer> dbL) {
		if (isSame(dbL.createRow().tableName(), MST_IO_ACT_IF_R.TABLE_NAME)) {
			setValuesDbcDpt(dbL, "act_dpt_cd", "dpt_st_dt", "act_dpt_nm");
			setValuesDbcDpt(dbL, "purc_dpt_cd", "dpt_st_dt", "purc_dpt_nm");
			setValuesDbcDpt(dbL, "ap_dpt_cd", "dpt_st_dt", "ap_dpt_nm");
			setValuesDbcDpt(dbL, "sls_dpt_cd", "dpt_st_dt", "sls_dpt_nm");
			setValuesDbcDpt(dbL, "ar_dpt_cd", "dpt_st_dt", "ar_dpt_nm");
			setValuesDbcDpt(dbL, "gi_dpt_cd", "dpt_st_dt", "gi_dpt_nm");
			setValuesDbcDpt(dbL, "gr_dpt_cd", "dpt_st_dt", "gr_dpt_nm");
			setValuesDbcDpt(dbL, "bd_dpt_cd", "dpt_st_dt", "bd_dpt_nm");
			setValuesDbcDpt(dbL, "sub_dpt_cd1", "dpt_st_dt", "sub_dpt_nm1");
			setValuesDbcDpt(dbL, "sub_dpt_cd2", "dpt_st_dt", "sub_dpt_nm2");
			setValuesDbcDpt(dbL, "sub_dpt_cd3", "dpt_st_dt", "sub_dpt_nm3");
		}
		if (isSame(dbL.createRow().tableName(), MST_INPT_ACT_RECV_IF_R.TABLE_NAME)) {
			setValuesDbcDpt(dbL, "acxfr_bd_dpt_cd", "act_tm", "acxfr_bd_dpt_nm");
		}
		if (isSame(dbL.createRow().tableName(), MST_YIELD_ACT_RECV_IF_R.TABLE_NAME)) {
			setValuesDbcDpt(dbL, "mfg_act_dpt_cd", "act_tm", "mfg_act_dpt_nm");
		}
		if (isSame(dbL.createRow().tableName(), MST_WK_ACT_RECV_IF_R.TABLE_NAME)) {
			setValuesDbcDpt(dbL, "dpt_cd", "ac_dt", "dpt_nm");
			setValuesDbcDpt(dbL, "wk_usr_dpt_cd", "ac_dt", "wk_usr_dpt_nm");
		}
		if (isSame(dbL.createRow().tableName(), MSVT_MES_IF_R.TABLE_NAME)) {
			setValuesDbcDpt(dbL, "act_dpt_cd", "recv_dt", "act_dpt_nm");
			setValuesDbcDpt(dbL, "acxfr_bd_dpt_cd", "recv_dt", "acxfr_bd_dpt_nm");
		}
		if (isSame(dbL.createRow().tableName(), MST_SLO_RECV_IF_R.TABLE_NAME)) {
			setValuesDbcDpt(dbL, "sls_dpt_cd", "po_dt", "sls_dpt_nm");
		}
		if (isSame(dbL.createRow().tableName(), MST_PO_RECV_IF_R.TABLE_NAME)) {
			setValuesDbcDpt(dbL, "purc_dpt_cd", "po_dt", "purc_dpt_nm");
			setValuesDbcDpt(dbL, "ap_dpt_cd", "po_dt", "ap_dpt_nm");
			setValuesDbcDpt(dbL, "bd_dpt_cd", "po_dt", "bd_dpt_nm");
		}
		if (isSame(dbL.createRow().tableName(), MST_INSP_ACT_IF_R.TABLE_NAME)) {
			setValuesDbcDpt(dbL, "act_dpt_cd", "dpt_st_dt", "act_dpt_nm");
		}
		if (isSame(dbL.createRow().tableName(), MST_RCV_RECV_IF_R.TABLE_NAME)) {
			setValuesDbcDpt(dbL, "bill_dpt_cd", "rcv_dt", "bill_dpt_nm");
			setValuesDbcDpt(dbL, "rcv_dpt_cd", "rcv_dt", "rcv_dpt_nm");
		}
		if (isSame(dbL.createRow().tableName(), MST_ACXFR_ACT_RECV_IF_R.TABLE_NAME)) {
			setValuesDbcDpt(dbL, "bd_dpt_cd", "acxfr_act_tm", "bd_dpt_nm");
			setValuesDbcDpt(dbL, "act_dpt_cd", "acxfr_act_tm", "act_dpt_nm");
		}
		if (isSame(dbL.createRow().tableName(), MST_IO_SCHD_IF_R.TABLE_NAME)) {
			setValuesDbcDpt(dbL, "dpt_cd", "dpt_st_dt", "dpt_nm");
		}
		if (isSame(dbL.createRow().tableName(), MST_MLY_STK_IF_R.TABLE_NAME)) {
			setValuesDbcDpt(dbL, "dpt_cd", "dpt_st_dt", "dpt_nm");
		}
		if (isSame(dbL.createRow().tableName(), MST_MLY_STK_IF_R.TABLE_NAME)) {
			setValuesDbcDpt(dbL, "arr_dpt_cd", "arr_tm", "arr_dpt_nm");
		}
		if (isSame(dbL.createRow().tableName(), MST_SHIP_ACT_RECV_IF_R.TABLE_NAME)) {
			setValuesDbcDpt(dbL, "rqst_dpt_cd", "ship_tm", "rqst_dpt_nm");
			setValuesDbcDpt(dbL, "ship_dpt_cd", "ship_tm", "ship_dpt_nm");
			setValuesDbcDpt(dbL, "bd_dpt_cd", "ship_tm", "bd_dpt_nm");
		}
		if (isSame(dbL.createRow().tableName(), MST_ARR_PR_IF_R.TABLE_NAME)) {
			setValuesDbcDpt(dbL, "rqst_dpt_cd", "dpt_st_dt", "rqst_dpt_nm");
		}
		if (isSame(dbL.createRow().tableName(), MST_XFR_ACT_RECV_IF_R.TABLE_NAME)) {
			setValuesDbcDpt(dbL, "bd_dpt_cd", "xfr_dt", "bd_dpt_nm");
			setValuesDbcDpt(dbL, "act_dpt_cd", "xfr_dt", "act_dpt_nm");
		}
		if (isSame(dbL.createRow().tableName(), MST_SHIP_PR_IF_R.TABLE_NAME)) {
			setValuesDbcDpt(dbL, "rqst_dpt_cd", "dpt_st_dt", "rqst_dpt_nm");
		}
		if (isSame(dbL.createRow().tableName(), MST_ARR_ACT_RECV_IF_R.TABLE_NAME)) {
			setValuesDbcDpt(dbL, "arr_dpt_cd", "arr_tm", "arr_dpt_nm");
		}
		if (isSame(dbL.createRow().tableName(), MST_INSP_ACT_RECV_IF_R.TABLE_NAME)) {
			setValuesDbcDpt(dbL, "act_dpt_cd", "st_act_tm", "act_dpt_nm");
			setValuesDbcDpt(dbL, "judg_dpt_cd", "st_act_tm", "judg_dpt_nm");
			setValuesDbcDpt(dbL, "bd_dpt_cd", "st_act_tm", "bd_dpt_nm");
		}
	}

	protected String[] getItmGrpTyps() {
		return new String[] {
				MAC_ITM_GRP_TYP.GRP1.value(), MAC_ITM_GRP_TYP.GRP2.value(),
				MAC_ITM_GRP_TYP.GRP3.value(), MAC_ITM_GRP_TYP.GRP4.value(),
				MAC_ITM_GRP_TYP.GRP5.value(), MAC_ITM_GRP_TYP.GRP6.value(),
				MAC_ITM_GRP_TYP.GRP7.value(), MAC_ITM_GRP_TYP.GRP8.value(),
				MAC_ITM_GRP_TYP.GRP9.value(), MAC_ITM_GRP_TYP.GRP10.value()
		};
	}

	protected void setValuesDbcPoCrctRsn(MCList<MCDBContainer> dbL, String poCrctRsnCdColumn, String poCrctRsnNmAlias) {
		setValuesDbc(getJoinInfoPoCrctRsn(poCrctRsnCdColumn, poCrctRsnNmAlias), null, dbL);
	}

	protected MCJoinerList<MCRow> getJoinInfoPoCrctRsn(String poCrctRsnCdColumn, String poCrctRsnNmAlias) {
		return joinInfo(j -> j
				.add(MST_PO_CRCT_RSN_R.class, r -> toCondition(r.getStringNE(poCrctRsnCdColumn)))
				.addSelect(m -> toArray(m.po_crct_rsn_nm))
				.addMap((r, m) -> {
					r.setStringNE((poCrctRsnNmAlias), m.po_crct_rsn_nm());
				}));
	}
}