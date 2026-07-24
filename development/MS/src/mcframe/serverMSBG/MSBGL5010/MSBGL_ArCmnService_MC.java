package mcframe.serverMSBG.MSBGL5010;

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
import java.util.ArrayList;
import java.util.List;

import static mcframe.serverMSBG.MSBGL5010.Query.*;
import mcframe.serverMSBG.MSBGL5020.*;
import mcframe.serverMSBG.MSBGL5120.*;
import mcframe.serverMAUC.MAUCL1110.*;
import static mcframe.commonFX.notice.FX_Msg.FXUDL0010;
import mcframe.serverCore.mcjdbc.MCDBTransaction;
import mcframe.serverCore.mcjdbc.MCTransactionManager;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.createDBTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.setCurrentDBTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_ArCmnService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_ArCmnService_MC extends MSBGL_ArCmnService_MC_A{
	//FMCB CUSTOM START

	/**
	 * ArCmn_Upd01オペレーション.<p>
	 *
	 */
	public class ArCmn_Upd01 extends MSBGL_ArCmnService_MC_A.ArCmn_Upd01 {

		protected MCMessageList _schdRcvDtMsgList;

		protected MCList<MAM_BP_R> _bcstL;

		protected MCDBTransaction _lockTran;

		/**
		 * 請求書ヘッダ履歴更新リスト
		 */
		protected MCList<MST_BILL_R> _updBillHisL = null;
		
		/**
		 * 請求書ヘッダ履歴登録リスト
		 */
		protected MCList<MST_BILL_R> _insBillHisL = null;
		/**
		 * 発行済請求書ＮＯリスト
		 */
		protected MCList<MST_BILL_R> _isPrintBillNoL = MCList.create(MST_BILL_R.class);
		
		@Override
		protected void call() {
			super.call();
		}

		/**
		 * 処理を実行します。<p>
		 */
		@Override
		protected void doIt() {
			initMsgList();
			editUp();
			arMain();
		}

		protected void initMsgList() {
			_schdRcvDtMsgList = new MCMessageList();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {

			// 得意先情報を取得
			MCList<ArCmn_Upd01_DtlR> cstGbL = up0().groupBy(ArCmn_Upd01_DtlR.$cst_cd);
			MCList<MAM_BP_R> cstL = MCList.create(MAM_BP_R.class);
			MAM_BP_R cstRt = MAM_BP_R.create("T");
			MCQueryApiBuilder cstL_bldr = MCQueryApiBuilder.create(cstRt);
			cstL_bldr.setSelect(cstRt.bp_cd);
			cstL_bldr.addSelect(cstRt.wrk_ar_flg);
			cstL_bldr.setWhere(cstRt.bp_cd.eq(bind("cst_cd")));
			dbSelect("MSBGL5010_MAM_BP_S01", cstL, cstL_bldr, cstGbL);

			// 案件情報を取得
			MCList<ArCmn_Upd01_DtlR> wrkNoGbL = up0().groupBy(ArCmn_Upd01_DtlR.$wrk_no);
			MCList<MST_WRK_R> wrkL = MCList.create(MST_WRK_R.class);
			MST_WRK_R wgR = MST_WRK_R.create("T");
			MCQueryApiBuilder wrkL_bldr = MCQueryApiBuilder.create(wgR);
			wrkL_bldr.setSelect(wgR.wrk_no);
			wrkL_bldr.addSelect(wgR.wrk_ar_flg);
			dbSelectKey("MSBGL5010_MST_WRK_S01", wrkL, wrkL_bldr, wrkNoGbL);

			// 請求先情報を取得
			MCList<ArCmn_Upd01_DtlR> bcstGbL = up0().groupBy(ArCmn_Upd01_DtlR.$bcst_cd);
			_bcstL = MCList.create(MAM_BP_R.class);
			MAM_BP_R bpR = MAM_BP_R.create("T");
			MCQueryApiBuilder bcstL_bldr = MCQueryApiBuilder.create(bpR);
			bcstL_bldr.setWhere(bpR.bp_cd.eq(bind("bcst_cd")));
			dbSelect("MSBGL5010_MAM_BP_S02", _bcstL, bcstL_bldr, bcstGbL);

			// 請求先情報をキャッシュする
			MSBGL_ArUtil.initBp();
			MSBGL_ArUtil.setBp(_bcstL);

			// 売掛先情報を取得
			MCList<ArCmn_Upd01_DtlR> acstGbL = up0().groupBy(ArCmn_Upd01_DtlR.$acst_cd);
			MCList<MAM_BP_R> acstL = MCList.create(MAM_BP_R.class);
			MAM_BP_R acstR = MAM_BP_R.create("T");
			MCQueryApiBuilder acstL_bldr = MCQueryApiBuilder.create(acstR);
			acstL_bldr.setSelect(acstR.bp_cd);
			acstL_bldr.addSelect(acstR.acst_flg);
			acstL_bldr.setWhere(acstR.bp_cd.eq(bind("acst_cd")));
			dbSelect("MSBGL5010_MAM_BP_S03", acstL, acstL_bldr, acstGbL);

			MCIndexKey acstIdk = acstL.createIndex(MAM_BP_R.$bp_cd);

			// 品目情報を取得
			MCList<ArCmn_Upd01_DtlR> itmGbL = up0().groupBy(ArCmn_Upd01_DtlR.$itm_cd,
					ArCmn_Upd01_DtlR.$itm_sub1, ArCmn_Upd01_DtlR.$itm_sub2, ArCmn_Upd01_DtlR.$itm_sub3);
			MCList<MAM_ITM_R> itmL = MCList.create(MAM_ITM_R.class);
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(t);
			itmL_bldr.setSelect(t.itm_cd);
			itmL_bldr.addSelect(t.itm_sub1);
			itmL_bldr.addSelect(t.itm_sub2);
			itmL_bldr.addSelect(t.itm_sub3);
			itmL_bldr.addSelect(t.dscnt_itm_flg);
			dbSelectKey("MSBGL5010_MAM_ITM_S01", itmL, itmL_bldr, itmGbL);

			// 品目情報をキャッシュする
			MSBGL_ArUtil.initItm();
			MSBGL_ArUtil.setItm(itmL);

			MCIndexKey itmIdk = itmL.createIndex(MAM_ITM_R.$itm_cd,
					MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);

			for (ArCmn_Upd01_DtlR up0R : up0()) {

				// 得意先情報から案件別債権管理ＦＬＧを設定
				MAM_BP_R cstR = cstL.getFirst(MAM_BP_R.$bp_cd, up0R.cst_cd());
				if (!isNull(cstR)) {
					up0R.cst_wrk_ar_flg(cstR.wrk_ar_flg());
				}

				// 案件情報から案件別債権管理ＦＬＧを設定
				MST_WRK_R wrkR = wrkL.getFirst(MST_WRK_R.$wrk_no, up0R.wrk_no());
				if (!isNull(wrkR)) {
					up0R.wrk_ar_flg(wrkR.wrk_ar_flg());
				}

				if (!isNull(up0R.acst_cd())) {
					MAM_BP_R chkAcstR = acstL.getFirst(acstIdk, up0R.acst_cd());
					if (isNull(chkAcstR) || !chkAcstR.acst_flg()) {
						throw new MCAppException(MSBGL0130, up0R.acst_cd());
					}
				}

				// 請求先情報から請求部門区分を設定
				MAM_BP_R bcstR = _bcstL.getFirst(MAM_BP_R.$bp_cd, up0R.bcst_cd());
				if (!isNull(bcstR)) {
					up0R.bill_dpt_typ(bcstR.bill_dpt_typ());
				}

				if (!isNull(up0R.bcst_cd())) {
					if (isNull(bcstR) || !bcstR.bcst_flg()) {
						throw new MCAppException(MSBGL0131, up0R.bcst_cd());
					}
				}

				// 品目情報から値引品目ＦＬＧを設定
				MAM_ITM_R itmR = itmL.getFirst(itmIdk, up0R.toArray(itmIdk.getKeys()));
				if (!isNull(itmR)) {
					up0R.dscnt_itm_flg(itmR.dscnt_itm_flg());
				}

				setAmt(up0R);
				setArWrkCd(up0R);
				setBillClDt(up0R, bcstR);
			}

			setBillDptCd();
			setBillIvNo();
			setRcvActDTaxAmt();
		}

		/**
		 * 上り電文の金額を設定する<br />
		 * 上り電文の金額が設定されていないときは0を設定する
		 * 
		 * @param up0R 上り電文
		 */
		protected void setAmt(ArCmn_Upd01_DtlR up0R) {
			if (isNull(up0R.trd_cur_amt1())) {
				up0R.trd_cur_amt1(MCNumber.ZERO);
			}
			if (isNull(up0R.trd_cur_amt2())) {
				up0R.trd_cur_amt2(MCNumber.ZERO);
			}
			if (isNull(up0R.trd_cur_amt3())) {
				up0R.trd_cur_amt3(MCNumber.ZERO);
			}
			if (isNull(up0R.trd_cur_dscnt_amt())) {
				up0R.trd_cur_dscnt_amt(MCNumber.ZERO);
			}
			if (isNull(up0R.base_cur_amt1())) {
				up0R.base_cur_amt1(MCNumber.ZERO);
			}
			if (isNull(up0R.base_cur_amt2())) {
				up0R.base_cur_amt2(MCNumber.ZERO);
			}
			if (isNull(up0R.base_cur_amt3())) {
				up0R.base_cur_amt3(MCNumber.ZERO);
			}
			if (isNull(up0R.base_cur_dscnt_amt())) {
				up0R.base_cur_dscnt_amt(MCNumber.ZERO);
			}
			if (isNull(up0R.wtax_amt())) {
				up0R.wtax_amt(MCNumber.ZERO);
			}
			if (isNull(up0R.exc_gain_loss())) {
				up0R.exc_gain_loss(MCNumber.ZERO);
			}
			if (isNull(up0R.trd_cur_tax_amt1())) {
				up0R.trd_cur_tax_amt1(MCNumber.ZERO);
			}
			if (isNull(up0R.trd_cur_tax_amt2())) {
				up0R.trd_cur_tax_amt2(MCNumber.ZERO);
			}
			if (isNull(up0R.trd_cur_tax_amt3())) {
				up0R.trd_cur_tax_amt3(MCNumber.ZERO);
			}
			if (isNull(up0R.base_cur_tax_amt1())) {
				up0R.base_cur_tax_amt1(MCNumber.ZERO);
			}
			if (isNull(up0R.base_cur_tax_amt2())) {
				up0R.base_cur_tax_amt2(MCNumber.ZERO);
			}
			if (isNull(up0R.base_cur_tax_amt3())) {
				up0R.base_cur_tax_amt3(MCNumber.ZERO);
			}
		}

		/**
		 * 案件別債権管理ＦＬＧを利用する場合<BR>
		 * 案件別の請求を行う場合はコンテナのar_wrk_noに案件ＮＯをセットする。<BR>
		 * 案件別の請求を行わない場合はコンテナのar_wrk_noに何も設定しない<BR>
		 * それ以外の場合<BR>
		 * ar_wrk_noに案件ＮＯをセットする。
		 * 
		 * @param up0R
		 */
		protected void setArWrkCd(ArCmn_Upd01_DtlR up0R) {

			if (isNull(up0R.wrk_no())) {
				up0R.ar_wrk_no(null);
				return;
			}
			if (!MSC_AR_OPE_TYP.isSLS_ACT(up1().ar_ope_typ())) {
				up0R.ar_wrk_no(up0R.wrk_no());
				return;
			}
			if (up0R.cst_wrk_ar_flg()) {
				up0R.ar_wrk_no(up0R.wrk_no());
			}
			else {
				if (up0R.wrk_ar_flg()) {
					up0R.ar_wrk_no(up0R.wrk_no());
				}
			}
		}

		/**
		 * 請求締年月日、請求部門基準日の設定<br />
		 * 
		 * @param up0R 上り電文
		 * @param bcstR 請求先情報
		 */
		protected void setBillClDt(ArCmn_Upd01_DtlR up0R, MAM_BP_R bcstR) {
			// 未請求残高振替払出、請求繰越回数更新元、請求時税差額調整以外の場合
			// 請求締年月日と請求部門ＣＤを再設定する。
			if (!MSC_AR_OPE_TYP.isARSW_OUT_NOT_BILL_BAL(up1().ar_ope_typ())
					&& !MSC_AR_OPE_TYP.isBILL_CRRYOVR_TIMES_ORG(up1().ar_ope_typ())
					&& !MSC_AR_OPE_TYP.isTAX_DIFF_BILL_CL(up1().ar_ope_typ())) {

				MCDate schdBillDt = nvl(MSBGL_ArUtil.getBillSchdDt(up0R.bcst_cd(),
						up0R.bill_basis_dt(), up0R.bill_crryovr_times(), bcstR),
						MAC_Y4M.NULL_VAL.value());

				// 請求残高振替払出の場合、上り電文の請求部門ＣＤが有効かどうか判断し、
				// 有効な場合はそのまま処理する。無効な場合は、上り電文の請求部門ＣＤを含めた請求のキーで
				// 請求ヘッダの最新の請求締年月日を取得して、取得した請求締年月日ベースで処理する
				if (MSC_AR_OPE_TYP.isARSW_OUT_BILL_BAL(up1().ar_ope_typ())) {
					if (isNull(checkDptCd(up0R.bill_dpt_cd(), schdBillDt))) {
						schdBillDt = getMaxBillClDt(up0R);
					}
				}
				up0R.bill_cl_dt(schdBillDt);

				// 売上実績、請求残高振替受入の場合、請求締年月日を基準に請求部門基準日を設定する
				if (MSC_AR_OPE_TYP.isSLS_ACT(up1().ar_ope_typ()) ||
						MSC_AR_OPE_TYP.isARSW_IN_BILL_BAL(up1().ar_ope_typ())) {
					if (MAC_Y4M.isNULL_VAL(up0R.bill_cl_dt())) {
						up0R.bill_dpt_base_dt(up0R.bill_basis_dt());
					}
					else {
						up0R.bill_dpt_base_dt(up0R.bill_cl_dt());
					}
				}
			}
		}

		/**
		 * 請求部門の設定<br />
		 * 請求部門区分に従い、請求部門ＣＤを取得して上り電文に設定する
		 */
		protected void setBillDptCd() {
			// 売上実績、請求残高振替受入の場合、請求締年月日を基準に請求部門を取り直す
			if (MSC_AR_OPE_TYP.isSLS_ACT(up1().ar_ope_typ()) ||
					MSC_AR_OPE_TYP.isARSW_IN_BILL_BAL(up1().ar_ope_typ())) {

				String[] bcstGrpByKey = new String[]{
						ArCmn_Upd01_DtlR.$bcst_cd,
						ArCmn_Upd01_DtlR.$bill_dpt_typ,
						ArCmn_Upd01_DtlR.$bill_dpt_base_dt};

				String[] billDptGrpByKey = new String[]{
						ArCmn_Upd01_DtlR.$bill_dpt_cd,
						ArCmn_Upd01_DtlR.$bill_dpt_typ,
						ArCmn_Upd01_DtlR.$bill_dpt_base_dt};

				String[] billDptKey = new String[]{
						ArCmn_Upd01_DtlR.$bcst_cd,
						ArCmn_Upd01_DtlR.$bill_dpt_base_dt};

				String[] befBillDptKey = new String[]{
						ArCmn_Upd01_DtlR.$bef_bill_dpt_cd,
						ArCmn_Upd01_DtlR.$bill_dpt_base_dt};

				// 請求先ＣＤ、請求部門区分、請求部門基準日でグルーピング
				MCList<ArCmn_Upd01_DtlR> bcstL = up0().groupBy(bcstGrpByKey);
				// 請求部門区分が「3：請求部門」のリストを抽出する
				MCList<ArCmn_Upd01_DtlR> subBillL = bcstL.subList(
						r -> MAC_BILL_DPT_TYP.isBILL(r.bill_dpt_typ()));
				// ファンクションを一括実行して請求部門ＣＤを取得する
				execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_BP$F_GET_BCST_DPT_CD", "01"),
						MABSFunction.getFunctionExecuter("MAPA_BP$F_GET_BCST_DPT_CD"),
						ArCmn_Upd01_DtlR.$bill_dpt_cd, subBillL, billDptKey);
				// 請求部門ＣＤをキャッシュする
				MSBGL_ArUtil.initBcstDpt();
				for (ArCmn_Upd01_DtlR r : subBillL) {
					MSBGL_ArUtil.setBillDptCd(r.bill_dpt_cd(), r.bcst_cd(), r.bill_dpt_base_dt());
				}
				MCIndexKey idxKey = subBillL.createIndex(billDptKey);
				// 請求部門区分に従い請求部門を設定する
				for (ArCmn_Upd01_DtlR r : up0()) {
					if (MAC_BILL_DPT_TYP.isBILL(r.bill_dpt_typ())) {
						ArCmn_Upd01_DtlR subR = subBillL.getFirst(
								idxKey, r.toArray(idxKey.getKeys()));
						if (!isNull(subR)) {
							r.bill_dpt_cd(subR.bill_dpt_cd());
						}
					}
					else if (MAC_BILL_DPT_TYP.isSLS(r.bill_dpt_typ())) {
						r.bill_dpt_cd(r.sls_dpt_cd());
					}
					else if (MAC_BILL_DPT_TYP.isAR(r.bill_dpt_typ())) {
						r.bill_dpt_cd(r.ar_dpt_cd());
					}
				}
				// 請求部門区分が「1：売上部門」、「2：債権部門」は部門変更対応マスタから請求部門を取り直す
				MCList<ArCmn_Upd01_DtlR> billDptL = up0().groupBy(billDptGrpByKey);
				MCList<ArCmn_Upd01_DtlR> subSlsArL = billDptL.subList(
						r -> !MAC_BILL_DPT_TYP.isBILL(r.bill_dpt_typ()));
				for (ArCmn_Upd01_DtlR r : subSlsArL) {
					// 請求部門ＣＤを変更前請求部門ＣＤに設定する
					r.bef_bill_dpt_cd(r.bill_dpt_cd());
				}
				MAUCL_DptUtil.setDpt(subSlsArL,
						ArCmn_Upd01_DtlR.$bill_dpt_cd, ArCmn_Upd01_DtlR.$bill_dpt_base_dt);
				idxKey = subSlsArL.createIndex(befBillDptKey);
				for (ArCmn_Upd01_DtlR r : up0()) {
					if (MAC_BILL_DPT_TYP.isSLS(r.bill_dpt_typ()) ||
							MAC_BILL_DPT_TYP.isAR(r.bill_dpt_typ())) {
						ArCmn_Upd01_DtlR subR = subSlsArL.getFirst(
								idxKey, r.bill_dpt_cd(), r.bill_dpt_base_dt());
						if (!isNull(subR)) {
							r.bill_dpt_cd(subR.bill_dpt_cd());
						}
					}
				}
			}
		}

		/**
		 * 部門判定<br />
		 * 日付に対して部門が有効かどうか判定する
		 * 
		 * @param dptCd 部門ＣＤ
		 * @param dt 日付
		 * @return 判定結果
		 */
		protected String checkDptCd(String dptCd, MCDate dt) {
			MCRow bindR = MCRow.create();
			bindR.setStringNE("I_DPT_CD", dptCd);
			bindR.setDateNE("I_DT", dt);
			return execFuncString(createSqlId(LOGIC_ID, "MAPA_DPT$F_CHECK_DPT_CD", "01"),
					MAPA_DPT$F_CHECK_DPT_CD(bind("i_dpt_cd"), bind("i_dt")), bindR);
		}

		/**
		 * 最新請求締年月日取得<br />
		 * 請求締年月日以外の請求のキーをもとに請求ヘッダを検索し、最新の請求締年月日を取得する。
		 * 
		 * @param up0R 上り電文
		 * @return 最新の請求締年月日
		 */
		protected MCDate getMaxBillClDt(ArCmn_Upd01_DtlR up0R) {
			MST_BILL_R billR = MST_BILL_R.create();
			MST_BILL_R t = MST_BILL_R.create("T");
			MCQueryApiBuilder billR_bldr = MCQueryApiBuilder.create(t);
			billR_bldr.addMax(t.bill_cl_dt, MST_BILL_R.$bill_cl_dt);
			billR_bldr.setWhere(t.bcst_cd.eq(bind("1")), up0R.bcst_cd());
			billR_bldr.addWhereWithAnd(t.trd_cur_cd.eq(bind("1")), up0R.trd_cur_cd());
			billR_bldr.addWhereWithAnd(t.iv_no.eq(bind("1")), nvl(up0R.bill_iv_no(), MAC_STR.NULL_VAL.value()));
			billR_bldr.addWhereWithAnd(bracket(t.wrk_no.eq(bind("1"))
					.or(t.wrk_no.isNull())
					.and(bind("1").isNull())),
					up0R.wrk_no());
			billR_bldr.addWhereWithAnd(t.bill_dpt_cd.eq(bind("1")), up0R.bill_dpt_cd());
			dbSelect("MSBGL5010_MST_BILL_S01", billR, billR_bldr);
			return billR.bill_cl_dt();
		}

		/**
		 * 請求ヘッダ用のインボイスＮＯを設定する<br>
		 * 請求ヘッダ用のインボイスＮＯは、売上都度請求の場合のみ設定する
		 */
		protected void setBillIvNo() {
			MCList<ArCmn_Upd01_DtlR> crtSlsL = MCList.create(ArCmn_Upd01_DtlR.class), canSlsL = MCList.create(ArCmn_Upd01_DtlR.class);

			// 取消分の請求明細取得用
			MCList<MST_SLS_ACT_D_R> canSlsWkL = MCList.create(MST_SLS_ACT_D_R.class);

			for (ArCmn_Upd01_DtlR upR : up0()) {
				// 売上実績のみ
				// ※これら以外は呼び出し元で設定するので対象から除外する
				if (MSC_AR_OPE_TYP.isSLS_ACT(up1().ar_ope_typ())) {

					if (MAC_SLIP_STS_TYP.isCRT(upR.slip_sts_typ())) {
						crtSlsL.add(upR);
					}
					else if (MAC_SLIP_STS_TYP.isCAN(upR.slip_sts_typ())) {
						canSlsL.add(upR);

						MST_SLS_ACT_D_R r = canSlsWkL.add();
						r.sls_act_d_no(upR.act_d_no());
						r.sls_act_d_seq(upR.act_d_seq().subtract(1)); // この時点では取消分は登録されていないので無効分を利用する
					}
				}
			}

			if (!crtSlsL.isEmpty()) {
				for (ArCmn_Upd01_DtlR upR : crtSlsL) {
					if (MSBGL_ArUtil.isEachSls(upR.bcst_cd())) {
						// 新規分は取引先マスタに従って請求ヘッダ用のインボイスＮＯを設定する
						upR.bill_iv_no(upR.iv_no());
					}
				}
			}
			if (!canSlsL.isEmpty()) {
				MCQueryApiBuilder canSlsWkL_bldr = MCQueryApiBuilder.create(MST_SLS_ACT_D_R.create("T"));
				dbWkDelete("MSBGL5010_MSW_SLS_ACT_D_D01", canSlsWkL_bldr.getBaseDbc());
				dbWkInsert("MSBGL5010_MSW_SLS_ACT_D_I01", canSlsWkL, canSlsWkL_bldr.getBaseDbc());

				MSW_SLS_ACT_D_KEY_R w = MSW_SLS_ACT_D_KEY_R.create("W");
				MST_BILL_R t2 = MST_BILL_R.create("T2");
				MCList<MST_BILL_D_R> dbc = MCList.create(MST_BILL_D_R.class);
				MST_BILL_D_R t = MST_BILL_D_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				dbc.addBooleanColumn("bill_each_sls_flg");
				dbc_bldr.setSelect(t.act_d_no, t.act_d_seq.add(value(1)).as("act_d_seq"), t2.bill_each_sls_flg);
				dbc_bldr.addInnerJoin(w, bracket(w.sls_act_d_no.eq(t.act_d_no)
						.and(w.sls_act_d_seq.eq(t.act_d_seq))));
				dbc_bldr.addInnerJoin(t2, bracket(t2.bill_mng_no.eq(t.bill_mng_no)));
				dbc_bldr.setWhere(t.bill_d_typ.eq(value(MSC_BILL_D_TYP.SLS.value())));
				dbSelect("MSBGL5010_MST_BILL_D_S01", dbc, dbc_bldr);

				MCIndexKey idx = dbc.createIndex(MST_BILL_D_R.$act_d_no, MST_BILL_D_R.$act_d_seq);
				for (ArCmn_Upd01_DtlR upR : canSlsL) {
					MST_BILL_D_R billDR = dbc.getFirst(idx, upR.act_d_no(), upR.act_d_seq());
					if (!isNull(billDR) && billDR.getBoolean("bill_each_sls_flg")) {
						// 取消分は請求ヘッダに従って請求ヘッダ用のインボイスＮＯを設定する
						upR.bill_iv_no(upR.iv_no());
					}
				}
				dbWkDelete("MSBGL5010_MSW_SLS_ACT_D_D02", canSlsWkL_bldr.getBaseDbc());
			}
		}
		/**
		 * 上り電文に対応する入金実績明細の税額を設定する
		 */
		protected void setRcvActDTaxAmt() {
			MCList<ArCmn_Upd01_DtlR>
				up0L = up0().subList(r -> MSC_BILL_D_TYP.isRCV(r.bill_d_typ()));
			if (up0L.isEmpty()) {
				return;
			}
			
			MST_RCV_ACT_D_R t = MST_RCV_ACT_D_R.create("T");
			MST_RCV_ACT_R RCVACT = MST_RCV_ACT_R.create("RCVACT");
			MAM_STTL_R STTL1 = MAM_STTL_R.create("STTL1");
			MAM_STTL_R STTL2 = MAM_STTL_R.create("STTL2");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(
				t.rcv_act_d_no, t.rcv_act_d_seq,
				t.trd_cur_tax_amt1, t.trd_cur_tax_amt2, t.trd_cur_tax_amt3,
				t.base_cur_tax_amt1, t.base_cur_tax_amt2, t.base_cur_tax_amt3
			);
			bldr.addSelect(
					decode(STTL1.bill_tax_disp_flg, value(true), STTL1.bill_tax_disp_flg,
							STTL2.bill_tax_disp_flg).as("bill_tax_disp_flg"));
			bldr.addLeftOuterJoin(RCVACT,
				t.rcv_act_no.eq(RCVACT.rcv_act_no)
				.and(t.rcv_act_seq.eq(RCVACT.rcv_act_seq))
			);
			bldr.addLeftOuterJoin(STTL1,
				STTL1.sttl_cd.eq(RCVACT.ar_sttl_cd1)
			);
			bldr.addLeftOuterJoin(STTL2,
				STTL2.sttl_cd.eq(RCVACT.ar_sttl_cd2)
			);
			bldr.setWhere(
				t.rcv_act_d_no.eq(bind("act_d_no"))
				.and(t.rcv_act_d_seq.eq(bind("act_d_seq")))
			);
			
			MCList<MST_RCV_ACT_D_R> rsltL = MCList.create(MST_RCV_ACT_D_R.class);
			rsltL.addBooleanColumn("bill_tax_disp_flg");
			dbSelect("MSBGL5010_MST_RCV_ACT_D_S02", rsltL, bldr, up0L);
			MCIndexKey idx = rsltL.createIndex(MST_RCV_ACT_D_R.$rcv_act_d_no, MST_RCV_ACT_D_R.$rcv_act_d_seq);
			
			for (ArCmn_Upd01_DtlR r : up0L) {
				MST_RCV_ACT_D_R rcvActR = rsltL.getFirst(idx, r.act_d_no(), r.act_d_seq());
				if (!isNull(rcvActR)) {
					r.trd_cur_tax_amt1(rcvActR.trd_cur_tax_amt1());
					r.trd_cur_tax_amt2(rcvActR.trd_cur_tax_amt2());
					r.trd_cur_tax_amt3(rcvActR.trd_cur_tax_amt3());
					r.base_cur_tax_amt1(rcvActR.base_cur_tax_amt1());
					r.base_cur_tax_amt2(rcvActR.base_cur_tax_amt2());
					r.base_cur_tax_amt3(rcvActR.base_cur_tax_amt3());
					r.setBooleanNE("bill_tax_disp_flg", rcvActR.getBoolean("bill_tax_disp_flg"));
				}
			}
		}

		/**
		 * 請求、売掛情報の登録更新メイン処理<br />
		 * 上り電文をもとに以下のテーブルを更新する
		 * <ul>
		 * <li>MST_BILL</li>
		 * <li>MST_BILL_ACST</li>
		 * <li>MST_RCV_SCHD</li>
		 * <li>MST_RCV_SCHD_APPL_ACT</li>
		 * <li>MST_AR_APPL_SCHD</li>
		 * <li>MST_AR_APPL_ACT</li>
		 * <li>MST_BILL_D</li>
		 * <li>MST_BILL_D_APPL_BAL</li>
		 * <li>MST_MLY_AR_BAL</li>
		 * </ul>
		 */
		protected void arMain() {

			preCheck();

			setCrroverMons();

			seqCache();

			createIndex();

			MCList<ArCmn_Upd01_BillGrpR> billGrpL = getBillGrpL();

			_updBillHisL = MCList.create(MST_BILL_R.class);
			_insBillHisL = MCList.create(MST_BILL_R.class);

			lockBill(billGrpL.clone());

			for (ArCmn_Upd01_BillGrpR r : billGrpL) {
				setIvNo(r);
				if (isEachSls(r.bcst_cd(), r.slip_sts_typ(), r.bill_iv_no())) {
					updRcv(r);
				}

				MST_BILL_R regBillR = regBill(r);

				regRcvSchd(r, regBillR);

				setBillMngNo(r, regBillR);

				regBillAcst(r, regBillR);
				calcTax(r, regBillR);
				if (regBillR.bill_each_sls_flg()) {
					_insBillHisL.add(regBillR);
				}
			}
			if (!billGrpL.isEmpty()) {
				regMlyArBal();
			}
			updBillHis();
			insBillHis();
		}

		protected void lockBill(MCList<ArCmn_Upd01_BillGrpR> billGrpL) {
			for (ArCmn_Upd01_BillGrpR r : billGrpL) {
				if (!isEachSls(r.bcst_cd(), r.slip_sts_typ(), r.bill_iv_no())) {
					r.iv_no(MAC_STR.NULL_VAL.value());
				}
			}
			
			MCDBTransaction curTran = dbTran();
			try {
				MCList<ArCmn_Upd01_BillGrpR> billKeyGrpL = billGrpL.groupBy(getBillKeys());
				billKeyGrpL.sort(getBillKeys());
				for (ArCmn_Upd01_BillGrpR r : billKeyGrpL) {	
					lockBill(r);
				}
			}
			finally {
				unlock();
				setCurrentDBTran(curTran);
			}
		}
		
		protected String[] getBillKeys() {
			return MST_BILL_LOCK_R.create().getKeyColumn();
		}
		
		protected void lockBill(ArCmn_Upd01_BillGrpR r) {
			MST_BILL_LOCK_R tgtR = MST_BILL_LOCK_R.create();
			tgtR.bcst_cd(r.bcst_cd());
			tgtR.trd_cur_cd(r.trd_cur_cd());
			tgtR.iv_no(r.iv_no());
			tgtR.wrk_no(r.wrk_no());
			tgtR.bill_dpt_cd(r.bill_dpt_cd());
			
			MST_BILL_LOCK_R lockedR = tryLockBill(tgtR);
			if (isNull(lockedR.bcst_cd())) {
				try {
					MST_BILL_LOCK_R dbc = MST_BILL_LOCK_R.create("BILL_LOCK");
					MCQueryApiBuilder billLockDbc_bldr = MCQueryApiBuilder.create(dbc);
					billLockDbc_bldr.buildInsert("MSBGL5010_MST_BILL_LOCK_I01").executeUpdate(getLockTran(), tgtR, null);
					getLockTran().commit();
				}
				catch(MCException e) {
					if (isSame(FXUDL0010, e.getID())) {
						getLockTran().rollback();
					}
					else {
						throw e;
					}
				}
				lockedR = tryLockBill(tgtR);
				if (isNull(lockedR.bcst_cd())) {
					throw new MCAppException("FCBCC0110");
				}
			}
		}

		protected MST_BILL_LOCK_R tryLockBill(MST_BILL_LOCK_R tgtR) {
			MST_BILL_LOCK_R dbc = MST_BILL_LOCK_R.create("BILL_LOCK");
			MCQueryApiBuilder billLockDbc_bldr = MCQueryApiBuilder.create(dbc);
			billLockDbc_bldr.setSelect(dbc.bcst_cd);
			
			MST_BILL_LOCK_R lockedR = MST_BILL_LOCK_R.create();
			dbSelectKeyForUpdate("MSBGL5010_MST_BILL_LOCK_S01", lockedR, billLockDbc_bldr, tgtR);
			return lockedR;
		}
		
		protected void lockMlyArBal(MCList<MST_MLY_AR_BAL_R> mlyArBalL) {
			MCDBTransaction curTran = dbTran();
			try {
				MCList<MST_MLY_AR_BAL_R> mlyArBalKeyL = mlyArBalL.groupBy(getMlyArBalKeys());
				mlyArBalKeyL.sort(getMlyArBalKeys());
				for (MST_MLY_AR_BAL_R r : mlyArBalKeyL) {	
					lockMlyArBalKey(r);
				}
			}
			finally {
				unlock();
				setCurrentDBTran(curTran);
			}
		}
		
		protected String[] getMlyArBalKeys() {
			return MST_MLY_AR_BAL_LOCK_R.create().getKeyColumn();
		}
		
		protected void lockMlyArBalKey(MST_MLY_AR_BAL_R r) {
			MST_MLY_AR_BAL_LOCK_R tgtR = MST_MLY_AR_BAL_LOCK_R.create();
			tgtR.acst_cd(r.acst_cd());
			tgtR.ar_dpt_cd(r.ar_dpt_cd());
			tgtR.trd_cur_cd(r.trd_cur_cd());
			tgtR.iv_no(r.iv_no());
			tgtR.wrk_no(r.wrk_no());
			
			MST_MLY_AR_BAL_LOCK_R lockedR = tryLockMlyArBal(tgtR);
			if (isNull(lockedR.acst_cd())) {
				try {
					MST_MLY_AR_BAL_LOCK_R dbc = MST_MLY_AR_BAL_LOCK_R.create("MLY_AR_BAL_LOCK");
					MCQueryApiBuilder mlyArBalLockDbc_bldr = MCQueryApiBuilder.create(dbc);
					mlyArBalLockDbc_bldr.buildInsert("MSBGL5010_MST_MLY_AR_BAL_LOCK_I01").executeUpdate(getLockTran(), tgtR, null);
					getLockTran().commit();
				}
				catch(MCException e) {
					if (isSame(FXUDL0010, e.getID())) {
						getLockTran().rollback();
					}
					else {
						throw e;
					}
				}
				lockedR = tryLockMlyArBal(tgtR);
				if (isNull(lockedR.acst_cd())) {
					throw new MCAppException("FCBCC0110");
				}
			}
		}

		protected MST_MLY_AR_BAL_LOCK_R tryLockMlyArBal(MST_MLY_AR_BAL_LOCK_R tgtR) {
			MST_MLY_AR_BAL_LOCK_R dbc = MST_MLY_AR_BAL_LOCK_R.create("MLY_AR_BAL_LOCK");
			MCQueryApiBuilder mlyArBalLockDbc_bldr = MCQueryApiBuilder.create(dbc);
			mlyArBalLockDbc_bldr.setSelect(dbc.acst_cd);
			
			MST_MLY_AR_BAL_LOCK_R lockedR = MST_MLY_AR_BAL_LOCK_R.create();
			dbSelectKeyForUpdate("MSBGL5010_MST_MLY_AR_BAL_LOCK_S01", lockedR, mlyArBalLockDbc_bldr, tgtR);
			return lockedR;
		}
		
		protected MCDBTransaction getLockTran() {
			if (_lockTran == null) {
				_lockTran = createDBTran(false);
			}
			return _lockTran;
		}

		protected void unlock() {
			if (_lockTran != null) {
				MCTransactionManager.releaseDBTran(_lockTran);
				_lockTran = null;
			}
		}
		protected void updRcv(ArCmn_Upd01_BillGrpR r) {
			String[] keyArr = new String[] {
					ArCmn_Upd01_DtlR.$bill_mng_no, ArCmn_Upd01_DtlR.$trd_ptn_typ
			};
			Comparable<?>[] valArr = new Comparable[] {
					r.bill_mng_no(), MAC_TRD_PTN_TYP.SETOFF_ADV_AR.value()
			};
			MCList<ArCmn_Upd01_DtlR> up0L = up0().subList(keyArr, valArr);
			if (isNull(up0L) || up0L.size() == 0) {
				return;
			}

			for (MCList<ArCmn_Upd01_DtlR> grpL : up0L.groupList(ArCmn_Upd01_DtlR.$act_no, ArCmn_Upd01_DtlR.$act_seq)) {
				MST_RCV_ACT_R recvActR = MST_RCV_ACT_R.create();
				MST_RCV_ACT_R RCVACT = MST_RCV_ACT_R.create("RCVACT");
				MCQueryApiBuilder recvActR_bldr = MCQueryApiBuilder.create(RCVACT);
				recvActR.rcv_act_no(grpL.get(0).act_no());
				recvActR.rcv_act_seq(grpL.get(0).act_seq());
				recvActR_bldr.setSelect(RCVACT.rcv_no);
				dbSelectKey("MSBGL5010_MST_RCV_ACT_S01", recvActR, recvActR_bldr, recvActR);
				if (isNull(recvActR.rcv_no())) {
					return;
				}

				MST_RCV_R tgtRcvR = MST_RCV_R.create();
				MST_RCV_R RCV = MST_RCV_R.create("RCV");
				MCQueryApiBuilder tgtRcvR_builder = MCQueryApiBuilder.create(RCV);
				tgtRcvR.rcv_no(recvActR.rcv_no());
				tgtRcvR.bill_setoff_amt(grpL.sum(ArCmn_Upd01_DtlR.$trd_cur_amt1));
				tgtRcvR_builder.setWhere(RCV.rcv_no.eq(bindEx("rcv_no")));
				tgtRcvR_builder.setSetVL(RCV.bill_setoff_amt, RCV.bill_setoff_amt.add(bindEx("bill_setoff_amt")));
				dbUpdate("MSBGL5010_MST_RCV_U01", tgtRcvR, tgtRcvR_builder);
			}
		}

		/**
		 * 処理前チェック<br />
		 * 外貨で都度請求の売上・返品・値引に対して既に入金がある場合はエラーとする
		 * （入金後に訂正すると為替差損益の額が正しく計算できないことがあるため）
		 */
		protected void preCheck() {
			MCList<ArCmn_Upd01_DtlR> checkL = up0().subList(createRowMatcherPreCheck());
			
			MCList<MST_RCV_ACT_D_R> l = MCList.create(MST_RCV_ACT_D_R.class);
			MST_RCV_ACT_D_R t = MST_RCV_ACT_D_R.create("T");
			MST_RCV_ACT_R t2 = MST_RCV_ACT_R.create("T2");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
			l_bldr.addInnerJoin(t2, t.rcv_act_no.eq(t2.rcv_act_no)
					.and(t.rcv_act_seq.eq(t2.rcv_act_seq)));
			l_bldr.addConstWhereWithAnd(t2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			l_bldr.addConstWhereWithAnd(t2.ar_trd_grp_typ.in(
					value(MAC_AR_TRD_GRP_TYP.RCV.value()),
					value(MAC_AR_TRD_GRP_TYP.SETOFF.value())));
			l_bldr.addGroupBy(t.iv_no);

			dbSelectColumn("MSBGL5010_MST_RCV_ACT_D_S01", l, l_bldr, MST_RCV_ACT_D_R.$iv_no, checkL, ArCmn_Upd01_DtlR.$iv_no);

			if (!l.isEmpty()) {
				throw new MCAppException(MSBGL0022, l.get(0).iv_no());
			}
		}

		/**
		 * 請求繰越回数の設定<br />
		 * 
		 * 取消実績の場合、かつ、上り電文の請求繰越回数がNULLの場合<br>
		 * 対応する無効伝票より請求繰越回数を取得し、上り電文の請求繰越回数に設定する
		 */
		protected void setCrroverMons() {
			if (MSC_AR_OPE_TYP.isSLS_ACT(up1().ar_ope_typ())) {
				for (ArCmn_Upd01_DtlR r : up0()) {
					if (MAC_SLIP_STS_TYP.isCAN(r.slip_sts_typ())
							&& isNull(r.bill_crryovr_times())) {
						// 無効実績の請求繰越回数を設定
						r.bill_crryovr_times(getBillCrryovrTimes(
										r.act_d_no(), r.act_d_seq().subtract(MCNumber.ONE)));
					}
				}
			}
		}

		/**
		 * 請求繰越回数取得<br />
		 * 無効となる入金実績明細より請求繰越回数を取得する
		 * 
		 * @param rcvActDNo
		 * @param rcvActDSeq
		 * @return 請求繰越回数
		 */
		protected MCNumber getBillCrryovrTimes(String rcvActDNo, MCNumber rcvActDSeq) {
			MST_BILL_D_R r = MST_BILL_D_R.create();
			MST_BILL_D_R t = MST_BILL_D_R.create("T");
			MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
			r_bldr.addWhereWithAnd(t.act_d_no.eq(bind("1")), rcvActDNo);
			r_bldr.addWhereWithAnd(t.act_d_seq.eq(bind("1")), rcvActDSeq);
			r_bldr.addWhereWithAnd(t.bill_d_typ.eq(value(MSC_BILL_D_TYP.SLS.value())));
			dbSelect("MSBGL5010_MST_BILL_D_S02", r, r_bldr);
			return r.bill_crryovr_times();
		}

		/**
		 * シーケンスのキャッシュ<br />
		 * 請求明細の新規登録用に請求明細ＮＯの発番をキャッシュする
		 */
		protected void seqCache() {
			// 請求明細ＮＯをキャッシュする
			if (MSC_AR_OPE_TYP.is_bill_d_crt(up1().ar_ope_typ())) {
				doSeqCache(MSC_NUM_SYS_TYP.BILLD, up0().size());
			}
		}

		protected MCIndexKey _ikBill;
		/**
		 * インデックスの作成<br />
		 * 
		 */
		protected void createIndex() {
			_ikBill = up0().createIndex(getKeys());
		}
		protected String[] getKeys() {
			return new String[] {
					ArCmn_Upd01_DtlR.$bcst_cd,
					ArCmn_Upd01_DtlR.$bill_dpt_cd,
					ArCmn_Upd01_DtlR.$trd_cur_cd,
					ArCmn_Upd01_DtlR.$ar_wrk_no,
					ArCmn_Upd01_DtlR.$slip_sts_typ
					};
		}

		/**
		 * 上り電文のリストを請求情報単位に集約する。
		 * 
		 * @return 請求情報単位に集約したリスト
		 */
		protected MCList<ArCmn_Upd01_BillGrpR> getBillGrpL() {
			MCList<ArCmn_Upd01_DtlR> tgtL = up0().clone();
			MSBGL_ArUtil.editUpForDscntItm(tgtL);

			if (MSC_AR_OPE_TYP.isTAX_DIFF_BILL_CL(up1().ar_ope_typ())) {
				tgtL = tgtL.subList(ArCmn_Upd01_DtlR.$tgt_flg, true);
			}

			MCList<ArCmn_Upd01_BillGrpR> tmpL = MCList.create(ArCmn_Upd01_BillGrpR.class);
			setAll(tmpL, tgtL, createMapBillGrp());
			MCList<ArCmn_Upd01_BillGrpR> ret = tmpL.groupBy(getBillGrpGroupByPolicy());
			ret.sort(getBillGrpSortPolicy());
			return ret;
		}

		/**
		 * 請求毎リスト集計ポリシー取得<br />
		 * 請求毎リストの集計ポリシーを取得する。
		 * 
		 * @return 請求毎リストの集計ポリシー
		 */
		protected MCGroupByPolicy getBillGrpGroupByPolicy() {
			MCGroupByPolicy gp = new MCGroupByPolicy(_billGrpGroupByCols);
			gp.max(ArCmn_Upd01_BillGrpR.$rcv_schd_dt,
					ArCmn_Upd01_BillGrpR.$bill_basis_dt,
					ArCmn_Upd01_BillGrpR.$bill_xrate);
			gp.sum(ArCmn_Upd01_BillGrpR.$sls_amt,
					ArCmn_Upd01_BillGrpR.$ret_amt,
					ArCmn_Upd01_BillGrpR.$dscnt_amt,
					ArCmn_Upd01_BillGrpR.$sw_to_amt,
					ArCmn_Upd01_BillGrpR.$cash_amt,
					ArCmn_Upd01_BillGrpR.$note_amt,
					ArCmn_Upd01_BillGrpR.$xfr_amt,
					ArCmn_Upd01_BillGrpR.$setoff_amt,
					ArCmn_Upd01_BillGrpR.$setoff_tax_amt,
					ArCmn_Upd01_BillGrpR.$sw_amt,
					ArCmn_Upd01_BillGrpR.$tax_amt,
					ArCmn_Upd01_BillGrpR.$base_cur_sls_amt,
					ArCmn_Upd01_BillGrpR.$base_cur_ret_amt,
					ArCmn_Upd01_BillGrpR.$base_cur_dscnt_amt,
					ArCmn_Upd01_BillGrpR.$base_cur_sw_to_amt,
					ArCmn_Upd01_BillGrpR.$base_cur_cash_amt,
					ArCmn_Upd01_BillGrpR.$base_cur_note_amt,
					ArCmn_Upd01_BillGrpR.$base_cur_xfr_amt,
					ArCmn_Upd01_BillGrpR.$base_cur_setoff_amt,
					ArCmn_Upd01_BillGrpR.$base_cur_setoff_tax_amt,
					ArCmn_Upd01_BillGrpR.$base_cur_sw_amt,
					ArCmn_Upd01_BillGrpR.$base_cur_tax_amt,
					ArCmn_Upd01_BillGrpR.$wtax_amt);
			return gp;
		}

		/** 請求毎リストの集計キー */
		protected String[] _billGrpGroupByCols = {
				ArCmn_Upd01_BillGrpR.$bill_mng_no,
				ArCmn_Upd01_BillGrpR.$bcst_cd,
				ArCmn_Upd01_BillGrpR.$bill_dpt_cd,
				ArCmn_Upd01_BillGrpR.$bill_cl_dt,
				ArCmn_Upd01_BillGrpR.$iv_no,
				ArCmn_Upd01_BillGrpR.$bill_iv_no,
				ArCmn_Upd01_BillGrpR.$trd_cur_cd,
				ArCmn_Upd01_BillGrpR.$slip_sts_typ,
				ArCmn_Upd01_BillGrpR.$wrk_no
				};

		/**
		 * 請求毎リストソートポリシー取得<br />
		 * 請求毎リストのソートポリシーを取得する。
		 * 
		 * @return 請求毎リストのソートポリシー
		 */
		protected MCSortPolicy getBillGrpSortPolicy() {
			MCSortPolicy sp = new MCSortPolicy();
			sp.add(SortType.DESC, ArCmn_Upd01_BillGrpR.$slip_sts_typ);
			sp.add(SortType.ASC, ArCmn_Upd01_BillGrpR.$bill_mng_no);
			sp.add(SortType.ASC, ArCmn_Upd01_BillGrpR.$bcst_cd);
			sp.add(SortType.ASC, ArCmn_Upd01_BillGrpR.$bill_cl_dt);
			sp.add(SortType.ASC, ArCmn_Upd01_BillGrpR.$bill_dpt_cd);
			sp.add(SortType.ASC, ArCmn_Upd01_BillGrpR.$iv_no);
			sp.add(SortType.ASC, ArCmn_Upd01_BillGrpR.$trd_cur_cd);
			sp.add(SortType.ASC, ArCmn_Upd01_BillGrpR.$wrk_no);
			return sp;
		}

		/**
		 * インボイスＮＯ設定<br />
		 * インボイスＮＯを設定する。
		 * 締後の請求に対して更新する可能性がある場合、更新対象となる請求管理ＮＯを検索する。
		 * 
		 * @param cndR 処理対象とする請求の条件
		 */
		protected void setIvNo(ArCmn_Upd01_BillGrpR cndR) {
			if (MSC_AR_OPE_TYP.isARSW_OUT_NOT_BILL_BAL(up1().ar_ope_typ())
					|| MSC_AR_OPE_TYP.isBILL_CRRYOVR_TIMES_ORG(up1().ar_ope_typ())
					|| MSC_AR_OPE_TYP.isTAX_DIFF_BILL_CL(up1().ar_ope_typ())) {
				// 未請求残高振替払出、請求遅延回数更新元、請求時税差額のいずれかの時は
				// 上り電文の請求管理ＮＯを利用する
				return;
			}
			if (isNull(cndR.iv_no())) {
				cndR.iv_no(MAC_STR.NULL_VAL.value());
			}
			// 売上都度請求の入金では、
			// 締処理が行われている請求に対して更新するので請求管理ＮＯを検索しておく
			if (!makeEachSlsBill(cndR.bcst_cd(), cndR.slip_sts_typ(), cndR.bill_iv_no(), up1().ar_ope_typ())) {
				cndR.bill_mng_no(null);
			}
			else {
				cndR.bill_mng_no(getUpdBillMngNo(cndR));
			}
			updBillMngNo(cndR);
		}

		/**
		 * 請求管理ＮＯ取得<br />
		 * 請求先、請求部門、通貨、インボイスＮＯ、案件ＮＯから請求管理ＮＯを求める。
		 * 
		 * @param cndR 請求先、請求部門、通貨、インボイスＮＯ、案件ＮＯを持った条件となるコンテナ
		 * 
		 * @return 請求管理ＮＯ
		 */
		protected String getUpdBillMngNo(ArCmn_Upd01_BillGrpR cndR) {
			MST_BILL_R r = MST_BILL_R.create();
			MST_BILL_R t = MST_BILL_R.create("T");
			MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
			r_bldr.setSelect(t.bill_mng_no);
			// 請求締年月日、請求書ＮＯは無視
			r_bldr.addWhereWithAnd(t.bcst_cd.eq(bind("1")), cndR.bcst_cd());
			r_bldr.addWhereWithAnd(t.bill_dpt_cd.eq(bind("1")), cndR.bill_dpt_cd());
			r_bldr.addWhereWithAnd(t.trd_cur_cd.eq(bind("1")), cndR.trd_cur_cd());
			r_bldr.addWhereWithAnd(t.iv_no.eq(bind("1")), cndR.iv_no());
			r_bldr.addWhereWithAnd(bracket(t.wrk_no.eq(bind("1"))
					.or(t.wrk_no.isNull())
					.and(bind("1").isNull())),
					cndR.wrk_no());
			dbSelect("MSBGL5010_MST_BILL_S02", r, r_bldr);
			return r.bill_mng_no();
		}

		/**
		 * 請求書ＮＯ・請求日取得<br />
		 * 請求先、請求部門、通貨、インボイスＮＯ、案件ＮＯから請求ＮＯ・請求日を求める。
		 * 
		 * @param cndR 請求先、請求部門、通貨、インボイスＮＯ、案件ＮＯを持った条件となるコンテナ
		 * 
		 * @return MST_BILL_R
		 */
		protected MST_BILL_R getUpdBillNoAndDt(ArCmn_Upd01_BillGrpR cndR) {
			MST_BILL_R r = MST_BILL_R.create();
			MST_BILL_R t = MST_BILL_R.create("T");
			MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
			r_bldr.setSelect(t.bill_no, t.bill_dt);
			r_bldr.addWhereWithAnd(t.bcst_cd.eq(bind("1")), cndR.bcst_cd());
			r_bldr.addWhereWithAnd(t.bill_dpt_cd.eq(bind("1")), cndR.bill_dpt_cd());
			r_bldr.addWhereWithAnd(t.trd_cur_cd.eq(bind("1")), cndR.trd_cur_cd());
			r_bldr.addWhereWithAnd(t.iv_no.eq(bind("1")), cndR.iv_no());
			r_bldr.addWhereWithAnd(bracket(t.wrk_no.eq(bind("1"))
					.or(t.wrk_no.isNull())
					.and(bind("1").isNull())),
					cndR.wrk_no());
			dbSelect("MSBGL5010_MST_BILL_S10", r, r_bldr);
			return r;
		}
		
		/**
		 * 発行済ＦＬＧ取得<br />
		 * 請求ＮＯから発行済ＦＬＧを求める。
		 * 
		 * @param billNo 請求ＮＯ
		 * 
		 * @return 発行済ＦＬＧ
		 */
		protected boolean getPrntFlg(String billNo) {
			MST_BILL_R cacheIsPrntR = _isPrintBillNoL.getFirst(MST_BILL_R.$bill_no, billNo);
			if (!isNull(cacheIsPrntR)) {
				return cacheIsPrntR.prnt_flg();
			}

			MST_BILL_R r = MST_BILL_R.create();
			MST_BILL_R t = MST_BILL_R.create("T");
			MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
			r_bldr.setSelect(t.bill_no, t.prnt_flg);
			r_bldr.addWhereWithAnd(t.bill_no.eq(bind("1")), billNo);
			dbSelect("MSBGL5010_MST_BILL_S12", r, r_bldr);
			
			if (!isNull(r)) {
				MST_BILL_R isPrintBillNoR = MST_BILL_R.create();
				isPrintBillNoR.bill_no(r.bill_no());
				isPrintBillNoR.prnt_flg(r.prnt_flg());
				_isPrintBillNoL.add(isPrintBillNoR);
				return r.prnt_flg();
			}
			else {
				return false;
			}
		}
		
		/**
		 * 請求管理ＮＯ更新<br />
		 * インボイスＮＯを設定した上り電文の請求管理ＮＯを更新する。
		 * 
		 * @param cndR 処理対象とする請求の条件
		 */
		protected void updBillMngNo(ArCmn_Upd01_BillGrpR cndR) {
			Comparable<?>[] vals = {
					cndR.bcst_cd(), cndR.bill_dpt_cd(), cndR.trd_cur_cd(), cndR.wrk_no(), cndR.slip_sts_typ()
			};
			MCList<ArCmn_Upd01_DtlR> tmpL = up0().subList(_ikBill, vals);
			MCList<ArCmn_Upd01_DtlR> updL = MCList.create(ArCmn_Upd01_DtlR.class);
			// インボイスＮＯが同じものを更新対象に加える
			updL.addAll(tmpL.subList(ArCmn_Upd01_DtlR.$bill_iv_no, cndR.bill_iv_no()));
			// 売上都度請求以外の場合はnullのものも更新対象に加える
			if (!isEachSls(cndR.bcst_cd(), cndR.slip_sts_typ(), cndR.bill_iv_no())) {
				updL.addAll(tmpL.subList(ArCmn_Upd01_DtlR.$bill_iv_no, null));
			}
			updL.setValue(ArCmn_Upd01_DtlR.$bill_mng_no, cndR.bill_mng_no());
		}

		/**
		 * 請求登録<br />
		 * 更新対象の請求が存在すれば更新、存在しなければ新規登録する。
		 * 
		 * @param info 設定元となる情報
		 * 
		 * @return 登録した請求
		 */
		protected MST_BILL_R regBill(ArCmn_Upd01_BillGrpR info) {
			MST_BILL_R regR = calcBill(info);
			MST_BILL_R lockR = lockBill(regR);
			if (lockR.isEmpty()) {
				insBill(regR);
			}
			else {
				updBill(regR);
			}
			if (!regR.bill_each_sls_flg()) {
				updFollowingBill(info, regR);
			}
			return regR;
		}

		/**
		 * 請求作成<br />
		 * 登録する請求を作成する
		 * 
		 * @param info 設定元となる情報
		 * 
		 * @return 登録する請求
		 */
		protected MST_BILL_R calcBill(ArCmn_Upd01_BillGrpR info) {
			MST_BILL_R r = MST_BILL_R.create();

			r.bcst_cd(info.bcst_cd());
			r.bill_dpt_cd(info.bill_dpt_cd());
			r.bill_mng_no(info.bill_mng_no());
			r.trd_cur_cd(info.trd_cur_cd());
			r.bill_rev(1);
			r.wrk_no(info.wrk_no());
			r.bill_no(MAC_STR.NULL_VAL.value());
			r.sls_amt(info.sls_amt());
			r.ret_amt(info.ret_amt());
			r.dscnt_amt(info.dscnt_amt());
			r.sw_to_amt(info.sw_to_amt());
			r.cash_amt(info.cash_amt().negate());
			r.note_amt(info.note_amt().negate());
			r.xfr_amt(info.xfr_amt().negate());
			r.setoff_amt(info.setoff_amt().negate());
			r.setoff_tax_amt(info.setoff_tax_amt().negate());
			r.sw_amt(info.sw_amt().negate());
			r.bfw_amt(MSBGL_ArUtil.getRcvAmt4Bill(info));
			r.tax_amt(info.tax_amt());
			r.bill_amt(MSBGL_ArUtil.getBillAmt4Bill(info));
			// 入金予定額は当月の売上に関連する金額の合計となるので、
			// 繰越を考慮して算出した請求額とは異なる。
			r.rcv_schd_amt(MSBGL_ArUtil.getSlsAmt(info));
			r.rcv_act_amt(MCNumber.ZERO);
			r.not_appl_bal(MSBGL_ArUtil.getSlsAmt(info));
			r.rcv_schd_adjst_flg(false);
			r.foreign_flg(MSBGL_ArUtil.isForeign(info.bcst_cd()));

			// 請求先の請求締処理区分が売上都度請求の場合
			if (makeEachSlsBill(info.bcst_cd(), info.slip_sts_typ(), info.bill_iv_no(), up1().ar_ope_typ())) {
				r.iv_no(info.iv_no());
				r.bill_each_sls_flg(true);
				// 請求日は請求起算日で上書
				r.bill_dt(info.bill_basis_dt());
				r.addDateColumn("schd_bill_cl_dt", info.bill_basis_dt());
				// 売上都度請求の場合、請求締年月日は請求起算日
				// nullの考慮は消費税差額の場合
				r.bill_cl_dt(info.bill_basis_dt());
				r.last_bill_amt(MCNumber.ZERO);
				r.bill_cl_sts_typ(MSC_BILL_CL_STS_TYP.EACH_SLS.value());
				r.bill_cl_typ(MAC_BILL_CL_TYP.EACH_SLS.value());
				r.bill_tax_calc_typ(MSC_BILL_TAX_CALC_TYP.OTHR.value());
				r.adv_amt_bal(MSBGL_ArUtil.getAdvAmtBal(
						info.bcst_cd(), info.bill_dpt_cd(), info.trd_cur_cd()));
				if (MSC_AR_OPE_TYP.isTAX_DIFF_BILL_CL(up1().ar_ope_typ())) {
					r.base_dt(info.bill_cl_dt());
				}
				else {
					r.base_dt(info.bill_basis_dt());
				}
				r.bill_xrate(getBillXrate(r));
				MST_BILL_R bi = getUpdBillNoAndDt(info);
				if(!bi.isEmpty()) {
					boolean isPrnt = getPrntFlg(bi.bill_no());
					if (isPrnt) {
						r.pre_bill_no(bi.bill_no());
						r.pre_bill_dt(bi.bill_dt());
					}
				}

			}
			// 請求先の請求締処理区分が売上都度請求以外の場合（海外の場合も含む）
			else {
				r.bill_cl_dt(info.bill_cl_dt());
				r.iv_no(MAC_STR.NULL_VAL.value());
				r.last_bill_amt(getLastBillAmt(info));
				r.bill_cl_sts_typ(MSC_BILL_CL_STS_TYP.NOT_BILL.value());
				r.bill_tax_calc_typ(MSC_BILL_TAX_CALC_TYP.NOT_BILL.value());
				r.adv_amt_bal(MCNumber.ZERO);
				if (MAC_Y4M.isNULL_VAL(info.bill_cl_dt())) {
					r.base_dt(info.bill_basis_dt());
				}
				else {
					r.base_dt(info.bill_cl_dt());
				}
				r.bill_xrate(null);
			}
			r.adv_amt(MCNumber.ZERO);
			r.adv_setoff_amt(MCNumber.ZERO);
			r.adv_setoff_tax_amt(MCNumber.ZERO);
			// ワーキンググループＣＤを取得する
			String wgCd = MSBGL_ArUtil.getWgCd(r.bill_dpt_cd(), r.base_dt());
			if (isNull(wgCd)) {
				MSBGL_ArUtil.setLastDpt(r, MST_BILL_R.$bill_dpt_cd, "bill_dpt_nm");
				wgCd = r.wg_cd();
			}
			r.wg_cd(wgCd);
			r.setStringNE("bill_d_iv_no", info.iv_no());
			return r;
		}
		protected MCNumber getBillXrate(MST_BILL_R r) {
			MST_BILL_R bind = r.clone();
			bind.setStringNE(MAM_CO_R.$base_cur_cd, getCo().base_cur_cd());
			bind.setStringNE(MAM_CO_R.$bill_xrate_cd, getCo().bill_xrate_cd());
			return
				execFuncNumber(
					createSqlId(LOGIC_ID, "MAPA_XCHNG$F_GET_XRATE_NE", "01"),
					MAPA_XCHNG$F_GET_XRATE_NE(
						bind("trd_cur_cd"),
						bind("base_cur_cd"),
						bind("bill_xrate_cd"),
						bind("base_dt")), bind
				);
		}
		/**
		 * 消費税差額調整処理呼び出し<br />
		 */
		protected void calcTax(ArCmn_Upd01_BillGrpR info, MST_BILL_R r) {
			if (r.bill_each_sls_flg()
				&& MSC_AR_OPE_TYP.isSLS_ACT(up1().ar_ope_typ())) {
				if (MAC_SLIP_STS_TYP.isCRT(info.slip_sts_typ())) {
					MSBGL_RcvActCmnService.RcvActCmn_Upd04
						ope = MSBGL_RcvActCmnService.crtRcvActCmn_Upd04();
					ope.up0().add().bill_mng_no(r.bill_mng_no());
					ope.exec();
				}
				else if(MAC_SLIP_STS_TYP.isCAN(info.slip_sts_typ())) {
					MSBGL_RcvActCmnService.RcvActCmn_Del01
						ope = MSBGL_RcvActCmnService.crtRcvActCmn_Del01();
					ope.up0().add().bill_mng_no(r.bill_mng_no());
					ope.exec();
				}
			}
		}

		/**
		 * 請求ロック<br />
		 * 登録しようとする請求がすでに存在した場合、ロックしてその情報を返す
		 * 
		 * @param regR 登録する請求
		 * 
		 * @return 登録しようとする請求がすでに存在した場合はその情報。
		 * 存在しなかった場合は空のDBコンテナ。
		 */
		protected MST_BILL_R lockBill(MST_BILL_R regR) {
			MST_BILL_R r = MST_BILL_R.create();
			MST_BILL_R t = MST_BILL_R.create("T");
			MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);

			// 都度請求か、消費税調整の場合は締後の請求更新をする
			if (allowCl(up1().ar_ope_typ(), regR.bill_each_sls_flg())) {
				// 同じキーの中で、最後に締めが行われた請求を取得。（請求先、請求締年月日、インボイスＮＯ、
				// 通貨ＣＤが同じで締められているレコードが複数存在するため）
				r_bldr.setSelect(t.bill_mng_no);
				r_bldr.addSelect(t.bill_no);
				r_bldr.addSelect(t.bill_rev);
				r_bldr.addSelect(t.prnt_flg);
				
				r_bldr.addWhereWithAnd(t.bill_mng_no.eq(bind("1")), regR.bill_mng_no());
				dbSelectForUpdate("MSBGL5010_MST_BILL_S03", r, r_bldr);
				// 請求を取得できた場合、戻り値の請求にrowidを設定
				if (!r.isEmpty()) {
					regR.bill_mng_no(r.bill_mng_no());
					if (r.prnt_flg()) {
						regR.bill_rev(r.bill_rev().add(1));
						_updBillHisL.add(r);
					}
					else {
						regR.bill_rev(r.bill_rev());
					}
				}
			}
			else {
				r_bldr.setSelect(t.bill_mng_no);
				r_bldr.addWhereWithAnd(t.bcst_cd.eq(bind("1")), regR.bcst_cd());
				r_bldr.addWhereWithAnd(t.bill_cl_dt.eq(bind("1")), regR.bill_cl_dt());
				r_bldr.addWhereWithAnd(t.bill_dpt_cd.eq(bind("1")), regR.bill_dpt_cd());
				r_bldr.addWhereWithAnd(t.iv_no.eq(bind("1")), regR.iv_no());
				r_bldr.addWhereWithAnd(t.trd_cur_cd.eq(bind("1")), regR.trd_cur_cd());
				r_bldr.addWhereWithAnd(bracket(t.wrk_no.eq(bind("1"))
						.or(t.wrk_no.isNull())
						.and(bind("1").isNull())),
						regR.wrk_no());
				r_bldr.addWhereWithAnd(t.bill_cl_sts_typ.eq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())));
				dbSelectForUpdate("MSBGL5010_MST_BILL_S04", r, r_bldr);
				// 請求を取得できた場合、戻り値の請求に請求管理ＮＯを設定
				if (!r.isEmpty()) {
					regR.bill_mng_no(r.bill_mng_no());
				}
			}
			return r;
		}

		/**
		 * 前回請求額取得<br />
		 * 新規登録時、前回請求額にセットする額を計算して返す。
		 * 
		 * @param cndR 請求先、インボイスＮＯ、通貨ＣＤ、請求締年月日、案件を持った条件
		 * 
		 * @return 前回請求額
		 */
		protected MCNumber getLastBillAmt(ArCmn_Upd01_BillGrpR cndR) {
			// 登録、更新する請求の請求締年月日よりも前で、未請求のレコードがあれば、
			// その今回請求額が、登録、更新するレコードの前回請求額となる。
			// 上記レコードが取得できない場合、最新の締め処理後請求を取得し、
			// その今回請求額を、登録、更新するレコードの前回請求額とする。
			// 上記も取得できない場合、登録、更新する請求の前回請求額を0とする

			MCNumber ret = MSBGL_ArUtil.getLastNotBillAmt(cndR.bcst_cd(), cndR.bill_dpt_cd(), 
					MAC_STR.NULL_VAL.value(), cndR.trd_cur_cd(), cndR.bill_cl_dt(), cndR.wrk_no());
			if (!isNull(ret)) {
				return ret;
			}

			ret = MSBGL_ArUtil.getLastBillAmt(cndR.bcst_cd(), cndR.bill_dpt_cd(), MAC_STR.NULL_VAL.value(),
					cndR.trd_cur_cd(), cndR.wrk_no(), false);
			if (!isNull(ret)) {
				return ret;
			}
			else {
				return MCNumber.ZERO;
			}
		}

		/**
		 * 締処理後請求更新対象判定<br />
		 * 締処理後の請求が更新対象かを判定する。
		 * 
		 * @param arOpeTyp 条件の債権更新処理区分
		 * @param bcstCd 請求先ＣＤ
		 * 
		 * @return 締処理後の請求が更新対象の場合true、それ以外はfalse
		 */
		protected boolean allowCl(String arOpeTyp, boolean isEachSls) {
			return MSC_AR_OPE_TYP.isTAX_DIFF_BILL_CL(arOpeTyp)
					|| isEachSls;
		}

		/**
		 * 請求新規登録<br />
		 * 請求を新規登録する。登録後は引数のregRに発番された請求管理ＮＯ（bill_mng_no）が設定される。
		 * 
		 * @param regR 登録する請求
		 */
		protected void insBill(MST_BILL_R regR) {
			regR.bill_mng_no(getStrSeq(MSC_NUM_SYS_TYP.BILLMNG));
			MST_BILL_R insR = regR.clone();
			insR.bfw_amt(insR.bfw_amt().add(insR.last_bill_amt()));
			insR.bill_amt(insR.bill_amt().add(insR.last_bill_amt()));
			// 請求先の請求締処理区分が都度請求の場合、請求書ＮＯを発番する
			if (regR.bill_each_sls_flg()) {
				insR.bill_no(getBillNo(insR));
			}
			MCQueryApiBuilder billQAB = MCQueryApiBuilder.create(MST_BILL_R.create("T"));
			dbInsertEx("MSBGL5010_MST_BILL_I01", insR, billQAB);
		}

		/**
		 * 請求書ＮＯを発番する
		 * 
		 * @param insR 登録した請求ヘッダ
		 * 
		 * @return 発番した請求書ＮＯ
		 */
		protected String getBillNo(MST_BILL_R insR) {
			ElmArgsR args = ElmArgsR.create();
			args.bp_cd(insR.bcst_cd());
			args.dpt_cd(insR.bill_dpt_cd());
			args.wg_cd(insR.wg_cd());
			args.co_cd(getCo().co_cd());
			args.dt(insR.bill_cl_dt());
			return getNum(MAC_NUM_BIZ_TYP.BILL, args);
		}

		/**
		 * 請求更新<br />
		 * 請求を更新する。
		 * 
		 * @param regR 更新する請求
		 */
		protected void updBill(MST_BILL_R regR) {
			
			MST_BILL_R t = MST_BILL_R.create("T");
			MCQueryApiBuilder bill_bldr = MCQueryApiBuilder.create(t);
			bill_bldr.setWhere(t.bill_mng_no.eq(bindEx("bill_mng_no")));
			
			bill_bldr.setSetVL(t.xfr_amt, t.xfr_amt.add(bindEx("xfr_amt")));
			bill_bldr.addSetVL(t.note_amt, t.note_amt.add(bindEx("note_amt")));
			bill_bldr.addSetVL(t.cash_amt, t.cash_amt.add(bindEx("cash_amt")));
			bill_bldr.addSetVL(t.setoff_amt, t.setoff_amt.add(bindEx("setoff_amt")));
			bill_bldr.addSetVL(t.setoff_tax_amt, t.setoff_tax_amt.add(bindEx("setoff_tax_amt")));
			bill_bldr.addSetVL(t.sw_amt, t.sw_amt.add(bindEx("sw_amt")));
			bill_bldr.addSetVL(t.sls_amt, t.sls_amt.add(bindEx("sls_amt")));
			bill_bldr.addSetVL(t.ret_amt, t.ret_amt.add(bindEx("ret_amt")));
			bill_bldr.addSetVL(t.dscnt_amt, t.dscnt_amt.add(bindEx("dscnt_amt")));
			bill_bldr.addSetVL(t.sw_to_amt, t.sw_to_amt.add(bindEx("sw_to_amt")));
			bill_bldr.addSetVL(t.tax_amt, t.tax_amt.add(bindEx("tax_amt")));
			bill_bldr.addSetVL(t.bill_amt, t.bill_amt.add(bindEx("bill_amt")));
			bill_bldr.addSetVL(t.bfw_amt, t.bfw_amt.add(bindEx("bfw_amt")));
			bill_bldr.addSetVL(t.rcv_schd_amt, t.rcv_schd_amt.add(bindEx("rcv_schd_amt")));
			bill_bldr.addSetVL(t.not_appl_bal, t.not_appl_bal.add(bindEx("not_appl_bal")));
			if (regR.bill_each_sls_flg() && (MSC_AR_OPE_TYP.isSLS_ACT(up1().ar_ope_typ())
					|| MSC_AR_OPE_TYP.isAR_APPL(up1().ar_ope_typ()))) {
				bill_bldr.addSetVL(t.adv_amt_bal, bindEx("adv_amt_bal"));
				bill_bldr.addSetVL(t.adv_amt, t.adv_amt.add(bindEx("adv_amt")));
				bill_bldr.addSetVL(t.adv_setoff_amt, t.adv_setoff_amt.add(bindEx("adv_setoff_amt")));
				bill_bldr.addSetVL(t.adv_setoff_tax_amt, t.adv_setoff_tax_amt.add(bindEx("adv_setoff_tax_amt")));
			}

			// 消費税差額調整の場合、請求日、請求締年月日は請求を締めた時点と同じなので更新しない
			// 消費税差額調整以外の場合、更新する
			// 消費税差額調整では請求年月日がnull文字なので請求年月日時点の請求部門が取得できない為、
			// 請求部門の更新は行わない
			if (!MSC_AR_OPE_TYP.isTAX_DIFF_BILL_CL(up1().ar_ope_typ())) {
				bill_bldr.addSetVL(t.bill_dpt_cd, bindEx("bill_dpt_cd"));
				bill_bldr.addSetVL(t.wg_cd, bindEx("wg_cd"));
				// 都度請求、海外の売上更新時に請求締年月日、請求日、請求為替レート、請求書改訂番号を更新し、請求書を未発行の状態にする。
				// 入金の場合は請求締年月日、請求日、請求為替レートの更新をしない。発行済ＦＬＧも現状を維持するため更新しない。
				if (regR.bill_each_sls_flg()
						&& !MSC_AR_OPE_TYP.isAR_APPL(up1().ar_ope_typ())) {
					bill_bldr.addSetVL(t.bill_dt, bindEx("bill_dt"));
					bill_bldr.addSetVL(t.bill_cl_dt, bindEx("bill_cl_dt"));
					bill_bldr.addSetVL(t.prnt_flg, value(false));
					bill_bldr.addSetVL(t.bill_xrate, bindEx("bill_xrate"));
					bill_bldr.addSetVL(t.bill_rev, bindEx("bill_rev"));
				}
			}
			// 請求締年月日が年月用定数：ＮＵＬＬ文字の場合、
			// 部門取得基準日を更新する。
			if (MAC_Y4M.isNULL_VAL(regR.bill_cl_dt())) {
				bill_bldr.addSetVL(t.base_dt, bindEx("base_dt"));
			}
			bill_bldr.addSetVL(t.pre_bill_no, bindEx("pre_bill_no"));
			bill_bldr.addSetVL(t.pre_bill_dt, bindEx("pre_bill_dt"));
			dbUpdate("MSBGL5010_MST_BILL_U01", regR, bill_bldr);
		}

		/**
		 * 請求洗い替え<br />
		 * 以下の条件により該当する請求の前回請求額、今回繰越額、今回請求額の更新を行う。<br />
		 * ・都度請求か、消費税差額調整の場合<br />
		 * 締め処理後の請求に対する更新なので、未請求の請求はすべて洗い替えの対象となる。<br />
		 * ・上記以外の場合<br />
		 * 締め処理前の請求に対する更新なので、更新対象となった請求レコードより後の
		 * 請求締年月日を持つ請求のみ、洗い替えの対象となる。
		 * 
		 * @param info 設定元となる情報
		 * @param regR 登録した請求
		 */
		protected void updFollowingBill(ArCmn_Upd01_BillGrpR info, MST_BILL_R regR) {
			// 締後の請求に対する更新の場合
			if (allowCl(up1().ar_ope_typ(), regR.bill_each_sls_flg())) {
				updFollowingAllNotBill(regR);
			}
			else {
				//締め処理前の請求に対する更新の場合
				updFollowingNewBill(regR);
			}
		}

		/**
		 * 登録した請求とキーが同じで未請求の請求すべてを更新する。
		 * @param regR
		 */
		protected void updFollowingAllNotBill(MST_BILL_R regR) {
			// 最新の請求済み請求を取得
			// 締め処理後の請求に対する更新に対して処理を行っているので、最新の締め済み請求としては
			// 今回更新した後の請求が取得できる。未請求分に対して、すべて洗い替えを行う。
			MST_BILL_R lastBill = MSBGL_ArUtil.getLastBillRec(
					regR.bcst_cd(), regR.bill_dpt_cd(), regR.iv_no(),
					regR.trd_cur_cd(), regR.wrk_no(), true);

			// 最新の請求済み請求の次にくる請求(未請求)の前回請求額は、最新の請求済み請求の今回請求額
			MCNumber lastBillAmt = lastBill.bill_amt();

			// 未請求の請求を請求締年月日の小さい順に、今回繰越額、今回請求額、前回請求額を洗い替え
			MCList<MST_BILL_R> updBillL = getUpdFollowingAllBillL(lastBill);
			for (MST_BILL_R updBillR : updBillL) {
				MCRow bind = MCRow.create();
				bind.setNumberNE("diff", lastBillAmt.subtract(updBillR.last_bill_amt()));
				bind.setNumberNE("last_bill_amt", lastBillAmt);
				bind.setStringNE("bill_mng_no", updBillR.getStringNE("bill_mng_no"));
				
				MST_BILL_R t = MST_BILL_R.create("T");
				MCQueryApiBuilder bill_bldr = MCQueryApiBuilder.create(t);
				bill_bldr.setWhere(t.bill_mng_no.eq(bindEx("bill_mng_no")));
				bill_bldr.setSetVL(t.bfw_amt, t.bfw_amt.add(bindEx("diff")));
				bill_bldr.addSetVL(t.last_bill_amt, bindEx("last_bill_amt"));
				bill_bldr.addSetVL(t.bill_amt, t.bill_amt.add(bindEx("diff")));
				dbUpdate("MSBGL5010_MST_BILL_U02", bind, bill_bldr);

				// 次の請求にセットする前回請求額として保持
				lastBillAmt = updBillR.bill_amt()
					.add(lastBillAmt.subtract(updBillR.last_bill_amt()));
			}
		}

		/**
		 * 
		 * 登録した請求とキーが同じで請求年月が新しい未請求の請求を更新する。
		 * @param regR 登録した請求
		 */
		protected void updFollowingNewBill(MST_BILL_R regR) {
			//更新対象ロック・取得
			MCList<MST_BILL_R> updBillL = getUpdFollowingNewBillL(regR);

			MST_BILL_R t = MST_BILL_R.create("T");
			MCQueryApiBuilder bill_bldr = MCQueryApiBuilder.create(t);
			bill_bldr.setWhere(t.bill_mng_no.eq(bindEx("bill_mng_no")));

			bill_bldr.setSetVL(t.bfw_amt, t.bfw_amt.add(bind("bill_amt")));
			bill_bldr.addSetVL(t.last_bill_amt, t.last_bill_amt.add(bind("bill_amt")));
			bill_bldr.addSetVL(t.bill_amt, t.bill_amt.add(bind("bill_amt")));
			dbUpdate("MSBGL5010_MST_BILL_U03", updBillL, bill_bldr, regR);

		}

		/**
		 * 洗い替え対象未請求請求ロック・取得<BR>
		 * 今回請求年月よりも後の請求年月を持つ請求が対象となる。
		 * 
		 * @param regR 登録した請求
		 * 
		 * @return 洗い替え対象未請求請求。請求締年月日の小さい順にソートされている。
		 */
		protected MCList<MST_BILL_R> getUpdFollowingNewBillL(MST_BILL_R regR) {
			MCList<MST_BILL_R> l = MCList.create(MST_BILL_R.class);
			MST_BILL_R t = MST_BILL_R.create("T");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);

			l_bldr.setSelect(t.bill_mng_no);
			l_bldr.addWhereWithAnd(t.bcst_cd.eq(bind("bcst_cd")));
			l_bldr.addWhereWithAnd(t.bill_dpt_cd.eq(bind("bill_dpt_cd")));
			l_bldr.addWhereWithAnd(t.trd_cur_cd.eq(bind("trd_cur_cd")));
			l_bldr.addWhereWithAnd(t.iv_no.eq(bind("iv_no")));
			l_bldr.addWhereWithAnd(bracket(t.wrk_no.eq(bind("wrk_no"))
					.or(t.wrk_no.isNull())
					.and(bind("wrk_no").isNull())));
			l_bldr.addWhereWithAnd(t.bill_cl_sts_typ.eq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())));
			l_bldr.addWhereWithAnd(MAC_Y4M$IS_NULL_VAL(bind("bill_cl_dt")).eq(value(false)));
			l_bldr.addWhereWithAnd(bracket(MAC_Y4M$IS_NULL_VAL(t.bill_cl_dt).eq(value(true))
					.or(t.bill_cl_dt.gt(bind("bill_cl_dt")))));
			l_bldr.addSelect(toChar(t.bill_cl_dt, MCDateTimeFmt.YYYY, MCDateTimeFmt.MM, MCDateTimeFmt.DD).as("char_bill_cl_dt"));
			l_bldr.addOrderByAsc(pr("char_bill_cl_dt"));
			dbSelectForUpdate("MSBGL5010_MST_BILL_S05", l, l_bldr, regR);

			return l;
		}

		/**
		 * 洗い替え対象未請求請求ロック・取得<br />
		 * 未請求の請求すべてが対象となる。
		 * 
		 * @param billR 次回請求情報
		 * @return 洗い替え対象未請求請求。請求締年月日の小さい順にソートされている。
		 */
		protected MCList<MST_BILL_R> getUpdFollowingAllBillL(MST_BILL_R billR) {
			// 締め処理を行った請求と年月以外のキーが同じで未請求の請求をロック
			MCList<MST_BILL_R> l = MCList.create(MST_BILL_R.class);
			MST_BILL_R t = MST_BILL_R.create("T");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);

			l_bldr.addSelect(t.bill_mng_no);
			l_bldr.addWhereWithAnd(t.bcst_cd.eq(bind("bcst_cd")));
			l_bldr.addWhereWithAnd(t.bill_dpt_cd.eq(bind("bill_dpt_cd")));
			l_bldr.addWhereWithAnd(t.trd_cur_cd.eq(bind("trd_cur_cd")));
			l_bldr.addWhereWithAnd(t.iv_no.eq(bind("iv_no")));
			l_bldr.addWhereWithAnd(bracket(t.wrk_no.eq(bind("wrk_no"))
					.or(t.wrk_no.isNull())
					.and(bind("wrk_no").isNull())));
			l_bldr.addWhereWithAnd(t.bill_cl_sts_typ.eq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())));
			l_bldr.addSelect(decode(t.bill_cl_dt, value(MAC_Y4M.NULL_VAL.value()), value("99999999"),
					toChar(t.bill_cl_dt, MCDateTimeFmt.YYYY, MCDateTimeFmt.MM, MCDateTimeFmt.DD)).as("char_bill_cl_dt"));
			l_bldr.addOrderByAsc(pr("char_bill_cl_dt"));
			dbSelectForUpdate("MSBGL5010_MST_BILL_S06", l, l_bldr, billR);

			return l;
		}

		/**
		 * 入金予定登録<br />
		 * 更新対象の入金予定が存在すれば更新、存在しなければ新規登録する。<br>
		 * 源泉税が設定されている場合、源泉税の入金予定レコードを別で作成する。<br>
		 * 登録した入金予定情報を返却する。
		 * 
		 * @param info 設定元となる情報
		 * @param regBillR 登録した請求ヘッダ
		 * 
		 */
		protected void regRcvSchd(ArCmn_Upd01_BillGrpR info, MST_BILL_R regBillR) {

			// 売掛消込からの呼出しの場合、入金予定は変更しない
			if (MSC_AR_OPE_TYP.isAR_APPL(up1().ar_ope_typ())) {
				return;
			}

			MCList<MST_RCV_SCHD_R> lockL = lockRcvSchd(regBillR);

			MCNumber rcvSchdAmt = getRcvSchdAmt(info, lockL);
			MCNumber wtaxAmt = getWtaxAmt(info, lockL);
			rcvSchdAmt = rcvSchdAmt.subtract(wtaxAmt);

			MCList<MST_RCV_SCHD_R> regRcvSchdL = MCList.create(MST_RCV_SCHD_R.class);
			// 入金予定情報の作成
			regRcvSchdL = MSBGL_ArUtil.getRcvSchd(info.bcst_cd(), info.bill_dpt_cd(), info.trd_cur_cd(),
					rcvSchdAmt, regBillR.base_dt());

			if (isNull(regRcvSchdL)) {
				throw new MCAppException(MSBGL0073, info.bcst_cd(), info.bill_dpt_cd(), info.trd_cur_cd());
			}
			chkRcvMtdCd(regRcvSchdL, info);
			// 源泉税が設定されている場合、源泉税用の入金予定レコードを作成して登録用リストに追加する。
			if (!wtaxAmt.isZero()) {
				if (isNull(MSBGL_ArUtil.getArSttlCd(MAC_AR_STTL_TYP.WTAX.value()).sttl_cd())) {
					throw new MCAppException(MSBGL0072);
				}
				regRcvSchdL.add(getWtax(regRcvSchdL, wtaxAmt));
			}
			// 画面から入金予定日が設定された場合、その入金予定で上書きする
			if (!isNull(info.rcv_schd_dt())) {
				regRcvSchdL.setDate(MST_RCV_SCHD_R.$rcv_schd_dt, info.rcv_schd_dt());
			}
			insUpdRcvSchd(lockL, regRcvSchdL, regBillR);
		}

		/**
		 * 源泉税用の入金予定レコードを取得する
		 * 
		 * @param regRcvSchdL 入金予定リスト
		 * @param wtaxAmt 源泉税額
		 * @return 源泉税用の入金予定情報
		 */
		protected MST_RCV_SCHD_R getWtax(MCList<MST_RCV_SCHD_R> regRcvSchdL,
				MCNumber wtaxAmt) {
			MST_RCV_SCHD_R r = MST_RCV_SCHD_R.create();
			r.rcv_schd_dt((MCDate)regRcvSchdL.min(MST_RCV_SCHD_R.$rcv_schd_dt));
			r.rcv_schd_amt(wtaxAmt);
			r.rcv_mtd_cd(MSBGL_ArUtil.getArSttlCd(MAC_AR_STTL_TYP.WTAX.value()).sttl_cd());
			r.rcv_typ(MAC_AR_STTL_TYP.WTAX.value());
			return r;
		}

		/**
		 * 入金予定情報の登録、更新処理<br />
		 * lockLがisEmptyの場合、regRcvSchdLをもとに新規登録する<br>
		 * lockLがisEmpty以外の場合<br>
		 * 既に存在する入金方法・入金予定日であれば更新し、存在しなければ新規登録する<br>
		 * 既に登録済の入金予定情報のうち、不要な情報を削除する
		 * 
		 * @param lockL 既に登録されている入金予定情報
		 * @param regRcvSchdL 新たに作成した入金予定情報
		 * @param regBillR 登録した請求情報
		 */
		protected void insUpdRcvSchd(MCList<MST_RCV_SCHD_R> lockL, MCList<MST_RCV_SCHD_R> regRcvSchdL, MST_BILL_R regBillR) {

			// 債権更新処理区分が請求時税差額かどうか
			boolean isTax = MSC_AR_OPE_TYP.isTAX_DIFF_BILL_CL(up1().ar_ope_typ());

			// 新規
			if (lockL.isEmpty()) {
				for (MST_RCV_SCHD_R r : regRcvSchdL) {
					insRcvSchd(r, regBillR);
				}
			}
			// 更新
			else {
				// 既に登録済の入金予定情報に存在して、新しく作成した入金予定情報に存在しない場合は削除する。
				MCList<MST_RCV_SCHD_R> delL = MCList.create(MST_RCV_SCHD_R.class);
				String[] keys = {
						MST_RCV_SCHD_R.$rcv_mtd_cd, MST_RCV_SCHD_R.$rcv_schd_dt
				};
				for (MST_RCV_SCHD_R delR : lockL) {
					MST_RCV_SCHD_R r = MST_RCV_SCHD_R.create();
					// 債権から呼ばれる場合は入金予定日を更新しないので、キー項目は入金方法のみとする
					if (isTax) {
						r = regRcvSchdL.getFirst(MST_RCV_SCHD_R.$rcv_mtd_cd, delR.rcv_mtd_cd());
					}
					else {
						Comparable<?>[] vals = {
								delR.rcv_mtd_cd(), delR.rcv_schd_dt()
						};
						r = regRcvSchdL.getFirst(keys, vals);
					}
					if (isNull(r)) {
						delL.add(delR);
					}
				}
				// 新しく作成した入金予定情報をもとに入金予定を登録・更新する
				for (MST_RCV_SCHD_R regR : regRcvSchdL) {
					MST_RCV_SCHD_R lockR = MST_RCV_SCHD_R.create();
					// 債権から呼ばれる場合は入金予定日を更新しないので、キー項目は入金方法のみとする
					if (isTax) {
						lockR = lockL.getFirst(MST_RCV_SCHD_R.$rcv_mtd_cd, regR.rcv_mtd_cd());
					}
					else {
						Comparable<?>[] vals = {
								regR.rcv_mtd_cd(), regR.rcv_schd_dt()
						};
						lockR = lockL.getFirst(keys, vals);
					}
					if (isNull(lockR)) {
						insRcvSchd(regR, regBillR);
					}
					else {
						updRcvSchd(regR, lockR.getString("rcv_schd_no"));
					}
				}
				if (!delL.isEmpty()) {
					MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(MST_RCV_SCHD_R.create("T"));
					dbDeleteKey("MSBGL5010_MST_RCV_SCHD_D01", delL, delL_bldr);
				}
			}
		}

		/**
		 * 入金予定額の取得<br />
		 * 既に登録済の入金予定情報がある場合、その入金予定額を加算する
		 * 
		 * @param info
		 * @param rcvSchdL
		 * @return 今回取引で対象となる入金予定額
		 */
		protected MCNumber getRcvSchdAmt(ArCmn_Upd01_BillGrpR info, MCList<MST_RCV_SCHD_R> rcvSchdL) {
			if (rcvSchdL.isEmpty()) {
				return MSBGL_ArUtil.getSlsAmt(info);
			}
			else {
				return rcvSchdL.sum(MST_RCV_SCHD_R.$rcv_schd_amt).add(MSBGL_ArUtil.getSlsAmt(info));
			}
		}

		/**
		 * 源泉税額の取得<br />
		 * 既に登録済の源泉税の入金予定情報がある場合、その源泉税額を加算する
		 * 
		 * @param info
		 * @param rcvSchdL
		 * @return 今回取引で対象となる源泉税額
		 */
		protected MCNumber getWtaxAmt(ArCmn_Upd01_BillGrpR info, MCList<MST_RCV_SCHD_R> rcvSchdL) {
			MCNumber wtaxAmt = MCNumber.ZERO;
			if (rcvSchdL.isEmpty()) {
				wtaxAmt = nvl(info.wtax_amt(), MCNumber.ZERO);
			}
			else {
				
				// 既に登録済の源泉税額＋今回取引対象の源泉税額
				MCList<MST_RCV_SCHD_R> wtaxL = rcvSchdL.subList(
						MST_RCV_SCHD_R.$rcv_mtd_cd,
						MSBGL_ArUtil.getArSttlCd(MAC_AR_STTL_TYP.WTAX.value()).sttl_cd());
				if (!wtaxL.isEmpty()) {
					wtaxAmt = wtaxL.sum(MST_RCV_SCHD_R.$rcv_schd_amt).add(info.wtax_amt());
				}
				else {
					wtaxAmt = nvl(info.wtax_amt(), MCNumber.ZERO);
				}
			}
			return wtaxAmt;
		}

		/**
		 * 入金予定ロック<br />
		 * 登録対象の入金予定がすでに存在した場合、ロックしてその情報を返す
		 * 
		 * @param regBillR 登録した請求情報
		 * @return r 入金予定の検索結果
		 */
		protected MCList<MST_RCV_SCHD_R> lockRcvSchd(MST_BILL_R regBillR) {
			MCList<MST_RCV_SCHD_R> rcvSchdL = MCList.create(MST_RCV_SCHD_R.class);
			MST_RCV_SCHD_R t = MST_RCV_SCHD_R.create("T");
			MCQueryApiBuilder rcvSchdL_bldr = MCQueryApiBuilder.create(t);

			rcvSchdL_bldr.addSelect(t.rcv_schd_no);
			rcvSchdL_bldr.addWhereWithAnd(t.bill_mng_no.eq(bind("1")), regBillR.bill_mng_no());
			dbSelectForUpdate("MSBGL5010_MST_RCV_SCHD_S01", rcvSchdL, rcvSchdL_bldr);
			return rcvSchdL;
		}

		/**
		 * 入金予定新規登録<br />
		 * 入金予定を新規登録する。
		 * 
		 * @param regRcvSchdR 登録用の入金予定
		 * @param regBillR 登録した請求
		 */
		protected void insRcvSchd(MST_RCV_SCHD_R regRcvSchdR, MST_BILL_R regBillR) {
			regRcvSchdR.rcv_schd_no(getStrSeq(MSC_NUM_SYS_TYP.RCVSCHD));
			regRcvSchdR.bill_mng_no(regBillR.bill_mng_no());
			MCQueryApiBuilder regRcvSchdR_bldr = MCQueryApiBuilder.create(MST_RCV_SCHD_R.create("T"));
			dbInsertEx("MSBGL5010_MST_RCV_SCHD_I01", regRcvSchdR, regRcvSchdR_bldr);
		}

		/**
		 * 入金予定更新<br />
		 * 入金予定を更新する。
		 * 
		 * @param updR 更新用の入金予定
		 * @param rcvSchdNo 更新対象を特定するrcvSchdNo
		 */
		protected void updRcvSchd(MST_RCV_SCHD_R updR, String rcvSchdNo) {
			updR.setStringNE("rcv_schd_no", rcvSchdNo);
			MST_RCV_SCHD_R t = MST_RCV_SCHD_R.create("T");
			MCQueryApiBuilder regRcvSchdR_bldr = MCQueryApiBuilder.create(t);
			regRcvSchdR_bldr.setWhere(t.rcv_schd_no.eq(bindEx("rcv_schd_no")));
			regRcvSchdR_bldr.setSetVL(t.rcv_schd_amt, bindEx("rcv_schd_amt"));
			dbUpdate("MSBGL5010_MST_RCV_SCHD_U01", updR, regRcvSchdR_bldr);

		}

		/**
		 * 上り電文の更新<br />
		 * 登録した請求の請求管理ＮＯを上り電文に反映する
		 * 
		 * @param info 設定元となる情報
		 * @param regBillR 登録した請求
		 */
		protected void setBillMngNo(ArCmn_Upd01_BillGrpR info, MST_BILL_R regBillR) {
			if (!MSC_AR_OPE_TYP.isTAX_DIFF_BILL_CL(up1().ar_ope_typ())) {
				String[] keys = {
						ArCmn_Upd01_DtlR.$bcst_cd, ArCmn_Upd01_DtlR.$bill_dpt_cd,
						ArCmn_Upd01_DtlR.$trd_cur_cd, ArCmn_Upd01_DtlR.$ar_wrk_no,
						ArCmn_Upd01_DtlR.$slip_sts_typ
				};
				Comparable<?>[] vals = {
						regBillR.bcst_cd(), regBillR.bill_dpt_cd(), regBillR.trd_cur_cd(),
						regBillR.wrk_no(), info.slip_sts_typ()
				};
				MCList<ArCmn_Upd01_DtlR> l = up0().subList(keys, vals);

				for (ArCmn_Upd01_DtlR r : l) {
					MAM_BP_R bcstR = _bcstL.getFirst(MAM_BP_R.$bp_cd, r.bcst_cd());

					// 請求起算日から算出した請求予定年月が、登録した請求の請求予定年月と同じ
					// 都度請求の場合、請求締年月日は請求起算日から算出しているので、
					// インボイスＮＯの一致した場合、請求管理ＮＯを設定
					// 都度請求以外の場合、登録した請求の請求締年月日との比較を行う
					if (!makeEachSlsBill(r.bcst_cd(), r.slip_sts_typ(), r.bill_iv_no(), up1().ar_ope_typ())) {

						MCDate billClDt = MSBGL_ArUtil.getBillSchdDt(r.bcst_cd(),
								r.bill_basis_dt(), r.bill_crryovr_times(), bcstR);
						billClDt = nvl(billClDt, MAC_Y4M.NULL_VAL.value());
						// 請求残高振替払出の場合、上り電文の請求部門ＣＤが有効かどうか判断し、
						// 有効な場合はそのまま処理する。無効な場合は、上り電文の請求部門ＣＤを含めた請求のキーで
						// 請求ヘッダの最新の請求締年月日を取得して、取得した請求締年月日ベースで処理する
						if (MSC_AR_OPE_TYP.isARSW_OUT_BILL_BAL(up1().ar_ope_typ())) {
							if (isNull(checkDptCd(r.bill_dpt_cd(), billClDt))) {
								billClDt = getMaxBillClDt(r);
							}
						}
						if (isSame(billClDt, regBillR.bill_cl_dt())) {
							r.bill_mng_no(regBillR.bill_mng_no());
						}
					}
					else {
						if (isSame(r.bill_iv_no(), regBillR.iv_no())) {
							r.bill_mng_no(regBillR.bill_mng_no());
						}
					}
				}
			}
		}

		/**
		 * 売掛先別請求作成<br />
		 * 売掛先別請求を作成する。
		 * 
		 * @param info 請求単位の情報
		 * @param regBillR 登録した請求
		 */
		protected void regBillAcst(
				ArCmn_Upd01_BillGrpR info, MST_BILL_R regBillR) {

			MCList<MST_BILL_ACST_R> regBillAcstL = MCList.create(MST_BILL_ACST_R.class);

			// 請求管理ＮＯ、売掛先ＣＤごとに処理する
			for (MST_BILL_ACST_R r : getRegBillAcstL(info, regBillR)) {
				// 売掛先別請求登録
				MST_BILL_ACST_R regBillAcstR = regBillAcst(info, regBillR, r);
				// 請求明細登録
				regBillD(info, regBillR, regBillAcstR);

				regBillAcstL.add(regBillAcstR);
			}
			// 売掛消込予定登録
			MCList<MST_RCV_SCHD_R> rcvSchdL =
					MSBGL_ArUtil.getRcvSchdL(regBillR.bill_mng_no());
			// 売掛消込からの呼出しの場合、入金予定は変更しない
			if (!MSC_AR_OPE_TYP.isAR_APPL(up1().ar_ope_typ())) {
				MCList<MST_BILL_R> wkBillL = MCList.create(MST_BILL_R.class);
				MCList<MST_BILL_ACST_R> billMngNoL = regBillAcstL.groupBy(MST_BILL_ACST_R.$bill_mng_no);
				for (MST_BILL_ACST_R billMngNoR : billMngNoL) {
					MST_BILL_R wkBillR = MST_BILL_R.create();
					wkBillR.bill_mng_no(billMngNoR.bill_mng_no());
					wkBillL.add(wkBillR);
				}
				MCQueryApiBuilder wkBillL_bldr = MCQueryApiBuilder.create(MST_BILL_R.create("T"));
				dbWkDelete("MSBGL5010_MSW_BILL_D01", wkBillL_bldr.getBaseDbc());
				dbWkInsert("MSBGL5010_MSW_BILL_I01", wkBillL, wkBillL_bldr.getBaseDbc());
				MCList<MST_BILL_ACST_R> billAcstL = MCList.create(MST_BILL_ACST_R.class);
				MST_BILL_ACST_R t = MST_BILL_ACST_R.create("T");
				MCQueryApiBuilder billAcstL_bldr = MCQueryApiBuilder.create(t);
				MSW_BILL_KEY_R w = MSW_BILL_KEY_R.create("W");
				billAcstL_bldr.addInnerJoin(w, bracket(t.bill_mng_no.eq(w.bill_mng_no)));
				dbSelect("MSBGL5010_MST_BILL_ACST_S01", billAcstL, billAcstL_bldr);
				dbWkDelete("MSBGL5010_MSW_BILL_D02", wkBillL_bldr.getBaseDbc());
				
				MCIndexKey ik = regBillAcstL.createIndex(MST_BILL_ACST_R.$bill_acst_no);
				MCList<MST_BILL_ACST_R> cmplBillAcstL = MCList.create(MST_BILL_ACST_R.class);
				for (MST_BILL_ACST_R billAcstR : billAcstL) {
					MST_BILL_ACST_R regBillAcstR = regBillAcstL.getFirst(ik, billAcstR.bill_acst_no());
					if (regBillAcstR == null) {
						cmplBillAcstL.add(billAcstR);
					}
				}
				regBillAcstL.addAll(cmplBillAcstL);
			}
			regArApplSchd(info, rcvSchdL, regBillAcstL, regBillR);
		}

		/**
		 * 売掛先別リスト取得<br />
		 * 売掛先、売掛部門ごとにまとめたリストを返す。
		 * 
		 * @param info 請求単位の情報
		 * @param regBillR 登録した請求
		 * 
		 * @return 売掛先、売掛部門ごとにまとめたリスト
		 */
		protected MCList<MST_BILL_ACST_R> getRegBillAcstL(
				ArCmn_Upd01_BillGrpR info, MST_BILL_R regBillR) {
			// 処理対象を抽出
			MCList<ArCmn_Upd01_DtlR> tgtL;
			MCList<ArCmn_Upd01_DtlR> cloneL = up0().clone();
			// 消費税差額調整の場合、フラグがONのものが対象
			if (MSC_AR_OPE_TYP.isTAX_DIFF_BILL_CL(up1().ar_ope_typ())) {
				tgtL = cloneL.subList(ArCmn_Upd01_DtlR.$tgt_flg, true);
			}
			// 消費税差額調整以外の場合、発行した請求管理ＮＯに紐付くものが対象
			else {
				String[] keys = {ArCmn_Upd01_DtlR.$bill_mng_no, ArCmn_Upd01_DtlR.$iv_no};
				String[] values = {regBillR.bill_mng_no(), regBillR.getString("bill_d_iv_no")};
				tgtL = cloneL.subList(keys, values);
			}
			tgtL = tgtL.subList(ArCmn_Upd01_DtlR.$slip_sts_typ, info.slip_sts_typ());
			MSBGL_ArUtil.editUpForDscntItm(tgtL);

			MCList<MST_BILL_ACST_R> tmpL = MCList.create(MST_BILL_ACST_R.class);
			setAll(tmpL, tgtL, createMap_MST_BILL_ACST_R_ArCmn_Upd01_DtlR());

			// キー項目ごとに集計する
			MCList<MST_BILL_ACST_R> ret = tmpL.groupBy(getBillAcstGroupByPolicy());
			// ソート
			ret.sort(getBillAcstSortPolicy());

			return ret;
		}

		/**
		 * 売掛先別リスト集計ポリシー取得<br />
		 * 売掛先別リストの集計ポリシーを取得する。
		 * 
		 * @return 売掛先別リストの集計ポリシー
		 */
		protected MCGroupByPolicy getBillAcstGroupByPolicy() {
			MCGroupByPolicy gp = new MCGroupByPolicy(_billAcstGroupByCols);
			gp.max(MST_BILL_ACST_R.$bill_mng_no);
			gp.sum(ArCmn_Upd01_BillGrpR.$sls_amt,
					ArCmn_Upd01_BillGrpR.$ret_amt,
					ArCmn_Upd01_BillGrpR.$dscnt_amt,
					ArCmn_Upd01_BillGrpR.$sw_to_amt,
					ArCmn_Upd01_BillGrpR.$cash_amt,
					ArCmn_Upd01_BillGrpR.$note_amt,
					ArCmn_Upd01_BillGrpR.$xfr_amt,
					ArCmn_Upd01_BillGrpR.$setoff_amt,
					ArCmn_Upd01_BillGrpR.$setoff_tax_amt,
					ArCmn_Upd01_BillGrpR.$sw_amt,
					ArCmn_Upd01_BillGrpR.$tax_amt);
			return gp;
		}

		/** 売掛先別リストの集計キー */
		protected String[] _billAcstGroupByCols = {
				MST_BILL_ACST_R.$acst_cd, MST_BILL_ACST_R.$ar_dpt_cd, MST_BILL_ACST_R.$ar_typ
				};

		/**
		 * 売掛先別リストソートポリシー取得<br />
		 * 売掛先別リストのソートポリシーを取得する。
		 * 
		 * @return 売掛先別リストのソートポリシー
		 */
		protected MCSortPolicy getBillAcstSortPolicy() {
			MCSortPolicy sp = new MCSortPolicy();
			sp.add(SortType.ASC, MST_BILL_ACST_R.$acst_cd);
			sp.add(SortType.ASC, MST_BILL_ACST_R.$ar_dpt_cd);
			sp.add(SortType.ASC, MST_BILL_ACST_R.$ar_typ);
			return sp;
		}

		/**
		 * 売掛先別請求登録<br />
		 * 更新対象の売掛先別請求が存在すれば更新、存在しなければ新規登録する。
		 * 
		 * @param info 請求単位の情報
		 * @param regBillR 登録した請求ヘッダ
		 * @param cndR 登録する売掛先別請求の抽出条件
		 * 
		 * @return 登録した売掛先別請求
		 */
		protected MST_BILL_ACST_R regBillAcst(ArCmn_Upd01_BillGrpR info, MST_BILL_R regBillR,
				MST_BILL_ACST_R cndR) {
			// 金額計算
			MST_BILL_ACST_R regBillAcstR = calcBillAcst(cndR, regBillR);

			MST_BILL_ACST_R lockR = lockBillAcst(regBillAcstR);

			if (lockR.isEmpty()) {
				insBillAcst(regBillAcstR);
			}
			else {
				regBillAcstR.bill_acst_no(lockR.bill_acst_no());
				updBillAcst(regBillAcstR, lockR);
			}

			// 繰越の場合、対象レコード更新処理を呼び出す
			if (!regBillR.bill_each_sls_flg()) {
				updFollowingBillAcst(info, regBillAcstR);
			}

			return regBillAcstR;
		}

		/**
		 * 売掛先別請求作成<br />
		 * 登録する売掛先別請求を作成する
		 * 
		 * @param cndR 売掛先ごとの情報
		 * @param regBillR 登録した請求
		 * 
		 * @return 登録する売掛先別請求
		 */
		protected MST_BILL_ACST_R calcBillAcst(MST_BILL_ACST_R cndR, MST_BILL_R regBillR) {

			// ワーキンググループＣＤを取得する
			String wgCd = MSBGL_ArUtil.getWgCd(cndR.ar_dpt_cd(), regBillR.base_dt());
			if (isNull(wgCd)) {
				MSBGL_ArUtil.setLastDpt(cndR, MST_BILL_ACST_R.$ar_dpt_cd, "ar_dpt_nm");
				wgCd = cndR.wg_cd();
			}
			MST_BILL_ACST_R r = MST_BILL_ACST_R.create();
			r.bill_mng_no(regBillR.bill_mng_no());
			r.acst_cd(cndR.acst_cd());
			r.ar_dpt_cd(cndR.ar_dpt_cd());
			r.wg_cd(wgCd);
			r.ar_typ(cndR.ar_typ());
			r.last_bill_amt(getLastBillAcstAmt(cndR));
			r.xfr_amt(cndR.xfr_amt().negate());
			r.note_amt(cndR.note_amt().negate());
			r.cash_amt(cndR.cash_amt().negate());
			r.setoff_amt(cndR.setoff_amt().negate());
			r.setoff_tax_amt(cndR.setoff_tax_amt().negate());
			r.sw_amt(cndR.sw_amt().negate());
			r.bfw_amt(MSBGL_ArUtil.getRcvAmt4Bill(cndR));
			r.sls_amt(cndR.sls_amt());
			r.ret_amt(cndR.ret_amt());
			r.dscnt_amt(cndR.dscnt_amt());
			r.sw_to_amt(cndR.sw_to_amt());
			r.tax_amt(cndR.tax_amt());
			r.bill_amt(MSBGL_ArUtil.getBillAmt4Bill(cndR));

			return r;
		}

		/**
		 * 前回請求額取得<br />
		 * 売掛先ごとの前回請求額を取得する。
		 * 
		 * @param info 売掛先ごとの情報
		 * 
		 * @return 前回請求額
		 */
		protected MCNumber getLastBillAcstAmt(MST_BILL_ACST_R info) {
			MST_BILL_R cndR = MST_BILL_R.create();
			MCQueryApiBuilder cndR_bldr = MCQueryApiBuilder.create(MST_BILL_R.create("T"));
			dbSelectKey("MSBGL5010_MST_BILL_S07", cndR, cndR_bldr, info.bill_mng_no());

			// 未請求の請求で直近のものを取得する
			MST_BILL_R lastNotBill = MSBGL_ArUtil.getLastNotBillRec(cndR.bcst_cd(), cndR.bill_dpt_cd(), cndR.iv_no(), cndR.trd_cur_cd(),
					cndR.bill_cl_dt(), cndR.wrk_no());

			// 直近の未請求の請求が取得できない場合、最新の締め済み請求を取得
			MST_BILL_ACST_R r = MST_BILL_ACST_R.create();
			MST_BILL_R billR = MST_BILL_R.create("T2");
			MST_BILL_ACST_R acstR = MST_BILL_ACST_R.create("T");
			MCQueryApiBuilder billAcst_bldr = MCQueryApiBuilder.create(acstR);
			if (lastNotBill.isEmpty()) {
				// 最新の締め済み請求取得
				billAcst_bldr.addInnerJoin(billR, bracket(acstR.bill_mng_no.eq(billR.bill_mng_no)));
				billAcst_bldr.addWhereWithAnd(billR.bill_mng_no.eq(bind("1")), 
						MSBGL_ArUtil.getLastBillMngNo(
								cndR.bcst_cd(),
								cndR.bill_dpt_cd(),
								cndR.iv_no(),
								cndR.trd_cur_cd(),
								cndR.wrk_no(),
								false));
				billAcst_bldr.addWhereWithAnd(acstR.acst_cd.eq(bind("1")), info.acst_cd());
				billAcst_bldr.addWhereWithAnd(acstR.ar_dpt_cd.eq(bind("1")), info.ar_dpt_cd());
				billAcst_bldr.addWhereWithAnd(acstR.ar_typ.eq(bind("1")), info.ar_typ());
			}
			// 取得できた場合、該当の請求に紐付く売掛先別請求を取得
			else {
				billAcst_bldr.addWhereWithAnd(acstR.bill_mng_no.eq(bind("1")), lastNotBill.bill_mng_no());
				billAcst_bldr.addWhereWithAnd(acstR.acst_cd.eq(bind("1")), info.acst_cd());
				billAcst_bldr.addWhereWithAnd(acstR.ar_dpt_cd.eq(bind("1")), info.ar_dpt_cd());
				billAcst_bldr.addWhereWithAnd(acstR.ar_typ.eq(bind("1")), info.ar_typ());
			}
			dbSelect("MSBGL5010_MST_BILL_ACST_S02", r, billAcst_bldr);

			return nvl(r.bill_amt(), MCNumber.ZERO);
		}

		/**
		 * 売掛先別請求ロック<br />
		 * 登録しようとする売掛先別請求がすでに存在した場合、ロックしてその情報を返す
		 * 
		 * @param regBillAcstR 登録する売掛先別請求
		 * 
		 * @return 登録しようとする売掛先別請求がすでに存在した場合はその情報。
		 * 存在しなかった場合は空のDBコンテナ。
		 */
		protected MST_BILL_ACST_R lockBillAcst(MST_BILL_ACST_R regBillAcstR) {
			MST_BILL_ACST_R r = MST_BILL_ACST_R.create();
			MST_BILL_ACST_R t = MST_BILL_ACST_R.create("T");
			MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);

			r_bldr.setSelect(t.bill_acst_no);
			r_bldr.addSelect(t.bill_acst_no);
			r_bldr.addWhereWithAnd(t.bill_mng_no.eq(bind("1")), regBillAcstR.bill_mng_no());
			r_bldr.addWhereWithAnd(t.acst_cd.eq(bind("1")), regBillAcstR.acst_cd());
			r_bldr.addWhereWithAnd(t.ar_dpt_cd.eq(bind("1")), regBillAcstR.ar_dpt_cd());
			r_bldr.addWhereWithAnd(t.ar_typ.eq(bind("1")), regBillAcstR.ar_typ());
			dbSelectForUpdate("MSBGL5010_MST_BILL_ACST_S03", r, r_bldr);

			return r;
		}

		/**
		 * 売掛先別請求新規登録<br />
		 * 売掛先別請求を新規登録する。
		 * 登録後は引数のregBillAcstRに発番された売掛別請求ＮＯ（bill_acst_no）が設定される。
		 * 
		 * @param regBillAcstR 登録する売掛先別請求
		 */
		protected void insBillAcst(MST_BILL_ACST_R regBillAcstR) {
			regBillAcstR.bill_acst_no(getStrSeq(MSC_NUM_SYS_TYP.BILLACST));
			MST_BILL_ACST_R insR = regBillAcstR.clone();
			insR.bfw_amt(insR.bfw_amt().add(insR.last_bill_amt()));
			insR.bill_amt(insR.bill_amt().add(insR.last_bill_amt()));

			MCQueryApiBuilder billAcst_bldr = MCQueryApiBuilder.create(MST_BILL_ACST_R.create("T"));
			dbInsertEx("MSBGL5010_MST_BILL_ACST_I01", insR, billAcst_bldr);
		}

		/**
		 * 売掛先別請求更新<br />
		 * 売掛先別請求を更新する。
		 * 
		 * @param regBillAcstR 更新する金額情報
		 * @param lockR 更新する売掛先別請求
		 */
		protected void updBillAcst(MST_BILL_ACST_R regBillAcstR,
				MST_BILL_ACST_R lockR) {
			MCRow bind = regBillAcstR.clone();
			bind.setStringNE("bill_acst_no", lockR.getString("bill_acst_no"));

			MST_BILL_ACST_R t = MST_BILL_ACST_R.create("T");
			MCQueryApiBuilder acst_bldr = MCQueryApiBuilder.create(t);
			acst_bldr.setWhere(t.bill_acst_no.eq(bindEx("bill_acst_no")));
			acst_bldr.setSetVL(t.xfr_amt, t.xfr_amt.add(bindEx("xfr_amt")));
			acst_bldr.addSetVL(t.note_amt, t.note_amt.add(bindEx("note_amt")));
			acst_bldr.addSetVL(t.cash_amt, t.cash_amt.add(bindEx("cash_amt")));
			acst_bldr.addSetVL(t.setoff_amt, t.setoff_amt.add(bindEx("setoff_amt")));
			acst_bldr.addSetVL(t.setoff_tax_amt, t.setoff_tax_amt.add(bindEx("setoff_tax_amt")));
			acst_bldr.addSetVL(t.sw_amt, t.sw_amt.add(bindEx("sw_amt")));
			acst_bldr.addSetVL(t.bfw_amt, t.bfw_amt.add(bindEx("bfw_amt")));
			acst_bldr.addSetVL(t.sls_amt, t.sls_amt.add(bindEx("sls_amt")));
			acst_bldr.addSetVL(t.ret_amt, t.ret_amt.add(bindEx("ret_amt")));
			acst_bldr.addSetVL(t.dscnt_amt, t.dscnt_amt.add(bindEx("dscnt_amt")));
			acst_bldr.addSetVL(t.sw_to_amt, t.sw_to_amt.add(bindEx("sw_to_amt")));
			acst_bldr.addSetVL(t.tax_amt, t.tax_amt.add(bindEx("tax_amt")));
			acst_bldr.addSetVL(t.bill_amt, t.bill_amt.add(bindEx("bill_amt")));

			dbUpdate("MSBGL5010_MST_BILL_ACST_U01", bind, acst_bldr);

		}

		/**
		 * 売掛先別請求洗い替え<br />
		 * 以下の条件により該当する請求の前回請求額、今回繰越額、今回請求額の更新を行う。<br />
		 * ・都度請求か、消費税調整の場合<br />
		 * 締め処理後の請求に対する更新なので、未請求の請求はすべて洗い替えの対象となる。<br />
		 * ・上記以外の場合<br />
		 * 締め処理前の請求に対する更新なので、更新対象となった請求レコードより後の
		 * 請求締年月日を持つ請求のみ、洗い替えの対象となる。
		 * 
		 * @param info 請求単位の情報
		 * @param regBillAcstR 登録した売掛先別請求
		 */
		protected void updFollowingBillAcst(ArCmn_Upd01_BillGrpR info,
				MST_BILL_ACST_R regBillAcstR) {

			// 締後の請求を対象とする場合
			if (allowCl(up1().ar_ope_typ(), false)) {
				updFollowingAllNotBillAcst(regBillAcstR);
			}
			else {
				// 締後の請求を対象としない場合
				updFollowingNewBillAcst(regBillAcstR);
			}
		}

		/**
		 * 登録した売掛先別請求とキーが同じで未請求の請求すべてを更新する。
		 * @param regBillAcstR 登録した売掛先別請求
		 */
		protected void updFollowingAllNotBillAcst(MST_BILL_ACST_R regBillAcstR) {
			// 以下、締め処理を行った請求が対象
			// 引数のregBillAcstRが持つ請求管理ＮＯで取得できる請求レコードは現在処理中の請求で、
			// 最新の締め処理後請求となる。
			MST_BILL_ACST_R tgtBillAcstR = getTgtBillAcstR(regBillAcstR);

			// 最新の請求済み請求の次にくる請求の前回請求額は、最新の請求済み請求の今回請求額
			MCNumber lastBillAmt = tgtBillAcstR.bill_amt();

			// 請求締年月日の小さい順に、今回繰越額、今回請求額、前回請求額を洗い替え
			MCList<MST_BILL_ACST_R> updBillAcstL = getUpdFollowingBillAcstL(
					tgtBillAcstR.bill_mng_no(), regBillAcstR.acst_cd(),
					regBillAcstR.ar_dpt_cd(), regBillAcstR.ar_typ()
					);
			for (MST_BILL_ACST_R updBillAcstR : updBillAcstL) {
				MCRow bind = MCRow.create();
				bind.setNumberNE("diff", lastBillAmt.subtract(updBillAcstR.last_bill_amt()));
				bind.setNumberNE("last_bill_amt", lastBillAmt);
				bind.setStringNE("bill_acst_no", updBillAcstR.bill_acst_no());

				MST_BILL_ACST_R t = MST_BILL_ACST_R.create("T");
				MCQueryApiBuilder acst_bldr = MCQueryApiBuilder.create(t);
				acst_bldr.setWhere(t.bill_acst_no.eq(bindEx("bill_acst_no")));

				acst_bldr.setSetVL(t.bfw_amt, t.bfw_amt.add(bindEx("diff")));
				acst_bldr.addSetVL(t.last_bill_amt, bindEx("last_bill_amt"));
				acst_bldr.addSetVL(t.bill_amt, t.bill_amt.add(bindEx("diff")));

				dbUpdate("MSBGL5010_MST_BILL_ACST_U02", bind, acst_bldr);
				// 次の請求にセットする前回請求額として保持
				lastBillAmt = updBillAcstR.bill_amt()
					.add(lastBillAmt.subtract(updBillAcstR.last_bill_amt()));
			}
		}

		/**
		 * 
		 * 登録した売掛先別請求とキーが同じで請求年月が新しい未請求の売掛先別請求を更新する。
		 * 
		 * @param regBillAcstR 登録した売掛先別請求
		 */
		protected void updFollowingNewBillAcst(MST_BILL_ACST_R regBillAcstR) {
			//更新対象ロック・取得
			MCList<MST_BILL_ACST_R> updBillAcstL = getUpdFollowingNewBillAcstL(regBillAcstR);

			MST_BILL_ACST_R t = MST_BILL_ACST_R.create("T");
			MCQueryApiBuilder updBillAcstL_bldr = MCQueryApiBuilder.create(t);
			updBillAcstL_bldr.setSetVL(t.bfw_amt, t.bfw_amt.add(bind("bill_amt")));
			updBillAcstL_bldr.addSetVL(t.last_bill_amt, t.last_bill_amt.add(bind("bill_amt")));
			updBillAcstL_bldr.addSetVL(t.bill_amt, t.bill_amt.add(bind("bill_amt")));
			updBillAcstL_bldr.setWhere(t.bill_acst_no.eq(bindEx("bill_acst_no")));
			dbUpdate("MSBGL5010_MST_BILL_ACST_U03", updBillAcstL, updBillAcstL_bldr, regBillAcstR);
		}

		/**
		 * 洗い替え対象未請求売掛先別請求ロック・取得<BR>
		 * 今回請求年月よりも後の請求年月を持つ売掛先別請求が対象となる。
		 * 
		 * @param regBillAcstR
		 *            登録した売掛先別請求
		 * @return 洗い替え対象未請求売掛先別請求。請求締年月日の小さい順にソートされている。
		 */
		protected MCList<MST_BILL_ACST_R> getUpdFollowingNewBillAcstL(MST_BILL_ACST_R regBillAcstR) {
			MCList<MST_BILL_ACST_R> l = MCList.create(MST_BILL_ACST_R.class);
			MST_BILL_ACST_R t = MST_BILL_ACST_R.create("T");
			MST_BILL_R bill = MST_BILL_R.create("BILL");
			MST_BILL_R S1T2 = MST_BILL_R.create("T2");
			MST_BILL_R S1T3 = MST_BILL_R.create("T3");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);

			l_bldr.setSelect(t.bill_acst_no);
			l_bldr.addSelect(bill.bill_mng_no.as("bill_mng_no_for_lock"));
			l_bldr.addLeftOuterJoin(bill, bracket(bill.bill_mng_no.eq(t.bill_mng_no)));
			l_bldr.addWhereWithAnd(t.acst_cd.eq(bind("acst_cd")));
			l_bldr.addWhereWithAnd(t.ar_dpt_cd.eq(bind("ar_dpt_cd")));
			l_bldr.addWhereWithAnd(t.ar_typ.eq(bind("ar_typ")));
			l_bldr.addWhereWithAnd(exists(subQuery()
					.select(value("X"))
					.from(S1T2.innerJoin(S1T3).on(
							value(MSC_BILL_CL_STS_TYP.NOT_BILL.value()).eq(S1T3.bill_cl_sts_typ)
							.and(S1T3.bill_mng_no.eq(t.bill_mng_no))))
					.where(S1T2.bill_mng_no.eq(bind("bill_mng_no"))
							.and(MAC_Y4M$IS_NULL_VAL(S1T2.bill_cl_dt).eq(value(false)))
							.and(MAC_Y4M$IS_NULL_VAL(S1T3.bill_cl_dt).eq(value(true))
									.or(S1T2.bill_cl_dt.lt(S1T3.bill_cl_dt))))));
			l_bldr.addSelect(toChar(bill.bill_cl_dt, MCDateTimeFmt.YYYY, MCDateTimeFmt.MM, MCDateTimeFmt.DD).as("char_bill_cl_dt"));
			l_bldr.setLockTable(t.bill_acst_no);
			l_bldr.addOrderByAsc(pr("char_bill_cl_dt"));

			dbSelectForUpdate("MSBGL5010_MST_BILL_ACST_S04", l, l_bldr, regBillAcstR);
			
			lockMstBill(l);
			return l;
		}
		
		protected void lockMstBill(MCList<MST_BILL_ACST_R> l) {
			MCList<MST_BILL_R> billBindL = MCList.create(MST_BILL_R.class);
			for (MST_BILL_ACST_R r : l) {
				String billMngNo = r.getStringNE("bill_mng_no_for_lock");
				if (!isNull(billMngNo)) {
					MST_BILL_R tmp = MST_BILL_R.create();
					tmp.bill_mng_no(billMngNo);
					billBindL.add(tmp);
				}
			}
			if (!billBindL.isEmpty()) {
				MST_BILL_R t = MST_BILL_R.create("T");
				MCQueryApiBuilder billBuilder = MCQueryApiBuilder.create(t);
				billBuilder.setSelect(t.bill_mng_no);
				billBuilder.setOrderByAsc(t.bill_mng_no);
				dbSelectKeyForUpdateNoFetch("MSBGL5010_MST_BILL_S09", billBuilder, billBindL);
			}
		}

		/**
		 * 最新締め処理後請求取得<br />
		 * 最新の締め処理後請求を取得する。
		 * 
		 * @param regBillAcstR 登録した売掛先別請求
		 * 
		 * @return 最新の締め処理後請求
		 */
		protected MST_BILL_ACST_R getTgtBillAcstR(MST_BILL_ACST_R regBillAcstR) {
			MST_BILL_ACST_R r = MST_BILL_ACST_R.create();
			MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(MST_BILL_ACST_R.create("T"));
			dbSelectKey("MSBGL5010_MST_BILL_ACST_S05", r, r_bldr, regBillAcstR.bill_acst_no());
			return r;
		}

		/**
		 * 洗い替え対象売掛先別請求取得<br />
		 * 今回繰越額、今回請求額、前回請求額を洗い替える売掛先別請求を取得する。
		 * 
		 * @param billMngNo 最新の請求済み請求の請求管理ＮＯ
		 * @param acstCd 登録した売掛先別請求の売掛先ＣＤ
		 * @param arDptCd 登録した売掛先別請求の売掛部門
		 * @param arTyp 債権区分
		 * 
		 * @return 洗い替え対象売掛先別請求。請求締年月日の小さい順にソートされている。
		 */
		protected MCList<MST_BILL_ACST_R> getUpdFollowingBillAcstL(String billMngNo, String acstCd, String arDptCd, String arTyp) {
			MCList<MST_BILL_ACST_R> l = MCList.create(MST_BILL_ACST_R.class);
			MST_BILL_ACST_R t = MST_BILL_ACST_R.create("T");
			MST_BILL_R t2 = MST_BILL_R.create("T2");
			MST_BILL_R t3 = MST_BILL_R.create("T3");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
			l_bldr.addSelect(t2.bill_cl_dt);
			l_bldr.addInnerJoin(t2, t.bill_mng_no.eq(t2.bill_mng_no));
			l_bldr.addInnerJoin(t3, t2.bcst_cd.eq(t3.bcst_cd)
					.and(t2.bill_dpt_cd.eq(t3.bill_dpt_cd))
					.and(t2.trd_cur_cd.eq(t3.trd_cur_cd))
					.and(t2.wrk_no.eq(t3.wrk_no)
							.or(t2.wrk_no.isNull()).
							and(t3.wrk_no.isNull())));
			l_bldr.addWhereWithAnd(t3.bill_mng_no.eq(bind("1")), billMngNo);
			l_bldr.addWhereWithAnd(t2.bill_cl_sts_typ.eq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())));
			l_bldr.addWhereWithAnd(t.acst_cd.eq(bind("1")), acstCd);
			l_bldr.addWhereWithAnd(t.ar_dpt_cd.eq(bind("1")), arDptCd);
			l_bldr.addWhereWithAnd(t.ar_typ.eq(bind("1")), arTyp);
			l_bldr.addSelect(decode(t2.bill_cl_dt, value(MAC_Y4M.NULL_VAL.value()), value("99999999"),
					toChar(t2.bill_cl_dt, MCDateTimeFmt.YYYY, MCDateTimeFmt.MM, MCDateTimeFmt.DD)).as("char_bill_cl_dt"));
			l_bldr.addOrderByAsc(pr("char_bill_cl_dt"));

			l_bldr.setLockTable(t.acst_cd);
			dbSelectForUpdate("MSBGL5010_MST_BILL_ACST_S06", l, l_bldr);

			return l;
		}

		/**
		 * 請求明細登録<br />
		 * 請求明細を登録する。
		 * 
		 * @param info 請求単位の情報
		 * @param regBillR 登録した請求
		 * @param regBillAcstR 登録した売掛先別請求
		 */
		protected void regBillD(ArCmn_Upd01_BillGrpR info, MST_BILL_R regBillR,
				MST_BILL_ACST_R regBillAcstR) {
			// 業務種別が未請求明細振替(-)、請求繰越回数更新(-)の場合、請求明細を登録しない
			if (MSC_AR_OPE_TYP.isARSW_OUT_NOT_BILL_BAL(up1().ar_ope_typ())
					|| MSC_AR_OPE_TYP.isBILL_CRRYOVR_TIMES_ORG(up1().ar_ope_typ())) {
				return;
			}

			MCList<MST_BILL_D_R> insBillDL = MCList.create(MST_BILL_D_R.class);
			MCList<ArCmn_Upd01_DtlR> updBillDDisL = MCList.create(ArCmn_Upd01_DtlR.class);
			MCList<MST_BILL_D_APPL_BAL_R> insBillDApplBalL = MCList.create(MST_BILL_D_APPL_BAL_R.class);
			MCList<MCRow> updBillDL = MCList.create(MCRow.class);
			for (ArCmn_Upd01_DtlR regR : getRegBillDL(info, regBillR, regBillAcstR)) {
				// 受払、債権、請求残高振替(-)、請求残高振替(+)、消費税差額調整の場合は新規登録
				if (MSC_AR_OPE_TYP.is_bill_d_crt(up1().ar_ope_typ())) {

					String billDNo = insBillD(regR, regBillR, regBillAcstR, insBillDL, updBillDDisL);

					// 請求明細消込残高登録
					// 受払、消費税差額調整の場合、発番した請求明細IDで新規挿入
					if (MSC_AR_OPE_TYP.isSLS_ACT(up1().ar_ope_typ())
							|| MSC_AR_OPE_TYP.isTAX_DIFF_BILL_CL(up1().ar_ope_typ())) {
						
						regBillDApplBal(regR, billDNo, insBillDApplBalL);
					}
				}
				// 未請求明細振替(+)、請求繰越回数更新(+）の場合、該当する請求明細の更新を行う
				else if (MSC_AR_OPE_TYP.isARSW_IN_NOT_BILL_BAL(up1().ar_ope_typ())
						|| MSC_AR_OPE_TYP.isBILL_CRRYOVR_TIMES_NEW(up1().ar_ope_typ())) {
					updBillD(regR, regBillR, regBillAcstR, updBillDL);
				}
			}
			insBillDL(insBillDL);
			updBillDDisL(updBillDDisL);
			insBillDApplBalL(insBillDApplBalL);
			updBillDL(updBillDL);
		}

		/**
		 * 登録対象請求明細取得<br />
		 * 登録対象の請求明細を取得する。
		 * 
		 * @param info 請求単位の情報
		 * @param regBillR 登録した請求
		 * @param regBillAcstR 登録した売掛先別請求
		 * 
		 * @return 登録対象の請求明細
		 */
		protected MCList<ArCmn_Upd01_DtlR> getRegBillDL(ArCmn_Upd01_BillGrpR info,
				MST_BILL_R regBillR, MST_BILL_ACST_R regBillAcstR) {
			MCList<ArCmn_Upd01_DtlR> ret = MCList.create(ArCmn_Upd01_DtlR.class);

			MCList<ArCmn_Upd01_DtlR> tmpL = up0().clone();
			
			for (ArCmn_Upd01_DtlR r : tmpL) {
				if (!isSame(r.slip_sts_typ(), info.slip_sts_typ())) {
					continue;
				}
				if (MSC_AR_OPE_TYP.isTAX_DIFF_BILL_CL(up1().ar_ope_typ())) {
					if (r.tgt_flg()) {
						ret.add(r);
					}
				}
				else {
					if (isSame(r.bill_mng_no(), regBillR.bill_mng_no())
							&& isSame(r.iv_no(), regBillR.getString("bill_d_iv_no"))
							&& isSame(r.acst_cd(), regBillAcstR.acst_cd())
							&& isSame(r.ar_dpt_cd(), regBillAcstR.ar_dpt_cd())
							&& isSame(r.ar_typ(), regBillAcstR.ar_typ())) {
						ret.add(r);
					}
				}
				if (MSC_AR_OPE_TYP.isARSW_IN_BILL_BAL(up1().ar_ope_typ())) {
					MCNumber amtPm = MSC_AR_OPE_TYP.ar_amt_pm(up1().ar_ope_typ());
					r.trd_cur_amt(r.trd_cur_amt().multiply(amtPm));
					r.trd_cur_amt1(r.trd_cur_amt1().multiply(amtPm));
					r.trd_cur_tax_amt(r.trd_cur_tax_amt().multiply(amtPm));
					r.base_cur_amt(r.base_cur_amt().multiply(amtPm));
					r.base_cur_amt1(r.base_cur_amt1().multiply(amtPm));
					r.base_cur_tax_amt(r.base_cur_tax_amt().multiply(amtPm));
					r.wtax_amt(r.wtax_amt().multiply(amtPm));
				}
			}
			ret.sort(ArCmn_Upd01_DtlR.$bill_mng_no, ArCmn_Upd01_DtlR.$acst_cd,
					ArCmn_Upd01_DtlR.$ar_dpt_cd, ArCmn_Upd01_DtlR.$ar_typ,
					ArCmn_Upd01_DtlR.$act_no, ArCmn_Upd01_DtlR.$act_seq,
					ArCmn_Upd01_DtlR.$act_d_no, ArCmn_Upd01_DtlR.$act_d_seq);

			return ret;
		}

		/**
		 * 請求明細新規登録<br />
		 * 請求明細を新規登録する。
		 * 
		 * @param regR 登録する請求明細
		 * @param regBillR 登録した請求
		 * @param regBillAcstR 登録した売掛先別請求
		 * @param insBillDL 請求明細一括登録用のリスト
		 * @param updBillDDisL 請求明細一括更新用のリスト
		 * 
		 * @return 登録した請求明細ＮＯ
		 */
		protected String insBillD(ArCmn_Upd01_DtlR regR, MST_BILL_R regBillR,
				MST_BILL_ACST_R regBillAcstR, MCList<MST_BILL_D_R> insBillDL,
				MCList<ArCmn_Upd01_DtlR> updBillDDisL) {
			MST_BILL_D_R insR = MST_BILL_D_R.create();
			copy(insR, regR, createMapInsBillD());
			insR.bill_mng_no(regBillR.bill_mng_no());
			insR.bill_acst_no(regBillAcstR.bill_acst_no());
			insBillDL.add(insR);

			// 挿入した明細が取消実績の場合、旧実績を無効状態に更新する
			if (MAC_SLIP_STS_TYP.isCAN(regR.slip_sts_typ())) {
				updBillDDisL.add(regR);
			}
			return insR.bill_d_no();
		}

		/**
		 * 請求明細消込残高登録<br />
		 * 受払、消費税差額調整の場合、請求明細消込残高情報の更新を行う。
		 * 
		 * @param regR 登録情報
		 * @param billDNo 請求明細ＮＯ
		 * @param insBillDApplBalL 請求明細消込残高一括登録用のリスト
		 */
		protected void regBillDApplBal(ArCmn_Upd01_DtlR regR, String billDNo, 
				MCList<MST_BILL_D_APPL_BAL_R> insBillDApplBalL) {
			MCNumber amt = regR.trd_cur_amt().add(regR.trd_cur_tax_amt())
				.multiply(MAC_TRD_PTN_TYP.ar_amt_pm(regR.trd_ptn_typ()))
				.multiply(MSBGL_ArUtil.getDscntItmPm(regR.trd_ptn_typ(), regR.dscnt_itm_flg()));

			MST_BILL_D_APPL_BAL_R insR = MST_BILL_D_APPL_BAL_R.create();
			insR.bill_d_no(billDNo);
			insR.parent_bill_d_no(billDNo);
			insR.appl_tgt_amt(amt);
			insR.appl_amt(MCNumber.ZERO);
			insR.not_appl_bal(amt);
			insBillDApplBalL.add(insR);
		}

		/**
		 * 請求明細更新<br />
		 * 請求明細を更新する。
		 * 
		 * @param regR 更新する請求明細
		 * @param regBillR 登録した請求
		 * @param regBillAcstR 登録した売掛先別請求
		 * @param updBillDL 請求明細一括更新用のリスト
		 */
		protected void updBillD(ArCmn_Upd01_DtlR regR, MST_BILL_R regBillR,
				MST_BILL_ACST_R regBillAcstR, MCList<MCRow> updBillDL) {
			MCRow bind = regR.clone();
			bind.setStringNE("bill_mng_no", regBillR.bill_mng_no());
			bind.setStringNE("bill_acst_no", regBillAcstR.bill_acst_no());
			updBillDL.add(bind);
		}

		/**
		 * 請求明細登録<br />
		 * 請求明細を新規登録する。
		 * 
		 * @param insBillDL 登録対象の請求明細リスト
		 */
		protected void insBillDL(MCList<MST_BILL_D_R> insBillDL) {
			if (!isNull(insBillDL)) {
				MCQueryApiBuilder insBillDL_bldr = MCQueryApiBuilder.create(MST_BILL_D_R.create("T"));
				dbInsertEx("MSBGL5010_MST_BILL_D_I01", insBillDL, insBillDL_bldr);
			}
		}

		/**
		 * 請求明細更新<br />
		 * 売上実績に紐付く請求明細の伝票状況区分を「2：無効」に更新する。
		 * 
		 * @param updBillDDisL 請求明細更新用のリスト
		 */
		protected void updBillDDisL(MCList<ArCmn_Upd01_DtlR> updBillDDisL) {
			
			if (!isNull(updBillDDisL)) {
				MST_BILL_D_R t = MST_BILL_D_R.create("T");
				MCQueryApiBuilder billd_bldr = MCQueryApiBuilder.create(t);
				// where（実績連番が一つ前のレコードを更新）
				billd_bldr.setWhere(t.act_no.eq(bindEx("act_no")));
				billd_bldr.addWhereWithAnd(t.act_seq.eq(bindEx("act_seq").subtract(value(1))));
				billd_bldr.setSetVL(t.slip_sts_typ, value(MAC_SLIP_STS_TYP.DIS.value()));
				
				// 売掛消込、請求時税差額
				if (MSC_AR_OPE_TYP.isAR_APPL(up1().ar_ope_typ()) || 
						MSC_AR_OPE_TYP.isTAX_DIFF_BILL_CL(up1().ar_ope_typ())) {
					billd_bldr.addWhereWithAnd(t.bill_d_typ.eq(value(MSC_BILL_D_TYP.RCV.value())));
				}
				// 売上
				else {
					billd_bldr.addWhereWithAnd(t.bill_d_typ.eq(value(MSC_BILL_D_TYP.SLS.value())));
				}
				
				dbUpdate("MSBGL5010_MST_BILL_D_U01", updBillDDisL, billd_bldr);
			}
		}

		/**
		 * 請求明細消込残高の登録
		 * 
		 * @param insBillDApplBalL 請求明細消込残高更新用のリスト
		 */
		protected void insBillDApplBalL(MCList<MST_BILL_D_APPL_BAL_R> insBillDApplBalL) {
			if (!isNull(insBillDApplBalL)) {
				MCQueryApiBuilder applBal_bldr = MCQueryApiBuilder.create(MST_BILL_D_APPL_BAL_R.create("T"));
				dbInsertEx("MSBGL5010_MST_BILL_D_APPL_BAL_I01", insBillDApplBalL, applBal_bldr);
			}
		}

		/**
		 * 請求明細の更新
		 * 
		 * @param updBillDL
		 */
		protected void updBillDL(MCList<MCRow> updBillDL) {
			if (!isNull(updBillDL)) {
				MST_BILL_D_R t = MST_BILL_D_R.create("T");
				MCQueryApiBuilder billd_bldr = MCQueryApiBuilder.create(t);

				billd_bldr.setWhere(t.bill_d_no.eq(bindEx("bill_d_no")));
				billd_bldr.setSetVL(t.bill_mng_no, bindEx("bill_mng_no"));
				billd_bldr.addSetVL(t.bill_acst_no, bindEx("bill_acst_no"));
				billd_bldr.addSetVL(t.bill_crryovr_times, bindEx("bill_crryovr_times"));
				billd_bldr.addSetVL(t.bill_basis_dt, bindEx("bill_basis_dt"));
				dbUpdate("MSBGL5010_MST_BILL_D_U02", updBillDL, billd_bldr);

			}
		}

		/**
		 * 売掛消込予定の登録、更新
		 * 
		 * @param info 上り電文
		 * @param rcvSchdL 登録した入金予定
		 * @param regBillAcstL 登録した売掛先別請求
		 * @param regBillR 登録した請求
		 */
		protected void regArApplSchd(ArCmn_Upd01_BillGrpR info, MCList<MST_RCV_SCHD_R> rcvSchdL,
				MCList<MST_BILL_ACST_R> regBillAcstL, MST_BILL_R regBillR) {

			// 売掛消込からの呼出しの場合、入金予定は変更しない
			if (MSC_AR_OPE_TYP.isAR_APPL(up1().ar_ope_typ())) {
				return;
			}

			// 売掛消込予定登録
			MCList<MST_BILL_D_R> keyL = MCList.create(MST_BILL_D_R.class);
			for (ArCmn_Upd01_DtlR up0R : up0()) {
				if (!isNull(up0R.bill_d_no())) {
					MST_BILL_D_R keyR = MST_BILL_D_R.create();
					keyR.bill_d_no(up0R.bill_d_no());
					keyL.add(keyR);
				}
			}
			MSBGL_ArUtil.regArApplSchd(rcvSchdL, regBillAcstL, regBillR,
					info.rcv_schd_dt(), true, up1().ar_ope_typ(), keyL);
		}

		/**
		 * 月次売掛残高登録<br />
		 * 更新対象の月次売掛残高が存在すれば更新、存在しなければ新規登録する。
		 */
		protected void regMlyArBal() {
			// 未請求明細振替元の場合、消込を更新。それ以外は通常の更新。
			for (MST_MLY_AR_BAL_R regR : getRegMlyArBalL(createMapMlyArBal())) {
				// 更新対象のレコードを検索
				MST_MLY_AR_BAL_R lockR = lockMlyArBal(regR);
				if (lockR.isEmpty()) {
					insMlyArBal(regR);
				}
				else {
					updMlyArBal(regR, lockR);
				}
				// 未請求明細振替(-)以外、後続する売掛情報更新処理を呼び出す
				if (!MSC_AR_OPE_TYP.isARSW_OUT_NOT_BILL_BAL(up1().ar_ope_typ())) {
					updFollowingMlyArBal(regR);
				}
			}
			// 未請求明細振替の場合、売掛の金額を画面の計上年月で更新する
			if (MSC_AR_OPE_TYP.isARSW_OUT_NOT_BILL_BAL(up1().ar_ope_typ())) {
				regMlyArBalForSw();
			}
		}

		/**
		 * 登録対象月次売掛残高リスト取得<br />
		 * 登録対象の月次売掛残高リストを取得する。
		 * 
		 * @param rm 上り電文から登録対象の月次売掛残高の情報を作成するRowMapper
		 * 
		 * @return 登録対象の月次売掛残高リスト
		 */
		protected MCList<MST_MLY_AR_BAL_R>
				getRegMlyArBalL(MCRowMapper<MST_MLY_AR_BAL_R, ArCmn_Upd01_DtlR> rm) {
			MCList<MST_MLY_AR_BAL_R> tmpL = MCList.create(MST_MLY_AR_BAL_R.class);

			// 債権更新処理区分が「売掛消込」の場合、為替差損益を取得する
			if (MSC_AR_OPE_TYP.isAR_APPL(up1().ar_ope_typ())) {
				getExcGainLoss(up0());	
			}
			MCList<ArCmn_Upd01_DtlR> cloneL = up0().clone();
			MSBGL_ArUtil.editUpForDscntItm(cloneL);

			setAll(tmpL, cloneL, rm);

			// キー項目ごとに集計する
			MCList<MST_MLY_AR_BAL_R> ret = tmpL.groupBy(getMlyArBalGroupByPolicy());
			// ソート
			ret.sort(getMlyArBalSortPolicy());
		
			lockMlyArBal(ret);

			return ret;
		}

		/**
		 * 為替差損益を取得する
		 * 
		 * @param dtlL 上り電文
		 */
		protected void getExcGainLoss(MCList<ArCmn_Upd01_DtlR> dtlL) {
			MCList<MST_AR_EXC_GAIN_LOSS_R> l = MCList.create(MST_AR_EXC_GAIN_LOSS_R.class);
			MST_AR_EXC_GAIN_LOSS_R t = MST_AR_EXC_GAIN_LOSS_R.create("T");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);

			// 入金実績明細ＮＯ、入金実績明細連番をもとに債権為替差損益を検索
			l_bldr.addWhereWithAnd(t.rcv_act_d_no.eq(bind("act_d_no")));
			l_bldr.addWhereWithAnd(t.rcv_act_d_seq.eq(bind("act_d_seq")));
			dbSelect("MSBGL5010_MST_AR_EXC_GAIN_LOSS_S01", l, l_bldr, dtlL);

			MCIndexKey idk = l.createIndex(MST_AR_EXC_GAIN_LOSS_R.$rcv_act_d_no, MST_AR_EXC_GAIN_LOSS_R.$rcv_act_d_seq);
			for (ArCmn_Upd01_DtlR dtlR : dtlL) {
				MCList<MST_AR_EXC_GAIN_LOSS_R> subL = l.subList(idk, dtlR.act_d_no(), dtlR.act_d_seq());
				if (!isNull(subL)) {
					dtlR.exc_gain_loss(subL.sum(MST_AR_EXC_GAIN_LOSS_R.$exc_gain_loss));
				}
			}
		}

		/**
		 * 登録対象月次売掛残高リスト集計ポリシー取得<br />
		 * 登録対象月次売掛残高リストの集計ポリシーを取得する。
		 * 
		 * @return 登録対象月次売掛残高リストの集計ポリシー
		 */
		protected MCGroupByPolicy getMlyArBalGroupByPolicy() {
			MCGroupByPolicy gp = new MCGroupByPolicy(_mlyArBalGroupByCols);
			gp.sum(MST_MLY_AR_BAL_R.$sls_amt,
					MST_MLY_AR_BAL_R.$ret_amt,
					MST_MLY_AR_BAL_R.$dscnt_amt,
					MST_MLY_AR_BAL_R.$sw_to_amt,
					MST_MLY_AR_BAL_R.$cash_amt,
					MST_MLY_AR_BAL_R.$note_amt,
					MST_MLY_AR_BAL_R.$xfr_amt,
					MST_MLY_AR_BAL_R.$setoff_amt,
					MST_MLY_AR_BAL_R.$sw_amt,
					MST_MLY_AR_BAL_R.$tax_amt,
					MST_MLY_AR_BAL_R.$base_cur_sls_amt,
					MST_MLY_AR_BAL_R.$base_cur_ret_amt,
					MST_MLY_AR_BAL_R.$base_cur_dscnt_amt,
					MST_MLY_AR_BAL_R.$base_cur_sw_to_amt,
					MST_MLY_AR_BAL_R.$base_cur_cash_amt,
					MST_MLY_AR_BAL_R.$base_cur_note_amt,
					MST_MLY_AR_BAL_R.$base_cur_xfr_amt,
					MST_MLY_AR_BAL_R.$base_cur_setoff_amt,
					MST_MLY_AR_BAL_R.$base_cur_sw_amt,
					MST_MLY_AR_BAL_R.$base_cur_tax_amt,
					MST_MLY_AR_BAL_R.$exc_gain_loss,
					MST_MLY_AR_BAL_R.$total_exc_gain_loss);
			return gp;
		}

		/** 登録対象月次売掛残高リストの集計キー */
		protected String[] _mlyArBalGroupByCols = {
				MST_MLY_AR_BAL_R.$ac_ym,
				MST_MLY_AR_BAL_R.$acst_cd,
				MST_MLY_AR_BAL_R.$iv_no,
				MST_MLY_AR_BAL_R.$trd_cur_cd,
				MST_MLY_AR_BAL_R.$wrk_no,
				MST_MLY_AR_BAL_R.$ar_dpt_cd,
				MST_MLY_AR_BAL_R.$ar_typ
		};

		/**
		 * 登録対象月次売掛残高リストソートポリシー取得<br />
		 * 登録対象月次売掛残高リストのソートポリシーを取得する。
		 * 
		 * @return 登録対象月次売掛残高リストのソートポリシー
		 */
		protected MCSortPolicy getMlyArBalSortPolicy() {
			MCSortPolicy sp = new MCSortPolicy();
			sp.add(SortType.ASC, MST_MLY_AR_BAL_R.$ac_ym);
			sp.add(SortType.ASC, MST_MLY_AR_BAL_R.$acst_cd);
			sp.add(SortType.ASC, MST_MLY_AR_BAL_R.$iv_no);
			sp.add(SortType.ASC, MST_MLY_AR_BAL_R.$trd_cur_cd);
			sp.add(SortType.ASC, MST_MLY_AR_BAL_R.$ar_dpt_cd);
			sp.add(SortType.ASC, MST_MLY_AR_BAL_R.$wrk_no);
			sp.add(SortType.ASC, MST_MLY_AR_BAL_R.$ar_typ);
			return sp;
		}

		/**
		 * 月次売掛残高ロック<br />
		 * 登録しようとする月次売掛残高がすでに存在した場合、ロックしてその情報を返す
		 * 
		 * @param cndR 登録しようとする月次売掛残高
		 * 
		 * @return 登録しようとする月次売掛残高がすでに存在した場合はその情報。
		 * 存在しなかった場合は空のDBコンテナ。
		 */
		protected MST_MLY_AR_BAL_R lockMlyArBal(MST_MLY_AR_BAL_R cndR) {
			MST_MLY_AR_BAL_R r = MST_MLY_AR_BAL_R.create();
			MST_MLY_AR_BAL_R t = MST_MLY_AR_BAL_R.create("T");
			MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);

			r_bldr.setSelect(t.ac_ym, t.acst_cd, t.ar_dpt_cd, t.trd_cur_cd, t.iv_no, t.wrk_no, t.ar_typ);
			r_bldr.addWhereWithAnd(t.ac_ym.eq(bind("1")), cndR.ac_ym());
			r_bldr.addWhereWithAnd(t.acst_cd.eq(bind("1")), cndR.acst_cd());
			r_bldr.addWhereWithAnd(t.iv_no.eq(bind("1")), cndR.iv_no());
			r_bldr.addWhereWithAnd(t.trd_cur_cd.eq(bind("1")), cndR.trd_cur_cd());
			r_bldr.addWhereWithAnd(bracket(t.wrk_no.eq(bind("1"))
					.or(t.wrk_no.isNull())
					.and(bind("1").isNull())),
					cndR.wrk_no());
			r_bldr.addWhereWithAnd(t.ar_dpt_cd.eq(bind("1")), cndR.ar_dpt_cd());
			r_bldr.addWhereWithAnd(t.ar_typ.eq(bind("1")), cndR.ar_typ());
			dbSelectForUpdate("MSBGL5010_MST_MLY_AR_BAL_S01", r, r_bldr);

			return r;
		}

		/**
		 * 月次売掛残高新規登録<br />
		 * 月次売掛残高を新規登録する。
		 * 
		 * @param regR 登録する月次売掛残高
		 */
		protected void insMlyArBal(MST_MLY_AR_BAL_R regR) {
			MST_MLY_AR_BAL_R insR = regR.clone();
			// 取引通貨金額項目
			insR.ar_appl_amt(MCNumber.ZERO);
			insR.ar_not_appl_bal(regR.sls_amt()
					.add(regR.ret_amt())
					.add(regR.dscnt_amt())
					.add(regR.sw_to_amt())
					.add(regR.tax_amt()));
			insR.rcv_appl_amt(MCNumber.ZERO);
			// 基準通貨金額項目
			insR.base_cur_ar_appl_amt(MCNumber.ZERO);
			insR.base_cur_ar_not_appl_bal(regR.base_cur_sls_amt()
					.add(regR.base_cur_ret_amt()) 
					.add(regR.base_cur_dscnt_amt())
					.add(regR.base_cur_sw_to_amt())
					.add(regR.base_cur_tax_amt()));
			insR.base_cur_rcv_appl_amt(MCNumber.ZERO);
			insR.base_cur_cd(getBaseCur().cur_cd());

			// 未請求残高振替払出
			if (MSC_AR_OPE_TYP.isARSW_OUT_NOT_BILL_BAL(up1().ar_ope_typ())) {
				// 取引通貨金額項目
				insR.init_bal(MCNumber.ZERO);
				insR.sls_amt(MCNumber.ZERO);
				insR.ret_amt(MCNumber.ZERO);
				insR.dscnt_amt(MCNumber.ZERO);
				insR.sw_to_amt(MCNumber.ZERO);
				insR.tax_amt(MCNumber.ZERO);
				insR.cash_amt(MCNumber.ZERO);
				insR.note_amt(MCNumber.ZERO);
				insR.xfr_amt(MCNumber.ZERO);
				insR.setoff_amt(MCNumber.ZERO);
				insR.sw_amt(MCNumber.ZERO);
				insR.end_bal(MCNumber.ZERO);
				insR.rcv_not_appl_bal(MCNumber.ZERO);
				// 基準通貨金額項目
				insR.base_cur_init_bal(MCNumber.ZERO);
				insR.base_cur_sls_amt(MCNumber.ZERO);
				insR.base_cur_ret_amt(MCNumber.ZERO);
				insR.base_cur_dscnt_amt(MCNumber.ZERO);
				insR.base_cur_sw_to_amt(MCNumber.ZERO);
				insR.base_cur_tax_amt(MCNumber.ZERO);
				insR.base_cur_cash_amt(MCNumber.ZERO);
				insR.base_cur_note_amt(MCNumber.ZERO);
				insR.base_cur_xfr_amt(MCNumber.ZERO);
				insR.base_cur_setoff_amt(MCNumber.ZERO);
				insR.base_cur_sw_amt(MCNumber.ZERO);
				insR.base_cur_end_bal(MCNumber.ZERO);
				insR.base_cur_rcv_not_appl_bal(MCNumber.ZERO);
				insR.exc_gain_loss(MCNumber.ZERO);
				insR.total_exc_gain_loss(MCNumber.ZERO);
			}
			// 通常更新
			else {
				MCNumber[] endBal = getEndBal(regR);
				// 取引通貨金額項目
				insR.init_bal(endBal[0]);
				insR.cash_amt(regR.cash_amt().negate());
				insR.note_amt(regR.note_amt().negate());
				insR.xfr_amt(regR.xfr_amt().negate());
				insR.setoff_amt(regR.setoff_amt().negate());
				insR.sw_amt(regR.sw_amt().negate());
				insR.end_bal(endBal[0].add(MSBGL_ArUtil.getBillAmt(regR)));
				insR.rcv_not_appl_bal(MSBGL_ArUtil.getRcvAmt(regR).negate());
				// 基準通貨金額項目
				insR.base_cur_init_bal(endBal[1]);
				insR.base_cur_cash_amt(regR.base_cur_cash_amt().negate());
				insR.base_cur_note_amt(regR.base_cur_note_amt().negate());
				insR.base_cur_xfr_amt(regR.base_cur_xfr_amt().negate());
				insR.base_cur_setoff_amt(regR.base_cur_setoff_amt().negate());
				insR.base_cur_sw_amt(regR.base_cur_sw_amt().negate());
				insR.base_cur_end_bal(endBal[1].add(MSBGL_ArUtil.getBaseCurBillAmt(regR))
						.add(regR.exc_gain_loss()));
				insR.base_cur_rcv_not_appl_bal(MSBGL_ArUtil.getBaseCurRcvAmt(regR).negate());
				// 為替差損益項目
				insR.total_exc_gain_loss(endBal[2].add(insR.exc_gain_loss()));
			}
			
			MCQueryApiBuilder arBal_bldr = MCQueryApiBuilder.create(MST_MLY_AR_BAL_R.create("T"));
			dbInsertEx("MSBGL5010_MST_MLY_AR_BAL_I01", insR, arBal_bldr);
		}

		/**
		 * 月次売掛残高新規登録<br />
		 * 月次売掛残高を新規登録する。
		 * 
		 * @param regR 登録する月次売掛残高
		 */
		protected void insMlyArBalForSw(MST_MLY_AR_BAL_R regR) {
			MST_MLY_AR_BAL_R insR = regR.clone();

			MCNumber[] endBal = getEndBal(regR);

			// 取引通貨金額項目
			insR.ar_appl_amt(MCNumber.ZERO);
			insR.ar_not_appl_bal(MCNumber.ZERO);
			insR.rcv_appl_amt(MCNumber.ZERO);
			insR.rcv_not_appl_bal(MCNumber.ZERO);
			insR.init_bal(endBal[0]);
			insR.end_bal(endBal[0].add(MSBGL_ArUtil.getBillAmt(regR)));
			// 基準通貨金額項目
			insR.base_cur_ar_appl_amt(MCNumber.ZERO);
			insR.base_cur_ar_not_appl_bal(MCNumber.ZERO);
			insR.base_cur_rcv_appl_amt(MCNumber.ZERO);
			insR.base_cur_rcv_not_appl_bal(MCNumber.ZERO);
			insR.base_cur_init_bal(endBal[1]);
			insR.base_cur_end_bal(endBal[1].add(MSBGL_ArUtil.getBaseCurBillAmt(regR)));

			MCQueryApiBuilder arBal_bldr = MCQueryApiBuilder.create(MST_MLY_AR_BAL_R.create("T"));
			dbInsertEx("MSBGL5010_MST_MLY_AR_BAL_I02", insR, arBal_bldr);
		}

		/**
		 * 月初残高取得<br />
		 * 月初残高を取得する。
		 * 
		 * @param cndR 登録する月次売掛残高
		 * 
		 * @return 月初残高
		 */
		protected MCNumber[] getEndBal(MST_MLY_AR_BAL_R cndR) {
			MCList<MST_MLY_AR_BAL_R> l = MCList.create(MST_MLY_AR_BAL_R.class);
			MST_MLY_AR_BAL_R t = MST_MLY_AR_BAL_R.create("T");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
			l_bldr.setSelect(t.end_bal);
			l_bldr.addSelect(t.base_cur_end_bal);
			l_bldr.addSelect(t.total_exc_gain_loss);
			l_bldr.addWhereWithAnd(t.ar_dpt_cd.eq(bind("1")), cndR.ar_dpt_cd());
			l_bldr.addWhereWithAnd(t.acst_cd.eq(bind("1")), cndR.acst_cd());
			l_bldr.addWhereWithAnd(t.trd_cur_cd.eq(bind("1")), cndR.trd_cur_cd());
			l_bldr.addWhereWithAnd(bracket(t.wrk_no.eq(bind("1"))
					.or(t.wrk_no.isNull())
					.and(bind("1").isNull())),
					cndR.wrk_no());
			l_bldr.addWhereWithAnd(t.iv_no.eq(bind("1")), cndR.iv_no());
			l_bldr.addWhereWithAnd(t.ar_typ.eq(bind("1")), cndR.ar_typ());
			l_bldr.addWhereWithAnd(t.ac_ym.lt(bind("1")), cndR.ac_ym());
			l_bldr.addOrderByDesc(t.ac_ym);
			dbSelect("MSBGL5010_MST_MLY_AR_BAL_S02", l, l_bldr);

			if (l.isEmpty()) {
				MCNumber[] retNum = {
						MCNumber.ZERO,
						MCNumber.ZERO,
						MCNumber.ZERO
						};
				return retNum;
			}
			else {
				MCNumber[] retNum = {
						l.get(0).end_bal(),
						l.get(0).base_cur_end_bal(),
						l.get(0).total_exc_gain_loss()
						};
				return retNum;
			}
		}

		/**
		 * 月次売掛残高更新<br />
		 * 月次売掛残高を更新する。
		 * 
		 * @param regR 更新する金額情報
		 * @param cndR 更新する月次売掛残高
		 */
		protected void updMlyArBal(MST_MLY_AR_BAL_R regR, MST_MLY_AR_BAL_R cndR) {
			MCRow bind = regR.clone();

			// 売掛残高の設定
			bind.setNumberNE("ar_bal",
					regR.sls_amt()
					.add(regR.ret_amt())
					.add(regR.dscnt_amt())
					.add(regR.sw_to_amt())
					.add(regR.tax_amt())
					);
			// 売掛残高（基準通貨）の設定
			bind.setNumberNE("base_cur_ar_bal",
					regR.base_cur_sls_amt()
					.add(regR.base_cur_ret_amt())
					.add(regR.base_cur_dscnt_amt())
					.add(regR.base_cur_sw_to_amt())
					.add(regR.base_cur_tax_amt())
					);
			
			MST_MLY_AR_BAL_R t = MST_MLY_AR_BAL_R.create("T");
			MCQueryApiBuilder arbal_bldr = MCQueryApiBuilder.create(t);
			arbal_bldr.setWhere(t.ac_ym.eq(bindEx("ac_ym")));
			arbal_bldr.addWhereWithAnd(t.acst_cd.eq(bindEx("acst_cd")));
			arbal_bldr.addWhereWithAnd(t.ar_dpt_cd.eq(bindEx("ar_dpt_cd")));
			arbal_bldr.addWhereWithAnd(t.trd_cur_cd.eq(bindEx("trd_cur_cd")));
			arbal_bldr.addWhereWithAnd(t.iv_no.eq(bindEx("iv_no")));
			arbal_bldr.addWhereWithAnd(bracket(t.wrk_no.eq(bindEx("wrk_no"))
					.or(t.wrk_no.isNull())
					.and(bindEx("wrk_no").isNull())));
			arbal_bldr.addWhereWithAnd(t.ar_typ.eq(bindEx("ar_typ")));
			
			// 未請求明細振替(-)の場合、消込更新
			if (MSC_AR_OPE_TYP.isARSW_OUT_NOT_BILL_BAL(up1().ar_ope_typ())) {
				arbal_bldr.setSetVL(t.ar_not_appl_bal, t.ar_not_appl_bal.add(bindEx("ar_bal")));
				arbal_bldr.addSetVL(t.base_cur_ar_not_appl_bal, t.base_cur_ar_not_appl_bal.add(bindEx("base_cur_ar_bal")));
			}
			// 通常更新
			else {
				bind.setNumberNE("rcv", MSBGL_ArUtil.getRcvAmt(regR));
				bind.setNumberNE("base_cur_rcv", MSBGL_ArUtil.getBaseCurRcvAmt(regR));
				
				arbal_bldr.setSetVL(t.ar_dpt_cd, bindEx("ar_dpt_cd"));
				arbal_bldr.addSetVL(t.sls_amt, t.sls_amt.add(bindEx("sls_amt")));
				arbal_bldr.addSetVL(t.ret_amt, t.ret_amt.add(bindEx("ret_amt")));
				arbal_bldr.addSetVL(t.dscnt_amt, t.dscnt_amt.add(bindEx("dscnt_amt")));
				arbal_bldr.addSetVL(t.sw_to_amt, t.sw_to_amt.add(bindEx("sw_to_amt")));
				arbal_bldr.addSetVL(t.tax_amt, t.tax_amt.add(bindEx("tax_amt")));
				arbal_bldr.addSetVL(t.cash_amt, t.cash_amt.subtract(bindEx("cash_amt")));
				arbal_bldr.addSetVL(t.note_amt, t.note_amt.subtract(bindEx("note_amt")));
				arbal_bldr.addSetVL(t.xfr_amt, t.xfr_amt.subtract(bindEx("xfr_amt")));
				arbal_bldr.addSetVL(t.setoff_amt, t.setoff_amt.subtract(bindEx("setoff_amt")));
				arbal_bldr.addSetVL(t.sw_amt, t.sw_amt.subtract(bindEx("sw_amt")));
				arbal_bldr.addSetVL(t.end_bal, t.end_bal.add(bindEx("ar_bal")).add(bindEx("rcv")));
				arbal_bldr.addSetVL(t.rcv_not_appl_bal, t.rcv_not_appl_bal.subtract(bindEx("rcv")));
				arbal_bldr.addSetVL(t.ar_not_appl_bal, t.ar_not_appl_bal.add(bindEx("ar_bal")));

				arbal_bldr.addSetVL(t.base_cur_sls_amt, t.base_cur_sls_amt.add(bindEx("base_cur_sls_amt")));
				arbal_bldr.addSetVL(t.base_cur_ret_amt, t.base_cur_ret_amt.add(bindEx("base_cur_ret_amt")));
				arbal_bldr.addSetVL(t.base_cur_dscnt_amt, t.base_cur_dscnt_amt.add(bindEx("base_cur_dscnt_amt")));
				arbal_bldr.addSetVL(t.base_cur_sw_to_amt, t.base_cur_sw_to_amt.add(bindEx("base_cur_sw_to_amt")));
				arbal_bldr.addSetVL(t.base_cur_tax_amt, t.base_cur_tax_amt.add(bindEx("base_cur_tax_amt")));

				arbal_bldr.addSetVL(t.base_cur_cash_amt, t.base_cur_cash_amt.subtract(bindEx("base_cur_cash_amt")));
				arbal_bldr.addSetVL(t.base_cur_note_amt, t.base_cur_note_amt.subtract(bindEx("base_cur_note_amt")));
				arbal_bldr.addSetVL(t.base_cur_xfr_amt, t.base_cur_xfr_amt.subtract(bindEx("base_cur_xfr_amt")));
				arbal_bldr.addSetVL(t.base_cur_setoff_amt, t.base_cur_setoff_amt.subtract(bindEx("base_cur_setoff_amt")));
				arbal_bldr.addSetVL(t.base_cur_sw_amt, t.base_cur_sw_amt.subtract(bindEx("base_cur_sw_amt")));

				arbal_bldr.addSetVL(t.base_cur_end_bal,
						t.base_cur_end_bal.add(bindEx("base_cur_ar_bal")).add(bindEx("base_cur_rcv")).add(bindEx("exc_gain_loss")));
				arbal_bldr.addSetVL(t.base_cur_rcv_not_appl_bal, t.base_cur_rcv_not_appl_bal.subtract(bindEx("base_cur_rcv")));
				arbal_bldr.addSetVL(t.base_cur_ar_not_appl_bal, t.base_cur_ar_not_appl_bal.add(bindEx("base_cur_ar_bal")));
				arbal_bldr.addSetVL(t.exc_gain_loss, t.exc_gain_loss.add(bindEx("exc_gain_loss")));
				arbal_bldr.addSetVL(t.total_exc_gain_loss, t.total_exc_gain_loss.add(bindEx("exc_gain_loss")));
			}
			dbUpdate("MSBGL5010_MST_MLY_AR_BAL_U01", bind, arbal_bldr);
		}

		/**
		 * 月次売掛残高更新<br />
		 * 月次売掛残高を更新する。
		 * 
		 * @param regR 更新する金額情報
		 * @param cndR 更新する月次売掛残高
		 */
		protected void updMlyArBalForSw(MST_MLY_AR_BAL_R regR, MST_MLY_AR_BAL_R cndR) {
			MCRow bind = regR.clone();

			// 売掛残高の設定
			bind.setNumberNE("ar_bal",
					regR.sls_amt()
					.add(regR.ret_amt())
					.add(regR.dscnt_amt())
					.add(regR.tax_amt())
					.add(regR.sw_to_amt())
					);
			// 売掛残高（基準通貨）を設定
			bind.setNumberNE("base_cur_ar_bal",
					regR.base_cur_sls_amt()
					.add(regR.base_cur_ret_amt())
					.add(regR.base_cur_dscnt_amt())
					.add(regR.base_cur_tax_amt())
					.add(regR.base_cur_sw_to_amt())
					);

			// 入金の金額は取引区分のAR_AMT_PMにより-1を掛けた値なので
			// ここで-1を掛けてAR_AMT_PMの-1を打ち消す
			MST_MLY_AR_BAL_R t = MST_MLY_AR_BAL_R.create("T");
			MCQueryApiBuilder arbal_bldr = MCQueryApiBuilder.create(t);
			arbal_bldr.setWhere(t.ac_ym.eq(bindEx("ac_ym")));
			arbal_bldr.addWhereWithAnd(t.acst_cd.eq(bindEx("acst_cd")));
			arbal_bldr.addWhereWithAnd(t.ar_dpt_cd.eq(bindEx("ar_dpt_cd")));
			arbal_bldr.addWhereWithAnd(t.trd_cur_cd.eq(bindEx("trd_cur_cd")));
			arbal_bldr.addWhereWithAnd(t.iv_no.eq(bindEx("iv_no")));
			arbal_bldr.addWhereWithAnd(bracket(t.wrk_no.eq(bindEx("wrk_no"))
					.or(t.wrk_no.isNull())
					.and(bindEx("wrk_no").isNull())));
			arbal_bldr.addWhereWithAnd(t.ar_typ.eq(bindEx("ar_typ")));
			arbal_bldr.setSetVL(t.ar_dpt_cd, bindEx("ar_dpt_cd"));
			arbal_bldr.addSetVL(t.sls_amt, t.sls_amt.add(bindEx("sls_amt")));
			arbal_bldr.addSetVL(t.ret_amt, t.ret_amt.add(bindEx("ret_amt")));
			arbal_bldr.addSetVL(t.dscnt_amt, t.dscnt_amt.add(bindEx("dscnt_amt")));
			arbal_bldr.addSetVL(t.sw_to_amt, t.sw_to_amt.add(bindEx("sw_to_amt")));
			arbal_bldr.addSetVL(t.tax_amt, t.tax_amt.add(bindEx("tax_amt")));
			arbal_bldr.addSetVL(t.end_bal, t.end_bal.add(bindEx("ar_bal")));
			arbal_bldr.addSetVL(t.base_cur_sls_amt, t.base_cur_sls_amt.add(bindEx("base_cur_sls_amt")));
			arbal_bldr.addSetVL(t.base_cur_ret_amt, t.base_cur_ret_amt.add(bindEx("base_cur_ret_amt")));
			arbal_bldr.addSetVL(t.base_cur_dscnt_amt, t.base_cur_dscnt_amt.add(bindEx("base_cur_dscnt_amt")));
			arbal_bldr.addSetVL(t.base_cur_sw_to_amt, t.base_cur_sw_to_amt.add(bindEx("base_cur_sw_to_amt")));
			arbal_bldr.addSetVL(t.base_cur_tax_amt, t.base_cur_tax_amt.add(bindEx("base_cur_tax_amt")));
			arbal_bldr.addSetVL(t.base_cur_end_bal, t.base_cur_end_bal.add(bindEx("base_cur_ar_bal")));
			
			dbUpdate("MSBGL5010_MST_MLY_AR_BAL_U02", bind, arbal_bldr);
		}

		/**
		 * 後続月次売掛残高更新<br />
		 * 登録した月次売掛残高の売掛計上年月よりも後の月次売掛残高を更新する。
		 * 
		 * @param regR 登録した月次売掛残高
		 */
		protected void updFollowingMlyArBal(MST_MLY_AR_BAL_R regR) {
			MCRow bind = regR.clone();
			bind.setNumberNE("bill_amt", MSBGL_ArUtil.getBillAmt(regR));
			bind.setNumberNE("base_cur_bill_amt", MSBGL_ArUtil.getBaseCurBillAmt(regR));

			MST_MLY_AR_BAL_R t = MST_MLY_AR_BAL_R.create("T");
			MCQueryApiBuilder arBal_bldr = MCQueryApiBuilder.create(t);

			arBal_bldr.setWhere(t.acst_cd.eq(bindEx("acst_cd")));
			arBal_bldr.addWhereWithAnd(t.ac_ym.gt(bindEx("ac_ym")));
			arBal_bldr.addWhereWithAnd(t.ar_dpt_cd.eq(bindEx("ar_dpt_cd")));
			arBal_bldr.addWhereWithAnd(t.trd_cur_cd.eq(bindEx("trd_cur_cd")));
			arBal_bldr.addWhereWithAnd(t.iv_no.eq(bindEx("iv_no")));
			arBal_bldr.addWhereWithAnd(t.wrk_no.eq(bindEx("wrk_no"))
					.or(t.wrk_no.isNull()).
					and(bindEx("wrk_no").isNull()));
			arBal_bldr.addWhereWithAnd(t.ar_typ.eq(bindEx("ar_typ")));

			arBal_bldr.setSetVL(t.init_bal, t.init_bal.add(bindEx("bill_amt")));
			arBal_bldr.addSetVL(t.end_bal, t.end_bal.add(bindEx("bill_amt")));
			arBal_bldr.addSetVL(t.base_cur_init_bal, t.base_cur_init_bal
					.add(bindEx("base_cur_bill_amt"))
					.add(bindEx("exc_gain_loss")));
			arBal_bldr.addSetVL(t.base_cur_end_bal, t.base_cur_end_bal
					.add(bindEx("base_cur_bill_amt"))
					.add(bindEx("exc_gain_loss")));
			arBal_bldr.addSetVL(t.total_exc_gain_loss, t.total_exc_gain_loss.add(bindEx("exc_gain_loss")));

			dbUpdate("MSBGL5010_MST_MLY_AR_BAL_U03", bind, arBal_bldr);

		}

		/**
		 * 未請求明細振替用月次売掛残高登録<br />
		 * 画面の計上年月で月次売掛残高を登録する。
		 */
		protected void regMlyArBalForSw() {
			for (MST_MLY_AR_BAL_R regR : getRegMlyArBalL(createMapMlyArBalForSw())) {
				// 更新対象のレコードを検索
				MST_MLY_AR_BAL_R lockR = lockMlyArBal(regR);

				if (lockR.isEmpty()) {
					insMlyArBalForSw(regR);
				}
				else {
					updMlyArBalForSw(regR, lockR);
				}

				// 繰越の場合、後続する売掛情報更新処理を呼び出す
				if (!isEachSls(regR.iv_no())) {
					updFollowingMlyArBal(regR);
				}
			}
		}

		// ---------- RowMapper ----------
		protected MapBillGrp<ArCmn_Upd01_BillGrpR, ArCmn_Upd01_DtlR> createMapBillGrp() {
			return new MapBillGrp<ArCmn_Upd01_BillGrpR, ArCmn_Upd01_DtlR>();
		}
		public class MapBillGrp<D extends ArCmn_Upd01_BillGrpR, S extends ArCmn_Upd01_DtlR> extends
				MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ArCmn_Upd01_BillGrpR.$bill_mng_no, ArCmn_Upd01_DtlR.$bill_mng_no);
				addColumnPathMap(ArCmn_Upd01_BillGrpR.$bill_cl_dt, ArCmn_Upd01_DtlR.$bill_cl_dt);
				addColumnPathMap(ArCmn_Upd01_BillGrpR.$bcst_cd, ArCmn_Upd01_DtlR.$bcst_cd);
				addColumnPathMap(ArCmn_Upd01_BillGrpR.$bill_dpt_cd, ArCmn_Upd01_DtlR.$bill_dpt_cd);
				addColumnPathMap(ArCmn_Upd01_BillGrpR.$iv_no, ArCmn_Upd01_DtlR.$iv_no);
				addColumnPathMap(ArCmn_Upd01_BillGrpR.$bill_iv_no, ArCmn_Upd01_DtlR.$bill_iv_no);
				addColumnPathMap(ArCmn_Upd01_BillGrpR.$trd_cur_cd, ArCmn_Upd01_DtlR.$trd_cur_cd);
				addColumnPathMap(ArCmn_Upd01_BillGrpR.$bill_xrate, ArCmn_Upd01_DtlR.$xrate);
				addColumnPathMap(ArCmn_Upd01_BillGrpR.$slip_sts_typ, ArCmn_Upd01_DtlR.$slip_sts_typ);
				addColumnPathMap(ArCmn_Upd01_BillGrpR.$rcv_schd_dt, ArCmn_Upd01_DtlR.$rcv_schd_dt);
				addColumnPathMap(ArCmn_Upd01_BillGrpR.$bill_basis_dt, ArCmn_Upd01_DtlR.$bill_basis_dt);
				addColumnPathMap(ArCmn_Upd01_BillGrpR.$wrk_no, ArCmn_Upd01_DtlR.$ar_wrk_no);
			}
			@Override
			public void valueCopy(D dest, S src) {
				setCmnAmt(dest, src);
				setCmnBaseCurAmt(dest, src);
				setBillAmt(dest, src);
				setBillBaseCurAmt(dest, src);
				// 源泉税額は個別に設定する
				dest.wtax_amt(MSBGL_ArUtil.getWtaxAmt(
						src.trd_ptn_typ(), src.wtax_amt()).multiply(
								MSC_AR_OPE_TYP.ar_amt_pm(up1().ar_ope_typ())));
			}
		}

		protected MapRcvMtdGrp<ArCmn_Upd01_BillGrpR, ArCmn_Upd01_DtlR> createMapRcvMtdGrp() {
			return new MapRcvMtdGrp<ArCmn_Upd01_BillGrpR, ArCmn_Upd01_DtlR>();
		}
		public class MapRcvMtdGrp<D extends ArCmn_Upd01_BillGrpR, S extends ArCmn_Upd01_DtlR> extends
				MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ArCmn_Upd01_BillGrpR.$rcv_mtd_cd, ArCmn_Upd01_DtlR.$rcv_mtd_cd);
			}
			@Override
			public void valueCopy(D dest, S src) {
				setCmnAmt(dest, src);
				setCmnBaseCurAmt(dest, src);
				// 源泉税額は個別に設定する
				dest.wtax_amt(MSBGL_ArUtil.getWtaxAmt(
						src.trd_ptn_typ(), src.wtax_amt()).multiply(
								MSC_AR_OPE_TYP.ar_amt_pm(up1().ar_ope_typ())));
			}
		}

		protected Map_MST_BILL_ACST_R_ArCmn_Upd01_DtlR<MST_BILL_ACST_R,ArCmn_Upd01_DtlR> createMap_MST_BILL_ACST_R_ArCmn_Upd01_DtlR() {
			return new Map_MST_BILL_ACST_R_ArCmn_Upd01_DtlR<MST_BILL_ACST_R, ArCmn_Upd01_DtlR>();
		}
		public class Map_MST_BILL_ACST_R_ArCmn_Upd01_DtlR<D extends MST_BILL_ACST_R, S extends ArCmn_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_BILL_ACST_R.$bill_mng_no, ArCmn_Upd01_DtlR.$bill_mng_no);
				addColumnPathMap(MST_BILL_ACST_R.$acst_cd, ArCmn_Upd01_DtlR.$acst_cd);
				addColumnPathMap(MST_BILL_ACST_R.$ar_dpt_cd, ArCmn_Upd01_DtlR.$ar_dpt_cd);
				addColumnPathMap(MST_BILL_ACST_R.$ar_typ, ArCmn_Upd01_DtlR.$ar_typ);
			}
			@Override
			public void valueCopy(D dest, S src) {
				setCmnAmt(dest, src);
				setBillAmt(dest, src);
			}
		}

		protected MapInsBillD<MST_BILL_D_R, ArCmn_Upd01_DtlR> createMapInsBillD() {
			return new MapInsBillD<MST_BILL_D_R, ArCmn_Upd01_DtlR>();
		}
		public class MapInsBillD<D extends MST_BILL_D_R, S extends ArCmn_Upd01_DtlR> extends
				MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_BILL_D_R.$bill_d_typ, ArCmn_Upd01_DtlR.$bill_d_typ);
				addColumnPathMap(MST_BILL_D_R.$trd_cd, ArCmn_Upd01_DtlR.$trd_cd);
				addColumnPathMap(MST_BILL_D_R.$act_no, ArCmn_Upd01_DtlR.$act_no);
				addColumnPathMap(MST_BILL_D_R.$act_seq, ArCmn_Upd01_DtlR.$act_seq);
				addColumnPathMap(MST_BILL_D_R.$act_rev, ArCmn_Upd01_DtlR.$act_rev);
				addColumnPathMap(MST_BILL_D_R.$act_d_no, ArCmn_Upd01_DtlR.$act_d_no);
				addColumnPathMap(MST_BILL_D_R.$act_d_seq, ArCmn_Upd01_DtlR.$act_d_seq);
				addColumnPathMap(MST_BILL_D_R.$ar_trd_grp_typ, ArCmn_Upd01_DtlR.$ar_trd_grp_typ);
				addColumnPathMap(MST_BILL_D_R.$trd_ptn_typ, ArCmn_Upd01_DtlR.$trd_ptn_typ);
				addColumnPathMap(MST_BILL_D_R.$rcv_mtd_cd, ArCmn_Upd01_DtlR.$rcv_mtd_cd);
				addColumnPathMap(MST_BILL_D_R.$rcv_typ, ArCmn_Upd01_DtlR.$rcv_typ);
				addColumnPathMap(MST_BILL_D_R.$ar_typ, ArCmn_Upd01_DtlR.$ar_typ);
				addColumnPathMap(MST_BILL_D_R.$iv_no, ArCmn_Upd01_DtlR.$iv_no);
				addColumnPathMap(MST_BILL_D_R.$sls_dpt_cd, ArCmn_Upd01_DtlR.$sls_dpt_cd);
				addColumnPathMap(MST_BILL_D_R.$sls_usr_cd, ArCmn_Upd01_DtlR.$sls_usr_cd);
				addColumnPathMap(MST_BILL_D_R.$cst_cd, ArCmn_Upd01_DtlR.$cst_cd);
				addColumnPathMap(MST_BILL_D_R.$dlv_cd, ArCmn_Upd01_DtlR.$dlv_cd);
				addColumnPathMap(MST_BILL_D_R.$dlv_nm, ArCmn_Upd01_DtlR.$dlv_nm);
				addColumnPathMap(MST_BILL_D_R.$dlv_sundry_flg, ArCmn_Upd01_DtlR.$dlv_sundry_flg);
				addColumnPathMap(MST_BILL_D_R.$dest_cd1, ArCmn_Upd01_DtlR.$dest_cd1);
				addColumnPathMap(MST_BILL_D_R.$dest_cd2, ArCmn_Upd01_DtlR.$dest_cd2);
				addColumnPathMap(MST_BILL_D_R.$dest_cd3, ArCmn_Upd01_DtlR.$dest_cd3);
				addColumnPathMap(MST_BILL_D_R.$cst_po_no, ArCmn_Upd01_DtlR.$cst_po_no);
				addColumnPathMap(MST_BILL_D_R.$cst_po_d_no, ArCmn_Upd01_DtlR.$cst_po_d_no);
				addColumnPathMap(MST_BILL_D_R.$itm_cd, ArCmn_Upd01_DtlR.$itm_cd);
				addColumnPathMap(MST_BILL_D_R.$itm_sub1, ArCmn_Upd01_DtlR.$itm_sub1);
				addColumnPathMap(MST_BILL_D_R.$itm_sub2, ArCmn_Upd01_DtlR.$itm_sub2);
				addColumnPathMap(MST_BILL_D_R.$itm_sub3, ArCmn_Upd01_DtlR.$itm_sub3);
				addColumnPathMap(MST_BILL_D_R.$itm_nm, ArCmn_Upd01_DtlR.$itm_nm);
				addColumnPathMap(MST_BILL_D_R.$sundry_itm_flg, ArCmn_Upd01_DtlR.$sundry_itm_flg);
				addColumnPathMap(MST_BILL_D_R.$cst_itm_cd, ArCmn_Upd01_DtlR.$cst_itm_cd);
				addColumnPathMap(MST_BILL_D_R.$cst_itm_nm, ArCmn_Upd01_DtlR.$cst_itm_nm);
				addColumnPathMap(MST_BILL_D_R.$trd_d_rmrks, ArCmn_Upd01_DtlR.$trd_d_rmrks);
				addColumnPathMap(MST_BILL_D_R.$bill_d_rmrks, ArCmn_Upd01_DtlR.$bill_d_rmrks);
				addColumnPathMap(MST_BILL_D_R.$dlv_slip_no, ArCmn_Upd01_DtlR.$dlv_slip_no);
				addColumnPathMap(MST_BILL_D_R.$dlv_slip_d_no, ArCmn_Upd01_DtlR.$dlv_slip_d_no);
				addColumnPathMap(MST_BILL_D_R.$ship_dlv_slip_no, ArCmn_Upd01_DtlR.$ship_dlv_slip_no);
				addColumnPathMap(MST_BILL_D_R.$ship_dlv_slip_d_no, ArCmn_Upd01_DtlR.$ship_dlv_slip_d_no);
				addColumnPathMap(MST_BILL_D_R.$ship_dlv_slip_multi_flg, ArCmn_Upd01_DtlR.$ship_dlv_slip_multi_flg);
				addColumnPathMap(MST_BILL_D_R.$slo_no, ArCmn_Upd01_DtlR.$slo_no);
				addColumnPathMap(MST_BILL_D_R.$slo_d_no, ArCmn_Upd01_DtlR.$slo_d_no);
				addColumnPathMap(MST_BILL_D_R.$par_act_no, ArCmn_Upd01_DtlR.$par_act_no);
				addColumnPathMap(MST_BILL_D_R.$par_act_seq, ArCmn_Upd01_DtlR.$par_act_seq);
				addColumnPathMap(MST_BILL_D_R.$slip_sts_typ, ArCmn_Upd01_DtlR.$slip_sts_typ);
				addColumnPathMap(MST_BILL_D_R.$ref_iv_no, ArCmn_Upd01_DtlR.$ref_iv_no);
				// bill_acst_noは呼び出し元で設定
				addColumnPathMap(MST_BILL_D_R.$bill_crryovr_times, ArCmn_Upd01_DtlR.$bill_crryovr_times);
				addColumnPathMap(MST_BILL_D_R.$trd_unit_cd, ArCmn_Upd01_DtlR.$trd_unit_cd);
				addColumnPathMap(MST_BILL_D_R.$trd_unit_qty, ArCmn_Upd01_DtlR.$trd_unit_qty);
				addColumnPathMap(MST_BILL_D_R.$trd_cur_upri, ArCmn_Upd01_DtlR.$trd_cur_upri);
				addColumnPathMap(MST_BILL_D_R.$interim_flg, ArCmn_Upd01_DtlR.$interim_flg);
				addColumnPathMap(MST_BILL_D_R.$trd_cur_amt, ArCmn_Upd01_DtlR.$trd_cur_amt);
				addColumnPathMap(MST_BILL_D_R.$trd_cur_amt1, ArCmn_Upd01_DtlR.$trd_cur_amt1);
				addColumnPathMap(MST_BILL_D_R.$trd_cur_amt2, ArCmn_Upd01_DtlR.$trd_cur_amt2);
				addColumnPathMap(MST_BILL_D_R.$trd_cur_amt3, ArCmn_Upd01_DtlR.$trd_cur_amt3);
				addColumnPathMap(MST_BILL_D_R.$trd_cur_dscnt_amt, ArCmn_Upd01_DtlR.$trd_cur_dscnt_amt);
				addColumnPathMap(MST_BILL_D_R.$xrate, ArCmn_Upd01_DtlR.$xrate);
				addColumnPathMap(MST_BILL_D_R.$base_cur_upri, ArCmn_Upd01_DtlR.$base_cur_upri);
				addColumnPathMap(MST_BILL_D_R.$base_cur_amt, ArCmn_Upd01_DtlR.$base_cur_amt);
				addColumnPathMap(MST_BILL_D_R.$base_cur_amt1, ArCmn_Upd01_DtlR.$base_cur_amt1);
				addColumnPathMap(MST_BILL_D_R.$base_cur_amt2, ArCmn_Upd01_DtlR.$base_cur_amt2);
				addColumnPathMap(MST_BILL_D_R.$base_cur_amt3, ArCmn_Upd01_DtlR.$base_cur_amt3);
				addColumnPathMap(MST_BILL_D_R.$base_cur_dscnt_amt, ArCmn_Upd01_DtlR.$base_cur_dscnt_amt);
				addColumnPathMap(MST_BILL_D_R.$trd_cur_tax_amt, ArCmn_Upd01_DtlR.$trd_cur_tax_amt);
				addColumnPathMap(MST_BILL_D_R.$base_cur_tax_amt, ArCmn_Upd01_DtlR.$base_cur_tax_amt);
				addColumnPathMap(MST_BILL_D_R.$wtax_amt, ArCmn_Upd01_DtlR.$wtax_amt);
				addColumnPathMap(MST_BILL_D_R.$wtax_rate, ArCmn_Upd01_DtlR.$wtax_rate);
				addColumnPathMap(MST_BILL_D_R.$ac_dt, ArCmn_Upd01_DtlR.$ac_dt);
				addColumnPathMap(MST_BILL_D_R.$ac_ym, ArCmn_Upd01_DtlR.$ac_ym);
				addColumnPathMap(MST_BILL_D_R.$dlv_dt, ArCmn_Upd01_DtlR.$dlv_dt);
				addColumnPathMap(MST_BILL_D_R.$base_sls_ac_dt, ArCmn_Upd01_DtlR.$base_sls_ac_dt);
				addColumnPathMap(MST_BILL_D_R.$rcv_dt, ArCmn_Upd01_DtlR.$rcv_dt);
				addColumnPathMap(MST_BILL_D_R.$bill_basis_dt, ArCmn_Upd01_DtlR.$bill_basis_dt);
				addColumnPathMap(MST_BILL_D_R.$base_unit_cd, ArCmn_Upd01_DtlR.$base_unit_cd);
				addColumnPathMap(MST_BILL_D_R.$base_unit_qty, ArCmn_Upd01_DtlR.$base_unit_qty);
				addColumnPathMap(MST_BILL_D_R.$tax_cd, ArCmn_Upd01_DtlR.$tax_cd);
				addColumnPathMap(MST_BILL_D_R.$wrk_no, ArCmn_Upd01_DtlR.$wrk_no);
			}
			@Override
			public void valueCopy(D dest, S src) {
				dest.bill_d_no(getStrSeq(MSC_NUM_SYS_TYP.BILLD));
				dest.bill_prnt_tgt_flg(true);
				dest.bill_mtd_typ(MSC_BILL_MTD_TYP.ALL_BILL.value());
				dest.sno1(isNull(src.sno1()) ? MAC_STR.NULL_VAL.value() : src.sno1());
				dest.sno2(isNull(src.sno2()) ? MAC_STR.NULL_VAL.value() : src.sno2());
				dest.sno3(isNull(src.sno3()) ? MAC_STR.NULL_VAL.value() : src.sno3());
				dest.sno4(isNull(src.sno4()) ? MAC_STR.NULL_VAL.value() : src.sno4());
				dest.crryovr_flg(false);
				dest.valid_flg(true);
			}
		}

		protected MapMlyArBal<MST_MLY_AR_BAL_R, ArCmn_Upd01_DtlR> createMapMlyArBal() {
			return new MapMlyArBal<MST_MLY_AR_BAL_R, ArCmn_Upd01_DtlR>();
		}
		public class MapMlyArBal<D extends MST_MLY_AR_BAL_R, S extends ArCmn_Upd01_DtlR> extends
				MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_MLY_AR_BAL_R.$ac_ym, ArCmn_Upd01_DtlR.$ac_ym);
				addColumnPathMap(MST_MLY_AR_BAL_R.$acst_cd, ArCmn_Upd01_DtlR.$acst_cd);
				addColumnPathMap(MST_MLY_AR_BAL_R.$iv_no, ArCmn_Upd01_DtlR.$iv_no);
				addColumnPathMap(MST_MLY_AR_BAL_R.$trd_cur_cd, ArCmn_Upd01_DtlR.$trd_cur_cd);
				addColumnPathMap(MST_MLY_AR_BAL_R.$wrk_no, ArCmn_Upd01_DtlR.$ar_wrk_no);
				addColumnPathMap(MST_MLY_AR_BAL_R.$ar_dpt_cd, ArCmn_Upd01_DtlR.$ar_dpt_cd);
				addColumnPathMap(MST_MLY_AR_BAL_R.$ar_typ, ArCmn_Upd01_DtlR.$ar_typ);
				addColumnPathMap(MST_MLY_AR_BAL_R.$exc_gain_loss, ArCmn_Upd01_DtlR.$exc_gain_loss);
			}
			@Override
			public void valueCopy(D dest, S src) {
				setCmnAmt(dest, src);
				setCmnBaseCurAmt(dest, src);
			}
		}

		protected MapMlyArBalForSw<MST_MLY_AR_BAL_R, ArCmn_Upd01_DtlR> createMapMlyArBalForSw() {
			return new MapMlyArBalForSw<MST_MLY_AR_BAL_R, ArCmn_Upd01_DtlR>();
		}
		public class MapMlyArBalForSw<D extends MST_MLY_AR_BAL_R, S extends ArCmn_Upd01_DtlR> extends
				MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_MLY_AR_BAL_R.$ac_ym, ArCmn_Upd01_DtlR.$inpt_ac_ym);
				addColumnPathMap(MST_MLY_AR_BAL_R.$acst_cd, ArCmn_Upd01_DtlR.$acst_cd);
				addColumnPathMap(MST_MLY_AR_BAL_R.$iv_no, ArCmn_Upd01_DtlR.$iv_no);
				addColumnPathMap(MST_MLY_AR_BAL_R.$trd_cur_cd, ArCmn_Upd01_DtlR.$trd_cur_cd);
				addColumnPathMap(MST_MLY_AR_BAL_R.$wrk_no, ArCmn_Upd01_DtlR.$wrk_no);
				addColumnPathMap(MST_MLY_AR_BAL_R.$ar_dpt_cd, ArCmn_Upd01_DtlR.$ar_dpt_cd);
				addColumnPathMap(MST_MLY_AR_BAL_R.$ar_typ, ArCmn_Upd01_DtlR.$ar_typ);
			}
			@Override
			public void valueCopy(D dest, S src) {
				MCNumber arAmtPm = MSC_AR_OPE_TYP.ar_amt_pm(up1().ar_ope_typ());
				// 取引通貨金額項目
				dest.sls_amt(MSBGL_ArUtil.getSlsAmt(
						src.trd_ptn_typ(), src.ar_trd_grp_typ(), src.trd_cur_amt())
						.multiply(arAmtPm));
				dest.ret_amt(MSBGL_ArUtil.getRetAmt(
						src.trd_ptn_typ(), src.ar_trd_grp_typ(), src.trd_cur_amt())
						.multiply(arAmtPm));
				dest.dscnt_amt(MSBGL_ArUtil.getDscntAmt(
						src.trd_ptn_typ(), src.ar_trd_grp_typ(), src.trd_cur_amt())
						.multiply(arAmtPm));
				dest.sw_to_amt(MCNumber.ZERO);
				dest.cash_amt(MCNumber.ZERO);
				dest.note_amt(MCNumber.ZERO);
				dest.xfr_amt(MCNumber.ZERO);
				dest.setoff_amt(MCNumber.ZERO);
				dest.sw_amt(MCNumber.ZERO);
				dest.tax_amt(MSBGL_ArUtil.getTaxAmt(
						src.trd_ptn_typ(), src.trd_cur_tax_amt()).multiply(arAmtPm));
				// 基準通貨金額項目
				dest.base_cur_sls_amt(MSBGL_ArUtil.getSlsAmt(
						src.trd_ptn_typ(), src.ar_trd_grp_typ(), src.base_cur_amt())
						.multiply(arAmtPm));
				dest.base_cur_ret_amt(MSBGL_ArUtil.getRetAmt(
						src.trd_ptn_typ(), src.ar_trd_grp_typ(), src.base_cur_amt())
						.multiply(arAmtPm));
				dest.base_cur_dscnt_amt(MSBGL_ArUtil.getDscntAmt(
						src.trd_ptn_typ(), src.ar_trd_grp_typ(), src.base_cur_amt())
						.multiply(arAmtPm));
				dest.base_cur_sw_to_amt(MCNumber.ZERO);
				dest.base_cur_cash_amt(MCNumber.ZERO);
				dest.base_cur_note_amt(MCNumber.ZERO);
				dest.base_cur_xfr_amt(MCNumber.ZERO);
				dest.base_cur_setoff_amt(MCNumber.ZERO);
				dest.base_cur_sw_amt(MCNumber.ZERO);
				dest.base_cur_tax_amt(MSBGL_ArUtil.getTaxAmt(
						src.trd_ptn_typ(), src.base_cur_tax_amt()).multiply(arAmtPm));
				// 為替差損益
				dest.exc_gain_loss(MCNumber.ZERO);
				// 都度請求かどうか判断するため請求先を設定しておく
				dest.setStringNE("bcst_cd", src.bcst_cd());
			}
		}

		/**
		 * 取引通貨金額項目設定<br />
		 * 取引通貨金額項目で共通するものを設定する。
		 * 
		 * @param dest 設定元
		 * @param src 設定先
		 */
		protected void setCmnAmt(MCRow dest, MCRow src) {

			MCNumber arAmtPm = MSC_AR_OPE_TYP.ar_amt_pm(up1().ar_ope_typ());

			// 売上金額
			dest.setNumber("sls_amt", MSBGL_ArUtil.getSlsAmt(src.getString("trd_ptn_typ"),
					src.getString("ar_trd_grp_typ"), src.getNumber("trd_cur_amt")).multiply(arAmtPm));
			// 売上返品額
			dest.setNumber("ret_amt", MSBGL_ArUtil.getRetAmt(src.getString("trd_ptn_typ"),
					src.getString("ar_trd_grp_typ"), src.getNumber("trd_cur_amt")).multiply(arAmtPm));
			// 売上値引額
			dest.setNumber("dscnt_amt", MSBGL_ArUtil.getDscntAmt(src.getString("trd_ptn_typ"),
					src.getString("ar_trd_grp_typ"), src.getNumber("trd_cur_amt")).multiply(arAmtPm));
			// 振替額（振替先）
			dest.setNumber("sw_to_amt", MSBGL_ArUtil.getArSwToAmt(src.getString("trd_ptn_typ"),
					src.getString("ar_trd_grp_typ"), src.getNumber("trd_cur_amt1"), src.getNumber("trd_cur_amt2"),
					src.getNumber("trd_cur_amt3")).multiply(arAmtPm));
			// 現金入金額
			dest.setNumber("cash_amt", MSBGL_ArUtil.getCashAmt(src.getString("trd_ptn_typ"),
					src.getString("ar_trd_grp_typ"), src.getString("rcv_typ"), src.getNumber("trd_cur_amt1"),
					src.getNumber("trd_cur_amt2"), src.getNumber("trd_cur_amt3")).multiply(arAmtPm));
			// 手形入金額
			dest.setNumber("note_amt", MSBGL_ArUtil.getNoteAmt(src.getString("trd_ptn_typ"),
					src.getString("ar_trd_grp_typ"), src.getString("rcv_typ"), src.getNumber("trd_cur_amt1"),
					src.getNumber("trd_cur_amt2"), src.getNumber("trd_cur_amt3")).multiply(arAmtPm));
			// 振込入金額
			dest.setNumber("xfr_amt", MSBGL_ArUtil.getXfrAmt(src.getString("trd_ptn_typ"),
					src.getString("ar_trd_grp_typ"), src.getString("rcv_typ"), src.getNumber("trd_cur_amt1"),
					src.getNumber("trd_cur_amt2"), src.getNumber("trd_cur_amt3")).multiply(arAmtPm));
			// 相殺額
			dest.setNumber("setoff_amt", MSBGL_ArUtil.getSetoffAmt(src.getString("trd_ptn_typ"),
					src.getString("ar_trd_grp_typ"), src.getNumber("trd_cur_amt1"), src.getNumber("trd_cur_amt2"),
					src.getNumber("trd_cur_amt3")).multiply(arAmtPm));
			// 振替額
			dest.setNumber("sw_amt", MSBGL_ArUtil.getArSwAmt(src.getString("trd_ptn_typ"),
					src.getString("ar_trd_grp_typ"), src.getNumber("trd_cur_amt1"), src.getNumber("trd_cur_amt2"),
					src.getNumber("trd_cur_amt3")).multiply(arAmtPm));
			// 税額
			dest.setNumber("tax_amt", MSBGL_ArUtil.getTaxAmt(
					src.getString("trd_ptn_typ"), src.getNumber("trd_cur_tax_amt")).multiply(arAmtPm));
		}

		/**
		 * 基準通貨金額項目設定<br />
		 * 基準通貨金額項目で共通するものを設定する。
		 * 
		 * @param dest 設定元
		 * @param src 設定先
		 */
		protected void setCmnBaseCurAmt(MCRow dest, MCRow src) {

			MCNumber arAmtPm = MSC_AR_OPE_TYP.ar_amt_pm(up1().ar_ope_typ());

			// 売上金額
			dest.setNumber("base_cur_sls_amt", MSBGL_ArUtil.getSlsAmt(src.getString("trd_ptn_typ"),
					src.getString("ar_trd_grp_typ"), src.getNumber("base_cur_amt")).multiply(arAmtPm));
			// 売上返品額
			dest.setNumber("base_cur_ret_amt", MSBGL_ArUtil.getRetAmt(src.getString("trd_ptn_typ"),
					src.getString("ar_trd_grp_typ"), src.getNumber("base_cur_amt")).multiply(arAmtPm));
			// 売上値引額
			dest.setNumber("base_cur_dscnt_amt", MSBGL_ArUtil.getDscntAmt(src.getString("trd_ptn_typ"),
					src.getString("ar_trd_grp_typ"), src.getNumber("base_cur_amt")).multiply(arAmtPm));
			// 振替額(振替先)
			dest.setNumber("base_cur_sw_to_amt", MSBGL_ArUtil.getArSwToAmt(src.getString("trd_ptn_typ"),
					src.getString("ar_trd_grp_typ"), src.getNumber("base_cur_amt1"), src.getNumber("base_cur_amt2"),
					src.getNumber("base_cur_amt3")).multiply(arAmtPm));
			// 現金入金額
			dest.setNumber("base_cur_cash_amt", MSBGL_ArUtil.getCashAmt(src.getString("trd_ptn_typ"),
					src.getString("ar_trd_grp_typ"), src.getString("rcv_typ"), src.getNumber("base_cur_amt1"),
					src.getNumber("base_cur_amt2"), src.getNumber("base_cur_amt3")).multiply(arAmtPm));
			// 手形入金額
			dest.setNumber("base_cur_note_amt", MSBGL_ArUtil.getNoteAmt(src.getString("trd_ptn_typ"),
					src.getString("ar_trd_grp_typ"), src.getString("rcv_typ"), src.getNumber("base_cur_amt1"),
					src.getNumber("base_cur_amt2"), src.getNumber("base_cur_amt3")).multiply(arAmtPm));
			// 振込入金額
			dest.setNumber("base_cur_xfr_amt", MSBGL_ArUtil.getXfrAmt(src.getString("trd_ptn_typ"),
					src.getString("ar_trd_grp_typ"), src.getString("rcv_typ"), src.getNumber("base_cur_amt1"),
					src.getNumber("base_cur_amt2"), src.getNumber("base_cur_amt3")).multiply(arAmtPm));
			// 相殺額
			dest.setNumber("base_cur_setoff_amt", MSBGL_ArUtil.getSetoffAmt(src.getString("trd_ptn_typ"),
					src.getString("ar_trd_grp_typ"), src.getNumber("base_cur_amt1"), src.getNumber("base_cur_amt2"),
					src.getNumber("base_cur_amt3")).multiply(arAmtPm));
			// 振替額
			dest.setNumber("base_cur_sw_amt", MSBGL_ArUtil.getArSwAmt(src.getString("trd_ptn_typ"),
					src.getString("ar_trd_grp_typ"), src.getNumber("base_cur_amt1"), src.getNumber("base_cur_amt2"),
					src.getNumber("base_cur_amt3")).multiply(arAmtPm));
			// 税額
			dest.setNumber("base_cur_tax_amt", MSBGL_ArUtil.getTaxAmt(
					src.getString("trd_ptn_typ"), src.getNumber("base_cur_tax_amt")).multiply(arAmtPm));
		}
		/**
		 * 取引通貨金額項目設定<br />
		 * 取引通貨金額項目で請求に関するものを設定する。
		 *	※事前に共通項目（setCmnAmt）が設定されていること
		 */
		protected void setBillAmt(MCRow dest, MCRow src) {
			
			MCNumber arAmtPm = MSC_AR_OPE_TYP.ar_amt_pm(up1().ar_ope_typ());
			
			if (src.getBooleanNE("bill_tax_disp_flg")) {
				dest.setNumber("setoff_tax_amt",
					MSBGL_ArUtil.getSetoffAmt(
						src.getString("trd_ptn_typ"), src.getString("ar_trd_grp_typ"),
						src.getNumber("trd_cur_tax_amt1"),
						src.getNumber("trd_cur_tax_amt2"),
						src.getNumber("trd_cur_tax_amt3")).multiply(arAmtPm));
				
				dest.setNumber("setoff_amt",
					dest.getNumber("setoff_amt").subtract(dest.getNumber("setoff_tax_amt")));
			}
			else {
				dest.setNumber("setoff_tax_amt", MCNumber.ZERO);
				dest.setNumber("setoff_amt", dest.getNumber("setoff_amt"));
			}
		}
		
		/**
		 * 基準通貨金額項目設定<br />
		 * 基準通貨金額項目で請求に関するものを設定する。
		 *	※事前に共通項目（setCmnAmt）が設定されていること
		 */
		protected void setBillBaseCurAmt(MCRow dest, MCRow src) {
			
			MCNumber arAmtPm = MSC_AR_OPE_TYP.ar_amt_pm(up1().ar_ope_typ());
			
			if (src.getBooleanNE("bill_tax_disp_flg")) {
				dest.setNumber("base_cur_setoff_tax_amt",
					MSBGL_ArUtil.getSetoffAmt(
						src.getString("trd_ptn_typ"), src.getString("ar_trd_grp_typ"),
						src.getNumber("base_cur_tax_amt1"),
						src.getNumber("base_cur_tax_amt2"),
						src.getNumber("base_cur_tax_amt3")).multiply(arAmtPm));
				
				dest.setNumber("base_cur_setoff_amt",
					dest.getNumber("base_cur_setoff_amt").subtract(dest.getNumber("base_cur_setoff_tax_amt")));
			}
			else {
				dest.setNumber("setoff_tax_amt", MCNumber.ZERO);
				dest.setNumber("setoff_amt", dest.getNumber("setoff_amt"));
			}
		}

		/**
		 * 請求書履歴テーブルの最新ＦＬＧを更新する
		 */
		protected void updBillHis() {
			
			if (_updBillHisL.isEmpty()) {
				return;
			}
			
			// 請求書ヘッダ履歴の更新
			MST_BILL_HIS_R t = MST_BILL_HIS_R.create("T");
			MCQueryApiBuilder billHisL_bldr = MCQueryApiBuilder.create(t);
			billHisL_bldr.setSetVL(t.latest_flg, value(false));
			billHisL_bldr.setWhere(t.bill_no.eq(bindEx("bill_no")));
			billHisL_bldr.addWhereWithAnd(t.bill_rev.eq(bindEx("bill_rev")));
			dbUpdate("MSBGL5010_MST_PAY_NTC_HIS_U01", _updBillHisL, billHisL_bldr);
		}

		/**
		 * 請求書履歴テーブルの登録
		 */
		protected void insBillHis() {
			
			if (_insBillHisL.isEmpty()) {
				return;
			}
			
			// 最新データの取得
			insBillWk(_insBillHisL);
			MCList<MST_BILL_R> billL = getBillL();
			MCList<MST_BILL_D_R> billDL = getBillDL();
			MCIndexKey idx = billDL.createIndex(MST_BILL_D_R.$bill_mng_no);
			
			// 請求明細テーブルの削除
			delBillHis(billL);
			
			// 履歴ＮＯをキャッシュする
			doSeqCache(MSC_NUM_SYS_TYP.BILLHISNO, billL.size());
			doSeqCache(MSC_NUM_SYS_TYP.BILLDHISNO,
					billDL.size() + billDL.subList(r -> MAC_AR_STTL_TYP.isSETOFF_DR(r.getStringNE(MST_RCV_ACT_R.$ar_sttl_typ2))).size());
			
			MCList<MST_BILL_HIS_R> billHisL = MCList.create(MST_BILL_HIS_R.class);
			MCList<MST_BILL_D_HIS_R> billDHisL = MCList.create(MST_BILL_D_HIS_R.class);
			
			for (MST_BILL_R billR : billL) {
				
				// 請求書ヘッダ履歴の設定
				MST_BILL_HIS_R billHisR = MST_BILL_HIS_R.create();
				copy(billHisR, billR, createMap_MST_BILL_HIS_R_MST_BILL_R());
				billHisL.add(billHisR);
				
				// 請求書明細履歴の設定
				billDHisL.addAll(setBillDHisL(billDL.subList(idx, billR.bill_mng_no()), billHisR));
			}
			
			// 請求書ヘッダ履歴の登録
			MCQueryApiBuilder billHisL_bldr = MCQueryApiBuilder.create(MST_BILL_HIS_R.create("T"));
			dbInsertEx("MSBGL5010_MST_BILL_HIS_I01", billHisL, billHisL_bldr);
			
			// 請求書明細履歴の登録
			MCQueryApiBuilder billDHisL_bldr = MCQueryApiBuilder.create(MST_BILL_D_HIS_R.create("T"));
			dbInsertEx("MSBGL5010_MST_BILL_D_HIS_I01", billDHisL, billDHisL_bldr);
		}

		/**
		 * 請求書ＮＯ、請求書改訂番号で履歴データが存在する場合、<br />
		 * 請求書履歴テーブルを削除する
		 * @param billL 請求書ヘッダ
		 */
		protected void delBillHis(MCList<MST_BILL_R> billL) {
			
			MCList<MST_BILL_HIS_R> billHisL = getBillHisL(billL);
			if (!isNull(billHisL) && !billHisL.isEmpty()) {
				
				// 請求書ヘッダ履歴の削除
				MCQueryApiBuilder billHisL_bldr = MCQueryApiBuilder.create(MST_BILL_HIS_R.create("T"));
				dbDeleteKey("MSBGL5010_MST_BILL_HIS_D01", billHisL, billHisL_bldr);
				
				// 請求書明細履歴の削除
				MST_BILL_D_HIS_R billDHis_dbc = MST_BILL_D_HIS_R.create("T");
				execDbDelete("MSBGL5010_MST_BILL_D_HIS_D01", billDHis_dbc,
						billDHis_dbc.bill_his_no.eq(bind("bill_his_no")), billHisL);
			}
		}

		/**
		 * 請求ヘッダワークテーブルを登録する
		 * @param billWkL 請求ヘッダ
		 */
		protected void insBillWk(MCList<MST_BILL_R> billL) {
			
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_BILL_R.create("T"));
			dbWkDelete("MSBGL5010_MSW_BILL_D03", dbc_bldr.getBaseDbc());
			dbWkInsert("MSBGL5010_MSW_BILL_I02", billL.groupBy(billL.createRow().getKeyColumn()), dbc_bldr.getBaseDbc());
		}

		/**
		 * 請求書ヘッダ履歴を取得する
		 * @param billL 請求ヘッダ
		 * @return 請求書ヘッダ履歴
		 */
		protected MCList<MST_BILL_HIS_R> getBillHisL(MCList<MST_BILL_R> billL) {
			
			MCList<MST_BILL_HIS_R> billHisL = MCList.create(MST_BILL_HIS_R.class);
			MST_BILL_HIS_R t = MST_BILL_HIS_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.bill_his_no);
			dbc_bldr.setWhere(t.bill_no.eq(bind("bill_no")));
			dbc_bldr.addWhereWithAnd(t.bill_rev.eq(bind("bill_rev")));
			dbSelect("MSBGL5010_MST_BILL_HIS_S01", billHisL, dbc_bldr, billL);
			return billHisL;
		}

		/**
		 * 請求ヘッダを取得する
		 * @return 請求ヘッダ
		 */
		protected MCList<MST_BILL_R> getBillL() {
			
			MCList<MST_BILL_R> billL = MCList.create(MST_BILL_R.class);
			MST_BILL_R t = MST_BILL_R.create("T");
			MSW_BILL_KEY_R w1 = MSW_BILL_KEY_R.create("W1");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.addInnerJoin(w1, w1.bill_mng_no.eq(t.bill_mng_no));
			dbSelect("MSBGL5010_MST_BILL_S11", billL, dbc_bldr);
			return billL;
		}

		/**
		 * 請求明細を取得する
		 * @return 請求明細
		 */
		protected MCList<MST_BILL_D_R> getBillDL() {
			
			MCList<MST_BILL_D_R> billDL = MCList.create(MST_BILL_D_R.class);
			executeQuery(billDL, MSBGL5010_MST_BILL_D_S03());
			return billDL;
		}

		/**
		 * 請求書明細履歴を設定する
		 * @param billDL 請求明細
		 * @param billHisR 請求書ヘッダ履歴
		 * @return 請求書明細履歴
		 */
		protected MCList<MST_BILL_D_HIS_R> setBillDHisL(MCList<MST_BILL_D_R> billDL, MST_BILL_HIS_R billHisR) {
			
			MCList<MST_BILL_D_HIS_R> billDHisL = MCList.create(MST_BILL_D_HIS_R.class);
			
			for (MST_BILL_D_R billDR : billDL) {
				MST_BILL_D_HIS_R billDHisR = MST_BILL_D_HIS_R.create();
				copy(billDHisR, billDR, billHisR, createMap_MST_BILL_D_HIS_R_MST_BILL_D_R());
				
				if (MSC_BILL_D_TYP.isSLS(billDR.bill_d_typ())
						|| isTaxDiffOrArswTyp(billDR.trd_ptn_typ())) {
					billDHisR.bill_d_his_typ(MAC_BILL_D_HIS_TYP.SLS_ACT.value());
					billDHisL.add(billDHisR);
				}
				else if (MSC_BILL_D_TYP.isRCV(billDR.bill_d_typ())
						&& !isTaxDiffOrArswTyp(billDR.trd_ptn_typ())
						&& !isAdvTrdTyp(billDR.trd_ptn_typ())) {
					billDHisR.bill_d_his_typ(MAC_BILL_D_HIS_TYP.RCV_ACT.value());
					billDHisL.addAll(splitRcv(billDHisR, billDR));
				}
				else if (MSC_BILL_D_TYP.isRCV(billDR.bill_d_typ())
						&& isAdvTrdTyp(billDR.trd_ptn_typ())) {
					billDHisR.bill_d_his_typ(MAC_BILL_D_HIS_TYP.ADV_RCV_ACT.value());
					billDHisL.addAll(splitRcv(billDHisR, billDR));
				}
			}
			
			return billDHisL;
		}

		/**
		 * 税差額、残高振替に関連する取引かどうか判断する
		 */
		protected boolean isTaxDiffOrArswTyp(String trdTyp) {
			return MAC_TRD_PTN_TYP.isTAX_DIFF_BILL_CL(trdTyp)
					|| MAC_TRD_PTN_TYP.isARSW_IN_BILL_BAL(trdTyp)
					|| MAC_TRD_PTN_TYP.isARSW_IN_NOT_BILL_BAL(trdTyp);
		}

		/**
		 * 前受金に関連する取引かどうか判断する
		 */
		protected boolean isAdvTrdTyp(String trdTyp) {
			return MAC_TRD_PTN_TYP.isRCV_ADV(trdTyp)
					|| MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(trdTyp)
					|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_ADV(trdTyp);
		}

		/**
		 * 入金データから相殺分を分割する
		 * @param billDHisR 請求書明細履歴
		 * @param billDR 請求明細
		 * @return 分割後の請求書明細履歴
		 */
		protected MCList<MST_BILL_D_HIS_R> splitRcv(MST_BILL_D_HIS_R billDHisR, MST_BILL_D_R billDR) {
			
			MCList<MST_BILL_D_HIS_R> billDHisL = MCList.create(MST_BILL_D_HIS_R.class);
			
			if (MAC_AR_STTL_TYP.isSETOFF_DR(billDR.getStringNE(MST_RCV_ACT_R.$ar_sttl_typ1))) {
				// 相殺分
				MST_BILL_D_HIS_R setoffR = billDHisR.clone();
				setoffR.trd_cur_amt(billDR.trd_cur_amt1().subtract(billDR.getNumberNE(MST_RCV_ACT_D_R.$trd_cur_tax_amt1)));
				setoffR.trd_cur_tax_amt(billDR.getNumberNE(MST_RCV_ACT_D_R.$trd_cur_tax_amt1));
				setoffR.base_cur_amt(billDR.base_cur_amt1().subtract(billDR.getNumberNE(MST_RCV_ACT_D_R.$base_cur_tax_amt1)));
				setoffR.base_cur_tax_amt(billDR.getNumberNE(MST_RCV_ACT_D_R.$base_cur_tax_amt1));
				setoffR.tax_cd(billDR.getStringNE(MST_RCV_ACT_R.$tax_cd1));
				billDHisL.add(setoffR);
			}
			else if (MAC_AR_STTL_TYP.isSETOFF_DR(billDR.getStringNE(MST_RCV_ACT_R.$ar_sttl_typ2))) {
				// 入金分
				MST_BILL_D_HIS_R rcvR = billDHisR.clone();
				rcvR.trd_cur_amt(billDR.trd_cur_amt1());
				rcvR.trd_cur_tax_amt(0);
				rcvR.base_cur_amt(billDR.base_cur_amt1());
				rcvR.base_cur_tax_amt(0);
				rcvR.bill_d_rmrks(null);
				billDHisL.add(rcvR);
				
				// 相殺分
				MST_BILL_D_HIS_R setoffR = billDHisR.clone();
				setoffR.bill_d_his_no(getStrSeq(MSC_NUM_SYS_TYP.BILLDHISNO));
				setoffR.rcv_mtd_cd(billDR.getStringNE(MST_RCV_ACT_R.$ar_sttl_cd2));
				setoffR.trd_cur_amt(billDR.trd_cur_amt2().subtract(billDR.getNumberNE(MST_RCV_ACT_D_R.$trd_cur_tax_amt2)));
				setoffR.trd_cur_tax_amt(billDR.getNumberNE(MST_RCV_ACT_D_R.$trd_cur_tax_amt2));
				setoffR.base_cur_amt(billDR.base_cur_amt2().subtract(billDR.getNumberNE(MST_RCV_ACT_D_R.$base_cur_tax_amt2)));
				setoffR.base_cur_tax_amt(billDR.getNumberNE(MST_RCV_ACT_D_R.$base_cur_tax_amt2));
				setoffR.tax_cd(billDR.getStringNE(MST_RCV_ACT_R.$tax_cd2));
				billDHisL.add(setoffR);
			}
			else if (isAdvTrdTyp(billDR.trd_ptn_typ())) {
				MST_BILL_D_HIS_R rcvR = billDHisR.clone();
				rcvR.trd_cur_amt(billDR.trd_cur_amt1());
				rcvR.trd_cur_tax_amt(0);
				rcvR.base_cur_amt(billDR.base_cur_amt1());
				rcvR.base_cur_tax_amt(0);
				billDHisL.add(rcvR);
			}
			else {
				billDHisL.add(billDHisR);
			}
			
			return billDHisL;
		}

		// 請求書ヘッダ履歴設定用Mapper
		protected Map_MST_BILL_HIS_R_MST_BILL_R<MST_BILL_HIS_R,MST_BILL_R> createMap_MST_BILL_HIS_R_MST_BILL_R() {
			return new Map_MST_BILL_HIS_R_MST_BILL_R<MST_BILL_HIS_R, MST_BILL_R>();
		}
		public class Map_MST_BILL_HIS_R_MST_BILL_R<D extends MST_BILL_HIS_R, S extends MST_BILL_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_BILL_HIS_R.$bill_no, MST_BILL_R.$bill_no);
				addColumnPathMap(MST_BILL_HIS_R.$bill_rev, MST_BILL_R.$bill_rev);
				addColumnPathMap(MST_BILL_HIS_R.$bill_cl_dt, MST_BILL_R.$bill_cl_dt);
				addColumnPathMap(MST_BILL_HIS_R.$bill_each_sls_flg, MST_BILL_R.$bill_each_sls_flg);
				addColumnPathMap(MST_BILL_HIS_R.$iv_no, MST_BILL_R.$iv_no);
				addColumnPathMap(MST_BILL_HIS_R.$wrk_no, MST_BILL_R.$wrk_no);
				addColumnPathMap(MST_BILL_HIS_R.$bcst_cd, MST_BILL_R.$bcst_cd);
				addColumnPathMap(MST_BILL_HIS_R.$bill_dpt_cd, MST_BILL_R.$bill_dpt_cd);
				addColumnPathMap(MST_BILL_HIS_R.$bill_xrate, MST_BILL_R.$bill_xrate);
				addColumnPathMap(MST_BILL_HIS_R.$trd_cur_cd, MST_BILL_R.$trd_cur_cd);
				addColumnPathMap(MST_BILL_HIS_R.$last_bill_amt, MST_BILL_R.$last_bill_amt);
				addColumnPathMap(MST_BILL_HIS_R.$sw_amt, MST_BILL_R.$sw_amt);
				addColumnPathMap(MST_BILL_HIS_R.$bfw_amt, MST_BILL_R.$bfw_amt);
				addColumnPathMap(MST_BILL_HIS_R.$sls_amt, MST_BILL_R.$sls_amt);
				addColumnPathMap(MST_BILL_HIS_R.$dscnt_amt, MST_BILL_R.$dscnt_amt);
				addColumnPathMap(MST_BILL_HIS_R.$ret_amt, MST_BILL_R.$ret_amt);
				addColumnPathMap(MST_BILL_HIS_R.$sw_to_amt, MST_BILL_R.$sw_to_amt);
				addColumnPathMap(MST_BILL_HIS_R.$bill_amt, MST_BILL_R.$bill_amt);
				addColumnPathMap(MST_BILL_HIS_R.$adv_amt_bal, MST_BILL_R.$adv_amt_bal);
				addColumnPathMap(MST_BILL_HIS_R.$adv_amt, MST_BILL_R.$adv_amt);
				addColumnPathMap(MST_BILL_HIS_R.$adv_setoff_amt, MST_BILL_R.$adv_setoff_amt);
				addColumnPathMap(MST_BILL_HIS_R.$adv_setoff_tax_amt, MST_BILL_R.$adv_setoff_tax_amt);
				addColumnPathMap(MST_BILL_HIS_R.$sub_char1, MST_BILL_R.$sub_char1);
				addColumnPathMap(MST_BILL_HIS_R.$sub_char2, MST_BILL_R.$sub_char2);
				addColumnPathMap(MST_BILL_HIS_R.$sub_char3, MST_BILL_R.$sub_char3);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.bill_his_no(getStrSeq(MSC_NUM_SYS_TYP.BILLHISNO));
				dest.latest_flg(true);
				dest.can_flg(false);
				dest.rcv_amt(sum(src.xfr_amt(), src.note_amt(), src.cash_amt()));
				dest.setoff_amt(nvl(src.setoff_amt(), MCNumber.ZERO).negate());
				dest.tax_amt(src.tax_amt().subtract(nvl(src.setoff_tax_amt(), MCNumber.ZERO)));
			}
		}

		// 請求書明細履歴設定用Mapper
		protected Map_MST_BILL_D_HIS_R_MST_BILL_D_R<MST_BILL_D_HIS_R,MST_BILL_D_R, MST_BILL_HIS_R> createMap_MST_BILL_D_HIS_R_MST_BILL_D_R() {
			return new Map_MST_BILL_D_HIS_R_MST_BILL_D_R<MST_BILL_D_HIS_R, MST_BILL_D_R, MST_BILL_HIS_R>();
		}
		public class Map_MST_BILL_D_HIS_R_MST_BILL_D_R<D extends MST_BILL_D_HIS_R, S extends MST_BILL_D_R, W extends MST_BILL_HIS_R> extends MAUCC_RowMapperWith<D,S,W>{
			
			protected W _billHis;
			
			@Override
			public void setWith(W _billHis) {
				this._billHis = _billHis;
			}
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_BILL_D_HIS_R.$bill_d_no, MST_BILL_D_R.$bill_d_no);
				addColumnPathMap(MST_BILL_D_HIS_R.$trd_cd, MST_BILL_D_R.$trd_cd);
				addColumnPathMap(MST_BILL_D_HIS_R.$slip_sts_typ, MST_BILL_D_R.$slip_sts_typ);
				addColumnPathMap(MST_BILL_D_HIS_R.$act_no, MST_BILL_D_R.$act_no);
				addColumnPathMap(MST_BILL_D_HIS_R.$act_seq, MST_BILL_D_R.$act_seq);
				addColumnPathMap(MST_BILL_D_HIS_R.$act_rev, MST_BILL_D_R.$act_rev);
				addColumnPathMap(MST_BILL_D_HIS_R.$act_d_no, MST_BILL_D_R.$act_d_no);
				addColumnPathMap(MST_BILL_D_HIS_R.$act_d_seq, MST_BILL_D_R.$act_d_seq);
				addColumnPathMap(MST_BILL_D_HIS_R.$rcv_mtd_cd, MST_BILL_D_R.$rcv_mtd_cd);
				addColumnPathMap(MST_BILL_D_HIS_R.$cst_cd, MST_BILL_D_R.$cst_cd);
				addColumnPathMap(MST_BILL_D_HIS_R.$dlv_cd, MST_BILL_D_R.$dlv_cd);
				addColumnPathMap(MST_BILL_D_HIS_R.$dlv_dt, MST_BILL_D_R.$dlv_dt);
				addColumnPathMap(MST_BILL_D_HIS_R.$base_sls_ac_dt, MST_BILL_D_R.$base_sls_ac_dt);
				addColumnPathMap(MST_BILL_D_HIS_R.$rcv_dt, MST_BILL_D_R.$rcv_dt);
				addColumnPathMap(MST_BILL_D_HIS_R.$itm_cd, MST_BILL_D_R.$itm_cd);
				addColumnPathMap(MST_BILL_D_HIS_R.$itm_sub1, MST_BILL_D_R.$itm_sub1);
				addColumnPathMap(MST_BILL_D_HIS_R.$itm_sub2, MST_BILL_D_R.$itm_sub2);
				addColumnPathMap(MST_BILL_D_HIS_R.$itm_sub3, MST_BILL_D_R.$itm_sub3);
				addColumnPathMap(MST_BILL_D_HIS_R.$itm_nm, MST_BILL_D_R.$itm_nm);
				addColumnPathMap(MST_BILL_D_HIS_R.$sundry_itm_flg, MST_BILL_D_R.$sundry_itm_flg);
				addColumnPathMap(MST_BILL_D_HIS_R.$cst_itm_cd, MST_BILL_D_R.$cst_itm_cd);
				addColumnPathMap(MST_BILL_D_HIS_R.$cst_itm_nm, MST_BILL_D_R.$cst_itm_nm);
				addColumnPathMap(MST_BILL_D_HIS_R.$trd_unit_cd, MST_BILL_D_R.$trd_unit_cd);
				addColumnPathMap(MST_BILL_D_HIS_R.$trd_unit_qty, MST_BILL_D_R.$trd_unit_qty);
				addColumnPathMap(MST_BILL_D_HIS_R.$trd_cur_upri, MST_BILL_D_R.$trd_cur_upri);
				addColumnPathMap(MST_BILL_D_HIS_R.$trd_cur_amt, MST_BILL_D_R.$trd_cur_amt);
				addColumnPathMap(MST_BILL_D_HIS_R.$trd_cur_dscnt_amt, MST_BILL_D_R.$trd_cur_dscnt_amt);
				addColumnPathMap(MST_BILL_D_HIS_R.$base_cur_upri, MST_BILL_D_R.$base_cur_upri);
				addColumnPathMap(MST_BILL_D_HIS_R.$base_cur_amt, MST_BILL_D_R.$base_cur_amt);
				addColumnPathMap(MST_BILL_D_HIS_R.$base_cur_dscnt_amt, MST_BILL_D_R.$base_cur_dscnt_amt);
				addColumnPathMap(MST_BILL_D_HIS_R.$interim_flg, MST_BILL_D_R.$interim_flg);
				addColumnPathMap(MST_BILL_D_HIS_R.$tax_cd, MST_BILL_D_R.$tax_cd);
				addColumnPathMap(MST_BILL_D_HIS_R.$trd_cur_tax_amt, MST_BILL_D_R.$trd_cur_tax_amt);
				addColumnPathMap(MST_BILL_D_HIS_R.$base_cur_tax_amt, MST_BILL_D_R.$base_cur_tax_amt);
				addColumnPathMap(MST_BILL_D_HIS_R.$trd_d_rmrks, MST_BILL_D_R.$trd_d_rmrks);
				addColumnPathMap(MST_BILL_D_HIS_R.$bill_d_rmrks, MST_BILL_D_R.$bill_d_rmrks);
				addColumnPathMap(MST_BILL_D_HIS_R.$dlv_slip_no, MST_BILL_D_R.$dlv_slip_no);
				addColumnPathMap(MST_BILL_D_HIS_R.$dlv_slip_d_no, MST_BILL_D_R.$dlv_slip_d_no);
				addColumnPathMap(MST_BILL_D_HIS_R.$ship_dlv_slip_no, MST_BILL_D_R.$ship_dlv_slip_no);
				addColumnPathMap(MST_BILL_D_HIS_R.$ship_dlv_slip_d_no, MST_BILL_D_R.$ship_dlv_slip_d_no);
				addColumnPathMap(MST_BILL_D_HIS_R.$ship_dlv_slip_multi_flg, MST_BILL_D_R.$ship_dlv_slip_multi_flg);
				addColumnPathMap(MST_BILL_D_HIS_R.$bill_mtd_typ, MST_BILL_D_R.$bill_mtd_typ);
				addColumnPathMap(MST_BILL_D_HIS_R.$sub_char1, MST_BILL_D_R.$sub_char1);
				addColumnPathMap(MST_BILL_D_HIS_R.$sub_char2, MST_BILL_D_R.$sub_char2);
				addColumnPathMap(MST_BILL_D_HIS_R.$sub_char3, MST_BILL_D_R.$sub_char3);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.bill_d_his_no(getStrSeq(MSC_NUM_SYS_TYP.BILLDHISNO));
				dest.bill_his_no(_billHis.bill_his_no());
			}
		}

		// ---------- RowMatcher ----------
		protected MCRowMatcher<ArCmn_Upd01_DtlR> createRowMatcherPreCheck() {
			return new RowMatcherPreCheck<ArCmn_Upd01_DtlR>();
		}
		public class RowMatcherPreCheck<R extends ArCmn_Upd01_DtlR> implements
				MCRowMatcher<R> {
			@Override
			public boolean match(R r) {
				if (!MAC_SLIP_STS_TYP.isCAN(r.slip_sts_typ())) {
					return false;
				}
				if (MAC_STR.isNULL_VAL(r.iv_no())) {
					return false;
				}
				if (!MAC_AR_TRD_GRP_TYP.isSLS(r.ar_trd_grp_typ())
						&& !MAC_AR_TRD_GRP_TYP.isSLS_RTN(r.ar_trd_grp_typ())
						&& !MAC_AR_TRD_GRP_TYP.isSLS_DSCNT(r.ar_trd_grp_typ())) {
					return false;
				}
				if (isSame(getBaseCur().cur_cd(), r.trd_cur_cd())) {
					return false;
				}
				return true;
			}
		}
		
		/**
		 * 売上都度請求か判定する<br>
		 * 
		 * 新たに売掛を作成する場合は、取引先マスタの請求締処理区分をもとに判定する<br>
		 * 作成済みの売掛の場合は、インボイスＮＯをもとに判定する
		 */
		protected MCList<MST_BILL_R> _eachSlsBillCache;
		protected MCIndexKey _eachSlsBillIdx;

		protected boolean isEachSls(String ivNo) {
			if (isNullOrNullVal(ivNo)) {
				return false;
			}
			if (_eachSlsBillCache == null) {
				_eachSlsBillCache = MCList.create(MST_BILL_R.class);
				MST_BILL_R t = MST_BILL_R.create("T");
				MCQueryApiBuilder eachSlsBillCache_bldr = MCQueryApiBuilder.create(t);
				eachSlsBillCache_bldr.setSelect(t.iv_no, t.bill_each_sls_flg);
				eachSlsBillCache_bldr.setWhere(t.iv_no.eq(bind("iv_no")));
				dbSelect("MSBGL5010_MST_BILL_S08", _eachSlsBillCache, eachSlsBillCache_bldr, up0().subList(r -> !isNullOrNullVal(r.iv_no())));
				_eachSlsBillIdx = _eachSlsBillCache.createIndex(MST_BILL_R.$iv_no);
			}

			MST_BILL_R billR = _eachSlsBillCache.getFirst(_eachSlsBillIdx, ivNo);
			return isNull(billR) ? false : billR.bill_each_sls_flg();
		}
		protected boolean isEachSls(String bcstCd, String slipStsTyp, String ivNo) {
			if ((MSC_AR_OPE_TYP.isSLS_ACT(up1().ar_ope_typ()) 
					|| MSC_AR_OPE_TYP.isARSW_IN_BILL_BAL(up1().ar_ope_typ())
					|| MSC_AR_OPE_TYP.isARSW_IN_NOT_BILL_BAL(up1().ar_ope_typ()))
				&& MAC_SLIP_STS_TYP.isCRT(slipStsTyp)) {
				// 売掛作成時はマスタに従う
				return MSBGL_ArUtil.isEachSls(bcstCd);
			}
			else {
				// それ以外は作成済みの売掛に従う
				return isEachSls(ivNo);
			}
		}

		protected boolean makeEachSlsBill(String bcstCd, String slipStsTyp, String ivNo, String arOpeTyp) {
			return isEachSls(bcstCd, slipStsTyp, ivNo) && !MSC_AR_OPE_TYP.isARSW_IN_NOT_BILL_BAL(arOpeTyp) && !MSC_AR_OPE_TYP.isARSW_IN_BILL_BAL(arOpeTyp);
		}
		protected void chkRcvMtdCd(MCList<MST_RCV_SCHD_R> regRcvSchdL, ArCmn_Upd01_BillGrpR info) {
			for (MST_RCV_SCHD_R regRcvSchdR : regRcvSchdL) {
				chkRcvMtdCd(regRcvSchdR.rcv_mtd_cd(), info);
			}
		}
		protected void chkRcvMtdCd(String rcvMtdCd, ArCmn_Upd01_BillGrpR info) {
			MAM_STTL_R sttlR = MSBGL_ArUtil.getArSttl(rcvMtdCd);
			if (isNull(sttlR) || sttlR.isEmpty()) {
				MCMessage msg = getRecordNotFoundMsg("MA", sttlR.tableName(),
						sttlR.getKeyColumn(),
						new String[] {rcvMtdCd}, info).get(0);
				throw new MCAppException(msg);
			}
		}

	}

	//FMCB CUSTOM END
}