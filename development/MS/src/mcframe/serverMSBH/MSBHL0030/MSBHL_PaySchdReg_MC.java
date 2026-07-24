package mcframe.serverMSBH.MSBHL0030;

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
import mcframe.serverMSBH.MSBHL5030.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBH.MSBHL0030.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。

import java.util.Map;
import java.util.HashMap;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.BiConsumer;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil;
import mcframe.serverMAUC.MAUCL1060.MAUCL_TrdUtil;
import static mcframe.serverMSBH.MSBHL0030.Query.*;
import static mcframe.serverMSBH.MSBHL5030.Query.*;
import mcframe.serverMSBH.MSBHL5010.MSBHL_ApUtil;
import mcframe.serverMSBH.MSBHL5080.*;
import mcframe.serverMSBH.MSBHL5090.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
//import mcframe.serverCore.util.MCDBUtil;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHL_PaySchdReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHL_PaySchdReg_MC extends MSBHL_PaySchdReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 支払照合、支払予定情報を検索する。<br>
	 */
	public class Srch01 extends MSBHL_PaySchdReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			srchPayChk();
			srchApd();
			srchPaySchd();
			srchPayAct();
			srchAdvPayAct();
		}

		@Override
		protected void editListMain() {
			if (isNull(down1())) {
				return;
			}

			super.editListMain();

			editApd();
			editPaySchd();
			editPayChk();
		}

		/**
		 * 照合ヘッダを検索する
		 */
		protected void srchPayChk() {
			int cnt = executeQuery(down0(), MSBHL0030_MST_PAY_CHK_S01(), up0());
			if (cnt == 0) {
				down0().clear();
				return;
			}

			MCList<Srch01_RsltChkR> down0 = MCList.create(Srch01_RsltChkR.class);
			down0.add(down0());

			setValuesDbc(up0(), down0);
		}

		/**
		 * 買掛明細を検索する
		 */
		protected void srchApd() {
			int cnt = executeQuery(down1(), MSBHL0030_MST_AP_D_S01(), down0());
			if (cnt == 0) {
				down1().clear();
				return;
			}

			setValuesDbc(down0(), down1());
		}

		/**
		 * 支払予定を検索する
		 */
		protected void srchPaySchd() {
			int cnt = executeQuery(down2(), MSBHL0030_MST_PAY_SCHD_S01(), down0());
			if (cnt == 0) {
				down2().clear();
				return;
			}

			setValuesDbc(down0(), down2());
		}
		/**
		 * 支払実績を検索する
		 */
		protected void srchPayAct() {
			callPaySchdSrch07();
		}
		/**
		 * 前渡金実績を検索する
		 */
		protected void srchAdvPayAct() {
			callPaySchdSrch08();
		}
		/**
		 * 支払予定登録サービスの支払実績検索処理を実行する
		 */
		protected void callPaySchdSrch07() {
			MSBHL_PaySchdRegService.PaySchd_Srch07 o = MSBHL_PaySchdRegService.crtPaySchd_Srch07();
			PaySchd_Srch07_CndR cndR = PaySchd_Srch07_CndR.create();
			cndR.hdr_peg_no(0);
			cndR.pay_chk_mng_no(down0().pay_chk_mng_no());
			cndR.bsppl_cd(down0().bsppl_cd());
			cndR.bsppl_dpt_cd(down0().bsppl_dpt_cd());
			cndR.trd_cur_cd(down0().trd_cur_cd());
			cndR.pay_spot_flg(down0().pay_spot_flg());
			cndR.reg_only_flg(true);
			o.up0().add(cndR);
			o.exec();
			addAll(down3(), o.down0(), createMap_Srch01_RsltActR_PaySchd_Srch07_RsltR());
		}
		/**
		 * 支払予定登録サービスの前渡金実績検索処理を実行する
		 */
		protected void callPaySchdSrch08() {
			MSBHL_PaySchdRegService.PaySchd_Srch08 o = MSBHL_PaySchdRegService.crtPaySchd_Srch08();
			PaySchd_Srch07_CndR cndR = PaySchd_Srch07_CndR.create();
			cndR.hdr_peg_no(0);
			cndR.pay_chk_mng_no(down0().pay_chk_mng_no());
			cndR.bsppl_cd(down0().bsppl_cd());
			cndR.bsppl_dpt_cd(down0().bsppl_dpt_cd());
			cndR.trd_cur_cd(down0().trd_cur_cd());
			cndR.pay_spot_flg(down0().pay_spot_flg());
			cndR.reg_only_flg(true);
			o.up0().add(cndR);
			o.exec();
			addAll(down4(), o.down0(), createMap_Srch01_RsltAdvPayActR_PaySchd_Srch08_RsltR());
		}

		/**
		 * 支払照合を編集する
		 */
		protected void editPayChk() {

			// 買掛金の合計
			down0().ap_amt(
				down1().sum(Srch01_RsltApdR.$trd_cur_inc_tax_amt)
			);

			// 支払予定の合計
			BiFunction<MCNumber, MCNumber, MCNumber> add = (x, y) -> {
				return nvl(x, MCNumber.ZERO).add(nvl(y, MCNumber.ZERO));
			};
			for (Srch01_RsltSchdR r : down2()) {
				// 支払金額
				down0().trd_cur_amt(
					add.apply(down0().trd_cur_amt(), r.trd_cur_amt())
				);
				down0().base_cur_amt(
					add.apply(down0().base_cur_amt(), r.base_cur_amt())
				);
				if (MAC_AP_STTL_TYP.is_com_paid(r.ap_sttl_typ())) {
					// 手数料
					down0().trd_cur_com_paid_amt(
						add.apply(down0().trd_cur_com_paid_amt(), r.trd_cur_amt())
					);
					down0().base_cur_com_paid_amt(
						add.apply(down0().base_cur_com_paid_amt(), r.base_cur_amt())
					);
					// 手数料税額
					down0().trd_cur_com_paid_tax_amt(
						add.apply(down0().trd_cur_com_paid_tax_amt(), r.trd_cur_com_paid_tax_amt())
					);
					down0().base_cur_com_paid_tax_amt(
						add.apply(down0().base_cur_com_paid_tax_amt(), r.base_cur_com_paid_tax_amt())
					);
				}
			}

			down0().base_cur_cd(getBaseCur().cur_cd());
			down0().base_cur_nm(getBaseCur().cur_nm());
			down0().base_cur_amt_dec_place(getBaseCur().amt_dec_place());
			down0().base_cur_upri_dec_place(getBaseCur().upri_dec_place());
			down0().xrate_cd(getCo().purc_xrate_cd());
			if (!isNull(down0().setoff_amt())) {
				down0().setoff_amt(down0().setoff_amt().multiply(-1));
			}
		}

		/**
		 * 買掛明細を編集する
		 */
		protected void editApd() {
			for (Srch01_RsltApdR r: down1()) {
				MAM_ITM_R itmR = _cacheItm.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (isNull(r.itm_nm())) {
					r.itm_nm(itmR.itm_nm());
				}

				// 今回繰越回数
				if (!isNull(r.crryovr_ap_d_no())) {
					// r.crryovr_times には繰越分の買掛明細.支払繰越回数が設定されている
					MCNumber times = r.crryovr_times().subtract(r.pay_crryovr_times());
					r.crryovr_times(isNull(times) ? null : times);
				}

				// 基準通貨
				r.base_cur_cd(getBaseCur().cur_cd());
				r.base_cur_nm(getBaseCur().cur_nm());
				r.base_cur_amt_dec_place(getBaseCur().amt_dec_place());
				r.base_cur_upri_dec_place(getBaseCur().upri_dec_place());

				// 数量、単価、金額を反転する
				MCNumber
					upriPm = MAUCL_TrdUtil.getUpriDispPm(r.trd_ptn_typ(), itmR.dscnt_itm_flg()),
					qtyPm = MAC_TRD_PTN_TYP.qty_disp_pm(r.trd_ptn_typ());

				r.amt_disp_pm(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), itmR.dscnt_itm_flg()));
				if (!isNull(r.trd_cur_amt())) {
					r.trd_cur_amt(r.trd_cur_amt().multiply(r.amt_disp_pm()));
				}
				if (!isNull(r.trd_cur_tax_amt())) {
					r.trd_cur_tax_amt(r.trd_cur_tax_amt().multiply(r.amt_disp_pm()));
				}
				if (!isNull(r.trd_cur_dscnt_amt())) {
					r.trd_cur_dscnt_amt(r.trd_cur_dscnt_amt().multiply(r.amt_disp_pm()));
				}
				if (!isNull(r.trd_cur_upri())) {
					r.trd_cur_upri(r.trd_cur_upri().multiply(upriPm));
				}
				if (!isNull(r.trd_unit_qty())) {
					r.trd_unit_qty(r.trd_unit_qty().multiply(qtyPm));
				}
				if (!isNull(r.base_cur_amt())) {
					r.base_cur_amt(r.base_cur_amt().multiply(r.amt_disp_pm()));
				}
				if (!isNull(r.base_cur_tax_amt())) {
					r.base_cur_tax_amt(r.base_cur_tax_amt().multiply(r.amt_disp_pm()));
				}
				if (!isNull(r.base_cur_dscnt_amt())) {
					r.base_cur_dscnt_amt(r.base_cur_dscnt_amt().multiply(r.amt_disp_pm()));
				}
				if (!isNull(r.base_cur_upri())) {
					r.base_cur_upri(r.base_cur_upri().multiply(upriPm));
				}
				if (!isNull(r.base_unit_qty())) {
					r.base_unit_qty(r.base_unit_qty().multiply(qtyPm));
				}
				if (!isNull(r.wtax_amt())) {
					r.wtax_amt(r.wtax_amt().multiply(r.amt_disp_pm()));
				}
				if (!isNull(r.trd_cur_proc_upri())) {
					r.trd_cur_proc_upri(r.trd_cur_proc_upri().multiply(upriPm));
				}
				if (!isNull(r.trd_cur_proc_amt())) {
					r.trd_cur_proc_amt(r.trd_cur_proc_amt().multiply(r.amt_disp_pm()));
				}
				if (!isNull(r.trd_cur_onr_prov_upri())) {
					r.trd_cur_onr_prov_upri(r.trd_cur_onr_prov_upri().multiply(upriPm));
				}
				if (!isNull(r.trd_cur_onr_prov_amt())) {
					r.trd_cur_onr_prov_amt(r.trd_cur_onr_prov_amt().multiply(r.amt_disp_pm()));
				}
				if (!isNull(r.base_cur_proc_upri())) {
					r.base_cur_proc_upri(r.base_cur_proc_upri().multiply(upriPm));
				}
				if (!isNull(r.base_cur_proc_amt())) {
					r.base_cur_proc_amt(r.base_cur_proc_amt().multiply(r.amt_disp_pm()));
				}
				if (!isNull(r.base_cur_onr_prov_upri())) {
					r.base_cur_onr_prov_upri(r.base_cur_onr_prov_upri().multiply(upriPm));
				}
				if (!isNull(r.base_cur_onr_prov_amt())) {
					r.base_cur_onr_prov_amt(r.base_cur_onr_prov_amt().multiply(r.amt_disp_pm()));
				}
				if (!isNull(r.co_src_trd_cur_proc_amt())) {
					r.co_src_trd_cur_proc_amt(r.co_src_trd_cur_proc_amt().multiply(r.amt_disp_pm()));
				}
				if (!isNull(r.co_src_trd_cur_onr_prov_amt())) {
					r.co_src_trd_cur_onr_prov_amt(r.co_src_trd_cur_onr_prov_amt().multiply(r.amt_disp_pm()));
				}

				// 税込金額
				r.trd_cur_inc_tax_amt(
					r.trd_cur_amt().add(r.trd_cur_tax_amt())
				);
				r.base_cur_inc_tax_amt(
					r.base_cur_amt().add(r.base_cur_tax_amt())
				);

				// 繰越元
				if (!isNull(r.co_src_trd_cur_amt())) {
					r.co_src_trd_cur_amt(r.co_src_trd_cur_amt().multiply(r.amt_disp_pm()));
				}
				if (!isNull(r.co_src_trd_cur_tax_amt())) {
					r.co_src_trd_cur_tax_amt(r.co_src_trd_cur_tax_amt().multiply(r.amt_disp_pm()));
				}
			}

			// 繰越後締日
			if (!isNull(down0().bsppl_cl_dt())) {
				String prefix = "hdr_";
				down1().addStringColumn(prefix + Srch01_RsltChkR.$bsppl_cd, down0().bsppl_cd());
				down1().addDateColumn(prefix + Srch01_RsltChkR.$bsppl_cl_dt, down0().bsppl_cl_dt());
				MSBHL_ApUtil.setBspplClDt(
					down1().subList(r -> !isNull(r.crryovr_times())),
					prefix + Srch01_RsltChkR.$bsppl_cd, prefix + Srch01_RsltChkR.$bsppl_cl_dt, Srch01_RsltApdR.$crryovr_times,
					Srch01_RsltApdR.$co_bsppl_cl_dt, Srch01_RsltApdR.$co_bsppl_cl_ym, Srch01_RsltApdR.$co_bsppl_cl_day);
			}
		}

		/**
		 * 支払予定を編集する
		 */
		protected void editPaySchd() {

			// 予定時作成分の支払実績を取得
			MCList<MST_PAY_ACT_D_R> payActL = MCList.create(MST_PAY_ACT_D_R.class);
			MST_PAY_ACT_D_R t = MST_PAY_ACT_D_R.create("T");
			MST_PAY_ACT_R t2 = MST_PAY_ACT_R.create("T2");
			MCQueryApiBuilder payActL_bldr = MCQueryApiBuilder.create(t);
			payActL.addDateColumn("ac_dt");
			payActL_bldr.setSelect(t.pay_schd_no, t2.ac_dt);
			payActL_bldr.addInnerJoin(t2, bracket(t2.pay_act_no.eq(t.pay_act_no)
					.and(t2.pay_act_seq.eq(t.pay_act_seq))));
			payActL_bldr.setWhere(t.pay_chk_no.eq(bind("1")), down0().pay_chk_no());
			payActL_bldr.addWhereWithAnd(t2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			payActL_bldr.addWhereWithAnd(t2.schd_act_flg.eq(value(true)));
			dbSelect("MSBHL0030_MST_PAY_ACT_D_S01", payActL, payActL_bldr);
			MCIndexKey idx = payActL.createIndex(MST_PAY_ACT_D_R.$pay_schd_no);

			for (Srch01_RsltSchdR r: down2()) {
				// 支払金額（基準通貨に換算）
				r.base_cur_amt(
					MAUCL_MCDataUtil.convToBaseCur(
						r.trd_cur_amt(),
						r.xrate(),
						getBaseCur().amt_dec_place(),
						getCo().xrate_rnd_typ())
				);
				if (MAC_AP_STTL_TYP.is_com_paid(r.ap_sttl_typ()) || MAC_AP_STTL_TYP.isSETOFF(r.ap_sttl_typ())) {
					// 手数料税額（基準通貨に換算）
					r.base_cur_com_paid_tax_amt(
						MAUCL_MCDataUtil.convToBaseCur(
							r.trd_cur_com_paid_tax_amt(),
							r.xrate(),
							getBaseCur().amt_dec_place(),
							getCo().xrate_rnd_typ())
					);
				}

				// 前回相殺実績作成
				MST_PAY_ACT_D_R payActR = payActL.getFirst(idx, r.pay_schd_no());
				if (!isNull(payActR)) {
					r.last_setoff_act_flg(true);
					r.can_ac_dt(payActR.getDateNE("ac_dt"));
				}
			}
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 支払対象の買掛明細を検索する（画面遷移専用検索ロジック）。<br>
	 */
	public class Srch02 extends MSBHL_PaySchdReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void initSearch() {
			super.initSearch();

			editUp();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			mapUpContainers(MSBHL5030);
			srchAct();
			srchAdvPayAct();
			srchApd();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			up0().upd_mode_flg(true);
			up0().srch_tax_diff_flg(true);
		}

		/**
		 * 買掛明細を検索する
		 */
		protected void srchApd() {
			addAll(Srch03.up2(), down1(), createMap_PaySchd_Srch03_CndPayActR_Srch01_RsltActR());
			addAll(Srch03.up3(), down2(), createMap_PaySchd_Srch03_CndAdvPayActR_Srch01_RsltAdvPayActR());
			Srch03.exec();
			mapDownContainers(MSBHL5030);
		}
		protected void srchAct() {
			callPaySchdSrch07();
		}
		/**
		 * 支払予定登録サービスの支払実績検索処理を実行する
		 */
		protected void callPaySchdSrch07() {
			MSBHL_PaySchdRegService.PaySchd_Srch07 o = MSBHL_PaySchdRegService.crtPaySchd_Srch07();
			PaySchd_Srch07_CndR cndR = PaySchd_Srch07_CndR.create();
			cndR.hdr_peg_no(0);
			cndR.bsppl_cd(up0().bsppl_cd());
			cndR.bsppl_dpt_cd(up0().bsppl_dpt_cd());
			cndR.trd_cur_cd(up0().trd_cur_cd());
			cndR.pay_spot_flg(up0().pay_spot_flg());
			cndR.reg_only_flg(false);
			o.up0().add(cndR);
			o.exec();
			addAll(down1(), o.down0(), createMap_Srch01_RsltActR_PaySchd_Srch07_RsltR());
		}
		protected void srchAdvPayAct() {
			callPaySchdSrch08();
		}
		/**
		 * 支払予定登録サービスの前渡金実績検索処理を実行する
		 */
		protected void callPaySchdSrch08() {
			MSBHL_PaySchdRegService.PaySchd_Srch08 o = MSBHL_PaySchdRegService.crtPaySchd_Srch08();
			PaySchd_Srch07_CndR cndR = PaySchd_Srch07_CndR.create();
			cndR.hdr_peg_no(0);
			cndR.bsppl_cd(up0().bsppl_cd());
			cndR.bsppl_dpt_cd(up0().bsppl_dpt_cd());
			cndR.trd_cur_cd(up0().trd_cur_cd());
			cndR.pay_spot_flg(up0().pay_spot_flg());
			cndR.reg_only_flg(false);
			o.up0().add(cndR);
			o.exec();
			setAll(down2(), o.down0(), createMap_Srch01_RsltAdvPayActR_PaySchd_Srch08_RsltR());
		}
		protected Map_PaySchd_Srch03_CndPayActR_Srch01_RsltActR<PaySchd_Srch03_CndPayActR,Srch01_RsltActR> createMap_PaySchd_Srch03_CndPayActR_Srch01_RsltActR() {
			return new Map_PaySchd_Srch03_CndPayActR_Srch01_RsltActR<PaySchd_Srch03_CndPayActR, Srch01_RsltActR>();
		}
		public class Map_PaySchd_Srch03_CndPayActR_Srch01_RsltActR<D extends PaySchd_Srch03_CndPayActR, S extends Srch01_RsltActR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PaySchd_Srch03_CndPayActR.$pay_act_d_no, Srch01_RsltActR.$pay_act_d_no);
				addColumnPathMap(PaySchd_Srch03_CndPayActR.$pay_act_d_seq, Srch01_RsltActR.$pay_act_d_seq);
			}
		}
		protected Map_PaySchd_Srch03_CndAdvPayActR_Srch01_RsltAdvPayActR<PaySchd_Srch03_CndAdvPayActR,Srch01_RsltAdvPayActR> createMap_PaySchd_Srch03_CndAdvPayActR_Srch01_RsltAdvPayActR() {
			return new Map_PaySchd_Srch03_CndAdvPayActR_Srch01_RsltAdvPayActR<PaySchd_Srch03_CndAdvPayActR, Srch01_RsltAdvPayActR>();
		}
		public class Map_PaySchd_Srch03_CndAdvPayActR_Srch01_RsltAdvPayActR<D extends PaySchd_Srch03_CndAdvPayActR, S extends Srch01_RsltAdvPayActR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PaySchd_Srch03_CndAdvPayActR.$adv_pay_act_no, Srch01_RsltAdvPayActR.$adv_pay_act_no);
				addColumnPathMap(PaySchd_Srch03_CndAdvPayActR.$adv_pay_act_seq, Srch01_RsltAdvPayActR.$adv_pay_act_seq);
			}
		}
	}

	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 支払予定制御マスタに従い支払予定を自動設定する。<br>
	 */
	public class Sprt01 extends MSBHL_PaySchdReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void initSearch() {
			super.initSearch();

			editUp();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			srchApd();
		}

		@Override
		protected boolean isDelFlgCtl() {
			return true;
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			int hdrPegNo = 1;
			for (Sprt01_CndR r : up0()) {
				r.hdr_peg_no(hdrPegNo);
				r.is_ref_xrate(true);
				r.zero_flg(true);
			} 
		}

		/**
		 * 買掛明細を検索する
		 */
		protected void srchApd() {
			mapUpContainers(MSBHL5030);
			Srch01.exec();
			mapDownContainers(MSBHL5030);
		}
	}
	/**
	 * Sprt02オペレーション.<p>
	 *
	 * 支払対象の買掛明細に対する税差額分の買掛明細を取得する。<br>
	 */
	public class Sprt02 extends MSBHL_PaySchdReg_MC_A.Sprt02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void initSearch() {
			super.initSearch();

			editUp();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			srchApd();
			editApd();
		}

		@Override
		protected boolean isDelFlgCtl() {
			return true;
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			int hdrPegNo = 1;
			for (Sprt02_CndR r : up0()) {
				r.hdr_peg_no(hdrPegNo);
			} 
			for (Sprt02_CndPayActR r : up1()) {
				r.hdr_peg_no(hdrPegNo);
			}
			for (Sprt02_CndAdvPayActR r : up2()) {
				r.hdr_peg_no(hdrPegNo);
			}
		}

		/**
		 * 買掛明細を検索する
		 */
		protected void srchApd() {
			mapUpContainers(MSBHL5030);
			Srch05.exec();
			mapDownContainers(MSBHL5030);

			// MSBHL5030.PaySchd_Srch03_RsltR のコンテナ属性を利用して名称などを設定する
			if (!up0().isEmpty() && !down0().isEmpty()) {
				Sprt02_CndR upR = up0().get(0);
				setValuesDbc(MSBHL5030_PaySchd_Srch03_RsltR_J01(), upR, down0());
				setValuesDbc(upR, down0());
			}
			else if (!up1().isEmpty() && !down0().isEmpty()) {
				Sprt02_CndPayActR upR = up1().get(0);
				setValuesDbc(MSBHL5030_PaySchd_Srch03_RsltR_J01(), upR, down0());
				setValuesDbc(upR, down0());
			}
		}

		/**
		 * 買掛明細を編集する
		 */
		protected void editApd() {
			for (PaySchd_Srch03_RsltR r: down0()) {
				MAM_ITM_R itmR = _cacheItm.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (isNull(r.itm_nm())) {
					r.itm_nm(itmR.itm_nm());
				}

				// 消費税差額分は金額は常に０なんで税込金額には税額を設定する
				r.trd_cur_inc_tax_amt(r.trd_cur_tax_amt());
				r.base_cur_inc_tax_amt(r.base_cur_tax_amt());

				r.base_cur_cd(getBaseCur().cur_cd());
				r.base_cur_nm(getBaseCur().cur_nm());
			}
		}
	}

	/**
	 * Sprt03オペレーション.<p>
	 *
	 * 売掛金相殺、および有償支給相殺の相殺対象残高を取得する。<br>
	 */
	public class Sprt03 extends MSBHL_PaySchdReg_MC_A.Sprt03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			callApSetoffService();
		}

		/**
		 * 債務相殺サービスを実行する
		 */
		protected void callApSetoffService() {
			if (MAC_AP_SETOFF_TYP.isACST(up0().ap_setoff_typ())) {
				// 売掛金残高取得
				callApSetoffSrch01();
			}
			else if (MAC_AP_SETOFF_TYP.isPRSPPL(up0().ap_setoff_typ())) {
				// 有償支給残高取得
				callApSetoffSrch04();
			}
		}

		/**
		 * 債務相殺サービスの売掛金残高取得オペレーションを実行する
		 */
		protected void callApSetoffSrch01() {
			MSBHL_ApSetoffService.ApSetoff_Srch01 o = MSBHL_ApSetoffService.crtApSetoff_Srch01();
			o.up0().setoff_cd(up0().setoff_cd());
			o.up0().so_dpt_cd(up0().so_dpt_cd());
			o.up0().trd_cur_cd(up0().trd_cur_cd());
			o.up0().ar_typ(getArTyp(up0().ap_sttl_cd()));
			o.exec();

			down0().setoff_limit_amt(o.down0().ar_bal_amt());
			down0().ar_typ(o.up0().ar_typ());
		}
		protected String getArTyp(String sttlCd) {
			MAM_STTL_R sttlR = MAM_STTL_R.create("STTL");
			MAM_AC_RSN_R acRsnR = MAM_AC_RSN_R.create("ACRSN");
			MCQueryApiBuilder sttlLBldr = MCQueryApiBuilder.create(sttlR);
			sttlLBldr.setSelect(acRsnR.ar_typ);
			sttlLBldr.addLeftOuterJoin(acRsnR, sttlR.ac_rsn_cd.eq(acRsnR.ac_rsn_cd));
			sttlLBldr.setWhere(sttlR.sttl_cd.eq(bind("1")), sttlCd);

			MCRow arTypR = MCRow.create();
			dbSelect("MSBHL0030_MAM_STTL_S01", arTypR, sttlLBldr);

			return nvl(arTypR.getStringNE("ar_typ"), MAC_AR_TYP.AR.value());
		}

		/**
		 * 債務相殺サービスの有償支給残高取得オペレーションを実行する
		 */
		protected void callApSetoffSrch04() {
			MSBHL_ApSetoffService.ApSetoff_Srch04 o = MSBHL_ApSetoffService.crtApSetoff_Srch04();
			o.up0().asppl_cd(up0().setoff_cd());
			o.up0().ap_dpt_cd(up0().so_dpt_cd());
			o.up0().trd_cur_cd(up0().trd_cur_cd());
			MCDate dt = getAcYm(nvl(up0().base_dt(), getToday()));
			o.up0().ac_ym_fr(dt);
			o.up0().ac_ym_to(dt);
			o.up0().is_src_payschd_flg(true);
			o.exec();

			if (o.down0().isEmpty()) {
				down0().setoff_limit_amt(0);
			}
			else {
				MCGroupByPolicy gp = new MCGroupByPolicy();
				gp.sum(ApSetoff_Srch04_DtlR.$init_bal, ApSetoff_Srch04_DtlR.$onr_prov_amt,
						ApSetoff_Srch04_DtlR.$tax_amt, ApSetoff_Srch04_DtlR.$onr_prov_ret_amt,
						ApSetoff_Srch04_DtlR.$setoff_amt, ApSetoff_Srch04_DtlR.$setoff_schd_amt);
				ApSetoff_Srch04_DtlR r = o.down0().groupBy(gp).get(0);
	
				down0().setoff_limit_amt(
						r.init_bal()
						.add(r.onr_prov_amt())
						.add(r.tax_amt())
						.add(r.onr_prov_ret_amt())
						.subtract(r.setoff_amt())
						.subtract(r.setoff_schd_amt()));
			}
		}
	}

	/**
	 * Sprt04オペレーション.<p>
	 *
	 * 今回有償支給額を取得する。<br>
	 */
	public class Sprt04 extends MSBHL_PaySchdReg_MC_A.Sprt04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			srchOnrProvBal();
		}

		/**
		 * 有償支給残高を取得する
		 */
		protected void srchOnrProvBal() {
			mapUpContainers(MSBHL5080);
			Srch03.exec();
			mapDownContainers(MSBHL5080);
		}
	}
	/**
	 * Sprt05オペレーション.<p>
	 *
	 * 支払実績を検索する。<br>
	 */
	public class Sprt05 extends MSBHL_PaySchdReg_MC_A.Sprt05 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void initSearch() {
			super.initSearch();
			editUp();
		}
		private void editUp() {
			up0().reg_only_flg(false);
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			srchAct();
		}
		protected void srchAct() {
			callPaySchdSrch07();
		}
		/**
		 * 支払予定登録サービスの支払実績検索処理を実行する
		 */
		protected void callPaySchdSrch07() {
			MSBHL_PaySchdRegService.PaySchd_Srch07 o = MSBHL_PaySchdRegService.crtPaySchd_Srch07();
			PaySchd_Srch07_CndR cndR = PaySchd_Srch07_CndR.create();
			cndR.hdr_peg_no(0);
			cndR.pay_chk_mng_no(up0().pay_chk_mng_no());
			cndR.bsppl_cd(up0().bsppl_cd());
			cndR.bsppl_dpt_cd(up0().bsppl_dpt_cd());
			cndR.trd_cur_cd(up0().trd_cur_cd());
			cndR.pay_spot_flg(up0().pay_spot_flg());
			cndR.reg_only_flg(false);
			o.up0().add(cndR);
			o.exec();
			addAll(down0(), o.down0(), createMap_Srch01_RsltActR_PaySchd_Srch07_RsltR());
		}
	}
	/**
	 * Sprt06オペレーション.<p>
	 *
	 * 前渡金実績を検索する。<br>
	 */
	public class Sprt06 extends MSBHL_PaySchdReg_MC_A.Sprt06 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void initSearch() {
			super.initSearch();
			editUp();
		}
		private void editUp() {
			up0().reg_only_flg(false);
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			srchAdvPayAct();
		}
		protected void srchAdvPayAct() {
			MSBHL_PaySchdRegService.PaySchd_Srch08 o = MSBHL_PaySchdRegService.crtPaySchd_Srch08();
			PaySchd_Srch07_CndR cndR = PaySchd_Srch07_CndR.create();
			cndR.hdr_peg_no(0);
			cndR.pay_chk_mng_no(up0().pay_chk_mng_no());
			cndR.bsppl_cd(up0().bsppl_cd());
			cndR.bsppl_dpt_cd(up0().bsppl_dpt_cd());
			cndR.trd_cur_cd(up0().trd_cur_cd());
			cndR.pay_spot_flg(up0().pay_spot_flg());
			cndR.reg_only_flg(false);
			o.up0().add(cndR);
			o.exec();
			setAll(down0(), o.down0(), createMap_Srch01_RsltAdvPayActR_PaySchd_Srch08_RsltR());
		}
	}
	/**
	 * Sprt07オペレーション.<p>
	 *
	 * 前回支払予定を取得する。<br>
	 */
	public class Sprt07 extends MSBHL_PaySchdReg_MC_A.Sprt07 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			callPaySchdSrch06();
		}
		protected void callPaySchdSrch06() {
			MSBHL_PaySchdRegService.PaySchd_Srch06 o = MSBHL_PaySchdRegService.crtPaySchd_Srch06();
			PaySchd_Srch02_RsltR r = PaySchd_Srch02_RsltR.create();
			copy(r, up0() , createMap_PaySchd_Srch02_RsltR_Sprt07_CndR());
			o.up0().add(r);
			o.exec();
			if (!isNull(o.down0())) {
				PaySchd_Srch02_RsltR downR = o.down0().get(0);
				down0().last_pay_schd_amt(downR.last_pay_schd_amt());
			}
		}
		protected Map_PaySchd_Srch02_RsltR_Sprt07_CndR<PaySchd_Srch02_RsltR,Sprt07_CndR> createMap_PaySchd_Srch02_RsltR_Sprt07_CndR() {
			return new Map_PaySchd_Srch02_RsltR_Sprt07_CndR<PaySchd_Srch02_RsltR, Sprt07_CndR>();
		}

		public class Map_PaySchd_Srch02_RsltR_Sprt07_CndR<D extends PaySchd_Srch02_RsltR, S extends Sprt07_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PaySchd_Srch02_RsltR.$pay_chk_mng_no, Sprt07_CndR.$pay_chk_mng_no);
				addColumnPathMap(PaySchd_Srch02_RsltR.$bsppl_cd, Sprt07_CndR.$bsppl_cd);
				addColumnPathMap(PaySchd_Srch02_RsltR.$bsppl_dpt_cd, Sprt07_CndR.$bsppl_dpt_cd);
				addColumnPathMap(PaySchd_Srch02_RsltR.$purc_act_no, Sprt07_CndR.$purc_act_no);
				addColumnPathMap(PaySchd_Srch02_RsltR.$rcpt_iv_mng_no, Sprt07_CndR.$rcpt_iv_mng_no);
				addColumnPathMap(PaySchd_Srch02_RsltR.$rcpt_iv_no, Sprt07_CndR.$rcpt_iv_no);
				addColumnPathMap(PaySchd_Srch02_RsltR.$wrk_no, Sprt07_CndR.$wrk_no);
				addColumnPathMap(PaySchd_Srch02_RsltR.$pay_spot_flg, Sprt07_CndR.$pay_spot_flg);
				addColumnPathMap(PaySchd_Srch02_RsltR.$bsppl_cl_dt, Sprt07_CndR.$bsppl_cl_dt);
				addColumnPathMap(PaySchd_Srch02_RsltR.$trd_cur_cd, Sprt07_CndR.$trd_cur_cd);
				addColumnPathMap(PaySchd_Srch02_RsltR.$pay_spot_flg, Sprt07_CndR.$pay_spot_flg);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.hdr_peg_no(0);
				dest.purc_act_no(isNull(dest.purc_act_no()) ? NULL_VAL : dest.purc_act_no());
				dest.rcpt_iv_mng_no(isNull(dest.rcpt_iv_mng_no()) ? NULL_VAL : dest.rcpt_iv_mng_no());
				dest.rcpt_iv_no(isNull(dest.rcpt_iv_no()) ? NULL_VAL : dest.rcpt_iv_no());
				dest.wrk_no(isNull(dest.wrk_no()) ? NULL_VAL : dest.wrk_no());
				dest.purc_amt(0);
				dest.purc_ret_amt(0);
				dest.purc_dscnt_amt(0);
				dest.sw_to_amt(0);
				dest.tax_amt(0);
			}
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 支払照合、支払予定情報の新規登録・更新が可能かチェックする。<br>
	 */
	public class Chk01 extends MSBHL_PaySchdReg_MC_A.Chk01 {

		/**
		 * 支払照合
		 */
		protected MST_PAY_CHK_R _payChkR;

		/**
		 * 買掛明細
		 */
		protected Map<String, MST_AP_D_R> _apdL;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void initUpSub() {
			super.initUpSub();

			_payChkR = MST_PAY_CHK_R.create();
			_apdL = new HashMap<>();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (!hasErr()) {
				callPaySchdLock(up0());
				callPaySchdChk01();
			}
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 更新カウンタチェック
			msgL.addAll(chkUpdCntrPahChk());
			msgL.addAll(chkUpdCntrApd());

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			// データ補完
			crrctDataAfterDoServerChk();

			// 買掛明細チェック
			msgL.addAll(chkApdR());

			// DACチェック
			msgL.addAll(chkBspplDptDac());

			return msgL;
		}

		/**
		 * DACチェック
		 */
		protected MCMessageList chkBspplDptDac() {

			MCMessageList msgL = new MCMessageList();
			msgL.addAll(chkBspplDptDacCmm(up0()));

			if (!isNull(up0().pay_chk_mng_no())
			 && !isSame(up0().bsppl_dpt_cd(), _payChkR.bsppl_dpt_cd())) {
				HdrR hdrR = HdrR.create();
				hdrR.bsppl_dpt_cd(_payChkR.bsppl_dpt_cd());
				msgL.addAll(chkBspplDptDacCmm(hdrR));
			}
			return msgL;
		}

		/**
		 * 支払照合に対する更新カウンタチェック
		 */
		protected MCMessageList chkUpdCntrPahChk() {
			if (isNull(up0().pay_chk_mng_no())) {
				return null;
			}

			MCMessageList msgL = new MCMessageList();
			msgL.addAll(chkUpdCntrPahChkCmm(up0(), _payChkR));
			return msgL;
		}
	
		/**
		 * 買掛明細に対する更新カウンタチェック
		 */
		protected MCMessageList chkUpdCntrApd() {
			if (hasErrFlgOn(up0())) {
				// 支払照合の更新カウンタチェックでエラーの場合はチェックしない
				return null;
			}

			MCMessageList msgL = new MCMessageList();
			msgL.addAll(chkUpdCntrApdCmm(up1(), _apdL));
			return msgL;
		}

		/**
		 * 買掛明細に対するチェック
		 */
		protected MCMessageList chkApdR() {
			MCList<DtlApdR> apdL = up1().subList(r -> !isNull(r.ap_d_no()));
			if (apdL.isEmpty()) {
				return null;
			}

			MCList<MST_AP_D_R> dbc = MCList.create(MST_AP_D_R.class);
			apdL.forEach(r -> dbc.add().ap_d_no(r.ap_d_no()));
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_AP_D_R.create("T"));
			dbWkDelete("MSBHL0030_MSW_AP_D_D01", dbc_bldr.getBaseDbc());
			dbWkInsert("MSBHL0030_MSW_AP_D_I01",
					dbc.groupBy(dbc.createRow().getKeyColumn()), dbc_bldr.getBaseDbc());

			dbc.init();
			MST_AP_D_R t = MST_AP_D_R.create("T");
			MSW_AP_D_KEY_R w = MSW_AP_D_KEY_R.create("W");
			MST_AP_D_R t2 = MST_AP_D_R.create("T2");
			dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(
					t.ap_d_no,
					t.pay_mtd_typ,
					t.outsrc_flg,
					t.repurc_obli_flg,
					decode(t2.ap_d_no, nullValue(), t.trd_cur_proc_amt, t2.trd_cur_proc_amt).as("trd_cur_proc_amt"),
					decode(t2.ap_d_no, nullValue(), t.trd_cur_onr_prov_amt, t2.trd_cur_onr_prov_amt).as("trd_cur_onr_prov_amt"),
					decode(t2.ap_d_no, nullValue(), t.trd_cur_amt, t2.trd_cur_amt).as("trd_cur_amt"),
					decode(t2.ap_d_no, nullValue(), t.trd_cur_tax_amt, t2.trd_cur_tax_amt).as("trd_cur_tax_amt"));
			dbc_bldr.addInnerJoin(w, bracket(w.ap_d_no.eq(t.ap_d_no)));
			dbc_bldr.addLeftOuterJoin(t2, bracket(t2.ap_d_no.eq(t.crryovr_src_ap_d_no)));
			dbSelect("MSBHL0030_MST_AP_D_S01", dbc, dbc_bldr);
			dbWkDelete("MSBHL0030_MSW_AP_D_D02", dbc_bldr.getBaseDbc());

			MCIndexKey idx = dbc.createIndex(MST_AP_D_R.$ap_d_no);
			MCMessageList msgL = new MCMessageList();
			for (DtlApdR r : apdL) {
				MST_AP_D_R oldR = dbc.getFirst(idx, r.ap_d_no());
				r.repurc_obli_flg(oldR.repurc_obli_flg());
				if (!MSC_PAY_MTD_TYP.isPART_PAY(r.pay_mtd_typ())) {
					continue;
				}

				// チェック前に符号を考慮
				invertNum(r, oldR, r.amt_disp_pm());

				//金額チェック
				if (!isNull(r.pay_amt())) {
					if (!isValidPayAmt(r, oldR)) {
						if (oldR.trd_cur_amt().isPositive()) {
							msgL.add(new MCMessage(r, DtlApdR.$pay_amt,
									MSBHL0027, oldR.trd_cur_amt(), r.pay_amt(), toDispGUIIndex(r)));
						}
						else if (oldR.trd_cur_amt().isNegative()) {
							msgL.add(new MCMessage(r, DtlApdR.$pay_amt,
									MSBHL0028, oldR.trd_cur_amt(), r.pay_amt(), toDispGUIIndex(r)));
						}
					}
				}
				//税額チェック
				if (!isNull(r.pay_tax_amt())) {
					if (!isValidPayCTaxAmt(r, oldR)) {
						if (oldR.trd_cur_tax_amt().isPositive()) {
							msgL.add(new MCMessage(r, DtlApdR.$pay_tax_amt,
									MSBHL0029, oldR.trd_cur_tax_amt(), r.pay_tax_amt(), toDispGUIIndex(r)));
						}
						else if (oldR.trd_cur_tax_amt().isNegative()) {
							msgL.add(new MCMessage(r, DtlApdR.$pay_tax_amt,
									MSBHL0030, oldR.trd_cur_tax_amt(), r.pay_tax_amt(), toDispGUIIndex(r)));
						}
					}
				}
				//加工金額チェック
				if (!isNull(r.pay_proc_amt())) {
					if (!isValidPayProcAmt(r, oldR)) {
						if (oldR.trd_cur_proc_amt().isPositive()) {
							msgL.add(new MCMessage(r, DtlApdR.$pay_proc_amt,
									MSBHL0201, oldR.trd_cur_proc_amt(), r.pay_proc_amt(), toDispGUIIndex(r)));
						}
						else if (oldR.trd_cur_proc_amt().isNegative()) {
							msgL.add(new MCMessage(r, DtlApdR.$pay_proc_amt,
									MSBHL0202, oldR.trd_cur_proc_amt(), r.pay_proc_amt(), toDispGUIIndex(r)));
						}
					}
				}
				//有償支給金額チェック
				if (!isNull(r.pay_onr_prov_amt())) {
					if (!isValidPayOnrProcAmt(r, oldR)) {
						if (oldR.trd_cur_onr_prov_amt().isPositive()) {
							msgL.add(new MCMessage(r, DtlApdR.$pay_onr_prov_amt,
									MSBHL0203, oldR.trd_cur_onr_prov_amt(), r.pay_onr_prov_amt(), toDispGUIIndex(r)));
						}
						else if (oldR.trd_cur_onr_prov_amt().isNegative()) {
							msgL.add(new MCMessage(r, DtlApdR.$pay_onr_prov_amt,
									MSBHL0204, oldR.trd_cur_onr_prov_amt(), r.pay_onr_prov_amt(), toDispGUIIndex(r)));
						}
					}
				}
				if (oldR.outsrc_flg()) {
					if (!isSame(sum(r.pay_proc_amt(), r.pay_onr_prov_amt()), r.pay_amt())) {
						msgL.add(new MCMessage(r, DtlApdR.$pay_amt,
								MSBHL0205, sum(r.pay_proc_amt(), r.pay_onr_prov_amt()), r.pay_amt(), toDispGUIIndex(r)));
					}
				}

				// チェック前に符号を戻す
				invertNum(r, oldR, r.amt_disp_pm());
			}
			return msgL;
		}

		/**
		 * 依頼金額が妥当かどうか
		 */
		protected boolean isValidPayAmt(DtlApdR r, MST_AP_D_R oldR) {
			MCNumber amt = r.pay_amt().abs();
			MCNumber oldAmt = oldR.trd_cur_amt().abs();
			
			if (amt.gt(oldAmt)) {
				//元の金額より大きい値（絶対値で比較）は許さない
				//※データとして問題はないが、通常ありえないと思われるためチェックする。
				return false;
			}
			else if (!isSame(oldR.trd_cur_amt().signum(),r.pay_amt().signum())) {
				//元の符号と異なる値は許さない（元が0の場合は0のみ）
				//※データとして問題はないが、通常ありえないと思われるためチェックする。
				return false;
			}

			if (!MSC_PAY_MTD_TYP.isPART_PAY(oldR.pay_mtd_typ())
					&& MSC_PAY_MTD_TYP.isPART_PAY(r.pay_mtd_typ())) {
				//今回初めて一部支払する場合、oldの金額と同じ入力金額は許さない。
				//（全額払うのであれば一部支払させないということ。）
				//更新の場合はチェックしたくないのでoldを考慮している。
				if (isSame(
					r.pay_amt().add(r.pay_tax_amt()),
					oldR.trd_cur_amt().add(oldR.trd_cur_tax_amt()))) {
					return false;
				}
			}
			return true;
		}
		/**
		 * 加工金額が妥当かどうか
		 */
		protected boolean isValidPayProcAmt(DtlApdR r, MST_AP_D_R oldR) {
			MCNumber amt = r.pay_proc_amt().abs();
			MCNumber oldAmt = oldR.trd_cur_proc_amt().abs();
			
			if (amt.gt(oldAmt)) {
				//元の金額より大きい値（絶対値で比較）は許さない
				//※データとして問題はないが、通常ありえないと思われるためチェックする。
				return false;
			}
			else if (!isSame(oldR.trd_cur_proc_amt().signum(),r.pay_proc_amt().signum())) {
				//元の符号と異なる値は許さない（元が0の場合は0のみ）
				//※データとして問題はないが、通常ありえないと思われるためチェックする。
				return false;
			}
			return true;
		}
		/**
		 * 有償支給金額が妥当かどうか
		 */
		protected boolean isValidPayOnrProcAmt(DtlApdR r, MST_AP_D_R oldR) {
			MCNumber amt = r.pay_onr_prov_amt().abs();
			MCNumber oldAmt = oldR.trd_cur_onr_prov_amt().abs();
			
			if (amt.gt(oldAmt)) {
				//元の金額より大きい値（絶対値で比較）は許さない
				//※データとして問題はないが、通常ありえないと思われるためチェックする。
				return false;
			}
			else if (!isSame(oldR.trd_cur_onr_prov_amt().signum(),r.pay_onr_prov_amt().signum())) {
				//元の符号と異なる値は許さない（元が0の場合は0のみ）
				//※データとして問題はないが、通常ありえないと思われるためチェックする。
				return false;
			}
			return true;
		}

		/**
		 * 依頼税額が妥当かどうか
		 */
		protected boolean isValidPayCTaxAmt(DtlApdR r, MST_AP_D_R oldR) {
			MCNumber amt = r.pay_tax_amt().abs();
			MCNumber oldAmt = oldR.trd_cur_tax_amt().abs();
	
			if (amt.gt(oldAmt)) {
				return false;
			}
			else if (!isSame(r.pay_tax_amt().signum(), oldR.trd_cur_tax_amt()
					.signum())) {
				//税金額の場合は、old_pay_ctax_amtが0でなくても0を許す。
				if (!r.pay_tax_amt().isZero()) {
					return false;
				}
				else {
					return true;
				}
			}
			return true;
		}

		/**
		 * 金額を反転させる
		 * ※チェック時は反転させる
		 * ※チェック終了時に上り電文の状態に戻す
		 */
		protected void invertNum(DtlApdR upApdR, MST_AP_D_R apdR, MCNumber pm) {
			BiConsumer<MCRow, String> invert = (r, col) -> {
				if (!isNull(r.getNumber(col))) {
					r.setNumber(col, r.getNumber(col).multiply(pm));
				}
			};
			for (String col : new String[]{
					DtlApdR.$pay_amt, DtlApdR.$pay_tax_amt}) {
				invert.accept(upApdR, col);
			}
			for (String col : new String[]{
					MST_AP_D_R.$trd_cur_amt, MST_AP_D_R.$trd_cur_tax_amt}) {
				invert.accept(apdR, col);
			}
			for (String col : new String[]{
					DtlApdR.$pay_proc_amt, DtlApdR.$pay_onr_prov_amt}) {
				invert.accept(upApdR, col);
			}
			for (String col : new String[]{
					MST_AP_D_R.$trd_cur_proc_amt, MST_AP_D_R.$trd_cur_onr_prov_amt}) {
				invert.accept(apdR, col);
			}
		}

		/**
		 * データチェック後にデータを補完する
		 */
		protected void crrctDataAfterDoServerChk() {
			if (hasErr()) {
				return;
			}
			
			AdvPayActCache advActCache = new AdvPayActCache(up2());

			// 支払照合ヘッダ
			if (MAC_DATA_CRUD_TYP.isCRT(up0().data_crud_typ())) {
				up0().purc_act_no(nvl(up0().purc_act_no(), MAC_STR.NULL_VAL.value()));
				up0().rcpt_iv_mng_no(nvl(up0().rcpt_iv_mng_no(), MAC_STR.NULL_VAL.value()));
				up0().rcpt_iv_no(nvl(up0().rcpt_iv_no(), MAC_STR.NULL_VAL.value()));
				up0().wrk_no(nvl(up0().wrk_no(), MAC_STR.NULL_VAL.value()));
			}
			else {
				up0().pay_chk_no(_payChkR.pay_chk_no());
				up0().bsppl_cd(_payChkR.bsppl_cd());
				up0().purc_act_no(_payChkR.purc_act_no());
				up0().rcpt_iv_mng_no(_payChkR.rcpt_iv_mng_no());
				up0().rcpt_iv_no(_payChkR.rcpt_iv_no());
				up0().wrk_no(_payChkR.wrk_no());
				up0().pay_spot_flg(_payChkR.pay_spot_flg());
				up0().trd_cur_cd(_payChkR.trd_cur_cd());
			}
			if (up0().pay_spot_flg()) {
				up0().bsppl_cl_day(null);
				up0().bsppl_cl_dt(null);
			}
			up0().man_reg_flg(true);

			// 買掛明細
			for (DtlApdR r : up1()) {
				if (up0().pay_spot_flg()) {
					r.co_bsppl_cl_day(null);
					r.co_bsppl_cl_dt(null);
				}
				if (_apdL.containsKey(r.ap_d_no())) {
					MST_AP_D_R apdR = _apdL.get(r.ap_d_no());
					r.interim_flg(apdR.interim_flg());
					r.co_ap_d_no(apdR.crryovr_ap_d_no());
					r.co_src_ap_d_no(apdR.crryovr_src_ap_d_no());
				}
			}

			// 支払予定
			for (DtlSchdR r : up2()) {
				// 為替レート
				if (!isNull(r.adv_pay_act_no())) {
					MST_ADV_PAY_ACT_R actR = advActCache.get(r.adv_pay_act_no());
					if (!isNull(actR)) {
						r.xrate(actR.xrate());
					}
				}
				else if (isSame(up0().trd_cur_cd(), getCo().base_cur_cd())) {
					r.xrate(1);
				}

				// 手数料税額
				if (!isNullOr(r.trd_cur_amt(), r.trd_cur_com_paid_tax_cd())) {
					setComPaidTaxAmt(r);
				}

				// 相殺先
				if (MAC_AP_SETOFF_TYP.isBSPPL(r.ap_setoff_typ())) {
					r.setoff_cd(up0().bsppl_cd());
					if (!up0().contains(MST_PAY_SCHD_R.$setoff_nm)) {
						MAVM_BP_NM_R bpR = MAVM_BP_NM_R.create();
						MCQueryApiBuilder bpR_bldr = MCQueryApiBuilder.create(MAVM_BP_NM_R.create("T"));
						dbSelectKey("MSBHL0030_MAVM_BP_NM_S01", bpR, bpR_bldr, up0().bsppl_cd());
						up0().setStringNE(MST_PAY_SCHD_R.$setoff_nm, bpR.bp_nm());
					}
					r.setoff_nm(up0().getStringNE(MST_PAY_SCHD_R.$setoff_nm));
					if (isNull(r.so_dpt_cd())) {
						r.so_dpt_cd(r.ap_dpt_cd());
					}
				}

				// 前渡金実績
				if (!isNull(r.adv_pay_act_no())) {
					r.note_no(null);
					r.note_typ(null);
					r.note_rsn_cd(null);
					r.draw_dt(null);
					r.due_dt(null);
					r.note_days(null);
					r.drawer_nm(null);
					r.draw_bank_cd(null);
					r.draw_branch_cd(null);
					r.endrsr(null);
					r.accptr(null);
				}
			}
		}

		/**
		 * 手数料税額を設定する
		 */
		protected void setComPaidTaxAmt(DtlSchdR r) {
			r.trd_cur_com_paid_tax_amt(MAUCL_AmtUtil.getIncTaxAmt(r.trd_cur_amt(),
					MSBHL_ApUtil.getTax(r.trd_cur_com_paid_tax_cd()).tax_rate(),
					MSBHL_ApUtil.getCur(MAC_DATA_CRUD_TYP.isCRT(up0().data_crud_typ())
							? up0().trd_cur_cd()
							: _payChkR.trd_cur_cd()).amt_dec_place(),
					getCo().com_paid_tax_rnd_typ()));

			r.trd_cur_exc_com_paid(
				r.trd_cur_amt().subtract(r.trd_cur_com_paid_tax_amt())
			);
		}

		/**
		 * 前渡金支払実績のキャッシュ
		 */
		public class AdvPayActCache {
			protected Map<String, MST_ADV_PAY_ACT_R> _map;
			public AdvPayActCache(MCList<DtlSchdR> up2L) {
				init(up2L);
			}
			protected void init(MCList<DtlSchdR> up2L) {
				MCList<DtlSchdR> bindList = up2L.subList(r -> !isNull(r.adv_pay_act_no()));
				if (bindList.isEmpty()){
					return;
				}
	
				_map = new HashMap<>();
				MCList<MST_ADV_PAY_ACT_R> dbc = MCList.create(MST_ADV_PAY_ACT_R.class);
				MST_ADV_PAY_ACT_R t = MST_ADV_PAY_ACT_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				dbc_bldr.setSelect(t.adv_pay_act_no, t.xrate);
				dbc_bldr.setWhere(t.adv_pay_act_no.eq(bind("adv_pay_act_no")));
				dbc_bldr.addConstWhereWithAnd(t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
				dbSelect("MSBHL0030_MST_ADV_PAY_ACT_S01", dbc, dbc_bldr, bindList.groupBy(DtlSchdR.$adv_pay_act_no), null);

				dbc.forEach(r -> _map.put(r.adv_pay_act_no(), r));
			}
			protected MST_ADV_PAY_ACT_R get(String payActNo) {
				return _map.get(payActNo);
			}
		}

		/**
		 * 支払予定登録サービスの登録・更新前チェック処理を実行する
		 */
		protected void callPaySchdChk01() {
			MSBHL_PaySchdRegService.PaySchd_Chk01 o = MSBHL_PaySchdRegService.crtPaySchd_Chk01();
			copy(o.up0().add(), up0(), createMap_PaySchd_HdrR_HdrR());
			setAll(o.up1(), up1(), createMap_PaySchd_DtlApdR_DtlApdR());
			setAll(o.up2(), up2(), createMap_PaySchd_DtlSchdR_DtlSchdR());
			setAll(o.up3(), up3(), createMap_PaySchd_DtlActR_DtlPayActR());
			setAll(o.up4(), up4(), createMap_PaySchd_AdvPayActR_DtlAdvPayActR());
			o.exec();

			up0().err_flg(o.down0().get(0).err_flg());
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			MCRow.copyvalue(down0(), up0());
			down1().setAll(up1());
			down2().setAll(up2());
			down3().setAll(up3());
			down4().setAll(up4());
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 支払照合、支払予定情報の取り消しが可能かチェックする。<br>
	 */
	public class Chk02 extends MSBHL_PaySchdReg_MC_A.Chk02 {

		/**
		 * 支払照合
		 */
		protected MST_PAY_CHK_R _payChkR;

		/**
		 * 買掛明細
		 */
		protected Map<String, MST_AP_D_R> _apdL;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void initUpSub() {
			super.initUpSub();

			_payChkR = MST_PAY_CHK_R.create();
			_apdL = new HashMap<>();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (!hasErr()) {
				callPaySchdLock(up0());
				callPaySchdChk02();
			}
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 更新カウンタチェック
			msgL.addAll(chkUpdCntrPahChk());
			msgL.addAll(chkUpdCntrApd());

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			// データ補完
			crrctDataAfterDoServerChk();

			// DACチェック
			msgL.addAll(chkBspplDptDacCmm(up0()));

			return msgL;
		}

		/**
		 * 支払照合に対する更新カウンタチェック
		 */
		protected MCMessageList chkUpdCntrPahChk() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(chkUpdCntrPahChkCmm(up0(), _payChkR));
			return msgL;
		}

		/**
		 * 買掛明細に対する更新カウンタチェック
		 */
		protected MCMessageList chkUpdCntrApd() {
			if (hasErrFlgOn(up0())) {
				// 支払照合の更新カウンタチェックでエラーの場合はチェックしない
				return null;
			}

			MCMessageList msgL = new MCMessageList();
			msgL.addAll(chkUpdCntrApdCmm(up1(), _apdL));
			return msgL;
		}

		/**
		 * データチェック後にデータを補完する
		 */
		protected void crrctDataAfterDoServerChk() {
			if (hasErrFlgOn(up0())) {
				return;
			}

			// 支払照合ヘッダ
			up0().bsppl_cd(_payChkR.bsppl_cd());
			up0().bsppl_dpt_cd(_payChkR.bsppl_dpt_cd());
			up0().purc_act_no(_payChkR.purc_act_no());
			up0().rcpt_iv_mng_no(_payChkR.rcpt_iv_mng_no());
			up0().rcpt_iv_no(_payChkR.rcpt_iv_no());
			up0().wrk_no(_payChkR.wrk_no());
			up0().trd_cur_cd(_payChkR.trd_cur_cd());

			// 買掛明細
			for (DtlApdR r : up1()) {
				MST_AP_D_R apdR = _apdL.get(r.ap_d_no());
				r.co_ap_d_no(apdR.crryovr_ap_d_no());
				r.co_src_ap_d_no(apdR.crryovr_src_ap_d_no());
			}
		}

		/**
		 * 支払予定登録サービスの削除前チェック処理を実行する
		 */
		protected void callPaySchdChk02() {
			MSBHL_PaySchdRegService.PaySchd_Chk02 o = MSBHL_PaySchdRegService.crtPaySchd_Chk02();
			copy(o.up0().add(), up0(), createMap_PaySchd_HdrR_HdrR());
			setAll(o.up1(), up2(), createMap_PaySchd_DtlSchdR_DtlSchdR());
			o.exec();

			up0().err_flg(o.down0().get(0).err_flg());
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			MCRow.copyvalue(down0(), up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
	}

	/**
	 * Chk03オペレーション.<p>
	 *
	 * 支払予定明細、支払通知書が発行可能かチェックする。<br>
	 */
	public class Chk03 extends MSBHL_PaySchdReg_MC_A.Chk03 {

		/**
		 * 支払照合
		 */
		protected MST_PAY_CHK_R _payChkR;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void initUpSub() {
			super.initUpSub();

			_payChkR = MST_PAY_CHK_R.create();
		}

		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 更新カウンタチェック
			msgL.addAll(chkUpdCntrPahChk());

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			// データ補完
			crrctDataAfterDoServerChk();

			// DACチェック
			msgL.addAll(chkBspplDptDacCmm(up0()));

			return msgL;
		}

		/**
		 * 支払照合に対する更新カウンタチェック
		 */
		protected MCMessageList chkUpdCntrPahChk() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(chkUpdCntrPahChkCmm(up0(), _payChkR));
			return msgL;
		}

		/**
		 * データチェック後にデータを補完する
		 */
		protected void crrctDataAfterDoServerChk() {
			if (hasErrFlgOn(up0())) {
				return;
			}

			// 支払照合ヘッダ
			up0().pay_chk_no(_payChkR.pay_chk_no());
			up0().bsppl_dpt_cd(_payChkR.bsppl_dpt_cd());
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			MCRow.copyvalue(down0(), up0());
		}
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 支払照合、支払予定情報を新規登録する。<br>
	 */
	public class Ins01 extends MSBHL_PaySchdReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk01();
			throwUpdErr();
			callPaySchdIns01();
			execPayNtcPrnt(up0());
			setDown();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			up0().hdr_peg_no(1);
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());

			up1().forEach(r -> {
				r.hdr_peg_no(up0().hdr_peg_no());
				r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			});

			up2().forEach(r -> {
				r.hdr_peg_no(up0().hdr_peg_no());
				r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			});

			up3().forEach(r -> {
				r.hdr_peg_no(up0().hdr_peg_no());
			});

			up4().forEach(r -> {
				r.hdr_peg_no(up0().hdr_peg_no());
			});

			setPegNo(up1(), up2(), up3(), up4());
		}

		/**
		 * 登録・更新前チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBHL_PaySchdReg.Chk01 o = MSBHL_PaySchdReg.crtChk01();
			MCRow.copyvalue(o.up0(), up0());
			o.up1().setAll(up1());
			o.up2().setAll(up2());
			o.up3().setAll(up3());
			o.up4().setAll(up4());
			o.exec();
			MCRow.copyall(up0(), o.down0());
			up1().setAll(o.down1());
			up2().setAll(o.down2());
			up3().setAll(o.down3());
		}

		/**
		 * 支払予定登録サービスの登録処理を実行する
		 */
		protected void callPaySchdIns01() {
			MSBHL_PaySchdRegService.PaySchd_Ins01 o = MSBHL_PaySchdRegService.crtPaySchd_Ins01();
			copy(o.up0().add(), up0(), createMap_PaySchd_HdrR_HdrR());
			setAll(o.up1(), up1(), createMap_PaySchd_DtlApdR_DtlApdR());
			setAll(o.up2(), up2(), createMap_PaySchd_DtlSchdR_DtlSchdR());
			setAll(o.up3(), up3(), createMap_PaySchd_DtlActR_DtlPayActR());
			setAll(o.up4(), up4(), createMap_PaySchd_AdvPayActR_DtlAdvPayActR());
			o.exec();

			up0().setValues(
				new String[]{
					HdrR.$pay_chk_no, HdrR.$pay_chk_mng_no,
					HdrR.$pay_ntc_rev, HdrR.$aprv_flg,
					HdrR.$aprv_no,	HdrR.$aprv_sts_typ,
					HdrR.$pay_sts_typ
				},
				o.down0().get(0),
				new String[]{
					PaySchd_HdrR.$pay_chk_no, PaySchd_HdrR.$pay_chk_mng_no,
					PaySchd_HdrR.$pay_ntc_rev, PaySchd_HdrR.$aprv_flg,
					PaySchd_HdrR.$aprv_no,	PaySchd_HdrR.$aprv_sts_typ,
					PaySchd_HdrR.$pay_sts_typ
				}
			);
			copyByPegNo(
				up1(), new String[]{DtlApdR.$ap_d_no},
				o.down1(), new String[]{PaySchd_DtlApdR.$ap_d_no});
			copyByPegNo(
				up2(), new String[]{DtlSchdR.$pay_schd_no},
				o.down2(), new String[]{PaySchd_DtlSchdR.$pay_schd_no});
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			MCRow.copyvalue(down0(), up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 支払照合、支払予定情報を更新する。<br>
	 */
	public class Upd01 extends MSBHL_PaySchdReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk01();
			throwUpdErr();
			callPaySchdUpd01();
			execPayNtcPrnt(up0());
			setDown();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			up0().hdr_peg_no(1);
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());

			Function<MCRow, String> crud = r -> {
				if (r.isStatusCreate()) {
					return MAC_DATA_CRUD_TYP.CRT.value();
				}
				else if (r.isStatusDelete()) {
					return MAC_DATA_CRUD_TYP.DEL.value();
				}
				else {
					return MAC_DATA_CRUD_TYP.UPD.value();
				}
			};

			up1().forEach(r -> {
				r.hdr_peg_no(up0().hdr_peg_no());
				r.data_crud_typ(crud.apply(r));
			});

			up2().forEach(r -> {
				r.hdr_peg_no(up0().hdr_peg_no());
				r.data_crud_typ(crud.apply(r));
			});

			up3().forEach(r -> {
				r.hdr_peg_no(up0().hdr_peg_no());
			});

			up4().forEach(r -> {
				r.hdr_peg_no(up0().hdr_peg_no());
			});

			setPegNo(up1(), up2(), up3(), up4());
		}

		/**
		 * 登録・更新前チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBHL_PaySchdReg.Chk01 o = MSBHL_PaySchdReg.crtChk01();
			MCRow.copyvalue(o.up0(), up0());
			o.up1().setAll(up1());
			o.up2().setAll(up2());
			o.up3().setAll(up3());
			o.up4().setAll(up4());
			o.exec();
			MCRow.copyall(up0(), o.down0());
			up1().setAll(o.down1());
			up2().setAll(o.down2());
			up3().setAll(o.down3());
			
		}

		/**
		 * 支払予定登録サービスの更新処理を実行する
		 */
		protected void callPaySchdUpd01() {
			MSBHL_PaySchdRegService.PaySchd_Upd01 o = MSBHL_PaySchdRegService.crtPaySchd_Upd01();
			copy(o.up0().add(), up0(), createMap_PaySchd_HdrR_HdrR());
			setAll(o.up1(), up1(), createMap_PaySchd_DtlApdR_DtlApdR());
			setAll(o.up2(), up2(), createMap_PaySchd_DtlSchdR_DtlSchdR());
			setAll(o.up3(), up3(), createMap_PaySchd_DtlActR_DtlPayActR());
			setAll(o.up4(), up4(), createMap_PaySchd_AdvPayActR_DtlAdvPayActR());
			o.exec();

			up0().setValues(
				new String[]{
					HdrR.$aprv_flg, HdrR.$aprv_no,
					HdrR.$pay_ntc_rev, HdrR.$aprv_sts_typ,
					HdrR.$pay_sts_typ
				},
				o.down0().get(0),
				new String[]{
					PaySchd_HdrR.$aprv_flg, PaySchd_HdrR.$aprv_no,
					PaySchd_HdrR.$pay_ntc_rev, PaySchd_HdrR.$aprv_sts_typ,
					PaySchd_HdrR.$pay_sts_typ
				}
			);
			copyByPegNo(
				up1(), new String[]{PaySchd_DtlApdR.$ap_d_no},
				o.down1(), new String[]{PaySchd_DtlApdR.$ap_d_no});
			copyByPegNo(
				up2(), new String[]{PaySchd_DtlSchdR.$pay_schd_no},
				o.down2(), new String[]{PaySchd_DtlSchdR.$pay_schd_no});
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			MCRow.copyvalue(down0(), up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 支払照合、支払予定情報を取り消す。<br>
	 */
	public class Del01 extends MSBHL_PaySchdReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk02();
			throwUpdErr();
			callPaySchdDel01();
			setDown();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			up0().hdr_peg_no(1);
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());

			up1().forEach(r -> {
				r.hdr_peg_no(up0().hdr_peg_no());
				r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			});

			up2().forEach(r -> {
				r.hdr_peg_no(up0().hdr_peg_no());
				r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			});

			setPegNo(up1(), up2());
		}

		/**
		 * 登録・更新前チェック処理を実行する
		 */
		protected void callThisChk02() {
			MSBHL_PaySchdReg.Chk02 o = MSBHL_PaySchdReg.crtChk02();
			MCRow.copyvalue(o.up0(), up0());
			o.up1().setAll(up1());
			o.up2().setAll(up2());
			o.exec();
			MCRow.copyall(up0(), o.down0());
			up1().setAll(o.down1());
			up2().setAll(o.down2());
		}

		/**
		 * 支払予定登録サービスの削除処理を実行する
		 */
		protected void callPaySchdDel01() {
			MSBHL_PaySchdRegService.PaySchd_Del01 o = MSBHL_PaySchdRegService.crtPaySchd_Del01();
			copy(o.up0().add(), up0(), createMap_PaySchd_HdrR_HdrR());
			setAll(o.up1(), up1(), createMap_PaySchd_DtlApdR_DtlApdR());
			setAll(o.up2(), up2(), createMap_PaySchd_DtlSchdR_DtlSchdR());
			o.exec();
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
		}
	}

	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 支払予定明細、支払通知書を発行する。<br>
	 */
	public class Prnt01 extends MSBHL_PaySchdReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			if (up0().pay_schd_dtl_prnt_flg()) {
				callThisChk03();
				throwErr(msgPrintErr());
				callApPrntPrnt02();
			}
			else if (up0().pay_ntc_prnt_flg()) {
				callApPrntPrnt03();
			}
			setDown();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			up0().hdr_peg_no(1);
		}

		/**
		 * 帳票発行前チェック処理を実行する
		 */
		protected void callThisChk03() {
			MSBHL_PaySchdReg.Chk03 o = MSBHL_PaySchdReg.crtChk03();
			MCRow.copyvalue(o.up0(), up0());
			o.exec();
			MCRow.copyall(up0(), o.down0());
		}

		/**
		 * 債務帳票発行サービスの支払予定明細発行処理を実行する
		 */
		protected void callApPrntPrnt02() {
			MSBHL_ApPrntService.ApPrnt_Prnt02 o = MSBHL_ApPrntService.crtApPrnt_Prnt02();
			ApPrnt_Prnt02_HdrR hdrR = o.up0().add();
			hdrR.pay_chk_no(up0().pay_chk_no());
			hdrR.setAttributes(up0());
			o.exec();
		}

		/**
		 * 債務帳票発行サービスの支払通知書発行処理を実行する
		 */
		protected void callApPrntPrnt03() {
			MSBHL_ApPrntService.ApPrnt_Prnt03 o = MSBHL_ApPrntService.crtApPrnt_Prnt03();
			ApPrnt_Prnt03_HdrR hdrR = o.up0().add();
			hdrR.pay_chk_no(up0().pay_chk_no());
			hdrR.setAttributes(up0());
			o.up1().indiv_prnt_flg(true);
			o.exec();
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
		}
	}

	protected void setValuesDbc(MCRow upR, MCList<? extends MCConstRow> down) {
		if (down.createRow() instanceof Srch01_RsltChkR) {
			setValuesDbc(MSBHL0030_Srch01_RsltChkR_J01(), upR, down);
		}
		else if (down.createRow() instanceof Srch01_RsltApdR) {
			setValuesDbc(MSBHL0030_Srch01_RsltApdR_J01(), upR, down);
			initDbcCache(upR, down);
		}
		else if (down.createRow() instanceof Srch01_RsltSchdR) {
			setValuesDbc(MSBHL0030_Srch01_RsltSchdR_J01(), upR, down);
		}
		
		if (down.createRow() instanceof PaySchd_Srch03_RsltR) {
			initDbcCache(upR, down);
		}

	}
	
	protected void initDbcCache(MCRow upR, MCList<? extends MCConstRow> down) {
		initDbcCacheItm(down);
	}
	protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItm;
	protected void initDbcCacheItm(MCList<? extends MCConstRow> down) {

		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder itm_bldr = MCQueryApiBuilder.create(t);
		itm_bldr.setSelect(t.dscnt_itm_flg);
		itm_bldr.addSelect(t.itm_nm);
		_cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(itm_bldr, down, "itm_cd", "itm_sub1", "itm_sub2", "itm_sub3");
	}

	/**
	 * 支払照合に対する更新カウンタチェック
	 */
	protected MCMessageList chkUpdCntrPahChkCmm(HdrR up0R, MST_PAY_CHK_R payChkR) {

		MCMessageList msgL = new MCMessageList();
		MCQueryApiBuilder payChkR_bldr = MCQueryApiBuilder.create(MST_PAY_CHK_R.create("T"));
		dbSelectKeyForUpdateNoWait("MSBHL0030_MST_PAY_CHK_S01", payChkR, payChkR_bldr, up0R);

		msgL.addAll(checkUpdCntrNE(up0R, HdrR.$pay_chk_upd_cntr, payChkR));
		setErrFlgCmm(up0R, msgL);

		return msgL;
	}

	/**
	 * 買掛明細に対する更新カウンタチェック
	 */
	protected MCMessageList chkUpdCntrApdCmm(MCList<DtlApdR> up1L, Map<String, MST_AP_D_R> apdL) {

		MCMessageList msgL = new MCMessageList();

		MCList<DtlApdR> cndL = up1L.subList(r -> !isNull(r.ap_d_no()));
		cndL.sort(DtlApdR.$ap_d_no);

		MCList<MST_AP_D_R> dbc = MCList.create(MST_AP_D_R.class);
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_AP_D_R.create("T"));
		dbc_bldr.setOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
		dbSelectKeyForUpdateNoWait("MSBHL0030_MST_AP_D_S02", dbc, dbc_bldr, cndL);

		// 買掛明細を退避
		dbc.forEach(r -> apdL.put(r.ap_d_no(), r));

		for (DtlApdR r : cndL) {
			MST_AP_D_R lockR = apdL.get(r.ap_d_no());
			msgL.addAll(
				checkUpdCntrNE(r, DtlApdR.$ap_d_upd_cntr, lockR));
			setErrFlgCmm(r, msgL);
		}
		return msgL;
	}

	/**
	 * 支払予定管理先部門に対するDACチェック
	 */
	protected MCMessageList chkBspplDptDacCmm(HdrR up0R) {
		MCMessageList msgL = new MCMessageList();
		msgL.addAll(checkWritableDptCdDac(up0R, HdrR.$bsppl_dpt_cd));
		return msgL;
	}

	/**
	 * 支払予定をロックする
	 */
	protected void callPaySchdLock(HdrR up0R) {
		MSBHL_PaySchdRegService.PaySchd_Lock_Upd01 o = MSBHL_PaySchdRegService.crtPaySchd_Lock_Upd01();
		MST_PAY_SCHD_LOCK_R r = o.up0().add();
		r.bsppl_cd(up0R.bsppl_cd());
		r.bsppl_dpt_cd(up0R.bsppl_dpt_cd());
		r.purc_act_no(up0R.purc_act_no());
		r.rcpt_iv_mng_no(up0R.rcpt_iv_mng_no());
		r.rcpt_iv_no(up0R.rcpt_iv_no());
		r.wrk_no(up0R.wrk_no());
		r.trd_cur_cd(up0R.trd_cur_cd());
		o.exec();
	}

	/**
	 * 支払通知書発行
	 * @param prtR 支払通知書発行データ
	 */
	protected void execPayNtcPrnt(HdrR prtR) {
		if (!prtR.prnt_out_flg()) {
			return;
		}
		
		MAM_BP_R bpR = MAM_BP_R.create();
		MAM_BP_R t = MAM_BP_R.create("T");
		MCQueryApiBuilder bpR_bldr = MCQueryApiBuilder.create(t);
		bpR_bldr.setSelect(t.bp_cd);
		bpR_bldr.addSelect(t.pay_ntc_prnt_flg);
		bpR_bldr.setWhere(t.bp_cd.eq(bind("bsppl_cd")));
		dbSelect("MSBHL0030_MAM_BP_S01", bpR, bpR_bldr, prtR);
		
		// 支払通知書発行対象の場合、支払通知書を発行する
		if (!isNull(bpR) && bpR.pay_ntc_prnt_flg()) {
			MSBHL_ApPrntService.ApPrnt_Prnt03 ope = MSBHL_ApPrntService.crtApPrnt_Prnt03();
			ApPrnt_Prnt03_HdrR hdrR = ApPrnt_Prnt03_HdrR.create();
			hdrR.pay_chk_no(prtR.pay_chk_no());
			ope.up0().add(hdrR);
			ope.up1().indiv_prnt_flg(true);
			ope.exec();
		}
	}

	protected Map_PaySchd_HdrR_HdrR<PaySchd_HdrR,HdrR> createMap_PaySchd_HdrR_HdrR() {
		return new Map_PaySchd_HdrR_HdrR<PaySchd_HdrR, HdrR>();
	}
	public class Map_PaySchd_HdrR_HdrR<D extends PaySchd_HdrR, S extends HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PaySchd_HdrR.$hdr_peg_no, HdrR.$hdr_peg_no);
			addColumnPathMap(PaySchd_HdrR.$data_crud_typ, HdrR.$data_crud_typ);
			addColumnPathMap(PaySchd_HdrR.$pay_chk, HdrR.$pay_chk);
			addColumnPathMap(PaySchd_HdrR.$aprv_rvrs_flg, HdrR.$aprv_rvrs_flg);
			addColumnPathMap(PaySchd_HdrR.$pay_xrate, HdrR.$pay_xrate);
		}
	}
	protected Map_PaySchd_DtlApdR_DtlApdR<PaySchd_DtlApdR,DtlApdR> createMap_PaySchd_DtlApdR_DtlApdR() {
		return new Map_PaySchd_DtlApdR_DtlApdR<PaySchd_DtlApdR, DtlApdR>();
	}
	public class Map_PaySchd_DtlApdR_DtlApdR<D extends PaySchd_DtlApdR, S extends DtlApdR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PaySchd_DtlApdR.$hdr_peg_no, DtlApdR.$hdr_peg_no);
			addColumnPathMap(PaySchd_DtlApdR.$peg_no, DtlApdR.$peg_no);
			addColumnPathMap(PaySchd_DtlApdR.$data_crud_typ, DtlApdR.$data_crud_typ);
			addColumnPathMap(PaySchd_DtlApdR.$pay_mtd_typ, DtlApdR.$pay_mtd_typ);
			addColumnPathMap(PaySchd_DtlApdR.$pay_crryovr_times, DtlApdR.$crryovr_times);
			addColumnPathMap(PaySchd_DtlApdR.$co_psppl_cl_day, DtlApdR.$co_bsppl_cl_day);
			addColumnPathMap(PaySchd_DtlApdR.$co_psppl_cl_dt, DtlApdR.$co_bsppl_cl_dt);
			addColumnPathMap(PaySchd_DtlApdR.$ap_d, DtlApdR.$ap_d);
			addColumnPathMap(PaySchd_DtlApdR.$co_ap_d_no, DtlApdR.$co_ap_d_no);
			addColumnPathMap(PaySchd_DtlApdR.$co_src_ap_d_no, DtlApdR.$co_src_ap_d_no);
			addColumnPathMap(PaySchd_DtlApdR.$pay_amt, DtlApdR.$pay_amt);
			addColumnPathMap(PaySchd_DtlApdR.$pay_tax_amt, DtlApdR.$pay_tax_amt);
			addColumnPathMap(PaySchd_DtlApdR.$pay_wtax_amt, DtlApdR.$pay_wtax_amt);
			addColumnPathMap(PaySchd_DtlApdR.$ref_ap_d_no, DtlApdR.$ref_ap_d_no);
			addColumnPathMap(PaySchd_DtlApdR.$repurc_obli_flg, DtlApdR.$repurc_obli_flg);
			addColumnPathMap(PaySchd_DtlApdR.$pay_proc_amt, DtlApdR.$pay_proc_amt);
			addColumnPathMap(PaySchd_DtlApdR.$pay_onr_prov_amt, DtlApdR.$pay_onr_prov_amt);
		}
	}
	protected Map_PaySchd_DtlSchdR_DtlSchdR<PaySchd_DtlSchdR,DtlSchdR> createMap_PaySchd_DtlSchdR_DtlSchdR() {
		return new Map_PaySchd_DtlSchdR_DtlSchdR<PaySchd_DtlSchdR, DtlSchdR>();
	}
	public class Map_PaySchd_DtlSchdR_DtlSchdR<D extends PaySchd_DtlSchdR, S extends DtlSchdR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PaySchd_DtlSchdR.$hdr_peg_no, DtlSchdR.$hdr_peg_no);
			addColumnPathMap(PaySchd_DtlSchdR.$peg_no, DtlSchdR.$peg_no);
			addColumnPathMap(PaySchd_DtlSchdR.$data_crud_typ, DtlSchdR.$data_crud_typ);
			addColumnPathMap(PaySchd_DtlSchdR.$pay_schd, DtlSchdR.$pay_schd);
			addColumnPathMap(PaySchd_DtlSchdR.$can_ac_dt, DtlSchdR.$can_ac_dt);
		}
	}
	protected Map_PaySchd_DtlActR_DtlPayActR<PaySchd_DtlActR,DtlPayActR> createMap_PaySchd_DtlActR_DtlPayActR() {
		return new Map_PaySchd_DtlActR_DtlPayActR<PaySchd_DtlActR, DtlPayActR>();
	}
	public class Map_PaySchd_DtlActR_DtlPayActR<D extends PaySchd_DtlActR, S extends DtlPayActR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PaySchd_DtlActR.$hdr_peg_no, DtlPayActR.$hdr_peg_no);
			addColumnPathMap(PaySchd_DtlActR.$pay_act_d, DtlPayActR.$pay_act_d);
			addColumnPathMap(PaySchd_DtlActR.$pay_chk, DtlPayActR.$pay_chk);
		}
	}
	protected Map_PaySchd_AdvPayActR_PaySchd_AdvPayActR<PaySchd_AdvPayActR,PaySchd_AdvPayActR> createMap_PaySchd_AdvPayActR_PaySchd_AdvPayActR() {
		return new Map_PaySchd_AdvPayActR_PaySchd_AdvPayActR<PaySchd_AdvPayActR, PaySchd_AdvPayActR>();
	}
	public class Map_PaySchd_AdvPayActR_PaySchd_AdvPayActR<D extends PaySchd_AdvPayActR, S extends PaySchd_AdvPayActR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PaySchd_AdvPayActR.$hdr_peg_no, PaySchd_AdvPayActR.$hdr_peg_no);
			addColumnPathMap(PaySchd_AdvPayActR.$adv_pay_act, PaySchd_AdvPayActR.$adv_pay_act);
			addColumnPathMap(PaySchd_AdvPayActR.$pay_chk, PaySchd_AdvPayActR.$pay_chk);
		}
	}
	protected Map_PaySchd_AdvPayActR_DtlAdvPayActR<PaySchd_AdvPayActR,DtlAdvPayActR> createMap_PaySchd_AdvPayActR_DtlAdvPayActR() {
		return new Map_PaySchd_AdvPayActR_DtlAdvPayActR<PaySchd_AdvPayActR, DtlAdvPayActR>();
	}
	public class Map_PaySchd_AdvPayActR_DtlAdvPayActR<D extends PaySchd_AdvPayActR, S extends DtlAdvPayActR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PaySchd_AdvPayActR.$hdr_peg_no, DtlAdvPayActR.$hdr_peg_no);
			addColumnPathMap(PaySchd_AdvPayActR.$adv_pay_act, DtlAdvPayActR.$adv_pay_act);
		}
	}
	protected Map_Srch01_RsltActR_PaySchd_Srch07_RsltR<Srch01_RsltActR,PaySchd_Srch07_RsltR> createMap_Srch01_RsltActR_PaySchd_Srch07_RsltR() {
		return new Map_Srch01_RsltActR_PaySchd_Srch07_RsltR<Srch01_RsltActR, PaySchd_Srch07_RsltR>();
	}
	public class Map_Srch01_RsltActR_PaySchd_Srch07_RsltR<D extends Srch01_RsltActR, S extends PaySchd_Srch07_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch01_RsltActR.$ac_dt, PaySchd_Srch07_RsltR.$ac_dt);
			addColumnPathMap(Srch01_RsltActR.$ac_ym, PaySchd_Srch07_RsltR.$ac_ym);
			addColumnPathMap(Srch01_RsltActR.$slip_sts_typ, PaySchd_Srch07_RsltR.$slip_sts_typ);
			addColumnPathMap(Srch01_RsltActR.$slip_sts_typ_nm, PaySchd_Srch07_RsltR.$slip_sts_typ_nm);
			addColumnPathMap(Srch01_RsltActR.$ap_sttl_typ, PaySchd_Srch07_RsltR.$ap_sttl_typ);
			addColumnPathMap(Srch01_RsltActR.$ap_sttl_typ_nm, PaySchd_Srch07_RsltR.$ap_sttl_typ_nm);
			addColumnPathMap(Srch01_RsltActR.$pay_act_no, PaySchd_Srch07_RsltR.$pay_act_no);
			addColumnPathMap(Srch01_RsltActR.$pay_act_rev, PaySchd_Srch07_RsltR.$pay_act_rev);
			addColumnPathMap(Srch01_RsltActR.$pay_act_d_no, PaySchd_Srch07_RsltR.$pay_act_d_no);
			addColumnPathMap(Srch01_RsltActR.$pay_act_d_seq, PaySchd_Srch07_RsltR.$pay_act_d_seq);
			addColumnPathMap(Srch01_RsltActR.$calc_tgt_pay_chk_mng_no, PaySchd_Srch07_RsltR.$calc_tgt_pay_chk_mng_no);
			addColumnPathMap(Srch01_RsltActR.$pay_act_dt, PaySchd_Srch07_RsltR.$pay_act_dt);
			addColumnPathMap(Srch01_RsltActR.$pay_basis_dt, PaySchd_Srch07_RsltR.$pay_basis_dt);
			addColumnPathMap(Srch01_RsltActR.$trd_cur_amt, PaySchd_Srch07_RsltR.$trd_cur_amt);
			addColumnPathMap(Srch01_RsltActR.$trd_cur_com_paid, PaySchd_Srch07_RsltR.$trd_cur_com_paid);
			addColumnPathMap(Srch01_RsltActR.$trd_cur_com_paid_tax_amt, PaySchd_Srch07_RsltR.$trd_cur_com_paid_tax_amt);
			addColumnPathMap(Srch01_RsltActR.$trd_cur_com_paid_tax_cd, PaySchd_Srch07_RsltR.$trd_cur_com_paid_tax_cd);
			addColumnPathMap(Srch01_RsltActR.$trd_cur_com_paid_tax_nm, PaySchd_Srch07_RsltR.$trd_cur_com_paid_tax_nm);
			addColumnPathMap(Srch01_RsltActR.$trd_cur_com_paid_tax_rate, PaySchd_Srch07_RsltR.$trd_cur_com_paid_tax_rate);
			addColumnPathMap(Srch01_RsltActR.$xrate, PaySchd_Srch07_RsltR.$xrate);
			addColumnPathMap(Srch01_RsltActR.$base_cur_amt, PaySchd_Srch07_RsltR.$base_cur_amt);
			addColumnPathMap(Srch01_RsltActR.$base_cur_com_paid, PaySchd_Srch07_RsltR.$base_cur_com_paid);
			addColumnPathMap(Srch01_RsltActR.$base_cur_com_paid_tax_amt, PaySchd_Srch07_RsltR.$base_cur_com_paid_tax_amt);
			addColumnPathMap(Srch01_RsltActR.$trd_d_rmrks, PaySchd_Srch07_RsltR.$trd_d_rmrks);
			addColumnPathMap(Srch01_RsltActR.$intr_d_rmrks, PaySchd_Srch07_RsltR.$intr_d_rmrks);
			addColumnPathMap(Srch01_RsltActR.$bill_tax_disp_flg, PaySchd_Srch07_RsltR.$bill_tax_disp_flg);
			addColumnPathMap(Srch01_RsltActR.$pay_act_upd_cntr, PaySchd_Srch07_RsltR.$pay_act_upd_cntr);
		}
	}
	protected Map_Srch01_RsltAdvPayActR_PaySchd_Srch08_RsltR<Srch01_RsltAdvPayActR,PaySchd_Srch08_RsltR> createMap_Srch01_RsltAdvPayActR_PaySchd_Srch08_RsltR() {
		return new Map_Srch01_RsltAdvPayActR_PaySchd_Srch08_RsltR<Srch01_RsltAdvPayActR, PaySchd_Srch08_RsltR>();
	}

	public class Map_Srch01_RsltAdvPayActR_PaySchd_Srch08_RsltR<D extends Srch01_RsltAdvPayActR, S extends PaySchd_Srch08_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch01_RsltAdvPayActR.$ac_dt, PaySchd_Srch08_RsltR.$ac_dt);
			addColumnPathMap(Srch01_RsltAdvPayActR.$pay_act_dt, PaySchd_Srch08_RsltR.$pay_act_dt);
			addColumnPathMap(Srch01_RsltAdvPayActR.$slip_sts_typ, PaySchd_Srch08_RsltR.$slip_sts_typ);
			addColumnPathMap(Srch01_RsltAdvPayActR.$slip_sts_typ_nm, PaySchd_Srch08_RsltR.$slip_sts_typ_nm);
			addColumnPathMap(Srch01_RsltAdvPayActR.$ap_sttl_typ, PaySchd_Srch08_RsltR.$ap_sttl_typ);
			addColumnPathMap(Srch01_RsltAdvPayActR.$ap_sttl_typ_nm, PaySchd_Srch08_RsltR.$ap_sttl_typ_nm);
			addColumnPathMap(Srch01_RsltAdvPayActR.$trd_cur_amt, PaySchd_Srch08_RsltR.$trd_cur_amt);
			addColumnPathMap(Srch01_RsltAdvPayActR.$com_paid_ap_sttl_typ, PaySchd_Srch08_RsltR.$com_paid_ap_sttl_typ);
			addColumnPathMap(Srch01_RsltAdvPayActR.$com_paid_ap_sttl_typ_nm, PaySchd_Srch08_RsltR.$com_paid_ap_sttl_typ_nm);
			addColumnPathMap(Srch01_RsltAdvPayActR.$trd_cur_com_paid, PaySchd_Srch08_RsltR.$trd_cur_com_paid);
			addColumnPathMap(Srch01_RsltAdvPayActR.$trd_cur_com_paid_tax_amt, PaySchd_Srch08_RsltR.$trd_cur_com_paid_tax_amt);
			addColumnPathMap(Srch01_RsltAdvPayActR.$trd_cur_com_paid_tax_cd, PaySchd_Srch08_RsltR.$trd_cur_com_paid_tax_cd);
			addColumnPathMap(Srch01_RsltAdvPayActR.$trd_cur_com_paid_tax_nm, PaySchd_Srch08_RsltR.$trd_cur_com_paid_tax_nm);
			addColumnPathMap(Srch01_RsltAdvPayActR.$trd_cur_com_paid_tax_rate, PaySchd_Srch08_RsltR.$trd_cur_com_paid_tax_rate);
			addColumnPathMap(Srch01_RsltAdvPayActR.$xrate, PaySchd_Srch08_RsltR.$xrate);
			addColumnPathMap(Srch01_RsltAdvPayActR.$base_cur_amt, PaySchd_Srch08_RsltR.$base_cur_amt);
			addColumnPathMap(Srch01_RsltAdvPayActR.$base_cur_com_paid, PaySchd_Srch08_RsltR.$base_cur_com_paid);
			addColumnPathMap(Srch01_RsltAdvPayActR.$base_cur_com_paid_tax_amt, PaySchd_Srch08_RsltR.$base_cur_com_paid_tax_amt);
			addColumnPathMap(Srch01_RsltAdvPayActR.$pay_dpt_cd, PaySchd_Srch08_RsltR.$pay_dpt_cd);
			addColumnPathMap(Srch01_RsltAdvPayActR.$pay_dpt_nm, PaySchd_Srch08_RsltR.$pay_dpt_nm);
			addColumnPathMap(Srch01_RsltAdvPayActR.$bsppl_dpt_cd, PaySchd_Srch08_RsltR.$bsppl_dpt_cd);
			addColumnPathMap(Srch01_RsltAdvPayActR.$bsppl_dpt_nm, PaySchd_Srch08_RsltR.$bsppl_dpt_nm);
			addColumnPathMap(Srch01_RsltAdvPayActR.$bd_dpt_cd, PaySchd_Srch08_RsltR.$bd_dpt_cd);
			addColumnPathMap(Srch01_RsltAdvPayActR.$bd_dpt_nm, PaySchd_Srch08_RsltR.$bd_dpt_nm);
			addColumnPathMap(Srch01_RsltAdvPayActR.$adv_pay_act_no, PaySchd_Srch08_RsltR.$adv_pay_act_no);
			addColumnPathMap(Srch01_RsltAdvPayActR.$adv_pay_act_rev, PaySchd_Srch08_RsltR.$adv_pay_act_rev);
			addColumnPathMap(Srch01_RsltAdvPayActR.$adv_pay_act_seq, PaySchd_Srch08_RsltR.$adv_pay_act_seq);
			addColumnPathMap(Srch01_RsltAdvPayActR.$pay_chk_mng_no, PaySchd_Srch08_RsltR.$pay_chk_mng_no);
			addColumnPathMap(Srch01_RsltAdvPayActR.$adv_pay_upd_cntr, PaySchd_Srch08_RsltR.$adv_pay_upd_cntr);
		}
	}

	//FMCB CUSTOM END
}