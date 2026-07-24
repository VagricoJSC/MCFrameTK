package mcframe.serverMSBF.MSBFL0150;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMSBF.MSBFL0150.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Cnd01R;
import mcframe.serverMSBF.MSBFL5220.LotInh_Upd01_Cnd02R;
import mcframe.serverMSBF.MSBFL5220.MSBFL_LotInhService;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import static mcframe.serverMSBF.MSBFL0150.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBFL_LotInhExecute"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBFL_LotInhExecute_MC extends MSBFL_LotInhExecute_MC_A{
	//FMCB CUSTOM START

	/**
	 * Chk01オペレーション.<p>
	 *
	 * ロット継承サービスを実行する前のチェックを行う<br>
	 */
	public class Chk01 extends MSBFL_LotInhExecute_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}
		
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			if (!hasErrFlgOn(up0())) {
				msgL.addAll(chkSublotNo());
				msgL.addAll(chkLotExists());
				if (!containsErrMsgL(msgL)) {
					msgL.addAll(chkItmMfgInstExists());
				}
				if (!containsErrMsgL(msgL)) {
					msgL.addAll(lockAndChkItmMfgInst());
				}
			}
			return msgL;
		}
		
		protected MCMessageList chkSublotNo() {
			MCMessageList msgL = new MCMessageList();
			
			up0().org_sublot_no(up0().sublot_no());
			
			if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(up0().sublot_mng_typ())) {
				up0().sublot_no(MAC_STR.NULL_VAL.value());
			}
			else if (MAC_SUBLOT_MNG_TYP.isSTK(up0().sublot_mng_typ())) {
				up0().sublot_no(MAC_STR.NULL_VAL.value());
			}
			else {
				msgL = check(up0(), Chk01_CndR.$sublot_no, new FXUCL_RequiredValidater());
			}
			
			return msgL;
		}
		
		protected MCMessageList chkLotExists() {
			MCMessageList msgL = new MCMessageList();
			
			MST_LOT_R dbc = MST_LOT_R.create();
			dbc.itm_cd(up0().itm_cd());
			dbc.itm_sub1(up0().itm_sub1());
			dbc.itm_sub2(up0().itm_sub2());
			dbc.itm_sub3(up0().itm_sub3());
			dbc.lot_no(up0().lot_no());
			dbc.sublot_no(up0().sublot_no());

			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_LOT_R.create("T"));
			dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
			int cnt = dbSelectKey("MSBFL0150_MST_LOT_S01", dbc, dbc_bldr, dbc);
			if (cnt == 0) {
				msgL.add(new MCMessage(up0(), Chk01_CndR.$itm_cd, MSBFL0124, 
						toDispItm(up0().itm_cd(), up0().itm_sub1(), up0().itm_sub2(), up0().itm_sub3()),
						up0().lot_no(), up0().sublot_no()));
				return msgL;
			}
			return msgL;
		}
		
		protected MCMessageList chkItmMfgInstExists() {
			MCMessageList msgL = new MCMessageList();
			MCList<MCRow> rsltL = MCList.create(MCRow.class);
			executeQuery(rsltL, MSBFL0150_MST_ITM_MFG_INST_S01(), up0());
			MCRow rsltR = MCRow.create();
			if (rsltL.size() > 0 ) {
				rsltR = rsltL.get(0);
			}
			up0().itm_mfg_inst_no(rsltR.getStringNE("itm_mfg_inst_no"));
			
			if (isNull(up0().itm_mfg_inst_no())) {
				msgL.add(new MCMessage(up0(), Chk01_CndR.$wg_cd, MSBFL0125, 
						toDispItm(up0().itm_cd(), up0().itm_sub1(), up0().itm_sub2(), up0().itm_sub3()),
						up0().lot_no(), up0().sublot_no(), up0().wg_cd()));
			}
			
			return msgL;
		}
		
		protected MCMessageList lockAndChkItmMfgInst() {
			MCMessageList msgL = new MCMessageList();
			
			MST_ITM_MFG_INST_R itmMfgInstR = MST_ITM_MFG_INST_R.create();
			int cnt = executeQuery(itmMfgInstR, MSBFL0150_MST_ITM_MFG_INST_S02(), up0());
			itmMfgInstR.setAttributes(up0());
			if (cnt == 0) {
				msgL.add(new MCMessage(up0(), Chk01_CndR.$wg_cd, MSBFL0126, up0().itm_mfg_inst_no()));
			}
			else {
				msgL.addAll(checkWritableLocCdDac(itmMfgInstR, MST_ITM_MFG_INST_R.$mfg_loc_cd));
				
				// ロット継承対象外の場合、エラーとする
				if (isNull(itmMfgInstR.lot_no())) {
					msgL.add(new MCMessage(up0(), Chk01_CndR.$wg_cd, MSBFL0127, 
							toDispItm(itmMfgInstR.itm_cd(), itmMfgInstR.itm_sub1(), itmMfgInstR.itm_sub2(), itmMfgInstR.itm_sub3()),
							itmMfgInstR.bom_ptn(), itmMfgInstR.wg_cd(), itmMfgInstR.itm_mfg_inst_no()));
				}
				
				if (!containsErrMsgL(msgL)) {
					MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
					MCQueryApiBuilder dbcMfgInstL_bldr = MCQueryApiBuilder.create(t);
					dbcMfgInstL_bldr.setSelect(dbcMfgInstL_bldr.getBaseDbc().getKeyColumn$());
					dbcMfgInstL_bldr.setOrderByAsc(dbcMfgInstL_bldr.getBaseDbc().getKeyColumn$());
					dbcMfgInstL_bldr.setWhere(t.itm_mfg_inst_no.eq(bind("1")), up0().itm_mfg_inst_no());
					dbSelectForUpdateNoFetch("MSBFL0150_MST_MFG_INST_S01", dbcMfgInstL_bldr);
				}
			}
			return msgL;
		}
		
		protected boolean containsErrMsgL(MCMessageList msgL) {
			if (msgL == null) {
				return false;
			}
			for (MCMessage msg : msgL) {
				if (isErrMsg(msg)) {
					return true;
				}
			}
			return false;
		}
		
	}
	
	/**
	 * Upd01オペレーション.<p>
	 *
	 * ロット継承サービスを実行する<br>
	 */
	public class Upd01 extends MSBFL_LotInhExecute_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			callThisChk01();
			throwUpdErr();
			callLotInhSrv();
		}
		
		protected void callThisChk01() {
			MSBFL_LotInhExecute.Chk01 ope = MSBFL_LotInhExecute.crtChk01();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
			MCRow.copyall(up0(), ope.down0());
		}
		
		protected void callLotInhSrv() {
			MSBFL_LotInhService.LotInh_Upd01 ope = MSBFL_LotInhService.crtLotInh_Upd01();
			LotInh_Upd01_Cnd01R cnd1R = LotInh_Upd01_Cnd01R.create();
			cnd1R.itm_mfg_inst_no(up0().itm_mfg_inst_no());
			ope.up0().add(cnd1R);
			LotInh_Upd01_Cnd02R cnd2R = LotInh_Upd01_Cnd02R.create();
			cnd2R.itm_cd(up0().itm_cd());
			cnd2R.itm_sub1(up0().itm_sub1());
			cnd2R.itm_sub2(up0().itm_sub2());
			cnd2R.itm_sub3(up0().itm_sub3());
			cnd2R.lot_no(up0().lot_no());
			cnd2R.sublot_no(up0().sublot_no());
			ope.up1().add(cnd2R);
			ope.exec();
		}
		
	}

	//FMCB CUSTOM END
}