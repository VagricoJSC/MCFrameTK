package mcframe.clientMAUD.MAUDP0050;

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
import mcframe.clientFXBA.FXBAP0010.IfHPartsForCaller;
import mcframe.clientFXUB.FXUBP0000.IfParts;
import mcframe.clientMAUC.MAUCP1050.MAUCP_BeansUtil;
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientCore.beans.list.MCListPutter;
import mcframe.commonCore.sys.MCFactory;
import mcframe.commonCore.util.MCListLogicUtil;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.clientMAUC.MAUCP0020.CoR;
import mcframe.clientMAUD.MAUDP0010.IfMAUDP_PanelBase;
import mcframe.clientMAUC.MAUCP0020.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUDP_HPartsBase"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUDP_HPartsBase_MC extends MAUDP_HPartsBase_MC_A implements IfParts, IfHPartsForCaller, IfMAUDP_PanelBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUDP_HPartsBase_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	/**
	 * 通信前チェック処理。
	 * <P>
	 * 自身のコンテナが通信の下り電文に含まれている場合に呼び出される。
	 * 通信定型処理から呼び出される。
	 * </P>
	 * <P>
	 * デフォルトの処理、この埋込画面が直接使用している
	 * 埋込画面クラスの同名メソッドを呼び出す。
	 * </P>
	 * @param list メッセージを格納するためのリスト
	 * @param caller 通信処理クラス。
	 */
	@SuppressWarnings("rawtypes")
	public void checkForCallStack(MCMessageList list, MCCaller caller) {
		for (MCRootPanel parts : getPartsPanels()) {
			if (parts instanceof IfHPartsForCaller) {
				IfHPartsForCaller pfc = (IfHPartsForCaller) parts;
				pfc.checkForCallStack(list, caller);
			}
		}
	}

	/**
	 * この部品に配置されている GUI 部品のモードを設定する。<br>
	 * 下記の通り、GUI 部品のモードを設定する。<br>
	 * <ul>
	 * <li>画面ステータスのモードが {@link MCMode#REQUIRED} の場合<br>
	 * <ul>
	 * <li>{@link #getGUIMode(MCModeBeans)} が null 以外を返した場合<br>
	 * {@link #getGUIMode(MCModeBeans)} のモードを設定する。
	 * </li>
	 * <li>{@link #getGUIMode(MCModeBeans)} が null を返した場合<br>
	 * 画面ステータスのモードを設定する。
	 * </li>
	 * </ul>
	 * </li>
	 * <li>画面ステータスのモードが {@link MCMode#ENABLE} の場合<br>
	 * <ul>
	 * <li>{@link #getGUIMode(MCModeBeans)} が null 以外を返した場合<br>
	 * {@link #getGUIMode(MCModeBeans)} のモードを設定する。
	 * </li>
	 * <li>{@link #getGUIMode(MCModeBeans)} が null を返した場合<br>
	 * 画面ステータスのモードを設定する。
	 * </li>
	 * </ul>
	 * </li>
	 * <li>画面ステータスのモードが {@link MCMode#READ_ONLY} の場合<br>
	 * 何もしない。
	 * </li>
	 * <li>画面ステータスのモードが {@link MCMode#DISABLE} の場合<br>
	 * 何もしない。
	 * </li>
	 * <li>画面ステータスのモードが {@link MCMode#INVISIBLE} の場合<br>
	 * 何もしない。
	 * </li>
	 * </ul>
	 *
	 * @see #getGUIMode(MCModeBeans)
	 */
	protected void setGUIMode() {
		MCModeBeans[] a = MCBeansUtil.getAllComponents(MCModeBeans.class, this);
		for (MCModeBeans compo : a) {
			if (isDefaultModeEditable(compo)) {
				MCMode mode = getGUIMode(compo);
				if (mode != null) {
					compo.setMode(mode);
				}
				else {
					setDefaultMode(compo);
				}
			}
		}
	}

	/**
	 * 指定された GUI 部品の入力可否を取得する。<br>
	 * <br>
	 * 画面ステータスのモードが入力不可の場合は false を返す。<br>
	 * 部品の制御で入力不可にしている場合は false を返す。<br>
	 * それ以外の場合は true を返す。
	 *
	 * @param compo GUI 部品
	 * @return GUI 部品の入力可否
	 * @see #getGUIMode(MCModeBeans)
	 */
	public boolean isPartsGUIEditable(MCModeBeans compo) {
		if (!isDefaultModeEditable(compo)) {
			return false;
		}
		MCMode mode = getGUIMode(compo);
		if (mode == null) {
			return true;
		}
		return compo.getModeInfo(mode).getStatus() == MCMode.ENABLE_STATUS;
	}

	/**
	 * 指定された GUI 部品のモードを取得する。<br>
	 * <br>
	 * 部品がモード制御する対象の GUI 部品を指定した場合は、
	 * 部品が制御するためのモードを返す。<br>
	 * 部品がモードを制御しない GUI 部品を指定した場合は null を返す。
	 *
	 * @param compo GUI 部品
	 * @return モードまたは null
	 */
	public MCMode getGUIMode(MCModeBeans compo) {
		return null;
	}


	@Override
	public boolean isTableParts() {
		return false;
	}


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
	// 埋込画面用ユーティリティ（ここから）
	// ///////////////////////////////////////////////
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
		if(beans == null) {
			return;
		}
		for(MCBeans b : beans ){
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

	// ///////////////////////////////////////////////
	// 埋込画面用ユーティリティ（ここまで）
	// ///////////////////////////////////////////////
	

	// ///////////////////////////////////////////////
	// ＮＵＬＬ文字対応関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * NULL文字対応するかどうか
	 */
	protected boolean _nullValCtl = false;
	
	/**
	 * NULL文字対応する場合に実行します。
	 */
	public void setNullValCtl() {
		_nullValCtl = true;
	}

	/**
	 * NULL文字対応するかどうかを返します。<br>
	 * {@link #setNullValCtl()}でNULL文字対応になります。
	 * 
	 * @return　boolean NULL文字対応するかどうか
	 */
	public boolean isNullValCtl() {
		return _nullValCtl;
	}
	// ///////////////////////////////////////////////
	// ＮＵＬＬ文字対応関連（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// 動的バインド変数設定関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 動的に変わるバインド変数を設定する場合にこのメソッドをオーバーライドしてバインドRowに追加します。<br>
	 * 
	 * @param bind
	 * @return　MCRow バインド変数を設定したRow
	 */
	protected void setDynamicBind(MCRow bind, int eventIndex) {
	}
	
	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		MCRow bindRow = super.getBindRowForISCustom(bind, beans, eventIndex);

		if (bindRow == null) {
			bindRow = MCRow.create();
		}
		
		// 入力補助画面を開くときに参照する動的なバインド値の設定
		setDynamicBind(bindRow, eventIndex);

		return bindRow;
	}
	// ///////////////////////////////////////////////
	// 動的バインド変数設定関連（ここまで）
	// ///////////////////////////////////////////////

	/**
	 * 会社情報を取得しキャッシュします。
	 *
	 * @return 会社情報
	 */
	protected CoR getCo() {
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

	@Override
	protected void partsInit() {
		super.partsInit();
		partsInitBySysParam();
	}
	protected void partsInitBySysParam() {
		MCBeans[] a = MAUCP_BeansUtil.getInvisibleBySysParam(this);
		setComponentInvisibleAllStatus(a);
	}

}