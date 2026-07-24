package mcframe.serverMSBG.MSBGL0240;

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
import mcframe.serverMSBG.MSBGL0240.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.commonCore.container.MCRow.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import mcframe.serverMSBG.MSBGL5020.*;
import static mcframe.serverMSBG.MSBGL0240.Query.*;
import mcframe.serverMAUC.MAUCL0100.*;
import mcframe.serverMAUC.MAUCL1060.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverMSBG.MSBGL5120.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_SwArBalReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_SwArBalReg_MC extends MSBGL_SwArBalReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 請求残高振替の情報を検索する<br>
	 */
	public class Srch01 extends MSBGL_SwArBalReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			// 検索
			srch();

			setBillFlg();
		}

		/**
		 * 請求残高情報の検索を行う
		 */
		protected void srch() {
			executeQuery(down0(), MSBGL0240_MST_BILL_D_S01(), up0());

			if (down0().isEmpty()) {
				return;
			}
			down1().trd_cd(MAUCL_TrdUtil.getDefaultTrdCd(MAC_TRD_PTN_TYP.ARSW_OUT_BILL_BAL.value()));
			down0().sort(getBillGrpSortPolicy());
		}

		protected void setBillFlg() {
			for (Srch01_RsltR r : down0()) {
				// 未請求
				if (MAC_STR.isNULL_VAL(r.bill_no())) {
					r.bill_flg(false);
				}
				// 請求済
				else {
					r.bill_flg(true);
				}
				
			}
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			for (Srch01_RsltR r : down0()) {
				r.inc_tax_amt(getAmtDispPm(r.inc_tax_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
				// 源泉税の考慮
				if (r.wtax_amt().isZero()) {
					r.not_appl_wtax_amt(MCNumber.ZERO);
				}
				else {
					getApplWtaxAmt(r);
					r.tgt_sw_amt(r.tgt_sw_amt().subtract(r.not_appl_wtax_amt()));
				}
			}
		}
	}

	/**
	 * 未消込源泉税額を設定する<br>
	 * 源泉税額 － 消込済源泉税額 ＝ 未消込源泉税額
	 * 
	 * @param r 検索条件（請求明細ＮＯ、親請求明細ＮＯ）
	 */
	protected void getApplWtaxAmt(MCRow r) {
		executeQuery(r, MSBGL0240_MST_RCV_ACT_D_S01(), r);
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 未請求残高振替の情報を検索する<br>
	 */
	public class Srch02 extends MSBGL_SwArBalReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			// 検索
			srch();
		}

		/**
		 * 請求残高情報の検索を行う
		 */
		protected void srch() {
			executeQuery(down0(), MSBGL0240_MST_BILL_D_S02(), up0());

			if (down0().isEmpty()) {
				return;
			}
			down1().trd_cd(MAUCL_TrdUtil.getDefaultTrdCd(MAC_TRD_PTN_TYP.ARSW_OUT_NOT_BILL_BAL.value()));
			down0().sort(getBillGrpSortPolicy());
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			for (Srch01_RsltR r : down0()) {
				r.inc_tax_amt(getAmtDispPm(r.inc_tax_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
			}
		}
	}

	/**
	 * 請求情報のソーとポリシー
	 * 
	 * @return ソートポリシー
	 */
	protected MCSortPolicy getBillGrpSortPolicy() {
		MCSortPolicy sp = new MCSortPolicy();
		sp.add(SortType.DESC, Srch01_RsltR.$bill_flg);
		sp.add(SortType.ASC, Srch01_RsltR.$acst_cd);
		sp.add(SortType.ASC, Srch01_RsltR.$ar_dpt_cd);
		sp.add(SortType.ASC, Srch01_RsltR.$ac_dt);
		sp.add(SortType.ASC, Srch01_RsltR.$trd_cd);
		sp.add(SortType.ASC, Srch01_RsltR.$act_no);
		sp.add(SortType.ASC, Srch01_RsltR.$act_seq);
		sp.add(SortType.ASC, Srch01_RsltR.$act_d_no);
		return sp;
	}
	
	protected MCNumber getAmtDispPm(MCNumber val, String trdPtnTyp, boolean dscntItmFlg) {
		if (!isNull(val) && !isNull(trdPtnTyp)) {
			return val.multiply(MAUCL_TrdUtil.getAmtDispPm(trdPtnTyp, dscntItmFlg));
		}
		return val;
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 請求残高振替の更新前チェックをする<br>
	 */
	public class Chk01 extends MSBGL_SwArBalReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			
			if (!hasErr()) {
				callRcvActCmnSChkSrv();
			}
			setDown();
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();

			// 条件付リストロジックチェックの処理
			// 債権部門
			ListLogicBind arDptBind = getListLogicBind(up2(), SwToR.$to_ar_dpt_cd);	
			arDptBind.putBind(DptCols.$i_dt, up1(), SwBaseR.$ac_dt);
			// 請求部門
			ListLogicBind billDptBind = getListLogicBind(up2(), SwToR.$bill_dpt_cd);	
			billDptBind.putBind(DptCols.$i_dt, up1(), SwBaseR.$ac_dt);
		}

		/**
		 * 入金実績共通サービスのチェック処理を実行する
		 */
		protected void callRcvActCmnSChkSrv() {

			MSBGL_RcvActCmnService.RcvActCmn_Chk02 ope = MSBGL_RcvActCmnService.crtRcvActCmn_Chk02();

			RcvActCmn_Chk02_HdrR hdrR = RcvActCmn_Chk02_HdrR.create();
			copy(hdrR, up1(), createMap_RcvActCmn_Chk02_HdrR_SwBaseR());
			ope.up0().add(hdrR);

			RcvActCmn_Chk02_SwToR swToR = RcvActCmn_Chk02_SwToR.create();
			copy(swToR, up2(), createMap_RcvActCmn_Chk02_SwToR_SwToR());
			ope.up1().add(swToR);

			addAll(ope.up2(), up0(), createMap_RcvActCmn_Chk02_SwFrR_SwFrR());

			ope.exec();
			copyErrFlg(up0(), ope.down2());
			copyErrFlg(up1(), ope.down0().get(0));
			copyErrFlg(up2(), ope.down1().get(0));
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(chkBase());

			// 為替レートＣＤ取得
			for (SwFrR r : up0()) {
				r.xrate_cd(getCo().sls_xrate_cd());
			}
			up2().xrate_cd(getCo().sls_xrate_cd());

			return msgL;
		}

		/**
		 * ロック、更新カウンタチェック
		 * 
		 * @return
		 */
		protected MCMessageList chkBase() {
			MCMessageList msgL = new MCMessageList();
			MCList<MST_BILL_D_APPL_BAL_R> billDApplBalL = getBillDApplBal(up0());

			msgL.addAll(billDApplBalLock(up0(), billDApplBalL));

			return msgL;
		}

		protected MCList<MST_BILL_D_APPL_BAL_R> getBillDApplBal(MCList<SwFrR> up0) {

			MST_BILL_D_R billd = MST_BILL_D_R.create("BILLD");
			MST_BILL_D_R pbilld = MST_BILL_D_R.create("PBILLD");
			MST_BILL_R bill = MST_BILL_R.create("BILL");
			MST_BILL_ACST_R acst = MST_BILL_ACST_R.create("ACST");

			MCList<MST_BILL_D_APPL_BAL_R> billDApplBalL = MCList.create(MST_BILL_D_APPL_BAL_R.class);
			MST_BILL_D_APPL_BAL_R t = MST_BILL_D_APPL_BAL_R.create("T");
			MCQueryApiBuilder billDApplBalL_bldr = MCQueryApiBuilder.create(t);
			billDApplBalL.addDateColumn("ac_dt");
			billDApplBalL.addDateColumn("ac_ym");
			billDApplBalL.addStringColumn("trd_cd");
			billDApplBalL.addStringColumn("ar_dpt_cd");
			billDApplBalL.addStringColumn("act_no");
			billDApplBalL.addNumberColumn("act_seq");
			billDApplBalL.addStringColumn("act_d_no");
			billDApplBalL.addNumberColumn("act_d_seq");
			billDApplBalL.addNumberColumn("tgt_sw_amt");
			billDApplBalL.addNumberColumn("wtax_amt");
			billDApplBalL.addStringColumn("trd_cur_cd");
			billDApplBalL.addStringColumn("wrk_no");
			billDApplBalL.addStringColumn("ar_typ");
			billDApplBalL.addNumberColumn("xrate");

			billDApplBalL_bldr.setSelect(t.upd_cntr);
			billDApplBalL_bldr.addSelect(t.bill_d_no);
			billDApplBalL_bldr.addSelect(t.parent_bill_d_no);
			billDApplBalL_bldr.addSelect(billd.ac_dt);
			billDApplBalL_bldr.addSelect(billd.ac_ym);
			billDApplBalL_bldr.addSelect(pbilld.trd_cd);
			billDApplBalL_bldr.addSelect(acst.ar_dpt_cd);
			billDApplBalL_bldr.addSelect(pbilld.act_no);
			billDApplBalL_bldr.addSelect(pbilld.act_seq);
			billDApplBalL_bldr.addSelect(pbilld.act_d_no);
			billDApplBalL_bldr.addSelect(pbilld.act_d_seq);
			billDApplBalL_bldr.addSelect(t.not_appl_bal.as("tgt_sw_amt"));
			billDApplBalL_bldr.addSelect(pbilld.wtax_amt);
			billDApplBalL_bldr.addSelect(bill.trd_cur_cd);
			billDApplBalL_bldr.addSelect(bill.wrk_no);
			billDApplBalL_bldr.addSelect(pbilld.ar_typ);
			billDApplBalL_bldr.addSelect(pbilld.xrate);
			billDApplBalL_bldr.addSelect(pbilld.iv_no.as("bill_d_iv_no"));

			billDApplBalL_bldr.addInnerJoin(billd, t.bill_d_no.eq(billd.bill_d_no));
			billDApplBalL_bldr.addInnerJoin(pbilld, t.parent_bill_d_no.eq(pbilld.bill_d_no));
			billDApplBalL_bldr.addInnerJoin(bill, billd.bill_mng_no.eq(bill.bill_mng_no));
			billDApplBalL_bldr.addInnerJoin(acst, billd.bill_acst_no.eq(acst.bill_acst_no));

			billDApplBalL_bldr.addWhereWithAnd(t.bill_d_no.eq(bind("bill_d_no")));
			billDApplBalL_bldr.addWhereWithAnd(t.parent_bill_d_no.eq(bind("parent_bill_d_no")));
			dbSelectKeyForUpdateNoWait("MSBGL0240_MST_BILL_D_APPL_BAL_S01", billDApplBalL, billDApplBalL_bldr, up0);

			return billDApplBalL;
		}

		protected MCMessageList billDApplBalLock(MCList<SwFrR> up0, MCList<MST_BILL_D_APPL_BAL_R> billDApplBalL) {
			MCMessageList msgL = new MCMessageList();

			MCIndexKey key = billDApplBalL.createIndex(MST_BILL_D_APPL_BAL_R.$bill_d_no, MST_BILL_D_APPL_BAL_R.$parent_bill_d_no);
			for (SwFrR r : up0) {
				MST_BILL_D_APPL_BAL_R tgtR = billDApplBalL.getFirst(key, r.bill_d_no(), r.parent_bill_d_no());

				if(isNull(tgtR)){
					continue;
				}
				msgL.addAll(checkUpdCntrNE(r, SwFrR.$bill_d_appl_bal_upd_cntr, tgtR));

				if (!msgL.isEmpty()) {
					throw new MCAppException(MSBGL0069);
				}

				// 振替元情報の補完
				compBase(r, tgtR);
			}

			return msgL;
		}

		/**
		 * 振替元情報の補完
		 * 
		 * @param r
		 * @param billDApplBalR
		 */
		protected void compBase(SwFrR r, MST_BILL_D_APPL_BAL_R billDApplBalR) {

			r.bill_d_no(billDApplBalR.getStringNE(MST_BILL_D_APPL_BAL_R.$bill_d_no));
			r.parent_bill_d_no(billDApplBalR.getStringNE(MST_BILL_D_APPL_BAL_R.$parent_bill_d_no));
			r.ac_dt(billDApplBalR.getDateNE("ac_dt"));
			r.ac_ym(billDApplBalR.getDateNE("ac_ym"));
			r.trd_cd(billDApplBalR.getStringNE("trd_cd"));
			r.ar_dpt_cd(billDApplBalR.getStringNE("ar_dpt_cd"));
			r.act_no(billDApplBalR.getStringNE("act_no"));
			r.act_seq(billDApplBalR.getNumberNE("act_seq"));
			r.act_d_no(billDApplBalR.getStringNE("act_d_no"));
			r.act_d_seq(billDApplBalR.getNumberNE("act_d_seq"));
			r.tgt_sw_amt(billDApplBalR.getNumberNE("tgt_sw_amt"));
			r.wtax_amt(billDApplBalR.getNumberNE("wtax_amt"));
			r.trd_cur_cd(billDApplBalR.getStringNE("trd_cur_cd"));
			r.wrk_no(billDApplBalR.getStringNE("wrk_no"));
			r.ar_typ(billDApplBalR.getStringNE("ar_typ"));
			r.xrate(billDApplBalR.getNumberNE("xrate"));
			r.bill_d_iv_no(billDApplBalR.getStringNE("bill_d_iv_no"));
			getApplWtaxAmt(r);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			if (hasErr()) {
				return msgL;
			}

			MCList<SwFrR> notErrswFrL = getChkList(up0());
			MCList<SwBaseR> notErrSwBaseL = getChkList(up1());
			MCList<SwToR> notErrSwToL = getChkList(up2());	
			if (notErrSwBaseL.isEmpty() || notErrSwToL.isEmpty()) {
				return msgL;
			}
			SwBaseR notErrSwBaseR = notErrSwBaseL.get(0);
			SwToR notErrSwToR = notErrSwToL.get(0);

			msgL.addAll(check(notErrswFrL, SwFrR.$parent_bill_d_no, new FXUCL_RequiredValidater()));
			msgL.addAll(check(notErrSwBaseR, SwBaseR.$bill_basis_dt, new FXUCL_RequiredValidater()));

			// DACチェック
			msgL.addAll(checkWritableDptCdDac(notErrswFrL, SwFrR.$ar_dpt_cd));
			msgL.addAll(checkWritableDptCdDac(notErrSwToR, SwToR.$to_ar_dpt_cd));

			msgL.addAll(chkWtaxAmt(notErrswFrL));
			msgL.addAll(chkOther(notErrswFrL, notErrSwBaseR, notErrSwToR, true));

			return msgL;
		}

		protected MCMessageList chkWtaxAmt(MCList<SwFrR> swFrL) {
			MCMessageList msgL = new MCMessageList();
			for (SwFrR r : swFrL) {
				if (!r.not_appl_wtax_amt().isZero()) {
					msgL.add(new MCMessage(MSBGL0037, r.not_appl_wtax_amt(), toDispGUIIndex(r)));
				}
			}
			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			copyall(down1(), up1());
			copyall(down2(), up2());
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 未請求残高振替の更新前チェックをする<br>
	 */
	public class Chk02 extends MSBGL_SwArBalReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (!hasErr()) {
				callRcvActCmnSChkSrv();
			}
			setDown();
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();

			// 条件付リストロジックチェックの処理
			// 債権部門
			ListLogicBind arDptBind = getListLogicBind(up2(), SwToR.$to_ar_dpt_cd);	
			arDptBind.putBind(DptCols.$i_dt, up1(), SwBaseR.$ac_dt);
			// 請求部門
			ListLogicBind billDptBind = getListLogicBind(up2(), SwToR.$bill_dpt_cd);
			billDptBind.putBind(DptCols.$i_dt, up1(), SwBaseR.$ac_dt);
		}

		/**
		 * 入金実績共通サービスのチェック処理を実行する<BR>
		 * 本メソッドとUpd02とではhdr_dtl_pegの設定方法が異なる<BR>
		 *  ・本メソッド：hdr_dtl_pegはすべて「1」<BR>
		 *  ・Upd02：伝票ごと（インボイスＮＯごと）にhdr_dtl_pegを設定<BR>
		 * ※呼び出し先で実行される、計上日（振替先）の締チェックを重複して実行しないようにするため 
		 */
		protected void callRcvActCmnSChkSrv() {
			MSBGL_RcvActCmnService.RcvActCmn_Chk03 ope = MSBGL_RcvActCmnService.crtRcvActCmn_Chk03();

			RcvActCmn_Chk03_HdrR hdrR = RcvActCmn_Chk03_HdrR.create();
			copy(hdrR, up1(), createMap_RcvActCmn_Chk03_HdrR_SwBaseR());
			ope.up0().add(hdrR);

			RcvActCmn_Chk03_SwToR swToR = RcvActCmn_Chk03_SwToR.create();
			copy(swToR, up2(), createMap_RcvActCmn_Chk03_SwToR_SwToR());
			ope.up1().add(swToR);

			addAll(ope.up2(), up0(), createMap_RcvActCmn_Chk03_SwFrR_SwFrR());

			ope.exec();
			copyErrFlg(up0(), ope.down2());
			copyErrFlg(up1(), ope.down0().get(0));
			copyErrFlg(up2(), ope.down1().get(0));

		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(chkBase());

			return msgL;
		}

		/**
		 * ロック、更新カウンタチェック
		 * 
		 * @return
		 */
		protected MCMessageList chkBase() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(billDLock(up0()));

			return msgL;
		}

		protected MCMessageList billDLock(MCList<SwFrR> up0) {
			MCMessageList msgL = new MCMessageList();

			MCList<BillDR> billDL = MCList.create(BillDR.class);
			for (SwFrR frR : up0) {
				BillDR billDR = BillDR.create();
				billDR.bill_d_no(frR.bill_d_no());
				billDR.sw_to_acst_cd(up2().acst_cd());
				executeQuery(billDR, MSBGL0240_MST_BILL_D_S03(), billDR);
				
				billDL.add(billDR);
			}

			MCIndexKey key = billDL.createIndex(BillDR.$bill_d_no);
			for (SwFrR r : up0) {
				BillDR billDR = billDL.getFirst(key, r.bill_d_no());

				if(isNull(billDR)){
					continue;
				}

				// 更新カウンタチェック
				msgL.addAll(checkUpdCntrNE(r, SwFrR.$bill_d_upd_cntr, billDR));
				if (!msgL.isEmpty()) {
					throw new MCAppException(MSBGL0069);
				}

				r.ac_ym(billDR.ac_ym());
				r.wrk_no(billDR.wrk_no());
				r.ar_dpt_cd(billDR.ar_dpt_cd());
				r.trd_cur_cd(billDR.trd_cur_cd());

				// 消込チェック
				// 振替元の請求明細が一部でも消し込まれている場合は処理できないためここでExceptionをthrowする
				if (!billDR.appl_amt().isZero()) {
					throw new MCAppException(MSBGL0070, billDR.trd_cd(), billDR.act_no(), billDR.act_rev());
				}
			}
			down3().addAll(billDL);
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {

			MCMessageList msgL = super.doServerCheckSub();

			if (hasErr()) {
				return msgL;
			}

			MCList<SwFrR> notErrswFrL = getChkList(up0());
			MCList<SwBaseR> notErrSwBaseL = getChkList(up1());
			MCList<SwToR> notErrSwToL = getChkList(up2());	
			if (notErrSwBaseL.isEmpty() || notErrSwToL.isEmpty()) {
				return msgL;
			}
			SwBaseR notErrSwBaseR = notErrSwBaseL.get(0);
			SwToR notErrSwToR = notErrSwToL.get(0);

			// DACチェック
			msgL.addAll(checkWritableDptCdDac(notErrswFrL, SwFrR.$ar_dpt_cd));
			msgL.addAll(checkWritableDptCdDac(notErrSwToR, SwToR.$to_ar_dpt_cd));

			msgL.addAll(chkOther(notErrswFrL, notErrSwBaseR, notErrSwToR, false));

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			copyall(down1(), up1());
			copyall(down2(), up2());
		}
	}

	/**
	 *  固有チェック
	 * @param up0 上り電文
	 * @param up1 上り電文
	 * @param up2 上り電文
	 * @param billFlg 請求済ＦＬＧ
	 * 
	 * @return エラーメッセージリスト
	 */
	protected MCMessageList chkOther(MCList<SwFrR> up0, SwBaseR up1, SwToR up2, boolean billFlg) {
		MCMessageList msgL = new MCMessageList();
		// 案件処理区分が空白で、振替元明細に複数の案件ＣＤが含まれる場合はエラーとする
		// （振替元：振替先が多：多となるのを防ぐため）
		if (isNull(up2.wrk_ope_typ()) && 1 < up0.groupBy(SwFrR.$wrk_no).size()) {
			msgL.add(new MCMessage(MSBGL0108));
		}

		// 請求残高振替のみ実施するチェック
		if (billFlg) {
			// 債権部門有効チェック
			msgL.addAll(chkSwFrArDptCd(up0, up1));

			// 請求残高振替時は計上年月のチェックはしない
			return msgL;
		}

		// 振替元と振替先の計上年月が異なる場合はエラーとする
		MCDate toAcYm = getAcYm(up1.ac_dt());
		for (SwFrR r : up0) {
			if (!isSame(r.ac_ym(), toAcYm)) {
				msgL.add(new MCMessage(r, SwFrR.$ac_ym, MSBGL0109, toYMString(r.ac_ym()), toYMString(toAcYm), toDispGUIIndex(r)));
			}
		}
		return msgL;
	}


	
	/**
	 * 債権部門が有効かどうかチェックする
	 * 
	 * @param up0 上り電文
	 * @param up1 上り電文
	 * @return メッセージリスト
	 */
	protected MCMessageList chkSwFrArDptCd(MCList<SwFrR> up0, SwBaseR up1) {
		MCMessageList msgL = new MCMessageList();

		MAM_AC_RSN_R acRsnR = MAM_AC_RSN_R.create();
		MAM_AC_RSN_R t = MAM_AC_RSN_R.create("T");
		MCQueryApiBuilder acRsnR_bldr = MCQueryApiBuilder.create(t);
		MAM_TRD_R trd = MAM_TRD_R.create("TRD");
		acRsnR_bldr.setSelect(t.ac_invalid_flg);
		acRsnR_bldr.addInnerJoin(trd, bracket(t.ac_rsn_cd.eq(trd.ac_rsn_cd)));
		acRsnR_bldr.setWhere(trd.trd_cd.eq(bind("1")), up1.trd_cd());
		dbSelect("MSBGL0240_MAM_AC_RSN_S01", acRsnR, acRsnR_bldr);

		if (!acRsnR.ac_invalid_flg()) {
			MCList<SwFrR> arDptL = up0.groupBy(SwFrR.$ar_dpt_cd);
			arDptL.setDateNE(SwFrR.$ac_dt, up1.ac_dt());
			checkDptCd(arDptL);
			for (SwFrR r : arDptL) {
				if (isNull(r.getString("chk_ar_dpt_cd"))) {
					SwFrR swFrR = up0.getFirst(SwFrR.$ar_dpt_cd, r.ar_dpt_cd());
					msgL.add(new MCMessage(swFrR, null, MSBGL0040, r.ar_dpt_cd()));
				}
			}
		}
		return msgL;
	}

	/**
	 * 部門判定<br />
	 * 日付に対して部門が有効かどうか判定する
	 * 
	 * @param arDptL 債権部門チェックリスト
	 */
	protected void checkDptCd(MCList<SwFrR> l) {
		l.addStringColumn("chk_ar_dpt_cd");
		execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_DPT$F_CHECK_DPT_CD", "01"),
				MABCFunction.getFunctionExecuter("MAPA_DPT$F_CHECK_DPT_CD"),
				"chk_ar_dpt_cd", l, SwFrR.$ar_dpt_cd, SwBaseR.$ac_dt);
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 請求残高振替の更新をする<br>
	 */
	public class Upd01 extends MSBGL_SwArBalReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();

			// チェック処理
			callThisChk01();
			throwUpdErr();

			// 入金実績共通サービス
			rcvActCmn();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(SwFrR.$peg_no, up0(), up1(), up2());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBGL_SwArBalReg.Chk01 ope = MSBGL_SwArBalReg.crtChk01();
			ope.up0().setAll(up0());
			copyall(ope.up1(), up1());
			copyall(ope.up2(), up2());

			ope.exec();

			up0().setAll(ope.down0());
			copyall(up1(), ope.down1());
			copyall(up2(), ope.down2());
		}

		/**
		 * 入金実績共通サービスを実行する。
		 * 
		 */
		protected void rcvActCmn() {
			MSBGL_RcvActCmnService.RcvActCmn_Upd02 ope = MSBGL_RcvActCmnService.crtRcvActCmn_Upd02();

			int pegNo = 0;
			for (MCList<SwFrR> grpL : up0().groupList(SwFrR.$bill_d_iv_no)) {

				RcvActCmn_Chk02_HdrR hdrR = RcvActCmn_Chk02_HdrR.create();
				copy(hdrR, up1(), grpL.get(0), createMap_RcvActCmn_Chk02_HdrR_SwBaseR());
				hdrR.hdr_dtl_peg(pegNo);
				ope.up0().add(hdrR);

				RcvActCmn_Chk02_SwToR swToR = RcvActCmn_Chk02_SwToR.create();
				MapUpd01SwToR<RcvActCmn_Chk02_SwToR, SwToR> swToMpr = createMapUpd01SwToR();
				swToMpr.setSwFrR(grpL.get(0));
				copy(swToR, up2(), swToMpr);
				swToR.hdr_dtl_peg(pegNo);
				ope.up1().add(swToR);
				
				MapUpd01SwFrR<RcvActCmn_Chk02_SwFrR, SwFrR> swFrMpr = createMapUpd01SwFrR();
				swFrMpr.setPegNo(pegNo);
				addAll(ope.up2(), grpL, swFrMpr);
				pegNo++;
			}

			ope.exec();

		}

		// Mapper
		protected Map_RcvActCmn_Chk02_HdrR_SwBaseR<RcvActCmn_Chk02_HdrR,SwBaseR,SwFrR> createMap_RcvActCmn_Chk02_HdrR_SwBaseR() {
			return new Map_RcvActCmn_Chk02_HdrR_SwBaseR<RcvActCmn_Chk02_HdrR, SwBaseR, SwFrR>();
		}

		public class Map_RcvActCmn_Chk02_HdrR_SwBaseR<D extends RcvActCmn_Chk02_HdrR, S extends SwBaseR, W extends SwFrR> extends MAUCC_RowMapperWith<D,S,W>{
			protected W _hR;

			@Override
			public void setWith(W _hR) {
				this._hR = _hR;
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(RcvActCmn_Chk02_HdrR.$dpt_cd, SwBaseR.$dpt_cd);
				addColumnPathMap(RcvActCmn_Chk02_HdrR.$wg_cd, SwBaseR.$wg_cd);
				addColumnPathMap(RcvActCmn_Chk02_HdrR.$usr_cd, SwBaseR.$usr_cd);
				addColumnPathMap(RcvActCmn_Chk02_HdrR.$ac_dt, SwBaseR.$ac_dt);
				addColumnPathMap(RcvActCmn_Chk02_HdrR.$trd_cd, SwBaseR.$trd_cd);
				addColumnPathMap(RcvActCmn_Chk02_HdrR.$trd_ptn_typ, SwBaseR.$trd_ptn_typ);
				addColumnPathMap(RcvActCmn_Chk02_HdrR.$bill_basis_dt, SwBaseR.$bill_basis_dt);
				addColumnPathMap(RcvActCmn_Chk02_HdrR.$rcv_dt, SwBaseR.$sw_dt);
				addColumnPathMap(RcvActCmn_Chk02_HdrR.$trd_rmrks, SwBaseR.$trd_rmrks);
				addColumnPathMap(RcvActCmn_Chk02_HdrR.$sub_char1, SwBaseR.$sub_char1);
				addColumnPathMap(RcvActCmn_Chk02_HdrR.$sub_char2, SwBaseR.$sub_char2);
				addColumnPathMap(RcvActCmn_Chk02_HdrR.$sub_char3, SwBaseR.$sub_char3);
			}

			@Override
			public void valueCopy(D dest, S src) {
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.ac_ym(getAcYm(src.ac_dt()));
				dest.ar_trd_grp_typ(MAC_TRD_PTN_TYP.ar_trd_grp_typ(src.trd_ptn_typ()));
				dest.trd_cur_cd(_hR.trd_cur_cd());
			}
		}

		protected MapUpd01SwToR<RcvActCmn_Chk02_SwToR, SwToR> createMapUpd01SwToR() {
			return new MapUpd01SwToR<RcvActCmn_Chk02_SwToR, SwToR>();
		}

		public class MapUpd01SwToR<D extends RcvActCmn_Chk02_SwToR, S extends SwToR> extends MCRowMapper<D, S> {

			protected SwFrR _swFrR;

			public void setSwFrR(SwFrR swFrR) {
				this._swFrR = swFrR;
			}
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(RcvActCmn_Chk02_SwToR.$acst_cd, SwToR.$acst_cd);
				addColumnPathMap(RcvActCmn_Chk02_SwToR.$bcst_cd, SwToR.$bcst_cd);
				addColumnPathMap(RcvActCmn_Chk02_SwToR.$wrk_no, SwToR.$wrk_no);
				addColumnPathMap(RcvActCmn_Chk02_SwToR.$ar_dpt_cd, SwToR.$to_ar_dpt_cd);
				addColumnPathMap(RcvActCmn_Chk02_SwToR.$wg_cd, SwToR.$wg_cd);
				addColumnPathMap(RcvActCmn_Chk02_SwToR.$bill_dpt_cd, SwToR.$bill_dpt_cd);
			}

			@Override
			public void valueCopy(D dest, S src) {
				dest.xrate_cd(getCo().sls_xrate_cd());
				// 案件処理区分が「NULL」の場合は振替元案件を振替先に引き継ぎ、振替先では案件別債権管理となる。
				if (isNull(src.wrk_ope_typ())) {
					dest.wrk_no(_swFrR.wrk_no());
				}
				dest.xrate(_swFrR.xrate());
			}
			
		}

		// Mapper
		protected MapUpd01SwFrR<RcvActCmn_Chk02_SwFrR,SwFrR> createMapUpd01SwFrR() {
			return new MapUpd01SwFrR<RcvActCmn_Chk02_SwFrR, SwFrR>();
		}

		public class MapUpd01SwFrR<D extends RcvActCmn_Chk02_SwFrR, S extends SwFrR> extends MCRowMapper<D,S>{
			
			protected int _pegNo;

			public void setPegNo(int pegNo) {
				_pegNo = pegNo;
			}
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(RcvActCmn_Chk02_SwFrR.$ac_ym, SwFrR.$ac_ym);
				addColumnPathMap(RcvActCmn_Chk02_SwFrR.$trd_cd, SwFrR.$trd_cd);
				addColumnPathMap(RcvActCmn_Chk02_SwFrR.$act_no, SwFrR.$act_no);
				addColumnPathMap(RcvActCmn_Chk02_SwFrR.$act_seq, SwFrR.$act_seq);
				addColumnPathMap(RcvActCmn_Chk02_SwFrR.$act_d_no, SwFrR.$act_d_no);
				addColumnPathMap(RcvActCmn_Chk02_SwFrR.$act_d_seq, SwFrR.$act_d_seq);
				addColumnPathMap(RcvActCmn_Chk02_SwFrR.$bill_d_no, SwFrR.$bill_d_no);
				addColumnPathMap(RcvActCmn_Chk02_SwFrR.$parent_bill_d_no, SwFrR.$parent_bill_d_no);
				addColumnPathMap(RcvActCmn_Chk02_SwFrR.$sw_amt, SwFrR.$tgt_sw_amt);
				addColumnPathMap(RcvActCmn_Chk02_SwFrR.$ac_dt, SwFrR.$ac_dt);
				addColumnPathMap(RcvActCmn_Chk02_SwFrR.$trd_cur_cd, SwFrR.$trd_cur_cd);
				addColumnPathMap(RcvActCmn_Chk02_SwFrR.$ar_typ, SwFrR.$ar_typ);
			}

			@Override
			public void valueCopy(D dest, S src) {
				dest.base_cur_sw_amt(convToBaseCur(src.tgt_sw_amt(), src.xrate(),  getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
				dest.hdr_dtl_peg(_pegNo);
			}
		}
	}

	/**
	 * Upd02オペレーション.<p>
	 *
	 * 未請求残高振替の更新をする<br>
	 */
	public class Upd02 extends MSBGL_SwArBalReg_MC_A.Upd02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();

			MCList<BillDR> billDL = MCList.create(BillDR.class);

			// チェック処理
			callThisChk02(billDL);
			throwUpdErr();

			// 入金実績共通サービス
			rcvActCmn(billDL);
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(SwFrR.$peg_no, up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02(MCList<BillDR> billDL) {
			MSBGL_SwArBalReg.Chk02 ope = MSBGL_SwArBalReg.crtChk02();
			ope.up0().setAll(up0());
			copyall(ope.up1(), up1());
			copyall(ope.up2(), up2());

			ope.exec();

			up0().setAll(ope.down0());
			copyall(up1(), ope.down1());
			copyall(up2(), ope.down2());
			billDL.addAll(ope.down3());
		}

		/**
		 * 入金実績共通サービスを実行する。
		 * 
		 */
		protected void rcvActCmn(MCList<BillDR> billDL) {

			MSBGL_RcvActCmnService.RcvActCmn_Upd03 ope = MSBGL_RcvActCmnService.crtRcvActCmn_Upd03();
			MCIndexKey up0Key = up0().createIndex(SwFrR.$bill_d_no);
			int pegNo = 0;

			for (MCList<BillDR> grpL : billDL.groupList(BillDR.$bill_d_iv_no, BillDR.$xrate)) {
				RcvActCmn_Chk03_HdrR hdrR = RcvActCmn_Chk03_HdrR.create();

				copy(hdrR, up1(), createMap_RcvActCmn_Chk03_HdrR_SwBaseR());
				hdrR.hdr_dtl_peg(pegNo);
				ope.up0().add(hdrR);

				RcvActCmn_Chk03_SwToR swToR = RcvActCmn_Chk03_SwToR.create();
				MapNotBillSwToR<RcvActCmn_Chk03_SwToR, SwToR, BillDR> toMpr = createMapNotBillSwToR();
				toMpr.setPegNo(pegNo);
				copy(swToR, up2(), grpL.get(0), toMpr);
				ope.up1().add(swToR);

				MapNotBillSwFrKeyL<RcvActCmn_Chk03_SwFrR, SwFrR> frKeyLMpr = createMapNotBillSwFrKeyL();
				frKeyLMpr.setPegNo(pegNo);
				addAll(ope.up2(), getTgtBillD(grpL, up0Key), frKeyLMpr);

				MapNotBillSwFrDtlL<RcvActCmn_Upd03_BillDR, BillDR> frDtlLMpr = createMapNotBillSwFrDtlL();
				frDtlLMpr.setPegNo(pegNo);
				addAll(ope.up3(), grpL, frDtlLMpr);
				pegNo++;
			}
			ope.exec();
		}

		protected MCList<SwFrR> getTgtBillD(MCList<BillDR> tgtL, MCIndexKey up0Key) {
			MCList<SwFrR> retL = MCList.create(SwFrR.class);
			for (BillDR tgtR : tgtL) {
				SwFrR up0R = up0().getFirst(up0Key, tgtR.bill_d_no());
				if (!isNull(up0R)) {
					retL.add(up0R);
				}
			}
			return retL;
		}
		
		// Mapper
		protected Map_RcvActCmn_Chk03_HdrR_SwBaseR<RcvActCmn_Chk03_HdrR,SwBaseR> createMap_RcvActCmn_Chk03_HdrR_SwBaseR() {
			return new Map_RcvActCmn_Chk03_HdrR_SwBaseR<RcvActCmn_Chk03_HdrR, SwBaseR>();
		}

		public class Map_RcvActCmn_Chk03_HdrR_SwBaseR<D extends RcvActCmn_Chk03_HdrR, S extends SwBaseR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(RcvActCmn_Chk03_HdrR.$dpt_cd, SwBaseR.$dpt_cd);
				addColumnPathMap(RcvActCmn_Chk02_HdrR.$wg_cd, SwBaseR.$wg_cd);
				addColumnPathMap(RcvActCmn_Chk03_HdrR.$usr_cd, SwBaseR.$usr_cd);
				addColumnPathMap(RcvActCmn_Chk03_HdrR.$ac_dt, SwBaseR.$ac_dt);
				addColumnPathMap(RcvActCmn_Chk03_HdrR.$trd_cd, SwBaseR.$trd_cd);
				addColumnPathMap(RcvActCmn_Chk03_HdrR.$trd_ptn_typ, SwBaseR.$trd_ptn_typ);
				addColumnPathMap(RcvActCmn_Chk03_HdrR.$sw_dt, SwBaseR.$sw_dt);
				addColumnPathMap(RcvActCmn_Chk03_HdrR.$trd_rmrks, SwBaseR.$trd_rmrks);
				addColumnPathMap(RcvActCmn_Chk03_HdrR.$sub_char1, SwBaseR.$sub_char1);
				addColumnPathMap(RcvActCmn_Chk03_HdrR.$sub_char2, SwBaseR.$sub_char2);
				addColumnPathMap(RcvActCmn_Chk03_HdrR.$sub_char3, SwBaseR.$sub_char3);
			}

			@Override
			public void valueCopy(D dest, S src) {
				dest.ar_trd_grp_typ(MAC_TRD_PTN_TYP.ar_trd_grp_typ(src.trd_ptn_typ()));
				dest.hdr_dtl_peg(1);
			}
		}


		protected MapNotBillSwToR<RcvActCmn_Chk03_SwToR, SwToR, BillDR> createMapNotBillSwToR() {
			return new MapNotBillSwToR<RcvActCmn_Chk03_SwToR, SwToR, BillDR>();
		}

		public class MapNotBillSwToR<D extends RcvActCmn_Chk03_SwToR, S extends SwToR, W extends BillDR> extends MAUCC_RowMapperWith<D,S,W>{
			protected W _frR;

			protected int _pegNo;

			public void setPegNo(int pegNo) {
				_pegNo = pegNo;
			}
			
			@Override
			public void setWith(W _frR) {
				this._frR = _frR;
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(RcvActCmn_Chk03_SwToR.$acst_cd, SwToR.$acst_cd);
				addColumnPathMap(RcvActCmn_Chk03_SwToR.$bcst_cd, SwToR.$bcst_cd);
				addColumnPathMap(RcvActCmn_Chk03_SwToR.$wrk_no, SwToR.$wrk_no);
				addColumnPathMap(RcvActCmn_Chk03_SwToR.$ar_dpt_cd, SwToR.$to_ar_dpt_cd);
				addColumnPathMap(RcvActCmn_Chk03_SwToR.$wg_cd, SwToR.$wg_cd);
				addColumnPathMap(RcvActCmn_Chk03_SwToR.$bill_dpt_cd, SwToR.$bill_dpt_cd);
				addColumnPathMap(RcvActCmn_Chk03_SwToR.$xrate, SwToR.$xrate);
			}

			@Override
			public void valueCopy(D dest, S src) {
				dest.xrate_cd(getCo().sls_xrate_cd());
				dest.xrate(_frR.xrate());
				dest.trd_cur_cd(_frR.trd_cur_cd());
				dest.hdr_dtl_peg(_pegNo);
				// 案件処理区分が「NULL」の場合は振替元案件を振替先に引き継ぎ、振替先では案件別債権管理となる。
				if (isNull(src.wrk_ope_typ())) {
					// _hRには振替元明細の先頭行が設定されている。
					// 案件処理区分が「NULL」の場合は、振替元の案件が複数にならないようにチェックされており、どの行から案件ＣＤを取得しても同じ値となるため、先頭行の案件を設定する。
					dest.wrk_no(_frR.wrk_no());
				}
			}
		}


		// Mapper
		protected MapNotBillSwFrKeyL<RcvActCmn_Chk03_SwFrR,SwFrR> createMapNotBillSwFrKeyL() {
			return new MapNotBillSwFrKeyL<RcvActCmn_Chk03_SwFrR, SwFrR>();
		}

		public class MapNotBillSwFrKeyL<D extends RcvActCmn_Chk03_SwFrR, S extends SwFrR> extends MCRowMapper<D,S>{

			protected int _pegNo;

			public void setPegNo(int pegNo) {
				_pegNo = pegNo;
			}
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(RcvActCmn_Chk02_SwFrR.$bill_d_no, SwFrR.$bill_d_no);
			}

			@Override
			public void valueCopy(D dest, S src) {
				dest.hdr_dtl_peg(_pegNo);
			}
		}

		// BillDR→RcvActCmn_Upd03_BillDR
		protected MapNotBillSwFrDtlL<RcvActCmn_Upd03_BillDR,BillDR> createMapNotBillSwFrDtlL() {
			return new MapNotBillSwFrDtlL<RcvActCmn_Upd03_BillDR, BillDR>();
		}

		public class MapNotBillSwFrDtlL<D extends RcvActCmn_Upd03_BillDR, S extends BillDR> extends MCRowMapper<D,S>{

			protected int _pegNo;

			public void setPegNo(int pegNo) {
				_pegNo = pegNo;
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.hdr_dtl_peg(_pegNo);
			}
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$ac_ym, BillDR.$ac_ym);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$trd_cd, BillDR.$trd_cd);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$rcv_act_d_no, BillDR.$act_d_no);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$rcv_act_d_seq, BillDR.$act_d_seq);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$bill_d_no, BillDR.$bill_d_no);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$trd_ptn_typ, BillDR.$trd_ptn_typ);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$trd_cur_amt, BillDR.$trd_cur_amt);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$trd_cur_tax_amt, BillDR.$trd_cur_tax_amt);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$base_cur_amt, BillDR.$base_cur_amt);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$base_cur_tax_amt, BillDR.$base_cur_tax_amt);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$ar_dpt_cd, BillDR.$ar_dpt_cd);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$wg_cd, BillDR.$wg_cd);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$bill_mng_no, BillDR.$bill_mng_no);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$acst_cd, BillDR.$acst_cd);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$bcst_cd, BillDR.$bcst_cd);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$iv_no, BillDR.$iv_no);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$bill_d_iv_no, BillDR.$bill_d_iv_no);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$trd_cur_cd, BillDR.$trd_cur_cd);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$wrk_no, BillDR.$wrk_no);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$ar_typ, BillDR.$ar_typ);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$bill_dpt_cd, BillDR.$bill_dpt_cd);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$sw_to_bill_mng_no, BillDR.$sw_to_bill_mng_no);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$sw_to_acst_cd, BillDR.$sw_to_acst_cd);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$sw_to_bill_ymd, BillDR.$sw_to_bill_ymd);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$sw_to_schd_bill_dt, BillDR.$sw_to_schd_bill_dt);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$sw_to_bill_crryovr_times, BillDR.$sw_to_bill_crryovr_times);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$sw_to_ac_dt, BillDR.$sw_to_ac_dt);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$sw_fr_ac_dt, BillDR.$sw_fr_ac_dt);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$sw_fr_ar_ac_ym, BillDR.$sw_fr_ar_ac_ym);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$sw_fr_ar_trd_cd, BillDR.$sw_fr_ar_trd_cd);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$sw_fr_rcv_act_no, BillDR.$sw_fr_rcv_act_no);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$sw_fr_rcv_act_seq, BillDR.$sw_fr_rcv_act_seq);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$sw_fr_rcv_act_d_no, BillDR.$sw_fr_rcv_act_d_no);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$sw_fr_rcv_act_d_seq, BillDR.$sw_fr_rcv_act_d_seq);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$sw_to_ar_ac_ym, BillDR.$sw_to_ar_ac_ym);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$sw_to_ar_trd_cd, BillDR.$sw_to_ar_trd_cd);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$sw_to_rcv_act_no, BillDR.$sw_to_rcv_act_no);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$sw_to_rcv_act_seq, BillDR.$sw_to_rcv_act_seq);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$sw_to_rcv_act_d_no, BillDR.$sw_to_rcv_act_d_no);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$sw_to_rcv_act_d_seq, BillDR.$sw_to_rcv_act_d_seq);
				addColumnPathMap(RcvActCmn_Upd03_BillDR.$appl_amt, BillDR.$appl_amt);

			}
		}
	}

	// Mapper
	protected Map_RcvActCmn_Chk02_SwFrR_SwFrR<RcvActCmn_Chk02_SwFrR, SwFrR> createMap_RcvActCmn_Chk02_SwFrR_SwFrR() {
		return new Map_RcvActCmn_Chk02_SwFrR_SwFrR<RcvActCmn_Chk02_SwFrR, SwFrR>();
	}

	public class Map_RcvActCmn_Chk02_SwFrR_SwFrR<D extends RcvActCmn_Chk02_SwFrR, S extends SwFrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(RcvActCmn_Chk02_SwFrR.$peg_no, SwFrR.$peg_no);
			addColumnPathMap(RcvActCmn_Chk02_SwFrR.$bill_d_no, SwFrR.$bill_d_no);
		}

		@Override
		public void valueCopy(D dest, S src) {
			dest.hdr_dtl_peg(1);
		}
	}

	// Mapper
	protected Map_RcvActCmn_Chk02_HdrR_SwBaseR<RcvActCmn_Chk02_HdrR, SwBaseR> createMap_RcvActCmn_Chk02_HdrR_SwBaseR() {
		return new Map_RcvActCmn_Chk02_HdrR_SwBaseR<RcvActCmn_Chk02_HdrR, SwBaseR>();
	}

	public class Map_RcvActCmn_Chk02_HdrR_SwBaseR<D extends RcvActCmn_Chk02_HdrR, S extends SwBaseR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(RcvActCmn_Chk02_HdrR.$peg_no, SwBaseR.$peg_no);
			addColumnPathMap(RcvActCmn_Chk02_HdrR.$ac_dt, SwBaseR.$ac_dt);
		}

		@Override
		public void valueCopy(D dest, S src) {
			dest.hdr_dtl_peg(1);
		}
	}

	// Mapper
	protected Map_RcvActCmn_Chk02_SwToR_SwToR<RcvActCmn_Chk02_SwToR, SwToR> createMap_RcvActCmn_Chk02_SwToR_SwToR() {
		return new Map_RcvActCmn_Chk02_SwToR_SwToR<RcvActCmn_Chk02_SwToR, SwToR>();
	}

	public class Map_RcvActCmn_Chk02_SwToR_SwToR<D extends RcvActCmn_Chk02_SwToR, S extends SwToR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(RcvActCmn_Chk02_SwToR.$peg_no, SwToR.$peg_no);
			addColumnPathMap(RcvActCmn_Chk02_SwToR.$acst_cd, SwToR.$acst_cd);
			addColumnPathMap(RcvActCmn_Chk02_SwToR.$bcst_cd, SwToR.$bcst_cd);
		}

		@Override
		public void valueCopy(D dest, S src) {
			dest.hdr_dtl_peg(1);
		}
	}

	// Mapper
	protected Map_RcvActCmn_Chk03_HdrR_SwBaseR<RcvActCmn_Chk03_HdrR, SwBaseR> createMap_RcvActCmn_Chk03_HdrR_SwBaseR() {
		return new Map_RcvActCmn_Chk03_HdrR_SwBaseR<RcvActCmn_Chk03_HdrR, SwBaseR>();
	}

	public class Map_RcvActCmn_Chk03_HdrR_SwBaseR<D extends RcvActCmn_Chk03_HdrR, S extends SwBaseR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(RcvActCmn_Chk02_HdrR.$peg_no, SwBaseR.$peg_no);
			addColumnPathMap(RcvActCmn_Chk02_HdrR.$ac_dt, SwBaseR.$ac_dt);
		}

		@Override
		public void valueCopy(D dest, S src) {
			dest.hdr_dtl_peg(1);
		}
	}

	// Mapper
	protected Map_RcvActCmn_Chk03_SwToR_SwToR<RcvActCmn_Chk03_SwToR, SwToR> createMap_RcvActCmn_Chk03_SwToR_SwToR() {
		return new Map_RcvActCmn_Chk03_SwToR_SwToR<RcvActCmn_Chk03_SwToR, SwToR>();
	}

	public class Map_RcvActCmn_Chk03_SwToR_SwToR<D extends RcvActCmn_Chk03_SwToR, S extends SwToR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(RcvActCmn_Chk03_SwToR.$peg_no, SwToR.$peg_no);
			addColumnPathMap(RcvActCmn_Chk03_SwToR.$acst_cd, SwToR.$acst_cd);
			addColumnPathMap(RcvActCmn_Chk03_SwToR.$bcst_cd, SwToR.$bcst_cd);
		}

		@Override
		public void valueCopy(D dest, S src) {
			dest.hdr_dtl_peg(1);
		}
	}

	// Mapper
	protected Map_RcvActCmn_Chk03_SwFrR_SwFrR<RcvActCmn_Chk03_SwFrR, SwFrR> createMap_RcvActCmn_Chk03_SwFrR_SwFrR() {
		return new Map_RcvActCmn_Chk03_SwFrR_SwFrR<RcvActCmn_Chk03_SwFrR, SwFrR>();
	}

	public class Map_RcvActCmn_Chk03_SwFrR_SwFrR<D extends RcvActCmn_Chk03_SwFrR, S extends SwFrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(RcvActCmn_Chk03_SwFrR.$peg_no, SwFrR.$peg_no);
			addColumnPathMap(RcvActCmn_Chk03_SwFrR.$bill_d_no, SwFrR.$bill_d_no);
		}

		@Override
		public void valueCopy(D dest, S src) {
			dest.hdr_dtl_peg(1);
		}
	}

	//FMCB CUSTOM END
}