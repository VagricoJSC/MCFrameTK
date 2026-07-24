package mcframe.clientMGBF.MGBFP0220;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;

import mcframe.clientFXBA.FXBAP0130.*;
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMGUB.MGUBP0010.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import static mcframe.clientMGUC.MGUCP0020.MGUCP_AppSys.*;
import mcframe.commonMG.constant.*;
import static mcframe.commonMG.notice.MG_Msg.*;
import mcframe.clientMGUD.MGUDP0020.MGUDP_CellConfig;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.Calendar;
import java.util.GregorianCalendar;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
import mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBFP_IoSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBFP_IoSrch_MC extends MGBFP_IoSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected Color _ttlColor = getVTtlColor(this);

	protected int _days = 0;

	// 検索実行時の計算G,計算NOに対する原価計算設定情報の計算対象先頭月
	protected MCDate _stYm = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_IoSrch_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBFP_IoSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBFL0220_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0220_Srch01Caller<P extends MGBFP_IoSrch, B extends MG_MGBFL0220_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0220_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			calcAmt();
			displayColumn();
			setStYm();
		}

		protected void setStYm() {
			_stYm = getCndR().st_ym();
		}

		protected void calcAmt() {
			// 在庫回転日数計算用の日付をクリア
			_days = 0;
			for (RsltR r : bridge.down0()) {
				if (getCndR().qty_flg()) {
					// 総平均単価
					if (isNull(r.std_qty()) || isSame(r.std_qty(), MCNumber.ZERO)) {
						r.ave_upri1(0);
					}
					else {
						r.ave_upri1(r.ave_upri().divide(r.std_qty(),
								getCostUnitDispDigit(panel), MAC_RND_TYP.RNDOFF.toMC()));
					}
					// 月初在庫
					if (isNull(r.st_stk_qty()) || isSame(r.st_stk_qty(), MCNumber.ZERO)) {
						r.st_stk_upri(0);
					}
					else {
						r.st_stk_upri(r.st_stk_amt().divide(r.st_stk_qty(),
								getCostUnitDispDigit(panel), MAC_RND_TYP.RNDOFF.toMC()));
					}
					// 製造
					if (isNull(r.mfg_qty()) || isSame(r.mfg_qty(), MCNumber.ZERO)) {
						r.mfg_upri(0);
					}
					else {
						r.mfg_upri(r.mfg_amt().divide(r.mfg_qty(),
								getCostUnitDispDigit(panel), MAC_RND_TYP.RNDOFF.toMC()));
					}
					// 購買
					if (isNull(r.purc_qty()) || isSame(r.purc_qty(), MCNumber.ZERO)) {
						r.purc_upri(0);
					}
					else {
						r.purc_upri(r.purc_amt().divide(r.purc_qty(),
								getCostUnitDispDigit(panel), MAC_RND_TYP.RNDOFF.toMC()));
					}
					// 製造受入
					if (isNull(r.mfg_gr_qty()) || isSame(r.mfg_gr_qty(), MCNumber.ZERO)) {
						r.mfg_gr_upri(0);
					}
					else {
						r.mfg_gr_upri(r.mfg_gr_amt().divide(r.mfg_gr_qty(),
								getCostUnitDispDigit(panel), MAC_RND_TYP.RNDOFF.toMC()));
					}
					// 入庫
					if (isNull(r.othr_gr_qty())
							|| isSame(r.othr_gr_qty(), MCNumber.ZERO)) {
						r.othr_gr_upri(0);
					}
					else {
						r.othr_gr_upri(r.othr_gr_amt().divide(r.othr_gr_qty(),
								getCostUnitDispDigit(panel), MAC_RND_TYP.RNDOFF.toMC()));
					}
				}
				// 在庫回転率
				setStktrnRate(r);

				// 在庫回転率（数量）
				setStktrnRateQty(r);

				// 在庫回転日数
				setStktrnDays(r);

				// 在庫回転日数（数量）
				setStktrnDaysQty(r);
				setZeroToNull(r);
			}

			// 合計行
			if (0 < bridge.down0().size()) {
				RsltR ttlR = RsltR.create();
				ttlR.st_stk_amt(
						nvl(bridge.down0().sum(RsltR.$st_stk_amt), MCNumber.ZERO));
				ttlR.mfg_amt(nvl(bridge.down0().sum(RsltR.$mfg_amt), MCNumber.ZERO));
				ttlR.purc_amt(nvl(bridge.down0().sum(RsltR.$purc_amt), MCNumber.ZERO));
				ttlR.mfg_gr_amt(
						nvl(bridge.down0().sum(RsltR.$mfg_gr_amt), MCNumber.ZERO));
				ttlR.othr_gr_amt(
						nvl(bridge.down0().sum(RsltR.$othr_gr_amt), MCNumber.ZERO));
				ttlR.alc_amt(nvl(bridge.down0().sum(RsltR.$alc_amt), MCNumber.ZERO));
				ttlR.inpt_amt(nvl(bridge.down0().sum(RsltR.$inpt_amt), MCNumber.ZERO));
				ttlR.plnt_gi_amt(
						nvl(bridge.down0().sum(RsltR.$plnt_gi_amt), MCNumber.ZERO));
				ttlR.othr_gi_amt(
						nvl(bridge.down0().sum(RsltR.$othr_gi_amt), MCNumber.ZERO));
				ttlR.prov_amt(nvl(bridge.down0().sum(RsltR.$prov_amt), MCNumber.ZERO));
				ttlR.sls_amt(nvl(bridge.down0().sum(RsltR.$sls_amt), MCNumber.ZERO));
				ttlR.end_stk_amt(
						nvl(bridge.down0().sum(RsltR.$end_stk_amt), MCNumber.ZERO));
				ttlR.diff_amt(nvl(bridge.down0().sum(RsltR.$diff_amt), MCNumber.ZERO));
				ttlR.xpns_inpt_amt(
						nvl(bridge.down0().sum(RsltR.$xpns_inpt_amt), MCNumber.ZERO));
				setStktrnRate(ttlR);
				setStktrnDays(ttlR);
				bridge.down0().add(ttlR);
			}
		}

		/**
		 * 在庫回転率を設定する
		 * @param r
		 */
		protected void setStktrnRate(RsltR r) {
			MCNumber denominator = r.st_stk_amt().add(r.end_stk_amt()) == null
					? MCNumber.ZERO
					: r.st_stk_amt().add(r.end_stk_amt());
			// 分母が０の場合は99999
			if (isSame(denominator, MCNumber.ZERO)) {
				r.stk_trn_rate(99999);
			}
			else {
				MCNumber numerator = MCNumber.sum(r.inpt_amt(), r.plnt_gi_amt(),
						r.othr_gi_amt(), r.prov_amt(), r.sls_amt());
				r.stk_trn_rate(
						numerator.multiply(2).divide(denominator, 9, MAC_RND_TYP.RNDOFF.toMC()));
			}
		}

		/**
		 * 在庫回転率（数量）を設定する
		 * @param r
		 */
		protected void setStktrnRateQty(RsltR r) {
			MCNumber denominator = r.st_stk_qty().add(r.end_stk_qty()) == null
					? MCNumber.ZERO
					: r.st_stk_qty().add(r.end_stk_qty());
			// 分母が０の場合は99999
			if (isSame(denominator, MCNumber.ZERO)) {
				r.stk_trn_rate_qty(99999);
			}
			else {
				MCNumber numerator = MCNumber.sum(r.inpt_qty(), r.plnt_gi_qty(),
						r.othr_gi_qty(), r.prov_qty(), r.sls_qty());
				r.stk_trn_rate_qty(
						numerator.multiply(2).divide(denominator, 9, MAC_RND_TYP.RNDOFF.toMC()));
			}
		}

		/**
		 * 在庫回転日数を設定する
		 * @param r
		 */
		protected void setStktrnDays(RsltR r) {
			// 在庫回転率が99999の場合は0
			if (isSame(r.stk_trn_rate(), 99999)) {
				r.stk_trn_days(0);
			}
			// 在庫回転率が0の場合は99999
			else if (isSame(r.stk_trn_rate(), MCNumber.ZERO)) {
				r.stk_trn_days(99999);
			}
			else {
				// 年月がnullで無い場合は対象年月に含まれる日数
				if (null != r.ym()) {
					r.stk_trn_days(new MCNumber(getDays(r.ym())).divide(r.stk_trn_rate(),
							2, MAC_RND_TYP.RNDOFF.toMC()));
				}
				else if (null == r.ym() && null == getCndR().ym()) {
					// 年月がnullで検索条件の年月もnullの場合はGT_ARGの計算対象期間先頭～末尾月までの日数
					r.stk_trn_days(new MCNumber(getSumDays()).divide(r.stk_trn_rate(), 2,
							MAC_RND_TYP.RNDOFF.toMC()));
				}
				else {
					// 検索条件の年月に含まれる日数
					r.stk_trn_days(new MCNumber(getDays(getCndR().ym()))
							.divide(r.stk_trn_rate(), 2, MAC_RND_TYP.RNDOFF.toMC()));
				}
			}
		}

		/**
		 * 在庫回転日数（数量）を設定する
		 * @param r
		 */
		protected void setStktrnDaysQty(RsltR r) {
			// 在庫回転率（数量）が99999の場合は0
			if (isSame(r.stk_trn_rate_qty(), 99999)) {
				r.stk_trn_days_qty(0);
			}
			// 在庫回転率（数量）が0の場合は99999
			else if (isSame(r.stk_trn_rate_qty(), MCNumber.ZERO)) {
				r.stk_trn_days_qty(99999);
			}
			else {
				// 年月がnullで無い場合は対象年月に含まれる日数
				if (null != r.ym()) {
					r.stk_trn_days_qty(new MCNumber(getDays(r.ym()))
							.divide(r.stk_trn_rate_qty(), 2, MAC_RND_TYP.RNDOFF.toMC()));
				}
				else if (null == r.ym() && null == getCndR().ym()) {
					// 年月がnullで検索条件の年月もnullの場合はMGT_ARGの計算対象期間先頭～末尾月までの日数
					r.stk_trn_days_qty(new MCNumber(getSumDays())
							.divide(r.stk_trn_rate_qty(), 2, MAC_RND_TYP.RNDOFF.toMC()));
				}
				else {
					// 検索条件の年月に含まれる日数
					r.stk_trn_days_qty(new MCNumber(getDays(getCndR().ym()))
							.divide(r.stk_trn_rate_qty(), 2, MAC_RND_TYP.RNDOFF.toMC()));
				}
			}
		}

		/**
		 * 0の値をnull表示に変更する
		 * @param r
		 */
		protected void setZeroToNull(RsltR r) {
			// 単価計算を行わない場合は単価がnullなので、単価の場合のみnullチェックを行う
			if (r.st_stk_upri() != null && r.st_stk_upri().isZero()) {
				r.st_stk_upri(null);
			}
			if (r.st_stk_qty().isZero()) {
				r.st_stk_qty(null);
			}
			if (r.st_stk_amt().isZero()) {
				r.st_stk_amt(null);
			}
			if (r.mfg_upri() != null && r.mfg_upri().isZero()) {
				r.mfg_upri(null);
			}
			if (r.mfg_qty().isZero()) {
				r.mfg_qty(null);
			}
			if (r.mfg_amt().isZero()) {
				r.mfg_amt(null);
			}
			if (r.purc_upri() != null && r.purc_upri().isZero()) {
				r.purc_upri(null);
			}
			if (r.purc_qty().isZero()) {
				r.purc_qty(null);
			}
			if (r.purc_amt().isZero()) {
				r.purc_amt(null);
			}
			if (r.mfg_gr_upri() != null && r.mfg_gr_upri().isZero()) {
				r.mfg_gr_upri(null);
			}
			if (r.mfg_gr_qty().isZero()) {
				r.mfg_gr_qty(null);
			}
			if (r.mfg_gr_amt().isZero()) {
				r.mfg_gr_amt(null);
			}
			if (r.othr_gr_upri() != null && r.othr_gr_upri().isZero()) {
				r.othr_gr_upri(null);
			}
			if (r.othr_gr_qty().isZero()) {
				r.othr_gr_qty(null);
			}
			if (r.othr_gr_amt().isZero()) {
				r.othr_gr_amt(null);
			}
			if (r.alc_amt().isZero()) {
				r.alc_amt(null);
			}
			if (r.std_qty().isZero()) {
				r.std_qty(null);
			}
			if (r.ave_upri().isZero()) {
				r.ave_upri(null);
			}
			if (r.inpt_qty().isZero()) {
				r.inpt_qty(null);
			}
			if (r.inpt_amt().isZero()) {
				r.inpt_amt(null);
			}
			if (r.plnt_gi_qty().isZero()) {
				r.plnt_gi_qty(null);
			}
			if (r.plnt_gi_amt().isZero()) {
				r.plnt_gi_amt(null);
			}
			if (r.othr_gi_qty().isZero()) {
				r.othr_gi_qty(null);
			}
			if (r.othr_gi_amt().isZero()) {
				r.othr_gi_amt(null);
			}
			if (r.prov_qty().isZero()) {
				r.prov_qty(null);
			}
			if (r.prov_amt().isZero()) {
				r.prov_amt(null);
			}
			if (r.sls_qty().isZero()) {
				r.sls_qty(null);
			}
			if (r.sls_amt().isZero()) {
				r.sls_amt(null);
			}
			if (r.end_stk_qty().isZero()) {
				r.end_stk_qty(null);
			}
			if (r.end_stk_amt().isZero()) {
				r.end_stk_amt(null);
			}
			if (r.diff_qty().isZero()) {
				r.diff_qty(null);
			}
			if (r.diff_amt().isZero()) {
				r.diff_amt(null);
			}
			if (r.xpns_inpt_qty().isZero()) {
				r.xpns_inpt_qty(null);
			}
			if (r.xpns_inpt_amt().isZero()) {
				r.xpns_inpt_amt(null);
			}
		}

		protected int getSumDays() {
			if (0 != _days) {
				return _days;
			}
			int sum = 0;
			for (MCDate d = bridge.down1().st_ym(); d
					.lte(bridge.down1().end_ym()); d = d.addMonth(1)) {
				sum += getDays(d);
			}
			_days = sum;
			return sum;
		}

		/**
		 * 指定された年月に含まれる日数を返します。
		 * @param d 年月
		 * @return 指定された年月に含まれる日数
		 */
		protected int getDays(MCDate d) {
			Calendar c = new GregorianCalendar(d.getYear(), d.getMonth() - 1, d.getDay());
			return c.getActualMaximum(Calendar.DAY_OF_MONTH);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}
	}

	/**
	 * Panel[Cnd]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doCnd_select_all(MCEventInfo info) {
		setBoolean(TtlPanel, true);
	}

	/**
	 * Panel[Cnd]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doCnd_deselect_all(MCEventInfo info) {
		setBoolean(TtlPanel, false);
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBFL0220_Srch01();
	}

	// -----------------------------------------------
	// init-parts
	@Override
	protected void setupParts() {
		super.setupParts();
		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);
		Rslt_qty1_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty2_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty3_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty4_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty5_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty6_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty7_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty8_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty9_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty10_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty11_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty12_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty13_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty14_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
	}

	// -----------------------------------------------
	// init-screen
	@Override
	public boolean sort(MCTable<?> table, MCSortPolicy policy) {
		return sortWithoutBottom(table, policy);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_wg_flg, true);
		setValueEx(Cnd_dpt_flg, true);
		setValueEx(Cnd_itm_flg, true);
		setValueEx(Cnd_itm_typ_flg, true);
		setValueEx(Cnd_itm_typ_d_flg, true);
		setValueEx(Cnd_itm_jnl_flg, true);
		setValueEx(Cnd_asst_flg, true);
		setValueEx(Cnd_qty_flg, true);

		displayColumn();
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		setColorInfo();
	}

	// -----------------------------------------------
	// status
	protected void setSrchStatus() {
		setSRCHStatus();
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		setREFStatus();
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		displayColumn();
		setFocus();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		displayColumn();
		setFocus();
	}

	protected void displayColumn() {
		changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);
	}

	protected void setFocus() {
		if (getRsltL().isEmpty()) {
			FoldTab.focusActiveFirstComponent();
		}
		else {
			RsltTable.selectLeftmostColumn(0);
		}
	}

	// -----------------------------------------------
	// Event
	@Override
	public void doCnd_itm_typ_flg_NC(MCEventInfo info) {
		super.doCnd_itm_typ_flg_NC(info);

		if (!getCndR().itm_typ_flg()) {
			setValueEx(Cnd_itm_typ_d_flg, false);
		}
	}

	@Override
	public void doCnd_itm_typ_d_flg_NC(MCEventInfo info) {
		super.doCnd_itm_typ_d_flg_NC(info);

		if (getCndR().itm_typ_d_flg()) {
			setValueEx(Cnd_itm_typ_flg, true);
		}
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);

		// ダブルクリックの画面遷移
		if (compo instanceof MCTable) {
			MCColumnConfig c = info.getClickColumn();
			if (c == columnRslt_st_stk_amt || c == columnRslt_st_stk_qty
					|| c == columnRslt_st_stk_upri) {
				openMGBFP0100St(info);
			}
			else if (c == columnRslt_end_stk_amt || c == columnRslt_end_stk_qty
					|| c == columnRslt_end_stk_upri) {
				openMGBFP0100End(info);
			}
			else if (c == columnRslt_std_qty || c == columnRslt_ave_upri
					|| c == columnRslt_ave_upri1) {
				openMGBFP0110(info);
			}
			else if (c == columnRslt_sls_qty || c == columnRslt_sls_amt) {
				openMGBFP0050(info);
			}
			else if (c == columnRslt_purc_amt || c == columnRslt_purc_upri
					|| c == columnRslt_purc_qty) {
				openMGBFP0040(info);
			}
			else if (c == columnRslt_mfg_amt || c == columnRslt_mfg_upri
					|| c == columnRslt_mfg_qty) {
				openMGBFP0020(info);
			}
			else if (c == columnRslt_inpt_amt || c == columnRslt_inpt_qty
					|| c == columnRslt_xpns_inpt_qty || c == columnRslt_xpns_inpt_amt) {
				openMGBFP0090(info);
			}
			else if (c == columnRslt_mfg_gr_amt || c == columnRslt_mfg_gr_qty
					|| c == columnRslt_mfg_gr_upri) {
				MCRow r = MCRow.create();
				r.addStringColumn("cost_io_typ", MAC_COST_IO_TYP.STK_IN.value());
				r.addStringColumn("ac_slip_typ", MAC_AC_SLIP_TYP.PROD_ITM_SO.value());
				openMGBFP0060(info, r);
			}
			else if (c == columnRslt_othr_gr_amt || c == columnRslt_othr_gr_qty
					|| c == columnRslt_othr_gr_upri) {
				MCRow r = MCRow.create();
				r.addStringColumn("cost_io_typ", MAC_COST_IO_TYP.STK_IN.value());
				r.addBooleanColumn("except_sls_in_flg", true);
				openMGBFP0060(info, r);
			}
			else if (c == columnRslt_alc_amt) {
				openMGBFP0150(info);
			}
			else if (c == columnRslt_plnt_gi_qty || c == columnRslt_plnt_gi_amt) {
				MCRow r = MCRow.create();
				r.addStringColumn("cost_io_typ", MAC_COST_IO_TYP.STK_OUT.value());
				r.addStringColumn("ac_slip_typ", MAC_AC_SLIP_TYP.PROD_ITM_SO.value());
				openMGBFP0060(info, r);
			}
			else if (c == columnRslt_othr_gi_amt || c == columnRslt_othr_gi_qty) {
				MCRow r = MCRow.create();
				r.addStringColumn("cost_io_typ", MAC_COST_IO_TYP.STK_OUT.value());
				r.addBooleanColumn("except_sls_in_flg", true);
				openMGBFP0060(info, r);
			}
			else if (c == columnRslt_prov_amt || c == columnRslt_prov_qty) {
				MCRow r = MCRow.create();
				r.addStringColumn("cost_io_typ", MAC_COST_IO_TYP.ONR_PROV.value());
				openMGBFP0060(info, r);
			}
		}
	}

	protected void openMGBFP0020(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0020");
		mcframe.clientMGBF.MGBFP0020.CndR to = mcframe.clientMGBF.MGBFP0020.CndR.create();
		RsltR r = RsltTable.getSelectedMCRow();

		if (!isSetCalcGrpCd()) {
			aso.runValueInit();
			aso.show();
			return;
		}
		to.calc_grp_cd(getCndR().calc_grp_cd());
		if (!isSetCalcNo()) {
			aso.putCnd(to);
			aso.runValueInit();
			aso.show();
			return;
		}
		to.calc_no(getCndR().calc_no());
		to.wg_cd(r.wg_cd());
		to.ym(r.ym());
		to.mng_dpt_cd(r.dpt_cd());
		to.mng_dpt_nm(r.dpt_nm());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.itm_typ(r.itm_typ());
		to.itm_typ_d_cd(r.itm_typ_d_cd());
		to.itm_jnl_cd(r.itm_jnl_cd());
		to.itm_grp_cd1(r.itm_grp_cd1());
		to.itm_grp_cd2(r.itm_grp_cd2());
		to.itm_grp_cd3(r.itm_grp_cd3());
		to.itm_grp_cd4(r.itm_grp_cd4());
		to.itm_grp_cd5(r.itm_grp_cd5());
		to.itm_grp_cd6(r.itm_grp_cd6());
		to.itm_grp_cd7(r.itm_grp_cd7());
		to.itm_grp_cd8(r.itm_grp_cd8());
		to.itm_grp_cd9(r.itm_grp_cd9());
		to.itm_grp_cd10(r.itm_grp_cd10());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());
		to.asst_typ(r.asst_typ());
		to.calc_grp_cd(getCndR().calc_grp_cd());
		to.calc_no(getCndR().calc_no());

		aso.putCnd(to);
		aso.putSearchAction();
		aso.runValueInit();
		aso.show();
	}

	protected void openMGBFP0090(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0090");
		mcframe.clientMGBF.MGBFP0090.CndR to = mcframe.clientMGBF.MGBFP0090.CndR.create();
		RsltR r = RsltTable.getSelectedMCRow();

		if (!isSetCalcGrpCd()) {
			aso.runValueInit();
			aso.show();
			return;
		}
		to.calc_grp_cd(getCndR().calc_grp_cd());
		if (!isSetCalcNo()) {
			aso.putCnd(to);
			aso.runValueInit();
			aso.show();
			return;
		}
		to.calc_no(getCndR().calc_no());
		to.wg_cd(r.wg_cd());
		to.ym(r.ym());
		to.inpt_dpt_cd(r.dpt_cd());
		to.inpt_dpt_nm(r.dpt_nm());
		to.chd_itm_cd(r.itm_cd());
		to.chd_itm_sub1(r.itm_sub1());
		to.chd_itm_sub2(r.itm_sub2());
		to.chd_itm_sub3(r.itm_sub3());
		to.chd_itm_nm(r.itm_nm());
		to.chd_itm_typ(r.itm_typ());
		to.chd_itm_typ_d_cd(r.itm_typ_d_cd());
		to.chd_itm_jnl_cd(r.itm_jnl_cd());
		to.chd_itm_grp_cd1(r.itm_grp_cd1());
		to.chd_itm_grp_cd2(r.itm_grp_cd2());
		to.chd_itm_grp_cd3(r.itm_grp_cd3());
		to.chd_itm_grp_cd4(r.itm_grp_cd4());
		to.chd_itm_grp_cd5(r.itm_grp_cd5());
		to.chd_itm_grp_cd6(r.itm_grp_cd6());
		to.chd_itm_grp_cd7(r.itm_grp_cd7());
		to.chd_itm_grp_cd8(r.itm_grp_cd8());
		to.chd_itm_grp_cd9(r.itm_grp_cd9());
		to.chd_itm_grp_cd10(r.itm_grp_cd10());
		to.chd_lot_no(r.lot_no());
		to.chd_sublot_no(r.sublot_no());
		to.chd_sno1(r.sno1());
		to.chd_sno2(r.sno2());
		to.chd_sno3(r.sno3());
		to.chd_sno4(r.sno4());
		to.chd_asst_typ(r.asst_typ());
		to.repurc_obli_typ(MGC_REPURC_OBLI_TYP.NOT_REPURC_OBLI.value());
		to.calc_grp_cd(getCndR().calc_grp_cd());
		to.calc_no(getCndR().calc_no());
		if (isNull(r.asst_typ())) {
			to.except_other_flg(true);
		}

		aso.putCnd(to);
		aso.putSearchAction();
		aso.runValueInit();
		aso.show();
	}

	protected void openMGBFP0110(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0110");
		mcframe.clientMGBF.MGBFP0110.CndR to = mcframe.clientMGBF.MGBFP0110.CndR.create();
		RsltR r = RsltTable.getSelectedMCRow();

		if (!isSetCalcGrpCd()) {
			aso.runValueInit();
			aso.show();
			return;
		}
		to.calc_grp_cd(getCndR().calc_grp_cd());
		if (!isSetCalcNo()) {
			aso.putCnd(to);
			aso.runValueInit();
			aso.show();
			return;
		}
		to.calc_no(getCndR().calc_no());
		to.wg_cd(r.wg_cd());
		to.ym(r.ym());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.itm_typ(r.itm_typ());
		to.itm_typ_d_cd(r.itm_typ_d_cd());
		to.itm_jnl_cd(r.itm_jnl_cd());
		to.itm_grp_cd1(r.itm_grp_cd1());
		to.itm_grp_cd2(r.itm_grp_cd2());
		to.itm_grp_cd3(r.itm_grp_cd3());
		to.itm_grp_cd4(r.itm_grp_cd4());
		to.itm_grp_cd5(r.itm_grp_cd5());
		to.itm_grp_cd6(r.itm_grp_cd6());
		to.itm_grp_cd7(r.itm_grp_cd7());
		to.itm_grp_cd8(r.itm_grp_cd8());
		to.itm_grp_cd9(r.itm_grp_cd9());
		to.itm_grp_cd10(r.itm_grp_cd10());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());
		to.asst_typ(r.asst_typ());
		to.repurc_obli_typ(MGC_REPURC_OBLI_TYP.NOT_REPURC_OBLI.value());
		to.calc_grp_cd(getCndR().calc_grp_cd());
		to.calc_no(getCndR().calc_no());
		if (isNull(r.asst_typ())) {
			to.except_other_flg(true);
		}

		aso.putCnd(to);
		aso.putSearchAction();
		aso.runValueInit();
		aso.show();
	}

	protected void openMGBFP0040(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0040");
		mcframe.clientMGBF.MGBFP0040.CndR to = mcframe.clientMGBF.MGBFP0040.CndR.create();
		RsltR r = RsltTable.getSelectedMCRow();

		if (!isSetCalcGrpCd()) {
			aso.runValueInit();
			aso.show();
			return;
		}
		to.calc_grp_cd(getCndR().calc_grp_cd());
		if (!isSetCalcNo()) {
			aso.putCnd(to);
			aso.runValueInit();
			aso.show();
			return;
		}
		to.calc_no(getCndR().calc_no());
		to.wg_cd(r.wg_cd());
		to.ym(r.ym());
		to.mng_dpt_cd(r.dpt_cd());
		to.mng_dpt_nm(r.dpt_nm());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.itm_typ(r.itm_typ());
		to.itm_typ_d_cd(r.itm_typ_d_cd());
		to.itm_jnl_cd(r.itm_jnl_cd());
		to.itm_grp_cd1(r.itm_grp_cd1());
		to.itm_grp_cd2(r.itm_grp_cd2());
		to.itm_grp_cd3(r.itm_grp_cd3());
		to.itm_grp_cd4(r.itm_grp_cd4());
		to.itm_grp_cd5(r.itm_grp_cd5());
		to.itm_grp_cd6(r.itm_grp_cd6());
		to.itm_grp_cd7(r.itm_grp_cd7());
		to.itm_grp_cd8(r.itm_grp_cd8());
		to.itm_grp_cd9(r.itm_grp_cd9());
		to.itm_grp_cd10(r.itm_grp_cd10());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());
		to.asst_typ(r.asst_typ());
		to.calc_grp_cd(getCndR().calc_grp_cd());
		to.calc_no(getCndR().calc_no());

		aso.putCnd(to);
		aso.putSearchAction();
		aso.runValueInit();
		aso.show();
	}

	protected void openMGBFP0050(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0050");
		mcframe.clientMGBF.MGBFP0050.CndR to = mcframe.clientMGBF.MGBFP0050.CndR.create();
		RsltR r = RsltTable.getSelectedMCRow();

		if (!isSetCalcGrpCd()) {
			aso.runValueInit();
			aso.show();
			return;
		}
		to.calc_grp_cd(getCndR().calc_grp_cd());
		if (!isSetCalcNo()) {
			aso.putCnd(to);
			aso.runValueInit();
			aso.show();
			return;
		}
		to.calc_no(getCndR().calc_no());
		to.wg_cd(r.wg_cd());
		to.ym(r.ym());
		to.mng_dpt_cd(r.dpt_cd());
		to.mng_dpt_nm(r.dpt_nm());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.itm_typ(r.itm_typ());
		to.itm_typ_d_cd(r.itm_typ_d_cd());
		to.itm_jnl_cd(r.itm_jnl_cd());
		to.itm_grp_cd1(r.itm_grp_cd1());
		to.itm_grp_cd2(r.itm_grp_cd2());
		to.itm_grp_cd3(r.itm_grp_cd3());
		to.itm_grp_cd4(r.itm_grp_cd4());
		to.itm_grp_cd5(r.itm_grp_cd5());
		to.itm_grp_cd6(r.itm_grp_cd6());
		to.itm_grp_cd7(r.itm_grp_cd7());
		to.itm_grp_cd8(r.itm_grp_cd8());
		to.itm_grp_cd9(r.itm_grp_cd9());
		to.itm_grp_cd10(r.itm_grp_cd10());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());
		to.asst_typ(r.asst_typ());
		to.calc_grp_cd(getCndR().calc_grp_cd());
		to.calc_no(getCndR().calc_no());

		aso.putCnd(to);
		aso.putSearchAction();
		aso.runValueInit();
		aso.show();
	}

	protected void openMGBFP0060(MCEventInfo info, MCRow tmpR) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0060");
		mcframe.clientMGBF.MGBFP0060.CndR to = mcframe.clientMGBF.MGBFP0060.CndR.create();
		RsltR r = RsltTable.getSelectedMCRow();

		if (!isSetCalcGrpCd()) {
			aso.runValueInit();
			aso.show();
			return;
		}
		to.calc_grp_cd(getCndR().calc_grp_cd());
		if (!isSetCalcNo()) {
			aso.putCnd(to);
			aso.runValueInit();
			aso.show();
			return;
		}
		to.calc_no(getCndR().calc_no());
		to.wg_cd(r.wg_cd());
		to.ym(r.ym());
		to.mng_dpt_cd(r.dpt_cd());
		to.mng_dpt_nm(r.dpt_nm());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.itm_typ(r.itm_typ());
		to.itm_typ_d_cd(r.itm_typ_d_cd());
		to.itm_jnl_cd(r.itm_jnl_cd());
		to.itm_grp_cd1(r.itm_grp_cd1());
		to.itm_grp_cd2(r.itm_grp_cd2());
		to.itm_grp_cd3(r.itm_grp_cd3());
		to.itm_grp_cd4(r.itm_grp_cd4());
		to.itm_grp_cd5(r.itm_grp_cd5());
		to.itm_grp_cd6(r.itm_grp_cd6());
		to.itm_grp_cd7(r.itm_grp_cd7());
		to.itm_grp_cd8(r.itm_grp_cd8());
		to.itm_grp_cd9(r.itm_grp_cd9());
		to.itm_grp_cd10(r.itm_grp_cd10());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());
		to.asst_typ(r.asst_typ());
		to.repurc_obli_typ(MGC_REPURC_OBLI_TYP.NOT_REPURC_OBLI.value());
		to.calc_grp_cd(getCndR().calc_grp_cd());
		to.calc_no(getCndR().calc_no());
		if (isNull(r.asst_typ())) {
			to.except_other_flg(true);
		}
		to.cost_io_typ(tmpR.getStringNE("cost_io_typ"));
		to.ac_slip_typ(tmpR.getStringNE("ac_slip_typ"));
		to.except_sls_in_flg(tmpR.getBooleanNE("except_sls_in_flg"));

		aso.putCnd(to);
		aso.putSearchAction();
		aso.runValueInit();
		aso.show();
	}

	protected void openMGBFP0100St(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0100");
		mcframe.clientMGBF.MGBFP0100.CndR to = mcframe.clientMGBF.MGBFP0100.CndR.create();
		RsltR r = RsltTable.getSelectedMCRow();

		if (!isSetCalcGrpCd()) {
			aso.runValueInit();
			aso.show();
			return;
		}
		to.calc_grp_cd(getCndR().calc_grp_cd());
		if (!isSetCalcNo()) {
			aso.putCnd(to);
			aso.runValueInit();
			aso.show();
			return;
		}
		to.calc_no(getCndR().calc_no());
		to.wg_cd(r.wg_cd());
		to.ym(r.ym());
		to.mng_dpt_cd(r.dpt_cd());
		to.mng_dpt_nm(r.dpt_nm());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.itm_typ(r.itm_typ());
		to.itm_typ_d_cd(r.itm_typ_d_cd());
		to.itm_jnl_cd(r.itm_jnl_cd());
		to.itm_grp_cd1(r.itm_grp_cd1());
		to.itm_grp_cd2(r.itm_grp_cd2());
		to.itm_grp_cd3(r.itm_grp_cd3());
		to.itm_grp_cd4(r.itm_grp_cd4());
		to.itm_grp_cd5(r.itm_grp_cd5());
		to.itm_grp_cd6(r.itm_grp_cd6());
		to.itm_grp_cd7(r.itm_grp_cd7());
		to.itm_grp_cd8(r.itm_grp_cd8());
		to.itm_grp_cd9(r.itm_grp_cd9());
		to.itm_grp_cd10(r.itm_grp_cd10());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());
		to.asst_typ(r.asst_typ());
		to.repurc_obli_typ(MGC_REPURC_OBLI_TYP.NOT_REPURC_OBLI.value());
		to.st_stk_flg(true);
		to.st_wip_flg(false);
		to.end_stk_flg(false);
		to.end_wip_flg(false);

		List<String> list = new ArrayList<String>();
		list.add(mcframe.clientMGBF.MGBFP0100.CndR.$st_wip_flg);
		list.add(mcframe.clientMGBF.MGBFP0100.CndR.$end_stk_flg);
		list.add(mcframe.clientMGBF.MGBFP0100.CndR.$end_wip_flg);
		list.add(mcframe.clientMGBF.MGBFP0100.CndR.$adj_flg);

		if (!isNull(r.ym()) && !isNull(_stYm) && !isSame(r.ym(), _stYm)) {
			to.end_stk_flg(true);
			to.st_stk_flg(false);
			list.add(mcframe.clientMGBF.MGBFP0100.CndR.$st_stk_flg);
			to.ym(r.ym().addMonth(-1));
		}
		if (isNull(r.asst_typ())) {
			to.except_other_flg(true);
		}

		aso.putCnd(to, list);
		aso.putSearchAction();
		aso.runValueInit();
		aso.show();
	}

	protected void openMGBFP0100End(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0100");
		mcframe.clientMGBF.MGBFP0100.CndR to = mcframe.clientMGBF.MGBFP0100.CndR.create();
		RsltR r = RsltTable.getSelectedMCRow();

		if (!isSetCalcGrpCd()) {
			aso.runValueInit();
			aso.show();
			return;
		}
		to.calc_grp_cd(getCndR().calc_grp_cd());
		if (!isSetCalcNo()) {
			aso.putCnd(to);
			aso.runValueInit();
			aso.show();
			return;
		}
		to.calc_no(getCndR().calc_no());
		to.wg_cd(r.wg_cd());
		to.ym(r.ym());
		to.mng_dpt_cd(r.dpt_cd());
		to.mng_dpt_nm(r.dpt_nm());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.itm_typ(r.itm_typ());
		to.itm_typ_d_cd(r.itm_typ_d_cd());
		to.itm_jnl_cd(r.itm_jnl_cd());
		to.itm_grp_cd1(r.itm_grp_cd1());
		to.itm_grp_cd2(r.itm_grp_cd2());
		to.itm_grp_cd3(r.itm_grp_cd3());
		to.itm_grp_cd4(r.itm_grp_cd4());
		to.itm_grp_cd5(r.itm_grp_cd5());
		to.itm_grp_cd6(r.itm_grp_cd6());
		to.itm_grp_cd7(r.itm_grp_cd7());
		to.itm_grp_cd8(r.itm_grp_cd8());
		to.itm_grp_cd9(r.itm_grp_cd9());
		to.itm_grp_cd10(r.itm_grp_cd10());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());
		to.asst_typ(r.asst_typ());
		to.repurc_obli_typ(MGC_REPURC_OBLI_TYP.NOT_REPURC_OBLI.value());
		to.st_stk_flg(false);
		to.st_wip_flg(false);
		to.end_stk_flg(true);
		to.end_wip_flg(false);

		List<String> list = new ArrayList<String>();
		list.add(mcframe.clientMGBF.MGBFP0100.CndR.$st_stk_flg);
		list.add(mcframe.clientMGBF.MGBFP0100.CndR.$st_wip_flg);
		list.add(mcframe.clientMGBF.MGBFP0100.CndR.$end_wip_flg);
		list.add(mcframe.clientMGBF.MGBFP0100.CndR.$adj_flg);

		if (isNull(r.asst_typ())) {
			to.except_other_flg(true);
		}

		aso.putCnd(to, list);
		aso.putSearchAction();
		aso.runValueInit();
		aso.show();
	}

	protected void openMGBFP0150(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0150");
		mcframe.clientMGBF.MGBFP0150.CndR to = mcframe.clientMGBF.MGBFP0150.CndR.create();
		RsltR r = RsltTable.getSelectedMCRow();

		if (!isSetCalcGrpCd()) {
			aso.runValueInit();
			aso.show();
			return;
		}
		to.calc_grp_cd(getCndR().calc_grp_cd());
		if (!isSetCalcNo()) {
			aso.putCnd(to);
			aso.runValueInit();
			aso.show();
			return;
		}
		to.calc_no(getCndR().calc_no());
		to.wg_cd(r.wg_cd());
		to.ym(r.ym());
		to.mng_dpt_cd(r.dpt_cd());
		to.mng_dpt_nm(r.dpt_nm());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.itm_jnl_cd(r.itm_jnl_cd());
		to.itm_grp_cd1(r.itm_grp_cd1());
		to.itm_grp_cd2(r.itm_grp_cd2());
		to.itm_grp_cd3(r.itm_grp_cd3());
		to.itm_grp_cd4(r.itm_grp_cd4());
		to.itm_grp_cd5(r.itm_grp_cd5());
		to.itm_grp_cd6(r.itm_grp_cd6());
		to.itm_grp_cd7(r.itm_grp_cd7());
		to.itm_grp_cd8(r.itm_grp_cd8());
		to.itm_grp_cd9(r.itm_grp_cd9());
		to.itm_grp_cd10(r.itm_grp_cd10());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());
		to.asst_typ(r.asst_typ());
		to.repurc_obli_typ(MGC_REPURC_OBLI_TYP.NOT_REPURC_OBLI.value());
		to.gp_alc_flg(true);

		List<String> list = new ArrayList<String>();
		list.add(mcframe.clientMGBF.MGBFP0150.CndR.$st_stk_flg);
		list.add(mcframe.clientMGBF.MGBFP0150.CndR.$st_wip_flg);
		list.add(mcframe.clientMGBF.MGBFP0150.CndR.$purc_flg);
		list.add(mcframe.clientMGBF.MGBFP0150.CndR.$comp_flg);
		list.add(mcframe.clientMGBF.MGBFP0150.CndR.$othr_in_flg);
		list.add(mcframe.clientMGBF.MGBFP0150.CndR.$inpt_flg);
		list.add(mcframe.clientMGBF.MGBFP0150.CndR.$othr_out_flg);
		list.add(mcframe.clientMGBF.MGBFP0150.CndR.$free_prov_flg);
		list.add(mcframe.clientMGBF.MGBFP0150.CndR.$paid_flg);
		list.add(mcframe.clientMGBF.MGBFP0150.CndR.$sls_flg);
		list.add(mcframe.clientMGBF.MGBFP0150.CndR.$end_stk_flg);
		list.add(mcframe.clientMGBF.MGBFP0150.CndR.$end_wip_flg);
		list.add(mcframe.clientMGBF.MGBFP0150.CndR.$adj_flg);

		aso.putCnd(to, list);
		aso.putSearchAction();
		aso.runValueInit();
		aso.show();
	}

	protected boolean isSetCalcGrpCd() {
		if (isNull(getCndR().calc_grp_cd())) {
			return false;
		}
		return true;
	}

	protected boolean isSetCalcNo() {
		if (isNull(getCndR().calc_no())) {
			return false;
		}
		return true;
	}

	// -----------------------------------------------
	// CellConfig
	protected RsltTableCellConfig createRsltTableCellConfig() {
		return new RsltTableCellConfig();
	}

	protected class RsltTableCellConfig extends MGUDP_CellConfig {
		@Override
		public int getPriorScale(int index, MCColumnConfig column, MCTable table) {
			// 在庫回転率の小数部表示桁数は比率小数部表示桁数を取得する
			if (column == columnRslt_stk_trn_rate
					|| column == columnRslt_stk_trn_rate_qty) {
				return getCostRateDispDigit((MGUDP_PanelBase) table.getBaseRootPanel());
			}
			// 在庫回転日数の小数部表示桁数は２
			else if (column == columnRslt_stk_trn_days
					|| column == columnRslt_stk_trn_days_qty) {
				return 2;
			}
			return super.getPriorScale(index, column, table);
		}

		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table,
				MCMode mode) {
			if (index == getRsltL().size() - 1) {
				return _ttlColor;
			}
			return super.getPriorBG(index, column, table, mode);
		}
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltTableCellConfig());
	}

	protected void setColorInfo() {
		RsltTableCellConfig cc = (RsltTableCellConfig) RsltTable.getCellConfig();

		cc.putColumnBG(columnRslt_ave_upri1, getAveUpriColor(this));
		cc.putColumnBG(columnRslt_std_qty, getAveUpriColor(this));
		cc.putColumnBG(columnRslt_ave_upri, getAveUpriColor(this));
		cc.putColumnBG(columnRslt_diff_qty, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_diff_amt, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_stk_trn_days, getStkrColor(this));
		cc.putColumnBG(columnRslt_stk_trn_rate, getStkrColor(this));
		cc.putColumnBG(columnRslt_stk_trn_days_qty, getStkrColor(this));
		cc.putColumnBG(columnRslt_stk_trn_rate_qty, getStkrColor(this));
	}

}