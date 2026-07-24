package mcframe.clientMSBE.MSBEP1710;

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
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5150.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
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
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.clientCore.container.MCKeyList;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_IvTrgtSel"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_IvTrgtSel_MC extends MSBEP_IvTrgtSel_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START


	// 差異箇所のセル背景色
	protected static Color _differenceBgColor = getPgmSettingColor(
			MSBEP_IvTrgtSel.class, "color.difference_bg");

	// sim_cnd_grp_noのソートタイプ保持用
	SortType _sortTypeSimCndGrpNo = MCList.SortType.ASC;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_IvTrgtSel_MC() {
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
	public MSBEP_IvTrgtSel_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL1710_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1710_Srch01Caller<P extends MSBEP_IvTrgtSel, B extends MS_MSBEL1710_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL1710_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkDt(msgList);
			checkGroup(msgList);
		}

		@Override
		protected void show() {
			super.show();		
			// 初期値として、選択可能とする
			getRsltL().setBooleanNE(RsltR.$selectable_flg, true);
		}
		
		@Override
		protected void setMode() {
			super.setMode();

			Ctrl_ctrl_PPanel.expand(false);
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
			Ctrl_ctrl_PPanel.expand(true);
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			RsltTable.selectLeftmostColumn(0);
		}

		@Override
		protected void afterCall() {
			super.afterCall();

			rsltSort(bridge.down0());
		}

		@Override
		protected void resultSuccess() {
			super.resultSuccess();
			_sortTypeSimCndGrpNo = MCList.SortType.ASC;
		}
		
		/**
		 * 日付の前後関係をチェックする。
		 * 
		 * @param msgList メッセージリスト
		 */
		protected void checkDt(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_etd_dt_fr, Cnd_etd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_eta_dt_fr, Cnd_eta_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_via_schd_dt_fr, Cnd_via_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_ship_inst_dt_fr, Cnd_ship_inst_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_ship_dt_fr, Cnd_ship_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_dlv_dt_fr, Cnd_dlv_dt_to));
		}
		
		/**
		 * チェックボックスグループをチェックする。
		 * @param msgList メッセージリスト
		 */
		protected void checkGroup(MCMessageList msgList) {
			msgList.addAll(checkAtLeastOne(PrStsTypPanel));
		}

		protected void rsltSort(MCList<RsltR> rL) {
			String[] tmpStr = getSimilarityCndCol();
			
			String[] sortStr = new String[tmpStr.length + 1];
			sortStr[0] = RsltR.$sim_cnd_grp_no;
			for(int i = 1; i < sortStr.length; i ++ ) {
				sortStr[i] = tmpStr[i - 1];
			}
			rL.sort(sortStr);
		}

	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBEL1710_Srch01();
	}
	
	// ------------オープン時の処理実装------------			
	@Override
	protected void setupParts() {
		super.setupParts();
		
		Rslt_trd_unit_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_trd_cur_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_upri_dec_place);
		Rslt_trd_cur_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_trd_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_trd_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_iv_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_upri_dec_place);
		Rslt_iv_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_trd_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_tdlv_p_PPanel.setTdlvMode(true);

		Rslt_ship_rqst_id_grp_p_PPanel.setRelateBeans(Cnd_ship_rqst_id_grp_p_PPanel);
		Rslt_dlv_grp_p_PPanel.setRelateBeans(Cnd_dlv_grp_p_PPanel);
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
	}
	
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		
		valueInitSub();
	}
	
	/**
	 * 画面のデフォルト値を設定する。
	 */
	protected void valueInitSub() {
		
		setValueEx(Cnd_srch_mode_Group, Cnd_srch_mode_SHIP_SCHD.getActionCommand());
		Cnd_srch_mode_Group.doNC();
	}
	
	@Override
	public void doCnd_srch_mode_NC(MCEventInfo info) {
		super.doCnd_srch_mode_NC(info);
		
		clearContainers(getRsltL());
		
		clearCnd();
		
		setSrchStatus();
	}
	
	/**
	 * 検索モードに応じて、検索条件をクリアする。
	 */
	protected void clearCnd() {
		
		if (Cnd_srch_mode_SHIP_SCHD.isSelected()) {
			
			setBoolean(PrStsTypPanel, true);
			
			setValueEx(Cnd_ship_dt_fr, null);
			setValueEx(Cnd_ship_hm_fr, null);
			setValueEx(Cnd_ship_dt_to, null);
			setValueEx(Cnd_ship_hm_to, null);
			setValueEx(Cnd_dlv_dt_fr, null);
			setValueEx(Cnd_dlv_hm_fr, null);
			setValueEx(Cnd_dlv_dt_to, null);
			setValueEx(Cnd_dlv_hm_to, null);
			
			setValueEx(Cnd_ship_act_no, null);
			setValueEx(Cnd_ship_act_d_no, null);
		}
		else if (Cnd_srch_mode_SHIP_INST.isSelected()) {
			
			setValueEx(Cnd_not_inst_flg, false);
			setValueEx(Cnd_inst_flg, true);
			setValueEx(Cnd_not_ship_flg, false);
			setValueEx(Cnd_part_ship_flg, true);
			setValueEx(Cnd_ship_flg, true);

			setValueEx(Cnd_ship_dt_fr, null);
			setValueEx(Cnd_ship_hm_fr, null);
			setValueEx(Cnd_ship_dt_to, null);
			setValueEx(Cnd_ship_hm_to, null);
			setValueEx(Cnd_dlv_dt_fr, null);
			setValueEx(Cnd_dlv_hm_fr, null);
			setValueEx(Cnd_dlv_dt_to, null);
			setValueEx(Cnd_dlv_hm_to, null);
			
			setValueEx(Cnd_ship_act_no, null);
			setValueEx(Cnd_ship_act_d_no, null);
		}
		else if (Cnd_srch_mode_SHIP_ACT.isSelected()) {
			
			setValueEx(Cnd_not_inst_flg, false);
			setValueEx(Cnd_inst_flg, false);
			setValueEx(Cnd_not_ship_flg, false);
			setValueEx(Cnd_part_ship_flg, true);
			setValueEx(Cnd_ship_flg, true);
		}
	}
	
	/**
	 * 検索モードに対応する検索ステータスに設定する。
	 */
	protected void setSrchStatus() {
		
		if (Cnd_srch_mode_SHIP_SCHD.isSelected()) {
			
			setSRCHStatus();
		}
		else if (Cnd_srch_mode_SHIP_INST.isSelected()) {
			
			setSRCH_SHIP_INSTStatus();
		}
		else if (Cnd_srch_mode_SHIP_ACT.isSelected()) {
			
			setSRCH_SHIP_ACTStatus();
		}
		
		FoldTab.focusActiveFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}
	
	//  ------------イベント処理実装------------	
	
	@Override
	public void doRslt_check_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doRslt_check_NC(info);
		checkSelectable(info);
	}
	
	protected void checkSelectable(MCEventInfo info) {
		// グループ単位でチェックする場合
		if (getBtnR().chk_by_grp_no_flg()) {
			// 選択カラムイベントの取得(true or false)
			RsltR selR = getRsltL().get(info.getNewIndex());
			boolean checked = selR.check();

			MCList<RsltR> subL = RsltTable.getViewRows().subList(RsltR.$sim_cnd_grp_no, selR.sim_cnd_grp_no()); // フィルタを考慮（表示されているものにのみ設定）
			subL.setBoolean(RsltR.$check, checked);
		}
		
		// 「選択可能」レコードの制御
		// 一旦全て選択不可に設定後、選択可能レコードのみチェックをＯＮにする
		getRsltL().setBoolean(RsltR.$selectable_flg, false);
		
		MCList<RsltR> checkedL = getRsltL().subList(RsltR.$check, true);
		if(!checkedL.isEmpty()) {
			RsltR checkOnRow = checkedL.get(0);
			
			MCList<RsltR> selectableList = null;
			//支給の場合、無償支給と有償支給を同時選択可能のために、支給計上区分にて制御する
			if(MAC_TRD_PTN_TYP.isPROV(checkOnRow.trd_ptn_typ())) {
				MCList<RsltR> tmpL = checkedL.groupBy(RsltR.$prov_basis_typ);
				if(tmpL.size() == 1) {
					//全て有償支給の場合、無償支給（支給計上区分=null）の行も選択可能にする
					if(!isNull(tmpL.get(0).prov_basis_typ())) {
						//一旦、支給計上区分、通貨を無視して抽出する
						MCList<RsltR> allL = getRsltL().subList(getSelectableCol(false), checkOnRow);

						//自身と同じ支給計上区分、通貨の行をまず選択可能にする
						selectableList = allL.subList(getProvCol(), checkOnRow);

						//無償支給の行も選択可能にする
						selectableList.addAll(allL.subList(RsltR.$prov_basis_typ, null));
					}
					//全て無償支給の場合、有償支給も選択可能にする
					else {
						selectableList = getRsltL().subList(getSelectableCol(false), checkOnRow);
					}
				}
				//有償支給と無償支給すでに混ざっている場合、有償支給の選択可能行と無償支給の選択可能行をそれぞれ洗い出す
				else if(tmpL.size() == 2) {
					String prov_basis_typ = tmpL.get(0).prov_basis_typ();
					if(isNull(prov_basis_typ)) {
						prov_basis_typ = tmpL.get(1).prov_basis_typ();
					}
					selectableList = getRsltL().subList(getSelectableCol(true), checkedL.subList(RsltR.$prov_basis_typ, prov_basis_typ).get(0));
					selectableList.addAll(getRsltL().subList(getSelectableCol(true), checkedL.subList(RsltR.$prov_basis_typ, null).get(0)));
				}
				else {
					//ありえない
					//有償支給の支給計上区分（1:出荷基準／2:着荷基準／3:使用基準　のいずれか）と無償支給の支給計上区分（＝null）が最多２選択しかないため
				}
			}
			else {
				selectableList  = getRsltL().subList(getSelectableCol(true), checkOnRow);
			}
			
			selectableList.setBoolean(RsltR.$selectable_flg, true);
		}
		
		//　ボタン制御
		if (checkedL.isEmpty()) {
			getRsltL().setBooleanNE(RsltR.$selectable_flg, true);
			Btn_open_MSBEP1730.setMode(MCMode.DISABLE);
		}else{
			Btn_open_MSBEP1730.setMode(MCMode.ENABLE);
		}
	}

	/**
	 * 引数の２つのRowを指定カラム(_selectableRow)で比較し、<br>
	 * 同じ場合はtrueを返し、異なる場合はfalseを返します。
	 * @param r1 RsltR
	 * @param r2 RsltR
	 * @param MCColumnConfig[] :比較するカラムのMCColumnConfig配列
	 * 
	 * @return boolean
	 */
	protected boolean checkSelectable(RsltR r1, RsltR r2, MCColumnConfig[] confs) {

		int cnt = 0;
		for (MCColumnConfig conf : confs) {

			String s = conf.getBaseRowColumnName();

			// 型チェック
			if (conf.getDataType() == MCDataType.STRING) {

				if (!isSame(r1.getStringNE(s), r2.getStringNE(s))) {
					cnt++;
					break;
				}
			}
			else if (conf.getDataType() == MCDataType.NUMBER) {

				if (!isSame(r1.getNumberNE(s), r2.getNumberNE(s))) {
					cnt++;
					break;
				}
			}
		}
		return (cnt == 0);
	}
	//  ------------sort処理カスタマイズ------------	
	@Override
	public boolean sort(MCTable<?> table, MCSortPolicy policy) {
		if (table == RsltTable && !getRsltL().isEmpty() && policy.size() > 0) {
			String[] cols = policy.nameArray();
			SortType[] types = policy.typeArray();

			if (isSame(cols[0], RsltR.$sim_cnd_grp_no)) {
				_sortTypeSimCndGrpNo = types[0];
				return super.sort(table, policy);
			}
			else {
				MCSortPolicy newPolicy = new MCSortPolicy();
				newPolicy.add(_sortTypeSimCndGrpNo, RsltR.$sim_cnd_grp_no); // ソートの最優先にsim_cnd_grp_noをセットする

				for (int i = 0; i < policy.size(); i++) {
					newPolicy.add(types[i], cols[i]);
				}
				return super.sort(table, newPolicy);
			}
		}
		return super.sort(table, policy);
	}
	
	// - CellConfig ----------------------------------------//
	protected MCCellConfig createRsltTableCellConfig() {
		return new RsltTableCellConfig();
	}
	
	@Override
	protected void setCellConfig() {
		super.setCellConfig();

		RsltTable.setCellConfig(createRsltTableCellConfig());
	}

	/**
	 * RsltTableのCellConfig
	 */
	public class RsltTableCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

			if (isSame(column.getBaseRowColumnName(), RsltR.$check)) {

				RsltR activeR = RsltTable.getRow(index);

				if (activeR.selectable_flg()) {
					return MCMode.REQUIRED;
				}
				else {
					return MCMode.READ_ONLY;
				}
			}
			
			return super.getPriorMode(index, column, table);
		}

		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table, MCMode mode) {
			
			// 現在のカラム値と1つ上のRowのカラム値が異なる場合は背景色を変える
			if (index != 0) {

				if (MCCollectionUtil.contains(column.getBaseRowColumnName(), getSimilarityCndCol())) {

					String colNm = column.getBaseRowColumnName(); // カラム名
					Comparable<?> c0 = RsltTable.getRow(index).getValueNE(colNm); // 現在のカラム値
					Comparable<?> c1 = RsltTable.getRow(index - 1).getValueNE(colNm); // ひとつ上の行のカラム値

					if (!isSame(c0, c1)) {
						return _differenceBgColor;
					}
				}
			}

			// sim_cnd_grp_noの奇数、偶数で背景色を決定する
			MCNumber rem = RsltTable.getRow(index).sim_cnd_grp_no().remainder(2);

			// 奇数行
			if (isSame(rem, MCNumber.ZERO)) {
				return getOddCellBackground(column, table, mode);
			}
			// 偶数行
			else {
				return getEvenCellBackground(column, table, mode);
			}
		}

	}
	
	//  ------------画面遷移実装------------	
	/**
	 * Panel[Btn]のボタン[open_MSBEP1730]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP1730(MCEventInfo info) {
		openMSBEP1730();
	}

	protected void openMSBEP1730(){
		MCList<RsltR> selectedL = getRsltL().subList(RsltR.$check, true);

		if (isNull(selectedL)) {
			dialog(msgNoSelectedRow());
			return;
		}

		// バインド行の生成
		MCRow bind = crtBindForMSBEP1730(selectedL);

		// 検索モードを基づき、選択したRsltLの出荷予定NO/出荷指図明細NO/出荷実績明細NOのいずれかを
		// リストに格納し、インボイス登録画面に渡す。
		List<String> noL = new ArrayList<String>();
		for (RsltR rR : selectedL) {
			if (Cnd_srch_mode_SHIP_SCHD.isSelected()) {
				noL.add(rR.ship_schd_no());
			}
			else if (Cnd_srch_mode_SHIP_INST.isSelected()) {
				noL.add(rR.ship_inst_d_no());
			}
			else if (Cnd_srch_mode_SHIP_ACT.isSelected()) {
				noL.add(rR.ship_act_d_no());
			}
		}
		// モーダレス画面呼出
		openPanel("MS", "MSBEP1730", T1, bind, noL, RsltTable);
	}

	/**
	 * MSBEP1730へのbindRowを生成する。　<p>	
	 * ２段階で１つのRowに絞込む
	 *  [Step1] 入力可能項目も含めたGroupBy
	 *  [Step2] Step1の結果が複数件あった場合は、各カラムで値が異なるかのチェックを行う。
	 *   →値が異なる場合はnullをセットする
	 * @param selectedL 選択されたデータList
	 * @return MSBEP1730画面用バインドRow 
	 */
	protected MCRow crtBindForMSBEP1730(MCList<RsltR> selectedL){
		MCRow bind = MCRow.create();

		MCList<RsltR> groupingL = selectedL.groupBy(getScreenTranCol());
		if (groupingL.size() == 1) {
			bind = crtOpenMSBEP1730DtlR(groupingL.get(0));
		}
		else if (groupingL.size() > 1) {

			RsltR baseR = groupingL.get(0).clone();
			MCList<RsltR> onrProvL = null;
			
			if(MAC_TRD_PTN_TYP.isPROV(baseR.trd_ptn_typ())) {
				MCList<RsltR> tmpL = groupingL.groupBy(getProvCol());
				if(tmpL.size() == 2) {
					//有償支給と無償支給が混ざっている場合、有償支給の支給計上区分、通貨項目を設定する
					RsltR tmpR = tmpL.get(0);
					if(isNull(tmpR.prov_basis_typ())) {
						tmpR = tmpL.get(1);
					}
					baseR.prov_basis_typ(tmpR.prov_basis_typ());
					baseR.trd_cur_cd(tmpR.trd_cur_cd());
					
					// 有償支給と無償支給が混在する場合は、どれか１件のレート情報を保持し、
					// 後続処理で重複していたらクリアする
					onrProvL = groupingL.subList(RsltR.$prov_basis_typ, baseR.prov_basis_typ());
					RsltR onrProvR = onrProvL.get(0);
					baseR.xrate_inpt_flg(onrProvR.xrate_inpt_flg());
					baseR.xrate(onrProvR.xrate());
					baseR.ptax_xrate_inpt_flg(onrProvR.ptax_xrate_inpt_flg());
					baseR.ptax_xrate(onrProvR.ptax_xrate());
				}
			}
			
			List<String> colList = new ArrayList<String>();
			for (String col : getChkScreenTranCol()) {
				// 有償支給と無償支給が混在する場合は、有償支給だけで為替レート、納税為替レートの重複をチェックする
				MCList<RsltR> tarL;
				if (onrProvL != null &&  (
						   isSame(col, RsltR.$xrate_inpt_flg)
						|| isSame(col, RsltR.$xrate)
						|| isSame(col, RsltR.$ptax_xrate_inpt_flg)
						|| isSame(col, RsltR.$ptax_xrate))) {
					tarL = onrProvL;
				}
				else {
					tarL = groupingL;
				}
				
				
				int cnt = tarL.groupBy(col).size();
				if (cnt > 1) {
					clearCol(col, baseR, colList);
				}
				else if (isSame(col, RsltR.$xrate_inpt_flg)) {
					// 選択した全明細の為替レート指定がオンで、為替レートが混在する場合は
					// 為替レート指定をクリアする
					if (tarL.get(0).xrate_inpt_flg()) {
						if (tarL.groupBy(RsltR.$xrate).size() > 1) {
							clearCol(col, baseR, colList);
						}
					}
				}
				else if (isSame(col, RsltR.$ptax_xrate_inpt_flg)) {
					// 選択した全明細の納税為替レート指定がオンで、納税為替レートが混在する場合は
					// 納税為替レート指定をクリアする
					if (tarL.get(0).ptax_xrate_inpt_flg()) {
						if (tarL.groupBy(RsltR.$ptax_xrate).size() > 1) {
							clearCol(col, baseR, colList);
						}
					}
				}
			}
			if (!colList.isEmpty()) {
				// 選択行内で異なる値が指定されている項目について、画面遷移時に引き継ぎません。
				// 値を引き継がない項目：{1}
				String strForLog = getClearColName(colList);
				dialog(MSBEP0006, strForLog);
			}

			bind = crtOpenMSBEP1730DtlR(baseR);
		}
		String ivSrcTyp = null;
		if (Cnd_srch_mode_SHIP_SCHD.isSelected()) {
			ivSrcTyp = MSC_IV_SRC_TYP.SHIP_SCHD.value();
		}
		else if (Cnd_srch_mode_SHIP_INST.isSelected()) {
			ivSrcTyp = MSC_IV_SRC_TYP.SHIP_INST.value();
		}
		else if (Cnd_srch_mode_SHIP_ACT.isSelected()) {
			ivSrcTyp = MSC_IV_SRC_TYP.SHIP_ACT.value();
		}
		bind.setStringNE("iv_src_typ", ivSrcTyp);
		return bind;
	}
	
	/**
	 * 値が異なる場合にクリアする。クリアしたカラムをリストに追加する
	 * 
	 * @param col
	 * @param baseR
	 * @param clearColList
	 */
	protected void clearCol(String col, RsltR baseR, List<String> clearColList) {

		baseR.clear(col);
		clearColList.add(col);
	}
	
	/**
	 * 値をクリアし、引き継がない項目名を取得する
	 * 
	 * @param colList
	 * @return
	 */
	protected String getClearColName(List<String> colList) {
		
		String strForLog = "";
		RsltR baseR = RsltR.create();
		
		for (String col : colList) {
			// メッセージ用
			MCColumnConfig conf = RsltTable.getColumnConfig(baseR.getMeta(col));
			String headerName = conf.getHeaderName();
			if(isNull(strForLog)){
				strForLog = strForLog + headerName ;	
			}
			else {
				strForLog = strForLog + " / " + headerName;	
			}
		}
		return strForLog;
	}
	
	/**
	 * 画面遷移時にバインド値を渡す際のRowを作成します
	 * @param bind
	 * @param rsltR
	 */
	protected MCRow crtOpenMSBEP1730DtlR(RsltR rR) {
		MCRow bind = MCRow.create();
		bind.setValuesNE(getScreenTranCol(), rR, getScreenTranCol());
		return bind;
	}

	//  ------------その他制御------------	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		CndPanel.focusFirstComponent();
	}
	
	/** 画面遷移時に値の引継ぎを行うカラム名配列を返します */
	protected String[] getScreenTranCol() {
		RsltR row = RsltR.create();
		return row.getExtMap(RsltR.$$SCRN_TRAN).values().toArray(new String[0]);
	}
	/** 画面遷移時に重複チェックするカラム名配列を返します。　*/
	protected String[] getChkScreenTranCol() {
		RsltR row = RsltR.create();
		return row.getKeys(RsltR.$$CHK_SCRN_TRAN).toArray(new String[0]);
	}
	/**　同時選択可能行の判定用カラム名配列を返します。 */
	protected String[] getSelectableCol(boolean requiredCheckCurCd) {
		RsltR row = RsltR.create();
		MCKeyList key = row.getKeys(RsltR.$$SELECTABLE);
		
		//支給の場合、支給計上区分、通貨の項目を外す（別途ロジックで判定する）。
		if(!requiredCheckCurCd) {
			String[] provCols = getProvCol();
			for(int i = 0; i < provCols.length; i ++) {
				key.remove(provCols[i]);
			}
		}
		
		return key.toArray(new String[0]);
	}
	/**　相似条件(背景色色分け用)のカラム名配列を返します。　*/
	protected String[] getSimilarityCndCol() {
		RsltR row = RsltR.create();
		return row.getKeys(RsltR.$$DIF_CHK).toArray(new String[0]);
	}

	/**
	 * 支給の場合の制御に使用する項目
	 * @return
	 */
	protected String[] getProvCol() {
		return new String[] {
				RsltR.$prov_basis_typ,
				RsltR.$trd_cur_cd
		};
	}

}