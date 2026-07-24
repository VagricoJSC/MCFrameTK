package mcframe.serverMGBB.MGBBL0400;

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
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import static mcframe.serverMGUC.MGUCL0020.MGUCL_AppSys.*;
import mcframe.commonMG.constant.*;
import mcframe.serverMG.dbc.*;
import static mcframe.commonMG.notice.MG_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMG.dbc.MGFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMGBB.MGBBL0400.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMGBB.MGBBL5030.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBBL_ActItmCopyReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBBL_ActItmCopyReg_MC extends MGBBL_ActItmCopyReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Chk01オペレーション.<p>
	 *
	 * コピー前のチェックをする。<br>
	 */
	public class Chk01 extends MGBBL_ActItmCopyReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			setDown();
		}
		
		@Override
		protected void initUpSub() {
			super.initUpSub();
			String defWgCd = getSysParm("DEF_WG_CD");
			if (!isNullOrNullVal(defWgCd)) {
				up0().wg_cd(defWgCd);
				MCRow.copyvalue(down0(), up0());
			}
			for(String ctg : MCStringUtil.arrayValueSplit(up0().act_calc_ctg_cd())){
				Chk01_Cnd2R calcR = Chk01_Cnd2R.create();
				calcR.act_calc_ctg_cd(ctg);
				calcR.setAttributes(up0());
				up1().add(calcR);
			}
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(chk());
			return msgL;
		}
		
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_CndR> notErrL = getChkList(up0());

			for (Chk01_CndR upR : notErrL){
				// DACチェック
				for(String wg : MCStringUtil.arrayValueSplit(upR.wg_cd())){
					Chk01_CndR wk = Chk01_CndR.create();
					wk.wg_cd(wg);
					msgL.addAll(checkWritableWgCdDac(wk, Chk01_CndR.$wg_cd));
				}
			}

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 原価実績品目系情報をコピーする。<br>
	 */
	public class Ins01 extends MGBBL_ActItmCopyReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			callThisChk01();
			throwUpdErr();
			execMain();
			throwErr(msgOpeErr());
		}
		
		protected void callThisChk01() {
			MGBBL_ActItmCopyReg.Chk01 ope = MGBBL_ActItmCopyReg.crtChk01();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
			MCRow.copyall(up0(), ope.down0());
		}

		protected void execMain() {
			MGBBL_ActItmCopyService.ActItmCopy_Ins01 ope = MGBBL_ActItmCopyService.crtActItmCopy_Ins01();
			copy(ope.up0(), up0(), createMap_ActItmCopy_Chk01_CndR_Chk01_CndR());
			ope.exec();
		}
		
		protected Map_ActItmCopy_Chk01_CndR_Chk01_CndR<ActItmCopy_Chk01_CndR,Chk01_CndR> createMap_ActItmCopy_Chk01_CndR_Chk01_CndR() {
			return new Map_ActItmCopy_Chk01_CndR_Chk01_CndR<ActItmCopy_Chk01_CndR, Chk01_CndR>();
		}

		public class Map_ActItmCopy_Chk01_CndR_Chk01_CndR<D extends ActItmCopy_Chk01_CndR, S extends Chk01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ActItmCopy_Chk01_CndR.$act_calc_ctg_cd, Chk01_CndR.$act_calc_ctg_cd);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$wg_cd, Chk01_CndR.$wg_cd);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$ym_fr, Chk01_CndR.$ym_fr);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$ym_to, Chk01_CndR.$ym_to);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$calc_ctg_cd, Chk01_CndR.$calc_ctg_cd);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$term, Chk01_CndR.$term);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$ptn_set_typ, Chk01_CndR.$ptn_set_typ);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$itm_flg, Chk01_CndR.$itm_flg);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$dtl_flg, Chk01_CndR.$dtl_flg);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$oper_flg, Chk01_CndR.$oper_flg);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$bom_flg, Chk01_CndR.$bom_flg);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$wk_flg, Chk01_CndR.$wk_flg);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$purc_flg, Chk01_CndR.$purc_flg);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$proc_flg, Chk01_CndR.$proc_flg);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$prov_flg, Chk01_CndR.$prov_flg);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$sls_flg, Chk01_CndR.$sls_flg);

			}
		}
	}

	//FMCB CUSTOM END
}