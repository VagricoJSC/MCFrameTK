package mcframe.clientMSBH.MSBHP0030;

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

import mcframe.clientMAUB.MAUBP0060.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5240.*;
import mcframe.clientMAUB.MAUBP5390.*;
import mcframe.clientMSUB.MSUBP0010.*;
import mcframe.clientMSUB.MSUBP5020.*;

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
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.*;
import mcframe.clientCore.container.*;
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientCore.beans.list.MCListType;
import mcframe.clientFXBA.FXBAP0110.FXBAP_ListListener;
import mcframe.commonFXUC.FXUCC0030.*;
import static mcframe.commonMSUA.MSUAC0090.MSUAC_List.*;
import mcframe.clientMAUD.MAUDP0110.*;
import mcframe.clientMAUB.MAUBP0330.IfCanAcDtBase;
import mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil;
import mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil;
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import mcframe.clientMSUC.MSUCP0100.MSUCP_ApUtil;
import mcframe.clientMSBH.MSBHP0040.IfPayRqstBase;
import mcframe.clientMSBH.MSBHP0040.IfPayRqstBaseRow;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBHP_PaySchdReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBHP_PaySchdReg_MC extends MSBHP_PaySchdReg_MC_A implements IfOpePanel, IfPayRqstBase, IfCanAcDtBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBHP_PaySchdReg_MC() {
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
	public MSBHP_PaySchdReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	boolean _startUpFlg = true;
	/**
	 * 画面起動時か
	 */
	protected boolean isStartUp() {
		return _startUpFlg;
	}

	/**
	 * [MS_MSBHL0030_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0030_Srch01Caller<P extends MSBHP_PaySchdReg, B extends MS_MSBHL0030_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {
		protected MS_MSBHL0030_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			
			bridge.down2().forEach(r -> {
				r.can_ac_dt_for_input(r.can_ac_dt_dummy());
				r.can_ac_dt(r.can_ac_dt_dummy());
			});
		}

		@Override
		protected void show() {
			super.show();
			getHdrR().bsppl_cl_ym(getHdrR().bsppl_cl_dt());
			setXrateBaseDt();
			
			for (DtlSchdR r : getDtlSchdL()) {
				srchSetoffLimitAmt(r);
				setOldVal(r);
				setSetoffLimitAmt(r, r.trd_cur_amt(), false, r.ap_setoff_typ(), r.setoff_cd(), r.so_dpt_cd(), r.ar_typ());
				setSetOffActFlg(r);
			}
			setDtlActDef(getDtlActL());
			setDtlAdvPayActDef(getDtlAdvPayActL());
			setOldVal();
			
			getHdrR().setStatus(Status.NONE);
			setPayTab();
		}

		@Override
		protected void setMode() {
			if (Cnd_ope_UPD.isSelected()) {
				setUpdStatus();
			}
			else if (Cnd_ope_DEL.isSelected()) {
				setDelStatus();
			}
			else if (Cnd_ope_REF.isSelected()) {
				setRefStatus();
			}
			else {
				super.setMode();
			}
			setFocus();
		}
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setStatus(SRCH);
			setFocus();
		}
	}

	/**
	 * [MS_MSBHL0030_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0030_Srch02Caller<P extends MSBHP_PaySchdReg, B extends MS_MSBHL0030_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {
		protected MS_MSBHL0030_Srch02Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void show() {
			super.show();
			setOldVal();
			setDtlActDef(getDtlActL());
			setDtlAdvPayActDef(getDtlAdvPayActL());
			setPayTab();
		}
		@Override
		protected void afterCall() {
			super.afterCall();
			bridge.down0().setStatus(MCRow.CREATE);
		}
		@Override
		protected void setMode() {
			super.setMode();
			setStatus(INS_REF);
			setFocus();
		}
		@Override
		protected void setModeNoDown() {
			setMode();
		}
		@Override
		protected void showNoDownDataMsg() {
			// 検索結果なしでも登録可なので何もしない
		}
	}

	/**
	 * [MS_MSBHL0030_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0030_Sprt01Caller<P extends MSBHP_PaySchdReg, B extends MS_MSBHL0030_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {
		protected MS_MSBHL0030_Sprt01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBHP0001);
		}

		@Override
		protected void setupParam() {
			super.setupParam();

			HdrR hdrR = getHdrR();
			for (DtlApdR r : getDtlApdL()) {
				r.reg_dt(hdrR.reg_dt());
				r.bsppl_cd(hdrR.bsppl_cd());
				r.bsppl_dpt_cd(hdrR.bsppl_dpt_cd());
				r.hdr_bsppl_cl_dt(hdrR.bsppl_cl_dt());
			}

			bridge.up0().setAll(getTgtApdL());
		}

		@Override
		protected void beforeCall() {
			super.beforeCall();
			setUpAmt(bridge.up0());
		}

		@Override
		protected void showMerge() {
			MCList<DtlSchdR> down = bridge.down0();
			down.setStatus(MCRow.CREATE);
			getDtlSchdL().addAll(down);
			for (DtlSchdR r : getDtlSchdL()) {
				setSetOffActFlg(r);
			}
		}

		/**
		 * 支払予定の提案対象となる買掛明細を取得する
		 */
		protected MCList<DtlApdR> getTgtApdL() {
			Map<Integer, DtlApdR> cndMap = new HashMap<>();

			String[] apdKey = {DtlApdR.$asppl_cd, DtlApdR.$ap_dpt_cd, DtlApdR.$ap_typ};
			MCIndexKey psIdx = getDtlSchdL().createIndex(DtlSchdR.$asppl_cd, DtlSchdR.$ap_dpt_cd, DtlSchdR.$ap_typ);

			// 全額繰越を除く
			MCList<DtlApdR> dtlApdL = getDtlApdL().shallowClone();
			dtlApdL.removeAll(dtlApdL.subList(DtlApdR.$pay_mtd_typ, MSC_PAY_MTD_TYP.ALL_CO.value()));
			
			for (MCList<DtlApdR> apdL : exceptEmpty(dtlApdL).groupList(apdKey)) {
				DtlApdR apdR = apdL.get(0);
				MCList<DtlSchdR> psL = getDtlSchdL().subList(psIdx, apdR.toArray(apdKey));

				// 買掛明細の金額
				DtlApdR tgtApdR = getApdAmt(apdL.subList(r -> !r.isStatusDelete()));

				// 支払予定の金額（買掛明細のコンテナを利用する）
				DtlApdR tgtPaySchdR = getPaySchdAmt(psL.subList(r -> !r.isStatusDelete()));

				for (String propCol : new String[]{DtlApdR.$trd_cur_inc_tax_amt, DtlApdR.$wtax_amt}) {
					MCNumber diff = tgtApdR.getNumber(propCol).subtract(tgtPaySchdR.getNumber(propCol));
					
					String allocCol = propCol + "_diff";
					apdL.forEach(r -> r.setNumberNE(allocCol, 0));	// 初期化
					
					if (!diff.isZero()) {
						MCList<DtlApdR> wkApDL = apdL.subList(r -> !isNull(r.getNumber(propCol)));
						
						if (wkApDL.subList(r -> r.getNumber(propCol).isZero()).size() == wkApDL.size() || wkApDL.sum(propCol).isZero()) {
							// 全行金額＝０⇒均等に割り当てる
							wkApDL.forEach(r -> r.setNumberNE("base_amt", 1));
						}
						else {
							wkApDL = wkApDL.subList(r -> !r.getNumber(propCol).isZero());
							wkApDL.forEach(r -> r.setNumberNE("base_amt", r.getNumber(propCol)));
						}
						
						// 差額ありの場合、差額分の支払予定を提案対象する買掛明細を作成する
						FXUCC_Divide.prop(wkApDL, diff,
							getHdrR().trd_cur_amt_dec_place().intValue(), "base_amt", allocCol);
					}
					else if (!psL.subList(r -> !r.isStatusDelete()).isEmpty()) {
						// 金額＝０で既に支払予定がある場合は何もしない
						continue;
					}
					
					// 税込金額は"trd_cur_amt"に格納する
					String col = isSame(propCol, DtlApdR.$trd_cur_inc_tax_amt) ? DtlApdR.$trd_cur_amt : propCol;
					for (DtlApdR r : apdL) {
						Integer key = r.getGUIIndex();
						if (!cndMap.containsKey(key)) {
							DtlApdR addR = r.clone();
							addR.trd_cur_amt(0);
							addR.trd_cur_tax_amt(0);	// 税込で計算するので不要
							addR.wtax_amt(0);
							cndMap.put(key, addR);
						}
						DtlApdR cndR = cndMap.get(key);
						cndR.setNumberNE(col, nvl(r.getNumberNE(allocCol), MCNumber.ZERO));
					}
				}
			}

			MCList<DtlApdR> cndL = MCList.create(DtlApdR.class);
			cndMap.values().forEach(r -> {
				if (!isNull(r.wtax_amt())) {
					// 計算時に差し引いていた分を戻す
					r.trd_cur_amt(
						r.trd_cur_amt().add(r.wtax_amt())
					);
				}
				cndL.add(r);
			});
			return cndL ;
		}
		
		/**
		 * 按分対象の買掛明細の金額を取得する
		 */
		protected DtlApdR getApdAmt(MCList<DtlApdR> apdL) {
			DtlApdR apdR = DtlApdR.create();
			apdR.trd_cur_inc_tax_amt(0);
			apdR.wtax_amt(0);
			for (DtlApdR r : apdL) {
				// 税込金額
				if (!isNull(r.trd_cur_inc_tax_amt())) {
					apdR.trd_cur_inc_tax_amt(
						apdR.trd_cur_inc_tax_amt().add(r.trd_cur_inc_tax_amt())
					);
				}
				// 源泉税
				if (!isNull(r.wtax_amt())) {
					apdR.wtax_amt(
						apdR.wtax_amt().add(r.wtax_amt())
					);
					// 税込金額は源泉税分を差し引いて計算する（計算後に再度加算する）
					apdR.trd_cur_inc_tax_amt(
						apdR.trd_cur_inc_tax_amt().subtract(r.wtax_amt())
					);
				}
			}
			return apdR;
		}

		/**
		 * 按分対象の支払予定の金額を取得する
		 */
		protected DtlApdR getPaySchdAmt(MCList<DtlSchdR> paySchdL) {
			DtlApdR paySchdR = DtlApdR.create();
			paySchdR.trd_cur_inc_tax_amt(0);
			paySchdR.wtax_amt(0);
			for (DtlSchdR r : paySchdL) {
				// 源泉税
				if (MAC_AP_STTL_TYP.isWTAX(r.ap_sttl_typ())) {
					paySchdR.wtax_amt(
						paySchdR.wtax_amt().add(nvl(r.trd_cur_amt(), MCNumber.ZERO))
					);
				}
				// 税込金額（手数料は除く）
				else if (!MAC_AP_STTL_TYP.is_com_paid(r.ap_sttl_typ())) {
					paySchdR.trd_cur_inc_tax_amt(
						paySchdR.trd_cur_inc_tax_amt().add(nvl(r.trd_cur_amt(), MCNumber.ZERO))
					);
				}
			}
			return paySchdR;
		}

		@Override
		protected void adjustList() {
			super.adjustList();
			DtlSchdTable.adjustWidth();
			DtlActTable.adjustWidth();
			DtlAdvPayActTable.adjustWidth();
		}

		@Override
		protected void setMode() {
			// モードは変えない
			//super.setMode();
		}
	}

	/**
	 * [MS_MSBHL0030_Sprt02]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0030_Sprt02Caller<P extends MSBHP_PaySchdReg, B extends MS_MSBHL0030_Sprt02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {
		protected MS_MSBHL0030_Sprt02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBHP0002);
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			// 未登録の消費税差額分は除く
			bridge.up0().setAll(
				getDtlApdL()
					.subList(r -> !r.isStatusDelete())
					.subList(r -> !isSrchTaxDiff(r))
			);
			bridge.up1().setAll(
					getDtlActL()
					.subList(r -> r.check())
			);
			bridge.up2().setAll(
					getDtlAdvPayActL()
					.subList(r -> r.check())
			);
		}

		@Override
		protected void beforeCall() {
			super.beforeCall();
			setUpAmt(bridge.up0());
		}

		@Override
		protected void showMerge() {
			// 未登録の消費税差額分を除外
			MCList<DtlApdR> apdL = getDtlApdL().subList(r -> !isSrchTaxDiff(r));
			getDtlApdL().setAll(apdL);

			MCIndexKey idx = apdL.createIndex(DtlApdR.$ap_d_no);
			for (DtlApdR downR : bridge.down0()) {
				if (isNull(downR.ap_d_no())) {
					downR.setStatus(MCRow.CREATE);
					getDtlApdL().add(downR);
				}
				else {
					DtlApdR apdR = apdL.getFirst(idx, downR.ap_d_no());
					apdR.slip_sts_typ(downR.slip_sts_typ());
					apdR.slip_sts_typ_nm(downR.slip_sts_typ_nm());
					apdR.setStatus(MCRow.MODIFY);
				}
			}
		}

		@Override
		protected void adjustList() {
			super.adjustList();
			DtlApdTable.adjustWidth();
		}

		@Override
		protected void setMode() {
			// モードは変えない
			//super.setMode();
		}
	}

	/**
	 * [MS_MSBHL0030_Sprt03]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0030_Sprt03Caller<P extends MSBHP_PaySchdReg, B extends MS_MSBHL0030_Sprt03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {
		protected MS_MSBHL0030_Sprt03Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setScreenAsync(false);
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			// 条件は呼び出し元で設定済み
		}

		@Override
		protected void setMode() {
			// モードは変えない
			//super.setMode();
		}
	}

	/**
	 * [MS_MSBHL0030_Sprt04]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0030_Sprt04Caller<P extends MSBHP_PaySchdReg, B extends MS_MSBHL0030_Sprt04Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBHL0030_Sprt04Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBHP0005);
		}

		@Override
		protected void setupParam() {
			super.setupParam();

			bridge.up0().setAll(
				bridge.up0()
					.subList(r -> !r.isStatusDelete())
					.subList(r -> !isNull(r.ap_d_no()))
			);
		}

		@Override
		protected void showMerge() {
			//super.showMerge();
			if (bridge.down0().isEmpty()) {
				return;
			}

			// 今回有償支給額の設定
			MCNumber onrProvAmt = MCNumber.ZERO;

			MCIndexKey idx = getDtlApdL().createIndex(DtlApdR.$ap_d_no);
			for (DtlApdR downR : bridge.down0()) {
				DtlApdR r = getDtlApdL().getFirst(idx, downR.ap_d_no());

				if (!isNull(downR.onr_prov_amt()) && !isNull(r.trd_cur_inc_tax_amt())) {
					MCNumber amt = MCNumber.ZERO;
					if (MSC_PAY_MTD_TYP.isALL_PAY(r.pay_mtd_typ())) {
						amt = downR.onr_prov_amt();
					}
					// 債務相殺サービスで取得した有償支給残高に対して支払額の割合を乗じる
					if (MSC_PAY_MTD_TYP.isPART_PAY(r.pay_mtd_typ())) {
						amt = downR.onr_prov_amt()
									.multiply(
										r.trd_cur_inc_tax_amt().divide(
											r.old_trd_cur_inc_tax_amt(),
											DtlApdR.onr_prov_amt_META.scale(),
											MAC_RND_TYP.RNDUP.toMC()
										)
									)
									.setScale(
										r.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.RNDUP.toMC()
									);
					}
					onrProvAmt = onrProvAmt.add(amt);
				}
			}
			getHdrR().onr_prov_amt(onrProvAmt);
		}

		@Override
		protected void setMode() {
			// モードは変えない
			//super.setMode();
		}
	}
	
	/**
	 * [MS_MSBHL0030_Sprt05]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0030_Sprt05Caller<P extends MSBHP_PaySchdReg, B extends MS_MSBHL0030_Sprt05Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBHL0030_Sprt05Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected MCMessage msgExecConfirm() {
			if (!isNull(getDtlActL()) && getDtlActL().subList(r -> !r.isStatusNone()).size() > 0) {
				return new MCMessage(MSBHP0151);
			}
			return null;
		}
		@Override
		protected void showMerge() {
			getDtlActL().clear();
			super.showMerge();
		}
		@Override
		protected void show() {
			super.show();
			setDtlActDef(getDtlActL());
			setPayTab();
		}
		@Override
		protected void setMode() {
			// モードは変えない
			//super.setMode();
		}
	}
	/**
	 * 	支払実績にデフォルト値を設定する
	 * @param list 設定対象（支払実績）
	 */
	protected void setDtlActDef(MCList<DtlActR>list) {
		MCDate bspplClDt = getHdrR().bsppl_cl_dt();
		String payChkMngNo = getHdrR().pay_chk_mng_no();
		if (isNull(bspplClDt)) {
			return;
		}
		for (DtlActR r : list) {
			if (!isNull(payChkMngNo)) {
				if (isSame(payChkMngNo, r.calc_tgt_pay_chk_mng_no())) {
					r.check(true);
				}
			}
			else {
				if (!isNull(r.pay_basis_dt()) && r.pay_basis_dt().lte(bspplClDt)) {
					r.check(true);
				}
			}
		}
	}

	/**
	 * [MS_MSBHL0030_Sprt06]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0030_Sprt06Caller<P extends MSBHP_PaySchdReg, B extends MS_MSBHL0030_Sprt06Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBHL0030_Sprt06Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected MCMessage msgExecConfirm() {
			if (!isNull(getDtlAdvPayActL()) && getDtlAdvPayActL().subList(r -> !r.isStatusNone()).size() > 0) {
				return new MCMessage(MSBHP0152);
			}
			return null;
		}
		@Override
		protected void showMerge() {
			getDtlAdvPayActL().clear();
			super.showMerge();
		}
		@Override
		protected void show() {
			super.show();
			setDtlAdvPayActDef(getDtlAdvPayActL());
			setPayTab();
		}
		@Override
		protected void setMode() {
			// モードは変えない
			//super.setMode();
		}
	}
	/**
	 * 	前渡金実績にデフォルト値を設定する
	 * @param list 設定対象（前渡金実績）
	 */
	protected void setDtlAdvPayActDef(MCList<DtlAdvPayActR>list) {
		String payChkMngNo = getHdrR().pay_chk_mng_no();
		if (isNull(payChkMngNo)) {
			list.setBooleanNE(DtlAdvPayActR.$check, true);
		}
		else {
			for (DtlAdvPayActR r : list) {
				if (isSame(payChkMngNo, r.pay_chk_mng_no())) {
					r.check(true);
				}
			}
		}
	}
	/**
	 * [MS_MSBHL0030_Sprt07]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0030_Sprt07Caller<P extends MSBHP_PaySchdReg, B extends MS_MSBHL0030_Sprt07Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {
		protected MS_MSBHL0030_Sprt07Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void show() {
			super.show();
			if (isNull(getHdrR().last_pay_schd_amt())) {
				getHdrR().last_pay_schd_amt(MCNumber.ZERO);
			}
			setPayTab();
		}
		@Override
		protected void setMode() {
			// モードは変えない
			//super.setMode();
		}
	}

	/**
	 * [MS_MSBHL0030_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0030_Ins01Caller<P extends MSBHP_PaySchdReg, B extends MS_MSBHL0030_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {
		protected MS_MSBHL0030_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up3().setAll(getDtlActL().subList(r -> r.check()));
			bridge.up4().setAll(getDtlAdvPayActL().subList(r -> r.check()));
		}

		@Override
		protected void beforeCall() {
			super.beforeCall();
			setUpAmt(bridge.up1());
		}

		@Override
		protected boolean checkUpListParamEmpty() {
			if (!checkUpListParamEmptyCustom()) {
				showNoUpListDataMsg();
				return false;
			}
			return true;
		}

		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			customConfirmForCallStack(getHdrR(), msgList);
		}

		@Override
		protected void show() {
			super.show();
			getCndR().pay_chk_no(getHdrR().pay_chk_no());
		}
	}

	/**
	 * [MS_MSBHL0030_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0030_Upd01Caller<P extends MSBHP_PaySchdReg, B extends MS_MSBHL0030_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {
		protected MS_MSBHL0030_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}

		@Override
		protected void beforeCall() {
			super.beforeCall();
			setUpAmt(bridge.up1());
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up3().setAll(getDtlActL().subList(r -> r.check()));
			bridge.up4().setAll(getDtlAdvPayActL().subList(r -> r.check()));
		}

		@Override
		protected boolean checkUpListParamEmpty() { 
			if (!checkUpListParamEmptyCustom()) {
				showNoUpListDataMsg();
				return false;
			}
			return true;
		}

		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			customConfirmForCallStack(getHdrR(), msgList);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(getDtlSchdL().subList(r -> r.isStatusDelete() && r.last_setoff_act_flg())));
		}
	}

	/**
	 * [MS_MSBHL0030_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0030_Del01Caller<P extends MSBHP_PaySchdReg, B extends MS_MSBHL0030_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {
		protected MS_MSBHL0030_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up1().clear();
			for (DtlApdR row : getDtlApdL()) {
				if (!isNull(row.pay_chk_no())) {
					bridge.up1().add(row);
				}
			}
		}

		@Override
		protected boolean checkUpListParamEmpty() {
			if (!checkUpListParamEmptyCustom()) {
				showNoUpListDataMsg();
				return false;
			}
			return true;
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(getDtlSchdL().subList(r -> r.last_setoff_act_flg())));
		}
	}

	/**
	 * [MS_MSBHL0030_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0030_Prnt01Caller<P extends MSBHP_PaySchdReg, B extends MS_MSBHL0030_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {
		protected MS_MSBHL0030_Prnt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * 消費税差額取得ボタンによって取得された差額分か
	 */
	protected boolean isSrchTaxDiff(DtlApdR r) {
		if (!MAC_TRD_PTN_TYP.isTAX_DIFF_PAY_SCHD_CL(r.trd_ptn_typ())) {
			return false;
		}
		else if (!isNull(r.pay_chk_no())) {
			return false;
		}
		return true;
	}

	/**
	 * 上り電文リストコンテナによる登録可能かをチェックする
	 */
	protected boolean checkUpListParamEmptyCustom() {
		if (exceptViewEmpty(DtlApdTable).isEmpty() && exceptViewEmpty(DtlSchdTable).isEmpty()) {
			// 両方の明細がない場合は登録可
			return true;
		}
		else if (!isEmptyOrAllDeleted(DtlSchdTable)) {
			// 支払予定枠が設定されている場合は登録可
			return true;
		}
		else {
			MCList<DtlApdR> list = getDtlApdL().subList(r -> !r.isStatusDelete() && !MAC_TRD_PTN_TYP.isTAX_DIFF_PAY_SCHD_CL(r.trd_ptn_typ()));
			if ((isNull(list) && list.isEmpty()) || list.sum(DtlApdR.$trd_cur_inc_tax_amt).isZero()) {
				// 買掛明細枠が設定されているが、税差額を除いた金額＝０（全額繰越、もしくは仕入実績の金額が０）の場合も登録可
				return true;
			}
		}
		return false;
	}

	/**
	 * テーブルが空、もしくは全て行削除されている場合true,それ以外はfalseを返す。
	 */
	protected boolean isEmptyOrAllDeleted(MCTable<?> tbl) {
		MCList<?> list = exceptViewEmpty(tbl);
		if (list.size() == 0
			|| list.size() == list.subList(MCRow.DELETE).size()){
			return true;
		}
		return false;
	}

	/**
	 * 検索時の値を保持する。
	 */
	protected void setOldVal() {

		//old金額は、支払方式区分のイベントや、
		//更新前のチェック処理で使用される。
		for(DtlApdR r :getDtlApdL() ){
			if (!isNull(r.co_src_trd_cur_amt()) || !isNull(r.co_src_trd_cur_tax_amt())) {
				r.old_trd_cur_inc_tax_amt(MCNumber.sum(r.co_src_trd_cur_amt(), r.co_src_trd_cur_tax_amt()));	
			}
			else {
				r.old_trd_cur_inc_tax_amt(r.trd_cur_inc_tax_amt());
			}
			r.old_trd_cur_amt(isNull(r.co_src_trd_cur_amt()) ? r.trd_cur_amt() : r.co_src_trd_cur_amt());
			r.old_trd_cur_tax_amt(isNull(r.co_src_trd_cur_tax_amt()) ? r.trd_cur_tax_amt() : r.co_src_trd_cur_tax_amt());
			r.old_trd_cur_proc_amt(isNull(r.co_src_trd_cur_proc_amt()) ? r.trd_cur_proc_amt() : r.co_src_trd_cur_proc_amt());
			r.old_trd_cur_onr_prov_amt(isNull(r.co_src_trd_cur_onr_prov_amt()) ? r.trd_cur_onr_prov_amt() : r.co_src_trd_cur_onr_prov_amt());
		}
	}

	/**
	 * 検索時の相殺関連項目を保持する。
	 */
	public void setOldVal(DtlSchdR srchR) {

		if (isSetoffAcstOrOutsrc(srchR)) {
			srchR.old_trd_cur_amt(srchR.trd_cur_amt());
			srchR.old_ap_setoff_typ(srchR.ap_setoff_typ());
			srchR.old_setoff_cd(srchR.setoff_cd());
			srchR.old_so_dpt_cd(srchR.so_dpt_cd());
			srchR.old_setoff_limit_amt(srchR.setoff_limit_amt());
			srchR.old_ar_typ(srchR.ar_typ());
		}
		else if (!isNull(srchR.adv_pay_act_no())) {
			srchR.old_trd_cur_amt(srchR.trd_cur_amt());
			srchR.old_adv_pay_act_no(srchR.adv_pay_act_no());
			srchR.old_setoff_schd_amt(srchR.setoff_schd_amt());
		}
	}

	/**
	 * 上り電文用の金額、税金額設定。
	 */
	protected void setUpAmt(MCList<DtlApdR> list) {
		for (DtlApdR r : list) {
			if (!isNull(r.trd_cur_amt())) {
				r.up_trd_cur_amt(r.trd_cur_amt().multiply(r.amt_disp_pm()));
			}
			if (!isNull(r.trd_cur_tax_amt())) {
				r.up_trd_cur_tax_amt(r.trd_cur_tax_amt().multiply(r.amt_disp_pm()));
			}
			r.pay_xrate(getHdrR().pay_xrate());
			if (!isNull(r.wtax_amt())) {
				r.up_wtax_amt(r.wtax_amt().multiply(r.amt_disp_pm()));
			}
			if (!isNull(r.trd_cur_proc_amt())) {
				r.up_trd_cur_proc_amt(r.trd_cur_proc_amt().multiply(r.amt_disp_pm()));
			}
			if (!isNull(r.trd_cur_onr_prov_amt())) {
				r.up_trd_cur_onr_prov_amt(r.trd_cur_onr_prov_amt().multiply(r.amt_disp_pm()));
			}
			// Sprt02用
			if (r.repurc_obli_flg()) {
				r.trd_cur_amt_tax_diff(r.up_trd_cur_proc_amt());
			}
			else {
				r.trd_cur_amt_tax_diff(r.up_trd_cur_amt());
			}
			r.xrate_base_dt(getHdrR().xrate_base_dt());
		}
		for (DtlActR r : getDtlActL()) {
			r.pay_xrate(getHdrR().pay_xrate());
			r.xrate_base_dt(getHdrR().xrate_base_dt());
		}
		for (DtlAdvPayActR r : getDtlAdvPayActL()) {
			r.pay_xrate(getHdrR().pay_xrate());
			r.xrate_base_dt(getHdrR().xrate_base_dt());
		}
	}

	/**
	 * 全額繰越行のみかどうか
	 * @return
	 */
	protected boolean isOnlyFullCo(MCList<DtlApdR> apdList) {
		if (apdList.isEmpty()) {
			return false;
		}
		return apdList.size() == apdList.subList(DtlApdR.$pay_mtd_typ, MSC_PAY_MTD_TYP.ALL_CO.value()).size();
	}


	// ----------------------チェック -----------------------
	/**
	 * 新規登録、更新共通確認処理
	 */
	protected void customConfirmForCallStack(HdrR hdr, MCMessageList msgList) {
		MCList<DtlSchdR> chkTgtL = 	exceptDeleteAndViewEmpty(DtlSchdTable);
		checkSetoffLimit(chkTgtL, msgList);
		checkDueDt(chkTgtL, msgList);
	}
	protected void checkSetoffLimit(MCList<DtlSchdR> schdList, MCMessageList msgList) {
		for (MCList<DtlSchdR> list : schdList.groupList(getPrspplKey())) {
			DtlSchdR r = list.get(0);
			if (isSetoffAcstOrOutsrc(r)) {
				//有償支給の場合、相殺先と支払先が異なれば確認メッセージを出力する
				if (MAC_AP_SETOFF_TYP.isPRSPPL(r.ap_setoff_typ()) && !isSame(r.asppl_cd(), r.setoff_cd())) {
					msgList.add(new MCMessage(r, DtlSchdR.$setoff_cd,
						MSBHP0003, r.setoff_cd(), r.asppl_cd()));
				}
			}
		}
		for (MCList<DtlSchdR> list : schdList.groupList(getSetoffKey())) {
			DtlSchdR r = list.get(0);
			if (isSetoffAcstOrOutsrc(r)) {
				if ( !(MAC_AP_SETOFF_TYP.isACST(r.ap_setoff_typ()) && getCo().ar_no_use_flg()) ) {
					if (r.setoff_limit_amt().isNegative()) {
						msgList.add(new MCMessage(r, DtlSchdR.$trd_cur_amt,
							MSBHP0004, r.setoff_limit_amt(), r.ap_setoff_typ(), r.setoff_cd(), r.so_dpt_cd()));
					}
				}
			}
		}
	}

	protected void checkDueDt(MCList<DtlSchdR> schdList, MCMessageList msgList) {

		for (DtlSchdR r : schdList) {
			if (!isNullOr(r.draw_dt(), getHdrR().note_days(), r.due_dt())) {
				MCDate dt = r.draw_dt().addDay(getHdrR().note_days());
				if (r.due_dt().gtDate(dt)) {
					msgList.add(new MCMessage(r, DtlSchdR.$due_dt, MSBHP0006,
							getHdrR().psppl_cd(), toYMDString(r.draw_dt()),	toYMDString(r.due_dt()), 
							MCNumber.valueOf(r.due_dt().diffDay(r.draw_dt())), getHdrR().note_days()));
				}
			}
		}
	}

	/**
	 * 相殺先ＣＤの存在チェックを行うかどうか
	 */
	protected boolean isChkSetoffBpCd(MCEventInfo info) {
		DtlSchdR r = getDtlSchdL().get(info.getEventIndex());
		
		if (isNull(info.getNewValue())) {
			return false;
		}
		if (isNull(r.ap_setoff_typ())) {
			return false;
		}
		if (MAC_AP_SETOFF_TYP.isFLEX(r.ap_setoff_typ())) {
			//任意のときはチェックしない
			return false;
		}
		return true;
	}


	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMS_MSBHL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_apd]の押下時の処理
	 */
	@Override
	public void doCnd_srch_apd(MCEventInfo info) {
		callMS_MSBHL0030_Srch02();
	}
	/**
	 * Panel[BtnApd]のボタン[open_MSBHP0040]の押下時の処理
	 */
	@Override
	public void doBtnApd_open_MSBHP0040(MCEventInfo info) {
		MCRow bind = MCRow.create();
		if (isOpenMSBHP0040Ins()) {
			setMSBHP0040bind(bind);
			openModalPanel("MS", "MSBHP0040", T1, bind, this);
		}
		else if (isOpenMSBHP0040Upd()) {
			setMSBHP0040bind(bind);
			openModalPanel("MS", "MSBHP0040", T2, bind, this);
		}
	}
	/**
	 * 支払対象選択を「登録する」で開くかどうか
	 * @return
	 */
	protected boolean isOpenMSBHP0040Ins() {
		String sts = getStatus();
		if (isSame(sts, INS_SRCH)) {
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * 支払対象選択を「訂正する」で開くかどうか
	 * @return
	 */
	protected boolean isOpenMSBHP0040Upd() {
		String sts = getStatus();
		if (isSame(sts, INS_REF) || isSame(sts, UPD)) {
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * 支払対象選択画面へ渡すためのバインド値を設定する。
	 */
	protected void setMSBHP0040bind(MCRow bind) {
		HdrR hdr = getHdrR();
		
		bind.addStringColumn("bsppl_cd", hdr.bsppl_cd());
		bind.addStringColumn("bsppl_dpt_cd", hdr.bsppl_dpt_cd());
		bind.addStringColumn("trd_cur_cd", hdr.trd_cur_cd());
		bind.addStringColumn("purc_act_no", hdr.purc_act_no());
		bind.addStringColumn("rcpt_iv_mng_no", hdr.rcpt_iv_mng_no());
		bind.addStringColumn("rcpt_iv_no", hdr.rcpt_iv_no());
		bind.addStringColumn("wrk_no", hdr.wrk_no());
		bind.addDateColumn("bsppl_cl_dt_to", hdr.bsppl_cl_dt());
		bind.addBooleanColumn("pay_spot_flg", hdr.pay_spot_flg());
	}
	/**
	 * 支払対象選択から渡されたリストを元にヘッダを設定する。
	 * @param list
	 */
	protected void setHdr(List<IfPayRqstBaseRow> list) {
		IfPayRqstBaseRow first = list.get(0);
		HdrR hdr = getHdrR();
		
		if (isNull(hdr.bsppl_cd())) {
			setValueEx(Hdr_bsppl_cd, first.bsppl_cd());
		}
		
		setValueEx(Hdr_bsppl_cl_ym, getDefBSpplClYm(list));
		getHdrR().bsppl_cl_day(getDefBSpplClDay(list));
		setBspplClDt(getHdrR());
		hdr.pay_spot_flg(first.pay_spot_flg());
		copyHdr(hdr, first);
		setXrateBaseDt();
		setPayXrateMode();
		setDefaultPayXRate();
	}
	
	/**
	 * 支払予定管理先締年月のデフォルト値を取得する。
	 * @return
	 */
	protected MCDate getDefBSpplClYm(List<IfPayRqstBaseRow> list) {
		MCDate bspplClDt = list.get(0).bsppl_cl_dt();
		MCDate bspplClYm = isNull(bspplClDt) ? null : bspplClDt.startOfMonth();
		//引数のリストと、画面に存在する明細の中で最早の締日の年月とする。
		for (DtlApdR r : getDtlApdL()) {
			if (!isNull(r.bsppl_cl_dt())) {
				if (r.bsppl_cl_dt().lt(bspplClDt)) {
					bspplClDt = r.bsppl_cl_dt();
					bspplClYm = bspplClDt.startOfMonth();
				}
			}
		}
		return bspplClYm;
	}
	/**
	 * 支払予定管理先締日付のデフォルト値を取得する。
	 * @return
	 */
	protected MCNumber getDefBSpplClDay(List<IfPayRqstBaseRow> list) {
		MCDate bspplClDt = list.get(0).bsppl_cl_dt();
		MCNumber bspplClDay = list.get(0).bsppl_cl_day();
		//引数のリストと、画面に存在する明細の中で最早の締日の日付とする。
		for (DtlApdR r : getDtlApdL()) {
			if (!isNull(r.bsppl_cl_dt())) {
				//bsppl_cl_dayだけで最早を判断してしまうと、
				// 3/20, 4/10のようなデータが混在していた場合、
				// 締日が3/10になってしまうので、bsppl_cl_dtが一番小さいrowの
				//bsppl_cl_dayを返すようにしている。
				if (r.bsppl_cl_dt().ltDate(bspplClDt)) {
					bspplClDt = r.bsppl_cl_dt();
					bspplClDay = r.bsppl_cl_day();
				}
			}
		}
		return bspplClDay;
	}
	/**
	 * 支払対象選択から受け取った明細を、この画面のヘッダにコピーする
	 * @param r
	 * @param first
	 */
	protected void copyHdr(HdrR hdr, IfPayRqstBaseRow first) {
		if (isNull(hdr.bsppl_dpt_cd())) {
			if (!hdr.pay_spot_flg() && isNull(hdr.bsppl_cl_dt())) {
				setValueEx(Hdr_bsppl_dpt_cd, null);
			} else {
				//支払予定管理先担当部門違いが複数選択されていた場合は、最初の行を採用する。
				setValueEx(Hdr_bsppl_dpt_cd, first.bsppl_dpt_cd());
				setValueEx(Hdr_bsppl_dpt_nm, first.bsppl_dpt_nm());
			}
		}
		setValueEx(Hdr_trd_cur_cd, first.trd_cur_cd());
		hdr.wrk_no(first.wrk_no());
		hdr.wrk_nm(first.wrk_nm());
		if (hdr.pay_spot_flg()) {
			hdr.rcpt_iv_mng_no(first.rcpt_iv_mng_no());
			hdr.rcpt_iv_no(first.rcpt_iv_no());
			if(MAC_STR.isNULL_VAL(first.rcpt_iv_mng_no())) {
				hdr.purc_act_no(first.purc_act_no());
			} else {
				hdr.purc_act_no(MAC_STR.NULL_VAL.value());
			}
		} else {
			hdr.purc_act_no(MAC_STR.NULL_VAL.value());
			hdr.rcpt_iv_mng_no(MAC_STR.NULL_VAL.value());
			hdr.rcpt_iv_no(MAC_STR.NULL_VAL.value());
		}
	}
	/**
	 * 支払対象選択から渡されたリストを元に支払依頼の明細を設定する。
	 * @param list
	 */
	protected void setDtlApd(List<IfPayRqstBaseRow> list) {

		MCList<DtlApdR> dtlL = MCList.create(DtlApdR.class);
		for (IfPayRqstBaseRow rqstRow : list) {
			DtlApdR r = DtlApdR.create();
			copyDtl(r, rqstRow);
			dtlL.add(r);
		}
		dtlL.setStatus(MCRow.Status.CREATE);
		getDtlApdL().addAll(dtlL);
	}
	
	/**
	 * 支払対象選択から受け取った明細を、この画面の明細にコピーする
	 * @param r
	 * @param rqstRow
	 */
	protected void copyDtl(DtlApdR r, IfPayRqstBaseRow rqstRow) {
		r.itm_cd(rqstRow.itm_cd());
		r.itm_sub1(rqstRow.itm_sub1());
		r.itm_sub2(rqstRow.itm_sub2());
		r.itm_sub3(rqstRow.itm_sub3());
		r.itm_nm(rqstRow.itm_nm());
		r.sundry_itm_flg(rqstRow.sundry_itm_flg());
		r.sppl_itm_cd(rqstRow.sppl_itm_cd());
		r.sppl_itm_nm(rqstRow.sppl_itm_nm());
		r.sno1(rqstRow.sno1());
		r.sno2(rqstRow.sno2());
		r.sno3(rqstRow.sno3());
		r.sno4(rqstRow.sno4());
		r.wrk_no(rqstRow.wrk_no());
		r.wrk_nm(rqstRow.wrk_nm());
		r.trd_cur_inc_tax_amt(rqstRow.trd_cur_inc_tax_amt());
		r.old_trd_cur_inc_tax_amt(r.trd_cur_inc_tax_amt());
		r.trd_cur_amt(rqstRow.trd_cur_amt());
		r.old_trd_cur_amt(r.trd_cur_amt());
		r.trd_cur_tax_amt(rqstRow.trd_cur_tax_amt());
		r.old_trd_cur_tax_amt(r.trd_cur_tax_amt());
		r.trd_cur_dscnt_amt(rqstRow.trd_cur_dscnt_amt());
		r.inc_tax_flg(rqstRow.inc_tax_flg());
		r.trd_cur_upri(rqstRow.trd_cur_upri());
		r.tax_cd(rqstRow.tax_cd());
		r.tax_nm(rqstRow.tax_nm());
		r.tax_rate(rqstRow.tax_rate());
		r.interim_flg(rqstRow.interim_flg());
		r.trd_cur_cd(rqstRow.trd_cur_cd());
		r.trd_cur_nm(rqstRow.trd_cur_nm());
		r.trd_cur_upri_dec_place(rqstRow.trd_cur_upri_dec_place());
		r.trd_cur_amt_dec_place(rqstRow.trd_cur_amt_dec_place());
		r.wtax_rate(rqstRow.wtax_rate());
		r.wtax_amt(rqstRow.wtax_amt());
		r.xrate(rqstRow.xrate());
		r.base_cur_upri(rqstRow.base_cur_upri());
		r.base_cur_amt(rqstRow.base_cur_amt());
		r.base_cur_tax_amt(rqstRow.base_cur_tax_amt());
		r.base_cur_dscnt_amt(rqstRow.base_cur_dscnt_amt());
		r.base_cur_inc_tax_amt(rqstRow.base_cur_inc_tax_amt());
		r.base_cur_cd(rqstRow.base_cur_cd());
		r.base_cur_nm(rqstRow.base_cur_nm());
		r.base_cur_amt_dec_place(rqstRow.base_cur_amt_dec_place());
		r.base_cur_upri_dec_place(rqstRow.base_cur_amt_dec_place());
		r.trd_unit_qty(rqstRow.trd_unit_qty());
		r.trd_unit_cd(rqstRow.trd_unit_cd());
		r.trd_unit_nm(rqstRow.trd_unit_nm());
		r.trd_unit_dec_place(rqstRow.trd_unit_dec_place());
		r.base_unit_qty(rqstRow.base_unit_qty());
		r.base_unit_cd(rqstRow.base_unit_cd());
		r.base_unit_nm(rqstRow.base_unit_nm());
		r.base_unit_dec_place(rqstRow.base_unit_dec_place());
		r.bp_dlv_slip_no(rqstRow.bp_dlv_slip_no());
		r.bp_dlv_slip_d_no(rqstRow.bp_dlv_slip_d_no());
		r.pay_mtd_typ(rqstRow.pay_mtd_typ());
		r.pay_mtd_typ_nm(rqstRow.pay_mtd_typ_nm());
		r.bsppl_cl_day(rqstRow.bsppl_cl_day());
		r.bsppl_cl_dt(rqstRow.bsppl_cl_dt());
		r.pay_crryovr_times(rqstRow.pay_crryovr_times());
		r.pay_basis_dt(rqstRow.pay_basis_dt());
		r.pay_schd_dt(rqstRow.pay_schd_dt());
		r.act_dt(rqstRow.act_dt());
		r.ac_dt(rqstRow.ac_dt());
		r.trd_cd(rqstRow.trd_cd());
		r.trd_nm(rqstRow.trd_nm());
		r.trd_ptn_typ(rqstRow.trd_ptn_typ());
		r.rcpt_iv_no(rqstRow.rcpt_iv_no());
		r.rcpt_iv_mng_no(rqstRow.rcpt_iv_mng_no());
		r.bsppl_cd(rqstRow.bsppl_cd());
		r.bsppl_dpt_cd(rqstRow.bsppl_dpt_cd());
		r.sppl_cd(rqstRow.sppl_cd());
		r.sppl_nm(rqstRow.sppl_nm());
		r.asppl_cd(rqstRow.asppl_cd());
		r.asppl_nm(rqstRow.asppl_nm());
		r.ap_dpt_cd(rqstRow.ap_dpt_cd());
		r.ap_dpt_nm(rqstRow.ap_dpt_nm());
		r.ap_typ(rqstRow.ap_typ());
		r.ap_typ_nm(rqstRow.ap_typ_nm());
		r.crryovr_flg(rqstRow.crryovr_flg());
		r.slip_sts_typ(rqstRow.slip_sts_typ());
		r.slip_sts_typ_nm(rqstRow.slip_sts_typ_nm());
		r.ap_d_no(rqstRow.ap_d_no());
		r.po_no(rqstRow.po_no());
		r.po_d_no(rqstRow.po_d_no());
		r.purc_act_no(rqstRow.purc_act_no());
		r.purc_act_d_no(rqstRow.purc_act_d_no());
		r.org_ap_d_no(rqstRow.org_ap_d_no());
		r.crryovr_ap_d_no(rqstRow.crryovr_ap_d_no());
		r.crryovr_src_ap_d_no(rqstRow.crryovr_src_ap_d_no());
		r.sw_src_pay_schd_no(rqstRow.sw_src_pay_schd_no());
		r.sw_src_rcv_bill_no(rqstRow.sw_src_rcv_bill_no());
		r.base_purc_ac_dt(rqstRow.base_purc_ac_dt());
		r.pay_ntc_d_print_rmrks(rqstRow.pay_ntc_d_print_rmrks());
		r.pay_schd_d_print_rmrks(rqstRow.pay_schd_d_print_rmrks());
		r.intr_rmrks(rqstRow.intr_rmrks());
		r.sub_char1(rqstRow.sub_char1());
		r.sub_char2(rqstRow.sub_char2());
		r.sub_char3(rqstRow.sub_char3());
		r.add_flg(rqstRow.add_flg());
		r.purc_tax_rnd_typ(rqstRow.purc_tax_rnd_typ());
		r.trd_unit_rnd_typ(rqstRow.trd_unit_rnd_typ());
		r.base_unit_rnd_typ(rqstRow.base_unit_rnd_typ());
		r.ap_d_upd_cntr(rqstRow.ap_d_upd_cntr());
		r.ref_ap_d_no(rqstRow.ref_ap_d_no());
		r.amt_disp_pm(rqstRow.amt_disp_pm());
		r.trd_cur_proc_upri(rqstRow.trd_cur_proc_upri());
		r.trd_cur_proc_amt(rqstRow.trd_cur_proc_amt());
		r.trd_cur_onr_prov_upri(rqstRow.trd_cur_onr_prov_upri());
		r.trd_cur_onr_prov_amt(rqstRow.trd_cur_onr_prov_amt());
		r.base_cur_proc_upri(rqstRow.base_cur_proc_upri());
		r.base_cur_proc_amt(rqstRow.base_cur_proc_amt());
		r.base_cur_onr_prov_upri(rqstRow.base_cur_onr_prov_upri());
		r.base_cur_onr_prov_amt(rqstRow.base_cur_onr_prov_amt());
		r.repurc_obli_flg(rqstRow.repurc_obli_flg());
		r.outsrc_flg(rqstRow.outsrc_flg());
		r.old_trd_cur_proc_amt(rqstRow.trd_cur_proc_amt());
		r.old_trd_cur_onr_prov_amt(rqstRow.trd_cur_onr_prov_amt());
	}

	/**
	 * Panel[BtnApd]のボタン[srch_tax]の押下時の処理
	 */
	@Override
	public void doBtnApd_srch_tax(MCEventInfo info) {
		callMS_MSBHL0030_Sprt02();
	}

	/**
	 * Panel[BtnApd]のボタン[srch_onr_prov_bal]の押下時の処理
	 */
	@Override
	public void doBtnApd_srch_onr_prov_bal(MCEventInfo info) {
		callMS_MSBHL0030_Sprt04();
	}

	/**
	 * Panel[BtnApd]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtnApd_rdel(MCEventInfo info) {
		DtlApdR r = DtlApdTable.getSelectedMCRow();
		if (!isNull(r) && isSrchTaxDiff(r)) {
			// 差額分はまとめて削除する
			deleteRows(
				DtlApdTable,
				getDtlApdL().subList(rr -> isSrchTaxDiff(rr))
			);
		}
		else {
			deleteRow(DtlApdTable);
		}
		if (Cnd_ope_INS.isSelected()) {
			if (getDtlApdL().isEmpty()) {
				clearContainers(getHdrR(), getDtlSchdL(), getDtlActL(), getDtlAdvPayActL());
				setStatus(INS_SRCH);
				valueInit();
				setFocus();
			}
		}
	}
	/**
	 * Panel[BtnSchd]のボタン[srch_master]の押下時の処理
	 */
	@Override
	public void doBtnSchd_srch_master(MCEventInfo info) {
		callMS_MSBHL0030_Sprt01();
	}
	/**
	 * Panel[BtnSchd]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtnSchd_radd(MCEventInfo info) {
		insertRow(DtlSchdTable);
	}
	/**
	 * Panel[BtnSchd]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtnSchd_rdel(MCEventInfo info) {
		DtlSchdR r = deleteRow(DtlSchdTable);
		if (!isNull(r)) {
			// 削除される場合は null を渡す
			DtlSchdR delR = isNull(r.pay_schd_no()) || r.isStatusDelete() ? null : r;
			// 削除行⇒更新行への変更の場合は ゼロ を渡す
			MCNumber oldVal = r.trd_cur_amt();
			if (!isNull(r.pay_schd_no()) && !r.isStatusDelete()) {
				oldVal = MCNumber.ZERO;

				// 相殺対象額を取り直す
				if (!isNull(r.adv_pay_act_no())) {
					MCRow bind = getBindRowAdvPay(r.getGUIIndex());
					bind.addStringColumn(AdvPayCols.$i_adv_pay_act_no, r.adv_pay_act_no());
					MCList<?> list = getDtlSchd_adv_pay_act_no(bind, info);
					if (!isNull(list)) {
						// 前渡金相殺予定額の計算に使用することが目的なので、実績額や未消込残高などは再取得しない
						// （行削除では前渡金実績ＮＯが変わることがないので取得しなくても問題ない）
						r.setoff_schd_amt(list.getNumberNE(0, "trd_cur_setoff_schd_amt"));
					}
				}
				else {
					srchSetoffLimitAmt(r);
				}
			}
			setSetoffLimitAmt(delR, oldVal, false, r.ap_setoff_typ(), r.setoff_cd(), r.so_dpt_cd(), r.ar_typ());
			setSchdSetoffAmt(delR, oldVal, false, r.adv_pay_act_no());
		}
	}
	/**
	 * Panel[BtnSchd]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtnSchd_rcopy(MCEventInfo info) {
		DtlSchdR r = copyRow(DtlSchdTable);
		if (!isNull(r)) {
			setSetoffLimitAmt(r, null, true, r.ap_setoff_typ(), r.setoff_cd(), r.so_dpt_cd(), r.ar_typ());
			setSchdSetoffAmt(r, null, true, r.adv_pay_act_no());
		}
	}
	@Override
	public void doDtlAct_check_NC(MCEventInfo info) {
		super.doDtlAct_check_NC(info);
		setPayTab();
	}
	/**
	 * Panel[BtnAct]のボタン[srch_act]の押下時の処理
	 */
	@Override
	public void doBtnAct_srch_act(MCEventInfo info) {
		callMS_MSBHL0030_Sprt05();
	}
	/**
	 * Panel[BtnAct]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtnAct_select_all(MCEventInfo info) {
		doSelectAll(DtlActTable);
	}
	/**
	 * Panel[BtnAct]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtnAct_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlActTable);
	}
	/**
	 * Panel[BtnAdvPayAct]のボタン[srch_ady_pay_act]の押下時の処理
	 */
	@Override
	public void doBtnAdvPayAct_srch_ady_pay_act(MCEventInfo info) {
		callMS_MSBHL0030_Sprt06();
	}
	/**
	 * Panel[BtnAdvPayAct]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtnAdvPayAct_select_all(MCEventInfo info) {
		doSelectAll(DtlAdvPayActTable);
	}
	/**
	 * Panel[BtnAdvPayAct]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtnAdvPayAct_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlAdvPayActTable);
	}
	/**
	 * Panel[Btn]のボタン[open_MSBHP0190]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBHP0190(MCEventInfo info) {
		openMSBDP0190(info);
	}
	/**
	 * Panel[Btn]のボタン[prnt_pay_schd_dtl]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_pay_schd_dtl(MCEventInfo info) {
		HdrR hdrR = getHdrR();
		hdrR.pay_schd_dtl_prnt_btn_flg(true);
		hdrR.pay_ntc_prnt_btn_flg(false);
		callMS_MSBHL0030_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[prnt_pay_ntc]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_pay_ntc(MCEventInfo info) {
		HdrR hdrR = getHdrR();
		hdrR.pay_schd_dtl_prnt_btn_flg(false);
		hdrR.pay_ntc_prnt_btn_flg(true);
		callMS_MSBHL0030_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBHL0030_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBHL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBHL0030_Del01();
	}
	
	//IfPayRqstBase
	@Override
	public void addPayRqstListIns(List<IfPayRqstBaseRow> list) {
		if (!list.isEmpty()) {
			setDtlApd(list);
			setHdr(list);
			setTtlRqstAmt();
			DtlApdTable.selectTerminalRecord(false);
			setStatus(INS_REF);
		}
	}
		
	@Override
	public void addPayRqstListUpd(List<IfPayRqstBaseRow> list) {
		if (!list.isEmpty()) {
			setDtlApd(list);
			setTtlRqstAmt();
			setBtnSchdMode();
			DtlApdTable.selectTerminalRecord(false);
		}
	}

	@Override
	public String[] getExceptPayRqstNoArr() {
		MCList<DtlApdR> list = getDtlApdL().subList(DtlApdR.$pay_chk_no, null);
		// 繰越された買掛明細
		MCList<DtlApdR> coList = MCList.create(DtlApdR.class);
		// 繰越された買掛明細は同時に処理できないようにする
		for (DtlApdR r : getDtlApdL()) {
			if (!isNull(r.crryovr_ap_d_no())) {
				coList.add(r);
			}
		}

		String[] ret = new String[list.size() + coList.size()];
		int idx = 0;
		for (DtlApdR r : list) {
			ret[idx] = r.ap_d_no();
			idx++;
		}
		for (DtlApdR r : coList) {
			ret[idx] = r.crryovr_ap_d_no();
			idx++;
		}
		return ret;
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		// ヘッダ枠
		Hdr_ap_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_onr_prov_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_trd_cur_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_trd_cur_com_paid_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_trd_cur_com_paid_tax_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_base_cur_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_amt_dec_place);
		Hdr_base_cur_com_paid_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_amt_dec_place);
		Hdr_base_cur_com_paid_tax_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_amt_dec_place);

		// 買掛明細
		DtlApd_trd_cur_amt_p_PPanel.setRelateBeans(columnDtlApd_trd_cur_cd, columnDtlApd_trd_cur_amt_dec_place);
		DtlApd_trd_cur_tax_amt_p_PPanel.setRelateBeans(columnDtlApd_trd_cur_cd, columnDtlApd_trd_cur_amt_dec_place);
		DtlApd_trd_cur_dscnt_amt_p_PPanel.setRelateBeans(columnDtlApd_trd_cur_cd, columnDtlApd_trd_cur_amt_dec_place);
		DtlApd_trd_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnDtlApd_trd_cur_cd, columnDtlApd_trd_cur_amt_dec_place);
		DtlApd_trd_cur_upri_p_PPanel.setRelateBeans(columnDtlApd_trd_cur_cd, columnDtlApd_trd_cur_upri_dec_place);
		DtlApd_base_cur_amt_p_PPanel.setRelateBeans(columnDtlApd_base_cur_cd, columnDtlApd_base_cur_amt_dec_place, columnDtlApd_trd_cur_amt, columnDtlApd_xrate);
		DtlApd_base_cur_tax_amt_p_PPanel.setRelateBeans(columnDtlApd_base_cur_cd, columnDtlApd_base_cur_amt_dec_place);
		DtlApd_base_cur_dscnt_amt_p_PPanel.setRelateBeans(columnDtlApd_base_cur_cd, columnDtlApd_base_cur_amt_dec_place);
		DtlApd_base_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnDtlApd_base_cur_cd, columnDtlApd_base_cur_amt_dec_place);
		DtlApd_base_cur_upri_p_PPanel.setRelateBeans(columnDtlApd_base_cur_cd, Hdr_base_cur_upri_dec_place);
		DtlApd_wtax_amt_p_PPanel.setRelateBeans(columnDtlApd_base_cur_cd, columnDtlApd_base_cur_amt_dec_place);
		DtlApd_trd_unit_qty_p_PPanel.setRelateBeans(columnDtlApd_trd_unit_cd, columnDtlApd_trd_unit_dec_place);
		DtlApd_base_unit_qty_p_PPanel.setRelateBeans(columnDtlApd_base_unit_cd, columnDtlApd_base_unit_dec_place);
		DtlApd_xrate_p_PPanel.setRelateBeans(columnDtlApd_trd_cur_cd, columnDtlApd_base_cur_cd, Hdr_xrate_cd, columnDtlApd_ac_dt, true);
		DtlApd_trd_cur_proc_amt_p_PPanel.setRelateBeans(columnDtlApd_trd_cur_cd, columnDtlApd_trd_cur_amt_dec_place);
		DtlApd_trd_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnDtlApd_trd_cur_cd, columnDtlApd_trd_cur_amt_dec_place);
		DtlApd_trd_cur_proc_upri_p_PPanel.setRelateBeans(columnDtlApd_trd_cur_cd, columnDtlApd_trd_cur_upri_dec_place);
		DtlApd_trd_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnDtlApd_trd_cur_cd, columnDtlApd_trd_cur_upri_dec_place);
		DtlApd_base_cur_proc_amt_p_PPanel.setRelateBeans(columnDtlApd_base_cur_cd, columnDtlApd_base_cur_amt_dec_place, columnDtlApd_trd_cur_proc_amt, columnDtlApd_xrate);
		DtlApd_base_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnDtlApd_base_cur_cd, columnDtlApd_base_cur_amt_dec_place, columnDtlApd_trd_cur_onr_prov_amt, columnDtlApd_xrate);
		DtlApd_base_cur_proc_upri_p_PPanel.setRelateBeans(columnDtlApd_base_cur_cd, Hdr_base_cur_upri_dec_place);
		DtlApd_base_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnDtlApd_base_cur_cd, Hdr_base_cur_upri_dec_place);

		// 支払予定
		DtlSchd_trd_cur_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		DtlSchd_trd_cur_com_paid_tax_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		DtlSchd_base_cur_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_amt_dec_place, columnDtlSchd_trd_cur_amt, columnDtlSchd_xrate);
		DtlSchd_base_cur_com_paid_tax_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_amt_dec_place, columnDtlSchd_trd_cur_com_paid_tax_amt, columnDtlSchd_xrate);
		DtlSchd_setoff_limit_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		DtlSchd_adv_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		DtlSchd_setoff_schd_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		DtlSchd_setoff_act_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		DtlSchd_not_proc_bal_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		DtlSchd_xrate_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_base_cur_cd, Hdr_xrate_cd, Hdr_xrate_base_dt, true);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
		_startUpFlg = false;
	}

	protected void valueInitSub () {
		if (Cnd_ope_INS.isSelected()) {
			setValueEx(Hdr_reg_dt, getToday());

			setXrateBaseDt();
			// 支払照合為替レート
			setValueEx(Hdr_pay_xrate_cd, getCo().pay_xrate_cd());
			setPayXrateMode();
			setDefaultPayXRate();
			// 基準通貨
			setValueEx(Hdr_base_cur_cd, getBaseCur().cur_cd());
			setValueEx(Hdr_base_cur_nm, getBaseCur().cur_nm());
			setValueEx(Hdr_base_cur_amt_dec_place, getBaseCur().amt_dec_place());
			setValueEx(Hdr_base_cur_upri_dec_place, getBaseCur().upri_dec_place());
			setValueEx(Hdr_xrate_cd, getCo().purc_xrate_cd());
			setValueEx(Hdr_prnt_out_flg, true);
		}

		getHdrR().setStatus(MCRow.NONE);
	}

	@Override
	protected List<java.lang.String> getNotInheritCols(String type, MCContainer cont) {
		List<String> colL = super.getNotInheritCols(type, cont);
		if (isSame(type, NOT_INHERIT_TYPE_COPY_ROW)) {
			// 行コピーで引き継がない項目
			if (cont == getDtlSchdL()) {
				colL.add(DtlSchdR.$pay_schd_no);
				colL.add(DtlSchdR.$trd_cur_appl_amt);
				colL.add(DtlSchdR.$pay_sts_typ);
				colL.add(DtlSchdR.$pay_sts_typ_nm);
				colL.add(DtlSchdR.$sw_flg);
				colL.add(DtlSchdR.$last_setoff_act_flg);
				colL.add(DtlSchdR.$can_ac_dt_dummy);
				colL.add(DtlSchdR.$can_ac_dt_for_input);
				colL.add(DtlSchdR.$can_ac_dt);
				colL.add(DtlSchdR.$ac_dt_after_srch);
			}
		}
		return colL;
	}



	// -----------------------------------------------
	// リスナ
	// -----------------------------------------------
	protected DtlApdRowListener createDtlApdRowListener() {
		return new DtlApdRowListener();
	}
	protected class DtlApdRowListener extends MAUDP_RowListener {
		@Override
		public void valueChanged(MCRowEvent event) {
			if (isRqstAmtEventCols(event)) {
				setTtlRqstAmt();
				setPayTab();
			}
		}
		@Override
		public void statusChanged(MCRowStatusEvent event) {
			setTtlRqstAmt();
			setPayTab();
		}
	}
	protected DtlApdListListener createDtlApdListListener() {
		return new DtlApdListListener();
	}
	protected class DtlApdListListener extends MAUDP_ListListener {
		@Override
		protected void setSum(MCListEvent event) {
			setTtlRqstAmt();
			setPayTab();
		}	
		@Override
		protected void clearSum(MCListEvent event) {
			setTtlRqstAmt();
			setPayTab();
		}
	}

	protected boolean isRqstAmtEventCols(MCRowEvent event) {
		String col = event.getColumn();
		return isSame(col, columnDtlApd_trd_cur_inc_tax_amt.getBaseRowColumnName())
				|| isSame(col, columnDtlApd_ap_typ.getBaseRowColumnName());
	}

	protected void setTtlRqstAmt() {
		getHdrR().ap_amt(getTtlRqstAmt());
	}

	protected MCNumber getTtlRqstAmt() {
		MCList<DtlApdR> list = getDtlApdL().subList(getPayRqstAmtSumListMatcher());
		
		if (list.isEmpty()) {
			return null;
		}
		else {
			return list.sum(DtlApdR.$trd_cur_inc_tax_amt);
		}
	}

	protected PayRqstAmtSumListMatcher<DtlApdR> getPayRqstAmtSumListMatcher() {
		return new PayRqstAmtSumListMatcher<DtlApdR>();
	}
	protected class PayRqstAmtSumListMatcher<R extends DtlApdR> implements MCRowMatcher<R> {
		@Override
		public boolean match(R r) {
			if (r.isStatusDelete()) {
				return false;
			}
			if (isNull(r.trd_cur_inc_tax_amt()) || isNull(r.ap_typ())) {
				return false;
			}
			return true;
		}
	}


	protected DtlSchdRowListener createDtlSchdRowListener() {
		return new DtlSchdRowListener();
	}
	protected class DtlSchdRowListener extends MAUDP_RowListener {
		@Override
		public void valueChanged(MCRowEvent event) {
			if (isAmtEventCols(event)) {
				setTtlAmt();
				setTtlComPaid();
				setTtlTaxAmt();
				setPayTab();
			}
		}
		@Override
		public void statusChanged(MCRowStatusEvent event) {	
			setTtlAmt();
			setTtlComPaid();
			setTtlTaxAmt();
			setPayTab();
		}
	}
	protected DtlSchdListListener createDtlSchdListListener() {
		return new DtlSchdListListener();
	}
	protected class DtlSchdListListener extends MAUDP_ListListener {
		@Override
		protected void setSum(MCListEvent event) {
			setTtlAmt();
			setTtlComPaid();
			setTtlTaxAmt();
		}	
		@Override
		protected void clearSum(MCListEvent event) {
			setTtlAmt();
			setTtlComPaid();
			setTtlTaxAmt();
		}
	}
	protected boolean isAmtEventCols(MCRowEvent event) {
		String col = event.getColumn();
		return isSame(col, columnDtlSchd_ap_sttl_typ.getBaseRowColumnName())
				|| isSame(col, columnDtlSchd_trd_cur_amt.getBaseRowColumnName())
				|| isSame(col, columnDtlSchd_trd_cur_com_paid_tax_amt.getBaseRowColumnName())
				|| isSame(col, columnDtlSchd_base_cur_amt.getBaseRowColumnName())
				|| isSame(col, columnDtlSchd_base_cur_com_paid_tax_amt.getBaseRowColumnName());
	}

	protected void setTtlAmt() {
		MCNumber[] amt = getTtlAmt();
		getHdrR().trd_cur_amt(amt[0]);
		getHdrR().base_cur_amt(amt[1]);
	}

	protected MCNumber[] getTtlAmt() {
		MCList<DtlSchdR> list = getDtlSchdL().subList(getAmtSumListMatcher());
		if (list.isEmpty()) {
			return new MCNumber[]{null, null};
		}
		else {
			return new MCNumber[]{
				list.sum(DtlSchdR.$trd_cur_amt),
				list.sum(DtlSchdR.$base_cur_amt)
			};
		}
	}

	protected void setTtlComPaid() {
		MCNumber[] amt = getTtlComPaid();
		getHdrR().trd_cur_com_paid_amt(amt[0]);
		getHdrR().base_cur_com_paid_amt(amt[1]);
	}
	protected MCNumber[] getTtlComPaid() {
		MCList<DtlSchdR> list = getDtlSchdL().subList(getComPaidSumListMatcher());
		if (list.isEmpty()) {
			return new MCNumber[]{null, null};
		}
		else {
			return new MCNumber[]{
				list.sum(DtlSchdR.$trd_cur_amt),
				list.sum(DtlSchdR.$base_cur_amt)
			};
		}
	}

	protected void setTtlTaxAmt() {
		MCNumber[] amt = getTtlTaxAmt();
		getHdrR().trd_cur_com_paid_tax_amt(amt[0]);
		getHdrR().base_cur_com_paid_tax_amt(amt[1]);
	}
	protected MCNumber[] getTtlTaxAmt() {
		MCList<DtlSchdR> list = getDtlSchdL().subList(getCTaxAmtSumListMatcher());
		if (list.isEmpty()) {
			return new MCNumber[]{null, null};
		}
		else {
			return new MCNumber[]{
				list.sum(DtlSchdR.$trd_cur_com_paid_tax_amt),
				list.sum(DtlSchdR.$base_cur_com_paid_tax_amt)
			};
		}
	}

	protected AmtSumListMatcher<DtlSchdR> getAmtSumListMatcher() {
		return new AmtSumListMatcher<DtlSchdR>();
	}
	protected class AmtSumListMatcher<R extends DtlSchdR> implements MCRowMatcher<R> {
		public boolean match(R r) {
			if (r.isStatusDelete()) {
				return false;
			}
			if (isNull(r.trd_cur_amt()) || isNull(r.ap_sttl_typ())) {
				return false;
			}
			return !MAC_AP_STTL_TYP.is_com_paid(r.ap_sttl_typ());
		}
	}

	protected ComPaidSumListMatcher<DtlSchdR> getComPaidSumListMatcher() {
		return new ComPaidSumListMatcher<DtlSchdR>();
	}
	protected class ComPaidSumListMatcher<R extends DtlSchdR> implements MCRowMatcher<R> {
		public boolean match(R r) {
			if (r.isStatusDelete()) {
				return false;
			}
			if (isNull(r.trd_cur_amt()) || isNull(r.ap_sttl_typ())) {
				return false;
			}
			return MAC_AP_STTL_TYP.is_com_paid(r.ap_sttl_typ());
		}
	}

	protected CTaxAmtSumListMatcher<DtlSchdR> getCTaxAmtSumListMatcher() {
		return new CTaxAmtSumListMatcher<DtlSchdR>();
	}
	protected class CTaxAmtSumListMatcher<R extends DtlSchdR> implements MCRowMatcher<R> {
		public boolean match(R r) {
			if (r.isStatusDelete()) {
				return false;
			}
			if (isNull(r.trd_cur_com_paid_tax_amt())) {
				return false;
			}
			return true;
		}
	}


	// -----------------------------------------------
	// イベント
	// -----------------------------------------------
	@Override
	protected void listenerInit() {
		super.listenerInit();
		
		Hdr_bsppl_dpt_cd.addLCListener(this);

		columnDtlApd_trd_cur_amt.addLCListener(this);
		columnDtlApd_trd_cur_tax_amt.addLCListener(this);
		columnDtlApd_trd_cur_inc_tax_amt.addLCListener(this);
		columnDtlApd_base_cur_amt.addLCListener(this);
		columnDtlApd_base_cur_tax_amt.addLCListener(this);
		columnDtlSchd_trd_cur_amt.addLCListener(this);
		columnDtlApd_trd_cur_proc_amt.addLCListener(this);

		setListListener(DtlApdTable, createDtlApdRowListener());
		setListListener(DtlSchdTable, createDtlSchdRowListener());
	}

	@Override
	protected FXBAP_ListListener createFXBAP_ListListener(MCTable tl) {
		if (tl == DtlApdTable) {
			return createDtlApdListListener();
		}
		else if (tl == DtlSchdTable) {
			return createDtlSchdListListener();
		}
		return super.createFXBAP_ListListener(tl);
	}

	@Override
	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		if (!super.doVCEvent(vc, info)) {
			return false;
		}
		if (vc == columnDtlSchd_trd_cur_amt) {
			return doDtlSchd_trd_cur_amt_VC(info);
		}
		else if (vc == Hdr_bsppl_dpt_cd) {
			return doHdr_bsppl_dpt_cd_VC(info);
		}
		return true;
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == Hdr_bsppl_dpt_cd) {
			doHdr_bsppl_dpt_cd_LC(info);
		}
		else if (lc == Hdr_pay_xrate) {
			doHdr_pay_xrate_LC(info);
		}
		else if (lc == columnDtlApd_trd_cur_amt) {
			doDtlApd_trd_cur_amt_LC(info);
		}
		else if (lc == columnDtlApd_trd_cur_tax_amt) {
			doDtlApd_trd_cur_tax_amt_LC(info);
		}
		else if (lc == columnDtlApd_trd_cur_inc_tax_amt) {
			doDtlApd_trd_cur_inc_tax_amt_LC(info);
		}
		else if (lc == columnDtlApd_base_cur_amt) {
			doDtlApd_base_cur_amt_LC(info);
		}
		else if (lc == columnDtlApd_base_cur_tax_amt) {
			doDtlApd_base_cur_tax_amt_LC(info);
		}
		else if (lc == columnDtlSchd_trd_cur_amt) {
			doDtlSchd_trd_cur_amt_LC(info);
		}
		else if (lc == columnDtlApd_trd_cur_proc_amt) {
			doDtlApd_trd_cur_proc_amt_LC(info);
		}
	}


	//-- 登録枠
	@Override
	public void doHdr_reg_dt_LC(MCEventInfo info) {
		super.doHdr_reg_dt_LC(info);

		if (getHdrR().pay_spot_flg()) {
			// 都度支払の場合、支払管理先部門は登録日でマスタを参照するので、登録日が変わったらクリアする
			setValueEx(Hdr_bsppl_dpt_cd, null);
		}
		setXrateBaseDt();
		// 為替レート
		setDefaultRate();
		// 支払照合為替レート
		setValueEx(Hdr_pay_xrate_cd, getCo().pay_xrate_cd());
		setDefaultPayXRate();
	}

	@Override
	public boolean doHdr_bsppl_cd_VC(MCEventInfo info) {
		if (!super.doHdr_bsppl_cd_VC(info)) {
			return false;
		}
		return isStatusNone(getDtlActL(), getDtlAdvPayActL()) || confirmRegDataClear();
	}
	@Override
	public void doHdr_bsppl_cd_LC(MCEventInfo info) {
		super.doHdr_bsppl_cd_LC(info);
		DtlActTable.clear();
		DtlAdvPayActTable.clear();
		setValueEx(Hdr_bsppl_cl_ym, null);
		setValueEx(Hdr_bsppl_cl_day, null);
		setBspplClMode();
		for (DtlSchdR r : getDtlSchdL()) {
			setPayBankAcCd(r.getGUIIndex());
			setSetoffCd(r.getGUIIndex());
			setAdvPayActNo(r.getGUIIndex());
		}
		setLastPaySchdAmt();
		setPayTab();
	}
	public boolean doHdr_bsppl_dpt_cd_VC(MCEventInfo info) {
		return isStatusNone(getDtlActL(), getDtlAdvPayActL()) || confirmRegDataClear();
	}
	public void doHdr_bsppl_dpt_cd_LC(MCEventInfo info) {
		DtlActTable.clear();
		DtlAdvPayActTable.clear();
		for (DtlSchdR r : getDtlSchdL()) {
			setBankAcCd(r.getGUIIndex());
		}
		setLastPaySchdAmt();
		setPayTab();
	}

	@Override
	public void doHdr_bsppl_cl_ym_LC(MCEventInfo info) {
		super.doHdr_bsppl_cl_ym_LC(info);
		setBspplClDt(getHdrR());
	}

	@Override
	public void doHdr_bsppl_cl_day_LC(MCEventInfo info) {
		super.doHdr_bsppl_cl_day_LC(info);
		setBspplClDt(getHdrR());
	}
	@Override
	public void doHdr_bsppl_cl_dt_LC(MCEventInfo info) {
		super.doHdr_bsppl_cl_dt_LC(info);
		DtlActTable.clear();
		DtlAdvPayActTable.clear();
		// 締支払の場合、支払管理先部門は締年月日でマスタを参照するので、締年月日が変わったらクリアする
		setValueEx(Hdr_bsppl_dpt_cd, null);
		setXrateBaseDt();
		// 支払照合為替レート
		setValueEx(Hdr_pay_xrate_cd, getCo().pay_xrate_cd());
		setDefaultPayXRate();
		setLastPaySchdAmt();
		setPayTab();
	}

	@Override
	public boolean doHdr_trd_cur_cd_VC(MCEventInfo info) {
		if (!super.doHdr_trd_cur_cd_VC(info)) {
			return false;
		}
		return isStatusNone(getDtlActL(), getDtlAdvPayActL()) || confirmRegDataClear();
	}
	@Override
	public void doHdr_trd_cur_cd_LC(MCEventInfo info) {
		super.doHdr_trd_cur_cd_LC(info);
		DtlActTable.clear();
		DtlAdvPayActTable.clear();
		for (DtlSchdR r : getDtlSchdL()) {
			if (isNull(getHdrR().trd_cur_cd())) {
				setValueEx(columnDtlSchd_trd_cur_com_paid_tax_cd, r.getGUIIndex(), null);
			}
			setDefaultRate(r.getGUIIndex());
			setAdvPayActNo(r.getGUIIndex());
		}
		setLastPaySchdAmt();
		setPayTab();
		setPayXrateMode();
		setDefaultPayXRate();
	}

	@Override
	public void doHdr_pay_xrate_LC(MCEventInfo info) {
		super.doHdr_pay_xrate_LC(info);
		for (DtlApdR r : getDtlApdL()) {
			r.pay_xrate(getHdrR().pay_xrate());
		}
	}

	@Override
	public void doHdr_aprv_rvrs_flg_NC(MCEventInfo info) {
		super.doHdr_aprv_rvrs_flg_NC(info);
		if (Cnd_ope_UPD.isSelected()) {
			setStatus(UPD);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setStatus(DEL);
		}
		setFocus();
	};

	/**
	 * 支払先締年月、支払先締日付を元に支払先締日を設定する。
	 */
	protected void setBspplClDt(HdrR hdr) {
		if (isNullOr(hdr.bsppl_cl_ym(), hdr.bsppl_cl_day())) {
			setValueEx(Hdr_bsppl_cl_dt, null);
		}
		else {
			if (hdr.bsppl_cl_ym().endOfMonth().getDay() <= hdr.bsppl_cl_day().intValue()) {
				setValueEx(Hdr_bsppl_cl_dt, hdr.bsppl_cl_ym().endOfMonth());
			}
			else {
				setValueEx(Hdr_bsppl_cl_dt,
						hdr.bsppl_cl_ym().startOfMonth().addDay(hdr.bsppl_cl_day().subtract(MCNumber.ONE)));
			}
		}
	}
	/**
	 * 繰越後締日を設定する。
	 */
	protected void setCoDt(DtlApdR apdR) {
		if (isNullOr(apdR.bsppl_cl_dt(), apdR.crryovr_times(), getHdrR().bsppl_cd())) {
			return;
		}

		// 繰越後締日を設定
		DtlApdR workR = apdR.clone();
		workR.bsppl_cd(getHdrR().bsppl_cd());
		workR.pay_basis_dt(getHdrR().bsppl_cl_dt());	// 支払期日のカラムを使用して締日を取得する

		MSUCP_ApUtil.setBspplClDt(
			workR,
			DtlApdR.$bsppl_cd,
			DtlApdR.$pay_basis_dt,
			DtlApdR.$crryovr_times,
			DtlApdR.$co_bsppl_cl_dt,
			DtlApdR.$co_bsppl_cl_ym,
			DtlApdR.$co_bsppl_cl_day,
			this);

		apdR.co_bsppl_cl_dt(workR.co_bsppl_cl_dt());
		apdR.co_bsppl_cl_ym(workR.co_bsppl_cl_ym());
		apdR.co_bsppl_cl_day(workR.co_bsppl_cl_day());
	}


	//-- 買掛明細枠
	@Override
	public void doDtlApd_NC(MCEventInfo info) {
		super.doDtlApd_NC(info);
		setBtnApdMode();
	}

	@Override
	public void doDtlApd_pay_mtd_typ_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlApdR r = getDtlApdL().get(index);

		if (MSC_PAY_MTD_TYP.isALL_PAY(r.pay_mtd_typ())) {
			setValueEx(columnDtlApd_trd_cur_amt, index, r.old_trd_cur_amt());
			setValueEx(columnDtlApd_trd_cur_tax_amt, index, r.old_trd_cur_tax_amt());
			setValueEx(columnDtlApd_trd_cur_inc_tax_amt, index, r.old_trd_cur_inc_tax_amt());
			setValueEx(columnDtlApd_crryovr_times, index, null);
			setValueEx(columnDtlApd_co_bsppl_cl_dt, index, null);
			setValueEx(columnDtlApd_co_bsppl_cl_ym, index, null);
			setValueEx(columnDtlApd_co_bsppl_cl_day, index, null);
			if (r.outsrc_flg()) {
				setValueEx(columnDtlApd_trd_cur_proc_amt, index, r.old_trd_cur_proc_amt());
				setValueEx(columnDtlApd_trd_cur_onr_prov_amt, index, r.old_trd_cur_onr_prov_amt());
			}
		}
		else if (MSC_PAY_MTD_TYP.isPART_PAY(r.pay_mtd_typ())) {
			if (!isPayCoTimesReadOnly(r) && isNull(r.crryovr_times())) {
				setValueEx(columnDtlApd_crryovr_times, index, MCNumber.ONE);
			}
		}
		else if (MSC_PAY_MTD_TYP.isALL_CO(r.pay_mtd_typ())) {
			setValueEx(columnDtlApd_trd_cur_amt, index, MCNumber.ZERO);
			setValueEx(columnDtlApd_trd_cur_tax_amt, index, MCNumber.ZERO);
			setValueEx(columnDtlApd_trd_cur_inc_tax_amt, index, MCNumber.ZERO);
			if (!isPayCoTimesReadOnly(r) && isNull(r.crryovr_times())) {
				setValueEx(columnDtlApd_crryovr_times, index, MCNumber.ONE);
			}
			if (r.outsrc_flg()) {
				setValueEx(columnDtlApd_trd_cur_proc_amt, index,  MCNumber.ZERO);
				if (!isNull(r.trd_cur_onr_prov_amt())) {
					setValueEx(columnDtlApd_trd_cur_onr_prov_amt, index, MCNumber.ZERO);
				}
			}
		}
	}

	@Override
	public void doDtlApd_crryovr_times_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		if (idx >= 0) {
			setCoDt(getDtlApdL().get(idx));
		}
	}

	public void doDtlApd_trd_cur_amt_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlApdR r = getDtlApdL().get(index);
		if (!r.repurc_obli_flg()) {
			setPayTaxAmt(index);
		}
		setPayIncAmt(index);
		if (!r.repurc_obli_flg()) {
			setBCurTaxAmt(index);
		}
		setWtaxAmt(index);
	}
	public void doDtlApd_trd_cur_proc_amt_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlApdR r = getDtlApdL().get(index);
		if (!r.inc_tax_flg() && r.repurc_obli_flg()) {
			setPayTaxAmtRepurcObli(index);
			setPayIncAmt(index);
			setBCurTaxAmt(index);
		}
	}

	public void doDtlApd_trd_cur_tax_amt_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		setPayIncAmt(index);
		setBCurTaxAmt(index);
	}

	public void doDtlApd_trd_cur_inc_tax_amt_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlApdR r = getDtlApdL().get(index);
		if (!r.repurc_obli_flg()) {
			setPayIncTaxAmt(index);
			setBCurAmt(index);
			setBCurTaxAmt(index);
		}
		else {
			setBcurIncAmtRepurcObli(index);
		}
		setWtaxAmt(index);
	}

	public void doDtlApd_base_cur_amt_LC(MCEventInfo info) {
		setBcurIncAmt(info.getEventIndex());
	}

	public void doDtlApd_base_cur_tax_amt_LC(MCEventInfo info) {
		setBcurIncAmt(info.getEventIndex());
	}

	/**
	 * 税額を設定する。
	 */
	protected void setPayTaxAmt(int index) {
		DtlApdR r = getDtlApdL().get(index);
		MCNumber taxAmt = MCNumber.ZERO;
		if (!MAC_TRD_PTN_TYP.isAPSW_IN_CHK(r.trd_ptn_typ())) {
			taxAmt = MAUCP_AmtUtil.getTaxAmt(r.trd_cur_amt(), r.tax_rate(),
					r.trd_cur_amt_dec_place(), r.purc_tax_rnd_typ());
		}
		r.trd_cur_tax_amt(taxAmt);
	}
	/**
	 * 買戻義務がある場合の税額を設定する
	 * @param index イベント対象の行のインデックス値
	 */
	protected void setPayTaxAmtRepurcObli(int index) {
		DtlApdR r = getDtlApdL().get(index);
		MCNumber taxAmt = MCNumber.ZERO;
		if (!MAC_TRD_PTN_TYP.isAPSW_IN_CHK(r.trd_ptn_typ()) && r.repurc_obli_flg() && !r.inc_tax_flg()) {
			taxAmt = MAUCP_AmtUtil.getTaxAmt( r.trd_cur_proc_amt(), r.tax_rate(), r.trd_cur_amt_dec_place(), r.purc_tax_rnd_typ());
		}
		r.trd_cur_tax_amt(taxAmt);
	}

	/**
	 * 税抜金額、税額を元にして税込金額を設定する。
	 */
	protected void setPayIncAmt(int index) {
		DtlApdR r = getDtlApdL().get(index);
		
		if (isNullOr(r.trd_cur_amt(), r.trd_cur_tax_amt())) {
			r.trd_cur_inc_tax_amt(null);
		}
		else {
			r.trd_cur_inc_tax_amt(r.trd_cur_amt().add(r.trd_cur_tax_amt()));
		}
	}

	/**
	 * 税込金額から税抜金額、税額を設定する。
	 */
	protected void setPayIncTaxAmt(int index) {
		DtlApdR r = getDtlApdL().get(index);
		MCNumber taxAmt = MAUCP_AmtUtil.getIncTaxAmt(
				r.trd_cur_inc_tax_amt(), r.tax_rate(),
				r.trd_cur_amt_dec_place(), r.purc_tax_rnd_typ());

		r.trd_cur_tax_amt(taxAmt);
		r.trd_cur_amt(r.trd_cur_inc_tax_amt().subtract(r.trd_cur_tax_amt()));
	}

	/**
	 * 基準通貨税金額を設定する。
	 */
	protected void setBCurAmt(int index) {
		DtlApdR r = getDtlApdL().get(index);
		MCNumber bcurAmt = MAUCP_MCDataUtil.convToBaseCur(
						r.trd_cur_amt(),
						r.xrate(),
						r.base_cur_amt_dec_place(),
						getCo().xrate_rnd_typ());
		
		setValueEx(columnDtlApd_base_cur_amt, index, bcurAmt);
	}

	/**
	 * 基準通貨税金額を設定する。
	 */
	protected void setBCurTaxAmt(int index) {
		DtlApdR r = getDtlApdL().get(index);
		MCNumber bcurTaxAmt = MAUCP_MCDataUtil.convToBaseCur(
						r.trd_cur_tax_amt(),
						r.xrate(),
						r.base_cur_amt_dec_place(),
						getCo().xrate_rnd_typ());
		
		setValueEx(columnDtlApd_base_cur_tax_amt, index, bcurTaxAmt);
	}
	/**
	 * 基準通貨税込金額を設定する。
	 * @param index イベント対象の行のインデックス値
	 */
	protected void setBcurIncAmtRepurcObli(int index) {
		DtlApdR r = getDtlApdL().get(index);
		MCNumber bcurIncTaxAmt = MAUCP_MCDataUtil.convToBaseCur(
						r.trd_cur_inc_tax_amt(),
						r.xrate(),
						r.base_cur_amt_dec_place(),
						getCo().xrate_rnd_typ());
		
		setValueEx(columnDtlApd_base_cur_inc_tax_amt, index, bcurIncTaxAmt);
	}

	/**
	 * （基準通貨）税抜金額、税金額を元にして税込金額を設定する。
	 */
	protected void setBcurIncAmt(int index) {
		DtlApdR r = getDtlApdL().get(index);

		if (isNullOr(r.base_cur_amt(), r.base_cur_tax_amt())) {
			setValueEx(columnDtlApd_base_cur_inc_tax_amt, index, null);
		}
		else {
			setValueEx(columnDtlApd_base_cur_inc_tax_amt, index,
				r.base_cur_amt().add(r.base_cur_tax_amt()));
		}
	}

	/**
	 * 源泉税を算出する
	 */
	protected void setWtaxAmt(int index) {
		DtlApdR r = getDtlApdL().get(index);

		if (isNullOr(r.trd_cur_amt(), r.wtax_rate())) {
			r.wtax_amt(null);
		}
		else {
			MCNumber wtaxAmt = MAUCP_AmtUtil.getTaxAmt(r.trd_cur_amt(), r.wtax_rate(),
					getHdrR().trd_cur_amt_dec_place(), getCo().wtax_rnd_typ());
			r.wtax_amt(wtaxAmt);
		}
	}


	//-- 支払予定枠

	@Override
	public void doDtlSchd_NC(MCEventInfo info) {
		super.doDtlSchd_NC(info);
		setBtnSchdMode();
	}

	protected boolean doDtlSchd_trd_cur_amt_VC(MCEventInfo info) {
		DtlSchdR r = getDtlSchdL().get(info.getEventIndex());
		// 前渡金で無い場合は制御なし
		if (isNull(r.adv_pay_act_no())) {
			return true;
		}
		// 金額は正数のみ入力可能
		if (isNull(info.getNewValue())) {
			return true;
		}
		return ((MCNumber) info.getNewValue()).isPositive();
	}

	@Override
	public boolean doDtlSchd_setoff_cd_VC(MCEventInfo info) {
		if (isChkSetoffBpCd(info)) {
			return getDtlSchd_setoff_cd(null, info).size() > 0;
		}
		return super.doDtlSchd_setoff_cd_VC(info);
	}
	
	@Override
	public void doDtlSchd_ap_dpt_cd_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doDtlSchd_ap_dpt_cd_LC(info);
		setSoDptCd(info.getEventIndex());
		setValueEx(columnDtlSchd_adv_pay_act_no, info.getEventIndex(), null);
	}

	@Override
	public void doDtlSchd_pay_schd_dt_LC(MCEventInfo info) {
		super.doDtlSchd_pay_schd_dt_LC(info);

		setPspplCd(info.getEventIndex());
		setAspplCd(info.getEventIndex());

		DtlSchdR r = getDtlSchdL().get(info.getEventIndex());

		if (isEditable(columnDtlSchd_trd_cur_com_paid_tax_cd, r.getGUIIndex())) {
			if (!isNull(r.ap_sttl_cd())) {
				// ダミーカラムを使用して、手数料に対する税ＣＤを取得する
				r.ap_sttl_cd_dummy(null);
				if (isNull(info.getNewValue())) {
					setValueEx(columnDtlSchd_trd_cur_com_paid_tax_cd, r.getGUIIndex(), null);
				}
				else {
					setValueEx(columnDtlSchd_ap_sttl_cd_dummy, r.getGUIIndex(), r.ap_sttl_cd());
				}
			}
		}
		setComPaidTaxCd(info.getEventIndex());

		setDefaultRate(info.getEventIndex());
	}

	@Override
	public void doDtlSchd_ap_sttl_cd_LC(MCEventInfo info) {
		super.doDtlSchd_ap_sttl_cd_LC(info);

		DtlSchdR r = getDtlSchdL().get(info.getEventIndex());
		setComPaidTaxCd(info.getEventIndex());
		if (canEditTaxCd(r.ap_sttl_typ(), r.ap_setoff_typ()) && isNull(r.trd_cur_com_paid_tax_cd())) {
			setValueEx(columnDtlSchd_trd_cur_amt, r.getGUIIndex(), null);
		}
		setSetOffActFlg(r);
		clearAdvPayActNo(r);
		String oldArTyp = r.ar_typ();
		doDtlSchd_setoff_cd_or_dpt_cd_LC(r);
		setSetoffLimitAmt(r, r.trd_cur_amt(), false, r.ap_setoff_typ(), r.setoff_cd(), r.so_dpt_cd(), oldArTyp);
		clearArTyp(r);
	}
	/**
	 * 手数料税ＣＤの初期値を設定する。
	 * @param index イベント対象の行のインデックス値
	 */
	protected void setComPaidTaxCd(int index) {
		DtlSchdR r = getDtlSchdL().get(index);
		
		if (!isNull(r.pay_schd_dt()) && canEditTaxCd(r.ap_sttl_typ(), r.ap_setoff_typ())) {
			setValueEx(columnDtlSchd_trd_cur_com_paid_tax_cd, index, MSUCP_ApUtil.getComPaidTaxCd(r.pay_schd_dt(), this));
		}
		else {
			setValueEx(columnDtlSchd_trd_cur_com_paid_tax_cd, index, null);
		}
	}

	@Override
	public void doDtlSchd_ap_sttl_typ_LC(MCEventInfo info) {
		super.doDtlSchd_ap_sttl_typ_LC(info);

		int idx = info.getEventIndex();
		DtlSchdR r = getDtlSchdL().get(idx);

		setPayBankAcCd(idx);
		setBankAcCd(idx);

		if (!canEditApSetoffTyp(r.ap_sttl_typ())) {
			setValueEx(columnDtlSchd_ap_setoff_typ, idx, null);
			setValueEx(columnDtlSchd_pay_ntc_d_print_rmrks, idx, null);
		}
		if (!canEditTaxCd(r.ap_sttl_typ(), r.ap_setoff_typ())) {
			setValueEx(columnDtlSchd_trd_cur_com_paid_tax_cd, idx, null);
		}
		if (!canEditNote(r.ap_sttl_typ(), r.adv_pay_act_no())) {
			for (MCColumnConfig c : DtlSchdTable.getColumnConfigs()) {
				if (isNotePartsCol(c)) {
					setValueEx(c, idx, null);
				}
			}
		}
	}

	@Override
	public void doDtlSchd_trd_cur_com_paid_tax_cd_LC(MCEventInfo info) {
		super.doDtlSchd_trd_cur_com_paid_tax_cd_LC(info);

		DtlSchdR r = getDtlSchdL().get(info.getEventIndex());
		if (isNull(r.trd_cur_com_paid_tax_cd())) {
			setValueEx(columnDtlSchd_trd_cur_amt, info.getEventIndex(), null);
		}

		setTaxAmt(info.getEventIndex());
	}

	public void doDtlSchd_trd_cur_amt_LC(MCEventInfo info) {
		DtlSchdR r = getDtlSchdL().get(info.getEventIndex());
		setTaxAmt(info.getEventIndex());
		if (!isNull(r.trd_cur_amt()) && !r.trd_cur_amt().isPositive()) {
			setValueEx(columnDtlSchd_adv_pay_act_no, info.getEventIndex(), null);
		}
		setSchdSetoffAmt(r, (MCNumber)info.getOldValue(), true, r.adv_pay_act_no());
		setSetoffLimitAmt(r, (MCNumber)info.getOldValue(), true, r.ap_setoff_typ(), r.setoff_cd(), r.so_dpt_cd(), r.ar_typ());
		setPayTab();
	}

	@Override
	public void doDtlSchd_ap_setoff_typ_LC(MCEventInfo info){
		super.doDtlSchd_ap_setoff_typ_LC(info);

		DtlSchdR r = getDtlSchdL().get(info.getEventIndex());
		doDtlSchd_setoff_cd_or_dpt_cd_LC(r);
		setSetoffLimitAmt(r, r.trd_cur_amt(), false, (String)info.getOldValue(), r.setoff_cd(), r.so_dpt_cd(), r.ar_typ());
		setSetoffCd(info.getEventIndex());
		setSoDptCd(info.getEventIndex());
		clearAdvPayActNo(r);
		setSetOffActFlg(r);
		clearArTyp(r);
		setComPaidTaxCd(info.getEventIndex());
	}

	@Override
	public void doDtlSchd_setoff_cd_LC(MCEventInfo info){
		super.doDtlSchd_setoff_cd_LC(info);

		DtlSchdR r = getDtlSchdL().get(info.getEventIndex());
		doDtlSchd_setoff_cd_or_dpt_cd_LC(r);
		setSetoffLimitAmt(r, r.trd_cur_amt(), false, r.ap_setoff_typ(), (String)info.getOldValue(), r.so_dpt_cd(), r.ar_typ());
		clearAdvPayActNo(r);
		clearArTyp(r);
	}

	@Override
	public void doDtlSchd_so_dpt_cd_LC(MCEventInfo info){
		super.doDtlSchd_so_dpt_cd_LC(info);

		DtlSchdR r = getDtlSchdL().get(info.getEventIndex());
		clearAdvPayActNo(r);
		doDtlSchd_setoff_cd_or_dpt_cd_LC(r);
		setSetoffLimitAmt(r, r.trd_cur_amt(), false, r.ap_setoff_typ(), r.setoff_cd(), (String)info.getOldValue(), r.ar_typ());
		clearArTyp(r);
	}
	
	/**
	 * 相殺先ＣＤ、相殺部門ＣＤ、通貨ＣＤから相殺対象残高を取得する
	 */
	protected void doDtlSchd_setoff_cd_or_dpt_cd_LC(DtlSchdR r){
		srchSetoffLimitAmt(r);
	}

	@Override
	public void doDtlSchd_adv_pay_act_no_LC(MCEventInfo info){
		super.doDtlSchd_adv_pay_act_no_LC(info);

		int idx = info.getEventIndex();
		DtlSchdR r = getDtlSchdL().get(idx);
		// 前渡金はマイナスの金額入力不可のため、前渡金支払実績NOを入力した行の金額がマイナスの場合、金額をクリアする
		if (!isNull(info.getNewValue())) {
			if (!isNull(r.trd_cur_amt()) && r.trd_cur_amt().isNegative()) {
				r.trd_cur_amt(null);
			}
		}
		// 前渡金支払実績ＮＯをクリアした場合		
		else{
			// 為替レートデフォルト値セット
			setDefaultRate(idx);
		}

		setBspplDptCd(idx);
		refreshAdvPay(r);
		setSchdSetoffAmt(r, r.trd_cur_amt(), false, (String)info.getOldValue());
		setSetOffActFlg(r);
	}

	@Override
	public void doDtlSchd_note_typ_LC(MCEventInfo info) {
		super.doDtlSchd_note_typ_LC(info);

		int index = info.getEventIndex();
		DtlSchdR r = getDtlSchdL().get(index);
		if (!MAC_NOTE_TYP.isXCHNG(r.note_typ())) {
			setValueEx(columnDtlSchd_accptr, index, null);
		}
	}

	@Override
	public void doDtlSchd_draw_dt_LC(MCEventInfo info) {
		super.doDtlSchd_draw_dt_LC(info);

		int index = info.getEventIndex();
		DtlSchdR r = getDtlSchdL().get(index);
		if (isNull(r.draw_dt())) {
			setValueEx(columnDtlSchd_note_days, info.getEventIndex(), null);
		}
		else {
			if (!isNull(r.note_days())) {
				setDueDt(index);
			}
			else if (!isNull(r.due_dt())) {
				setNoteDays(index);
			}
		}
	}

	@Override
	public void doDtlSchd_due_dt_LC(MCEventInfo info) {
		super.doDtlSchd_due_dt_LC(info);

		int index = info.getEventIndex();
		DtlSchdR r = getDtlSchdL().get(index);
		if (!isNull(r.due_dt())) {
			setNoteDays(index);
		}
	}

	@Override
	public void doDtlSchd_note_days_LC(MCEventInfo info) {
		super.doDtlSchd_note_days_LC(info);

		setDueDt(info.getEventIndex());
	}

	@Override
	public void doDtlSchd_draw_bank_cd_LC(MCEventInfo info) {
		super.doDtlSchd_draw_bank_cd_LC(info);

		setValueEx(columnDtlSchd_draw_branch_cd, info.getEventIndex(), null);
	}

	@Override
	public void doDtlSchd_asppl_cd_LC(MCEventInfo info) {
		super.doDtlSchd_asppl_cd_LC(info);

		DtlSchdR r = getDtlSchdL().get(info.getEventIndex());
		if (isNull(r.asppl_cd())) {
			setValueEx(columnDtlSchd_ap_dpt_cd, info.getEventIndex(), null);
			setValueEx(columnDtlSchd_ap_typ, info.getEventIndex(), null);
		}
		else {
			// 買掛先で絞り込んだ状態で１つに特定できる場合のみ設定する
			MCList<DtlApdR> apdL = getDtlApdL()
				.subList(rr -> !rr.isStatusDelete())
				.subList(DtlApdR.$asppl_cd, r.asppl_cd())
				.groupBy(DtlApdR.$asppl_cd, DtlApdR.$ap_dpt_cd, DtlApdR.$ap_typ);
			DtlSchdR tmp = DtlSchdR.create();
			if (apdL.size() == 1) {
				tmp.ap_dpt_cd(apdL.get(0).ap_dpt_cd());
				tmp.ap_typ(apdL.get(0).ap_typ());
			}
			else if (apdL.size() > 1) {
				for (String col : new String[]{DtlApdR.$ap_dpt_cd, DtlApdR.$ap_typ}) {
					MCList<DtlApdR> l = apdL.groupBy(col);
					if (l.size() == 1) {
						tmp.setString(col, l.get(0).getString(col));
					}
				}
			}
			setValueEx(columnDtlSchd_ap_dpt_cd, info.getEventIndex(), tmp.ap_dpt_cd());
			setValueEx(columnDtlSchd_ap_typ, info.getEventIndex(), tmp.ap_typ());
		}
	}

	/**
	 * 支払先口座ＣＤを設定する。
	 */
	protected void setPayBankAcCd(int idx) {
		DtlSchdR r = getDtlSchdL().get(idx);
		String apSttlTyp = r.ap_sttl_typ();
		
		if (canEditPayBankAcCd(apSttlTyp)) {
			setValueEx(columnDtlSchd_pay_bank_ac_cd, idx, getHdrR().pay_bank_ac_cd());
		}
		else {
			setValueEx(columnDtlSchd_pay_bank_ac_cd, idx, null);
		}
	}

	/**
	 * 口座ＣＤを設定する。
	 */
	protected void setBankAcCd(int idx) {
		DtlSchdR r = getDtlSchdL().get(idx);
		String apSttlTyp = r.ap_sttl_typ();
		
		if (canEditBankAcCd(apSttlTyp)) {
			setValueEx(columnDtlSchd_bank_ac_cd, idx, getHdrR().bank_ac_cd());
		}
		else {
			setValueEx(columnDtlSchd_bank_ac_cd, idx, null);
		}
	}

	/**
	 * 買掛先を設定する
	 * @param idx
	 */
	protected void setAspplCd(int idx) {
		DtlSchdR r = getDtlSchdL().get(idx);
		if (isNull(r.asppl_cd())) {
			MCList<DtlApdR> apdL =
				getDtlApdL().subList(rr -> !rr.isStatusDelete()).groupBy(DtlApdR.$asppl_cd);
			if (apdL.size() == 1) {
				setValueEx(columnDtlSchd_asppl_cd, idx, apdL.get(0).asppl_cd());
			}
		}
	}

	/**
	 * 支払先を設定する
	 */
	protected void setPspplCd(int idx) {
		// 支払予定日が変わったタイミングで支払先に対応する支払部門を再取得する
		setValueEx(columnDtlSchd_psppl_cd_dummy, idx, null);
		setValueEx(columnDtlSchd_psppl_cd_dummy, idx, getHdrR().psppl_cd());
	}

	/**
	 * 税込み金額から税金額を設定する。<br>
	 * 指定された行の税金額を設定する。
	 */
	protected void setTaxAmt(int index) {
		String apSttlTyp = getDtlSchdL().get(index).ap_sttl_typ();
		String apSetoffTyp = getDtlSchdL().get(index).ap_setoff_typ();

		if (canEditTaxCd(apSttlTyp, apSetoffTyp)) {
			DtlSchdR r = getDtlSchdL().get(index);
			MCNumber amt = 
				MAUCP_AmtUtil.getIncTaxAmt(
					r.trd_cur_amt(), r.trd_cur_com_paid_tax_rate(),
					getHdrR().trd_cur_amt_dec_place(), getCo().com_paid_tax_rnd_typ());
			setValueEx(columnDtlSchd_trd_cur_com_paid_tax_amt, index, amt);
		}
		else {
			setValueEx(columnDtlSchd_trd_cur_com_paid_tax_amt, index, null);
		}
	}

	/**
	 * 相殺先ＣＤを設定する。
	 */
	protected void setSetoffCd(int idx) {
		String apSetoffTyp = getDtlSchdL().get(idx).ap_setoff_typ();

		if (MAC_AP_SETOFF_TYP.isBSPPL(apSetoffTyp)) {
			setValueEx(columnDtlSchd_setoff_cd, idx, getHdrR().bsppl_cd());
		}
		else if (MAC_AP_SETOFF_TYP.isPRSPPL(apSetoffTyp)) {
			String aspplCd = getDtlSchdL().get(idx).asppl_cd();
			if (isNull(aspplCd)) {
				MCList<DtlApdR> l = getDtlApdL().groupBy(DtlApdR.$asppl_cd);
				if (!l.isEmpty() && l.size() == 1) {
					aspplCd = l.get(0).asppl_cd();
				}
			}
			setValueEx(columnDtlSchd_setoff_cd, idx, aspplCd);
		}
		else {
			setValueEx(columnDtlSchd_setoff_cd, idx, null);
		}
	}

	/**
	 * 相殺部門ＣＤを設定する。
	 */
	protected void setSoDptCd(int idx) {
		DtlSchdR r = getDtlSchdL().get(idx);

		if (MAC_AP_SETOFF_TYP.isBSPPL(r.ap_setoff_typ()) && !isNull(r.pay_schd_dt())) {
			setValueEx(columnDtlSchd_so_dpt_cd, idx, r.ap_dpt_cd());
		}
		else {
			setValueEx(columnDtlSchd_so_dpt_cd, idx, null);
		}
	}

	/**
	 *  債務相殺先区分が支払先以外の場合、前渡金支払実績ＮＯをクリアする
	 */
	protected void clearAdvPayActNo(DtlSchdR r){
		if (!MAC_AP_SETOFF_TYP.isBSPPL(r.ap_setoff_typ())) {
			setValueEx(columnDtlSchd_adv_pay_act_no, r.getGUIIndex(), null);
		}
	}

	/**
	 *  債務相殺先区分が売掛先以外の場合、債権区分をクリアする
	 */
	protected void clearArTyp(DtlSchdR r){
		if (!MAC_AP_SETOFF_TYP.isACST(r.ap_setoff_typ())) {
			r.ar_typ(null);
		}
	}
	/**
	 * 相殺対象残高の検索を行う
	 * @param r
	 */
	public void srchSetoffLimitAmt(DtlSchdR r) {
		if (isSetoffAcstOrOutsrc(r)) {
			// Sprt03 の条件を設定
			SetoffTgtBalR tgtR = getSetoffTgtBalR();
			tgtR.ap_setoff_typ(r.ap_setoff_typ());
			tgtR.setoff_cd(r.setoff_cd());
			tgtR.so_dpt_cd(r.so_dpt_cd());
			tgtR.trd_cur_cd(getHdrR().trd_cur_cd());
			tgtR.base_dt(nvl(r.pay_schd_dt(), getHdrR().reg_dt()));
			tgtR.ap_sttl_cd(r.ap_sttl_cd());

			callMS_MSBHL0030_Sprt03();

			//結果を表示項目にセット
			r.setoff_limit_amt(tgtR.setoff_limit_amt());
			if (MAC_AP_SETOFF_TYP.isACST(r.ap_setoff_typ())) {
				r.ar_typ(tgtR.ar_typ());
			}
		}
		else {
			r.setoff_limit_amt(null);
		}
	}

	/**
	 * 売掛金買掛金相殺、有償支給相殺の行であるかを返す
	 */
	protected boolean isSetoffAcstOrOutsrc(DtlSchdR r) {
		return !isNull(r)
			&& !isNull(r.setoff_cd())
			&& !isNull(r.so_dpt_cd())
			&& (MAC_AP_SETOFF_TYP.isPRSPPL(r.ap_setoff_typ()) || MAC_AP_SETOFF_TYP.isACST(r.ap_setoff_typ()));
	}
	
	/**
	 * 前渡金支払実績ＮＯのモードを設定する。入力可能な場合は値をクリアする。
	 */
	protected void setAdvPayActNo(int idx) {
		if (isEditable(columnDtlSchd_adv_pay_act_no, idx)) {
			setValueEx(columnDtlSchd_adv_pay_act_no, idx, null);
		}
	}
	
	protected void setXrateBaseDt() {
		// 支払照合為替レートの基準日
		setValueEx(Hdr_xrate_base_dt, nvl(getHdrR().bsppl_cl_dt(), getHdrR().reg_dt()));
	}
	protected void setDefaultRate(){
		for (DtlSchdR r : getDtlSchdL()) {
			r.xrate(null);
			setDefaultRate(r.getGUIIndex());
		}
	}
	/**
	 * 為替レートデフォルト値をセット
	 * 為替レートが未入力だった場合にデフォルト値をセットする
	 */
	protected void setDefaultRate(int idx){
		// 為替レートが未入力の場合
		DtlSchdR targetR = getDtlSchdL().get(idx);
		if (isNull(targetR.xrate())) {
			MCNumber rate = 
				MAUCP_AmtUtil.getDefXrate(
					getHdrR().trd_cur_cd(),
					getBaseCur().cur_cd(),
					getHdrR().xrate_cd(),
					getHdrR().reg_dt(), this);
			setValueEx(columnDtlSchd_xrate, idx, rate);
		}
	}
	
	protected void setDefaultPayXRate() {
		if (!Hdr_pay_xrate.isEditable()) {
			return;
		}
		MCNumber rate = 
			MAUCP_AmtUtil.getDefXrate(
					getHdrR().trd_cur_cd(),
					getBaseCur().cur_cd(),
					getHdrR().pay_xrate_cd(),
					getHdrR().xrate_base_dt(), this);
		setValueEx(Hdr_pay_xrate, rate);
	}

	/**
	 * 前渡金支払実績ＮＯを入力した際に前渡金の負担部門が相殺部門ＣＤに設定されている為、
	 * 前渡金支払実績ＮＯを空に変更した場合に相殺部門ＣＤを支払予定管理先部門ＣＤに戻す。
	 */
	protected void setBspplDptCd(int idx) {
		String payActNo = getDtlSchdL().get(idx).adv_pay_act_no();
		if (!isNull(payActNo)) {
			return;
		}
		String apSetoffTyp = getDtlSchdL().get(idx).ap_setoff_typ();

		if (MAC_AP_SETOFF_TYP.isBSPPL(apSetoffTyp)) {
			setValueEx(columnDtlSchd_so_dpt_cd, idx, getDtlSchdL().get(idx).ap_dpt_cd());
		}
		else {
			setValueEx(columnDtlSchd_so_dpt_cd, idx, null);
		}
	}

	/**
	 * 前渡金を検索した行の他に同じ前渡金が存在する場合、新しく検索した前渡金の情報を上書きする。
	 */
	protected void refreshAdvPay(DtlSchdR orgR) {
		if (!isNull(orgR.adv_pay_act_no())) {
			for (DtlSchdR r : getDtlSchdL()) {
				if (isSame(r.adv_pay_act_no(), orgR.adv_pay_act_no())) {
					r.setoff_schd_amt(orgR.setoff_schd_amt());
				}
				if (isSame(r.old_adv_pay_act_no(), orgR.adv_pay_act_no())) {
					r.old_setoff_schd_amt(orgR.setoff_schd_amt());
				}
			}
		}
	}

	protected String[] getPrspplKey() {
		return new String[] {
				DtlSchdR.$ap_setoff_typ, DtlSchdR.$setoff_cd, DtlSchdR.$so_dpt_cd
		};
	}
	protected String[] getSetoffKey() {
		return new String[] {
				DtlSchdR.$ap_setoff_typ, DtlSchdR.$setoff_cd, DtlSchdR.$so_dpt_cd, DtlSchdR.$ar_typ
		};
	}
	protected String[] getSetoffOldKey() {
		return new String[] {
				DtlSchdR.$old_ap_setoff_typ, DtlSchdR.$old_setoff_cd, DtlSchdR.$old_so_dpt_cd, DtlSchdR.$old_ar_typ
		};
	}
	protected String[] getSetoffKeyVal(DtlSchdR r) {
		return new String[] {
				r.ap_setoff_typ(), r.setoff_cd(), r.so_dpt_cd(), r.ar_typ()
		};
	}
	protected void setSetoffLimitAmt(
			DtlSchdR newR, MCNumber oldVal, boolean isAmt,
			String oldApSetoffTyp, String oldSetoffCd, String oldSoDptCd) {

		DtlSchdR oldValR = DtlSchdR.create();
		oldValR.trd_cur_amt(nvl(oldVal, MCNumber.ZERO));
		oldValR.ap_setoff_typ(oldApSetoffTyp);
		oldValR.setoff_cd(oldSetoffCd);
		oldValR.so_dpt_cd(oldSoDptCd);
		
		// 変更前の相殺先、相殺部門に対して相殺対象外額を戻す
		if (isSetoffAcstOrOutsrc(oldValR)) {
			MCList<DtlSchdR> setoffL = getDtlSchdL().subList(getSetoffKey(), getSetoffKeyVal(oldValR));
			for (DtlSchdR r : setoffL) {
				if (r != newR) {
					r.setoff_limit_amt(nvl(r.setoff_limit_amt(), MCNumber.ZERO).add(oldValR.trd_cur_amt()));
				}
				else if (isAmt) {
					// 金額が変更されたときに戻す（金額変更でない場合、サービスで取得した相殺対象外に戻す）
					MCNumber oldAmt =
						nvl(setoffL.sum(DtlSchdR.$trd_cur_amt), MCNumber.ZERO)
						 .subtract(nvl(newR.trd_cur_amt(), MCNumber.ZERO)).add(oldValR.trd_cur_amt());
					r.setoff_limit_amt(nvl(r.setoff_limit_amt(), MCNumber.ZERO).add(oldAmt));
				}
			}
		}

		// 変更後の相殺先、相殺部門に対して相殺対象額を加える
		if (isSetoffAcstOrOutsrc(newR)) {
			MCList<DtlSchdR> setoffL = getDtlSchdL().subList(getSetoffKey(), getSetoffKeyVal(newR));
			MCNumber newAmt = nvl(setoffL.subList(r -> !r.isStatusDelete()).sum(DtlSchdR.$trd_cur_amt), MCNumber.ZERO);
			
			MCList<DtlSchdR> oldL = getDtlSchdL().subList(getSetoffOldKey(), getSetoffKeyVal(newR));
			if (!isNull(oldL)) {
				// 新規行は登録済みの支払予定額が無いので対象外とする。
				MCNumber oldAmt = oldL.subList(r -> !isNull(r.pay_schd_no())).sum(DtlSchdR.$old_trd_cur_amt);
				newAmt = oldL.get(0).old_setoff_limit_amt().subtract(newAmt.subtract(oldAmt));
			}
			else {
				newAmt = nvl(newR.setoff_limit_amt(), MCNumber.ZERO).subtract(newAmt);
			}
			
			for (DtlSchdR r : setoffL) {
				r.setoff_limit_amt(newAmt);
			}
		}
	}
	protected void setSetoffLimitAmt(
			DtlSchdR newR, MCNumber oldVal, boolean isAmt,
			String oldApSetoffTyp, String oldSetoffCd, String oldSoDptCd, String oldArTyp) {

		DtlSchdR oldValR = DtlSchdR.create();
		oldValR.trd_cur_amt(nvl(oldVal, MCNumber.ZERO));
		oldValR.ap_setoff_typ(oldApSetoffTyp);
		oldValR.setoff_cd(oldSetoffCd);
		oldValR.so_dpt_cd(oldSoDptCd);
		oldValR.ar_typ(oldArTyp);
		
		// 変更前の相殺先、相殺部門に対して相殺対象外額を戻す
		if (isSetoffAcstOrOutsrc(oldValR)) {
			MCList<DtlSchdR> setoffL = getDtlSchdL().subList(getSetoffKey(), getSetoffKeyVal(oldValR));
			for (DtlSchdR r : setoffL) {
				if (r != newR) {
					r.setoff_limit_amt(nvl(r.setoff_limit_amt(), MCNumber.ZERO).add(oldValR.trd_cur_amt()));
				}
				else if (isAmt) {
					// 金額が変更されたときに戻す（金額変更でない場合、サービスで取得した相殺対象外に戻す）
					MCNumber oldAmt =
						nvl(setoffL.sum(DtlSchdR.$trd_cur_amt), MCNumber.ZERO)
						 .subtract(nvl(newR.trd_cur_amt(), MCNumber.ZERO)).add(oldValR.trd_cur_amt());
					r.setoff_limit_amt(nvl(r.setoff_limit_amt(), MCNumber.ZERO).add(oldAmt));
				}
			}
		}

		// 変更後の相殺先、相殺部門に対して相殺対象額を加える
		if (isSetoffAcstOrOutsrc(newR)) {
			MCList<DtlSchdR> setoffL = getDtlSchdL().subList(getSetoffKey(), getSetoffKeyVal(newR));
			MCNumber newAmt = nvl(setoffL.subList(r -> !r.isStatusDelete()).sum(DtlSchdR.$trd_cur_amt), MCNumber.ZERO);
			
			MCList<DtlSchdR> oldL = getDtlSchdL().subList(getSetoffOldKey(), getSetoffKeyVal(newR));
			if (!isNull(oldL)) {
				// 新規行は登録済みの支払予定額が無いので対象外とする。
				MCNumber oldAmt = oldL.subList(r -> !isNull(r.pay_schd_no())).sum(DtlSchdR.$old_trd_cur_amt);
				newAmt = oldL.get(0).old_setoff_limit_amt().subtract(newAmt.subtract(oldAmt));
			}
			else {
				newAmt = nvl(newR.setoff_limit_amt(), MCNumber.ZERO).subtract(newAmt);
			}
			
			for (DtlSchdR r : setoffL) {
				r.setoff_limit_amt(newAmt);
			}
		}
	}

	/**
	 * 前渡金相殺予定額を設定する
	 */
	protected void setSchdSetoffAmt(DtlSchdR newR, MCNumber oldVal, boolean isAmt, String oldAdvPayActNo) {

		// 変更前の前渡金実績に対して前渡金相殺額を戻す
		if (!isNull(oldAdvPayActNo)) {
			MCList<DtlSchdR> advL = getDtlSchdL().subList(DtlSchdR.$adv_pay_act_no, oldAdvPayActNo);
			for (DtlSchdR r : advL) {
				if (r != newR) {
					r.setoff_schd_amt(
						nvl(r.setoff_schd_amt(), MCNumber.ZERO).subtract(nvl(oldVal, MCNumber.ZERO)));
				}
				else if (isAmt) {
					// 金額が変更されたときに戻す（金額変更でない場合、サービスで取得した相殺対象外に戻す）
					MCNumber oldAmt =
						nvl(advL.sum(DtlSchdR.$trd_cur_amt), MCNumber.ZERO)
						 .subtract(nvl(newR.trd_cur_amt(), MCNumber.ZERO)).add(nvl(oldVal, MCNumber.ZERO));
					r.setoff_schd_amt(nvl(r.setoff_schd_amt(), MCNumber.ZERO).subtract(oldAmt));
				}
			}
		}
		
		// 変更後の前渡金実績に対して前渡金相殺額を加える
		if (!isNull(newR) && !isNull(newR.adv_pay_act_no())) {
			MCList<DtlSchdR> advL = getDtlSchdL().subList(DtlSchdR.$adv_pay_act_no, newR.adv_pay_act_no());
			MCNumber newAmt = nvl(advL.subList(r -> !r.isStatusDelete()).sum(DtlSchdR.$trd_cur_amt), MCNumber.ZERO);
			
			MCList<DtlSchdR> oldL = getDtlSchdL().subList(DtlSchdR.$old_adv_pay_act_no, newR.adv_pay_act_no());
			if (!isNull(oldL)) {
				// 新規行は登録済みの支払予定額が無いので対象外とする。
				MCNumber oldAmt = oldL.subList(r -> !isNull(r.pay_schd_no())).sum(DtlSchdR.$old_trd_cur_amt);
				newAmt = oldL.get(0).old_setoff_schd_amt().add(newAmt.subtract(oldAmt));
			}
			else {
				newAmt = nvl(newR.setoff_schd_amt(), MCNumber.ZERO).add(newAmt);
			}
			
			for (DtlSchdR r : advL) {
				r.setoff_schd_amt(newAmt);
			}
		}
	}

	/**
	 * 振出日、手形サイトをもとに支払期日を設定する
	 * @param idx
	 */
	protected void setDueDt(int idx) {
		DtlSchdR r = getDtlSchdL().get(idx);
		if (!isNull(r.draw_dt()) && !isNull(r.note_days())) {
			// 支払期日＝振出日＋手形サイト
			setValueEx(columnDtlSchd_due_dt, idx, r.draw_dt().addDay(r.note_days()));
		}
	}

	/**
	 * 振出日、手形サイトをもとに支払期日を設定する
	 * @param idx
	 */
	protected void setNoteDays(int idx) {
		DtlSchdR r = getDtlSchdL().get(idx);
		if (!isNull(r.draw_dt()) && !isNull(r.due_dt())) {
			// 手形サイト＝支払期日－振出日
			MCNumber noteDays = MCNumber.valueOf(r.due_dt().diffDay(r.draw_dt()));
			if (noteDays.isNegative()) {
				setValueEx(columnDtlSchd_note_days, idx, null);
			}
			else {
				setValueEx(columnDtlSchd_note_days, idx, noteDays);
			}
		}
	}

	/**
	 * 相殺実績作成フラグを設定する
	 */
	protected void setSetOffActFlg(DtlSchdR r) {
		boolean setoffActFlg = false;

		// true の場合、登録と同時に相殺の支払実績を作成する
		if (MAC_AP_STTL_TYP.isSETOFF(r.ap_sttl_typ())) {
			if (MAC_AP_SETOFF_TYP.isACST(r.ap_setoff_typ())
				|| MAC_AP_SETOFF_TYP.isPRSPPL(r.ap_setoff_typ())
				|| !isNull(r.adv_pay_act_no())
				|| !r.ap_setoff_act_flg()) {
				setoffActFlg = true;
			}
		}
		else if (MAC_AP_STTL_TYP.isWTAX(r.ap_sttl_typ())) {
			setoffActFlg = true;
		}

		r.setoff_act_flg(setoffActFlg);
	}



	// -----------------------------------------------
	// リストロジック・入力補助
	// -----------------------------------------------
	@Override
	public MCList getHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info) {
		if (getHdrR().pay_spot_flg()) {
			row.addDateColumn(DptCols.$i_dt, getHdrR().reg_dt());
		}
		else {
			row.addDateColumn(DptCols.$i_dt, getHdrR().bsppl_cl_dt());
		}
		return super.getHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
	}

	@Override
	public MCList getDtlSchd_ap_sttl_cd(MCRow row, MCEventInfo info) {
		DtlSchdR dtlR = getDtlSchdL().get(info.getEventIndex());
		row.addDateColumn(SttlCols.$i_dt, dtlR.pay_schd_dt());

		MCList<MCRow> list = super.getDtlSchd_ap_sttl_cd(row, info), rList = list.createInstance();
		for (MCRow r : list) {
			String sttlTyp = r.getStringNE("ap_sttl_typ");
			if (MAC_AP_STTL_TYP.isWTAX(sttlTyp)) {
				rList.add(r);
			}
			else if (MAC_AP_STTL_TYP.isAPSW_OUT_CHK(sttlTyp)
					|| MAC_AP_STTL_TYP.isAPSW_IN_CHK(sttlTyp)
					|| MAC_AP_STTL_TYP.isAPSW_OUT_NOT_CHK(sttlTyp)
					|| MAC_AP_STTL_TYP.isAPSW_IN_NOT_CHK(sttlTyp)) {
				rList.add(r);
			}
		}
		if (!rList.isEmpty()) {
			list.removeAll(rList);
		}
		return list;
	}

	@Override
	public MCList getDtlSchd_so_dpt_cd(MCRow row, MCEventInfo info) {
		return super.getDtlSchd_so_dpt_cd(getBindRowSoDpt(info.getEventIndex(), row), info);
	}
	
	@Override
	public MCList getDtlSchd_setoff_cd(MCRow row, MCEventInfo info) {
		return super.getDtlSchd_setoff_cd(getBindRowSetoffBp(info.getEventIndex()), info);
	}
	
	/**
	 * コンボリストを生成する
	 */
	protected static final String VIEW_COLUMN_NAME = "_view";
	protected MCList<?> crtComboList(MCList<?> list, String cdCol, String nmCol) {
		MCList<?> l = list.subList(r -> !r.isStatusDelete()).groupBy(cdCol, nmCol);
		l.addStringColumn(VIEW_COLUMN_NAME);
		l.forEach(r -> {
			r.setString(VIEW_COLUMN_NAME, r.getString(cdCol) + " : " + nvl(r.getString(nmCol), ""));
		});
		return l;
	}

	@Override
	public MCList getDtlSchd_asppl_cd(MCRow row, MCEventInfo info) {
		return crtComboList(getDtlApdL(), DtlApdR.$asppl_cd, DtlApdR.$asppl_nm);
	}

	@Override
	public MCList getDtlSchd_ap_dpt_cd(MCRow row, MCEventInfo info) {
		MCList<MCRow> list = super.getDtlSchd_ap_dpt_cd(row, info);
		MCList<MCRow> rsltList = list.createInstance();
		MCIndexKey idx = getDtlApdL().createIndex(DtlApdR.$ap_dpt_cd);
		for (MCRow r : list) {
			if (!isNull(getDtlApdL().getFirst(idx, r.getStringNE("dpt_cd")))) {
				rsltList.add(r);
			}
		}
		return rsltList;
	}

	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		linkBeansToISPanel(columnDtlSchd_adv_pay_act_no, "MS", "MSUAP1130", true);
	}

	/**
	 * 入力補助を起動する際の引数をセットする
	 */
	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		if (beans == columnDtlSchd_setoff_cd) {
			return getBindRowSetoffBp(eventIndex);
		}
		else if (beans == columnDtlSchd_so_dpt_cd) {
			return getBindRowSoDpt(eventIndex, bind);
		}
		else if (beans == columnDtlSchd_adv_pay_act_no) {
			return getBindRowAdvPay(eventIndex);
		}
		return super.getBindRowForISCustom(bind, beans, eventIndex);
	}
	/**
	 * 相殺先の取引先入力補助を開いたときの検索条件用のRowを取得する。
	 * @return bind
	 */
	protected MCRow getBindRowSetoffBp(int eventIndex) {

		MCRow bind = MCRow.create();
		bind.addDateColumn(BpCols.$i_dt, getHdrR().reg_dt());

		String apSetoffTyp = getDtlSchdL().get(eventIndex).ap_setoff_typ();
		bind.addStringColumn(BpCols.$i_bp_is_srch_typ, MAC_AP_SETOFF_TYP.bp_is_srch_typ(apSetoffTyp));

		if (MAC_BP_IS_SRCH_TYP.isAP_SETOFF(bind.getStringNE(BpCols.$i_bp_is_srch_typ))) {
			bind.addStringColumn(BpCols.$i_bsppl_cd, getHdrR().bsppl_cd());
		}

		return bind;
	}

	/**
	 * 相殺部門の部門入力補助を開いたときの検索条件用のRowを取得する。
	 * @return bind
	 */
	protected MCRow getBindRowSoDpt(int eventIndex, MCRow bind) {

		String apSetoffTyp = getDtlSchdL().get(eventIndex).ap_setoff_typ();
		if (MAC_AP_SETOFF_TYP.isBSPPL(apSetoffTyp)
			|| MAC_AP_SETOFF_TYP.isPRSPPL(apSetoffTyp)) {
			bind.addStringColumn(DptCols.$i_dpt_is_srch_typ, MAC_DPT_IS_SRCH_TYP.AP.value());
		}
		else if (MAC_AP_SETOFF_TYP.isACST(apSetoffTyp)) {
			bind.addStringColumn(DptCols.$i_dpt_is_srch_typ, MAC_DPT_IS_SRCH_TYP.AR.value());
		}
		else {
			bind.addStringColumn(DptCols.$i_dpt_is_srch_typ, MAC_DPT_IS_SRCH_TYP.COMM.value());
		}
		return bind;
	}
	
	/**
	 * 前渡金入力補助を開いたときの検索条件用のRowを取得する。
	 * @return bind
	 */
	protected MCRow getBindRowAdvPay(int eventIndex) {

		MCRow bind = MCRow.create();
		bind.addStringColumn(AdvPayCols.$i_bsppl_cd, getHdrR().bsppl_cd());
		bind.addStringColumn(AdvPayCols.$i_bsppl_nm, getHdrR().bsppl_nm());
		bind.addStringColumn(AdvPayCols.$i_bsppl_dpt_cd, getHdrR().bsppl_dpt_cd());
		bind.addStringColumn(AdvPayCols.$i_bsppl_dpt_nm, getHdrR().bsppl_dpt_nm());
		bind.addStringColumn(AdvPayCols.$i_bsppl_wg_cd, getHdrR().wg_cd());
		bind.addStringColumn(AdvPayCols.$i_bsppl_wg_nm, getHdrR().wg_nm());
		DtlSchdR r = getDtlSchdL().get(eventIndex);
		bind.addStringColumn(AdvPayCols.$i_bd_dpt_cd, r.ap_dpt_cd());
		bind.addStringColumn(AdvPayCols.$i_bd_dpt_nm, r.ap_dpt_nm());
		bind.addStringColumn(AdvPayCols.$i_trd_cur_cd, getHdrR().trd_cur_cd());
		bind.addStringColumn(AdvPayCols.$i_trd_cur_nm, getHdrR().trd_cur_nm());

		return bind;
	}

	// -----------------------------------------------
	// インタフェース
	// -----------------------------------------------
	@Override
	protected MCPanel getOpeHdrPanel() {
		return HdrTabPanel;
	}

	@Override
	protected MCPanel getSplitPaneTopPanel() {
		return HdrTabPanel;
	}	

	@Override
	protected void opePanelFillSpace() {
		// fillSpaceしない
		//super.opePanelFillSpace();
	}
	@Override
	protected void doOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe,
			String bfSt, String afSt) {
		super.doOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		boolean refMode = isREFOpe(bfOpe) && isREFStatus(bfSt);
		if (isINSOpe(afOpe)) {
			if (refMode) {
				// 参照登録はしない
				clearContainers(getHdrR(), getDtlApdL(), getDtlSchdL(), getDtlActL(), getDtlAdvPayActL());
			}
			setStatus(INS_SRCH);
		}
		else if (isUPDOpe(afOpe) && refMode) {
			setUpdStatus();
		}
		else if (isDELOpe(afOpe) && refMode) {
			setDelStatus();
		}
		valueInit();
		setFocus();
	}

	@Override
	public MCButtonGroup getOpeButtonGroup () {
		return Cnd_ope_Group;
	}

	@Override
	public List<MCContainer> opePanelGetRegBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getHdrR());
		ret.add(getDtlApdL());
		ret.add(getDtlSchdL());
		ret.add(getDtlActL());
		ret.add(getDtlAdvPayActL());
		return ret;
	}

	@Override
	public List<MCContainer> opePanelGetCndBlocks() {		// 各チェックボックスをオンにする	
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getCndR());
		return ret;
	}

	@Override
	public MCBeans getAcDtBeans(MCRootPanel panel) {
		return columnDtlSchd_can_ac_dt_dummy;
	}

	@Override
	public MCBeans getScreenOpeBeans(MCRootPanel panel) {
		return Cnd_ope_Group;
	}

	@Override
	public boolean isCanAcDtValueInitOpe(MCRootPanel panel) {
		if (Cnd_ope_UPD.isSelected() || (Cnd_ope_DEL.isSelected())) {
			return true;
		}
		return false;
	}

	@Override
	public MCBeans getCheckBeans(MCRootPanel panel) {
		return columnDtlSchd_last_setoff_act_flg;
	}


	// -----------------------------------------------
	// 入力制御
	// -----------------------------------------------
	/**
	 * 行ステータスの表示・非表示を設定します。
	 */
	protected void setStatusColumn() {
		boolean boo = Cnd_ope_INS.isSelected() || Cnd_ope_UPD.isSelected();
		DtlApdTable.setStatusColumnVisible(boo);
		DtlSchdTable.setStatusColumnVisible(boo);
		DtlActTable.setStatusColumnVisible(boo);
		DtlAdvPayActTable.setStatusColumnVisible(boo);
	}

	/**
	 * 承認引戻ＦＬＧの入力制御を設定します。
	 */
	protected void setAprvRvrsFlgMode() {
		if (isEditableMode(Hdr_aprv_rvrs_flg) && isPayOrPartPay()) {
			Hdr_aprv_rvrs_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			String st = getStatus();
			boolean flg = isUPDStatus(st) ? getHdrR().aprv_upd_flg() : getHdrR().aprv_can_flg();
			if (!flg) {
				if (isEditableMode(Hdr_aprv_rvrs_flg)) {
					Hdr_aprv_rvrs_flg.setMode(MCMode.READ_ONLY);
				}
			}
			else {
				setDefaultMode(Hdr_aprv_rvrs_flg);
			}
		}
	}

	/**
	 * ヘッダの支払先締年月関連の入力制御
	 */
	protected void setBspplClMode() {
		if (isSetPSpplClRo()) {
			Hdr_bsppl_cl_ym.setMode(MCMode.READ_ONLY);
			Hdr_bsppl_cl_day.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_bsppl_cl_ym);
			setDefaultMode(Hdr_bsppl_cl_day);
		}
	}
	protected void setPayXrateMode() {
		if (isSetPayXrateRo()) {
			getHdrR().pay_xrate(null);
			Hdr_pay_xrate.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_pay_xrate);
		}
	}

	/**
	 * 締日の入力タイプを設定する
	 */
	protected void setBspplClDayListTyp() {
		if (!isSetPSpplClRo()) {
			DtlApdR workR = DtlApdR.create();
			workR.bsppl_cd(getHdrR().bsppl_cd());
			workR.crryovr_times(1);
			for (String col : new String[]{DtlApdR.$bsppl_cl_dt, DtlApdR.$pay_basis_dt, DtlApdR.$ac_dt}) {
				MCDate dt = (MCDate)getDtlApdL().max(col);
				if (!isNull(dt)) {
					workR.pay_basis_dt(dt);	// 支払期日のカラムを使用して締日を取得する
					break;
				}
			}
			if (!isNull(workR.pay_basis_dt())) {
				MSUCP_ApUtil.setBspplClDt(
					workR,
					DtlApdR.$bsppl_cd,
					DtlApdR.$pay_basis_dt,
					DtlApdR.$crryovr_times,
					DtlApdR.$co_bsppl_cl_dt,
					DtlApdR.$co_bsppl_cl_ym,
					DtlApdR.$co_bsppl_cl_day,
					this);
			}
			if (isNull(workR.co_bsppl_cl_day())) {
				// 支払予定制御マスタが設定されていないとみなし、締日コンボをFREE入力にする
				Hdr_bsppl_cl_day.setListType(MCListType.FREE);
			}
			else {
				Hdr_bsppl_cl_day.setListType(MCListType.STRICT);
			}
		}
	}

	/**
	 * 支払先締年月関連項目をREAD_ONLYにするかどうか
	 * @return
	 */
	protected boolean isSetPSpplClRo() {
		HdrR hdr = getHdrR();
		if (isNull(hdr.bsppl_cd())) {
			return true;
		}
		return getHdrR().pay_spot_flg();
	}
	/**
	 * 支払照合為替レートをREAD_ONLYにするかどうか
	 * @return true READ_ONLYにする false READ_ONLYにしない
	 */
	protected boolean isSetPayXrateRo() {
		return isNull(getHdrR().trd_cur_cd()) || isSame(getHdrR().trd_cur_cd(), getHdrR().base_cur_cd()) || !getCo().pay_xrate_conv_flg();
	}

	/**
	 * ヘッダの内部備考、予備１~３の入力制御
	 */
	protected void setIntrRmrksMode() {
		if (canEditPaySchd()) {
			setDefaultMode(Hdr_intr_rmrks);
			setDefaultMode(Hdr_sub_char1);
			setDefaultMode(Hdr_sub_char2);
			setDefaultMode(Hdr_sub_char3);
		}
		else {
			Hdr_intr_rmrks.setMode(MCMode.READ_ONLY);
			Hdr_sub_char1.setMode(MCMode.READ_ONLY);
			Hdr_sub_char2.setMode(MCMode.READ_ONLY);
			Hdr_sub_char3.setMode(MCMode.READ_ONLY);
		}
	}

	@Override
	public void setStatus(String status) {
		super.setStatus(status);

		if (isINSStatus(status)) {
			setBspplClMode();
			setBspplClDayListTyp();
			setBtnOpenMSBHP0190Mode();
			setBtnSchdMode();
			setBtnActMode();
			setBtnAdvPayActMode();
			setBtnSrchTax();
			setPayXrateMode();
		}
		else if (isUPDStatus(status)) {
			setAprvRvrsFlgMode();
			setValueUpdMode();

			if (isSame(status, UPD)) {
				setBspplClMode();
				setBspplClDayListTyp();
				setBtnApdMode();
				setBtnSchdMode();
				setBtnUpdMode();
				setBtnActMode();
				setBtnAdvPayActMode();
				setBtnSrchTax();
				setPayXrateMode();
			}
			else if (isSame(status, UPD_NEXT)) {
				setIntrRmrksMode();
				setBtnApdMode();
				setBtnSchdMode();
				setBtnUpdMode();
				setBtnActMode();
				setBtnAdvPayActMode();
				setBtnSrchTax();
				setPayXrateMode();
			}
		}
		else if (isDELStatus(status)) {
			setAprvRvrsFlgMode();
			setBtnDelMode();
		}
		else if (isREFStatus(status)) {
			setBtnPrntMode();
		}

		setStatusColumn();
	}

	@Override
	public boolean isINSStatus(String status) {
		return super.isINSStatus(status)
			|| isSame(status, INS_SRCH)
			|| isSame(status, INS_REF);
	}

	@Override
	public boolean isUPDStatus(String status) {
		return super.isUPDStatus(status)
			|| isSame(status, UPD_NEXT)
			|| isSame(status, UPD_APRV);
	}

	@Override
	public boolean isDELStatus(String status) {
		return super.isDELStatus(status)
			|| isSame(status, DEL_APRV);
	}

	public void setUpdStatus() {
		if (isNextOper()) {
			setStatus(UPD_NEXT);
		}
		else if (isAprvFixOrAccpt()) {
			setStatus(UPD_APRV);
		}
		else {
			setStatus(UPD);
		}
	}

	public void setDelStatus() {
		if (isAprvFixOrAccpt()) {
			setStatus(DEL_APRV);
		}
		else {
			setStatus(DEL);
		}
	}

	public void setRefStatus() {
		setStatus(REF);
	}

	/**
	 * 買掛明細枠のボタン制御
	 */
	protected void setBtnApdMode() {
		DtlApdR r = DtlApdTable.getSelectedMCRow();
		if (!isNull(r)
			&& !isSrchTaxDiff(r)
			&& MAC_TRD_PTN_TYP.isTAX_DIFF_PAY_SCHD_CL(r.trd_ptn_typ())) {
			BtnApd_rdel.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(BtnApd_rdel);
		}
		if (!isAprvFixOrAccpt() && canEditPaySchd()) {
			setDefaultMode(BtnApd_srch_onr_prov_bal);
		}
		else {
			BtnApd_srch_onr_prov_bal.setMode(MCMode.DISABLE);
		}
	}

	/**
	 * 支払予定枠のボタン制御
	 */
	protected void setBtnSchdMode() {
		if (canEditPaySchd()) {
			if (getDtlApdL().isEmpty() || isAprvFixOrAccpt()) {
				BtnSchd_srch_master.setMode(MCMode.DISABLE);
				BtnSchd_radd.setMode(MCMode.DISABLE);
				BtnSchd_rdel.setMode(MCMode.DISABLE);
				BtnSchd_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(BtnSchd_srch_master);
				setDefaultMode(BtnSchd_radd);
				setDefaultMode(BtnSchd_rcopy);

				DtlSchdR r = DtlSchdTable.getSelectedMCRow();
				if(!isNull(r) && doneNextOper(r)) {
					BtnSchd_rdel.setMode(MCMode.DISABLE);
				}
				else {
					setDefaultMode(BtnSchd_rdel);
				}
			}
		}
		else {
			BtnSchd_srch_master.setMode(MCMode.DISABLE);
			BtnSchd_radd.setMode(MCMode.DISABLE);
			BtnSchd_rdel.setMode(MCMode.DISABLE);
			BtnSchd_rcopy.setMode(MCMode.DISABLE);
		}
	}

	/**
	 * 仕入明細訂正ボタンの制御
	 */
	protected void setBtnOpenMSBHP0190Mode() {
		if (getDtlApdL().isEmpty()) {
			Btn_open_MSBHP0190.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBHP0190);
		}
	}

	/**
	 * 支払実績枠のボタン制御
	 */
	protected void setBtnActMode() {
		if (canEditPaySchd()) {
			setDefaultMode(BtnAct_deselect_all);
			setDefaultMode(BtnAct_select_all);
			setDefaultMode(BtnAct_srch_act);
		}
		else {
			BtnAct_deselect_all.setMode(MCMode.DISABLE);
			BtnAct_select_all.setMode(MCMode.DISABLE);
			BtnAct_srch_act.setMode(MCMode.DISABLE);
		}
	}
	
	/**
	 * 前渡金枠のボタン制御
	 */
	protected void setBtnAdvPayActMode() {
		if (canEditPaySchd()) {
			setDefaultMode(BtnAdvPayAct_deselect_all);
			setDefaultMode(BtnAdvPayAct_select_all);
			setDefaultMode(BtnAdvPayAct_srch_ady_pay_act);
		}
		else {
			BtnAdvPayAct_deselect_all.setMode(MCMode.DISABLE);
			BtnAdvPayAct_select_all.setMode(MCMode.DISABLE);
			BtnAdvPayAct_srch_ady_pay_act.setMode(MCMode.DISABLE);
		}
	}
	/**
	 * 税差額取得ボタンの制御
	 */
	protected void setBtnSrchTax() {
		if (canEditPaySchd()) {
			setDefaultMode(BtnApd_srch_tax);
		}
		else {
			BtnApd_srch_tax.setMode(MCMode.DISABLE);
		}
	}
	/**
	 * 帳票発行ボタンの制御
	 */
	protected void setBtnPrntMode() {
		if (getDtlApdL().isEmpty()) {
			Btn_prnt_pay_schd_dtl.setMode(MCMode.DISABLE);
			Btn_prnt_pay_ntc.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_prnt_pay_schd_dtl);
			setDefaultMode(Btn_prnt_pay_ntc);
		}
	}

	/**
	 * 更新時の初期値設定
	 */
	protected void setValueUpdMode() {
		getHdrR().prnt_out_flg(true);
	}

	/**
	 * 更新ボタンの制御
	 */
	protected void setBtnUpdMode() {
		if (canEditPaySchd()) {
			setDefaultMode(Btn_upd);
		}
		else {
			Btn_upd.setMode(MCMode.DISABLE);
		}
	}

	/**
	 * 削除ボタンの押下制御
	 */
	protected void setBtnDelMode() {
		// 支払済み、もしくは一部支払の支払予定の中で、
		// 前回相殺実績作成＝オフ（予定時に計上した実績ではない）の支払予定がある場合、押下不可
		if (isPayOrPartPay()) {
			Btn_del.setMode(MCMode.READ_ONLY);
		}
	}

	/**
	 * 編集可能の支払予定があるか
	 */
	protected boolean canEditPaySchd() {
		if (getDtlSchdL().isEmpty()) {
			return true;
		}
		for (DtlSchdR r : getDtlSchdL()) {
			if (isNull(r.pay_sts_typ()) || MSC_PAY_STS_TYP.isNOT_PAY(r.pay_sts_typ())) {
				// 未払いあり
				return true;
			}
			else if (r.setoff_act_flg()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 支払済み（または一部支払済み）か
	 */
	protected boolean isPayOrPartPay() {
		// 予定時に作成する実績以外に、「支払済」または「一部支払」がいるか判定する
		MCList<DtlSchdR> list = getDtlSchdL().subList(r -> !MSC_PAY_STS_TYP.isNOT_PAY(r.pay_sts_typ()));
		if (!isNull(list.getFirst(DtlSchdR.$last_setoff_act_flg, false))) {
			return true;
		}
		return false;
	}

	/**
	 * 承認済みか
	 */
	protected boolean isAprvFixOrAccpt(){
		return !getHdrR().aprv_rvrs_flg() && 
				(MAC_APRV_STS_TYP.isFIX(getHdrR().aprv_sts_typ()) || MAC_APRV_STS_TYP.isACPT(getHdrR().aprv_sts_typ()));
	}

	/**
	 * 次の業務を行っているか否かを判定する
	 */
	protected boolean isNextOper() {
		for (DtlSchdR r : exceptEmpty(getDtlSchdL())) {
			if (doneNextOper(r)) {
				return true;
			}
		}
		return false;
	}
	protected boolean doneNextOper(DtlSchdR r) {
		if (isNull(r.pay_sts_typ()) || MSC_PAY_STS_TYP.isNOT_PAY(r.pay_sts_typ())) {
			return false;
		}
		else if (r.last_setoff_act_flg()) {
			// 前回相殺実績分は対象外
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		setFocus();
	}

	/**
	 * フォーカスを設定する
	 */
	protected void setFocus() {
		String st = getStatus();
		if (isSRCHStatus(st) ||
			 isFIX_IStatus(st) || isFIX_UStatus(st) || isFIX_DStatus(st)) {
			CndPanel.focusFirstComponent();
		}
		else if (isINSStatus(st) || isUPDStatus(st)) {
			HdrPanel.focusFirstComponent();
		}
		else {
			DtlSchdTable.selectLeftmostColumn(0);
		}
	}


	// -----------------------------------------------
	// CellConfig
	// -----------------------------------------------
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlApdTable.setCellConfig(crtDtlApdCellConfig());
		DtlSchdTable.setCellConfig(crtDtlSchdCellConfig());
	}
	protected DtlApdCellConfig crtDtlApdCellConfig() {
		return new DtlApdCellConfig();
	}
	protected class DtlApdCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			DtlApdR r = getDtlApdL().get(index);

			if (!canEditPaySchd()) {
				return MCMode.READ_ONLY;
			}
			if (column == columnDtlApd_pay_mtd_typ) {
				if (!canEditPayMtdTyp(r)) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtlApd_trd_cur_amt) {
				if (isAmtColReadOnly(r)) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtlApd_trd_cur_tax_amt) {
				if (isTaxAmtColReadOnly(r)) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtlApd_trd_cur_inc_tax_amt) {
				if (isIncTaxAmtColReadOnly(r)) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtlApd_crryovr_times) {
				if (isPayCoTimesReadOnly(r)) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtlApd_trd_cur_proc_amt) {
				if (isOutsrcAmtColReadOnly(r)) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtlApd_trd_cur_onr_prov_amt) {
				if (isOutsrcAmtColReadOnly(r) || isNull(r.trd_cur_onr_prov_amt())) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	protected DtlSchdCellConfig crtDtlSchdCellConfig() {
		return new DtlSchdCellConfig();
	}
	protected class DtlSchdCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			DtlSchdR r = getDtlSchdL().get(index);

			if (isNextOper()) {
				if (doneNextOper(r)) {
					return MCMode.READ_ONLY;
				}
				if (isAprvFixOrAccpt()
					&& !(column == columnDtlSchd_intr_rmrks
						|| column == columnDtlSchd_sub_char1
						|| column == columnDtlSchd_sub_char2
						|| column == columnDtlSchd_sub_char3) ) {
					return MCMode.READ_ONLY;
				}
			}

			if (column == columnDtlSchd_ap_sttl_cd) {
				if (!canEditApSttlCd(r.ap_sttl_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtlSchd_pay_bank_ac_cd) {
				if (!canEditPayBankAcCd(r.ap_sttl_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtlSchd_bank_ac_cd) {
				if (!canEditBankAcCd(r.ap_sttl_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtlSchd_trd_cur_amt) {
				if (!canEditTrdCurAmt(r.ap_sttl_typ(), r.trd_cur_com_paid_tax_cd())) {
					return MCMode.READ_ONLY;
				}
				else if (!MAC_AP_STTL_TYP.is_com_paid(r.ap_sttl_typ())) {
					String status = getStatus();
					if (isSame(status, INS_REF) || isSame(status, UPD)) {
						return MCMode.REQUIRED;
					}
				}
			}
			else if (column == columnDtlSchd_trd_cur_com_paid_tax_cd) {
				if (!canEditTaxCd(r.ap_sttl_typ(), r.ap_setoff_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtlSchd_trd_cur_com_paid_tax_amt) {
				if (isNull(r.trd_cur_com_paid_tax_cd())) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtlSchd_ap_setoff_typ) {
				if (!canEditApSetoffTyp(r.ap_sttl_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtlSchd_setoff_cd) {
				if (!canEditSetoffCd(r.ap_setoff_typ())) {
					return MCMode.READ_ONLY;
				}
				else if (r.setoff_act_flg()) {
					String status = getStatus();
					if (isSame(status, INS_REF)
						|| isSame(status, UPD)
						|| isSame(status, UPD_NEXT)) {
						return MCMode.REQUIRED;
					}
				}
			}
			else if (column == columnDtlSchd_so_dpt_cd) {
				if (!canEditSoDptCd(r.ap_setoff_typ())) {
					return MCMode.READ_ONLY;
				}
				else if (r.setoff_act_flg()) {
					String status = getStatus();
					if (isSame(status, INS_REF)
						|| isSame(status, UPD)
						|| isSame(status, UPD_NEXT)) {
						return MCMode.REQUIRED;
					}
				}
			}
			else if (column == columnDtlSchd_setoff_nm) {
				if (!canEditSetoffBpNm(r.ap_setoff_typ())) {
					return MCMode.READ_ONLY;
				}
				else if (r.setoff_act_flg()) {
					String status = getStatus();
					if (isSame(status, INS_REF)
						|| isSame(status, UPD)
						|| isSame(status, UPD_NEXT)) {
						return MCMode.REQUIRED;
					}
				}
			}
			else if (isNotePartsCol(column)) {
				if (!canEditNote(r.ap_sttl_typ(), r.adv_pay_act_no())) {
					return MCMode.READ_ONLY;
				}
				else if (column == columnDtlSchd_note_days) {
					if (!canEditNoteDays(r.draw_dt())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtlSchd_accptr) {
					if (!canEditAccptr(r.note_typ())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			else if (column == columnDtlSchd_adv_pay_act_no) {
				if (!canEditPayActNoIS(r.ap_setoff_typ(), r.trd_cur_amt(), r.ap_dpt_cd())) {
					return MCMode.READ_ONLY;
				}
			}
			// 前渡金を参照している場合、為替レートは前渡金のレートを設定し、変更不可
			else if (column == columnDtlSchd_xrate) {
				if (!canEditXRate(r.adv_pay_act_no())) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtlSchd_asppl_cd) {
				if (!canEditAspplCd(r)) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtlSchd_ap_dpt_cd) {
				if (!canEditApDptCd(r)) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtlSchd_ap_typ) {
				if (!canEditApTyp(r)) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtlSchd_pay_ntc_d_print_rmrks) {
				if (!canEditApSetoffTyp(r.ap_sttl_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}

		@Override
		public MCMode getPriorDeleteMode(int index, MCColumnConfig column, MCTable table) {
			DtlSchdR r = getDtlSchdL().get(index);

			if (isSame(getStatus(), UPD)) {
				if (column == columnDtlSchd_can_ac_dt_for_input) {
					if (canEditCanAcDt(r.last_setoff_act_flg())) {
						return MCMode.REQUIRED;
					}
				}
			}

			return super.getPriorDeleteMode(index, column, table);
		}
	}

	/**
	 * 支払方式が入力可能か
	 */
	protected boolean canEditPayMtdTyp(DtlApdR r) {
		if (MAC_TRD_PTN_TYP.isTAX_DIFF_PAY_SCHD_CL(r.trd_ptn_typ())) {
			return false;
		}
		if (MSC_PAY_MTD_TYP.isALL_PAY(r.pay_mtd_typ())) {
			if (isNull(r.trd_cur_inc_tax_amt()) || r.trd_cur_inc_tax_amt().isZero()) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 金額をREAD_ONLYとするかどうか
	 */
	protected boolean isAmtColReadOnly(DtlApdR r) {
		if (isNull(r.pay_mtd_typ())) {
			return true;
		}
		//全額支払、全額繰越の場合、入力不可
		if (MSC_PAY_MTD_TYP.isALL_PAY(r.pay_mtd_typ())
				|| MSC_PAY_MTD_TYP.isALL_CO(r.pay_mtd_typ())) {
			return true;
		}
		if (r.inc_tax_flg() && !r.repurc_obli_flg()) {
			return true;
		}
		return false;
	}
	/**
	 * 外注関連金額をREAD_ONLYとするかどうか
	 */
	protected boolean isOutsrcAmtColReadOnly(DtlApdR r) {
		if (isNull(r.pay_mtd_typ())) {
			return true;
		}
		//全額支払、全額繰越の場合、入力不可
		if (MSC_PAY_MTD_TYP.isALL_PAY(r.pay_mtd_typ())
				|| MSC_PAY_MTD_TYP.isALL_CO(r.pay_mtd_typ())) {
			return true;
		}
		if (!r.outsrc_flg()) {
			return true;
		}
		return false;
	}

	/**
	 * 税額をREAD_ONLYとするかどうか
	 */
	protected boolean isTaxAmtColReadOnly(DtlApdR r) {
		if (isAmtColReadOnly(r)) {
			return true;
		}
		if (MAC_TRD_PTN_TYP.isAPSW_IN_CHK(r.trd_ptn_typ())) {
			return true;
		}
		return false;
	}

	/**
	 * 税込額をREAD_ONLYとするかどうか
	 */
	protected boolean isIncTaxAmtColReadOnly(DtlApdR r) {
		if (isNull(r.pay_mtd_typ())) {
			return true;
		}
		//全額支払、全額繰越の場合、入力不可
		if (MSC_PAY_MTD_TYP.isALL_PAY(r.pay_mtd_typ())
				|| MSC_PAY_MTD_TYP.isALL_CO(r.pay_mtd_typ())) {
			return true;
		}
		if (!r.inc_tax_flg()) {
			return true;
		}
		return false;
	}

	/**
	 * 今回繰越回数をREAD_ONLYとするかどうか
	 */
	protected boolean isPayCoTimesReadOnly(DtlApdR r) {
		if (MSC_PAY_MTD_TYP.isALL_PAY(r.pay_mtd_typ())) {
			return true;
		}
		if (getHdrR().pay_spot_flg()) {
			return true;
		}
		return false;
	}

	/**
	 * 債務決済方法が入力可能かどうか
	 */
	protected boolean canEditApSttlCd(String apSttlTyp) {
		if (isNull(apSttlTyp)) {
			return true;
		}
		return !MAC_AP_STTL_TYP.isWTAX(apSttlTyp);
	}

	/**
	 * 支払先口座ＣＤが入力可能かどうか
	 */
	protected boolean canEditPayBankAcCd(String apSttlTyp) {
		return MAC_AP_STTL_TYP.isACNT(apSttlTyp)
			|| MAC_AP_STTL_TYP.isACNT_COM_PAID(apSttlTyp)
			|| MAC_AP_STTL_TYP.isCASH(apSttlTyp)
			|| MAC_AP_STTL_TYP.isCASH_COM_PAID(apSttlTyp);
	}


	/**
	 * 口座ＣＤが入力可能かどうか
	 */
	protected boolean canEditBankAcCd(String apSttlTyp) {
		return MAC_AP_STTL_TYP.is_req_bank_ac(apSttlTyp);
	}

	/**
	 * 金額が入力可能かどうか
	 */
	protected boolean canEditTrdCurAmt(String apSttlTyp, String taxCd) {
		if (MAC_AP_STTL_TYP.is_com_paid(apSttlTyp)) {
			if (isNull(taxCd)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 税ＣＤが入力可能かどうか
	 */
	protected boolean canEditTaxCd(String apSttlTyp, String apSetoffTyp) {
		if (MAC_AP_STTL_TYP.is_com_paid(apSttlTyp)) {
			return true;
		}
		else if (MAC_AP_STTL_TYP.isSETOFF(apSttlTyp)) {
			if (MAC_AP_SETOFF_TYP.isBSPPL(apSetoffTyp)
					|| MAC_AP_SETOFF_TYP.isFLEX(apSetoffTyp)) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}

	/**
	 * 債務相殺先区分が入力可能かどうか
	 * @return
	 */
	protected boolean canEditApSetoffTyp(String apSttlTyp) {
		return MAC_AP_STTL_TYP.isSETOFF(apSttlTyp);
	}

	/**
	 * 相殺先ＣＤが入力可能かどうか
	 * @return
	 */
	protected boolean canEditSetoffCd(String apSetoffTyp) {
		return MAC_AP_SETOFF_TYP.isACST(apSetoffTyp)
				|| MAC_AP_SETOFF_TYP.isPRSPPL(apSetoffTyp)
				|| MAC_AP_SETOFF_TYP.isFLEX(apSetoffTyp);
	}

	/**
	 * 相殺先名が入力可能かどうか
	 * @return
	 */
	protected boolean canEditSetoffBpNm(String apSetoffTyp) {
		if (canEditSetoffCd(apSetoffTyp)) {
			return MAC_AP_SETOFF_TYP.isFLEX(apSetoffTyp);
		}
		else {
			return false;
		}
	}

	/**
	 * 相殺部門ＣＤが入力可能かどうか
	 * @return
	 */
	protected boolean canEditSoDptCd(String apSetoffTyp) {
		return MAC_AP_SETOFF_TYP.isBSPPL(apSetoffTyp)
				|| MAC_AP_SETOFF_TYP.isACST(apSetoffTyp)
				|| MAC_AP_SETOFF_TYP.isPRSPPL(apSetoffTyp)
				|| MAC_AP_SETOFF_TYP.isFLEX(apSetoffTyp);
	}

	/**
	 * 手形関連のカラムかどうか
	 */
	protected boolean isNotePartsCol(MCColumnConfig column) {
		return 
			column == columnDtlSchd_note_no
			|| column == columnDtlSchd_note_typ
			|| column == columnDtlSchd_note_typ_nm
			|| column == columnDtlSchd_note_rsn_cd
			|| column == columnDtlSchd_note_rsn_nm
			|| column == columnDtlSchd_draw_dt
			|| column == columnDtlSchd_due_dt
			|| column == columnDtlSchd_note_days
			|| column == columnDtlSchd_drawer_nm
			|| column == columnDtlSchd_draw_bank_cd
			|| column == columnDtlSchd_draw_bank_nm
			|| column == columnDtlSchd_draw_branch_cd
			|| column == columnDtlSchd_draw_branch_nm
			|| column == columnDtlSchd_endrsr
			|| column == columnDtlSchd_accptr;
	}

	/**
	 * 手形関連が入力可能かどうか
	 * 債務決済区分が手形で、前渡金を参照していない場合に入力可能
	 */
	protected boolean canEditNote(String apSttlTyp, String payActNo) {
		return MAC_AP_STTL_TYP.isNOTE(apSttlTyp) && isNull(payActNo);
	}

	/**
	 * 支払実績ＮＯが入力可能か
	 * 債務部門、取引通貨、支払予定管理先が入力済で、債務相殺先区分が「支払先」、金額が0より大きい場合に入力可能
	 */
	protected boolean canEditPayActNoIS(String apSetoffTyp, MCNumber amt, String apDptCd) {
		return !isNull(getHdrR().trd_cur_cd()) 
				&& !isNull(getHdrR().bsppl_cd())
				&& MAC_AP_SETOFF_TYP.isBSPPL(apSetoffTyp) 
				&& (isNull(amt) || amt.isPositive())
				&& !isNull(apDptCd);
	}

	/**
	 * 為替レートが入力可能かどうか
	 */
	protected boolean canEditXRate(String payActNo) {
		return !isSame(getHdrR().trd_cur_cd(), getBaseCur().cur_cd()) && isNull(payActNo);
	}
	/**
	 *引受人が入力可能かどうか
	 */
	protected boolean canEditNoteDays(MCDate drawDt) {
		return !isNull(drawDt);
	}

	/**
	 *引受人が入力可能かどうか
	 */
	protected boolean canEditAccptr(String noteTyp) {
		return MAC_NOTE_TYP.isXCHNG(noteTyp);
	}

	/**
	 * 買掛先が入力可能かどうか
	 */
	protected boolean canEditAspplCd(DtlSchdR r) {
		return r.isStatusGUICreate() || r.isStatusCreate();
	}

	/**
	 * 債務部門が入力可能かどうか
	 */
	protected boolean canEditApDptCd(DtlSchdR r) {
		if (isNull(r.asppl_cd())) {
			return false;
		}
		return r.isStatusGUICreate() || r.isStatusCreate();
	}

	/**
	 * 債務区分が入力可能かどうか
	 */
	protected boolean canEditApTyp(DtlSchdR r) {
		if (isNull(r.asppl_cd())) {
			return false;
		}
		return r.isStatusGUICreate() || r.isStatusCreate();
	}

	/**
	 * 取消計上日が入力可能かどうか
	 */
	protected boolean canEditCanAcDt(boolean lastSetoffActFlg) {
		return lastSetoffActFlg;
	}

	// -----------------------------------------------
	// 画面遷移（支払一覧登録からヘッダ情報引き継ぎ）
	// -----------------------------------------------
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);
		if (isSame(openTyp, T1)) {
			valueInit();
			// valueInitで起動時かの判定がfalseになってしまうので、setT1Bindなどで不要にイベントが呼ばれないように一度フラグを初期化する
			_startUpFlg = true;
			setValueEx(Cnd_ope_Group, Cnd_ope_INS.getActionCommand());

			setT1Bind(bind);
			setSrch02Cnd();
			if (isExecSrch()) {
				addDoBehind(Cnd_srch_apd);
			}
			_startUpFlg = false;
		}
	}
	/**
	 * T1で起動された場合のバインド値設定
	 * @param bind
	 */
	protected void setT1Bind(MCRow bind) {
		setValueEx(Hdr_reg_dt, nvl(bind.getDateNE("reg_dt"), getToday()));
		setValueEx(Hdr_bsppl_cd, bind.getStringNE("bsppl_cd"));
		setValueEx(Hdr_bsppl_cl_ym, bind.getDateNE("bsppl_cl_ym"));
		setValueEx(Hdr_bsppl_cl_day, bind.getNumberNE("bsppl_cl_day"));
		setValueEx(Hdr_bsppl_cl_dt, bind.getDateNE("bsppl_cl_dt"));
		setValueEx(Hdr_bsppl_usr_cd, bind.getStringNE("bsppl_usr_cd"));
		if (bind.getBooleanNE("pay_spot_flg")) {
			if (!isNull(bind.getDateNE("reg_dt"))) {
				setValueEx(Hdr_bsppl_dpt_cd, bind.getStringNE("bsppl_dpt_cd"));
			}
		}
		else if (!isNull(bind.getDateNE("bsppl_cl_dt"))) {
			setValueEx(Hdr_bsppl_dpt_cd, bind.getStringNE("bsppl_dpt_cd"));
		}
		setValueEx(Hdr_psppl_cd, bind.getStringNE("psppl_cd"));
		setValueEx(Hdr_wrk_no, bind.getStringNE("wrk_no"));
		setValueEx(Hdr_trd_cur_cd, bind.getStringNE("trd_cur_cd"));
		if (Hdr_pay_xrate.isEditable()) {
			setValueEx(Hdr_pay_xrate, bind.getNumberNE("pay_xrate"));
		}

		HdrR hdrR = getHdrR();
		hdrR.purc_act_no(bind.getStringNE("purc_act_no"));
		hdrR.rcpt_iv_no(bind.getStringNE("rcpt_iv_no"));
		hdrR.rcpt_iv_mng_no(bind.getStringNE("rcpt_iv_mng_no"));
		hdrR.pay_spot_flg(bind.getBooleanNE("pay_spot_flg"));
		hdrR.last_pay_schd_amt(bind.getNumberNE("last_pay_schd_amt"));
		
		setXrateBaseDt();
	}

	/**
	 * Srch03の検索条件を設定する。
	 */
	protected void setSrch02Cnd() {
		HdrR hdrR = getHdrR();
		hdrR.bsppl_cl_dt_fr(hdrR.bsppl_cl_dt());
		hdrR.bsppl_cl_dt_to(hdrR.bsppl_cl_dt());
	}

	/**
	 * Srch03を実行するかどうか
	 */
	protected boolean isExecSrch() {
		HdrR r = getHdrR();
		// 都度支払先の場合を考慮し、支払予定管理先締日はnull評価の対象外としている。
		// マスタ変更によって都度支払でなくなった場合を考慮し、支払予定管理先担当部門は対象外としている
		// （都度支払でない場合は、支払予定管理先締年月日m部門マスタを参照するが、
		//  都度支払の時に作られた買掛明細の場合だと締年月日が設定されていないため）
		return !isNullOr(r.bsppl_cd(), r.trd_cur_cd());
	}

	// -----------------------------------------------
	// 画面遷移(仕入明細訂正)
	// -----------------------------------------------
	protected void openMSBDP0190 (MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0190");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBDP0190CndR(aso), crtOpenMSBDP0190ClearCols(aso));
		aso.putSearchAction();
		aso.show();
	}

	protected List<String> crtOpenMSBDP0190ClearCols(MAUCP_AppScreenOpener aso) {
		List<String> l = new ArrayList<>();
		l.add(mcframe.clientMSBD.MSBDP0190.CndR.$upri_flg);
		return l;
	}

	protected mcframe.clientMSBD.MSBDP0190.CndR crtOpenMSBDP0190CndR(MAUCP_AppScreenOpener aso) {	
		mcframe.clientMSBD.MSBDP0190.MSBDP_PurcDtlModReg p = (mcframe.clientMSBD.MSBDP0190.MSBDP_PurcDtlModReg) aso.getPanel();
		mcframe.clientMSBD.MSBDP0190.CndR to = mcframe.clientMSBD.MSBDP0190.CndR.create();
		HdrR hdrR = getHdrR();
		if (hdrR.pay_spot_flg()) {
			to.purc_act_no(nullValToNull(hdrR.purc_act_no()));
			to.rcpt_iv_no(nullValToNull(hdrR.rcpt_iv_no()));
		}
		else {
			to.bsppl_cd(hdrR.bsppl_cd());
			to.ac_dt_from((MCDate)getDtlApdL().min(DtlApdR.$ac_dt));
			to.ac_dt_to((MCDate)getDtlApdL().max(DtlApdR.$ac_dt));
			to.trd_cur_cd(hdrR.trd_cur_cd());
			to.wrk_no(nullValToNull(hdrR.wrk_no()));
		}
		String ope = p.Cnd_ope_UPD.getActionCommand();
		to.ope(ope);
		return to;
	}
	
	// -----------------------------------------------
	// 支払情報設定関連
	// -----------------------------------------------
	protected void setLastPaySchdAmt() {
		// 画面起動時は呼び出さない
		if (isStartUp()) {
			return;
		}
		if (isNullOr(getHdrR().bsppl_cd(),
						getHdrR().bsppl_dpt_cd(),
						getHdrR().trd_cur_cd(),
						getHdrR().bsppl_cl_dt())) {
			Hdr_last_pay_schd_amt.setValue(MCNumber.ZERO);
			return;
		}
		callMS_MSBHL0030_Sprt07();
	}
	protected void setPayTab() {
		Hdr_pay_amt.setValue(MCNumber.ZERO);
		Hdr_setoff_amt.setValue(MCNumber.ZERO);
		Hdr_bfw_amt.setValue(MCNumber.ZERO);
		Hdr_purc_amt.setValue(MCNumber.ZERO);
		Hdr_purc_dscnt_amt.setValue(MCNumber.ZERO);
		Hdr_purc_ret_amt.setValue(MCNumber.ZERO);
		Hdr_tax_amt.setValue(MCNumber.ZERO);
		Hdr_sw_amt.setValue(MCNumber.ZERO);
		Hdr_sw_to_amt.setValue(MCNumber.ZERO);
		Hdr_schd_pay_amt.setValue(MCNumber.ZERO);
		
		MCNumber lastPaySchdAmt = nvl(Hdr_last_pay_schd_amt.getValue(), MCNumber.ZERO);
		MCNumber payAmt = MCNumber.ZERO;
		MCNumber setOffAmt = MCNumber.ZERO;
		MCNumber bfwAmt = MCNumber.ZERO;
		MCNumber purcAmt = MCNumber.ZERO;
		MCNumber purcDscntAmt = MCNumber.ZERO;
		MCNumber purcRetAmt = MCNumber.ZERO;
		MCNumber taxAmt = MCNumber.ZERO;
		MCNumber swAmt = MCNumber.ZERO;
		MCNumber swToAmt = MCNumber.ZERO;
		MCNumber schdPayAmt = MCNumber.ZERO;
		
		for (DtlActR r : getDtlActL().subList(r -> r.check())) {
			if (isNull(r.trd_cur_amt())) {
				continue;
			}
			String apSttlTyp = r.ap_sttl_typ();
			if (MAC_AP_STTL_TYP.isACNT(apSttlTyp) || MAC_AP_STTL_TYP.isCASH(apSttlTyp) || MAC_AP_STTL_TYP.isNOTE(apSttlTyp)) {
				payAmt = payAmt.add(r.trd_cur_amt());
			}
			else if (MAC_AP_STTL_TYP.isSETOFF(apSttlTyp)) {
				if (r.bill_tax_disp_flg()) {
					setOffAmt = setOffAmt.add(r.trd_cur_amt().subtract(nvl(r.trd_cur_com_paid_tax_amt(), MCNumber.ZERO)));
					taxAmt = taxAmt.add(nvl(r.trd_cur_com_paid_tax_amt(), MCNumber.ZERO).multiply(-1));
				}
				else {
					setOffAmt = setOffAmt.add(r.trd_cur_amt());
				}
			}
			else if (MAC_AP_STTL_TYP.isWTAX(apSttlTyp)) {
				setOffAmt = setOffAmt.add(r.trd_cur_amt().subtract(nvl(r.trd_cur_com_paid_tax_amt(), MCNumber.ZERO)));
				taxAmt = taxAmt.add(nvl(r.trd_cur_com_paid_tax_amt(), MCNumber.ZERO).multiply(-1));
			}
			else if (MAC_AP_STTL_TYP.isAPSW_OUT_CHK(apSttlTyp) || MAC_AP_STTL_TYP.isAPSW_OUT_NOT_CHK(apSttlTyp)) {
				swAmt = swAmt.add(r.trd_cur_amt());
			}
		}
		for (DtlApdR r : getDtlApdL()) {
			if (isNull(r.trd_cur_amt())) {
				continue;
			}
			String trdPtnTyp = r.trd_ptn_typ();
			if (MAC_TRD_PTN_TYP.isPURC(trdPtnTyp) || MAC_TRD_PTN_TYP.isPURC_VMI(trdPtnTyp) || MAC_TRD_PTN_TYP.isPURC_XPNS(trdPtnTyp)) {
				purcAmt = purcAmt.add(r.trd_cur_amt());
			}
			else if (MAC_TRD_PTN_TYP.isPURC_DSCNT(trdPtnTyp) || MAC_TRD_PTN_TYP.isPURC_XTRA(trdPtnTyp) ||MAC_TRD_PTN_TYP.isPURC_DSCNT_XPNS(trdPtnTyp) ||MAC_TRD_PTN_TYP.isPURC_XTRA_XPNS(trdPtnTyp)) {
				purcDscntAmt = purcDscntAmt.add(r.trd_cur_amt());
			}
			else if (MAC_TRD_PTN_TYP.isPURC_RTN(trdPtnTyp) || MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(trdPtnTyp)) {
				purcRetAmt = purcRetAmt.add(r.trd_cur_amt());
			}
			else if (MAC_TRD_PTN_TYP.isAPSW_IN_CHK(trdPtnTyp)) {
				swToAmt = swToAmt.add(r.trd_cur_amt());
			}
			taxAmt = taxAmt.add(nvl(r.trd_cur_tax_amt(), MCNumber.ZERO));
		}
		bfwAmt = lastPaySchdAmt.subtract(sum(payAmt, swAmt));
		schdPayAmt = sum(lastPaySchdAmt, purcAmt, purcRetAmt, purcDscntAmt, taxAmt, swToAmt)
								.subtract(sum(payAmt, setOffAmt, swAmt));
		
		Hdr_pay_amt.setValue(payAmt);
		if (!isNull(setOffAmt)) {
			Hdr_setoff_amt.setValue(setOffAmt.multiply(-1));
		}
		Hdr_bfw_amt.setValue(bfwAmt);
		Hdr_purc_amt.setValue(purcAmt);
		Hdr_purc_dscnt_amt.setValue(purcDscntAmt);
		Hdr_purc_ret_amt.setValue(purcRetAmt);
		Hdr_tax_amt.setValue(taxAmt);
		Hdr_sw_amt.setValue(swAmt);
		Hdr_sw_to_amt.setValue(swToAmt);
		Hdr_schd_pay_amt.setValue(schdPayAmt);
		
	}

}