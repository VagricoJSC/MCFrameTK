package mcframe.clientMAUD.MAUDP0060;

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
import mcframe.clientFXUB.FXUBP0000.IfParts;
import mcframe.clientMAUC.MAUCP1050.MAUCP_BeansUtil;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import mcframe.clientFXBA.FXBAP0010.IfDPartsForCaller;
import mcframe.clientFXBA.FXBAP0080.FXBAP_CellConfig;
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientCore.beans.list.MCListPutter;
import mcframe.commonCore.sys.MCFactory;
import mcframe.commonCore.util.MCListLogicUtil;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.clientMAUC.MAUCP0020.CoR;
import mcframe.clientMAUD.MAUDP0010.IfMAUDP_PanelBase;
import mcframe.clientMAUC.MAUCP0020.*;
import mcframe.clientMAUD.MAUDP0010.IfDPartsForMACaller;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUDP_DPartsBase"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUDP_DPartsBase_MC extends MAUDP_DPartsBase_MC_A implements IfParts, IfDPartsForMACaller, IfMAUDP_PanelBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUDP_DPartsBase_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	// インタフェース
	@SuppressWarnings("rawtypes")
	public void checkForCallStack(MCMessageList list, MCRowMatcher matcher,
			MCCaller caller) {
		for (MCRootPanel parts : getPartsPanels()) {
			if (parts instanceof IfDPartsForCaller) {
				IfDPartsForCaller pfc = (IfDPartsForCaller) parts;
				pfc.checkForCallStack(list, matcher, caller);
			}
		}
	}

	@Override
	public void preShow(MCCaller caller) {
	}
	
	// セルコンフィグ

	/**
	 * @deprecated {@link #setPartsCellConfig()} を利用すること。
	 */
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		setPartsCellConfig();
	}

	/**
	 * 部品のテーブルにセルコンフィグを設定する。
	 */
	protected void setPartsCellConfig() {

	}

	@Override
	protected FXBAP_CellConfig createDefaultAppCellConfig() {
		return new MAUDP_CommonCellConfig();
	}

	public class MAUDP_CommonCellConfig extends MAUDP_CellConfig {

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column,
				MCTable table) {
			if (isDefaultModeEditable(column)) {
				return getCellMode(index, column);
			}
			return super.getPriorMode(index, column, table);
		}
	}

	/**
	 * 指定されたセルの入力可否を取得する。<br>
	 * <br>
	 * 画面ステータスのモードが入力不可の場合は false を返す。<br>
	 * 部品の制御で入力不可にしている場合は false を返す。<br>
	 * それ以外の場合は true を返す。
	 * 
	 * @param index 処理対象行
	 * @param column テーブルカラム
	 * @return セルの入力可否
	 */
	public boolean isPartsCellEditable(int index, MCColumnConfig column) {
		if (!isDefaultModeEditable(column)) {
			return false;
		}
		MCMode mode = getCellMode(index, column);
		if (mode == null) {
			return true;
		}
		return column.getModeInfo(mode).getStatus() == MCMode.ENABLE_STATUS;
	}

	/**
	 * 指定されたセルのモードを取得する。<br>
	 * <br>
	 * 部品がモード制御する対象のセルを指定した場合は、
	 * 部品が制御するためのモードを返す。<br>
	 * 部品がモードを制御しないセルを指定した場合は null を返す。
	 * 
	 * @param index 処理対象行
	 * @param column テーブルカラム
	 * @return モードまたは null
	 */
	protected MCMode getCellMode(int index, MCColumnConfig column) {
		return null;
	}

	@Override
	public boolean isTableParts() {
		return true;
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


	// ///////////////////////////////////////////////
	// その他ユーティリティ（ここから）
	// ///////////////////////////////////////////////
	/**
	 * Beansの値を取得して返します。
	 * @param b ヘッダ項目または明細カラムコンフィグ
	 * @param index 明細の行番号
	 * @return 値
	 */
	protected Comparable<?> getBeansValue(MCBeans b, int index) {
		// beansがヘッダの場合
		if (b instanceof MCRowBeans) {
			MCRowBeans beans = (MCRowBeans) b;
			return beans.getRowValue();
		}
		// beansが明細の場合
		else if (b instanceof MCColumnConfig) {
			MCColumnConfig conf = (MCColumnConfig) b;
			return conf.getBaseTable().getValue(index, conf);
		}
		return null;
	}
	// ///////////////////////////////////////////////
	// その他ユーティリティ（ここまで）
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