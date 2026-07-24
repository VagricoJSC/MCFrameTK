package mcframe.clientMSBG.MSBGP0020;

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

import mcframe.clientFXUC.FXUCP0130.*;
import mcframe.clientMAUB.MAUBP0060.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5070.*;
import mcframe.clientMAUB.MAUBP5390.*;
import mcframe.clientMSUB.MSUBP0010.*;

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
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientFXBA.FXBAP0010.FXBAP_PagingParam;
import mcframe.clientFXBA.FXBAP0010.FXBAP_PanelBase;
import mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBGP_BillDSel"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBGP_BillDSel_MC extends MSBGP_BillDSel_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MCIndexKey _dtlSlsLIndex;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_BillDSel_MC() {
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
	public MSBGP_BillDSel_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[DtlSlsBtn]のボタン[sls_select_all]の押下時の処理
	 */
	@Override
	public void doDtlSlsBtn_sls_select_all(MCEventInfo info) {
		doSelectAll(DtlSlsTable, true);
		setSum();
	}
	/**
	 * Panel[DtlSlsBtn]のボタン[sls_deselect_all]の押下時の処理
	 */
	@Override
	public void doDtlSlsBtn_sls_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlSlsTable, true);
		setSum();
	}
	/**
	 * Panel[DtlRcvBtn]のボタン[rcv_select_all]の押下時の処理
	 */
	@Override
	public void doDtlRcvBtn_rcv_select_all(MCEventInfo info) {
		doSelectAll(DtlRcvTable, false);
		setSum();
	}
	/**
	 * Panel[DtlRcvBtn]のボタン[rcv_deselect_all]の押下時の処理
	 */
	@Override
	public void doDtlRcvBtn_rcv_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlRcvTable, false);
		setSum();
	}
	/**
	 * Panel[DtlAdvBtn]のボタン[adv_select_all]の押下時の処理
	 */
	@Override
	public void doDtlAdvBtn_adv_select_all(MCEventInfo info) {
		doSelectAll(DtlAdvTable, false);
		setSum();
	}
	/**
	 * Panel[DtlAdvBtn]のボタン[adv_deselect_all]の押下時の処理
	 */
	@Override
	public void doDtlAdvBtn_adv_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlAdvTable, false);
		setSum();
	}
	/**
	 * [MS_MSBGL0020_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0020_Srch01Caller<P extends MSBGP_BillDSel, B extends MS_MSBGL0020_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBGL0020_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void show() {

			super.show();
			_dtlSlsLIndex = getDtlSlsL().createIndex(DtlSlsR.$act_d_no, DtlSlsR.$act_rev);
			removeAdvR(_param1);
			setCheckFlg(_param1);
			setSum();
			DtlSlsTable.selectLeftmostColumn(0);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			if (!isNewSrch()) {
				setScreenAsync(false);
			}
		}

		@Override
		protected void clear() {
			super.clear();
			if (isNewSrch()) {
				getDtlSlsSubL().clear();
			}
		}

		@Override
		protected void beforeCall() {
			super.beforeCall();

			if (!isNewSrch()) {
				copyDtlSub();
			}
		}

		@Override
		protected void afterCall() {
			super.afterCall();
		}

		@Override
		protected void resultNoDataFound() {
			super.resultNoDataFound();

			DtlSlsBtn_paging_PPanel.dispUpdate();
		}

		@Override
		protected void resultSuccess() {
			super.resultSuccess();

			DtlSlsBtn_paging_PPanel.dispUpdate();
			
			if (isNewSrch()) {
				// 入金枠が3行になるための調整
				getSplitPane(DtlSlsPanel).setDividerLocation(0.62);
			}
		}

		@Override
		protected boolean isDownBlockChanged() {
			if (isNewSrch()) {
				return super.isDownBlockChanged();
			}
			return false;
		}

		/**
		 * 変更のあった行を非表示リストにコピーする
		 */
		protected void copyDtlSub() {
			MCList<DtlSlsR> changed = getDtlSlsL().statusChangedList();
			for (DtlSlsR r : changed) {
				// 既に同じ行が非表示リストに存在する場合
				if (getDtlSlsSubL().subList(DtlSlsR.$bill_d_no, r.bill_d_no()).size() > 0) {
					copy(getDtlSlsSubL().getFirst(DtlSlsR.$bill_d_no, r.bill_d_no()), r, createMap_DtlSlsSubR_DtlSlsR());
				}
			}
		}
		/**
		 * 他の請求締で選択済みの前受金を一覧から除外する
		 */
		protected void removeAdvR(MCList<MCRow> l) {
			if (isNull(l) || getDtlAdvL().isEmpty()) {
				return;
			}
			MCIndexKey advIdx = getDtlAdvL().createIndex(DtlAdvR.$rcv_act_d_no, DtlAdvR.$rcv_act_d_seq);
			MCList<DtlAdvR> rmAdvL = MCList.create(DtlAdvR.class);
			for (MCRow r : l) {
				if (!isNull(r.getNumber("rec_id"))
					&& !isSame(r.getNumber("rec_id"), getCndR().rec_id())) {
					rmAdvL.add(
						getDtlAdvL().getFirst(
							advIdx,
							r.getValueNE("rcv_act_d_no"), r.getValueNE("rcv_act_d_seq"))
					);
				}
			}
			getDtlAdvL().removeAll(rmAdvL);
		}

		/**
		 * 引数のリストと同じ請求明細IDを持つ行に対してフラグを設定する
		 * 
		 * @param l 他画面から受け取った選択済みの明細リスト
		 */
		protected void setCheckFlg(MCList<MCRow> l) {

			MCDate ym = getCndR().bill_ym();
			MCNumber clDay = getCndR().bill_cl_day();
			MCDate clDate = getBillClDate(ym, clDay);

			// 検索ボタンを押下して検索した場合、
			// 売上枠の明細について、保持している全件の非表示リストを初期化する
			if (isNewSrch()) {

				// 既に選択済みの場合は選択済みの行にフラグを立てる
				if (getCndR().bill_d_sel_flg()) {
					MCIndexKey slsIdx = getDtlSlsSubL().createIndex(DtlSlsR.$bill_d_no);
					for (MCRow r : l) {
						DtlSlsSubR slsSubR = getDtlSlsSubL().getFirst(slsIdx, r.getValueNE("bill_d_no"));
						if (!isNull(slsSubR)) {
							slsSubR.check(true);
							slsSubR.setStatus(Status.MODIFY);
							slsSubR.bill_prnt_tgt_flg(r.getBoolean("bill_prnt_tgt_flg"));
							slsSubR.bill_mtd_typ(r.getString("bill_mtd_typ"));
							slsSubR.bill_mtd_typ_nm(MSC_BILL_MTD_TYP.getNE(r.getString("bill_mtd_typ")).name());
							if (MSC_BILL_MTD_TYP.isPART_BILL(slsSubR.bill_mtd_typ())) {
								slsSubR.prt_amt(r.getNumber("amt"));
								slsSubR.prt_tax_amt(r.getNumber("tax_amt"));
								slsSubR.prt_inc_tax_amt(r.getNumber("amt").add(r.getNumber("tax_amt")));
							}
						}
					}
				}
				// まだ選択していない場合は指定された締年月日に従ってフラグを立てる
				else {
					for (DtlSlsSubR dtlSubR : getDtlSlsSubL()) {
						if (isNull(dtlSubR.schd_bill_dt()) || clDate.gte(dtlSubR.schd_bill_dt())) {
							dtlSubR.check(true);
							dtlSubR.bill_prnt_tgt_flg(true);
							dtlSubR.setStatus(Status.MODIFY);
							dtlSubR.bill_mtd_typ(MSC_BILL_MTD_TYP.ALL_BILL.value());
							dtlSubR.bill_mtd_typ_nm(MSC_BILL_MTD_TYP.ALL_BILL.name());
						}
						else {
							dtlSubR.check(false);
							dtlSubR.bill_prnt_tgt_flg(false);
							dtlSubR.setStatus(Status.NONE);
							dtlSubR.bill_mtd_typ(null);
							dtlSubR.bill_mtd_typ_nm(null);
						}
						dtlSubR.prt_amt(null);
						dtlSubR.prt_tax_amt(null);
						dtlSubR.prt_inc_tax_amt(null);
					}
				}
			}

			if (getCndR().bill_d_sel_flg()) {

				if (isNull(l)) {
					return;
				}
				MCIndexKey rcvIdx = getDtlRcvL().createIndex(DtlRcvR.$bill_d_no);
				MCIndexKey advIdx = getDtlAdvL().createIndex(DtlAdvR.$rcv_act_d_no, DtlAdvR.$rcv_act_d_seq);

				// 入金枠の明細について、請求明細ＮＯで検索して存在した場合はフラグを立てる
				for (MCRow r : l) {
					DtlRcvR rcvR = getDtlRcvL().getFirst(rcvIdx, r.getValueNE("bill_d_no"));
					if (!isNull(rcvR)) {
						rcvR.check(true);
						rcvR.setStatus(Status.MODIFY);
					}
					DtlAdvR advR =
						getDtlAdvL().getFirst(advIdx, r.getValueNE("rcv_act_d_no"), r.getValueNE("rcv_act_d_seq"));
					if (!isNull(advR)) {
						advR.check(true);
						advR.setStatus(Status.MODIFY);
					}
				}

				// 売上枠の明細について、非表示リストから画面表示リストにコピーする
				for (DtlSlsR dtlSlsR : getDtlSlsL()) {
					DtlSlsSubR dtlSlsSubR = getDtlSlsSubL().getFirst(DtlSlsR.$bill_d_no, dtlSlsR.bill_d_no());
					if (!isNull(dtlSlsSubR)) {
						int guiIndex = dtlSlsR.getGUIIndex();
						copy(dtlSlsR, dtlSlsSubR, createMap_DtlSlsR_DtlSlsSubR());
						dtlSlsR.setGUIIndex(guiIndex);
					}
				}
			}
			// まだ選択していない場合は指定された締年月日に従ってフラグを立てる
			else {

				// 請求予定日がnull または 締年月日 >= 請求予定日の行に対してフラグを立てる
				for (DtlSlsR r : getDtlSlsL()) {
					DtlSlsSubR dtlSlsSubR = getDtlSlsSubL().getFirst(DtlSlsR.$bill_d_no, r.bill_d_no());
					if (!isNewSrch() && !isNull(dtlSlsSubR)) {
						int guiIndex = r.getGUIIndex();
						copy(r, dtlSlsSubR, createMap_DtlSlsR_DtlSlsSubR());
						r.setGUIIndex(guiIndex);
						continue;
					}

					if (isNull(r.schd_bill_dt()) || clDate.gte(r.schd_bill_dt())) {
						r.check(true);
						r.bill_prnt_tgt_flg(true);
						r.setStatus(Status.MODIFY);
						r.bill_mtd_typ(MSC_BILL_MTD_TYP.ALL_BILL.value());
						r.bill_mtd_typ_nm(MSC_BILL_MTD_TYP.ALL_BILL.name());
					}
					setBillPrntTgtFlg(r);
				}
				for (DtlRcvR r : getDtlRcvL()) {
					if (isNull(r.schd_bill_dt()) || clDate.gte(r.schd_bill_dt())) {
						r.check(true);
						r.setStatus(Status.MODIFY);
					}
				}
				for (DtlAdvR r : getDtlAdvL()) {
					r.check(true);
					r.setStatus(Status.MODIFY);
				}
			}
		}

		/**
		 * 請求日を取得する
		 * 
		 * @param billYm 請求年月
		 * @param billClDay 請求締日
		 * @return 請求日
		 */
		protected MCDate getBillClDate(MCDate billYm, MCNumber billClDay) {

			if (isNull(billYm) || isNull(billClDay)) {
				return MAC_Y4M.NULL_VAL.value();
			}

			if (billClDay.gt(getEndOfMonth(billYm))) {
				return billYm.endOfMonth();
			}
			else {
				return MCDate.valueOf(billYm.toString("yyyyMM") + lpad(billClDay.toString(), 2, "0"), "yyyyMMdd");
			}
		}

		/**
		 * 月末の日付をMCNumberで取得する
		 * 
		 * @param date 日付
		 * @return 月末の日付
		 */
		protected MCNumber getEndOfMonth(MCDate date) {

			return new MCNumber(Integer.parseInt(date.endOfMonth().toString("dd")));

		}
	}

	/**
	 * 他画面から呼び出された場合の初期化を実装します。<br>
	 * <P>
	 * <li>
	 * 起動タイプ：T1 （参照）<br>
	 * バインド値 ＜必須＞<br>
	 * <table border = 1>
	 * <tr><th>カラム名</th>		<th>型</th>			<th>備考</th></tr>
	 * <tr><td>bill_ym</td>			<td>MCDate</td>		<td>必須</td></tr> 
	 * <tr><td>bill_cl_day</td>		<td>MCNumber</td>	<td>必須</td></tr>
	 * <tr><td>bcst_cd</td>			<td>String</td>		<td>必須</td></tr>
	 * <tr><td>bcst_nm</td>			<td>String</td>		<td>必須</td></tr>
	 * <tr><td>bcst_cd</td>			<td>String</td>		<td>必須</td></tr>
	 * <tr><td>bcst_nm</td>			<td>String</td>		<td>必須</td></tr>
	 * <tr><td>bill_d_sel_flg</td>	<td>boolean</td>	<td>必須</td></tr>
	 * <tr><td>rec_id</td>			<td>MCNumber</td>	<td>必須</td></tr>
	 * </table> <br>
	 * その他の引数[0]：選択済みの明細情報を含むMCList（bill_d_idとrec_idを持つMCRowを保持）<br>
	 * その他の引数[1]：bill_d_sel_flgを持つMCRow<br>
	 * </li>
	 * </P>
	 * 
	 * @param openTyp 起動タイプ
	 * @param bind バインド値
	 * @param param その他の引数
	 */
	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... param) {

		super.initByScreenParam(openTyp, bind, param);

		if (T1 == openTyp) {
			initByScreenParamT1(bind, param);
		}
		bind_tmp = bind.clone();
	}

	protected void initByScreenParamT1(MCRow bind, Object... param) {

		// バインド値
		getCndR().bill_ym(bind.getDate("bill_ym"));
		getCndR().bill_cl_day(bind.getNumber("bill_cl_day"));
		getCndR().bcst_cd(bind.getString("bcst_cd"));
		getCndR().bcst_nm(bind.getString("bcst_nm"));
		getCndR().bill_dpt_cd(bind.getString("bill_dpt_cd"));
		getCndR().bill_dpt_nm(bind.getString("bill_dpt_nm"));
		getCndR().wg_cd(bind.getString("wg_cd"));
		getCndR().wg_nm(bind.getString("wg_nm"));
		getCndR().wrkno_p().wrk_no(bind.getString("wrk_no"));
		getCndR().wrkno_p().wrk_nm(bind.getString("wrk_nm"));
		getCndR().trd_cur_cd(bind.getString("trd_cur_cd"));
		getCndR().trd_cur_nm(bind.getString("trd_cur_nm"));
		getCndR().base_cur_cd(bind.getString("base_cur_cd"));
		getCndR().base_cur_nm(bind.getString("base_cur_nm"));
		getCndR().base_cur_amt_dec_place(bind.getNumber("base_cur_amt_dec_place"));
		getCndR().base_cur_upri_dec_place(bind.getNumber("base_cur_upri_dec_place"));
		getCndR().iv_no(bind.getString("iv_no"));
		getCndR().bill_d_sel_flg(bind.getBoolean("bill_d_sel_flg"));
		getCndR().rec_id(bind.getNumber("rec_id"));
		// その他の引数
		_param1 = (MCList<MCRow>)param[0];
		_param2 = (MCRow)param[1];

		// 検索
		addDoBehind(Cnd_srch);
	}

	/** 他画面から受け取った選択済みの明細リスト */
	protected MCList<MCRow> _param1;
	protected MCRow _param2;

	protected MCRow bind_tmp;
	
	/** 画面クリア時に遷移時の状態に戻す */
	@Override
	public void screenClearSetDefault() {
		super.screenClearSetDefault();
		getCndR().bill_ym(bind_tmp.getDate("bill_ym"));
		getCndR().bill_cl_day(bind_tmp.getNumber("bill_cl_day"));
		getCndR().bcst_cd(bind_tmp.getString("bcst_cd"));
		getCndR().bcst_nm(bind_tmp.getString("bcst_nm"));
		getCndR().bill_dpt_cd(bind_tmp.getString("bill_dpt_cd"));
		getCndR().bill_dpt_nm(bind_tmp.getString("bill_dpt_nm"));
		getCndR().wg_cd(bind_tmp.getString("wg_cd"));
		getCndR().wg_nm(bind_tmp.getString("wg_nm"));
		getCndR().wrkno_p().wrk_no(bind_tmp.getString("wrk_no"));
		getCndR().wrkno_p().wrk_nm(bind_tmp.getString("wrk_nm"));
		getCndR().trd_cur_cd(bind_tmp.getString("trd_cur_cd"));
		getCndR().trd_cur_nm(bind_tmp.getString("trd_cur_nm"));
		getCndR().iv_no(bind_tmp.getString("iv_no"));
		getCndR().bill_d_sel_flg(bind_tmp.getBoolean("bill_d_sel_flg"));
		getCndR().rec_id(bind_tmp.getNumber("rec_id"));

		// 検索
		callMS_MSBGL0020_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {

		setPagingParam(_dtlArBtnPp);

		callMS_MSBGL0020_Srch01();
	}

	/**
	 * 全選択<br>
	 * 指定テーブルの既存行・変更行を全選択します。
	 * @param tab テーブル
	 */
	protected void doSelectAll(MCTable tab, boolean flg) {
		MCColumnConfig chkCol = getCheckColumnConfig(tab);
		doSelectAll(tab, chkCol, flg);
	}

	/**
	 * 全選択<br>
	 * 指定テーブルの既存行・変更行を全選択します。
	 * @param tab テーブル
	 * @param chkCol 「選択」のカラムコンフィグ
	 */
	protected void doSelectAll(MCTable tab, MCColumnConfig chkCol, boolean flg) {
		if (chkCol == null) {
			return ;
		}
		MCList<MCRow> l = (MCList<MCRow>)tab.getViewRows();
		for (MCRow row : l) {
			int i = row.getGUIIndex();
			// 編集可能かつ固定カラムが一つでも空でない行を選択チェック
			if (isEditable(chkCol, i) && !row.isEmpty(row.getConstNameArray())) {
				row.setBooleanNE(chkCol.getRowColumnName(), true);

				if (flg) {
					if (isNull(row.getStringNE(DtlSlsR.$bill_mtd_typ))) {
						row.setStringNE(DtlSlsR.$bill_mtd_typ, MSC_BILL_MTD_TYP.ALL_BILL.value());
						row.setStringNE(DtlSlsR.$bill_mtd_typ_nm, MSC_BILL_MTD_TYP.ALL_BILL.name());
						row.setBooleanNE(DtlSlsR.$bill_prnt_tgt_flg, true);
					}
					setBillPrntTgtFlg((DtlSlsR)row);
					copy(getDtlSlsSubL().getFirst(DtlSlsR.$bill_d_no, row.getStringNE(DtlSlsR.$bill_d_no)), (DtlSlsR)row, createMap_DtlSlsSubR_DtlSlsR());
				}
			}
		}
	}

	/**
	 * 全選択解除<br>
	 * 指定テーブルの全選択を解除します。
	 * @param tab テーブル
	 */
	protected void doDeselectAll(MCTable tab, boolean flg) {
		MCColumnConfig chkCol = getCheckColumnConfig(tab);
		doDeselectAll(tab, chkCol, flg);
	}

	/**
	 * 全選択解除<br>
	 * 指定テーブルの全選択を解除します。
	 * @param tab テーブル
	 * @param chkCol 「選択」のカラムコンフィグ
	 */
	protected void doDeselectAll(MCTable tab, MCColumnConfig chkCol, boolean flg) {
		if (chkCol == null) {
			return ;
		}
		MCList<MCRow> l = (MCList<MCRow>)tab.getViewRows();
		for (MCRow row : l) {
			int i = row.getGUIIndex();
			// 編集可能な選択チェックをオフ
			if (isEditable(chkCol, i)) {
				row.setBooleanNE(chkCol.getRowColumnName(), false);
				row.setStatus(MCRow.NONE);
				if (flg) {
					row.clear(DtlSlsR.$bill_mtd_typ,
							DtlSlsR.$bill_mtd_typ_nm,
							DtlSlsR.$prt_amt,
							DtlSlsR.$prt_tax_amt,
							DtlSlsR.$prt_inc_tax_amt,
							DtlSlsR.$bill_prnt_tgt_flg);

					copy(getDtlSlsSubL().getFirst(DtlSlsR.$bill_d_no, row.getStringNE(DtlSlsR.$bill_d_no)), (DtlSlsR)row, createMap_DtlSlsSubR_DtlSlsR());
				}
			}
		}
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {

		if (!checkForUpd()) {
			return;
		}

		// 自身のrec_idと同じ保持データをクリアする
		_param1.removeAll(_param1.subList("rec_id", getCndR().rec_id()));

		updDtlSlsSubBillPrntFlg();
		// 売上実績
		for (DtlSlsSubR slsR : getDtlSlsSubL()) {
			if (slsR.check()) {

				MCRow selR = _param1.createRow();
				selR.setString("bill_d_no", slsR.bill_d_no());
				selR.setNumber("rec_id", getCndR().rec_id());
				selR.setBoolean("bill_prnt_tgt_flg", slsR.bill_prnt_tgt_flg());
				selR.setString("bill_mtd_typ", slsR.bill_mtd_typ());
				if (!isNull(slsR.prt_amt())) {
					selR.setNumber("amt", slsR.prt_amt());
				} else {
					selR.setNumber("amt", slsR.trd_cur_amt());
				}
				if (!isNull(slsR.prt_tax_amt())) {
					selR.setNumber("tax_amt", slsR.prt_tax_amt());
				} else {
					selR.setNumber("tax_amt", slsR.trd_cur_tax_amt());
				}

				_param1.add(selR);
			}
		}
		// 入金実績
		for (DtlRcvR rcvR : getDtlRcvL()) {
			if (rcvR.check()) {
				MCRow selR = _param1.createRow();
				selR.setString("bill_d_no", rcvR.bill_d_no());
				selR.setBoolean("bill_prnt_tgt_flg", true);
				selR.setNumber("rec_id", getCndR().rec_id());
				_param1.add(selR);
			}
		}
		// 前受金
		for (DtlAdvR advR : getDtlAdvL()) {
			if (advR.check()) {
				MCRow selR = _param1.createRow();
				selR.setString("rcv_act_d_no", advR.rcv_act_d_no());
				selR.setNumber("rcv_act_d_seq", advR.rcv_act_d_seq());
				selR.setNumber("rcv_act_upd_cntr", advR.rcv_act_upd_cntr());
				selR.setNumber("rec_id", getCndR().rec_id());
				_param1.add(selR);
			}
		}

		if (isNull(_param1.subList("rec_id", getCndR().rec_id()))) {
			if (MCMessageBox.YES_OPTION != confirm(MSBGP0002)) {
				return;
			}
		}

		_param2.setBoolean("bill_d_sel_flg", true);

		statusClear();
		requestCloseWindow();

	}

	/**
	 * 確定前チェック
	 * 
	 * @return 確定しても良い状態の場合にtrue
	 */
	protected boolean checkForUpd() {

		MCMessageList msgL = new MCMessageList();
		MCList<DtlSlsR> checkL = MCList.create(DtlSlsR.class);
		checkL = getDtlSlsL().subList(DtlSlsR.$check, true);

		// 必須チェック
		msgL = checkReq(checkL);

		// 一部請求金額、一部請求税額の入力値チェック
		msgL.addAll(checkPrtAmt(getDtlSlsL()));
		msgL.addAll(checkValidAmt(checkL));

		// 仮単価チェック
		msgL.addAll(checkInterimCl(getDtlSlsL()));

		if (!msgL.isEmpty()) {
			message(msgL);
			return false;
		}

		// 確定前確認
		if (confirm(MSBGP0003) != MCMessageBox.YES_OPTION) {
			return false;
		}

		return true;

	}

	/**
	 * 一部請求金額、一部請求税額の入力値チェック
	 * @param checkL チェック対象のリスト
	 * @return msgL チェック結果
	 */
	protected MCMessageList checkPrtAmt(MCList<DtlSlsR> checkL) {
		MCMessageList msgL = new MCMessageList();

		for (DtlSlsR r :checkL) {

			if (r.check()) {

				if (r.inc_tax_flg()) {
					if (!isNull(r.prt_inc_tax_amt())) {
						if (!isValidAmt(r.prt_inc_tax_amt(), r.inc_tax_amt(), r.inc_tax_flg())) {
							if (r.inc_tax_amt().isPositive()) {
								msgL.add(new MCMessage(r, null , MSBGP0025, columnDtlSls_prt_inc_tax_amt.getLabelByLocale(), r.inc_tax_amt(), r.prt_inc_tax_amt()));
							}
							else if (r.inc_tax_amt().isNegative()) {
								msgL.add(new MCMessage(r, null , MSBGP0026, columnDtlSls_prt_inc_tax_amt.getLabelByLocale(), r.inc_tax_amt(), r.prt_inc_tax_amt()));
							}
						}
					}
				}
				else {
					boolean needsSumAmtChk = true;
					if (!isNull(r.prt_amt())) {
						if (!isValidAmt(r.prt_amt(), r.trd_cur_amt(), r.inc_tax_flg())) {
							needsSumAmtChk = false;
							if (r.trd_cur_amt().isPositive()) {
								msgL.add(new MCMessage(r, null , MSBGP0025, columnDtlSls_prt_amt.getLabelByLocale(), r.trd_cur_amt(), r.prt_amt()));
							}
							else if (r.trd_cur_amt().isNegative()) {
								msgL.add(new MCMessage(r, null , MSBGP0026, columnDtlSls_prt_amt.getLabelByLocale(), r.trd_cur_amt(), r.prt_amt()));
							}
						}
					}
					if (!isNull(r.prt_tax_amt())) {
						if (!isValidAmt(r.prt_tax_amt(), r.trd_cur_tax_amt(), r.inc_tax_flg())) {
							needsSumAmtChk = false;
							if (r.trd_cur_tax_amt().isPositive()) {
								msgL.add(new MCMessage(r, null , MSBGP0025, columnDtlSls_prt_tax_amt.getLabelByLocale(), r.trd_cur_tax_amt(), r.prt_tax_amt()));
							}
							else if (r.trd_cur_tax_amt().isNegative()) {
								msgL.add(new MCMessage(r, null , MSBGP0026, columnDtlSls_prt_tax_amt.getLabelByLocale(), r.trd_cur_tax_amt(), r.prt_tax_amt()));
							}
						}
					}
					if (needsSumAmtChk) {
						if (!isNull(r.prt_amt()) && !isNull(r.prt_tax_amt())) {
							if (!isValidSumAmt(r)) {
								msgL.add(new MCMessage(r, null , MSBGP0027, r.trd_cur_amt(), r.trd_cur_tax_amt(), r.prt_amt(), r.prt_tax_amt()));
							}
						}
					}
				}
			}
		}
		return msgL;
	}
	protected boolean isValidAmt(MCNumber prtTrdCurAmt, MCNumber trdCuramt, Boolean incTaxFlg) {
		if (incTaxFlg) {
			if (trdCuramt.isPositive()) {
				if (trdCuramt.lte(prtTrdCurAmt)) {
					return false;
				}
				if (prtTrdCurAmt.isNegative()) {
					return false;
				}
			}
			else if (trdCuramt.isNegative()) {
				if (prtTrdCurAmt.lte(trdCuramt)) {
					return false;
				}
				if (prtTrdCurAmt.isPositive()) {
					return false;
				}
			}
		}
		else {
			if (trdCuramt.isPositive()) {
				if (trdCuramt.lt(prtTrdCurAmt)) {
					return false;
				}
				if (prtTrdCurAmt.isNegative()) {
					return false;
				}
			}
			else if (trdCuramt.isNegative()) {
				if (prtTrdCurAmt.lt(trdCuramt)) {
					return false;
				}
				if (prtTrdCurAmt.isPositive()) {
					return false;
				}
			}
		}
		return true;
	}
	protected boolean isValidSumAmt(DtlSlsR r) {
		if (isSame(r.prt_amt().add(r.prt_tax_amt()),
				r.trd_cur_amt().add(r.trd_cur_tax_amt()))) {
			return false;
		}
		return true;
	}
	protected MCMessageList checkValidAmt(MCList<DtlSlsR> checkL) {
		MCMessageList msgL = new MCMessageList();
		MCList<DtlSlsR> billPrntL = checkL.subList(DtlSlsR.$bill_prnt_tgt_flg, true);
		MCIndexKey idxDtlSls = checkL.createIndex(DtlSlsR.$act_d_no);
		MCList<DtlSlsR>[] billPrntGrpL = billPrntL.groupList(DtlSlsR.$act_d_no);

		for (MCList<DtlSlsR> grpL : billPrntGrpL) {
			DtlSlsR grpR = grpL.get(0);
			MCList<DtlSlsR> checkGrpL = checkL.subList(idxDtlSls, grpR.act_d_no());
			MCNumber billPrntSumAmt = MCNumber.ZERO;
			MCNumber billPrntSumTaxAmt = MCNumber.ZERO;
			MCNumber sumAmt = MCNumber.ZERO;
			MCNumber sumTaxAmt = MCNumber.ZERO;

			for (DtlSlsR r : checkGrpL) {
				if (!isNull(r.prt_amt())) {
					sumAmt = sumAmt.add(r.prt_amt());
				}
				else {
					sumAmt = sumAmt.add(r.trd_cur_amt());
				}
				if (!isNull(r.prt_tax_amt())) {
					sumTaxAmt = sumTaxAmt.add(r.prt_tax_amt());
				}
				else {
					sumTaxAmt = sumTaxAmt.add(r.trd_cur_tax_amt());
				}
			}

			for (DtlSlsR r : grpL) {
				if (!isNull(r.prt_amt())) {
					billPrntSumAmt = billPrntSumAmt.add(r.prt_amt());
				}
				else {
					billPrntSumAmt = billPrntSumAmt.add(r.trd_cur_amt());
				}
				if (!isNull(r.prt_tax_amt())) {
					billPrntSumTaxAmt = billPrntSumTaxAmt.add(r.prt_tax_amt());
				}
				else {
					billPrntSumTaxAmt = billPrntSumTaxAmt.add(r.trd_cur_tax_amt());
				}
			}

			if (!isSame(sumAmt, billPrntSumAmt) || !isSame(sumTaxAmt, billPrntSumTaxAmt)) {
				msgL.add(new MCMessage(grpR, null , MSBGP0028, grpR.act_d_no(), billPrntSumAmt, billPrntSumTaxAmt, sumAmt, sumTaxAmt));
			}
		}

		return msgL;
	}

	/**
	 * 仮単価チェック<br>
	 * 請求先の売上仮単価締ＦＬＧがオフで、仮単価チェックがオンの場合エラー
	 * 
	 * @param checkL チェック対象のリスト
	 * @return チェック結果
	 */
	protected MCMessageList checkInterimCl(MCList<DtlSlsR> checkL) {
		MCMessageList msgL = new MCMessageList();

		for (DtlSlsR r :checkL) {
			if (r.check() && MAC_SLIP_STS_TYP.isCRT(r.slip_sts_typ())) {
				// 請求先仮単価締可能ＦＬＧがオフで、仮単価チェックがオン
				if (!r.sls_interim_cl_flg() && r.interim_flg()) {
					msgL.add(new MCMessage(MSBGP0005, toDispGUIIndex(r)));
				}
			}
		}
		
		return msgL;
	}

	@Override
	public MCTable getListRegTable() {
		return DtlSlsTable;
	}

	FXBAP_PagingParam _dtlArBtnPp = null;

	@Override
	protected void setupParts() {
		super.setupParts();
		Hdr_lastBillAmt_p_PPanel.setRelateBeans(Cnd_trd_cur_cd, Hdr_amt_dec_place);
		Hdr_rcvAmt_p_PPanel.setRelateBeans(Cnd_trd_cur_cd, Hdr_amt_dec_place);
		Hdr_setoffAmt_p_PPanel.setRelateBeans(Cnd_trd_cur_cd, Hdr_amt_dec_place);
		Hdr_bfwAmt_p_PPanel.setRelateBeans(Cnd_trd_cur_cd, Hdr_amt_dec_place);
		Hdr_slsAmt_p_PPanel.setRelateBeans(Cnd_trd_cur_cd, Hdr_amt_dec_place);
		Hdr_retAmt_p_PPanel.setRelateBeans(Cnd_trd_cur_cd, Hdr_amt_dec_place);
		Hdr_dscntAmt_p_PPanel.setRelateBeans(Cnd_trd_cur_cd, Hdr_amt_dec_place);
		Hdr_swToAmt_p_PPanel.setRelateBeans(Cnd_trd_cur_cd, Hdr_amt_dec_place);
		Hdr_taxAmt_p_PPanel.setRelateBeans(Cnd_trd_cur_cd, Hdr_amt_dec_place);
		Hdr_billAmt_p_PPanel.setRelateBeans(Cnd_trd_cur_cd, Hdr_amt_dec_place);

		DtlSls_prtAmt_p_PPanel.setRelateBeans(Cnd_trd_cur_cd, Hdr_amt_dec_place);
		DtlSls_prtIncTaxAmt_p_PPanel.setRelateBeans(Cnd_trd_cur_cd, Hdr_amt_dec_place);
		DtlSls_amt_p_PPanel.setRelateBeans(Cnd_trd_cur_cd, Hdr_amt_dec_place);
		DtlSls_incTaxAmt_p_PPanel.setRelateBeans(Cnd_trd_cur_cd, Hdr_amt_dec_place);
		DtlSls_dscntAmt_p_PPanel.setRelateBeans(Cnd_trd_cur_cd, Hdr_amt_dec_place);
		DtlSls_unitQty_p_PPanel.setRelateBeans(columnDtlSls_trd_unit_cd, columnDtlSls_dec_place);
		DtlSls_curUpri_p_PPanel.setRelateBeans(Cnd_trd_cur_cd, columnDtlSls_upri_dec_place);
		DtlSls_base_cur_amt_p_PPanel.setRelateBeans(Cnd_base_cur_cd, Cnd_base_cur_amt_dec_place, columnDtlSls_trd_cur_amt, columnDtlSls_xrate);
		DtlSls_base_cur_tax_amt_p_PPanel.setRelateBeans(Cnd_base_cur_cd, Cnd_base_cur_amt_dec_place);
		DtlSls_base_cur_dscnt_amt_p_PPanel.setRelateBeans(Cnd_base_cur_cd, Cnd_base_cur_amt_dec_place);
		DtlSls_base_cur_inc_tax_amt_p_PPanel.setRelateBeans(Cnd_base_cur_cd, Cnd_base_cur_amt_dec_place);
		DtlSls_base_cur_upri_p_PPanel.setRelateBeans(Cnd_base_cur_cd, Cnd_base_cur_upri_dec_place);

		DtlRcv_amt_p_PPanel.setRelateBeans(Cnd_trd_cur_cd, Hdr_amt_dec_place);
		DtlRcv_setoffAmt_p_PPanel.setRelateBeans(Cnd_trd_cur_cd, Hdr_amt_dec_place);
		DtlRcv_setoffTaxAmt_p_PPanel.setRelateBeans(Cnd_trd_cur_cd, Hdr_amt_dec_place);
		DtlAdv_amt_p_PPanel.setRelateBeans(Cnd_trd_cur_cd, Hdr_amt_dec_place);
		DtlAdv_setoffAmt_p_PPanel.setRelateBeans(Cnd_trd_cur_cd, Hdr_amt_dec_place);
		DtlAdv_setoffTaxAmt_p_PPanel.setRelateBeans(Cnd_trd_cur_cd, Hdr_amt_dec_place);

		// ページング対象の通信処理クラスとブロックを指定してページング情報を作成
		Class clazz =  createMS_MSBGL0020_Srch01().getClass();
		_dtlArBtnPp = new FXBAP_PagingParam(getBlockId(getDtlSlsL()), clazz);

		//対象とするページング情報をページング部品に設定
		DtlSlsBtn_paging_PPanel.setPagingParam(_dtlArBtnPp);

	}

	@Override
	public boolean isPagingAgentHolder() {
		return true;
	}
	@Override
	public void callPagingSearcher(FXBAP_PanelBase eventPanel) {
		super.callPagingSearcher(eventPanel);
		if (eventPanel == DtlSlsBtn_paging_PPanel) {
			callMS_MSBGL0020_Srch01();
		}
	}

	@Override
	protected void tableInit() {

		super.tableInit();

		DtlSlsTable.moveColumns(
				columnDtlSls_trd_unit_qty,
				columnDtlSls_trd_unit_cd,
				columnDtlSls_trd_unit_nm);

	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		columnDtlSls_prt_amt.addVCListener(this);
		columnDtlSls_prt_tax_amt.addVCListener(this);
		columnDtlSls_prt_amt.addNCListener(this);
		columnDtlSls_prt_tax_amt.addNCListener(this);
		columnDtlSls_prt_inc_tax_amt.addNCListener(this);
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);

		if (nc == columnDtlSls_prt_amt) {
			dopDtlSls_prt_amt_NC(nc, info);
		}
		if (nc == columnDtlSls_prt_tax_amt) {
			dopDtlSls_prt_tax_amt_NC(nc, info);
		}
		if (nc == columnDtlSls_prt_inc_tax_amt) {
			dopDtlSls_prt_inc_tax_amt_NC(nc, info);
		}

	}

	@Override
	public void doDtlSls_check_NC(MCEventInfo info) {
		super.doDtlSls_check_NC(info);
		int index = info.getEventIndex();
		DtlSlsR r = getDtlSlsL().get(index);

		// 選択がオン、かつ、請求方式区分がNULLの場合
		if (r.check() && isNull(r.bill_mtd_typ())) {
			r.bill_mtd_typ(MSC_BILL_MTD_TYP.ALL_BILL.value());
			r.bill_mtd_typ_nm(MSC_BILL_MTD_TYP.ALL_BILL.name());
			r.bill_prnt_tgt_flg(true);
		// 選択がオフの場合
		} else if (!r.check()) {
			r.clear(DtlSlsR.$bill_mtd_typ,
					DtlSlsR.$bill_mtd_typ_nm,
					DtlSlsR.$prt_amt,
					DtlSlsR.$prt_tax_amt,
					DtlSlsR.$prt_inc_tax_amt,
					DtlSlsR.$bill_prnt_tgt_flg);
			r.setStatus(MCRow.NONE);
		}

		setBillPrntTgtFlg(r);
		copy(getDtlSlsSubL().getFirst(DtlSlsR.$bill_d_no, r.bill_d_no()), r, createMap_DtlSlsSubR_DtlSlsR());
		setSum();
	}

	protected MCIndexKey getDtlSlsLIndexKey() {
		if (getDtlSlsL().containsIndex(_dtlSlsLIndex)) {
			return _dtlSlsLIndex;
		}
		_dtlSlsLIndex = getDtlSlsL().createIndex(DtlSlsR.$act_d_no, DtlSlsR.$act_rev);
		return _dtlSlsLIndex;
	}

	protected void setBillPrntTgtFlg(DtlSlsR r) {
		MCList<DtlSlsR> dtlSlsLL = getDtlSlsL().subList(getDtlSlsLIndexKey(), r.act_d_no(), r.act_rev());
		MCList<DtlSlsR> chkL = dtlSlsLL.subList(dtlR -> dtlR.check() && isAllBill(dtlR));

		setBillPrntFlgForNoDisp(chkL);
		setBillPrntFlgForDispAll(chkL);
		setBillPrntFlgForDispDiff(r);
	}
	protected void setBillPrntFlgForNoDisp(MCList<DtlSlsR> chkL) {

		for (DtlSlsR dtlSlsR : chkL){

			if (!MAC_BILL_CAN_SLIP_TYP.isNO_DISP(dtlSlsR.bill_can_slip_typ())) {
				continue;
			}

			if (MAC_SLIP_STS_TYP.isCRT(dtlSlsR.slip_sts_typ())) {
				dtlSlsR.bill_prnt_tgt_flg(true);
			} 
			else if (MAC_SLIP_STS_TYP.isDIS(dtlSlsR.slip_sts_typ())){
				MCList<DtlSlsR> canL = chkL.subList(DtlSlsR.$slip_sts_typ, MAC_SLIP_STS_TYP.CAN.value());
				if (canL.isEmpty()) {
					dtlSlsR.bill_prnt_tgt_flg(true);
				}
				else {
					dtlSlsR.bill_prnt_tgt_flg(false);
				}
			}
			else {
				MCList<DtlSlsR> disL = chkL.subList(DtlSlsR.$slip_sts_typ, MAC_SLIP_STS_TYP.DIS.value());
				if (disL.isEmpty()) {
					dtlSlsR.bill_prnt_tgt_flg(true);
				}
				else {
					dtlSlsR.bill_prnt_tgt_flg(false);
				}
			}
		}
	}
	protected void setBillPrntFlgForDispAll(MCList<DtlSlsR> chkL) {

		for (DtlSlsR dtlSlsR : chkL){

			if (!MAC_BILL_CAN_SLIP_TYP.isDISP_ALL(dtlSlsR.bill_can_slip_typ())) {
				continue;
			}

			if (MAC_SLIP_STS_TYP.isCRT(dtlSlsR.slip_sts_typ())) {
				dtlSlsR.bill_prnt_tgt_flg(true);
			}
			else if (MAC_SLIP_STS_TYP.isDIS(dtlSlsR.slip_sts_typ())) {
				DtlSlsR canR = chkL.getFirst(DtlSlsR.$slip_sts_typ, MAC_SLIP_STS_TYP.CAN.value());
				if (isNull(canR)) {
					dtlSlsR.bill_prnt_tgt_flg(true);
				}
			}
			else {
				DtlSlsR disR = chkL.getFirst(DtlSlsR.$slip_sts_typ, MAC_SLIP_STS_TYP.DIS.value());
				if (isNull(disR)) {
					dtlSlsR.bill_prnt_tgt_flg(true);
				}
			}
		}
	}
	protected void setBillPrntFlgForDispDiff(DtlSlsR r) {
		MCList<DtlSlsR> chkDtlSlsL = getDtlSlsL().subList(dtlR -> dtlR.check() && isAllBill(dtlR));
		MCIndexKey idxDtlSls = chkDtlSlsL.createIndex(DtlSlsR.$act_d_no, DtlSlsR.$act_d_seq);
		MCList<DtlSlsR> dtlSlsLL = chkDtlSlsL.subList(DtlSlsR.$act_d_no, r.act_d_no());
		
		// 同一の実績明細NOの明細に、以下いずれかの条件を満たす明細が存在する場合、
		// 変更があった場合のみ表示するという判断ができないので、
		// 「請求書表示」フラグのデフォルト値を設定する処理を行わない。
		// ・一部請求あるいは繰越データ
		// ・「選択」がオフ
		MCList<DtlSlsR> dtlSlsLSameActDNoL = getDtlSlsL().subList(DtlSlsR.$act_d_no, r.act_d_no());
		MCList<DtlSlsR> notChkDtlSlsSameActDNoL = dtlSlsLSameActDNoL.subList(DtlSlsR.$check, false);
		MCList<DtlSlsR> chkDtlSlsLSameActDNoL = dtlSlsLSameActDNoL.subList(dtlR -> dtlR.check() && !isAllBill(dtlR));

		if (notChkDtlSlsSameActDNoL.size() > 0 || chkDtlSlsLSameActDNoL.size() > 0) {
			return;
		}

		for (DtlSlsR dtlSlsR : dtlSlsLL){

			if (!MAC_BILL_CAN_SLIP_TYP.isDISP_DIFF(r.bill_can_slip_typ())) {
				continue;
			}

			dtlSlsR.bill_prnt_tgt_flg(true);
			if(!isSame(dtlSlsR.act_d_seq(), MCNumber.ONE) 
					&& (MAC_SLIP_STS_TYP.isCRT(dtlSlsR.slip_sts_typ()) || MAC_SLIP_STS_TYP.isDIS(dtlSlsR.slip_sts_typ()))) {

				DtlSlsR dtlSlsCanR = chkDtlSlsL.getFirst(idxDtlSls, dtlSlsR.act_d_no(), dtlSlsR.act_d_seq().add(-1));
				if (!isNull(dtlSlsCanR)) {
					DtlSlsR dtlSlsDisR = chkDtlSlsL.getFirst(idxDtlSls, dtlSlsCanR.act_d_no(), dtlSlsCanR.act_d_seq().add(-1));
					if (!isNull(dtlSlsDisR) && isSameData(dtlSlsR, dtlSlsDisR)) {
						dtlSlsR.bill_prnt_tgt_flg(false);
						dtlSlsCanR.bill_prnt_tgt_flg(false);
					}
				}
			}
		}
	}
	protected void updDtlSlsSubBillPrntFlg() {
		MCIndexKey idxDtlSlsSub = getDtlSlsSubL().createIndex(DtlSlsR.$bill_d_no);

		for (DtlSlsR dtlSlsR : getDtlSlsL()) {
			if (dtlSlsR.check()) {
				DtlSlsSubR dtlSlsSubR = getDtlSlsSubL().getFirst(idxDtlSlsSub, dtlSlsR.bill_d_no());
				dtlSlsSubR.bill_prnt_tgt_flg(dtlSlsR.bill_prnt_tgt_flg());
			}
		}
	}
	protected boolean isAllBill(DtlSlsR dtlR) {
		if (MSC_BILL_MTD_TYP.isALL_BILL(dtlR.bill_mtd_typ()) && !dtlR.crryovr_flg()) {
			return true;
		}
		return false;
	}
	protected boolean isSameData(DtlSlsR crtR, DtlSlsR disR) {

		boolean ret = true;
		if (!isSame(nvl(crtR.dlv_dt(), crtR.ac_dt()), nvl(disR.dlv_dt(), disR.ac_dt()))
				|| !isSame(crtR.base_sls_ac_dt(), disR.base_sls_ac_dt())
				|| !isSame(crtR.dlv_slip_no(), disR.dlv_slip_no())
				|| !isSame(crtR.itm_cd(), disR.itm_cd())
				|| !isSame(crtR.itm_sub1(), disR.itm_sub1())
				|| !isSame(crtR.itm_sub2(), disR.itm_sub2())
				|| !isSame(crtR.itm_sub3(), disR.itm_sub3())
				|| !isSame(crtR.itm_nm(), disR.itm_nm())
				|| !isSame(crtR.cst_itm_cd(), disR.cst_itm_cd())
				|| !isSame(crtR.cst_itm_nm(), disR.cst_itm_nm())
				|| !isSame(crtR.trd_unit_qty(), disR.trd_unit_qty())
				|| !isSame(crtR.trd_unit_cd(), disR.trd_unit_cd())
				|| !isSame(crtR.trd_cur_upri(), disR.trd_cur_upri())
				|| !isSame(crtR.trd_cur_amt(), disR.trd_cur_amt())
				|| !isSame(crtR.trd_cur_tax_amt(), disR.trd_cur_tax_amt())
				|| !isSame(crtR.tax_cd(), disR.tax_cd())
				|| !isSame(crtR.trd_d_rmrks(), disR.trd_d_rmrks())) {
			ret = false;
		}
		if (MAC_BILL_DTL_SUBTTL_TYP.isEACH_ACST(crtR.bill_dtl_subttl_typ())) {
			if (!isSame(crtR.acst_cd(), disR.acst_cd())) {
				ret = false;
			}
		}
		else if (MAC_BILL_DTL_SUBTTL_TYP.isEACH_CST(crtR.bill_dtl_subttl_typ())) {
			if (!isSame(crtR.cst_cd(), disR.cst_cd())) {
				ret = false;
			}
		}
		else if (MAC_BILL_DTL_SUBTTL_TYP.isEACH_DLV(crtR.bill_dtl_subttl_typ())) {
			if (!isSame(crtR.scst_cd(), disR.scst_cd())) {
				ret = false;
			}
		}
		else if (MAC_BILL_DTL_SUBTTL_TYP.isEACH_WRK(crtR.bill_dtl_subttl_typ())) {
			if (!isSame(crtR.sls_wrk_no(), disR.sls_wrk_no())) {
				ret = false;
			}
		}
		if (MAC_SLS_DTL_OUTP_TYP.isEACH_CST(crtR.sls_dtl_outp_typ())) {
			if (!isSame(crtR.cst_cd(), disR.cst_cd())) {
				ret = false;
			}
		}
		else if (MAC_SLS_DTL_OUTP_TYP.isEACH_ACST(crtR.sls_dtl_outp_typ())) {
			if (!isSame(crtR.acst_cd(), disR.acst_cd())) {
				ret = false;
			}
		}
		return ret;
	}

	@Override
	public void doDtlSls_bill_prnt_tgt_flg_NC(MCEventInfo info) {
		super.doDtlSls_bill_prnt_tgt_flg_NC(info);
		DtlSlsR selR = getDtlSlsL().get(info.getEventIndex());
		MCIndexKey idxKey = getDtlSlsL().createIndex(DtlSlsR.$act_d_no, DtlSlsR.$act_rev, DtlSlsR.$slip_sts_typ);

		if (MAC_BILL_CAN_SLIP_TYP.isDISP_ALL(selR.bill_can_slip_typ())) {
			if (MAC_SLIP_STS_TYP.isDIS(selR.slip_sts_typ())) {
				DtlSlsR dtlSlsR = getDtlSlsL().getFirst(idxKey, selR.act_d_no(), selR.act_rev(), MAC_SLIP_STS_TYP.CAN.value());
				if (isAllBill(dtlSlsR)) {
					if (selR.bill_prnt_tgt_flg()) {
						columnDtlSls_bill_prnt_tgt_flg.setValue(dtlSlsR.getGUIIndex(), true);
					}
					else {
						columnDtlSls_bill_prnt_tgt_flg.setValue(dtlSlsR.getGUIIndex(), false);
					}
				}
			}
			else if (MAC_SLIP_STS_TYP.isCAN(selR.slip_sts_typ())) {
				DtlSlsR dtlSlsR = getDtlSlsL().getFirst(idxKey, selR.act_d_no(), selR.act_rev(), MAC_SLIP_STS_TYP.DIS.value());
				if (isAllBill(dtlSlsR)) {
					if (selR.bill_prnt_tgt_flg()) {
						columnDtlSls_bill_prnt_tgt_flg.setValue(dtlSlsR.getGUIIndex(), true);
					}
					else {
						columnDtlSls_bill_prnt_tgt_flg.setValue(dtlSlsR.getGUIIndex(), false);
					}
				}
			}
		}

		copy(getDtlSlsSubL().getFirst(DtlSlsR.$bill_d_no, selR.bill_d_no()), selR, createMap_DtlSlsSubR_DtlSlsR());
	}

	@Override
	public void doDtlRcv_check_NC(MCEventInfo info) {
		setSum();
	}

	@Override
	public void doDtlSls_bill_mtd_typ_NC(MCEventInfo info) {
		super.doDtlSls_bill_mtd_typ_NC(info);

		int index = info.getEventIndex();
		DtlSlsR r = getDtlSlsL().get(index);
		if (MSC_BILL_MTD_TYP.isALL_BILL(r.bill_mtd_typ()) || isNull(r.bill_mtd_typ())){
			r.clear(DtlSlsR.$prt_amt, DtlSlsR.$prt_tax_amt, DtlSlsR.$prt_inc_tax_amt);
		} else {
			r.prt_amt(r.trd_cur_amt());
			r.prt_tax_amt(r.trd_cur_tax_amt());
			r.prt_inc_tax_amt(r.inc_tax_amt());
		}
		if (!isNull(r.bill_mtd_typ())) {
			r.bill_prnt_tgt_flg(true);
		}
		setBillPrntTgtFlg(r);
		copy(getDtlSlsSubL().getFirst(DtlSlsR.$bill_d_no, r.bill_d_no()), r, createMap_DtlSlsSubR_DtlSlsR());
		setSum();
	}

	protected void dopDtlSls_prt_amt_NC(MCNCBeans nc, MCEventInfo info) {
		int index = info.getEventIndex();
		DtlSlsR r = getDtlSlsL().get(index);

		// 一部請求金額から一部請求税額を計算する
		MCNumber taxAmt = MAUCP_AmtUtil.getTaxAmt(
				r.prt_amt(), r.tax_rate(), r.amt_dec_place(), r.sls_tax_rnd_typ());
		r.prt_tax_amt(taxAmt);
		r.prt_inc_tax_amt(nvl(r.prt_amt(), MCNumber.ZERO).add(r.prt_tax_amt()));

		copy(getDtlSlsSubL().getFirst(DtlSlsR.$bill_d_no, r.bill_d_no()), r, createMap_DtlSlsSubR_DtlSlsR());
		setSum();
	}

	protected void dopDtlSls_prt_tax_amt_NC(MCNCBeans nc, MCEventInfo info) {
		int index = info.getEventIndex();
		DtlSlsR r = getDtlSlsL().get(index);

		r.prt_inc_tax_amt(nvl(r.prt_amt(), MCNumber.ZERO).add(r.prt_tax_amt()));

		copy(getDtlSlsSubL().getFirst(DtlSlsR.$bill_d_no, r.bill_d_no()), r, createMap_DtlSlsSubR_DtlSlsR());
		setSum();
	}

	protected void dopDtlSls_prt_inc_tax_amt_NC(MCNCBeans nc, MCEventInfo info) {
		int index = info.getEventIndex();
		DtlSlsR r = getDtlSlsL().get(index);

		MCNumber taxAmt = MAUCP_AmtUtil.getIncTaxAmt(
				r.prt_inc_tax_amt(), r.tax_rate(), r.amt_dec_place(), r.sls_tax_rnd_typ());
		r.prt_amt(nvl(r.prt_inc_tax_amt(), MCNumber.ZERO).subtract(taxAmt));
		r.prt_tax_amt(taxAmt);

		copy(getDtlSlsSubL().getFirst(DtlSlsR.$bill_d_no, r.bill_d_no()), r, createMap_DtlSlsSubR_DtlSlsR());
		setSum();
	}

	/**
	 * 伝票の金額を集計して表示する
	 * 
	 */
	protected void setSum() {

		setIoSum();
		setArSum();
		setCmnSum();
		setBillAmt();

	}

	/**
	 * 受払伝票の金額を集計して表示する
	 * 
	 */
	protected void setIoSum() {

		// 受払伝票の集計
		MCList<DtlSlsSubR> ioL = getDtlSlsSubL().subList(DtlSlsR.$check, true);

		// 今回売上額
		MCList<DtlSlsSubR> slsL = ioL.subList(DtlSlsSubR.$ar_trd_grp_typ, MAC_AR_TRD_GRP_TYP.SLS.value());
		MCNumber slsAll = slsL.subList(DtlSlsSubR.$bill_mtd_typ, MSC_BILL_MTD_TYP.ALL_BILL.value()).sum(DtlSlsSubR.$trd_cur_amt);
		MCNumber slsPrt = slsL.subList(DtlSlsSubR.$bill_mtd_typ, MSC_BILL_MTD_TYP.PART_BILL.value()).sum(DtlSlsSubR.$prt_amt);
		MCNumber sls = nvl(slsAll, MCNumber.ZERO).add(nvl(slsPrt, MCNumber.ZERO));

		// 今回返品額
		MCList<DtlSlsSubR> sretL = ioL.subList(DtlSlsSubR.$ar_trd_grp_typ, MAC_AR_TRD_GRP_TYP.SLS_RTN.value());
		MCNumber sretAll = sretL.subList(DtlSlsSubR.$bill_mtd_typ, MSC_BILL_MTD_TYP.ALL_BILL.value()).sum(DtlSlsSubR.$trd_cur_amt);
		MCNumber sretPrt = sretL.subList(DtlSlsSubR.$bill_mtd_typ, MSC_BILL_MTD_TYP.PART_BILL.value()).sum(DtlSlsSubR.$prt_amt);
		MCNumber sret = nvl(sretAll, MCNumber.ZERO).add(nvl(sretPrt, MCNumber.ZERO));

		// 今回値引額
		MCList<DtlSlsSubR> dscntL = ioL.subList(DtlSlsSubR.$ar_trd_grp_typ, MAC_AR_TRD_GRP_TYP.SLS_DSCNT.value());
		MCNumber dscntAll = dscntL.subList(DtlSlsSubR.$bill_mtd_typ, MSC_BILL_MTD_TYP.ALL_BILL.value()).sum(DtlSlsSubR.$trd_cur_amt);
		MCNumber dscntPrt = dscntL.subList(DtlSlsSubR.$bill_mtd_typ, MSC_BILL_MTD_TYP.PART_BILL.value()).sum(DtlSlsSubR.$prt_amt);
		MCNumber dscnt = nvl(dscntAll, MCNumber.ZERO).add(nvl(dscntPrt, MCNumber.ZERO));

		// 今回振替額（振替先）
		MCList<DtlSlsSubR> swToL = ioL.subList(DtlSlsSubR.$trd_ptn_typ, MAC_TRD_PTN_TYP.ARSW_IN_BILL_BAL.value());
		MCNumber swToAll = swToL.subList(DtlSlsSubR.$bill_mtd_typ, MSC_BILL_MTD_TYP.ALL_BILL.value()).sum(DtlSlsSubR.$trd_cur_amt);
		MCNumber swToPrt = swToL.subList(DtlSlsSubR.$bill_mtd_typ, MSC_BILL_MTD_TYP.PART_BILL.value()).sum(DtlSlsSubR.$prt_amt);
		MCNumber swTo = nvl(swToAll, MCNumber.ZERO).add(nvl(swToPrt, MCNumber.ZERO));

		// 集計結果の設定
		getHdrR().sls_amt(sls);
		getHdrR().ret_amt(sret);
		getHdrR().dscnt_amt(dscnt);
		getHdrR().sw_to_amt(swTo);
	}

	/**
	 * 債権伝票の金額を集計して表示する
	 * 
	 */
	protected void setArSum() {

		// 債権伝票の集計
		MCList<DtlRcvR> rcvL = getDtlRcvL().subList(DtlRcvR.$check, true);
		MCNumber rcv = MCNumber.ZERO, setoff = MCNumber.ZERO, setoff_tax = MCNumber.ZERO;
		for (DtlRcvR r : rcvL) {
			if (MAC_AR_TRD_GRP_TYP.isSETOFF(r.ar_trd_grp_typ())) {
				setoff = sum(setoff, r.trd_cur_amt());
			}
			else {
				rcv = sum(rcv, r.trd_cur_amt());
			}
			setoff = sum(setoff, r.setoff_amt());
			if (r.bill_tax_disp_flg()) {
				setoff_tax = sum(setoff_tax, r.setoff_tax_amt());
			}
		}

		// 集計結果の設定
		getHdrR().rcv_amt(nvl(rcv, MCNumber.ZERO));
		getHdrR().setoff_amt(sum(nvl(setoff, MCNumber.ZERO),nvl(setoff_tax, MCNumber.ZERO).negate()).multiply(-1));
	}

	/**
	 * 受払伝票、債権伝票の金額を集計して表示する
	 */
	protected void setCmnSum() {
		// 受払伝票の集計
		MCList<DtlSlsSubR> ioL = getDtlSlsSubL().subList(DtlSlsR.$check, true);
		// 債権伝票の集計
		MCList<DtlRcvR> rcvL = getDtlRcvL().subList(DtlRcvR.$check, true);
		
		// 今回税額
		MCNumber ctaxAll = ioL.subList(DtlSlsSubR.$bill_mtd_typ, MSC_BILL_MTD_TYP.ALL_BILL.value()).sum(DtlSlsSubR.$trd_cur_tax_amt);
		MCNumber ctaxPrt = ioL.subList(DtlSlsSubR.$bill_mtd_typ, MSC_BILL_MTD_TYP.PART_BILL.value()).sum(DtlSlsSubR.$prt_tax_amt);
		MCNumber setoff = MCNumber.ZERO;
		for (DtlRcvR rcvR : rcvL) {
			if (rcvR.bill_tax_disp_flg()) {
				setoff = setoff.add(rcvR.setoff_tax_amt());
			}
		}
		MCNumber ctax = sum(nvl(ctaxAll, MCNumber.ZERO), nvl(ctaxPrt, MCNumber.ZERO), nvl(setoff, MCNumber.ZERO).negate());
		
		getHdrR().tax_amt(ctax);
	}

	/**
	 * 請求額を集計して表示する
	 * 
	 */
	protected void setBillAmt() {

		MCNumber bfwAmt = getHdrR().last_bill_amt().subtract(getHdrR().rcv_amt());
		MCNumber billAmt = MCNumber.sum(
				bfwAmt,
				getHdrR().sls_amt(),
				getHdrR().ret_amt(),
				getHdrR().dscnt_amt(),
				getHdrR().sw_to_amt(),
				getHdrR().tax_amt()
				,getHdrR().setoff_amt()
				);

		getHdrR().bfw_amt(bfwAmt);
		getHdrR().bill_amt(billAmt);

	}


	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlSlsTable.setCellConfig(createDtlSlsTableCellConfig());

	}

	protected DtlSlsTableCellConfig createDtlSlsTableCellConfig() {
		return new DtlSlsTableCellConfig();
	}

	protected class DtlSlsTableCellConfig extends MAUDP_CellConfig {
		
		@Override
		public Boolean getPriorMinusEnable(int index, MCColumnConfig column, MCTable table) {
			if (column == columnDtlSls_prt_amt) {
				return true;
			}
			if (column == columnDtlSls_prt_tax_amt) {
				return true;
			}
			if (column == columnDtlSls_prt_inc_tax_amt) {
				return true;
			}
			
			return super.getPriorMinusEnable(index, column, table);
		}

		@Override
		protected String getRowNumberColumnValue(int index,
				MCColumnConfig column, MCTable<?> table, boolean selected) {

			return getDtlSlsL().get(index).row_num().toString();
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			DtlSlsR slsR = getDtlSlsL().get(index);

			// 消費税差額伝票の選択チェックボックスはREAD_ONLY
			if (columnDtlSls_check == column) {
				if (isCtaxDiff(slsR)) {
					return MCMode.READ_ONLY;
				}
			}

			if (columnDtlSls_bill_mtd_typ == column) {
				if (MAC_TRD_PTN_TYP.isARSW_IN_BILL_BAL(slsR.trd_ptn_typ()) || isCtaxDiff(slsR)) {
					return MCMode.READ_ONLY;
				}
			}

			if (columnDtlSls_prt_amt == column) {
				if (isPrtEnble(slsR) && !slsR.inc_tax_flg()) {
					return MCMode.REQUIRED;
				} else {
					return MCMode.READ_ONLY;
				}
			}

			if (columnDtlSls_prt_tax_amt == column) {
				if (isPrtEnble(slsR) && !slsR.inc_tax_flg()) {
					return MCMode.REQUIRED;
				} else {
					return MCMode.READ_ONLY;
				}
			}

			if (columnDtlSls_prt_inc_tax_amt == column) {
				if (isPrtEnble(slsR) && slsR.inc_tax_flg()) {
					return MCMode.REQUIRED;
				} else {
					return MCMode.READ_ONLY;
				}
			}

			if (columnDtlSls_bill_prnt_tgt_flg == column) {
				// 選択チェックがオンの場合
				if (slsR.check()){
					// 明細の選択チェックオンかつ、実績ＮＯと改訂ＮＯが対象と同じのデータを取得する
					MCList<DtlSlsR> chckL = getDtlSlsL().subList(DtlSlsR.$check, true).subList(DtlSlsR.$act_d_no, slsR.act_d_no()).subList(DtlSlsR.$act_rev, slsR.act_rev());

					// 請求書取消伝票表示区分が「無効・取消伝票を表示しない」の場合
					if (MAC_BILL_CAN_SLIP_TYP.isNO_DISP(slsR.bill_can_slip_typ())) {

						// 伝票状況区分が「新規」の場合
						if (MAC_SLIP_STS_TYP.isCRT(slsR.slip_sts_typ())) {
							return MCMode.READ_ONLY;
						} 
						// 伝票状況区分が「無効」の場合
						else if (MAC_SLIP_STS_TYP.isDIS(slsR.slip_sts_typ())){
							
							MCList<DtlSlsR> canL = chckL.subList(DtlSlsR.$slip_sts_typ, MAC_SLIP_STS_TYP.CAN.value());
							// 選択チェック済みの明細に「取消」が含まれていない場合
							if (canL.isEmpty()) {
								return MCMode.READ_ONLY;
							}
							else {
								return MCMode.READ_ONLY;
							}
						}
						// 伝票状況区分が「取消」の場合
						else {
							MCList<DtlSlsR> disL = chckL.subList(DtlSlsR.$slip_sts_typ, MAC_SLIP_STS_TYP.DIS.value());
							// 選択チェック済みの明細に「無効」が含まれていない場合
							if (disL.isEmpty()) {
								return MCMode.READ_ONLY;
							}
							else {
								return MCMode.READ_ONLY;
							} 
						}
					} 
					// 請求書取消伝票表示区分が「無効・取消伝票を表示する（変更のみ）」の場合
					else if (MAC_BILL_CAN_SLIP_TYP.isDISP_DIFF(slsR.bill_can_slip_typ())) {
						if (isAllBill(slsR)) {
							return MCMode.ENABLE;
						}
						else {
							return MCMode.READ_ONLY;
						}
					}
					// 請求書取消伝票表示区分が「無効・取消伝票を表示する（すべて）」の場合
					else {
						// 伝票状況区分が「新規」の場合
						if (MAC_SLIP_STS_TYP.isCRT(slsR.slip_sts_typ())) {
							return MCMode.READ_ONLY;
						}
						// 伝票状況区分が「無効」の場合
						else if (MAC_SLIP_STS_TYP.isDIS(slsR.slip_sts_typ())){
							DtlSlsR canR = chckL.getFirst(DtlSlsR.$slip_sts_typ, MAC_SLIP_STS_TYP.CAN.value());
							if (isNull(canR) || !isAllBill(slsR)) {
								return MCMode.READ_ONLY;
							}
							else {
								return MCMode.ENABLE;
							}
						}
						// 伝票状況区分が「取消」の場合
						else {
							DtlSlsR disR = chckL.getFirst(DtlSlsR.$slip_sts_typ, MAC_SLIP_STS_TYP.DIS.value());
							if (isNull(disR) || !isAllBill(slsR)) {
								return MCMode.READ_ONLY;
							}
							else {
								return MCMode.ENABLE;
							}
						}
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}

		/**
		 * 一部請求金額、一部請求額が入力可能かどうかを判断する
		 * @param r イベント行
		 * @return 一部請求の場合にtrue
		 */
		protected boolean isPrtEnble(DtlSlsR r) {
			if (MSC_BILL_MTD_TYP.isPART_BILL(r.bill_mtd_typ())) {
				return true;
			} else {
				return false;
			}
		}

		/**
		 * 消費税差額伝票かどうかを判断する
		 * 
		 * @param r 債権伝票明細の行
		 * @return 消費税差額伝票の場合にtrue
		 */
		protected boolean isCtaxDiff(DtlSlsR r) {
			return MAC_TRD_PTN_TYP.isTAX_DIFF_BILL_CL(r.trd_ptn_typ());
		}
	}

	// DtlSlsSubR ⇒ DtlSlsR
	protected Map_DtlSlsR_DtlSlsSubR<DtlSlsR,DtlSlsSubR> createMap_DtlSlsR_DtlSlsSubR() {
		return new Map_DtlSlsR_DtlSlsSubR<DtlSlsR, DtlSlsSubR>();
	}
	public class Map_DtlSlsR_DtlSlsSubR<D extends DtlSlsR, S extends DtlSlsSubR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(DtlSlsR.$check, DtlSlsSubR.$check);
			addColumnPathMap(DtlSlsR.$bill_prnt_tgt_flg, DtlSlsSubR.$bill_prnt_tgt_flg);
			addColumnPathMap(DtlSlsR.$bill_mtd_typ, DtlSlsSubR.$bill_mtd_typ);
			addColumnPathMap(DtlSlsR.$bill_mtd_typ_nm, DtlSlsSubR.$bill_mtd_typ_nm);
			addColumnPathMap(DtlSlsR.$prt_amt, DtlSlsSubR.$prt_amt);
			addColumnPathMap(DtlSlsR.$prt_tax_amt, DtlSlsSubR.$prt_tax_amt);
			addColumnPathMap(DtlSlsR.$prt_inc_tax_amt, DtlSlsSubR.$prt_inc_tax_amt);
			addColumnPathMap(DtlSlsR.$trd_cur_amt, DtlSlsSubR.$trd_cur_amt);
			addColumnPathMap(DtlSlsR.$trd_cur_tax_amt, DtlSlsSubR.$trd_cur_tax_amt);
			addColumnPathMap(DtlSlsR.$inc_tax_amt, DtlSlsSubR.$inc_tax_amt);
			addColumnPathMap(DtlSlsR.$ar_trd_grp_typ, DtlSlsSubR.$ar_trd_grp_typ);
			addColumnPathMap(DtlSlsR.$trd_ptn_typ, DtlSlsSubR.$trd_ptn_typ);
			addColumnPathMap(DtlSlsR.$bill_d_no, DtlSlsSubR.$bill_d_no);
			addColumnPathMap(DtlSlsR.$schd_bill_dt, DtlSlsSubR.$schd_bill_dt);
			addColumnPathMap(DtlSlsR.$row_num, DtlSlsSubR.$row_num);
		}
	}

	// DtlSlsR ⇒ DtlSlsSubR
	protected Map_DtlSlsSubR_DtlSlsR<DtlSlsSubR,DtlSlsR> createMap_DtlSlsSubR_DtlSlsR() {
		return new Map_DtlSlsSubR_DtlSlsR<DtlSlsSubR, DtlSlsR>();
	}
	public class Map_DtlSlsSubR_DtlSlsR<D extends DtlSlsSubR, S extends DtlSlsR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(DtlSlsSubR.$check, DtlSlsR.$check);
			addColumnPathMap(DtlSlsSubR.$bill_prnt_tgt_flg, DtlSlsR.$bill_prnt_tgt_flg);
			addColumnPathMap(DtlSlsSubR.$bill_mtd_typ, DtlSlsR.$bill_mtd_typ);
			addColumnPathMap(DtlSlsSubR.$bill_mtd_typ_nm, DtlSlsR.$bill_mtd_typ_nm);
			addColumnPathMap(DtlSlsSubR.$prt_amt, DtlSlsR.$prt_amt);
			addColumnPathMap(DtlSlsSubR.$prt_tax_amt, DtlSlsR.$prt_tax_amt);
			addColumnPathMap(DtlSlsSubR.$prt_inc_tax_amt, DtlSlsR.$prt_inc_tax_amt);
			addColumnPathMap(DtlSlsSubR.$trd_cur_amt, DtlSlsR.$trd_cur_amt);
			addColumnPathMap(DtlSlsSubR.$trd_cur_tax_amt, DtlSlsR.$trd_cur_tax_amt);
			addColumnPathMap(DtlSlsSubR.$inc_tax_amt, DtlSlsR.$inc_tax_amt);
			addColumnPathMap(DtlSlsSubR.$ar_trd_grp_typ, DtlSlsR.$ar_trd_grp_typ);
			addColumnPathMap(DtlSlsSubR.$trd_ptn_typ, DtlSlsR.$trd_ptn_typ);
			addColumnPathMap(DtlSlsSubR.$bill_d_no, DtlSlsR.$bill_d_no);
			addColumnPathMap(DtlSlsSubR.$schd_bill_dt, DtlSlsR.$schd_bill_dt);
			addColumnPathMap(DtlSlsSubR.$row_num, DtlSlsR.$row_num);
		}
	}

}