package mcframe.serverMSBG.MSBGL0280;

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
import mcframe.serverMSUC.MSUCL0050.MSUCL_ClUtil;
import static mcframe.serverMSBG.MSBGL0280.Query.*;
import mcframe.serverMSBH.MSBHL5110.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_CredDtlSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_CredDtlSrch_MC extends MSBGL_CredDtlSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 特定の与信管理先の与信状況の詳細を検索する。<br>
	 */
	public class Srch01 extends MSBGL_CredDtlSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			pre();
			
			srchCred();

			if (down0().isEmpty()) {
				return;
			}
			
			srchAdv();
			
			srchMlyAr();
			srchApPay();

			srchMlyAp();
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			
			sumCred();
		}
		
		
		/**
		 * 前処理
		 */
		protected void pre() {

			up0().ar_cl_ym(MSUCL_ClUtil.getArClYm());
			if (!getCo().ap_no_use_flg()) {
				up0().ap_cl_ym(MSUCL_ClUtil.getApClYm());
			}
			
			initAmt(down0());
		}

		/**
		 * 金額の初期化
		 * @param hdrR ヘッダ
		 */
		protected void initAmt(Srch01_HdrRsltR hdrR) {
			
			hdrR.cred_limit(0);
			hdrR.ttl_cred_amt(0);
			hdrR.cred_bal(0);
			hdrR.ttl_ym(up0().ar_cl_ym().addMonth(1));
			hdrR.ttl_init_bal(0);
			hdrR.ttl_sls(0);
			hdrR.ttl_rcv(0);
			hdrR.ttl_adv(0);
			hdrR.not_appl_note(0);
			hdrR.not_appl_adv_note(0);
			hdrR.ttl_backord(0);
			hdrR.ttl_qtn(0);
			if (!getCo().ap_no_use_flg()) {
				hdrR.ttl_ym_ap(up0().ap_cl_ym().addMonth(1));
			}
			hdrR.ttl_init_bal_ap(0);
			hdrR.ttl_purc(0);
			hdrR.ttl_pay(0);
			hdrR.ttl_adv_pay(0);
			hdrR.ttl_po_backord(0);
		}
		
		/**
		 * 与信管理先及び与信限度額を取得する。
		 * 
		 * @return 与信管理先及び与信限度額
		 */
		protected void srchCred() {

			executeQuery(down0(), MSBGL0280_MAM_CRED_CTRL_S01(), up0());
		}
		
		/**
		 * 売掛金を検索する。
		 */
		protected void srchMlyAr() {

			executeQuery(down1(), MSBGL0280_MST_MLY_AR_BAL_S01(), up0());
		}
		
		/**
		 * 前受金を検索する。
		 */
		protected void srchAdv() {

			Srch01_HdrRsltR advR = Srch01_HdrRsltR.create();
			executeQuery(advR, MSBGL0280_MST_RCV_S01(), up0());

			down0().ttl_adv(advR.ttl_adv());
			down0().not_appl_adv_note(advR.not_appl_adv_note());
		}
		
		/**
		 * 買掛金を検索する。
		 */
		protected void srchMlyAp() {
			if (getCo().ap_no_use_flg()) {
				return ;
			}
			
			callApBalSrch01Srv();
			srchSpplBackordAmt();
			
			down2().sort(Srch01_DtlApRsltR.$ap_dpt_cd, 
					Srch01_DtlApRsltR.$ap_dpt_nm, 
					Srch01_DtlApRsltR.$asppl_cd,
					Srch01_DtlApRsltR.$asppl_nm);
		}
		
		protected void callApBalSrch01Srv() {
			MSBHL_ApBalService.ApBal_Srch01 ope = MSBHL_ApBalService.crtApBal_Srch01();
			ope.up0().cmpl_nm_flg(true);
			ope.up0().group_ap_dpt_flg(true);
			ope.up0().group_asppl_flg(true);
			ope.up0().group_trd_cur_flg(true);
			ope.up0().ac_ym_fr(MSUCL_ClUtil.getApClYm().addMonth(MCNumber.ONE));
			ope.up0().ac_ym_to(getAcYm(getToday()));
			ope.up0().ap_cred_cd(up0().cred_cd());
			ope.up0().trd_cur_cd(up0().cur_cd());
			ope.up0().ap_typ(MCStringUtil.arrayValueJoin(getApTypes()));
			ope.exec();
			
			crtDtlApRslt(ope.down0());
		}
		protected String[] getApTypes() {
			// 暫定買掛は買掛金に含めない
			java.util.ArrayList<String> arr = new java.util.ArrayList<>();
			for (MCRow r :  MAC_AP_TYP.exptSubList(
						MAC_AP_TYP.$VALUE,
						new Comparable[]{MAC_AP_TYP.TEMP_AP.value()})) {
				arr.add(r.getStringNE(MAC_AP_TYP.$VALUE));
			}
			return arr.toArray(new String[0]);
		}
		
		protected void crtDtlApRslt(MCList<ApBal_Srch01_RsltR> rsltL) {
			if (rsltL.isEmpty()) {
				return;
			}

			MCIndexKey idxkey = rsltL.createIndex(ApBal_Srch01_RsltR.$ap_dpt_cd, ApBal_Srch01_RsltR.$ap_dpt_nm,
					ApBal_Srch01_RsltR.$asppl_cd, ApBal_Srch01_RsltR.$asppl_nm);
			MCGroupByPolicy gp = getGroupPolicy();
			MCList<ApBal_Srch01_RsltR> sumL = rsltL.groupBy(gp);

			for (ApBal_Srch01_RsltR r : sumL) {
				MCList<ApBal_Srch01_RsltR> subRsltL = rsltL.subList(idxkey, 
						r.ap_dpt_cd(), r.ap_dpt_nm(), r.asppl_cd(), r.asppl_nm());

				Srch01_DtlApRsltR downR = Srch01_DtlApRsltR.create();

				downR.ap_dpt_cd(r.ap_dpt_cd());
				downR.ap_dpt_nm(r.ap_dpt_nm());
				downR.asppl_cd(r.asppl_cd());
				downR.asppl_nm(r.asppl_nm());
				downR.init_bal(getInitBal(subRsltL));
				downR.purc_amt(r.purc_amt().add(r.ret_amt()).add(r.dscnt_amt()).add(r.tax_amt()).add(r.sw_to_amt()));
				downR.cash_amt(r.cash_amt());
				downR.note_amt(r.note_amt());
				downR.xfr_amt(r.account_amt());
				downR.setoff_amt(r.setoff_amt());
				downR.sw_amt(r.sw_amt());
				downR.end_bal(getEndBal(subRsltL));

				down2().add(downR);
			}
		}

		protected MCNumber getInitBal(MCList<ApBal_Srch01_RsltR> rsltL) {
			rsltL.sort(ApBal_Srch01_RsltR.$ac_ym);
			return rsltL.get(0).init_bal();
		}

		protected MCNumber getEndBal(MCList<ApBal_Srch01_RsltR> rsltL) {
			rsltL.sort(SortType.DESC, ApBal_Srch01_RsltR.$ac_ym);
			return rsltL.get(0).end_bal();
		}

		/**
		 * グループポリシーを取得する
		 * <p>
		 */
		protected MCGroupByPolicy getGroupPolicy() {
			MCGroupByPolicy gp = new MCGroupByPolicy(
					ApBal_Srch01_RsltR.$ap_dpt_cd, 
					ApBal_Srch01_RsltR.$ap_dpt_nm, 
					ApBal_Srch01_RsltR.$asppl_cd,
					ApBal_Srch01_RsltR.$asppl_nm);
			
			gp.sum(ApBal_Srch01_RsltR.$purc_amt,
					ApBal_Srch01_RsltR.$ret_amt,
					ApBal_Srch01_RsltR.$dscnt_amt,
					ApBal_Srch01_RsltR.$sw_to_amt,
					ApBal_Srch01_RsltR.$tax_amt,
					ApBal_Srch01_RsltR.$cash_amt,
					ApBal_Srch01_RsltR.$note_amt,
					ApBal_Srch01_RsltR.$account_amt,
					ApBal_Srch01_RsltR.$setoff_amt,
					ApBal_Srch01_RsltR.$sw_amt);
					
			return gp;
		}
		
		/**
		 * 発注残を検索する
		 */
		protected void srchSpplBackordAmt() {
			MCList<Srch01_DtlApRsltR> purcL = MCList.create(Srch01_DtlApRsltR.class);
			executeQuery(purcL, MSBGL0280_MST_PURC_SCHD_S01(), up0());
			
			// 買掛残高のリストに発注残をマージする
			MCIndexKey idxkey = purcL.createIndex(Srch01_DtlApRsltR.$ap_dpt_cd, 
					Srch01_DtlApRsltR.$ap_dpt_nm, 
					Srch01_DtlApRsltR.$asppl_cd,
					Srch01_DtlApRsltR.$asppl_nm);
			for (Srch01_DtlApRsltR r : down2()) {
				Srch01_DtlApRsltR purcR = purcL.getFirst(idxkey, r.ap_dpt_cd(), r.ap_dpt_nm(), r.asppl_cd(), r.asppl_nm());
				if (isNull(purcR)) {
					r.backord_amt(MCNumber.ZERO);
				}
				else {
					r.backord_amt(purcR.backord_amt());
				}
				r.cred_amt(r.end_bal().add(r.backord_amt()).negate());
			}
			
			// 買掛残高のリストがなく、発注残のみの場合はレコードを補完する
			MCIndexKey down2IndexKey = down2().createIndex(Srch01_DtlApRsltR.$ap_dpt_cd, 
					Srch01_DtlApRsltR.$ap_dpt_nm, 
					Srch01_DtlApRsltR.$asppl_cd,
					Srch01_DtlApRsltR.$asppl_nm);
			MCList<Srch01_DtlApRsltR> tmpL = MCList.create(Srch01_DtlApRsltR.class);
			for (Srch01_DtlApRsltR purcR : purcL) {
				Srch01_DtlApRsltR down2R = down2().getFirst(down2IndexKey, purcR.ap_dpt_cd(), purcR.ap_dpt_nm(), purcR.asppl_cd(), purcR.asppl_nm());
				if (isNull(down2R)) {
					Srch01_DtlApRsltR tmpR = Srch01_DtlApRsltR.create();
					tmpR.ap_dpt_cd(purcR.ap_dpt_cd());
					tmpR.ap_dpt_nm(purcR.ap_dpt_nm());
					tmpR.asppl_cd(purcR.asppl_cd());
					tmpR.asppl_nm(purcR.asppl_nm());
					tmpR.init_bal(MCNumber.ZERO);
					tmpR.purc_amt(MCNumber.ZERO);
					tmpR.cash_amt(MCNumber.ZERO);
					tmpR.note_amt(MCNumber.ZERO);
					tmpR.xfr_amt(MCNumber.ZERO);
					tmpR.setoff_amt(MCNumber.ZERO);
					tmpR.sw_amt(MCNumber.ZERO);
					tmpR.end_bal(MCNumber.ZERO);
					tmpR.backord_amt(purcR.backord_amt());
					tmpR.cred_amt(purcR.backord_amt().negate());
					
					tmpL.add(tmpR);
				}
			}
			down2().addAll(tmpL);
		}

		/**
		 * 前渡金を検索する。
		 */
		protected void srchApPay() {
			
			Srch01_HdrRsltR advR = Srch01_HdrRsltR.create();
			executeQuery(advR, MSBGL0280_MST_ADV_PAY_ACT_S01(), up0());

			if (advR.isEmpty()) {
				advR.ttl_adv_pay(MCNumber.ZERO);
			}
			down0().ttl_adv_pay(advR.ttl_adv_pay());
		}
		/**
		 * 検索結果を集計する。
		 */
		protected void sumCred() {
			
			// 売掛明細の集計
			for (Srch01_DtlRsltR dtlR : down1()) {
				
				down0().ttl_init_bal(MCNumber.sum(down0().ttl_init_bal(), dtlR.init_bal()));
				down0().ttl_sls(MCNumber.sum(down0().ttl_sls(), dtlR.sls_amt()));
				down0().ttl_rcv(MCNumber.sum(down0().ttl_rcv(), dtlR.cash_amt(), dtlR.note_amt(), dtlR.xfr_amt(), dtlR.setoff_amt(), dtlR.sw_amt()));
				down0().not_appl_note(MCNumber.sum(down0().not_appl_note(), dtlR.not_appl_note()));
				down0().ttl_backord(MCNumber.sum(down0().ttl_backord(), dtlR.backord_amt()));
				down0().ttl_qtn(MCNumber.sum(down0().ttl_qtn(), dtlR.qtn_amt()));
			}
			
			// 買掛明細の集計
			for (Srch01_DtlApRsltR dtlApR : down2()) {
				down0().ttl_init_bal_ap(MCNumber.sum(down0().ttl_init_bal_ap(), dtlApR.init_bal()));
				down0().ttl_purc(MCNumber.sum(down0().ttl_purc(), dtlApR.purc_amt()));
				down0().ttl_pay(MCNumber.sum(down0().ttl_pay(), dtlApR.cash_amt(), dtlApR.note_amt(), dtlApR.xfr_amt(), dtlApR.setoff_amt(), dtlApR.sw_amt()));
				down0().ttl_po_backord(MCNumber.sum(down0().ttl_po_backord(), dtlApR.backord_amt()));
			}
			// 当月残高 = 前月売掛残高＋税込売上額－入金額－前受金残高－前月買掛残高－税込仕入額＋支払額＋前渡金残高
			down0().ttl_end_bal(down0().ttl_init_bal().add(down0().ttl_sls()
					.subtract(down0().ttl_rcv()).subtract(down0().ttl_adv())
					.subtract(down0().ttl_init_bal_ap()).subtract(down0().ttl_purc()))
					.add(down0().ttl_pay()).add(down0().ttl_adv_pay()));
		}
	}

	//FMCB CUSTOM END
}