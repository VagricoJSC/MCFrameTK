package mcframe.clientMSBG.MSBGP0110;

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
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMSUB.MSUBP0010.*;
import mcframe.clientMSUB.MSUBP5010.*;

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
import mcframe.clientMSUC.MSUCP0050.MSUCP_ClUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBGP_ArAgeSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBGP_ArAgeSrch_MC extends MSBGP_ArAgeSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_ArAgeSrch_MC() {
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
	public MSBGP_ArAgeSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBGL0110_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0110_Srch01Caller<P extends MSBGP_ArAgeSrch, B extends MS_MSBGL0110_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBGL0110_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			
			setREFStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			
			setSRCHStatus();
		}
	}


	/**
	 * Panel[Cnd]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doCnd_select_all(MCEventInfo info) {
		setBoolean(Cnd2Panel, true);
	}
	/**
	 * Panel[Cnd]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doCnd_deselect_all(MCEventInfo info) {
		setBoolean(Cnd2Panel, false);
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBGL0110_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBGP0120]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBGP0120(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBGP0120");
		aso.putCnd(crtOpenMSBGP0120CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * 遷移先[MSBGP0120]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBG.MSBGP0120.CndR crtOpenMSBGP0120CndR(MAUCP_AppScreenOpener aso, RsltR r) {

		mcframe.clientMSBG.MSBGP0120.CndR to = mcframe.clientMSBG.MSBGP0120.CndR.create();
		
		to.acst_cd(r.acst_cd());
		to.ar_dpt_cd(r.ar_dpt_cd());
		to.trd_cur_cd(r.trd_cur_cd());
		to.iv_no(r.iv_no());
		to.wrk_no(r.wrk_no());
		to.ar_typ(r.ar_typ());
		to.incl_not_bill_flg(true);
		to.incl_can_flg(true);
		return to;
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBGP0260]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBGP0260(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBGP0260");
		aso.putCnd(crtOpenMSBGP0260CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * 遷移先[MSBGP0260]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBG.MSBGP0260.CndR crtOpenMSBGP0260CndR(MAUCP_AppScreenOpener aso, RsltR r) {

		mcframe.clientMSBG.MSBGP0260.CndR to = mcframe.clientMSBG.MSBGP0260.CndR.create();
		
		to.acst_cd(r.acst_cd());
		to.ar_dpt_cd(r.ar_dpt_cd());
		to.trd_cur_cd(r.trd_cur_cd());
		to.iv_no(r.iv_no());
		to.wrk_no(r.wrk_no());
		to.ar_typ(r.ar_typ());
		return to;
	}
	
	// --------------------画面初期値設定start--------------------
	
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		
		Rslt_end_bal_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_start_bal_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_one_ar_not_appl_bal_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_two_ar_not_appl_bal_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_three_ar_not_appl_bal_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_four_ar_not_appl_bal_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_five_ar_not_appl_bal_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_six_ar_not_appl_bal_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_ar_slip_not_appl_bal_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		
		Rslt_acst_grp_p_PPanel.setRelateBeans(Cnd_acst_grp_p_PPanel);
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		MCDate arClYm = MSUCP_ClUtil.getArClYm(getRootPanel());
		
		setValueEx(Cnd_this_ym, arClYm.addMonth(1));
		
		setBoolean(Cnd2Panel, true);
	}

	// --------------------画面初期値設定end----------------------
	// --------------------画面ステータス処理start------------------------
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		changeDispMode();
		
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		FoldTab.focusActiveFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}
	
	/**
	 * 集計単位の選択に応じてグループキーのモード制御を行う
	 * 
	 */
	protected void changeDispMode() {
		
		// 債権部門別集計フラグ
		if (getCndR().ar_dpt_flg()) {
			setDefaultMode(columnRslt_ar_dpt_cd);
			setDefaultMode(columnRslt_ar_dpt_nm);
		}
		else {
			columnRslt_ar_dpt_cd.setMode(MCMode.INVISIBLE);
			columnRslt_ar_dpt_nm.setMode(MCMode.INVISIBLE);
		}
		
		// ＷＧ別集計フラグ
		if (getCndR().wg_flg()) {
			setDefaultMode(columnRslt_wg_cd);
			setDefaultMode(columnRslt_wg_nm);
		}
		else {
			columnRslt_wg_cd.setMode(MCMode.INVISIBLE);
			columnRslt_wg_nm.setMode(MCMode.INVISIBLE);
		}
		
		// 売掛先別集計フラグ
		if (getCndR().acst_flg()) {
			setDefaultMode(columnRslt_acst_cd);
			setDefaultMode(columnRslt_acst_nm);
			setDefaultMode(columnRslt_bill_cl_day);
			setDefaultMode(columnRslt_rcv_crryovr_mons);
			setDefaultMode(columnRslt_rcv_day);
			setDefaultMode(columnRslt_crryovr_mons_typ);
			setDefaultMode(columnRslt_crryovr_mons_typ_nm);
		}
		else {
			columnRslt_acst_cd.setMode(MCMode.INVISIBLE);
			columnRslt_acst_nm.setMode(MCMode.INVISIBLE);
			columnRslt_bill_cl_day.setMode(MCMode.INVISIBLE);
			columnRslt_rcv_crryovr_mons.setMode(MCMode.INVISIBLE);
			columnRslt_rcv_day.setMode(MCMode.INVISIBLE);
			columnRslt_crryovr_mons_typ.setMode(MCMode.INVISIBLE);
			columnRslt_crryovr_mons_typ_nm.setMode(MCMode.INVISIBLE);
		}

		// インボイスＮＯ別集計フラグ
		if (getCndR().iv_no_flg()) {
			setDefaultMode(columnRslt_iv_no);
		}
		else {
			columnRslt_iv_no.setMode(MCMode.INVISIBLE);
		}
		
		// 案件別集計フラグ
		if (getCndR().wrk_no_flg()) {
			setDefaultMode(columnRslt_wrk_no);
			setDefaultMode(columnRslt_wrk_nm);
		}
		else {
			columnRslt_wrk_no.setMode(MCMode.INVISIBLE);
			columnRslt_wrk_nm.setMode(MCMode.INVISIBLE);
		}

		// 債権区分別集計フラグ
		if (getCndR().wrk_no_flg()) {
			setDefaultMode(columnRslt_ar_typ);
			setDefaultMode(columnRslt_ar_typ_nm);
		}
		else {
			columnRslt_ar_typ.setMode(MCMode.INVISIBLE);
			columnRslt_ar_typ_nm.setMode(MCMode.INVISIBLE);
		}
	}
	
	// --------------------画面ステータス処理end--------------------------
	// --------------------セルの設定start--------------------------	
	@Override
	protected void setCellConfig() {

		super.setCellConfig();
		RsltTable.setCellConfig(createRsltCellConfig());
	}
	
	protected RsltCellConfig createRsltCellConfig() {

		return new RsltCellConfig();
	}

	/**
	 * セル設定クラス
	 */
	public class RsltCellConfig extends MAUDP_CellConfig {

		// 明細のデータ項目
		protected MCColumnConfig _COLS[] = new MCColumnConfig[] {
				columnRslt_one_ar_not_appl_bal,
				columnRslt_two_ar_not_appl_bal,
				columnRslt_three_ar_not_appl_bal,
				columnRslt_four_ar_not_appl_bal,
				columnRslt_five_ar_not_appl_bal,
				columnRslt_six_ar_not_appl_bal
		};

		protected Color _WARN1 = getPgmSettingColor(
				MSBGP_ArAgeSrch.class, "color.cell.now.bg");
		protected Color _WARN2 = getPgmSettingColor(
				MSBGP_ArAgeSrch.class, "color.cell.past.bg");

		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table, MCMode mode) {

			RsltR r = getRsltL().get(index);

			// 売掛先別の集計でない場合はデフォルト
			if (isNull(r.acst_cd())) {
				return super.getPriorBG(index, column, table, mode);
			}

			int col = getConfigIndex(column);
			int site = getActSite(index); // 入金サイト

			// インデックスか入金サイトが取得できなかった場合はデフォルト色
			if (col == -1 || site == -1) {
				return super.getPriorBG(index, column, table, mode);
			}

			// 入金サイトと同月のカラム
			if (site == col) {
				MCNumber amt = (MCNumber)table.getValue(index, _COLS[col]);
				if (amt.isPositive()) return _WARN1;
			}
			// 入金サイトより前の月のカラム
			else if (site < col) {
				MCNumber amt = (MCNumber)table.getValue(index, _COLS[col]);
				if (amt.isPositive()) return _WARN2;
			}

			return super.getPriorBG(index, column, table, mode);

		}

		/**
		 * 指定された売掛金カラムコンフィグリストのインデックスを取得する
		 * 
		 * @param config カラムコンフィグ
		 * @return インデックス
		 */
		protected int getConfigIndex(MCColumnConfig config) {

			for (int i = 0; i < _COLS.length; i++) {
				if (config == _COLS[i]) return i;
			}

			return -1;
		}

		/**
		 * 実際の入金サイトを求める
		 * 
		 * @param index 行番号
		 * @return 入金サイト
		 */
		protected int getActSite(int index) {

			RsltR r = getRsltL().get(index);

			if (isNull(r.bill_cl_day())
					|| isNull(r.rcv_crryovr_mons())) {
				return -1;
			}
			if (MAC_CRRYOVR_MONS_TYP.isMM(r.crryovr_mons_typ()) && isNull(r.rcv_day())) {
				return -1;
			}

			int clDay = r.bill_cl_day().intValue();
			int coMons = r.rcv_crryovr_mons().intValue();
			int today = getDayOfToday();

			if (MAC_CRRYOVR_MONS_TYP.isMM(r.crryovr_mons_typ())) {
				int rcvDay = r.rcv_day().intValue();
				// 締日が入金日の後の場合、実際のサイトは１ヶ月後
				if (rcvDay < clDay) { 
					coMons++;
				}

				// まだ入金日が来ていない場合は、実際のサイトを１ヶ月後とする
				if (today < rcvDay && !(rcvDay == 99 && clDay == 99)) {
					coMons++;
				}				

				return coMons;
			}
			else {
				// 当月の請求締日を求める
				MCDate clDt;
				if (isSame(clDay, 99)) {
					clDt = getCndR().this_ym().endOfMonth();
				}
				else {
					if (getCndR().this_ym().endOfMonth().getDay() > clDay) {
						clDt = getCndR().this_ym().modDay(clDay);
					}
					else {
						clDt = getCndR().this_ym().endOfMonth();
					}
				}
				// 当月請求締日に入金サイトを加算する
				MCDate rcvSchdDt = clDt.addDay(coMons);
				// 月差を求める
				int coMonsDD = (int)rcvSchdDt.diffMonth(clDt);
				// 運用日付ベースで、まだ入金日が来ていない場合は、実際のサイトを1か月後とする
				if (today < rcvSchdDt.getDay()) {
					coMonsDD++;
				}
				return coMonsDD;
			}
		}

		/**
		 * 本日の「日」を取得する
		 * 
		 * @return 本日の日
		 */
		protected int getDayOfToday() {

			int today = getToday().getDay();
			int lastday = getToday().endOfMonth().getDay();

			// 月の最終日と等しい場合は99を、それ以外の場合はそのままの日を返す
			return (today == lastday) ? 99 : today;
		}
	}
	// --------------------セルの設定end----------------------------	

}