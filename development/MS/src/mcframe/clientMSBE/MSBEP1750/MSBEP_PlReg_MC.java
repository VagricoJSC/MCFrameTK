package mcframe.clientMSBE.MSBEP1750;

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

import mcframe.clientFSUB.FSUBP0060.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
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
import mcframe.clientCore.container.MCRowListener;
import mcframe.clientCore.container.MCRowStatusEvent;
import mcframe.clientCore.container.MCRowStatusListener;
import mcframe.clientCore.container.MCRowEvent;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.clientFXBA.FXBAP0110.FXBAP_ListListener;
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import mcframe.clientFSUB.FSUBP0000.IfRowMoveBase;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_PlReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_PlReg_MC extends MSBEP_PlReg_MC_A implements IfOpePanel, IfRowMoveBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	
	/** DtlTableからの合計計算対象のカラム名配列 */
	static String[] _sumCols =new String[]{
			DtlR.$net_wt
			,DtlR.$grss_wt
			,DtlR.$dim
	};
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_PlReg_MC() {
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
	public MSBEP_PlReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL1750_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1750_Prnt01Caller<P extends MSBEP_PlReg, B extends MS_MSBEL1750_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBEL1750_Prnt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBEL1750_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1750_Srch01Caller<P extends MSBEP_PlReg, B extends MS_MSBEL1750_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL1750_Srch01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void setMode() {
			super.setMode();
			
			setINSStatus();
			DtlTable.selectLeftmostColumn(0);
			getDtlL().setStatus(Status.CREATE);
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			
			setSRCHStatus();
		}
		
		@Override
		protected void show() {
			super.show();
			
			// DtlTableの各合計値を計算し、Hdrにセット
			setHdrSum();
		}
	}

	/**
	 * [MS_MSBEL1750_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1750_Srch02Caller<P extends MSBEP_PlReg, B extends MS_MSBEL1750_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL1750_Srch02Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void setMode() {
			
			super.setMode();
			// 検索処理後のモード制御
			if (Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected()) {
				// 完了済みの場合
				if (getHdrR().cmpl_flg() &&  !MSC_IV_SRC_TYP.isSLS(getHdrR().iv_src_typ())){
					dialog(MSBEP0008);
					// 種別を参照にセット
					getCndR().ope(Cnd_ope_SRCH.getActionCommand());
					setREFStatus();
				}
			}
			DtlTable.selectLeftmostColumn(0);
		}
	}

	/**
	 * [MS_MSBEL1750_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1750_Srch03Caller<P extends MSBEP_PlReg, B extends MS_MSBEL1750_Srch03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBEL1750_Srch03Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected mcframe.commonCore.notice.MCMessage msgExecConfirm() {
			return new MCMessage(MSBEP0007);
		}
	}

	/**
	 * [MS_MSBEL1750_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1750_Upd01Caller<P extends MSBEP_PlReg, B extends MS_MSBEL1750_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL1750_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();

			setPrint(true);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			
			for(DtlR r : exceptDeleteAndEmpty(getDtlL())) {
				msgList.addAll(checkSmallLarge(columnDtl_cntnr_no_fr, columnDtl_cntnr_no_to, r));
			}
		}
	}

	/**
	 * [MS_MSBEL1750_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1750_Del01Caller<P extends MSBEP_PlReg, B extends MS_MSBEL1750_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBEL1750_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		if(Cnd_ope_INS.isSelected()){
			// "登録する"の場合のみ「Srch01」
			callMS_MSBEL1750_Srch01();
		}else{
			callMS_MSBEL1750_Srch02();
		}
	}

	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBEL1750_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[get_wt_dim]の押下時の処理
	 */
	@Override
	public void doBtn_get_wt_dim(MCEventInfo info) {
		callMS_MSBEL1750_Srch03();
	}
	/**
	 * Panel[Btn]のボタン[merge]の押下時の処理
	 */
	@Override
	public void doBtn_merge(MCEventInfo info) {
		mergeRow();
	}
	/**
	 * Panel[Btn]のボタン[divide]の押下時の処理
	 */
	@Override
	public void doBtn_divide(MCEventInfo info) {
		divideRow();
	}
	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBEL1750_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBEL1750_Del01();
	}
	
	@Override
	public MCTable<?> getRowMoveTable() {
		return DtlTable;
	}
	@Override
	public boolean isStatusChange() {
		return false;
	}
	
	@Override
	protected void opePanelFillSpace() {
		// fillSpaceしない
	}

	// ------------ 画面初期化: START------------			
	@Override
	protected void setupParts() {
		super.setupParts();
		Dtl_sno_wrk_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3, 
				columnDtl_sno1_mng_typ, columnDtl_sno2_mng_typ, columnDtl_sno3_mng_typ, columnDtl_sno4_mng_typ);
		Dtl_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl_trd_unit_cd, columnDtl_trd_unit_dec_place);
		Dtl_sum_qty_p_PPanel.setRelateBeans(columnDtl_trd_unit_cd, columnDtl_trd_unit_dec_place);
		
	}
	@Override
	protected void listenerInit() {
		super.listenerInit();
		setListListener(DtlTable, createDtlRowListener());
	}
	@Override
	@SuppressWarnings("rawtypes")
	protected FXBAP_ListListener createFXBAP_ListListener( MCTable tl) {
		if (tl == DtlTable) {
			return createDtlListListener();
		}
		return super.createFXBAP_ListListener(tl);
	}
	// ------------ 画面初期化 : END------------			
	// ------------ イベント処理 : START------------
	// 対象のテーブルの中に埋め込みカラムが存在する場合
	/**
	 * 行削除ボタンの押下可・不可の制御<br>
	 * 行削除ボタンのステータスの制御を行う
	 */
	@Override
	public void doDtl_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doDtl_NC(info);
		setBtnMode();
	}
	@Override
	public void doDtl_check_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doDtl_check_NC(info);
		doCheckNC(info);
	}
	
	@Override
	protected void doOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.doOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		// REF →　INS（参照登録はしない））
		if (isREFOpe(bfOpe) && isINSOpe(afOpe)) {
			clearContainers(p.opePanelGetRegBlocks());
		}
		else if (isINSOpe(afOpe)) {
			setSRCHStatus();
		}
	}
	
	/**
	 * "選択"カラムのチェック処理を行う。
	 * @param info イベント情報
	 */
	protected void doCheckNC(MCEventInfo info) {
		// グループ単位でチェックする場合
		if (getBtnR().chk_by_grp_no_flg()) {
			// 選択カラムイベントの取得(true or false)
			DtlR selR = getDtlL().get(info.getNewIndex());
			boolean checked = selR.check();

			// 同一の相似条件グループ情報に対して一括制御
			MCList<DtlR> subL = DtlTable.getViewRows().subList(DtlR.$sim_cnd_grp_no, selR.sim_cnd_grp_no()); // フィルタを考慮（表示されているものにのみ設定）
			subL.setBoolean(DtlR.$check, checked);
		}
		
		setBtnMode();
	}

	/**
	 * 行まとめを実施する。
	 */
	protected void mergeRow() {
		MCList<DtlR> tmpL = getDtlL().subList(DtlR.$check, true);
		
		MCList<DtlR> gL = tmpL.groupBy(DtlR.$sim_cnd_grp_no);

		for(DtlR gR : gL) {
			MCList<DtlR> margeL = tmpL.subList(DtlR.$sim_cnd_grp_no, gR.sim_cnd_grp_no());
			if(margeL.size() == 1) {
				continue;
			}
			
			DtlR sumR = margeL.get(0);
			sumR.cntnr_no_fr(null);
			sumR.cntnr_no_to(null);

			// 各項目の合算
			sumR.trd_unit_qty(margeL.sum(DtlR.$trd_unit_qty));
			sumR.net_wt(margeL.sum(DtlR.$net_wt));
			sumR.grss_wt(margeL.sum(DtlR.$grss_wt));
			sumR.dim(margeL.sum(DtlR.$dim));
	
			// 1レコード目を除く「選択:オン」の行を削除
			margeL.remove(0);
			getDtlL().removeAll(margeL);
		}
		
		// 行がまとまった結果1行になったケースなどを考慮し、ボタン制御を判定する
		setBtnMode();
	}
	
	/**
	 * 行分割を実施する。
	 */
	protected void divideRow() {
		DtlR dR = DtlTable.getSelectedMCRow();
		if (isNull(dR)) {
			dialog(msgNoSelectedRow());
			return;
		}
		DtlR r = copyRow(DtlTable);
		r.clear(DtlR.$trd_unit_qty);
		r.clear(DtlR.$cntnr_cd);
		r.clear(DtlR.$cntnr_nm);
		r.clear(DtlR.$cntnr_no_fr);
		r.clear(DtlR.$cntnr_no_to);
		r.clear(DtlR.$net_wt);
		r.clear(DtlR.$grss_wt);
		r.clear(DtlR.$dim);
		r.clear(DtlR.$pl_d_rmrks);
		r.clear(DtlR.$intr_d_rmrks);
		r.clear(DtlR.$sub_char1);
		r.clear(DtlR.$sub_char2);
		r.clear(DtlR.$sub_char3);
	}
	
	protected DtlRowListener createDtlRowListener() {
		return new DtlRowListener();
	}
	
	/**
	 * 明細に対するリスナークラス
	 *
	 */
	protected class DtlRowListener implements MCRowListener, MCRowStatusListener {
		@Override
		public void valueChanged(MCRowEvent event) {
			if (isSumEventCols(event)) {
				setHdrSum();
			}
		}
		@Override
		public void statusChanged(MCRowStatusEvent event) {
			setHdrSum();
		}
	}
	
	protected DtlListListener createDtlListListener() {
		return new DtlListListener();
	}
	/**
	 * リストに対するリスナークラス
	 */
	protected class DtlListListener extends FXBAP_ListListener {

		@Override
		protected void setSum(MCListEvent event) {
			setHdrSum();
		}

		@Override
		protected void clearSum(MCListEvent event) {
			clearHdrSum();
		}
	}
	// ------------ イベント処理 : END------------	
	// ------------ モード制御 : START------------
	
	@Override
	public void setINSStatus() {
		super.setINSStatus();
		
		getHdrR().pl_immed_prnt_flg(true);
	}
	
	public void setUPDStatus() {
		super.setUPDStatus();
		
		getHdrR().pl_immed_prnt_flg(true);
		setBtnMode();
	}
	
	/**
	 * 各ボタンのモード制御を行う。
	 */
	protected void setBtnMode(){

		// 画面を固める(参照モード、更新後)
		if (!(getStatus() == INS || getStatus() == UPD)) {
			Btn_get_wt_dim.setMode(MCMode.DISABLE);
			Btn_merge.setMode(MCMode.DISABLE);
			Btn_divide.setMode(MCMode.DISABLE);
			Btn_rdel.setMode(MCMode.DISABLE);
		}
		else {

			setGetWtDimBtnMode();
			setMergeBtnMode();
			setDivideBtnMode();
			setRdelBtnMode();
			setUpDownBtnMode();
		}
	}
	/**
	 * 重量・容積取得ボタンの押下可・不可制御
	 */
	protected void setGetWtDimBtnMode() {

		if (!getDtlL().isEmpty()) {
			Btn_get_wt_dim.setMode(MCMode.ENABLE);
		}
		else {
			Btn_get_wt_dim.setMode(MCMode.DISABLE);
		}
	}
	/**
	 * 行まとめボタンの押下可・不可制御
	 */
	protected void setMergeBtnMode() {
		// "選択"にチェックの入っているレコードが2レコード以上存在する場合
		int checkRowCnt = getDtlL().subList(DtlR.$check, true).size();
		if(checkRowCnt >= 2){
			Btn_merge.setMode(MCMode.ENABLE);
		}
		else{
			Btn_merge.setMode(MCMode.DISABLE);
		}
	}
	/**
	 * 行分割ボタンの押下可・不可制御
	 */
	protected void setDivideBtnMode() {
		// 削除以外の明細行を選択している場合
		DtlR selectR = DtlTable.getSelectedMCRow();
		if (isNull(selectR) || selectR.isStatusDelete()) {
			Btn_divide.setMode(MCMode.DISABLE);
		}
		else {
			Btn_divide.setMode(MCMode.ENABLE);
		}
	}
	
	/**
	 * 行削除ボタンの押下可・不可制御<br>
	 * 削除対象のRowと同一の相似条件グループを持つRowが存在するかのチェックを行う
	 */
	protected void setRdelBtnMode() {
		DtlR selectR = DtlTable.getSelectedMCRow();
		if (isNull(selectR)) {
			// 行を選択していない場合
			Btn_rdel.setMode(MCMode.DISABLE);
		}
		else if (MAC_STK_MNG_TYP.isNOT_MNG(selectR.stk_mng_typ())) {
			// 非在庫品の場合
			Btn_rdel.setMode(MCMode.ENABLE);
		}
		else if (selectR.getStatus() == MCRow.DELETE) {
			// ステータスが削除の場合
			Btn_rdel.setMode(MCMode.ENABLE);
		}
		else {
			// MCRowStatusがDelete以外のものを抽出
			MCList<DtlR> expDelL = exceptDeleteAndEmpty(getDtlL());

			// 相似条件グループが選択中のRowと同じものをカウント
			int cnt = expDelL.subList(DtlR.$sim_cnd_grp_no, selectR.sim_cnd_grp_no()).size();
			if (cnt == 1) {
				Btn_rdel.setMode(MCMode.DISABLE);
			}
			else {
				Btn_rdel.setMode(MCMode.ENABLE);
			}
		}
	}

	/**
	 * 上下ボタンの押下可・不可制御<br>
	 */
	protected void setUpDownBtnMode() {

		int idx = DtlTable.getMCSelectedRow();
		if (idx < 0) {
			// 行選択がない場合
			Btn_move_p_PPanel.Btn_bottom.setMode(MCMode.DISABLE);
			Btn_move_p_PPanel.Btn_down.setMode(MCMode.DISABLE);
			Btn_move_p_PPanel.Btn_up.setMode(MCMode.DISABLE);
			Btn_move_p_PPanel.Btn_top.setMode(MCMode.DISABLE);
		}
		else {
			Btn_move_p_PPanel.Btn_up.setMode(MCMode.ENABLE);
			Btn_move_p_PPanel.Btn_top.setMode(MCMode.ENABLE);
			Btn_move_p_PPanel.Btn_down.setMode(MCMode.ENABLE);
			Btn_move_p_PPanel.Btn_bottom.setMode(MCMode.ENABLE);
		}
	}
	// ------------ モード制御 : END------------	
	// ------------ その他・共通処理 : START------------
	/**
	 * 値変更時に合計計算にかかわるカラムかどうかを判断する
	 * 
	 * @param event イベント情報
	 * @return 合計計算にかかわるカラムの場合にtrue
	 */
	protected boolean isSumEventCols(MCRowEvent event) {

		return MCCollectionUtil.contains(event.getColumn(), _sumCols);

	}
	/**
	 * DtlTableから数量、純重量、総重量、容積の合計を計算し、ヘッダにセットする
	 * 
	 */
	protected void setHdrSum() {
		
		MCList<DtlR> validList = exceptDeleteAndEmpty(getDtlL());
		if (validList.isEmpty()) {
			getHdrR().ttl_net_wt(null);
			getHdrR().ttl_grss_wt(null);
			getHdrR().ttl_dim(null);
			return;
		}
		
		DtlR sumR = validList.groupBy(crtHdrSumPolicy()).get(0);
		// DtlLの各合計値をHdrRにセット
		getHdrR().ttl_net_wt(sumR.net_wt());
		getHdrR().ttl_grss_wt(sumR.grss_wt());
		getHdrR().ttl_dim(sumR.dim());

	}
	/**
	 * ヘッダの純重量合計、総重量合計、容積合計をクリアする
	 * 
	 */
	protected void clearHdrSum() {

		HdrR h1R = getHdrR();
		h1R.ttl_net_wt(null);
		h1R.ttl_grss_wt(null);
		h1R.ttl_dim(null);
	}
	/**
	 * ヘッダのグルーピングポリシーを作成する。
	 * @return グルーピングポリシー
	 */
	protected MCGroupByPolicy crtHdrSumPolicy(){
		MCGroupByPolicy gp = new MCGroupByPolicy();
		gp.sum(_sumCols);
		return gp;
	}

	// ------------ その他・共通処理 : END------------			
	// ------------IfOpePanel-------------------
	@Override
	public MCButtonGroup getOpeButtonGroup() {
		return Cnd_ope_Group;
	}
	@Override
	public List<MCContainer> opePanelGetRegBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getHdrR());
		ret.add(getDtlL());
		return ret;
	}	
	@Override
	public List<MCContainer> opePanelGetCndBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getCndR());
		return ret;
	}
	
	// ------------IfSyncTableBase-------------------

}