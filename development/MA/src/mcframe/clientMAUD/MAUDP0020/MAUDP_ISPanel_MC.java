package mcframe.clientMAUD.MAUDP0020;

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


import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.*;

import mcframe.clientFXBA.FXBAP0030.IfISPanelWithPaging;
import mcframe.clientMAUA.MAUAP0010.MAUAP_List;
import mcframe.clientFXBA.FXBAP0020.FXBAP_ListLogicBase;
import mcframe.clientMAUC.MAUCP1050.MAUCP_BeansUtil;
import mcframe.commonCore.resource.MCConst;
import mcframe.commonCore.sys.MCFactory;
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientCore.beans.list.MCListPutter;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.clientMAUC.MAUCP0020.CoR;
import mcframe.clientCore.requester.MCCaller;
import mcframe.commonCore.param.MCParam;
import mcframe.clientFXBA.FXBAP0010.FXBAP_PanelBase;
import mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit;
import mcframe.clientMAUD.MAUDP0010.IfMAUDP_PanelBase;
import mcframe.clientMAUC.MAUCP0020.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUDP_ISPanel"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUDP_ISPanel_MC extends MAUDP_ISPanel_MC_A implements IfISPanelWithPaging, IfMAUDP_PanelBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUDP_ISPanel_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	// ///////////////////////////////////////////////
	// 検索処理関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 検索処理<P>
	 * 入力補助画面の検索のボタンの処理に記述する。
	 */
	protected void callListSrch() {
		String llid = getISListPutter().getListLogicId();
		callListSrch(llid);
	}
	/**
	 * 検索処理<P>
	 * （入力補助画面作成時のテスト用）
	 */
	protected void callListSrch(String llid) {
		// チェック処理
		MCMessageList msgList = new MCMessageList();
		checkForCallStack(msgList);
		if (msgList.size() > 0) {
			showStackMsg(msgList);
			return;
		}

		String mtd = MCConst.ll.getClientMethod(llid);

		// リストロジック実行
		FXBAP_ListLogicBase lstLgc = (FXBAP_ListLogicBase) MCListLogic.create(llid, this, this);
		Class[] types = new Class[] {MCRow.class, MCEventInfo.class};
		Object[] args = new Object[] {getCndR(), null};
		MCFactory.invoke(lstLgc, mtd, types, args);
	}

	/** フラグ項目グループ定義用項目属性ＩＤ */
	protected static final String FLG_GRP = "FLG_GRP";
	/**
	 * 画面実装仕様書にグループとして定義されたフラグ項目に値を一律で設定する（初期値設定用）
	 *
	 * @param boo
	 */
	protected void setFlgGrpValue(boolean boo) {
		Map<String, String> flgMap = ((MCConstRow)getCndR()).getExtMap(FLG_GRP);
		if (flgMap == null) {
			return;
		}

		for(String key : flgMap.keySet()) {
			MCCheckBox b1 = (MCCheckBox)getComponent(getCndR(), key);
			b1.setValue(boo);
		}
	}
	/**
	 * 画面実装仕様書に定義されたフラグ項目のグループ単位でcheckAtLeastOneを実行
	 *
	 * @param msgList エラーメッセージを格納するためのリスト
	 */
	protected void checkCommonAtLeastOne(MCMessageList msgList) {
		Map<String, List<MCCheckBox>> flgGrpMap = new LinkedHashMap<>();
		Map<String, String> flgMap = ((MCConstRow)getCndR()).getExtMap(FLG_GRP);
		if (flgMap == null) {
			return;
		}

		// フラグのグループごとにMCCheckBoxのリストを作成する
		for (String key : flgMap.keySet()) {
			String grp = flgMap.get(key);
			if (!flgGrpMap.containsKey(grp)) {
				List<MCCheckBox> l = new ArrayList<>();
				flgGrpMap.put(grp, l);
			}
			MCCheckBox b1 = (MCCheckBox)getComponent(getCndR(), key);
			flgGrpMap.get(grp).add(b1);
		}

		// フラグのグループ単位でcheckAtLeastOneを実行
		for (String key : flgGrpMap.keySet()) {
			msgList.addAll(checkAtLeastOne((MCCheckBox[])flgGrpMap.get(key).toArray(new MCCheckBox[0])));
		}
	}

	protected void showStackMsg(MCMessageList msgList) {
		if (msgList == null || msgList.isEmpty()) return;
		MCMessageList otherMsg = null;
		for (MCMessage msg : msgList) {
			if (otherMsg == null) {
				otherMsg = new MCMessageList();
			}
			otherMsg.add(msg);
		}
		message(otherMsg);
	}

	/**
	 * 複数のチェックを行い、エラーがあった場合のメッセージを msgList に格納します。<p>
	 *
	 * @param msgList
	 */
	protected void checkForCallStack(MCMessageList msgList) {
		msgList.addAll(checkReq(getCndR()));
		checkCommonAtLeastOne(msgList);
	}

	/**
	 * 検索枠展開部品を返します。
	 */
	protected FXBAP_ExpandUnit getExpandUnit() {
		for (MCRootPanel p : getPartsPanels()) {
			if (p instanceof FXBAP_ExpandUnit) {
				return (FXBAP_ExpandUnit)p;
			}
		}
		return null;
	}

	@Override
	public void mcInitStatus() {
		super.mcInitStatus();

		FXBAP_ExpandUnit unit = getExpandUnit();
		if (unit != null) {
			unit.expand(true);
		}
	}

	@Override
	protected MCCaller createLLCaller(FXBAP_PanelBase panel, MCParam p, MCRow bind) {
		return new MAUDP_ISLLSearcher((MAUDP_ISPanel)panel, createLLCallerBridge(p, bind));
	}

	public class MAUDP_ISLLSearcher<P extends MAUDP_ISPanel, O extends FXBAP_ISLLCallerPanelBridge> extends FXBAP_ISLLSearcher<P, O> {

		protected MAUDP_ISLLSearcher(P panel, O b) {
			super(panel, b);
		}

		@Override
		protected void setMode() {
			super.setMode();

			FXBAP_ExpandUnit unit = getExpandUnit();
			if (unit != null) {
				unit.expand(false);
			}
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();

			FXBAP_ExpandUnit unit = getExpandUnit();
			if (unit != null) {
				unit.expand(true);
			}
		}

	}
	// ///////////////////////////////////////////////
	// 検索処理関連（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// 初期値、初期モード取得・設定関連（ここから）
	// ///////////////////////////////////////////////
	@Override
	public void setCondition(MCRow row , String mode){
		if (row != null) {
			// 遷移元から指定された初期値、モードを保存
			saveInitValue(row);
			saveInitMode(row);

			// 遷移元から指定された初期値、モードを設定
			setInitValue();
			setInitMode();
		}
	}

	@Override
	public void screenClearBody() {
		super.screenClearBody();

		// 画面クリア時に初期値を再設定
		setInitValue();
	}

	@Override
	public void setMode(String status) {
		super.setMode(status);

		// モード変更時にモードの再設定
		setInitMode();
	}

	/**
	 * 初期値を設定する項目と初期値のマッピング情報
	 */
	protected Map<String, Comparable<?>> _initVMap = new LinkedHashMap<>();
	/**
	 * モードを設定する項目とモードのマッピング情報
	 */
	protected Map<String, MCMode> _initMMap = new LinkedHashMap<>();

	@Override
	protected void panelClosedSub() {
		super.panelClosedSub();
		clearMapInfo();
	}

	/**
	 * マップ情報をクリアする
	 */
	protected void clearMapInfo() {
		_initVMap = new LinkedHashMap<>();
		_initMMap = new LinkedHashMap<>();
	}
	/**
	 * 遷移元から初期値を指定する項目の配列を返す
	 * <P>オーバーライドして使用する</P>
	 */
	protected String[] getInitValueCols() {
		return new String[] {};
	}
	/**
	 * 遷移元からモードを指定する項目の配列を返す
	 * <P>オーバーライドして使用する</P>
	 */
	protected String[] getInitModeCols() {
		return new String[] {};
	}

	/**
	 * 初期値の保存
	 */
	protected void saveInitValue(MCRow row) {
		for (String col : getInitValueCols()) {
			if (!isNull(row.getValueNE(col))) {
				_initVMap.put(col, row.getValueNE(col));
			}
		}
	}
	/**
	 * 初期値の設定
	 */
	protected void setInitValue() {
		setInitValue(getCndR());
	}
	/**
	 * 初期値の設定
	 * @param row
	 */
	protected void setInitValue(MCRow row) {
		for (Map.Entry<String, Comparable<?>> e : _initVMap.entrySet()) {
			String path = row.getRealColumnPath(e.getKey());
			Component compo = getComponent(row, path);
			if (compo instanceof MCRowBeans) {
				setValueEx((MCRowBeans)compo, e.getValue());
			}
			else {
				row.setValueNE(e.getKey(), e.getValue());
			}
		}
	}
	/**
	 * 初期モードの保存
	 */
	protected void saveInitMode(MCRow row) {
		for (String col : getInitModeCols()) {
			String x = row.getStringNE(col);
			if (!isNull(x) && MCMode.getMode(x) != null) {
				_initMMap.put(col, MCMode.getMode(x));
			}
		}
	}
	/**
	 * 初期モードの設定
	 */
	protected void setInitMode() {
		setInitMode(getCndR());
		setInitBtnMode();
	}
	/**
	 * 初期モードの設定
	 * @param row
	 */
	protected void setInitMode(MCRow row) {
		if (isCreated()) {
			for (Map.Entry<String, MCMode> e : _initMMap.entrySet()) {
				String nm = e.getKey().substring(5); // 頭の「mode_」を除いた文字列
				Component c = getComponent(row, nm);
				if (c instanceof MCModeBeans) {
					((MCModeBeans)c).setMode(e.getValue());
				}
			}
		}
	}

	/**
	 * ボタンの初期モードの設定
	 */
	protected void setInitBtnMode() {
		if (isCreated()) {
			if (getAllParams().length > 2) {
				if (getParam(2) instanceof MCListPutter) {
					MCListPutter putter = (MCListPutter)getParam(2);

					if (isPluralValueField(putter.getLinkBeans())) {
						Optional.ofNullable(getSelectAllBtn()).ifPresent(o -> setDefaultMode(o));
						Optional.ofNullable(getDeselectAllBtn()).ifPresent(o -> setDefaultMode(o));
					}
					else {
						Optional.ofNullable(getSelectAllBtn()).ifPresent(o -> o.setMode(MCMode.DISABLE));
						Optional.ofNullable(getDeselectAllBtn()).ifPresent(o -> o.setMode(MCMode.DISABLE));
					}
				}
			}
		}
	}

	/**
	 * 全選択ボタンを返します。
	 */
	protected MCButton getSelectAllBtn() {
		for (MCButton btn : MCBeansUtil.getAllComponents(MCButton.class, this)) {
			if ("Btn.select_all".equals(btn.getName())) {
				return btn;
			}
		}
		return null;
	}

	/**
	 * 全解除ボタンを返します。
	 */
	protected MCButton getDeselectAllBtn() {
		for (MCButton btn : MCBeansUtil.getAllComponents(MCButton.class, this)) {
			if ("Btn.deselect_all".equals(btn.getName())) {
				return btn;
			}
		}
		return null;
	}

	@Override
	public boolean beforeOpen() {
		if (!super.beforeOpen()) {
			return false;
		}

		String col = getISSrchTypCol();
		if (!isNull(col) && _initVMap.containsKey(col)) {
			String typ = (String)_initVMap.get(col);
			if (!isEnableSrchTyp(typ)) {
				throw new MCAppException(msgDisableSrchTyp(typ));
			}
		}

		return true;
	}

	/**
	 * 検索区分の項目名を返します。
	 *
	 * @return 検索区分の項目名
	 */
	protected String getISSrchTypCol() {
		return null;
	}

	/**
	 * この入力補助画面を起動できる検索区分が指定されているかどうか判定します。
	 * このメソッドがfalseを返した場合は、エラーメッセージを表示し、入力補助画面が起動されません。
	 *
	 * @param typ 検索区分
	 * @return この入力補助画面を起動できる検索区分が指定されている場合はtrue
	 */
	protected boolean isEnableSrchTyp(String typ) {
		return true;
	}

	/**
	 * 入力補助画面を起動できない検索区分が指定された場合のメッセージを返します。
	 *
	 * @param typ 検索区分
	 * @return メッセージ
	 */
	protected MCMessage msgDisableSrchTyp(String typ) {
		return new MCMessage(MAUDP0008, typ);
	}

	// ///////////////////////////////////////////////
	// 初期値、初期モード取得・設定関連（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// リストロジック関連（ここから）
	// ///////////////////////////////////////////////
	@Override
	protected void customInit() {
		super.customInit();
		// setListLogicColumnMappingでは内部でListPutterを取得しているが、
		// ListPutterの関連付けが各アプリのオートクラスのlistInitで行われるため
		// listInitではなく、その後のcustomInitに実装しています。
		listInitCustom();
	}

	/**
	 * リストロジックのカラム名と画面のカラム名とが違う場合の関連付け<BR>
	 * ※画面実装仕様書に設定が必要。
	 */
	protected void listInitCustom() {
		MAUCP_BeansUtil.listInitCustom(this);
	}

	// ///////////////////////////////////////////////
	// リストロジック関連（ここまで）
	// ///////////////////////////////////////////////

	// ///////////////////////////////////////////////
	// 入力補助用ユーティリティ（ここから）
	// ///////////////////////////////////////////////
	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();

		linkBeansToISPanelCustom();
	}

	/**
	 * 入力補助画面の紐づけ（linkBeansToISPanel）を行います。
	 */
	protected void linkBeansToISPanelCustom() {
		for (Object[] args : MAUCP_BeansUtil.getLinkBeansToISPanelArgs(this)) {
			linkBeansToISPanel((MCLinkBeans) args[0], (String) args[1], (String) args[2],
					(boolean) args[3]);
		}
	}
	
	/**
	 * 指定したGUI部品を入力補助画面に紐付けます。<br>
	 * コンボボックスから入力補助画面を起動したい場合等に使用してください。<br>
	 * linkBeansToISPanel()メソッドをO/Rし、実装される想定です。<p>
	 * 
	 * @param beans GUI部品
	 */
	protected void linkBeansToISPanelCustom(MCLinkBeans beans) {
		Object[] args = MAUCP_BeansUtil
				.getLinkBeansToISPanelArgs(beans.getListConfig().getListPutter());
		if (args != null) {
			linkBeansToISPanel(beans, (String) args[1], (String) args[2],
					(boolean) args[3]);
		}
	}

	/**
	 * 指定したGUI部品を入力補助画面に紐付けます。<br>
	 * コンボボックスから入力補助画面を起動したい場合等に使用してください。<br>
	 * linkBeansToISPanel()メソッドをO/Rし、実装される想定です。<p>
	 * 
	 * @param beans GUI部品
	 * @param usingForInput beansに手入力した場合に入力補助画面を使って連携項目を取得する場合true
	 */
	protected void linkBeansToISPanelCustom(MCLinkBeans beans, boolean usingForInput) {
		Object[] args = MAUCP_BeansUtil
				.getLinkBeansToISPanelArgs(beans.getListConfig().getListPutter());
		if (args != null) {
			linkBeansToISPanel(beans, (String) args[1], (String) args[2], usingForInput);
		}
	}

	// ///////////////////////////////////////////////
	// 入力補助用ユーティリティ（ここまで）
	// ///////////////////////////////////////////////

	/**
	 * 会社情報を取得しキャッシュします。
	 *
	 * @return 会社情報
	 */
	public CoR getCo() {
		String key = "MA.MAUDP0010.CO";
		if (!isCachedSysInfo(key)) {
			cacheSysInfo(key, getCoNoCache());
		}
		return (CoR) getCachedSysInfo(key);
	}

	@Override
	public String getSysParm(String parm_key) {
		String key = "MA.MAUDP0010.SYS_PARM.";
		if (!isCachedSysInfo(key + parm_key)) {
			for(SysParmR r: getSysParmAllNoCache()){
				cacheSysInfo(key + r.parm_key(), r.parm_val());
			}
		}
		return (String) getCachedSysInfo(key + parm_key);
	}
	
	/**
	 * @deprecated 各画面での使用は推奨されません。
	 */
	@Override
	public void afterInit() {

		setInvisibleBySysParam();

		super.afterInit();
	}

	/**
	 * システムパラメータによって項目を非表示にします。<br>
	 * 実装仕様書のコンテナ属性ＩＤ「DISP_CTL」に下記のキーを指定すると<br>
	 * 対応するシステムパラメータがオフの場合に項目を非表示にします。<br>
	 * 「DISP_CTL」に「_DISP」の設定がある場合は、非表示対象外とします。<br>
	 * <br>
	 * 「CONT_FCTR」（有効成分）：CONT_FCTR_ENABLE_FLG<br>
	 * 「VER_NO」（版）：VER_ENABLE_FLG<br>
	 * 「MFG_APRV」（製造承認）：MFG_APRV_ENABLE_FLG<br>
	 * 「YIELD」（収率）：YIELD_ENABLE_FLG<br>
	 */
	protected void setInvisibleBySysParam() {
		MCBeans[] a = MAUCP_BeansUtil.getInvisibleBySysParam(this);
		setComponentInvisibleAllStatus(a);
		MAUCP_BeansUtil.setModeBeansDefaultByDispCtl(this);
	}

	/**
	 * 引数で指定されたコンポーネントを全ての画面ステータスで非表示状態にします。
	 * <p>
	 * 引数をループして、 {@link #setComponentInvisibleAllStatus(MCBeans)}
	 * を呼び出します。
	 *
	 * @see #setComponentInvisibleAllStatus(MCBeans)
	 * @param beans
	 */
	protected void setComponentInvisibleAllStatus(MCBeans... beans) {
		if (beans == null) {
			return;
		}
		for (MCBeans b : beans) {
			setComponentInvisibleAllStatus(b);
		}
	}

	/**
	 * 引数で指定されたコンポーネントを全ての画面ステータスで非表示状態にします。
	 * <p>
	 * 注意事項<br>
	 * 引数にセットしたコンポーネントに対して {@link MCModeBeans#setMode}
	 * をすると、そのモードになります。その後、画面ステータスが変わると
	 * 非表示になります。<br>
	 * タブの構成要素であるMCPanelを引数にセットすると、タブペインからMCPanelを
	 * 除去します。結果、 {@link MCTabbedPane#indexOfComponent(Component)}が
	 * -1 を返すようになります。<br>
	 * </p>
	 *
	 * @param beans
	 */
	protected void setComponentInvisibleAllStatus(MCBeans beans) {
		MAUCP_BeansUtil.setComponentInvisibleAllStatus(beans, getPanelLayerList(), this);
	}

}