package mcframe.clientMGBG.MGBGP0150;

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
import mcframe.clientMAUB.MAUBP0240.*;
import mcframe.clientMAUB.MAUBP5030.*;

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
import static mcframe.commonMGUA.MGUAC0010.MGUAC_List.*;

import java.util.Map;
import java.util.Set;
import java.util.Arrays;
import java.util.HashMap;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBGP_PreAlcRateSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBGP_PreAlcRateSrch_MC extends MGBGP_PreAlcRateSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MCList<MCRow> _termList = MCList.create(MCRow.class);

	protected MCList<MCRow> _ymList = MCList.create(MCRow.class);

	protected String _TERM = "TERM";

	protected String _PLN = "PLN";

	protected String _ACT = "ACT";

	protected String _YM_COL = "ym";

	protected String _TRUE = "1";

	// カラムと一次配賦区分のマッピング
	protected Map<MCColumnConfig, String> _columnPreAlcPtnColumnMap;

	protected CndR _cndR = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBGP_PreAlcRateSrch_MC() {
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
	public MGBGP_PreAlcRateSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBGL0150_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0150_Srch01Caller<P extends MGBGP_PreAlcRateSrch, B extends MG_MGBGL0150_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBGL0150_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			msgList.addAll(chkBeforeAfter());
			msgList.addAll(chkTermAndYm());
		}

		@Override
		protected void show() {
			super.show();

			createCol();
			displayColumn();
		}

		@Override
		protected void afterCall() {
			super.afterCall();

			_cndR = getCndR().clone();
		}

		@Override
		protected void setMode() {
			super.setMode();

			setREFStatus();
		}

		protected MCMessageList chkBeforeAfter() {
			MCMessageList msgL = new MCMessageList();
			if (!Cnd_typ_TERM.isSelected()) {
				msgL.addAll(checkBeforeAfter(Cnd_ym_fr, Cnd_ym_to));
			}
			return msgL;
		}

		/**
		 * 期間検索時に６期以上、それ以外の検索時に年月範囲が61ヶ月以上の場合、エラーメッセージを返す。
		 */
		protected MCMessageList chkTermAndYm() {
			MCMessageList msgL = new MCMessageList();

			createLabelList();

			if (Cnd_typ_TERM.isSelected()) {
				if (_termList.size() > 5) {
					MCMessage msg = new MCMessage(MGBGP0002);

					msg.setCauseRow(getCndR(), Cnd_term_fr.getBaseRowColumnName());
					msgL.add(msg);
				}
			}
			else {
				if (_ymList.size() > 60) {
					MCMessage msg = new MCMessage(MGBGP0003);

					msg.setCauseRow(getCndR(), Cnd_ym_fr.getBaseRowColumnName());
					msgL.add(msg);
				}
			}

			return msgL;
		}

		// ラベル用リストの作成
		protected void createLabelList() {
			if (Cnd_typ_TERM.isSelected()) {
				// 期間
				_termList = MCList.create(MCRow.class);

				if (isNull(getCndR().term_fr()) || isNull(getCndR().term_to())) {
					return;
				}

				for (mcframe.clientMAUC.MAUCP0020.TermR r : getTermList()) {
					if (r.term().gte(getCndR().term_fr())
							&& r.term().lte(getCndR().term_to())) {
						_termList.add(r);
					}
				}
			}
			else {
				// 月次
				_ymList = MCList.create(MCRow.class);

				if (isNull(getCndR().ym_fr()) || isNull(getCndR().ym_to())) {
					return;
				}

				for (MCDate date = getCndR().ym_fr(); date
						.lte(getCndR().ym_to()); date = date.addMonth(1)) {
					MCRow row = _ymList.createRow();

					row.setDateNE(_YM_COL, date);
					_ymList.add(row);
				}
			}
		}

		// ラベルの設定
		protected void createCol() {
			// 期間はカラム
			if (Cnd_typ_TERM.isSelected()) {
				MCColumnConfig[] confs = getVarColConfs(_TERM);

				for (int i = 0; i < _termList.size(); i++) {
					confs[i].setHeaderName(_termList.get(i).getStringNE("term_nm"));
				}
			}
			else {
				// 月次はカラムグループ
				MCColumnGroup[] cgs = RsltTable.getAllColumnGroups();

				for (int i = 0; i < _ymList.size(); i++) {
					cgs[i].setHeaderName(
							toYMHeaderLabel(panel, _ymList.get(i).getDateNE(_YM_COL)));
					cgs[i].setHeaderMessage(
							toYMHeaderMessage(panel, _ymList.get(i).getDateNE(_YM_COL)));
				}
			}
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBGL0150_Srch01();
	}

	// ///////////////////// INIT /////////////////////////////////////////////

	@Override
	protected void valueInit() {
		super.valueInit();

		initCondition();
		initCalcCtg();
		setDefWg();
	}

	// 種別変更時の検索条件の初期化
	protected void initCondition() {
		if (Cnd_typ_TERM.isSelected()) {
			setValueEx(Cnd_term_fr, getTermInfo(this).term());
			setValueEx(Cnd_term_to, getTermInfo(this).term());

			Cnd_ym_fr.clear();
			Cnd_ym_to.clear();
			Cnd_pln_calc_ctg_cd.clear();
			Cnd_act_calc_ctg_cd.clear();
		}
		else {
			setValueEx(Cnd_ym_fr, getTermInfo(this).term());
			setValueEx(Cnd_ym_to, getTermInfo(this).term_end_ym().addMonth(-1));

			Cnd_term_fr.clear();
			Cnd_term_to.clear();
			Cnd_calc_ctg_cd.clear();

			if (Cnd_typ_PLN.isSelected()) {
				Cnd_act_calc_ctg_cd.clear();
			}
			else if (Cnd_typ_ACT.isSelected()) {
				Cnd_pln_calc_ctg_cd.clear();
			}
		}
	}

	@Override
	public void screenClearBody() {
		super.screenClearBody();

		_termList = MCList.create(MCRow.class);
		_ymList = MCList.create(MCRow.class);
	}

	protected void initCalcCtg() {
		if (Cnd_typ_TERM.isSelected()) {
			setDefCalcCtg(Cnd_calc_ctg_cd);
		}
		else if (Cnd_typ_PLN.isSelected()) {
			setDefCalcCtg(Cnd_pln_calc_ctg_cd);
		}
		else if (Cnd_typ_ACT.isSelected()) {
			setDefCalcCtg(Cnd_act_calc_ctg_cd);
		}
		else if (Cnd_typ_PA.isSelected()) {
			setDefCalcCtg(Cnd_pln_calc_ctg_cd);
			setDefCalcCtg(Cnd_act_calc_ctg_cd);
		}
	}
	protected void setDefWg() {
		String wg = getSysParm("DEF_WG_CD");
		if (!isNullOrNullVal(wg)) {
			getCndR().wg_cd(wg);
		}
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();

		CndPanel.focusFirstComponent();
	}

	// ///////////////////// PreAlcCol Control //////////////////////////////

	/**
	 * 一次配賦比率設定対象のカラムと一次配賦区分を取得するためのカラム名のマッピング
	 * <P>
	 * キー ： 一次配賦比率設定対象のカラム<br>
	 * 値 ： 一次配賦比率設定対象のカラム
	 * のカラム名
	 * </P>
	 */
	protected Map<MCColumnConfig, String> getColumnPreAlcPtnColumnMap() {
		if (_columnPreAlcPtnColumnMap == null) {
			_columnPreAlcPtnColumnMap = createColumnPreAlcPtnColumnMap();
		}

		return _columnPreAlcPtnColumnMap;
	}

	protected Map<MCColumnConfig, String> createColumnPreAlcPtnColumnMap() {
		Map<MCColumnConfig, String> colMap = new HashMap<MCColumnConfig, String>();

		colMap.put(columnRslt_dpt_cd, CndR.$dpt_alc_typ);
		colMap.put(columnRslt_loc_cd, CndR.$loc_alc_typ);
		colMap.put(columnRslt_oper_cd, CndR.$oper_alc_typ);
		colMap.put(columnRslt_bp_cd, CndR.$bp_alc_typ);
		colMap.put(columnRslt_ctg_cd, CndR.$ctg_alc_typ);
		colMap.put(columnRslt_itm_cd, CndR.$itm_alc_typ);
		colMap.put(columnRslt_lot_no, CndR.$lot_alc_typ);
		colMap.put(columnRslt_sublot_no, CndR.$sublot_alc_typ);
		colMap.put(columnRslt_sno1, CndR.$sno1_alc_typ);
		colMap.put(columnRslt_sno2, CndR.$sno2_alc_typ);
		colMap.put(columnRslt_sno3, CndR.$sno3_alc_typ);
		colMap.put(columnRslt_sno4, CndR.$sno4_alc_typ);
		colMap.put(columnRslt_itm_mfg_inst_no, CndR.$inst_alc_typ);
		colMap.put(columnRslt_iv_no, CndR.$iv_alc_typ);
		colMap.put(columnRslt_po_no, CndR.$po_alc_typ);
		colMap.put(columnRslt_slo_no, CndR.$slo_alc_typ);
		colMap.put(columnRslt_alc_ac_cd, CndR.$alc_ac_alc_typ);
		colMap.put(columnRslt_trd_wg_cd, CndR.$wg_alc_typ);

		return colMap;
	}

	// カラムと一次配賦区分のマッピング（end）
	// カラムとモード設定対象のBeansのマッピング
	protected Map<MCColumnConfig, MCColumnConfig[]> _columnModeTargetMap;

	/**
	 * 一次配賦比率設定対象のカラムと一次配賦区分を取得するためのカラム名のマッピング
	 * <P>
	 * キー ： 一次配賦比率設定対象のカラムの部品（elmKey）<br>
	 * 値 ： カラムの配列
	 * </P>
	 */
	protected Map<MCColumnConfig, MCColumnConfig[]> getColumnModeTargetMap() {
		if (_columnModeTargetMap == null) {
			_columnModeTargetMap = createColumnModeTargetMap();
		}

		return _columnModeTargetMap;
	}

	protected Map<MCColumnConfig, MCColumnConfig[]> createColumnModeTargetMap() {
		Map<MCColumnConfig, MCColumnConfig[]> colMap = new HashMap<MCColumnConfig, MCColumnConfig[]>();

		colMap.put(columnRslt_dpt_cd, new MCColumnConfig[] {
				columnRslt_dpt_cd, columnRslt_dpt_nm
		});

		colMap.put(columnRslt_loc_cd, new MCColumnConfig[] {
				columnRslt_loc_cd, columnRslt_loc_nm
		});

		colMap.put(columnRslt_oper_cd, new MCColumnConfig[] {
				columnRslt_oper_cd, columnRslt_oper_nm
		});

		colMap.put(columnRslt_bp_cd, new MCColumnConfig[] {
				columnRslt_bp_cd, columnRslt_bp_nm
		});

		colMap.put(columnRslt_ctg_cd, new MCColumnConfig[] {
				columnRslt_ctg_cd, columnRslt_ctg_nm
		});

		colMap.put(columnRslt_itm_cd, new MCColumnConfig[] {
				columnRslt_itm_cd, columnRslt_itm_sub1, columnRslt_itm_sub2,
				columnRslt_itm_sub3, columnRslt_itm_nm
		});

		colMap.put(columnRslt_lot_no, new MCColumnConfig[] {
				columnRslt_lot_no
		});

		colMap.put(columnRslt_sublot_no, new MCColumnConfig[] {
				columnRslt_sublot_no
		});

		colMap.put(columnRslt_sno1, new MCColumnConfig[] {
				columnRslt_sno1
		});

		colMap.put(columnRslt_sno2, new MCColumnConfig[] {
				columnRslt_sno2
		});

		colMap.put(columnRslt_sno3, new MCColumnConfig[] {
				columnRslt_sno3
		});

		colMap.put(columnRslt_sno4, new MCColumnConfig[] {
				columnRslt_sno4
		});

		colMap.put(columnRslt_itm_mfg_inst_no, new MCColumnConfig[] {
				columnRslt_itm_mfg_inst_no
		});

		colMap.put(columnRslt_iv_no, new MCColumnConfig[] {
				columnRslt_iv_no
		});

		colMap.put(columnRslt_po_no, new MCColumnConfig[] {
				columnRslt_po_no
		});

		colMap.put(columnRslt_slo_no, new MCColumnConfig[] {
				columnRslt_slo_no
		});

		colMap.put(columnRslt_alc_ac_cd, new MCColumnConfig[] {
				columnRslt_alc_ac_cd, columnRslt_alc_ac_nm
		});

		colMap.put(columnRslt_trd_wg_cd, new MCColumnConfig[] {
				columnRslt_trd_wg_cd, columnRslt_trd_wg_nm
		});

		return colMap;
	}

	// ///////////////////// Notification Change //////////////////////////////

	@Override
	public void doCnd_typ_NC(MCEventInfo info) {
		super.doCnd_typ_NC(info);

		displayCondition();
		initCondition();
		initCalcCtg();

		setValueEx(Cnd_pre_alc_rate_cd, null);
		RsltTable.clear();

		_termList = MCList.create(MCRow.class);
		_ymList = MCList.create(MCRow.class);

		displayColumn();
	}

	@Override
	public void doCnd_pre_alc_rate_cd_NC(MCEventInfo info) {
		super.doCnd_pre_alc_rate_cd_NC(info);

		RsltTable.clear();
	}

	// ///////////////////// List Change //////////////////////////////

	@Override
	public void doCnd_pre_alc_rate_cd_LC(MCEventInfo info) {
		super.doCnd_pre_alc_rate_cd_LC(info);

		setColumnMode();
	}

	/**
	 * 一次配賦区分に応じたカラムを表示します。
	 */
	protected void setColumnMode() {
		for (MCColumnConfig column : getColumnPreAlcPtnColumnMap().keySet()) {
			MCColumnConfig[] modeTar = getColumnModeTargetMap().get(column);

			if (isVisibleElmKey(column)) {
				for (MCColumnConfig conf : modeTar) {
					setDefaultMode(conf);
				}
			}
			else {
				for (MCColumnConfig conf : modeTar) {
					conf.setMode(MCMode.INVISIBLE);
				}
			}
		}

		RsltTable.adjustWidth();
	}

	/**
	 * <p>
	 * elmKey 以外のカラムだとfalse
	 * 
	 * @param keyColumn elmKey
	 * @return
	 */
	protected boolean isVisibleElmKey(MCColumnConfig keyColumn) {
		String colName = getColumnPreAlcPtnColumnMap().get(keyColumn);
		String typVal = getCndR().getStringNE(colName);
		MAC_PRE_ALC_TYP typ = MAC_PRE_ALC_TYP.getNE(typVal);

		if (MAC_PRE_ALC_TYP.isTARGET(typ)) {
			return true;
		}

		return false;
	}

	// ///////////////////// Double Click //////////////////////////////

	@Override
	public void doDCEvent(MCDCBeans dc, MCEventInfo info) {
		super.doDCEvent(dc, info);

		if (dc == RsltTable) {
			doRslt_DC(info);
		}
	}

	protected void doRslt_DC(MCEventInfo info) {
		MCColumnConfig colConf = info.getClickColumn();

		if (Cnd_typ_TERM.isSelected()) {
			if (getIndex(_TERM, colConf) < 0) {
				return;
			}

			openMGBGP0110(colConf);
		}
		else {
			if (getIndex(_PLN, colConf) < 0 && getIndex(_ACT, colConf) < 0) {
				return;
			}

			openMGBGP0120(colConf);
		}
	}

	// ///////////////////// ListLogic ////////////////////////////////////////

	@Override
	public MCList getCnd_pre_alc_rate_cd(MCRow row, MCEventInfo info) {
		if (Cnd_typ_TERM.isSelected()) {
			row.addBooleanColumn(PreAlcRateWithPtnCols.$i_term_flg, true);
		}
		else {
			row.addBooleanColumn(PreAlcRateWithPtnCols.$i_term_flg, false);

			if (Cnd_typ_PLN.isSelected() || Cnd_typ_PA.isSelected()) {
				row.addStringColumn(PreAlcRateWithPtnCols.$i_pln_mly_flg_str, _TRUE);
			}

			if (Cnd_typ_ACT.isSelected() || Cnd_typ_PA.isSelected()) {
				row.addStringColumn(PreAlcRateWithPtnCols.$i_act_mly_flg_str, _TRUE);
			}
		}

		return super.getCnd_pre_alc_rate_cd(row, info);
	}

	// ///////////////////// Status ///////////////////////////////////////////

	protected void setStatusCom() {
		displayCondition();
		setColumnMode();
		displayColumn();
		setFocus();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();

		setStatusCom();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();

		setStatusCom();
	}

	// 検索条件の入力可不可制御
	protected void displayCondition() {
		if (Cnd_typ_TERM.isSelected()) {
			setDefaultMode(Cnd_term_fr);
			setDefaultMode(Cnd_term_to);
			setDefaultMode(Cnd_calc_ctg_cd);

			Cnd_ym_fr.setMode(MCMode.READ_ONLY);
			Cnd_ym_to.setMode(MCMode.READ_ONLY);
			Cnd_pln_calc_ctg_cd.setMode(MCMode.READ_ONLY);
			Cnd_act_calc_ctg_cd.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_ym_fr);
			setDefaultMode(Cnd_ym_to);
			setDefaultMode(Cnd_pln_calc_ctg_cd);
			setDefaultMode(Cnd_act_calc_ctg_cd);

			Cnd_term_fr.setMode(MCMode.READ_ONLY);
			Cnd_term_to.setMode(MCMode.READ_ONLY);
			Cnd_calc_ctg_cd.setMode(MCMode.READ_ONLY);

			if (Cnd_typ_PLN.isSelected()) {
				Cnd_act_calc_ctg_cd.setMode(MCMode.READ_ONLY);
			}

			if (Cnd_typ_ACT.isSelected()) {
				Cnd_pln_calc_ctg_cd.setMode(MCMode.READ_ONLY);
			}
		}

		CndPanel.focusFirstComponent();
	}

	// カラムの表示制御
	protected void displayColumn() {
		displayColumn(_TERM, Cnd_typ_TERM.isSelected() ? _termList.size() : 0);
		displayColumn(_PLN,
				Cnd_typ_PLN.isSelected() || Cnd_typ_PA.isSelected() ? _ymList.size() : 0);
		displayColumn(_ACT,
				Cnd_typ_ACT.isSelected() || Cnd_typ_PA.isSelected() ? _ymList.size() : 0);
	}

	protected void displayColumn(String key, int size) {
		MCColumnConfig[] colConf = getVarColConfs(key);

		for (int i = 0; i < colConf.length; i++) {
			if (i < size) {
				setDefaultMode(colConf[i]);
			}
			else {
				colConf[i].setMode(MCMode.INVISIBLE);
			}
		}
	}

	protected void setFocus() {
		if (getRsltL().isEmpty()) {
			CndPanel.focusFirstComponent();
		}
		else {
			RsltTable.selectLeftmostColumn(0);
		}
	}

	// ///////////////////// Screen Open ///////////////////////////////////////

	protected void openMGBGP0110(MCColumnConfig colConf) {
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBGP0110");

		mcframe.clientMGBG.MGBGP0110.MGBGP_PreRateTermReg panel = (mcframe.clientMGBG.MGBGP0110.MGBGP_PreRateTermReg) so
				.getPanel();
		mcframe.clientMGBG.MGBGP0110.CndR cnd = mcframe.clientMGBG.MGBGP0110.CndR
				.create();

		cnd.ope(panel.Cnd_ope_REF.getActionCommand());
		openScreen(so, cnd, colConf);
	}

	protected void openMGBGP0120(MCColumnConfig colConf) {
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBGP0120");

		mcframe.clientMGBG.MGBGP0120.MGBGP_PreRateMlyReg panel = (mcframe.clientMGBG.MGBGP0120.MGBGP_PreRateMlyReg) so
				.getPanel();
		mcframe.clientMGBG.MGBGP0120.CndR cnd = mcframe.clientMGBG.MGBGP0120.CndR
				.create();

		cnd.ope(panel.Cnd_ope_REF.getActionCommand());
		openScreen(so, cnd, colConf);
	}

	protected void openScreen(MAUCP_AppScreenOpener so, MCRow row,
			MCColumnConfig colConf) {
		setScreenOpenBind(row, colConf);

		so.putCnd(row);
		so.runValueInit();
		so.putSearchAction();
		so.show();
	}

	/**
	 * 画面遷移用共通バインド設定
	 */
	protected void setScreenOpenBind(MCRow row, MCColumnConfig colConf) {
		String calcCtgCd = "calc_ctg_cd";
		String ym = "ym";
		String saTyp = "sa_typ";
		String preAlcRateCd = "pre_alc_rate_cd";
		String wgCd = "wg_cd";
		String term = "term";
		
		row.setStringNE(preAlcRateCd, _cndR.pre_alc_rate_cd());
		row.setStringNE(wgCd, _cndR.wg_cd());

		if (Cnd_typ_TERM.isSelected()) {
			row.setStringNE(calcCtgCd, _cndR.calc_ctg_cd());
			row.setDateNE(term, _termList.get(getIndex(_TERM, colConf)).getDate(_TERM));
		}
		else {
			if (getIndex(_PLN, colConf) >= 0) {
				row.setStringNE(saTyp, MAC_SA_TYP.PLN.value());
				row.setStringNE(calcCtgCd, _cndR.pln_calc_ctg_cd());
				row.setDateNE(ym,
						_ymList.get(getIndex(_PLN, colConf)).getDate(_YM_COL));
			}
			else {
				row.setStringNE(saTyp, MAC_SA_TYP.ACT.value());
				row.setStringNE(calcCtgCd, _cndR.act_calc_ctg_cd());
				row.setDateNE(ym,
						_ymList.get(getIndex(_ACT, colConf)).getDate(_YM_COL));
			}
		}
	}

	protected int getIndex(String key, MCColumnConfig cc) {
		int i = 0;

		for (MCColumnConfig col : getVarColConfs(key)) {
			if (col == cc) {
				return i;
			}
			i++;
		}

		return -1;
	}

	// ///////////////////// ColumnConfig ///////////////////////////////////////

	@Override
	protected Set<MCColumnConfig> getCachedVisibleColumnConfigs(MCTable tbl,
			String type) {
		if (tbl == RsltTable) {
			// 可変カラムは検索するごとに変わるのでキャッシュしない
			return null;
		}

		return super.getCachedVisibleColumnConfigs(tbl, type);
	}

	@Override
	protected void customVisibleColumnConfigs(MCTable table, String type,
			Set<MCColumnConfig> confSet) {
		if (table == RsltTable) {
			ArrayList<MCColumnConfig> list = new ArrayList<MCColumnConfig>();

			// 可変カラムの部分を再設定する
			confSet.removeAll(Arrays.asList(getVarColConfs(_TERM)));
			confSet.removeAll(Arrays.asList(getVarColConfs(_PLN)));
			confSet.removeAll(Arrays.asList(getVarColConfs(_ACT)));

			if (Cnd_typ_TERM.isSelected()) {
				for (int i = 0; i < _termList.size(); i++) {
					list.add(getVarColConfs(_TERM)[i]);
				}
			}

			if (Cnd_typ_PLN.isSelected() || Cnd_typ_PA.isSelected()) {
				for (int i = 0; i < _ymList.size(); i++) {
					list.add(getVarColConfs(_PLN)[i]);
				}
			}

			if (Cnd_typ_ACT.isSelected() || Cnd_typ_PA.isSelected()) {
				for (int i = 0; i < _ymList.size(); i++) {
					list.add(getVarColConfs(_ACT)[i]);
				}
			}

			confSet.addAll(list);
		}

		super.customVisibleColumnConfigs(table, type, confSet);
	}

	// 項目属性「ELM」に指定項目属性文字列が設定されているカラムコンフィグを返す
	protected MCColumnConfig[] getVarColConfs(String key) {
		RsltR rsltR = RsltR.create();
		Map<String, String> map = rsltR.getExtMap(RsltR.$$ELM);
		ArrayList<MCColumnConfig> confs = new ArrayList<MCColumnConfig>();

		for (MCColumnConfig conf : RsltTable.getColumnConfigs()) {
			String val = map.get(conf.getBaseRowColumnName());

			if (isSame(val, key)) {
				confs.add(conf);
			}
		}

		return confs.toArray(new MCColumnConfig[0]);
	}

}