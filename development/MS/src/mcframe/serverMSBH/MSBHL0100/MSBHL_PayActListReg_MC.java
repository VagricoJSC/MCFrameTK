package mcframe.serverMSBH.MSBHL0100;

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
import mcframe.commonCore.param.MCParam;
import mcframe.serverMSBH.MSBHL0100.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import mcframe.serverMSBH.MSBHL5010.MSBHL_ApUtil;
import mcframe.serverMSBH.MSBHL5040.*;
import mcframe.serverMSBH.MSBHL5130.*;

import static mcframe.serverMSBH.MSBHL0100.Query.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHL_PayActListReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHL_PayActListReg_MC extends MSBHL_PayActListReg_MC_A{
	//FMCB CUSTOM START
	protected final String SRCH_DEL = "1";
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 支払予定を検索する<br>
	 */
	public class Srch01 extends MSBHL_PayActListReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editCnd();
			MCQueryPlan sql = MSBHL0100_MST_PAY_SCHD_S01();
			searchForDL(sql, up0(), down0());
		}

		/**
		 * 検索条件の編集
		 */
		protected void editCnd() {
			up0().today(getToday());
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			down0().forEach(r -> {
				r.pay_act_dt(getToday());
				r.ac_dt(getToday());
				r.pay_basis_dt(getToday());
				r.xrate_cd(getCo().purc_xrate_cd());
				r.base_cur_cd(getBaseCur().cur_cd());
				r.base_cur_nm(getBaseCur().cur_nm());
				r.base_cur_amt_dec_place(getBaseCur().amt_dec_place());
			});
			
			setValuesDbc(up0(), down0());

			down0().forEach(r -> {
				if (!MAC_AP_SETOFF_TYP.isFLEX(r.ap_setoff_typ())) {
					r.setoff_nm(r.setoff_nm_bp());
				}

					setComPaidTaxAmt(r);

				setBaseCurAmt(r);
			});
		}

		/**
		 * 取引通貨手数料税額を再計算する
		 */
		protected void setComPaidTaxAmt(Srch01_RsltR r) {
			if (isNull(r.trd_cur_com_paid_tax_cd())) {
				return;
			}

			MAM_TAX_R todayTaxR = MSBHL_ApUtil.getTax(MSBHL_ApUtil.getComPaidAndSetoffTaxCd(getToday()));
			r.trd_cur_com_paid_tax_cd(todayTaxR.tax_cd());
			r.trd_cur_com_paid_tax_nm(todayTaxR.tax_nm());

			if (!isSame(todayTaxR.tax_rate(), r.trd_cur_com_paid_tax_rate()) || MSC_PAY_STS_TYP.isPART_PAY(r.pay_sts_typ())) {
				r.trd_cur_com_paid_tax_rate(todayTaxR.tax_rate());

				r.trd_cur_com_paid_tax_amt(MAUCL_AmtUtil.getTaxAmt(r.trd_cur_amt(), todayTaxR.tax_rate(), r.trd_cur_amt_dec_place(),
						getCo().com_paid_tax_rnd_typ(), todayTaxR.inc_tax_flg()));
			}
		}

		/**
		 * 基準通貨金額・基準通貨手数料税額を設定する
		 */
		protected void setBaseCurAmt(Srch01_RsltR r) {
			MCNumber xrate = MAUCL_AmtUtil.getDefXrateNE(r.trd_cur_cd(), r.base_cur_cd(),
					getCo().purc_xrate_cd(), getToday());
			if (!isNull(xrate)) {
				r.base_cur_amt(convToBaseCur(r.trd_cur_amt(), xrate,
						r.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				r.base_cur_com_paid_tax_amt(convToBaseCur(r.trd_cur_com_paid_tax_amt(),
						xrate, r.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				r.xrate(xrate);
			}
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 支払実績を検索する<br>
	 */
	public class Srch02 extends MSBHL_PayActListReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editCnd();
			MCQueryPlan sql = MSBHL0100_MST_PAY_ACT_S01();
			if (isSame(up0().mode(), "PAYSCHD")) {
				srchForPaySchdMode(sql);
			}
			else {
				srchForPayActDMode(sql);
			}
		}
		
		/**
		 * 検索条件の編集
		 */
		protected void editCnd() {
			up0().today(getToday());

			if (isSame(up0().mode(), "PAYACTD")) {
				up0().setStringNE("tmp_pay_act_dtl",
						MCBooleanUtil.booleanToDBString(true));
			}

			if (!up0().inc_can_flg()) {
				up0().setStringNE("tmp_slip_sts_typ", MAC_SLIP_STS_TYP.CRT.value());
			}

			if (!up0().inc_schd_act_flg()) {
				up0().setStringNE("tmp_schd_act_flg",
						MCBooleanUtil.booleanToDBString(false));
			}
			if (!up0().inc_sw_flg()) {
				up0().setStringNE("tmp_sw_flg",
						MCBooleanUtil.booleanToDBString(false));
			}
			if (isSame(up0().ope(), SRCH_DEL)) {
				up0().setStringNE("tmp_srch_del_flg",
						MCBooleanUtil.booleanToDBString(true));
			}
			else {
				up0().setStringNE("tmp_srch_ref_flg",
						MCBooleanUtil.booleanToDBString(true));
			}
		}
		
		/**
		 * 支払予定モード用の検索
		 * 
		 * @param sql
		 */
		protected void srchForPaySchdMode(MCQueryPlan sql) {
			MST_PAY_ACT_R S0T1 = MST_PAY_ACT_R.create("T1");
			MST_PAY_ACT_D_R S0T2 = MST_PAY_ACT_D_R.create("T2");
			MCDynamicSQLID ORDERBY = createDynamicSQLID("ORDERBY");

			sql.addDynamicSQLInfo(when(null)
					.orderBy(ORDERBY, S0T1.pay_act_no.asc(), S0T1.pay_act_seq.asc(), S0T2.pay_schd_no.asc()));
			String[] grpCols = {Srch02_RsltR.$pay_act_no, Srch02_RsltR.$pay_act_seq, Srch02_RsltR.$pay_schd_no};
			searchForDL(sql, up0(), down0(), grpCols);
		}
		
		/**
		 * 支払実績明細モード用の検索
		 * 
		 * @param sql
		 */
		protected void srchForPayActDMode(MCQueryPlan sql) {
			MST_PAY_ACT_R S0T1 = MST_PAY_ACT_R.create("T1");
			MST_PAY_ACT_D_R S0T2 = MST_PAY_ACT_D_R.create("T2");
			MCDynamicSQLID ORDERBY = createDynamicSQLID("ORDERBY");

			sql.addDynamicSQLInfo(when(null)
					.orderBy(ORDERBY, S0T1.pay_act_no.asc(), S0T1.pay_act_seq.asc(), S0T2.disp_seq.asc()));
			searchForDL(sql, up0(), down0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			if (isSame(up0().mode(), "PAYSCHD")) {
				editListForPaySchdMode();
			}

			filterByCnd();

			setValuesDbc(up0(), down0());

			down0().forEach(r -> {
				if (!MAC_AP_SETOFF_TYP.isFLEX(r.ap_setoff_typ())) {
					r.setoff_nm(r.setoff_nm_bp());
				}
			});
		}

		/**
		 * 絞り込みを行い下り電文再編集
		 */
		protected void filterByCnd() {
			// 検索条件に合致するレコードを抽出して下り電文に再セットト
			MCList<Srch02_RsltR> filterL = createSrch02_RsltL();
			
			String[] cndTrdDRmrksL = MCStringUtil.arrayValueSplit(up0().trd_d_rmrks());		// 取引明細備考
			String[] cndIntrDRmrksL = MCStringUtil.arrayValueSplit(up0().intr_d_rmrks());	// 内部明細備考
			String[] cndDtlSub1L = MCStringUtil.arrayValueSplit(up0().dtl_sub_char1());		// 明細予備１
			String[] cndDtlSub2L = MCStringUtil.arrayValueSplit(up0().dtl_sub_char2());		// 明細予備２
			String[] cndDtlSub3L = MCStringUtil.arrayValueSplit(up0().dtl_sub_char3());		// 明細予備３
			
			for (Srch02_RsltR downR : down0()) {
				if(!chkCnd(cndTrdDRmrksL, downR.trd_d_rmrks())) {
					continue;
				}
				if(!chkCnd(cndIntrDRmrksL, downR.intr_d_rmrks())) {
					continue;
				}
				if(!chkCnd(cndDtlSub1L, downR.dtl_sub_char1())) {
					continue;
				}
				if(!chkCnd(cndDtlSub2L, downR.dtl_sub_char2())) {
					continue;
				}
				if(!chkCnd(cndDtlSub3L, downR.dtl_sub_char3())) {
					continue;
				}
				filterL.add(downR);
			}
			
			down0().setAll(filterL);
			
			if (isSame(up0().mode(), "PAYSCHD")) {
				down0().sort(Srch02_RsltR.$pay_act_no, Srch02_RsltR.$pay_act_seq, Srch02_RsltR.$pay_schd_no);
			}
			else {
				down0().sort(Srch02_RsltR.$pay_act_no, Srch02_RsltR.$pay_act_seq, Srch02_RsltR.$disp_seq);
			}
		}

		/**
		 * 検索条件に合致するかチェック
		 * @param cndL 検索条件文字列リスト
		 * @param tgtStr 比較対象文字列
		 * @return
		 */
		protected boolean chkCnd(String[] cndL, String tgtStr) {
			if (cndL.length == 0) {
				return true;
			}

			for (String cndR : cndL) {
				if (isLike(tgtStr, cndR)) {
					return true;
				}
			}

			return false;
		}

		/**
		 * 支払予定モード用の下り電文編集
		 */
		protected void editListForPaySchdMode() {
			MCList<Srch02_RsltR> newDownL = createSrch02_RsltL();
			MCList<Srch02_RsltR>[] groupL = down0().groupList(Srch02_RsltR.$pay_act_no,
					Srch02_RsltR.$pay_act_seq, Srch02_RsltR.$pay_schd_no,
					Srch02_RsltR.$ap_sttl_cd, Srch02_RsltR.$trd_cur_com_paid_tax_cd);

			for (MCList<Srch02_RsltR> l : groupL) {
				if (l.size() > 1 && !isNull(l.get(0).pay_schd_no())) {
					Srch02_RsltR down = l.get(0);

					down.multi_act_d_flg(true);
					editDtlRmrks(down, l);
					setTotalAmt(down, l);
					down.disp_seq((MCNumber) l.min(Srch02_RsltR.$disp_seq));

					newDownL.add(down);
				}
				else {
					newDownL.addAll(l);
				}
			}
			
			down0().setAll(newDownL);
		}

		/**
		 * 明細の備考がリスト内で異なる場合に下り電文にnullを設定する
		 * 
		 * @param down 下り電文
		 * @param l リスト
		 */
		protected void editDtlRmrks(Srch02_RsltR down, MCList<Srch02_RsltR> l) {
			String[] rmrksCols = new String[] {
					Srch02_RsltR.$trd_d_rmrks, Srch02_RsltR.$intr_d_rmrks,
					Srch02_RsltR.$dtl_sub_char1, Srch02_RsltR.$dtl_sub_char2,
					Srch02_RsltR.$dtl_sub_char3, Srch02_RsltR.$pay_ntc_d_print_rmrks
			};

			for (String col : rmrksCols) {
				if (!isSameValues(l, col)) {
					down.setString(col, null);
				}
			}
		}

		/**
		 * リスト内の指定されたカラムの値が全て同じ場合にtrueを返す
		 * 
		 * @param l リスト
		 * @param col カラム名
		 * @return
		 */
		protected boolean isSameValues(MCList<Srch02_RsltR> l, String col) {
			String v = l.get(0).getString(col);
			for (int i = 1; i < l.size(); i++) {
				if (!isSame(v, l.get(i).getString(col))) {
					return false;
				}
			}
			return true;
		}

		/**
		 * 下り電文に合計金額を設定する
		 * 
		 * @param down 下り電文
		 * @param l リスト
		 */
		protected void setTotalAmt(Srch02_RsltR down, MCList<Srch02_RsltR> l) {
			String[] amtCols = new String[] {
					Srch02_RsltR.$trd_cur_amt, Srch02_RsltR.$trd_cur_com_paid_amt,
					Srch02_RsltR.$trd_cur_com_paid_tax_amt, Srch02_RsltR.$base_cur_amt,
					Srch02_RsltR.$base_cur_com_paid_tax_amt
			};

			for (String col : amtCols) {
				down.setNumber(col, l.sum(col));
			}
		}
	}
	
	/**
	 * Srch03オペレーション.<p>
	 *
	 * 支払実績を検索する<br>
	 */
	public class Srch03 extends MSBHL_PayActListReg_MC_A.Srch03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			String[] grpCols = {Srch02_RsltR.$pay_act_no, Srch02_RsltR.$pay_act_seq};
			searchForDL(MSBHL0100_MST_PAY_ACT_S03(), up0(), down0(), grpCols);
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			setValuesDbc(up0(), down0());
			
			MCList<Srch02_RsltR> d0 = MCList.create(Srch02_RsltR.class);
			Srch02_RsltR hdrR = null;
			for (Srch02_RsltR r : down0()) {
				if (isNull(hdrR) || !isSame(r.pay_act_no(), hdrR.pay_act_no())) {
					hdrR = r;
					d0.add(r);
					continue;
				}
				hdrR.trd_cur_amt(hdrR.trd_cur_amt().add(r.trd_cur_amt()));
				hdrR.base_cur_amt(hdrR.base_cur_amt().add(r.base_cur_amt()));
				if (!hdrR.multi_act_d_flg() && !isSame(r.sw_to_wrk_no(), hdrR.sw_to_wrk_no())) {
					// 振替先が複数（振替元の案件が複数で、かつ案件を引き継ぐ場合に複数がオンになる）
					hdrR.multi_act_d_flg(true);
					hdrR.sw_to_wrk_no(null);
					hdrR.sw_to_wrk_nm(null);
				}
			}
			down0().setAll(d0);
		}
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 支払実績を登録する<br>
	 */
	public class Ins01 extends MSBHL_PayActListReg_MC_A.Ins01 {
		/**
		 * 支払実績登録サービスのヘッダ
		 */
		protected MCList<PayAct_Chk01_HdrR> _payActHdr;
		
		/**
		 * 支払実績登録サービスの明細
		 */
		protected MCList<PayAct_Chk01_DtlR> _payActDtl;

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			crrctData(up0());
			
			List<MCList<Ins01_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Ins01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Ins01_RsltR> up0L = ((MCList<Ins01_RsltR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
		
		/**
		 * データ補完
		 * @param list
		 */
		protected void crrctData(MCList<Ins01_RsltR> list) {
			MSW_PAY_SCHD_KEY_R w = MSW_PAY_SCHD_KEY_R.create("W");
			MST_PAY_CHK_R pay_chk = MST_PAY_CHK_R.create("PAY_CHK");
			MAM_BP_R bsppl = MAM_BP_R.create("BSPPL");
			MCList<MST_PAY_SCHD_R> paySchdL = MCList.create(MST_PAY_SCHD_R.class);
			list.forEach(r -> {
				MST_PAY_SCHD_R paySchdR = paySchdL.createRow();
				paySchdR.pay_schd_no(r.getString(Ins01_RsltR.$pay_schd_no));
				paySchdL.add(paySchdR);
			});
			MST_PAY_SCHD_R t = MST_PAY_SCHD_R.create("T");
			MCQueryApiBuilder paySchdL_bldr = MCQueryApiBuilder.create(t);
			dbWkDelete("MSBHL0100_MSW_PAY_SCHD_D01", paySchdL_bldr.getBaseDbc());
			dbWkInsert("MSBHL0100_MSW_PAY_SCHD_I01", paySchdL, paySchdL_bldr.getBaseDbc());
			
			paySchdL_bldr.setSelect(t.pay_schd_no, bsppl.psppl_cd, pay_chk.bsppl_cd);
			paySchdL_bldr.addInnerJoin(w, bracket(t.pay_schd_no.eq(w.pay_schd_no)));
			paySchdL_bldr.addInnerJoin(pay_chk, bracket(pay_chk.pay_chk_mng_no.eq(t.pay_chk_mng_no)));
			paySchdL_bldr.addLeftOuterJoin(bsppl, bracket(pay_chk.bsppl_cd.eq(bsppl.bp_cd)));
			dbSelect("MSBHL0100_MST_PAY_SCHD_S01", paySchdL, paySchdL_bldr);
			
			dbWkDelete("MSBHL0100_MSW_PAY_SCHD_D02", paySchdL_bldr.getBaseDbc());
			
			MCIndexKey idxKey = paySchdL.createIndex(MST_PAY_SCHD_R.$pay_schd_no);
			
			for (Ins01_RsltR dtlR : list) {
				MCList<MST_PAY_SCHD_R> tmpL = paySchdL.subList(idxKey, dtlR.pay_schd_no());
				dtlR.psppl_cd(tmpL.get(0).getStringNE("psppl_cd"));
				dtlR.bsppl_cd(tmpL.get(0).getStringNE("bsppl_cd"));
			}
			
			setApCredCd(list);
		}
		
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				down0().setAll(up0());
			}
		}
		
		protected void handleSuccess(MCList<Ins01_RsltR> l) {
			dbTran().commit();
			// メッセージプールに格納されているCauseRow(エラーとなっている行)を取得する
			MCMessageList errl = MCMessagePool.getMessageList();
			MCList<MCRow> el = MCList.create(MCRow.class);
			errl.forEach(m -> {
				el.add(m.getCauseRow());
			});
			l.forEach(r -> {
				if (r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
					if (!hasMessage(r, el)) {
						MCMessagePool.add(new MCMessage(r, null, MSBHL0009, toDispGUIIndex(r)));
					}
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			});
		}
		
		protected void handleEx(Exception e, MCList<Ins01_RsltR> l) {
			dbTran().rollback();
			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException) e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Ins01_RsltR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		@Override
		protected void doIt() {
			setupUp();
			callPayActChk01();
			callPayActUpd01();
		}
		
		/**
		 * 初期化処理
		 */
		protected void setupUp() {
			setupList();
			up0().setString(Ins01_RsltR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
			setPegNo(up0());
			calcComPaidAmt();
		}
		
		/**
		 * 上り電文に支払予定などから値を取得して設定する
		 */
		protected void setupList() {
			MCList<Ins01_RsltR> paySchdL = srchPaySchd();
			MCIndexKey idxKey = paySchdL.createIndex(Ins01_RsltR.$pay_schd_no);
			MCList<Ins01_RsltR> newUp0L = createIns01_RsltL();
			for (Ins01_RsltR r : up0()) {
				MCList<Ins01_RsltR> paySchdSub = paySchdL.subList(idxKey, r.pay_schd_no());
				if (paySchdSub.isEmpty()) {
					newUp0L.add(r);
				}
				else {
					for (Ins01_RsltR paySchd : paySchdSub) {
						copy(paySchd, r, createMap_Ins01_RsltR_Ins01_RsltR());
						newUp0L.add(paySchd);
					}
				}
			}
			up0().setAll(newUp0L);
		}

		/**
		 * 支払予定を検索する
		 * 
		 * @return
		 */
		protected MCList<Ins01_RsltR> srchPaySchd() {
			MCList<MST_PAY_SCHD_R> paySchdL = MCList.create(MST_PAY_SCHD_R.class);
			up0().forEach(r -> {
				MST_PAY_SCHD_R paySchdR = paySchdL.createRow();
				paySchdR.pay_schd_no(r.pay_schd_no());
				paySchdL.add(paySchdR);
			});
			MCQueryApiBuilder paySchdL_bldr = MCQueryApiBuilder.create(MST_PAY_SCHD_R.create("T"));
			dbWkDelete("MSBHL0100_MSW_PAY_SCHD_D03", paySchdL_bldr.getBaseDbc());
			dbWkInsert("MSBHL0100_MSW_PAY_SCHD_I02", paySchdL, paySchdL_bldr.getBaseDbc());
			
			MCList<Ins01_RsltR> ret = createIns01_RsltL();
			executeQuery(ret, MSBHL0100_MST_PAY_SCHD_S02());
			
			dbWkDelete("MSBHL0100_MSW_PAY_SCHD_D04", paySchdL_bldr.getBaseDbc());
			
			return ret;
		}

		/**
		 * 手数料の金額を再計算する
		 */
		protected void calcComPaidAmt() {
			up0().forEach(r -> {
				if (!isNull(r.trd_cur_amt()) && MAC_AP_STTL_TYP.is_com_paid(r.ap_sttl_typ())
						&& !isSame(r.trd_cur_com_paid_tax_cd(),
								r.old_trd_cur_com_paid_tax_cd())) {
					MAM_TAX_R taxR = MSBHL_ApUtil.getTax(r.trd_cur_com_paid_tax_cd());
					if (!isNull(taxR.tax_cd())) {
						MAM_CUR_R curR = MSBHL_ApUtil.getCur(r.trd_cur_cd());
						MCNumber taxAmt = MAUCL_AmtUtil.getTaxAmt(r.trd_cur_amt(),
								taxR.tax_rate(), curR.amt_dec_place(),
								getCo().com_paid_tax_rnd_typ(), taxR.inc_tax_flg());
						r.trd_cur_com_paid_amt(r.trd_cur_amt().subtract(taxAmt));
					}
				}
			});
		}

		/**
		 * 支払実績登録サービスの支払実績更新前チェックを実行する
		 */
		protected void callPayActChk01() {
			MSBHL_PayActRegService.PayAct_Chk01 chk01 = MSBHL_PayActRegService.crtPayAct_Chk01();
			_payActHdr = chk01.createPayAct_Chk01_HdrL();
			_payActDtl = chk01.createPayAct_Chk01_DtlL();

			MCRowMapper<PayAct_Chk01_HdrR, Ins01_RsltR> hdrMapper = createMap_PayAct_Chk01_HdrR_Ins01_RsltR();
			MCRowMapper<PayAct_Chk01_DtlR, Ins01_RsltR> dtlMapper = createMap_PayAct_Chk01_DtlR_Ins01_RsltR();
			int i = 1;
			for (MCList<Ins01_RsltR> l : createGroupList()) {
				l.setNumber(Ins01_RsltR.$hdr_peg_no, i);
				PayAct_Chk01_HdrR hdr = _payActHdr.add();
				copy(hdr, l.get(0), hdrMapper);
				
				addAll(_payActDtl, l, dtlMapper);
				i++;
			}

			chk01.up0().addAll(_payActHdr);
			chk01.up1().addAll(_payActDtl);
			chk01.exec();

			copyErrFlg(up0(), chk01.down1());
		}
		
		/**
		 * 上り電文を支払実績登録サービスのヘッダ単位に分割する
		 * 
		 * @return
		 */
		protected List<MCList<Ins01_RsltR>> createGroupList() {
			// 支払実績のヘッダ項目で分割
			MCList<Ins01_RsltR>[] hdrGrpL = up0().groupList(Ins01_RsltR.$pay_act_dt,
					Ins01_RsltR.$ac_dt, Ins01_RsltR.$psppl_cd, Ins01_RsltR.$pay_usr_cd,
					Ins01_RsltR.$pay_dpt_cd, Ins01_RsltR.$trd_cur_cd, Ins01_RsltR.$xrate);

			List<MCList<Ins01_RsltR>> ret = new ArrayList<>();
			for (MCList<Ins01_RsltR> upGrpL : hdrGrpL) {
				setApSttlCdGrp(upGrpL);
				// グループ化用の債務決済方法ＣＤで分割
				for (MCList<Ins01_RsltR> sttlL: upGrpL.groupList(Ins01_RsltR.$ap_sttl_cd_grp)) {
					// 債務決済方法の関連情報で分割
					for (MCList<Ins01_RsltR> l : splitSttlInfo(sttlL)) {
						ret.add(l);
					}
				}
			}
			return ret;
		}
		
		/**
		 * リストを分割するための情報を設定する
		 * 
		 * @param upL リスト
		 */
		protected void setApSttlCdGrp(MCList<Ins01_RsltR> upL) {
			upL.sort(Ins01_RsltR.$ap_sttl_cd);
			MCIndexKey typIdx = upL.createIndex(Ins01_RsltR.$ap_sttl_typ);
			
			Ins01_RsltR acnt01 = upL.getFirst(typIdx, MAC_AP_STTL_TYP.ACNT.value());
			Ins01_RsltR cash01 = upL.getFirst(typIdx, MAC_AP_STTL_TYP.CASH.value());
			MCList<Ins01_RsltR> setoffCP = upL.subList(typIdx, MAC_AP_STTL_TYP.SETOFF.value());
			if (!isNull(acnt01)) {
				// 預金（手数料）は預金と同じグループ
				MCList<Ins01_RsltR> acntCP = upL.subList(typIdx, MAC_AP_STTL_TYP.ACNT_COM_PAID.value());
				acntCP.setString(Ins01_RsltR.$ap_sttl_cd_grp, acnt01.ap_sttl_cd_grp());
				setoffCP.setString(Ins01_RsltR.$ap_sttl_cd_grp, acnt01.ap_sttl_cd_grp());
			}
			if (!isNull(cash01)) {
				// 現金（手数料）は現金と同じグループ
				MCList<Ins01_RsltR> cashCP = upL.subList(typIdx, MAC_AP_STTL_TYP.CASH_COM_PAID.value());
				cashCP.setString(Ins01_RsltR.$ap_sttl_cd_grp, cash01.ap_sttl_cd_grp());
				if (isNull(acnt01)) {
					setoffCP.setString(Ins01_RsltR.$ap_sttl_cd_grp, cash01.ap_sttl_cd_grp());
				}
			}
			if (isNull(acnt01) && isNull(cash01)) {
				// 相殺は預金、現金、手形の順で存在するグループに含める
				Ins01_RsltR note01 = upL.getFirst(typIdx, MAC_AP_STTL_TYP.NOTE.value());
				if (!isNull(note01)) {
					setoffCP.setString(Ins01_RsltR.$ap_sttl_cd_grp, note01.ap_sttl_cd_grp());
				}
			}
		}
		
		/**
		 * 債務決済方法の関連情報でリストを分割する
		 * 
		 * @param l リスト
		 * @return
		 */
		protected MCList<Ins01_RsltR>[] splitSttlInfo(MCList<Ins01_RsltR> l) {
			if (MAC_AP_STTL_TYP.isSETOFF(l.get(0).ap_sttl_typ())
					&& isSame(l.get(0).ap_sttl_cd(), l.get(0).ap_sttl_cd_grp())) {
				// 相殺のみのグループは相殺情報で分割
				return l.groupList(
						Ins01_RsltR.$ap_setoff_typ, Ins01_RsltR.$setoff_cd,
						Ins01_RsltR.$setoff_nm, Ins01_RsltR.$so_dpt_cd);
			}
			else {
				MCList<Ins01_RsltR> noSetoffL = l
						.subList(r -> !MAC_AP_STTL_TYP.isSETOFF(r.ap_sttl_typ()));

				// 相殺を除く行を債務決済方法の関連情報で分割
				MCList<Ins01_RsltR>[] ret = noSetoffL.groupList(Ins01_RsltR.$bank_ac_cd,
						Ins01_RsltR.$pay_bank_ac_cd, Ins01_RsltR.$note_no,
						Ins01_RsltR.$note_typ, Ins01_RsltR.$note_rsn_cd,
						Ins01_RsltR.$draw_dt, Ins01_RsltR.$due_dt, Ins01_RsltR.$note_days,
						Ins01_RsltR.$drawer_nm, Ins01_RsltR.$draw_bank_cd,
						Ins01_RsltR.$draw_branch_cd, Ins01_RsltR.$endrsr,
						Ins01_RsltR.$accptr);

				// 相殺を1つ目のグループに追加（追加するグループはどれでもよい）
				ret[0].addAll(l.subList(Ins01_RsltR.$ap_sttl_typ,
						MAC_AP_STTL_TYP.SETOFF.value()));

				return ret;
			}
		}
		
		/**
		 * 支払実績登録サービスの支払実績更新を実行する
		 */
		protected void callPayActUpd01() {
			MCList<PayAct_Chk01_HdrR> hdrL = getChkList(_payActHdr);
			if (!hdrL.isEmpty()) {
				MCList<PayAct_Chk01_DtlR> dtlL = getChkList(_payActDtl);
				MSBHL_PayActRegService.PayAct_Upd01 upd01 = MSBHL_PayActRegService.crtPayAct_Upd01();
				upd01.up0().addAll(hdrL);
				upd01.up1().addAll(dtlL);
				upd01.exec();

				String[] destCols = {
						Ins01_RsltR.$ac_ym, Ins01_RsltR.$pay_act_no,
						Ins01_RsltR.$pay_act_rev, Ins01_RsltR.$pay_act_seq
				};
				String[] srcCols = {
						PayAct_Chk01_HdrR.$ac_ym, PayAct_Chk01_HdrR.$pay_act_no,
						PayAct_Chk01_HdrR.$pay_act_rev, PayAct_Chk01_HdrR.$pay_act_seq
				};
				
				copyByPegNo(up0(), upd01.down0(), Ins01_RsltR.$hdr_peg_no, destCols,
						PayAct_Chk01_HdrR.$hdr_peg_no, srcCols);
			}
		}
		
		protected Map_Ins01_RsltR_Ins01_RsltR<Ins01_RsltR,Ins01_RsltR> createMap_Ins01_RsltR_Ins01_RsltR() {
			return new Map_Ins01_RsltR_Ins01_RsltR<Ins01_RsltR, Ins01_RsltR>();
		}

		public class Map_Ins01_RsltR_Ins01_RsltR<D extends Ins01_RsltR, S extends Ins01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ins01_RsltR.$peg_no, Ins01_RsltR.$peg_no);
				addColumnPathMap(Ins01_RsltR.$pay_schd_no, Ins01_RsltR.$pay_schd_no);
				addColumnPathMap(Ins01_RsltR.$pay_act_dt, Ins01_RsltR.$pay_act_dt);
				addColumnPathMap(Ins01_RsltR.$ac_dt, Ins01_RsltR.$ac_dt);
				addColumnPathMap(Ins01_RsltR.$pay_basis_dt, Ins01_RsltR.$pay_basis_dt);
				addColumnPathMap(Ins01_RsltR.$pay_usr_cd, Ins01_RsltR.$pay_usr_cd);
				addColumnPathMap(Ins01_RsltR.$pay_dpt_cd, Ins01_RsltR.$pay_dpt_cd);
				addColumnPathMap(Ins01_RsltR.$xrate, Ins01_RsltR.$xrate);
				addColumnPathMap(Ins01_RsltR.$trd_cur_com_paid_tax_cd, Ins01_RsltR.$trd_cur_com_paid_tax_cd);
				addColumnPathMap(Ins01_RsltR.$trd_d_rmrks, Ins01_RsltR.$trd_d_rmrks);
				addColumnPathMap(Ins01_RsltR.$pay_basis_dt, Ins01_RsltR.$pay_basis_dt);
				addColumnPathMap(Ins01_RsltR.$pay_ntc_d_print_rmrks, Ins01_RsltR.$pay_ntc_d_print_rmrks);
				addColumnPathMap(Ins01_RsltR.$intr_d_rmrks, Ins01_RsltR.$intr_d_rmrks);
				addColumnPathMap(Ins01_RsltR.$dtl_sub_char1, Ins01_RsltR.$dtl_sub_char1);
				addColumnPathMap(Ins01_RsltR.$dtl_sub_char2, Ins01_RsltR.$dtl_sub_char2);
				addColumnPathMap(Ins01_RsltR.$dtl_sub_char3, Ins01_RsltR.$dtl_sub_char3);
				addColumnPathMap(Ins01_RsltR.$pay_chk_upd_cntr, Ins01_RsltR.$pay_chk_upd_cntr);
			}
		}
		
		protected Map_PayAct_Chk01_HdrR_Ins01_RsltR<PayAct_Chk01_HdrR,Ins01_RsltR> createMap_PayAct_Chk01_HdrR_Ins01_RsltR() {
			return new Map_PayAct_Chk01_HdrR_Ins01_RsltR<PayAct_Chk01_HdrR, Ins01_RsltR>();
		}

		public class Map_PayAct_Chk01_HdrR_Ins01_RsltR<D extends PayAct_Chk01_HdrR, S extends Ins01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PayAct_Chk01_HdrR.$hdr_peg_no, Ins01_RsltR.$hdr_peg_no);
				addColumnPathMap(PayAct_Chk01_HdrR.$data_crud_typ, Ins01_RsltR.$data_crud_typ);
				addColumnPathMap(PayAct_Chk01_HdrR.$pay_act_no, Ins01_RsltR.$pay_act_no);
				addColumnPathMap(PayAct_Chk01_HdrR.$pay_act_seq, Ins01_RsltR.$pay_act_seq);
				addColumnPathMap(PayAct_Chk01_HdrR.$psppl_cd, Ins01_RsltR.$psppl_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$pay_dpt_cd, Ins01_RsltR.$pay_dpt_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$pay_usr_cd, Ins01_RsltR.$pay_usr_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$pay_act_dt, Ins01_RsltR.$pay_act_dt);
				addColumnPathMap(PayAct_Chk01_HdrR.$ac_dt, Ins01_RsltR.$ac_dt);
				addColumnPathMap(PayAct_Chk01_HdrR.$pay_basis_dt, Ins01_RsltR.$pay_basis_dt);
				addColumnPathMap(PayAct_Chk01_HdrR.$trd_cur_cd, Ins01_RsltR.$trd_cur_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$xrate, Ins01_RsltR.$xrate);
				addColumnPathMap(PayAct_Chk01_HdrR.$ap_sttl_cd, Ins01_RsltR.$ap_sttl_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$bank_ac_cd, Ins01_RsltR.$bank_ac_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$pay_bank_ac_cd, Ins01_RsltR.$pay_bank_ac_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$ap_setoff_typ, Ins01_RsltR.$ap_setoff_typ);
				addColumnPathMap(PayAct_Chk01_HdrR.$setoff_cd, Ins01_RsltR.$setoff_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$setoff_nm, Ins01_RsltR.$setoff_nm);
				addColumnPathMap(PayAct_Chk01_HdrR.$so_dpt_cd, Ins01_RsltR.$so_dpt_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$note_no, Ins01_RsltR.$note_no);
				addColumnPathMap(PayAct_Chk01_HdrR.$note_typ, Ins01_RsltR.$note_typ);
				addColumnPathMap(PayAct_Chk01_HdrR.$note_rsn_cd, Ins01_RsltR.$note_rsn_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$draw_dt, Ins01_RsltR.$draw_dt);
				addColumnPathMap(PayAct_Chk01_HdrR.$due_dt, Ins01_RsltR.$due_dt);
				addColumnPathMap(PayAct_Chk01_HdrR.$note_days, Ins01_RsltR.$note_days);
				addColumnPathMap(PayAct_Chk01_HdrR.$drawer_nm, Ins01_RsltR.$drawer_nm);
				addColumnPathMap(PayAct_Chk01_HdrR.$draw_bank_cd, Ins01_RsltR.$draw_bank_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$draw_branch_cd, Ins01_RsltR.$draw_branch_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$endrsr, Ins01_RsltR.$endrsr);
				addColumnPathMap(PayAct_Chk01_HdrR.$accptr, Ins01_RsltR.$accptr);
			}
		}

		protected Map_PayAct_Chk01_DtlR_Ins01_RsltR<PayAct_Chk01_DtlR, Ins01_RsltR> createMap_PayAct_Chk01_DtlR_Ins01_RsltR() {
			return new Map_PayAct_Chk01_DtlR_Ins01_RsltR<PayAct_Chk01_DtlR, Ins01_RsltR>();
		}

		public class Map_PayAct_Chk01_DtlR_Ins01_RsltR<D extends PayAct_Chk01_DtlR, S extends Ins01_RsltR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PayAct_Chk01_DtlR.$peg_no, Ins01_RsltR.$peg_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$hdr_peg_no, Ins01_RsltR.$hdr_peg_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$data_crud_typ, Ins01_RsltR.$data_crud_typ);
				addColumnPathMap(PayAct_Chk01_DtlR.$ap_appl_schd_no, Ins01_RsltR.$ap_appl_schd_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$pay_chk_mng_no, Ins01_RsltR.$pay_chk_mng_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$ap_sttl_cd, Ins01_RsltR.$ap_sttl_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$bank_ac_cd, Ins01_RsltR.$bank_ac_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$pay_bank_ac_cd, Ins01_RsltR.$pay_bank_ac_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$trd_cur_com_paid_tax_cd, Ins01_RsltR.$trd_cur_com_paid_tax_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$ap_setoff_typ, Ins01_RsltR.$ap_setoff_typ);
				addColumnPathMap(PayAct_Chk01_DtlR.$setoff_cd, Ins01_RsltR.$setoff_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$setoff_nm, Ins01_RsltR.$setoff_nm);
				addColumnPathMap(PayAct_Chk01_DtlR.$so_dpt_cd, Ins01_RsltR.$so_dpt_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$trd_cur_amt, Ins01_RsltR.$trd_cur_amt);
				addColumnPathMap(PayAct_Chk01_DtlR.$bsppl_cd, Ins01_RsltR.$bsppl_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$bsppl_dpt_cd, Ins01_RsltR.$bsppl_dpt_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$asppl_cd, Ins01_RsltR.$asppl_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$ap_dpt_cd, Ins01_RsltR.$ap_dpt_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$purc_act_no, Ins01_RsltR.$purc_act_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$rcpt_iv_mng_no, Ins01_RsltR.$rcpt_iv_mng_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$rcpt_iv_no, Ins01_RsltR.$rcpt_iv_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$wrk_no, Ins01_RsltR.$wrk_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$ap_typ, Ins01_RsltR.$ap_typ);
				addColumnPathMap(PayAct_Chk01_DtlR.$trd_d_rmrks, Ins01_RsltR.$trd_d_rmrks);
				addColumnPathMap(PayAct_Chk01_DtlR.$pay_ntc_d_print_rmrks, Ins01_RsltR.$pay_ntc_d_print_rmrks);
				addColumnPathMap(PayAct_Chk01_DtlR.$intr_d_rmrks, Ins01_RsltR.$intr_d_rmrks);
				addColumnPathMap(PayAct_Chk01_DtlR.$pay_chk_upd_cntr, Ins01_RsltR.$pay_chk_upd_cntr);
				addColumnPathMap(PayAct_Chk01_DtlR.$sub_char1, Ins01_RsltR.$dtl_sub_char1);
				addColumnPathMap(PayAct_Chk01_DtlR.$sub_char2, Ins01_RsltR.$dtl_sub_char2);
				addColumnPathMap(PayAct_Chk01_DtlR.$sub_char3, Ins01_RsltR.$dtl_sub_char3);
			}
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 支払実績を取り消す<br>
	 */
	public class Del01 extends MSBHL_PayActListReg_MC_A.Del01 {
		/**
		 * 支払実績登録サービスのヘッダ
		 */
		protected MCList<PayAct_Chk01_HdrR> _payActHdr;
		
		/**
		 * 支払実績登録サービスの明細
		 */
		protected MCList<PayAct_Chk01_DtlR> _payActDtl;

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			crrctData(up0());
			
			List<MCList<Del01_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Del01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Del01_RsltR> up0L = ((MCList<Del01_RsltR>)ope.up(0));
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
		
		/**
		 * データ補完
		 * @param list
		 */
		protected void crrctData(MCList<Del01_RsltR> list) {
			MSW_PAY_ACT_KEY_R w = MSW_PAY_ACT_KEY_R.create("W");
			MCList<MST_PAY_ACT_R> payActL = MCList.create(MST_PAY_ACT_R.class);
			up0().forEach(r -> {
				MST_PAY_ACT_R payActR = payActL.createRow();
				payActR.pay_act_no(r.pay_act_no());
				payActR.pay_act_seq(r.pay_act_seq());
				payActL.add(payActR);
			});
			MST_PAY_ACT_R t = MST_PAY_ACT_R.create("T");
			MCQueryApiBuilder payActL_bldr = MCQueryApiBuilder.create(t);
			dbWkDelete("MSBHL0100_MSW_PAY_ACT_D01", payActL_bldr.getBaseDbc());
			dbWkInsert("MSBHL0100_MSW_PAY_ACT_I01", payActL, payActL_bldr.getBaseDbc());
			
			payActL_bldr.setSelect(t.pay_act_no, t.psppl_cd);
			payActL_bldr.addInnerJoin(w, bracket(t.pay_act_no.eq(w.pay_act_no)));
			dbSelect("MSBHL0100_MST_PAY_ACT_S01", payActL, payActL_bldr);
			
			dbWkDelete("MSBHL0100_MSW_PAY_ACT_D02", payActL_bldr.getBaseDbc());
						
			MCIndexKey idxKey = payActL.createIndex(MST_PAY_ACT_R.$pay_act_no);
			
			for (Del01_RsltR dtlR : list) {
				MST_PAY_ACT_R tmp = payActL.getFirst(idxKey, dtlR.pay_act_no());
				if (tmp != null) {
					dtlR.psppl_cd(tmp.getStringNE("psppl_cd"));
				}
			}
		}
		
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				down0().setAll(up0());
			}
		}
		
		protected void handleSuccess(MCList<Del01_RsltR> l) {
			dbTran().commit();
			// メッセージプールに格納されているCauseRow(エラーとなっている行)を取得する
			MCMessageList errl = MCMessagePool.getMessageList();
			MCList<MCRow> el = MCList.create(MCRow.class);
			errl.forEach(m -> {
				el.add(m.getCauseRow());
			});
			
			l.forEach(r -> {
				if (r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
					if (!hasMessage(r, el)) {
						MCMessagePool.add(new MCMessage(r, null, MSBHL0009, toDispGUIIndex(r)));
					}
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			});
		}
		
		protected void handleEx(Exception e, MCList<Del01_RsltR> l) {
			dbTran().rollback();
			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException) e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Del01_RsltR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		@Override
		protected void doIt() {
			setupUp();
			callPayActChk01();
			callPayActUpd01();
		}
		
		/**
		 * 初期化処理
		 */
		protected void setupUp() {
			setPegNo(up0());
		}

		/**
		 * 支払実績登録サービスの支払実績更新前チェックを実行する
		 */
		protected void callPayActChk01() {
			MSBHL_PayActRegService.PayAct_Chk01 chk01 = MSBHL_PayActRegService.crtPayAct_Chk01();
			_payActHdr = chk01.createPayAct_Chk01_HdrL();
			_payActDtl = chk01.createPayAct_Chk01_DtlL();

			setupPayActChk01Param(setupList());

			chk01.up0().addAll(_payActHdr);
			chk01.up1().addAll(_payActDtl);
			chk01.exec();

			copyErrFlg(up0(), chk01.down1());
		}
		
		/**
		 * 上り電文に支払実績ヘッダなどから値を取得して設定する
		 */
		protected MCList<Del01_RsltR> setupList() {
			MCList<Del01_RsltR> payActL = srchPayAct();

			MCIndexKey payActIdx = payActL.createIndex(Del01_RsltR.$pay_act_no);
			MCIndexKey up0Idx = up0().createIndex(Del01_RsltR.$pay_act_no);
			MCList<Del01_RsltR> ret = createDel01_RsltL();
			for (Del01_RsltR r : up0().groupBy(Del01_RsltR.$pay_act_no)) {
				MCList<Del01_RsltR> payActSub = payActL.subList(payActIdx, r.pay_act_no());
				MCList<Del01_RsltR> up0Sub = up0().subList(up0Idx, r.pay_act_no());

				setHdrDataCrudTyp(payActSub, up0Sub);
				ret.addAll(mergePayAct(payActSub, up0Sub));
			}
			return ret;
		}

		/**
		 * 支払実績を検索する
		 * 
		 * @return
		 */
		protected MCList<Del01_RsltR> srchPayAct() {
			MCList<MST_PAY_ACT_R> payActL = MCList.create(MST_PAY_ACT_R.class);
			up0().forEach(r -> {
				MST_PAY_ACT_R payActR = payActL.createRow();
				payActR.pay_act_no(r.pay_act_no());
				payActR.pay_act_seq(r.pay_act_seq());
				payActL.add(payActR);
			});
			MCQueryApiBuilder payActL_bldr = MCQueryApiBuilder.create(MST_PAY_ACT_R.create("T"));
			dbWkDelete("MSBHL0100_MSW_PAY_ACT_D03", payActL_bldr.getBaseDbc());
			dbWkInsert("MSBHL0100_MSW_PAY_ACT_I02", payActL, payActL_bldr.getBaseDbc());
			
			MCList<Del01_RsltR> ret = createDel01_RsltL();
			executeQuery(ret, MSBHL0100_MST_PAY_ACT_S02());
			
			dbWkDelete("MSBHL0100_MSW_PAY_ACT_D04", payActL_bldr.getBaseDbc());
			
			return ret;
		}
		
		protected void setHdrDataCrudTyp(MCList<Del01_RsltR> payActSub, MCList<Del01_RsltR> up0Sub) {
			String[] key = {Del01_RsltR.$pay_schd_no, Del01_RsltR.$ap_sttl_cd, Del01_RsltR.$trd_cur_com_paid_tax_cd};

			// 上り電文と支払実績の件数が同じ場合は全削除、それ以外は一部削除
			if (isSame(payActSub.groupBy(key).size(), up0Sub.groupBy(key).size())) {
				up0Sub.setString(Del01_RsltR.$hdr_data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
			}
			else {
				up0Sub.setString(Del01_RsltR.$hdr_data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value());
			}
		}
		
		
		/**
		 * 支払実績と上り電文をマージする
		 * 
		 * @param payActSub
		 * @param up0Sub
		 * @return
		 */
		protected MCList<Del01_RsltR> mergePayAct(MCList<Del01_RsltR> payActSub, MCList<Del01_RsltR> up0Sub) {
			
			if (!up0Sub.isEmpty()) {
				payActSub.setDate(Del01_RsltR.$can_ac_dt, up0Sub.get(0).can_ac_dt());
				
				MCIndexKey up0Idx = up0Sub.createIndex(Del01_RsltR.$pay_schd_no, Del01_RsltR.$ap_sttl_cd, Del01_RsltR.$trd_cur_com_paid_tax_cd);
				payActSub.forEach(r -> {
					Del01_RsltR up = up0Sub.getFirst(up0Idx, new String[] {r.pay_schd_no(), r.ap_sttl_cd(), r.trd_cur_com_paid_tax_cd()});
					if (up != null) {
						copy(r, up, createMap_Del01_RsltR_Del01_RsltR());
					}
				});
			}
			
			MCList<Del01_RsltR> newUp0L = createDel01_RsltL();
			for (MCList<Del01_RsltR> payActGrpL : payActSub.groupList(Del01_RsltR.$pay_schd_no)) {
				MCList<Del01_RsltR> up0GrpL = up0Sub.subList(Del01_RsltR.$pay_schd_no, payActGrpL.get(0).pay_schd_no());
				if (up0GrpL.isEmpty()) {
					// 一部支払の更新行
					payActGrpL.forEach(r -> {
						r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					});
				}
				else {
					payActGrpL.forEach(r -> {
						r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					});
					up0Sub.removeAll(up0GrpL);
				}
				newUp0L.addAll(payActGrpL);
			}
			if (!up0Sub.isEmpty()) {
				// 上り電文のデータが支払実績にない
				up0Sub.setString(Del01_RsltR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
				setNotExistValue(up0Sub);
				newUp0L.addAll(up0Sub);
			}
			return newUp0L;
		}
		
		/**
		 * 支払実績が存在しなかった上り電文の補完
		 */
		protected void setNotExistValue(MCList<Del01_RsltR> notExistL) {
			java.util.Map<String, MST_PAY_ACT_D_R> cache = new java.util.HashMap<>();
			MCList<MST_PAY_ACT_D_R> dbcL = MCList.create(MST_PAY_ACT_D_R.class);
			MST_PAY_ACT_D_R t = MST_PAY_ACT_D_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.pay_act_d_no, t.pay_act_d_seq, t.pay_chk_mng_no);
			dbcL_bldr.addWhereWithAnd(t.pay_schd_no.eq(bind("pay_schd_no")));

			notExistL.forEach(r -> {
				MST_PAY_ACT_D_R dbc = MST_PAY_ACT_D_R.create();
				MST_PAY_ACT_D_R payActD = cache.get(r.pay_schd_no());
				if (isNull(payActD)) {
					dbSelect("MSBHL0100_MST_PAY_ACT_D_S01", dbcL, dbcL_bldr, r);
					if (!dbcL.isEmpty()) {
						dbc = dbcL.get(0); 
					}
					payActD = dbc.clone();
					cache.put(r.pay_schd_no(), payActD);
				}

				r.pay_act_d_no(payActD.pay_act_d_no());
				r.pay_act_d_seq(payActD.pay_act_d_seq());
				r.pay_chk_mng_no(payActD.pay_chk_mng_no());
			});
		}

		/**
		 * 支払実績登録サービスの支払実績更新前チェックの上り電文を作成する
		 */
		protected void setupPayActChk01Param(MCList<Del01_RsltR> upL) {
			MCRowMapper<PayAct_Chk01_HdrR, Del01_RsltR> hdrMapper = createMap_PayAct_Chk01_HdrR_Del01_RsltR();
			MCRowMapper<PayAct_Chk01_HdrR, Del01_RsltR> hdrMapper_DEL = createMap_PayAct_Chk01_HdrR_Del01_RsltR_DEL();
			MCRowMapper<PayAct_Chk01_DtlR, Del01_RsltR> dtlMapper = createMap_PayAct_Chk01_DtlR_Del01_RsltR();
			MCRowMapper<PayAct_Chk01_DtlR, Del01_RsltR> dtlMapper_DEL = createMap_PayAct_Chk01_DtlR_Del01_RsltR_DEL();
			int i = 1;
			for (MCList<Del01_RsltR> l : upL.groupList(Del01_RsltR.$pay_act_no, Del01_RsltR.$pay_act_seq)) {
				l.setNumber(Del01_RsltR.$hdr_peg_no, i);
				Del01_RsltR upHdr = l.get(0);
				PayAct_Chk01_HdrR hdr = _payActHdr.add();
				if (MAC_DATA_CRUD_TYP.isDEL(upHdr.hdr_data_crud_typ())) {
					// 全削除
					copy(hdr, upHdr, hdrMapper_DEL);
					addAll(_payActDtl, l, dtlMapper_DEL);
				}
				else {
					// 一部削除
					copy(hdr, upHdr, hdrMapper);
					addAll(_payActDtl, l.subList(Del01_RsltR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value()), dtlMapper);
					addAll(_payActDtl, l.subList(Del01_RsltR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value()), dtlMapper_DEL);
				}
				i++;
			}
		}
		
		/**
		 * 支払実績登録サービスの支払実績更新を実行する
		 */
		protected void callPayActUpd01() {
			MCList<PayAct_Chk01_HdrR> hdrL = getChkList(_payActHdr);
			if (!hdrL.isEmpty()) {
				MCList<PayAct_Chk01_DtlR> dtlL = getChkList(_payActDtl);
				MSBHL_PayActRegService.PayAct_Upd01 upd01 = MSBHL_PayActRegService.crtPayAct_Upd01();
				upd01.up0().addAll(hdrL);
				upd01.up1().addAll(dtlL);
				upd01.exec();
			}
		}
		
		protected Map_Del01_RsltR_Del01_RsltR<Del01_RsltR,Del01_RsltR> createMap_Del01_RsltR_Del01_RsltR() {
			return new Map_Del01_RsltR_Del01_RsltR<Del01_RsltR, Del01_RsltR>();
		}

		public class Map_Del01_RsltR_Del01_RsltR<D extends Del01_RsltR, S extends Del01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Del01_RsltR.$peg_no, Del01_RsltR.$peg_no);
				addColumnPathMap(Del01_RsltR.$pay_schd_no, Del01_RsltR.$pay_schd_no);
				addColumnPathMap(Del01_RsltR.$pay_act_seq, Del01_RsltR.$pay_act_seq);
				addColumnPathMap(Del01_RsltR.$ap_sttl_cd, Del01_RsltR.$ap_sttl_cd);
				addColumnPathMap(Del01_RsltR.$trd_cur_com_paid_tax_cd, Del01_RsltR.$trd_cur_com_paid_tax_cd);
				addColumnPathMap(Del01_RsltR.$pay_chk_upd_cntr, Del01_RsltR.$pay_chk_upd_cntr);
				addColumnPathMap(Del01_RsltR.$hdr_data_crud_typ, Del01_RsltR.$hdr_data_crud_typ);
			}
		}
		
		protected Map_PayAct_Chk01_HdrR_Del01_RsltR<PayAct_Chk01_HdrR,Del01_RsltR> createMap_PayAct_Chk01_HdrR_Del01_RsltR() {
			return new Map_PayAct_Chk01_HdrR_Del01_RsltR<PayAct_Chk01_HdrR, Del01_RsltR>();
		}

		public class Map_PayAct_Chk01_HdrR_Del01_RsltR<D extends PayAct_Chk01_HdrR, S extends Del01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PayAct_Chk01_HdrR.$hdr_peg_no, Del01_RsltR.$hdr_peg_no);
				addColumnPathMap(PayAct_Chk01_HdrR.$data_crud_typ, Del01_RsltR.$hdr_data_crud_typ);
				addColumnPathMap(PayAct_Chk01_HdrR.$pay_act_no, Del01_RsltR.$pay_act_no);
				addColumnPathMap(PayAct_Chk01_HdrR.$pay_act_seq, Del01_RsltR.$pay_act_seq);
				addColumnPathMap(PayAct_Chk01_HdrR.$psppl_cd, Del01_RsltR.$psppl_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$pay_dpt_cd, Del01_RsltR.$pay_dpt_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$pay_usr_cd, Del01_RsltR.$pay_usr_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$pay_act_dt, Del01_RsltR.$pay_act_dt);
				addColumnPathMap(PayAct_Chk01_HdrR.$ac_dt, Del01_RsltR.$ac_dt);
				addColumnPathMap(PayAct_Chk01_HdrR.$can_ac_dt, Del01_RsltR.$can_ac_dt);
				addColumnPathMap(PayAct_Chk01_HdrR.$trd_cur_cd, Del01_RsltR.$trd_cur_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$xrate, Del01_RsltR.$xrate);
				addColumnPathMap(PayAct_Chk01_HdrR.$ap_sttl_cd, Del01_RsltR.$ap_sttl_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$bank_ac_cd, Del01_RsltR.$bank_ac_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$pay_bank_ac_cd, Del01_RsltR.$pay_bank_ac_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$ap_setoff_typ, Del01_RsltR.$ap_setoff_typ);
				addColumnPathMap(PayAct_Chk01_HdrR.$setoff_cd, Del01_RsltR.$setoff_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$setoff_nm, Del01_RsltR.$setoff_nm);
				addColumnPathMap(PayAct_Chk01_HdrR.$so_dpt_cd, Del01_RsltR.$so_dpt_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$trd_rmrks, Del01_RsltR.$trd_rmrks);
				addColumnPathMap(PayAct_Chk01_HdrR.$intr_rmrks, Del01_RsltR.$intr_rmrks);
				addColumnPathMap(PayAct_Chk01_HdrR.$sub_char1, Del01_RsltR.$sub_char1);
				addColumnPathMap(PayAct_Chk01_HdrR.$sub_char2, Del01_RsltR.$sub_char2);
				addColumnPathMap(PayAct_Chk01_HdrR.$sub_char3, Del01_RsltR.$sub_char3);
				addColumnPathMap(PayAct_Chk01_HdrR.$note_no, Del01_RsltR.$note_no);
				addColumnPathMap(PayAct_Chk01_HdrR.$note_typ, Del01_RsltR.$note_typ);
				addColumnPathMap(PayAct_Chk01_HdrR.$note_rsn_cd, Del01_RsltR.$note_rsn_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$draw_dt, Del01_RsltR.$draw_dt);
				addColumnPathMap(PayAct_Chk01_HdrR.$due_dt, Del01_RsltR.$due_dt);
				addColumnPathMap(PayAct_Chk01_HdrR.$note_days, Del01_RsltR.$note_days);
				addColumnPathMap(PayAct_Chk01_HdrR.$drawer_nm, Del01_RsltR.$drawer_nm);
				addColumnPathMap(PayAct_Chk01_HdrR.$draw_bank_cd, Del01_RsltR.$draw_bank_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$draw_branch_cd, Del01_RsltR.$draw_branch_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$endrsr, Del01_RsltR.$endrsr);
				addColumnPathMap(PayAct_Chk01_HdrR.$accptr, Del01_RsltR.$accptr);
				addColumnPathMap(PayAct_Chk01_HdrR.$note_sub_char1, Del01_RsltR.$note_sub_char1);
				addColumnPathMap(PayAct_Chk01_HdrR.$note_sub_char2, Del01_RsltR.$note_sub_char2);
				addColumnPathMap(PayAct_Chk01_HdrR.$note_sub_char3, Del01_RsltR.$note_sub_char3);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
		}
		
		protected Map_PayAct_Chk01_HdrR_Del01_RsltR_DEL<PayAct_Chk01_HdrR,Del01_RsltR> createMap_PayAct_Chk01_HdrR_Del01_RsltR_DEL() {
			return new Map_PayAct_Chk01_HdrR_Del01_RsltR_DEL<PayAct_Chk01_HdrR, Del01_RsltR>();
		}

		public class Map_PayAct_Chk01_HdrR_Del01_RsltR_DEL<D extends PayAct_Chk01_HdrR, S extends Del01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PayAct_Chk01_HdrR.$hdr_peg_no, Del01_RsltR.$hdr_peg_no);
				addColumnPathMap(PayAct_Chk01_HdrR.$data_crud_typ, Del01_RsltR.$hdr_data_crud_typ);
				addColumnPathMap(PayAct_Chk01_HdrR.$pay_act_no, Del01_RsltR.$pay_act_no);
				addColumnPathMap(PayAct_Chk01_HdrR.$pay_act_seq, Del01_RsltR.$pay_act_seq);
				addColumnPathMap(PayAct_Chk01_HdrR.$psppl_cd, Del01_RsltR.$psppl_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$can_ac_dt, Del01_RsltR.$can_ac_dt);
			}
		}
		
		protected Map_PayAct_Chk01_DtlR_Del01_RsltR<PayAct_Chk01_DtlR,Del01_RsltR> createMap_PayAct_Chk01_DtlR_Del01_RsltR() {
			return new Map_PayAct_Chk01_DtlR_Del01_RsltR<PayAct_Chk01_DtlR, Del01_RsltR>();
		}

		public class Map_PayAct_Chk01_DtlR_Del01_RsltR<D extends PayAct_Chk01_DtlR, S extends Del01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PayAct_Chk01_DtlR.$peg_no, Del01_RsltR.$peg_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$hdr_peg_no, Del01_RsltR.$hdr_peg_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$data_crud_typ, Del01_RsltR.$data_crud_typ);
				addColumnPathMap(PayAct_Chk01_DtlR.$pay_act_d_no, Del01_RsltR.$pay_act_d_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$pay_act_d_seq, Del01_RsltR.$pay_act_d_seq);
				addColumnPathMap(PayAct_Chk01_DtlR.$ap_appl_schd_no, Del01_RsltR.$ap_appl_schd_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$pay_chk_mng_no, Del01_RsltR.$pay_chk_mng_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$ap_sttl_cd, Del01_RsltR.$ap_sttl_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$bank_ac_cd, Del01_RsltR.$bank_ac_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$pay_bank_ac_cd, Del01_RsltR.$pay_bank_ac_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$trd_cur_com_paid_tax_cd, Del01_RsltR.$trd_cur_com_paid_tax_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$ap_setoff_typ, Del01_RsltR.$ap_setoff_typ);
				addColumnPathMap(PayAct_Chk01_DtlR.$setoff_cd, Del01_RsltR.$setoff_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$setoff_nm, Del01_RsltR.$setoff_nm);
				addColumnPathMap(PayAct_Chk01_DtlR.$so_dpt_cd, Del01_RsltR.$so_dpt_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$trd_cur_amt, Del01_RsltR.$trd_cur_amt);
				addColumnPathMap(PayAct_Chk01_DtlR.$adv_pay_act_no, Del01_RsltR.$adv_pay_act_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$bsppl_cd, Del01_RsltR.$bsppl_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$bsppl_dpt_cd, Del01_RsltR.$bsppl_dpt_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$asppl_cd, Del01_RsltR.$asppl_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$ap_dpt_cd, Del01_RsltR.$ap_dpt_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$purc_act_no, Del01_RsltR.$purc_act_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$rcpt_iv_mng_no, Del01_RsltR.$rcpt_iv_mng_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$rcpt_iv_no, Del01_RsltR.$rcpt_iv_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$wrk_no, Del01_RsltR.$wrk_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$ap_typ, Del01_RsltR.$ap_typ);
				addColumnPathMap(PayAct_Chk01_DtlR.$trd_d_rmrks, Del01_RsltR.$trd_d_rmrks);
				addColumnPathMap(PayAct_Chk01_DtlR.$pay_ntc_d_print_rmrks, Ins01_RsltR.$pay_ntc_d_print_rmrks);
				addColumnPathMap(PayAct_Chk01_DtlR.$intr_d_rmrks, Del01_RsltR.$intr_d_rmrks);
				addColumnPathMap(PayAct_Chk01_DtlR.$sub_char1, Del01_RsltR.$dtl_sub_char1);
				addColumnPathMap(PayAct_Chk01_DtlR.$sub_char2, Del01_RsltR.$dtl_sub_char2);
				addColumnPathMap(PayAct_Chk01_DtlR.$sub_char3, Del01_RsltR.$dtl_sub_char3);
				addColumnPathMap(PayAct_Chk01_DtlR.$pay_chk_upd_cntr, Del01_RsltR.$pay_chk_upd_cntr);
			}
		}
		
		protected Map_PayAct_Chk01_DtlR_Del01_RsltR_DEL<PayAct_Chk01_DtlR,Del01_RsltR> createMap_PayAct_Chk01_DtlR_Del01_RsltR_DEL() {
			return new Map_PayAct_Chk01_DtlR_Del01_RsltR_DEL<PayAct_Chk01_DtlR, Del01_RsltR>();
		}

		public class Map_PayAct_Chk01_DtlR_Del01_RsltR_DEL<D extends PayAct_Chk01_DtlR, S extends Del01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PayAct_Chk01_DtlR.$peg_no, Del01_RsltR.$peg_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$hdr_peg_no, Del01_RsltR.$hdr_peg_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$data_crud_typ, Del01_RsltR.$data_crud_typ);
				addColumnPathMap(PayAct_Chk01_DtlR.$pay_act_d_no, Del01_RsltR.$pay_act_d_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$pay_act_d_seq, Del01_RsltR.$pay_act_d_seq);
				addColumnPathMap(PayAct_Chk01_DtlR.$pay_chk_mng_no, Del01_RsltR.$pay_chk_mng_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$pay_chk_upd_cntr, Del01_RsltR.$pay_chk_upd_cntr);
			}
		}
	}
	
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 振替伝票を発行する<br>
	 */
	public class Prnt01 extends MSBHL_PayActListReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			prnt();
		}
		
		/**
		 * 振替伝票を再発行する
		 */
		protected void prnt() {
			MSBHL_ApSwBalService.ApSwBal_Prnt01 prnt =  MSBHL_ApSwBalService.crtApSwBal_Prnt01();

			for (Prnt01_RsltR upR : up0()) {
				ApSwBal_Prnt01_CndR r = prnt.up0().add();
				r.pay_act_no(upR.pay_act_no());
				r.pay_act_seq(upR.pay_act_seq());
				r.reprnt_flg(true);		// 再発行
			}
			
			prnt.up1().indiv_prnt_flg(up1().indiv_prnt_flg());
			prnt.exec();
		}
	}
	
	/**
	 * 以下の項目が同じデータを同一スレッドにまとめる。<BR>
	 *  <p>「登録する」種別
	 * <ul>
	 * <li>債務与信管理先が存在する場合は債務与信管理先（※１）あるいは支払先（※２）<BR>
	 *        ※１MST_CRED_ALLへのINSERTにおいて一意制約違反を避けるため<BR>
	 *        ※２同一支払先の明細が同じ支払実績ヘッダにまとめられるようにするため</li>
	 * <li>債務与信管理先が存在しない場合は支払先</li>
	 * </ul>
	 * <p>「取り消す」種別
	 * <ul><li>支払先</li></ul>
	 */
	protected <R extends MCRow> List<MCList<R>> splitUp(MCList<R> upL, int maxCntPerThread) {

		MCList<R>[] splitGrpArray = createSplitGrpArray(upL);
	
		List<MCList<R>> dataForThreads = new ArrayList<MCList<R>>();
		MCList<R> dataForOneThread = upL.createInstance();
		
		for (MCList<R> grpL : splitGrpArray) {
			if (maxCntPerThread <= dataForOneThread.size()) {
				dataForThreads.add(dataForOneThread);
				dataForOneThread = upL.createInstance();
			}
			dataForOneThread.addAll(grpL);
		}
		if (!dataForOneThread.isEmpty()) {
			dataForThreads.add(dataForOneThread);
		}
		return dataForThreads;
	}

	
	protected <R extends MCRow> MCList<R>[] createSplitGrpArray(MCList<R> upL) {
		
		MCList<R> apCredL = upL.createInstance();
		MCList<R> pspplL = upL.createInstance();

		upL.forEach(r -> {
			if (!isNull(r.getStringNE("ap_cred_cd"))) {
				apCredL.add(r);
			}
			else {
				pspplL.add(r);
			}
		});

		MCList<R>[] apCredGrpLArray = apCredL.groupList("ap_cred_cd");
		MCList<R>[] apCredAndPspplGrpLArray = aggregatePsppl(apCredGrpLArray);
		MCList<R>[] pspplGrpLArray = pspplL.groupList("psppl_cd");
		MCList<R>[] splitGrpArray = arrayCopy(apCredAndPspplGrpLArray, pspplGrpLArray);

		return splitGrpArray;
	}
	
	@SuppressWarnings("unchecked")
	protected <R extends MCRow> MCList<R>[] mergeArray(MCList<R>[] array, int fromIndex, int toIndex) {

		MCList<R>[] baseArray = array.clone();
		int mergeArrayLength = baseArray.length - 1;
		MCList<R>[] mergeArray = (MCList<R>[]) Array.newInstance(MCList.class, mergeArrayLength);
		for (int k = 0; k < toIndex; k++) {
			mergeArray[k] = baseArray[k];
		}

		mergeArray[toIndex] = baseArray[toIndex];
		mergeArray[toIndex].addAll(baseArray[fromIndex]);

		for (int l = toIndex + 1; l < mergeArrayLength; l++) {
			if (l < fromIndex) mergeArray[l] = baseArray[l];
			else mergeArray[l] = baseArray[l + 1];
		}
		return mergeArray;
	}


	protected <R extends MCRow> MCList<R>[] aggregatePsppl(MCList<R>[] apCredGrpLArray) {

		for (int i = 0; i < apCredGrpLArray.length; i++) {
			MCList<R> apCredGrpBaseL = apCredGrpLArray[i];
			for (int j = i + 1; j < apCredGrpLArray.length; j++) {
				MCList<R> apCredGrpTgtL = apCredGrpLArray[j];
				for (R apCredGrpBaseR : apCredGrpBaseL) {
					for (R apCredGrpTgtR : apCredGrpTgtL) {
						if (isSame(apCredGrpBaseR.getStringNE("psppl_cd"), apCredGrpTgtR.getStringNE("psppl_cd"))) {
							return aggregatePsppl(mergeArray(apCredGrpLArray, j, i));
						}
					}
				}
			}
		}
		return apCredGrpLArray;
	}
	
	@SuppressWarnings("unchecked")
	protected <R extends MCRow> MCList<R>[] arrayCopy(MCList<R>[] srcAry1, MCList<R>[] srcAry2) {
		MCList<R>[] allArray = (MCList<R>[]) Array.newInstance(MCList.class, srcAry1.length + srcAry2.length);
		System.arraycopy(srcAry1, 0, allArray, 0, srcAry1.length);
		System.arraycopy(srcAry2, 0, allArray, srcAry1.length, srcAry2.length);
		return allArray;
	}

	protected <R extends MCRow> void setApCredCd(MCList<R> list) {

		String bspplStr = "bsppl_cd";
		String apCredCdStr = "ap_cred_cd";
		
		list.addStringColumn(apCredCdStr);
		for (MCList<R> bspplL : list.groupList(bspplStr)) {
			String apCredCd = execFuncString(createSqlId(LOGIC_ID, "MAPA_BP$F_GET_CRED_OF_BSPPL", "01"),
					MAPA_BP$F_GET_CRED_OF_BSPPL(value(bspplL.get(0).getString(bspplStr))));
			bspplL.setString(apCredCdStr, apCredCd);
		}
	}
	
	/**
	 * エラーメッセージを持つRowか判断
	 * @param mr
	 * @param el
	 * @return
	 */
	protected boolean hasMessage(MCRow mr, MCList<MCRow> el) {
		for(MCRow e : el) {
			if (mr.getParamRowIndex() == e.getParamRowIndex()) {
				return true;
			}
		}
		return false;
	}

	protected void setValuesDbc(MCRow upR, MCList<? extends MCConstRow> down) {
		if (down.createRow() instanceof Srch01_RsltR) {
			setValuesDbc(MSBHL0100_Srch01_RsltR_J01(), upR, down);
		}
		else if (down.createRow() instanceof Srch02_RsltR){
			setValuesDbc(MSBHL0100_Srch02_RsltR_J01(), upR, down);
		}
	}

	//FMCB CUSTOM END
}