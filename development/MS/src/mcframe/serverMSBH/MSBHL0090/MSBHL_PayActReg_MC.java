package mcframe.serverMSBH.MSBHL0090;

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
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBH.MSBHL5040.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBH.MSBHL0090.*;	// このimportはFrameManagerの自動生成で追加されました。

import java.util.*;
import java.util.function.*;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import static mcframe.serverMSBH.MSBHL0090.Query.*;
import mcframe.serverMSBH.MSBHL5010.MSBHL_ApUtil;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverCore.util.MCDBUtil;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHL_PayActReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHL_PayActReg_MC extends MSBHL_PayActReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 支払実績を検索する。<br>
	 */
	public class Srch01 extends MSBHL_PayActReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			editUp();
			srchPayAct();
			srchPayActD();
		}

		@Override
		protected void editListMain() {
			if (isNull(down1())) {
				return;
			}
			super.editListMain();

			editPayAct();
			editPayActD();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			// 最新ＦＬＧがオンの場合は、一時カラムに検索条件制御用のカラムを追加
			// 念のため、改訂番号をクリアする
			if (up0().latest_flg()) {
				up0().setStringNE("latest_flg_str", toTrueStr(up0().latest_flg()));
				up0().pay_act_rev(null);
			}
			else if (isNull(up0().pay_act_rev())) {
				// 画面で制御しているが、仮に最新ＦＬＧがオフ、改訂番号がnullの場合、
				// サーバエラー(検索結果が１件と想定される箇所で、複数件のデータが検索されました。)が発生するので
				// 検索結果が0件になるように加工する
				up0().setStringNE("latest_flg_str", toFalseStr(up0().latest_flg()));
			}
		}

		/**
		 * 支払実績ヘッダを検索する
		 */
		protected void srchPayAct() {
			int cnt = executeQuery(down0(), MSBHL0090_MST_PAY_ACT_S01(), up0());
			if (cnt == 0) {
				down0().clear();
				return;
			}

			MCList<Srch01_HdrR> down0 = MCList.create(Srch01_HdrR.class);
			down0.add(down0());

			setValuesDbc(up0(), down0);
		}

		/**
		 * 支払実績明細を検索する
		 */
		protected void srchPayActD() {
			int cnt = executeQuery(down1(), MSBHL0090_MST_PAY_ACT_D_S01(), down0());
			if (cnt == 0) {
				down0().clear();
				return;
			}

			setValuesDbc(up0(), down1());
		}

		/**
		 * 支払実績ヘッダを編集する
		 */
		protected void editPayAct() {
			Srch01_HdrR hdrR = down0();

			if (up0().latest_flg() || MAC_SLIP_STS_TYP.isCRT(hdrR.slip_sts_typ())) {
				hdrR.latest_flg(true);
			}
			if (!MAC_AP_SETOFF_TYP.isFLEX(hdrR.ap_setoff_typ())) {
				hdrR.setoff_nm(hdrR.setoff_nm_mst());
			}

			hdrR.base_cur_cd(getBaseCur().cur_cd());
			hdrR.base_cur_nm(getBaseCur().cur_nm());
			hdrR.base_cur_amt_dec_place(getBaseCur().amt_dec_place());
		}

		/**
		 * 支払実績明細を編集する
		 */
		protected void editPayActD() {
			for (Srch01_DtlR r : down1()) {
				r.check(!isNull(r.pay_act_d_no()));

				if (!isNull(r.setoff_cd()) && !MAC_AP_SETOFF_TYP.isFLEX(r.ap_setoff_typ())) {
					r.setoff_nm(r.setoff_nm_mst());
				}
			}
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 支払予定を検索する。<br>
	 */
	public class Srch02 extends MSBHL_PayActReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			editUp();
			srchPayAct();
			srchPaySchd();
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			editPaySchd();
			editHdr();
			sort();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			if (!MAC_AP_SETOFF_TYP.isFLEX(up0().ap_setoff_typ())) {
				up0().setoff_nm(null);
			}
			if (!up0().pay_dpt_narrow_down_flg()) {
				up0().pay_dpt_cd(null);
			}
			if (up0().ap_sttl_narrow_down_flg()) {
				// オンの場合のみ絞り込み条件に追加する
				up0().setStringNE("cnd_ap_sttl_cd", up0().ap_sttl_cd());

				if (MAC_AP_STTL_TYP.isACNT(up0().ap_sttl_typ())) {
					// 「預金」の場合、「預金（手数料）」「相殺」を検索条件に追加
					up0().setStringNE("cnd_ap_sttl_typ",
						MCStringUtil.arrayValueJoin(
							MAC_AP_STTL_TYP.ACNT_COM_PAID.value(),
							MAC_AP_STTL_TYP.SETOFF.value())
					);
				}
				else if (MAC_AP_STTL_TYP.isCASH(up0().ap_sttl_typ())) {
					// 「現金」の場合、「現金（手数料）」「相殺」を検索条件に追加
					up0().setStringNE("cnd_ap_sttl_typ",
						MCStringUtil.arrayValueJoin(
							MAC_AP_STTL_TYP.CASH_COM_PAID.value(),
							MAC_AP_STTL_TYP.SETOFF.value())
					);
				}
				else if (MAC_AP_STTL_TYP.isNOTE(up0().ap_sttl_typ())) {
					// 「手形」の場合、「相殺」を検索条件に追加
					up0().setStringNE("cnd_ap_sttl_typ",
						MCStringUtil.arrayValueJoin(
							MAC_AP_STTL_TYP.SETOFF.value())
					);
				}
			}
			if (!up1().isEmpty()) {
				up0().setStringNE("cnd_pay_schd_no", toTrueStr(true));
			}
		}

		/**
		 * 支払予定を検索する
		 */
		protected void srchPaySchd() {
			insPaySchdWk();
			MCList<Srch01_DtlR> rsltL = MCList.create(Srch01_DtlR.class);
			int cnt = executeQuery(rsltL, MSBHL0090_MST_PAY_SCHD_S01(), up0());
			delPaySchdWk();
			if (cnt > 0) {
				// 予定分を追加
				down1().addAll(rsltL);
			}
			if (down1().size() == 0) {
				down1().clear();
				return;
			}

			setValuesDbc(up0(), down1());
		}

		/**
		 * 支払予定ワークに登録する
		 */
		protected void insPaySchdWk() {
			if (up0().isEmpty()) {
				return;
			}
			MCList<MST_PAY_SCHD_R> dbc = MCList.create(MST_PAY_SCHD_R.class);
			for (Srch02_Cnd2R r : up1()) {
				dbc.add().pay_schd_no(r.pay_schd_no());
			}
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_PAY_SCHD_R.create("T"));
			dbWkDelete("MSBHL0090_MSW_PAY_SCHD_D01", dbc_bldr.getBaseDbc());
			dbWkInsert("MSBHL0090_MSW_PAY_SCHD_I01",
					dbc.groupBy(dbc.createRow().getKeyColumn()), dbc_bldr.getBaseDbc());
		}

		/**
		 * 支払予定ワークを削除する
		 */
		protected void delPaySchdWk() {
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_PAY_SCHD_R.create("T"));
			dbWkDelete("MSBHL0090_MSW_PAY_SCHD_D02", dbc_bldr.getBaseDbc());
		}

		/**
		 * 支払実績を検索する
		 */
		protected void srchPayAct() {
			if (isNull(up0().pay_act_no())) {
				return;
			}

			int cnt = executeQuery(down1(), MSBHL0090_MST_PAY_ACT_D_S01(), up0());
			if (cnt == 0) {
				down0().clear();
			}
		}

		/**
		 * 支払予定を編集する
		 */
		protected void editPaySchd() {

			// 予定のみ
			for (Srch01_DtlR r : down1().subList(r -> isNull(r.pay_act_d_no()))) {
				// 債務決済方法で絞り込まない、かつ債務決済方法が設定されている場合、取得した支払予定の決済方法に反映する
				if (!up0().ap_sttl_narrow_down_flg() && !isNull(up0().ap_sttl_cd())) {
					MAM_STTL_R sttlR = _cacheSttl.get(up0().ap_sttl_cd());
					if (isReplaceSttlTyp(sttlR.ap_sttl_typ()) && isReplaceSttlTyp(r.ap_sttl_typ())) {
						r.ap_sttl_cd(sttlR.sttl_cd());
						r.ap_sttl_nm(sttlR.sttl_nm());
						r.ap_sttl_typ(sttlR.ap_sttl_typ());
					}
				}

				if (!isNull(r.trd_cur_com_paid_tax_cd())) {
					String taxCd = MSBHL_ApUtil.getComPaidAndSetoffTaxCd(up0().pay_act_dt());
					r.trd_cur_com_paid_tax_cd(MSBHL_ApUtil.getTax(taxCd).tax_cd());
					r.trd_cur_com_paid_tax_nm(MSBHL_ApUtil.getTax(taxCd).tax_nm());
					if (!isSame(MSBHL_ApUtil.getTax(taxCd).tax_rate(), r.trd_cur_com_paid_tax_rate())) {
						r.trd_cur_com_paid_tax_rate(MSBHL_ApUtil.getTax(taxCd).tax_rate());
						if (!isNull(r.trd_cur_amt())) {
							r.trd_cur_com_paid_tax_amt(
								getComPaidTaxAmt(r.trd_cur_amt(), MSBHL_ApUtil.getTax(taxCd).tax_rate(), up0().trd_cur_cd(), r.bsppl_cd(), MSBHL_ApUtil.getTax(taxCd).inc_tax_flg())
							);
						}
					}
				}
				r.pay_schd_amt(r.trd_cur_amt());
				r.pay_schd_com_paid_tax_amt(r.trd_cur_com_paid_tax_amt());
				r.trd_cur_amt(null);
				r.trd_cur_com_paid_tax_amt(null);
				r.base_cur_amt(null);
				r.base_cur_com_paid_tax_amt(null);
				
				clearByApSttlTyp(r);
			}

			// 予定・実績の両方
			for (Srch01_DtlR r : down1()) {
				r.check(!isNull(r.pay_act_d_no()));

				if (!isNull(r.setoff_cd()) && !MAC_AP_SETOFF_TYP.isFLEX(r.ap_setoff_typ())) {
					r.setoff_nm(r.setoff_nm_mst());
				}
			}
			
			// 支払実績のみ
			for (Srch01_DtlR r : down1().subList(r -> !isNull(r.pay_act_d_no()))) {
				
				if (isReplaceDownApSttl(r)) {
					
					replaceDownApSttl(r);
					
					clearByApSttlTyp(r);
				}
			}
		}
		
		/**
		 * 下り電文の債務決済区分、債務決済方法が置き換え可能か判定する。
		 * @param r 下り電文の支払予定
		 * @return 置き換え可能の場合はtrue
		 */
		protected boolean isReplaceDownApSttl(Srch01_DtlR r) {
			
			if ((MAC_AP_STTL_TYP.isACNT(up0().ap_sttl_typ())
					&& (MAC_AP_STTL_TYP.isCASH(r.ap_sttl_typ()) || MAC_AP_STTL_TYP.isNOTE(r.ap_sttl_typ())))
					|| (MAC_AP_STTL_TYP.isCASH(up0().ap_sttl_typ())
							&& (MAC_AP_STTL_TYP.isACNT(r.ap_sttl_typ()) || MAC_AP_STTL_TYP.isNOTE(r.ap_sttl_typ())))
					|| (MAC_AP_STTL_TYP.isNOTE(up0().ap_sttl_typ())
							&& (MAC_AP_STTL_TYP.isCASH(r.ap_sttl_typ()) || MAC_AP_STTL_TYP.isACNT(r.ap_sttl_typ())))) {
				// ・上り電文の債務決済区分が「預金」の場合、かつ支払実績明細の債務決済区分が「現金」「手形」の場合は、上り電文の債務決済方法に置き換える。
				// ・上り電文の債務決済区分が「現金」の場合、かつ支払実績明細の債務決済区分が「預金」「手形」の場合は、上り電文の債務決済方法に置き換える。
				// ・上り電文の債務決済区分が「手形」の場合、かつ支払実績明細の債務決済区分が「現金」「預金」の場合は、上り電文の債務決済方法に置き換える。
				return true;
			}
			
			return false;
		}
		
		/**
		 * 下り電文の債務決済方法、債務決済区分を置き換える。
		 * @param r 下り電文の支払予定
		 */
		protected void replaceDownApSttl(Srch01_DtlR r) {
			
			MAM_STTL_R sttlR = _cacheSttl.get(up0().ap_sttl_cd());
			r.ap_sttl_cd(sttlR.sttl_cd());
			r.ap_sttl_nm(sttlR.sttl_nm());
			r.ap_sttl_typ(up0().ap_sttl_typ());
		}
		
		/**
		 * 債務決済区分を基づき、関連する項目をクリアする。
		 * @param r 下り電文の支払予定
		 */
		protected void clearByApSttlTyp(Srch01_DtlR r) {
			
			if (!(MAC_AP_STTL_TYP.isACNT(r.ap_sttl_typ()) || MAC_AP_STTL_TYP.isACNT_COM_PAID(r.ap_sttl_typ()))) {
				r.bank_ac_cd(null);
				r.bank_ac_nm(null);
			}
			if (!(MAC_AP_STTL_TYP.isACNT(r.ap_sttl_typ()) 
					|| MAC_AP_STTL_TYP.isACNT_COM_PAID(r.ap_sttl_typ())
					|| MAC_AP_STTL_TYP.isCASH(r.ap_sttl_typ()) 
					|| MAC_AP_STTL_TYP.isCASH_COM_PAID(r.ap_sttl_typ()))) {
				r.pay_bank_ac_cd(null);
				r.pay_bank_ac_nm(null);
			}
			if (!MAC_AP_STTL_TYP.isSETOFF(r.ap_sttl_typ())) {
				r.ap_setoff_typ(null);
				r.ap_setoff_typ_nm(null);
				r.setoff_cd(null);
				r.setoff_nm(null);
				r.so_dpt_cd(null);
				r.so_dpt_nm(null);
			}
			if (!MAC_AP_STTL_TYP.isNOTE(r.ap_sttl_typ())) {
				r.note_no(null);
				r.note_typ(null);
				r.note_typ_nm(null);
				r.draw_dt(null);
				r.note_days(null);
				r.due_dt(null);
				r.drawer_nm(null);
				r.endrsr(null);
				r.accptr(null);
				r.draw_bank_cd(null);
				r.draw_bank_nm(null);
				r.draw_branch_cd(null);
				r.draw_branch_nm(null);
				r.note_rsn_cd(null);
				r.note_rsn_nm(null);
			}
		}

		/**
		 * ヘッダ情報を編集する
		 */
		protected void editHdr() {
			// ヘッダ編集対象の債務決済区分のみ取得
			MCList<Srch01_DtlR> paySchdL =
				down1().subList(r -> isNull(r.pay_act_d_no()) && isEdiHdrTgtSttlTyp(r.ap_sttl_typ()));
			if (paySchdL.isEmpty()) {
				return;
			}

			// 預金と預金手数料、および、現金と現金手数料は各々同一グループとみなすため、手数料を置き換えたリストで処理を行う
			MCList<Srch01_DtlR> tmpPaySchdL = MCList.create(Srch01_DtlR.class);
			for (Srch01_DtlR paySchdR : paySchdL) {
				Srch01_DtlR tmpPaySchdR = Srch01_DtlR.create();
				MCRow.copyall(tmpPaySchdR, paySchdR);
				if (MAC_AP_STTL_TYP.isACNT_COM_PAID(tmpPaySchdR.ap_sttl_typ())) {
					tmpPaySchdR.ap_sttl_typ(MAC_AP_STTL_TYP.ACNT.value());
				}
				else if (MAC_AP_STTL_TYP.isCASH_COM_PAID(tmpPaySchdR.ap_sttl_typ())) {
					tmpPaySchdR.ap_sttl_typ(MAC_AP_STTL_TYP.CASH.value());
				}
				tmpPaySchdL.add(tmpPaySchdR);
			}
			
			// 引数のカラムの値がNULLを除いてすべて一致している場合のその値を返す関数
			BiFunction<MCList<Srch01_DtlR>, String, Comparable<?>> func = (list, col) -> {
				MCList<Srch01_DtlR> l = list.groupBy(col).subList(r -> !isNull(r.getValue(col)));
				if (l.size() == 1) {
					return l.getValue(0, col);
				}
				return null;
			};

			down0().clear();

			// NULLを除いてすべて一致するカラムのみ値を設定する
			String apSttlTyp = (String)func.apply(tmpPaySchdL, Srch01_DtlR.$ap_sttl_typ);
			if (!isNull(apSttlTyp)) {
				for (String col : getHdrCols(apSttlTyp)) {
					Comparable<?> val = func.apply(tmpPaySchdL, col);
					if (!isNull(val)) {
						down0().setValue(col, val);
					}
				}
				if (isNull(down0().ap_setoff_typ())) {
					// 債務相殺先区分がNULLの場合は、相殺関連は一意になっても設定しない
					down0().setoff_cd(null);
					down0().setoff_nm(null);
					down0().so_dpt_cd(null);
					down0().so_dpt_nm(null);
				}
				if (!isNull(down0().accptr()) && !MAC_NOTE_TYP.isXCHNG(down0().note_typ())) {
					// 手形区分が「為替手形」でない場合は設定しない
					down0().accptr(null);
				}
				if (isNull(down0().draw_dt()) && !isNull(down0().note_days())) {
					// 振出日がNULLの場合、手形サイトは一意になっても設定しない
					down0().note_days(null);
				}
			}
		}

		/**
		 * 上り電文の債務決済方法で置き換え可能な決済区分か判定する
		 */
		protected boolean isReplaceSttlTyp(String apSttlTyp) {
			if (MAC_AP_STTL_TYP.isACNT(apSttlTyp)
				|| MAC_AP_STTL_TYP.isCASH(apSttlTyp)
				|| MAC_AP_STTL_TYP.isNOTE(apSttlTyp)
				|| MAC_AP_STTL_TYP.isSETOFF(apSttlTyp)) {
				return true;
			}
			return false;
		}
		
		/**
		 * ヘッダ編集対象の決済区分か判定する
		 */
		protected boolean isEdiHdrTgtSttlTyp(String apSttlTyp) {
			if (MAC_AP_STTL_TYP.isACNT(apSttlTyp)
				|| MAC_AP_STTL_TYP.isACNT_COM_PAID(apSttlTyp)
				|| MAC_AP_STTL_TYP.isCASH(apSttlTyp)
				|| MAC_AP_STTL_TYP.isCASH_COM_PAID(apSttlTyp)
				|| MAC_AP_STTL_TYP.isNOTE(apSttlTyp)
				|| MAC_AP_STTL_TYP.isSETOFF(apSttlTyp)) {
				return true;
			}
			return false;
		}

		/**
		 * 引数の金額と税率から消費税額を計算する
		 */
		protected MCNumber getComPaidTaxAmt(MCNumber amt, MCNumber taxRate, String curCd, String bspplCd, Boolean incTaxFlg) {
			return MAUCL_AmtUtil.getTaxAmt(amt, taxRate, MSBHL_ApUtil.getCur(curCd).amt_dec_place(), getCo().com_paid_tax_rnd_typ(), incTaxFlg);
		}

		/**
		 * 債務決済区分ごとに設定するヘッダカラムを取得する
		 */
		protected String[] getHdrCols(String apSttlTyp) {
			List<String> arr = new ArrayList<>();
			if (MAC_AP_STTL_TYP.isACNT(apSttlTyp)
				|| MAC_AP_STTL_TYP.isACNT_COM_PAID(apSttlTyp)) {
				arr.add(Srch02_HdrR.$bank_ac_cd);
				arr.add(Srch02_HdrR.$bank_ac_nm);
				arr.add(Srch02_HdrR.$pay_bank_ac_cd);
				arr.add(Srch02_HdrR.$pay_bank_ac_nm);
			}
			else if (MAC_AP_STTL_TYP.isCASH(apSttlTyp)
					|| MAC_AP_STTL_TYP.isCASH_COM_PAID(apSttlTyp)) {
				arr.add(Srch02_HdrR.$pay_bank_ac_cd);
				arr.add(Srch02_HdrR.$pay_bank_ac_nm);
			}
			else if (MAC_AP_STTL_TYP.isSETOFF(apSttlTyp)) {
				arr.add(Srch02_HdrR.$ap_setoff_typ);
				arr.add(Srch02_HdrR.$ap_setoff_typ_nm);
				arr.add(Srch02_HdrR.$setoff_cd);
				arr.add(Srch02_HdrR.$setoff_nm);
				arr.add(Srch02_HdrR.$so_dpt_cd);
				arr.add(Srch02_HdrR.$so_dpt_nm);
			}
			else if (MAC_AP_STTL_TYP.isNOTE(apSttlTyp)) {
				arr.add(Srch02_HdrR.$note_no);
				arr.add(Srch02_HdrR.$note_typ);
				arr.add(Srch02_HdrR.$note_typ_nm);
				arr.add(Srch02_HdrR.$draw_dt);
				arr.add(Srch02_HdrR.$note_days);
				arr.add(Srch02_HdrR.$due_dt);
				arr.add(Srch02_HdrR.$drawer_nm);
				arr.add(Srch02_HdrR.$endrsr);
				arr.add(Srch02_HdrR.$accptr);
				arr.add(Srch02_HdrR.$draw_bank_cd);
				arr.add(Srch02_HdrR.$draw_bank_nm);
				arr.add(Srch02_HdrR.$draw_branch_cd);
				arr.add(Srch02_HdrR.$draw_branch_nm);
				arr.add(Srch02_HdrR.$note_rsn_cd);
				arr.add(Srch02_HdrR.$note_rsn_nm);
			}
			return arr.toArray(new String[arr.size()]);
		}

		/**
		 * 下り電文を並び替える
		 */
		protected void sort() {
			MCSortPolicy policy = new MCSortPolicy();
			policy.add(SortType.ASC, Srch01_DtlR.$pay_act_d_no);
			policy.add(SortType.ASC, Srch01_DtlR.$disp_seq);
			policy.add(SortType.ASC, Srch01_DtlR.$pay_schd_dt);
			policy.add(SortType.ASC, Srch01_DtlR.$ap_sttl_cd);
			policy.add(SortType.ASC, Srch01_DtlR.$ap_dpt_cd);
			policy.add(SortType.ASC, Srch01_DtlR.$asppl_cd);
			policy.add(SortType.ASC, Srch01_DtlR.$purc_act_no);
			policy.add(SortType.ASC, Srch01_DtlR.$wrk_no);
			down1().sort(policy);
		}
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 支払実績を登録する。<br>
	 */
	public class Ins01 extends MSBHL_PayActReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callPayActChk01(up0(), up1());
			throwUpdErr();
			callPayActUpd01();
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
			setPegNo(up1());
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			MSBHL_PayActRegService.PayAct_Upd01 upd = getPayActUpd01();
			MCRow.copyvalue(down0(), upd.down0().get(0));
			down1().setAll(upd.down1());
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 支払実績を更新する。<br>
	 */
	public class Upd01 extends MSBHL_PayActReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callPayActChk01(up0(), up1());
			throwUpdErr();
			callPayActUpd01();
			setDown();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			up0().hdr_peg_no(1);
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());

			up1().forEach(r -> {
				r.hdr_peg_no(up0().hdr_peg_no());
				// データ更新区分は画面側で設定する
			});
			setPegNo(up1());
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			MSBHL_PayActRegService.PayAct_Upd01 upd = getPayActUpd01();
			MCRow.copyvalue(down0(), upd.down0().get(0));
			down1().setAll(upd.down1());
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 支払実績を取り消す。<br>
	 */
	public class Del01 extends MSBHL_PayActReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callPayActChk01(up0(), up1());
			throwDelErr();
			callPayActUpd01();
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
			setPegNo(up1());
		}
	}

	/**
	 * 支払実績サービスの更新前チェック処理オペレーション
	 */
	protected MSBHL_PayActRegService.PayAct_Chk01 _payActChk01;
	protected MSBHL_PayActRegService.PayAct_Chk01 getPayActChk01() {
		if (_payActChk01 == null) {
			_payActChk01 = MSBHL_PayActRegService.crtPayAct_Chk01();
		}
		return _payActChk01;
	}

	/**
	 * 支払実績サービスの更新処理オペレーション
	 */
	protected MSBHL_PayActRegService.PayAct_Upd01 _payActUpd01;
	protected MSBHL_PayActRegService.PayAct_Upd01 getPayActUpd01() {
		if (_payActUpd01 == null) {
			_payActUpd01 = MSBHL_PayActRegService.crtPayAct_Upd01();
		}
		return _payActUpd01;
	}

	/**
	 * 支払実績サービスの更新前チェック処理を呼び出す
	 */
	protected void callPayActChk01(PayAct_Chk01_HdrR hdrR, MCList<PayAct_Chk01_DtlR> dtlL) {
		MSBHL_PayActRegService.PayAct_Chk01 chk = getPayActChk01();
		chk.up0().add(hdrR);
		chk.up1().setAll(dtlL);
		chk.exec();
	}

	/**
	 * 支払実績サービスの更新処理を呼び出す<br>
	 * 事前に更新前チェック処理が実行されていること
	 */
	protected void callPayActUpd01() {
		MSBHL_PayActRegService.PayAct_Chk01 chk = getPayActChk01();
		MSBHL_PayActRegService.PayAct_Upd01 upd = getPayActUpd01();
		upd.up0().setAll(chk.down0());
		upd.up1().setAll(chk.down1());
		upd.exec();
	}

	protected void setValuesDbc(MCRow upR, MCList<? extends MCConstRow> down) {
		
		if (down.createRow() instanceof Srch01_HdrR) {
			setValuesDbc(MSBHL0090_Srch01_HdrR_J01(), upR, down);
		}
		else if (down.createRow() instanceof Srch01_DtlR) {
			setValuesDbc(MSBHL0090_Srch01_DtlR_J01(), upR, down);
		}
		
		initDbcCacheSttl(down);
	}
	protected FXUCL_MCDbcCache<MAM_STTL_R> _cacheSttl;
	protected void initDbcCacheSttl(MCList<? extends MCConstRow> down) {

		MAM_STTL_R t = MAM_STTL_R.create("T");
		MCQueryApiBuilder sttl_bldr = MCQueryApiBuilder.create(t);
		sttl_bldr.setSelect(t.ap_sttl_typ, t.ap_setoff_typ);
		sttl_bldr.addSelect(t.sttl_cd);
		sttl_bldr.addSelect(t.sttl_nm);
		_cacheSttl = new FXUCL_MCDbcCache<MAM_STTL_R>(sttl_bldr, down, "ap_sttl_cd");
	}

	//FMCB CUSTOM END
}