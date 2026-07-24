package mcframe.serverMSBE.MSBEL2250;

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
import mcframe.serverMSBE.MSBEL2250.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBE.MSBEL2250.Query.*;
import mcframe.serverMSUC.MSUCL0020.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_RcptIvSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_RcptIvSrch_MC extends MSBEL_RcptIvSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 * 受領インボイスを明細単位（仕入予定）で検索する。
	 */
	public class Srch01 extends MSBEL_RcptIvSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			setUpCols(up0());
			
			MCQueryPlan sql = MSBEL2250_MST_RCPT_IV_S01();
			searchForDL(sql , up0(), down0(), Srch01_RsltR.$rcpt_iv_mng_no);
			
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			chkDac();
			calcAmt(down0());
		}

		/**
		 * ＤＡＣチェックを行う<p>
		 * ＤＡＣ権限がない明細が含まれている場合は、検索対象から除外する
		 */
		protected void chkDac() {
			MCList<Srch01_RsltR> dacNG = MCList.create(Srch01_RsltR.class);
			for(MCList<Srch01_RsltR> list : down0().groupList(Srch01_RsltR.$rcpt_iv_mng_no)){
				for (Srch01_RsltR r : list) {
					if(!readableWgCdDac(r.purc_dpt_wg_cd())){
						dacNG.addAll(list);
						break;
					}
				}
			}
			if (!dacNG.isEmpty()) {
				down0().removeAll(dacNG);
			}
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 * 受領インボイスをヘッダ単位で検索する。
	 */
	public class Srch02 extends MSBEL_RcptIvSrch_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			setUpCols(up0());
			
			MCQueryPlan sql = MSBEL2250_MST_RCPT_IV_S02();
			searchForDL(sql , up0(), down0(), Srch01_RsltR.$rcpt_iv_mng_no);
			
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			chkDac();
		}
	
		/**
		 * ＤＡＣチェックを行う<p>
		 * ＤＡＣ権限がない明細が含まれている場合は、検索対象から除外する
		 */
		protected void chkDac() {
			MCList<MST_RCPT_IV_D_R> dbc = MCList.create(MST_RCPT_IV_D_R.class);
			MST_RCPT_IV_D_R t = MST_RCPT_IV_D_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.rcpt_iv_mng_no, t.wg_cd);
			dbc_bldr.setWhere(t.rcpt_iv_mng_no.eq(bind("rcpt_iv_mng_no")));
			dbSelect("MSBEL2250_MST_RCPT_IV_D_S01", dbc, dbc_bldr, down0().groupBy(Srch01_RsltR.$rcpt_iv_mng_no));
			MCIndexKey idx = dbc.createIndex(MST_RCPT_IV_D_R.$rcpt_iv_mng_no);
			
			MCList<Srch01_RsltR> dacNG = MCList.create(Srch01_RsltR.class);
			for (Srch01_RsltR r : down0()) {
				for (MST_RCPT_IV_D_R rcptDR : dbc.subList(idx, r.rcpt_iv_mng_no())) {
					if(!readableWgCdDac(rcptDR.wg_cd())){
						dacNG.add(r);
						break;
					}
				}
			}
			if (!dacNG.isEmpty()) {
				down0().removeAll(dacNG);
			}
		}
	}
	
	/**
	 * 一時カラムを設定する
	 * @param up0
	 */
	protected void setUpCols(Srch01_CndR up0) {
		String cmplFlg = "TMP_CMPL_FLG";
		up0.addStringColumn(cmplFlg);
		if (up0.im_comp_flg() && !up0.im_not_comp_flg()) {
			up0.setString(cmplFlg, MCBooleanUtil.booleanToDBString(true));
		}
		else if (!up0.im_comp_flg() && up0.im_not_comp_flg()) {
			up0.setString(cmplFlg, MCBooleanUtil.booleanToDBString(false));
		}
		else if (up0.im_comp_flg() && up0.im_not_comp_flg()) {
			up0.setString(cmplFlg, null);
		}
		// 取消含む
		if (!up0.inc_can_flg()) {
			up0.addStringColumn("inc_can_flg_str", "0");
		}
		// 過去改訂含む
		if (!up0.inc_past_flg()) {
			up0.addStringColumn("inc_past_flg_str", "0");
		}
		String fixFlg = "TMP_FIX_FLG";
		up0.addStringColumn(fixFlg);
		// 確定
		if (up0.fix_flg() && !up0.not_fix_flg()) {
			up0.setString(fixFlg, MCBooleanUtil.booleanToDBString(true));
		}
		else if (!up0.fix_flg() && up0.not_fix_flg()) {
			up0.setString(fixFlg, MCBooleanUtil.booleanToDBString(false));
		}
		else if (up0.fix_flg() && up0.not_fix_flg()) {
			up0.setString(fixFlg, null);
		}
	}
	
	/**
	 * 金額を設定する
	 */
	protected void setAmt(MCList<Srch01_RsltR> lst) {
		for (Srch01_RsltR r : lst) {
			setBaseAmt(r);
			setPtaxAmt(r);
		}
	}
	
	/**
	 * 基準通貨金額を設定する
	 */
	protected void setBaseAmt(Srch01_RsltR r) {
		// 基準通貨単価
		r.base_cur_upri(convToBaseCur(r.trd_cur_upri(), r.xrate(), getBaseCur().upri_dec_place(), getCo().xrate_rnd_typ()));
		// 基準通貨値引額
		r.base_cur_dscnt_amt(convToBaseCur(r.trd_cur_dscnt_amt(), r.xrate(), getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
		// 基準通貨金額
		r.base_cur_amt(convToBaseCur(r.trd_cur_amt(), r.xrate(), getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
		// 基準通貨税込額
		r.base_cur_inc_ctax_amt(convToBaseCur(r.trd_cur_inc_tax_amt(), r.xrate(), getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
		// 基準通貨税額
		r.base_cur_tax_amt(convToBaseCur(r.trd_cur_tax_amt(), r.xrate(), getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
	}
	
	/**
	 * 納税通貨金額を設定する
	 */
	protected void setPtaxAmt(Srch01_RsltR r) {

		// 納税通貨単価
		r.ptax_cur_upri(convCur(r.trd_cur_upri(), r.ptax_xrate(), getPtaxCur().upri_dec_place(), getCo().xrate_rnd_typ()));
		// 納税通貨値引額
		r.ptax_cur_dscnt_amt(convCur(r.trd_cur_dscnt_amt(), r.ptax_xrate(), getPtaxCur().amt_dec_place(), getCo().xrate_rnd_typ()));
		// 納税通貨金額
		r.ptax_cur_amt(convCur(r.trd_cur_amt(), r.ptax_xrate(), getPtaxCur().amt_dec_place(), getCo().xrate_rnd_typ()));
		// 納税通貨税込額
		r.ptax_cur_inc_ctax_amt(convCur(r.trd_cur_inc_tax_amt(), r.ptax_xrate(), getPtaxCur().amt_dec_place(), getCo().xrate_rnd_typ()));
		// 納税通貨税額
		r.ptax_cur_tax_amt(convCur(r.trd_cur_tax_amt(), r.ptax_xrate(), getPtaxCur().amt_dec_place(), getCo().xrate_rnd_typ()));
	}

	/**
	 * 発注時の情報を元に明細の金額計算を行う
	 */
	protected void calcAmt(MCList<Srch01_RsltR> dtlL) {
		if(dtlL.isEmpty()){
			return;
		}

		for (Srch01_RsltR rr : dtlL) {
			
			// 基準通貨・納税通貨に換算
			// 基準通貨
			rr.setStringNE(Srch01_RsltR.$base_cur_cd, getBaseCur().cur_cd());
			rr.setStringNE(Srch01_RsltR.$base_cur_nm, getBaseCur().cur_nm());
			rr.setNumberNE(Srch01_RsltR.$base_upri_dec_place, getBaseCur().upri_dec_place());
			rr.setNumberNE(Srch01_RsltR.$base_amt_dec_place, getBaseCur().amt_dec_place());
			// 納税通貨
			rr.setStringNE(Srch01_RsltR.$ptax_cur_cd, getPtaxCur().cur_cd());
			rr.setStringNE(Srch01_RsltR.$ptax_cur_nm, getPtaxCur().cur_nm());
			rr.setNumberNE(Srch01_RsltR.$ptax_upri_dec_place, getPtaxCur().upri_dec_place());
			rr.setNumberNE(Srch01_RsltR.$ptax_amt_dec_place, getPtaxCur().amt_dec_place());
			
			// 単価・値引額・金額・税額
			rr.base_cur_upri(convToBaseCur(rr.trd_cur_upri(), rr.xrate(), getBaseCur().upri_dec_place(), getCo().xrate_rnd_typ()));
			rr.base_cur_dscnt_amt(convToBaseCur(rr.trd_cur_dscnt_amt(), rr.xrate(), getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
			rr.base_cur_amt(convToBaseCur(rr.trd_cur_amt(), rr.xrate(), getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
			rr.base_cur_tax_amt(convToBaseCur(rr.trd_cur_tax_amt(), rr.xrate(), getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
			if (!isNull(rr.base_cur_amt())) {
				rr.base_cur_inc_ctax_amt(rr.base_cur_amt().add(rr.base_cur_tax_amt()));
			}

			// 加工単価・金額
			rr.base_cur_proc_upri(convToBaseCur(rr.trd_cur_proc_upri(), rr.xrate(), getBaseCur().upri_dec_place(), getCo().xrate_rnd_typ()));
			rr.base_cur_proc_amt(convToBaseCur(rr.trd_cur_proc_amt(), rr.xrate(), getBaseCur().upri_dec_place(), getCo().xrate_rnd_typ()));
			// 有償支給単価・金額
			rr.base_cur_onr_prov_upri(
					convToBaseCur(rr.trd_cur_onr_prov_upri(), rr.xrate(), getBaseCur().upri_dec_place(), getCo().xrate_rnd_typ()));
			rr.base_cur_onr_prov_amt(
					convToBaseCur(rr.trd_cur_onr_prov_amt(), rr.xrate(), getBaseCur().upri_dec_place(), getCo().xrate_rnd_typ()));

			if (!isNull(rr.ptax_cur_cd())) {
				rr.ptax_cur_upri(convCur(rr.trd_cur_upri(), rr.ptax_xrate(), getPtaxCur().upri_dec_place(), getCo().xrate_rnd_typ()));
				rr.ptax_cur_dscnt_amt(convCur(rr.trd_cur_dscnt_amt(), rr.ptax_xrate(), getPtaxCur().amt_dec_place(), getCo().xrate_rnd_typ()));
				rr.ptax_cur_amt(convCur(rr.trd_cur_amt(), rr.ptax_xrate(), getPtaxCur().amt_dec_place(), getCo().xrate_rnd_typ()));
				rr.ptax_cur_tax_amt(convCur(rr.trd_cur_tax_amt(), rr.ptax_xrate(), getPtaxCur().amt_dec_place(), getCo().xrate_rnd_typ()));
				if (!isNull(rr.ptax_cur_amt())) {
					rr.ptax_cur_inc_ctax_amt(rr.ptax_cur_amt().add(rr.ptax_cur_tax_amt()));
				}

				// 加工単価・金額
				rr.ptax_cur_proc_upri(convCur(rr.trd_cur_proc_upri(), rr.ptax_xrate(), getPtaxCur().upri_dec_place(), getCo().xrate_rnd_typ()));
				rr.ptax_cur_proc_amt(convCur(rr.trd_cur_proc_amt(), rr.ptax_xrate(), getPtaxCur().amt_dec_place(), getCo().xrate_rnd_typ()));

				// 有償支給単価・金額
				rr.ptax_cur_onr_prov_upri(
						convCur(rr.trd_cur_onr_prov_upri(), rr.ptax_xrate(), getPtaxCur().upri_dec_place(), getCo().xrate_rnd_typ()));
				rr.ptax_cur_onr_prov_amt(convCur(rr.trd_cur_onr_prov_amt(), rr.ptax_xrate(), getPtaxCur().amt_dec_place(), getCo().xrate_rnd_typ()));
			}
		}

	}

	//FMCB CUSTOM END
}