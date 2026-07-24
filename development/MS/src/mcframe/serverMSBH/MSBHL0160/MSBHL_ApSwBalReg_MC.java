package mcframe.serverMSBH.MSBHL0160;

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
import mcframe.serverMSBH.MSBHL5130.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBG.MSBGL0240.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBH.MSBHL0160.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBH.MSBHL5130.*;
import static mcframe.serverMSBH.MSBHL0160.Query.*;
import mcframe.commonMAUA.MAUAC0010.MAUAC_List;
import mcframe.serverMAUC.MAUCL1060.MAUCL_TrdUtil;
import static mcframe.serverCore.requester.MCRequestObject.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHL_ApSwBalReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHL_ApSwBalReg_MC extends MSBHL_ApSwBalReg_MC_A{
	//FMCB CUSTOM START
	/**
	 * このクラス（スレッドセーフ対応用）
	 */
	protected static final Class<MSBHL_ApSwBalReg> CLAZZ = MSBHL_ApSwBalReg.class;
	
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 照合済残高振替の情報を検索する<br>
	 */
	public class Srch01 extends MSBHL_ApSwBalReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			executeQuery(down0(), MSBHL0160_MST_PAY_SCHD_S01(), up0());
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 未照合残高振替の情報を検索する<br>
	 */
	public class Srch02 extends MSBHL_ApSwBalReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			down0().addStringColumn("trd_ptn_typ");
			down0().addBooleanColumn("dscnt_itm_flg");
			executeQuery(down0(), MSBHL0160_MST_AP_D_S01(), up0());
		}
		@Override
		protected void editListMain() {
			super.editListMain();
			for (Srch01_RsltR r : down0()) {
				r.inc_tax_amt(r.inc_tax_amt().multiply(MAUCL_TrdUtil.getAmtDispPm(r.getStringNE("trd_ptn_typ"), r.getBooleanNE("dscnt_itm_flg"))));
			}
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 照合済残高振替の更新前チェック<br>
	 */
	public class Chk01 extends MSBHL_ApSwBalReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();
			if (!hasErr()) {
				callChk ();
			}
		}
		
		/**
		 * 後続処理のチェックをコールします。
		 */
		protected void callChk () {
			up1().addBooleanColumn("sw_chk_flg", true);
			callApSwBalChk01(up0(), up1(), up2());
		}
	}
	
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 未照合残高振替の更新前チェック<br>
	 */
	public class Chk02 extends MSBHL_ApSwBalReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			if (!hasErr()) {
				callChk ();
			}
		}
		
		/**
		 * 後続処理のチェックをコールします。
		 */
		protected void callChk () {
			up1().addBooleanColumn("sw_chk_flg", false);
			callApSwBalChk01(up0(), up1(), up2());
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 照合済残高振替の更新<br>
	 */
	public class Upd01 extends MSBHL_ApSwBalReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
			editUp();
			callThisChk01();
			throwUpdErr();
			callApSwBalIns01();
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(up0());
			setPegNo(up1());
			setPegNo(up2());
		}
		
		/**
		 * チェック処理のコール
		 */
		protected void callThisChk01() {
			MSBHL_ApSwBalReg.Chk01 ope = MSBHL_ApSwBalReg.crtChk01();
			ope.up0().addAll(up0());
			MCRow.copyall(ope.up1(), up1());
			MCRow.copyall(ope.up2(), up2());
			ope.exec();
			up0().setAll(ope.down0());
			MCRow.copyall(up1(), ope.down1());
			MCRow.copyall(up2(), ope.down2());
		}
		
		/**
		 * チェック処理のコール
		 */
		protected void callApSwBalIns01() {
			MSBHL_ApSwBalService.ApSwBal_Ins01 ope = MSBHL_ApSwBalService.crtApSwBal_Ins01();
			ope.up0().addAll(object(CLAZZ)._msbhl5130Chk01.down0());
			ope.up1().addAll(object(CLAZZ)._msbhl5130Chk01.down1());
			ope.up2().addAll(object(CLAZZ)._msbhl5130Chk01.down2());
			ope.exec();
		}
	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 未照合残高振替の更新<br>
	 */
	public class Upd02 extends MSBHL_ApSwBalReg_MC_A.Upd02 {
		@Override
		protected void call() {
			super.call();
			editUp();
			callThisChk01();
			throwUpdErr();
			callApSwBalIns01();
		}
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(up0());
			setPegNo(up1());
			setPegNo(up2());
		}
		
		/**
		 * チェック処理のコール
		 */
		protected void callThisChk01() {
			MSBHL_ApSwBalReg.Chk02 ope = MSBHL_ApSwBalReg.crtChk02();
			ope.up0().addAll(up0());
			MCRow.copyall(ope.up1(), up1());
			MCRow.copyall(ope.up2(), up2());
			ope.exec();
			up0().setAll(ope.down0());
			MCRow.copyall(up1(), ope.down1());
			MCRow.copyall(up2(), ope.down2());
		}
		
		/**
		 * チェック処理のコール
		 */
		protected void callApSwBalIns01() {
			MSBHL_ApSwBalService.ApSwBal_Ins01 ope = MSBHL_ApSwBalService.crtApSwBal_Ins01();
			ope.up0().addAll(object(CLAZZ)._msbhl5130Chk01.down0());
			ope.up1().addAll(object(CLAZZ)._msbhl5130Chk01.down1());
			ope.up2().addAll(object(CLAZZ)._msbhl5130Chk01.down2());
			ope.exec();
		}
	}
	/**
	 * 債務残高振替SVのチェック処理をコールします。
	 * @param swFr
	 * @param swBaseR
	 * @param swToR
	 */
	protected MSBHL_ApSwBalService.ApSwBal_Chk01 _msbhl5130Chk01;
	protected void callApSwBalChk01(MCList<SwFrR> swFr, SwBaseR swBaseR, SwToR swToR) {
		object(CLAZZ)._msbhl5130Chk01 = MSBHL_ApSwBalService.crtApSwBal_Chk01();
		int hdrPegNo = 0;
		for (SwFrR swFrR : swFr) {
			ApSwBal_Chk01_FrR frR = object(CLAZZ)._msbhl5130Chk01.up0().add();
			frR.hdr_peg_no(hdrPegNo);
			frR.peg_no(swFrR.peg_no());
			frR.ap_d_no(swFrR.ap_d_no());
			frR.pay_schd_no(swFrR.pay_schd_no());
			frR.ap_d_upd_cntr(swFrR.ap_d_upd_cntr());
			frR.pay_chk_upd_cntr(swFrR.pay_chk_upd_cntr());
			frR.setAttributes(swFrR);
		}
		
		ApSwBal_Chk01_BaseR baseR = object(CLAZZ)._msbhl5130Chk01.up1().add();
		baseR.hdr_peg_no(hdrPegNo);
		baseR.peg_no(swBaseR.peg_no());
		baseR.sw_dt(swBaseR.sw_dt());
		baseR.ac_dt(swBaseR.ac_dt());
		baseR.pay_basis_dt(swBaseR.pay_basis_dt());
		baseR.pay_crryovr_times(swBaseR.pay_crryovr_times());
		baseR.pay_schd_dt(swBaseR.pay_schd_dt());
		baseR.ap_sttl_cd(swBaseR.ap_sttl_cd());
		baseR.pay_usr_cd(swBaseR.usr_cd());
		baseR.pay_dpt_cd(swBaseR.dpt_cd());
		baseR.trd_rmrks(swBaseR.trd_rmrks());
		baseR.sub_char1(swBaseR.sub_char1());
		baseR.sub_char2(swBaseR.sub_char2());
		baseR.sub_char3(swBaseR.sub_char3());
		baseR.dac_not_chk_flg(false);
		baseR.upd_cntr_not_chk_flg(false);
		baseR.sw_chk_flg(swBaseR.getBooleanNE("sw_chk_flg"));
		baseR.setAttributes(swBaseR);
		
		ApSwBal_Chk01_ToR toR = object(CLAZZ)._msbhl5130Chk01.up2().add();
		toR.hdr_peg_no(hdrPegNo);
		toR.peg_no(swToR.peg_no());
		toR.asppl_cd(swToR.asppl_cd());
		toR.ap_dpt_cd(swToR.ap_dpt_cd());
		toR.bsppl_dpt_cd(swToR.bsppl_dpt_cd());
		toR.wrk_ope_typ(swToR.ap_wrk_ope_typ());
		toR.wrk_no(swToR.wrk_no());
		toR.setAttributes(swToR);
		
		object(CLAZZ)._msbhl5130Chk01.exec();
	}

	//FMCB CUSTOM END
}