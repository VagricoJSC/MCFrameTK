package mcframe.serverMAUC.MAUCL5010;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"PushNtc_Upd01_Wk1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PushNtc_Upd01_Wk1R_MC_A extends MCConstRow {

	/**
	 * Push notifications No. プッシュ通知ＮＯ.<p>
	 *
	 */
	public static final String $push_ntc_no = "push_ntc_no";
	/**
	 * Client type クライアント区分.<p>
	 *
	 */
	public static final String $client_typ = "client_typ";
	/**
	 * Transition destination module ID 遷移先モジュールＩＤ.<p>
	 *
	 */
	public static final String $trans_module_id = "trans_module_id";
	/**
	 * Transition destination screen ID 遷移先画面ＩＤ.<p>
	 *
	 */
	public static final String $trans_screen_id = "trans_screen_id";
	/**
	 * Execute after transition button 遷移後実行ボタン.<p>
	 *
	 */
	public static final String $trans_btn_path = "trans_btn_path";


	public static final MCMeta push_ntc_no_META = createCommonMeta($push_ntc_no, mcframe.commonMA.meta.MA_META.PUSH_NTC_NO);
	public static final MCMeta client_typ_META = createCommonMeta($client_typ, mcframe.commonMA.meta.MA_META.CLIENT_TYP);
	public static final MCMeta trans_module_id_META = createCommonMeta($trans_module_id, mcframe.commonMA.meta.MA_META.MODULE_ID);
	public static final MCMeta trans_screen_id_META = createCommonMeta($trans_screen_id, mcframe.commonMA.meta.MA_META.SCREEN_ID);
	public static final MCMeta trans_btn_path_META = createCommonMeta($trans_btn_path, mcframe.commonMA.meta.MA_META.IC_STR);

	protected static final ConstMetaList<PushNtc_Upd01_Wk1R> constMetas = new ConstMetaList<PushNtc_Upd01_Wk1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			push_ntc_no_META,
			client_typ_META,
			trans_module_id_META,
			trans_screen_id_META,
			trans_btn_path_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
	);

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected PushNtc_Upd01_Wk1R_MC_A(ConstMetaList<? extends PushNtc_Upd01_Wk1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PushNtc_Upd01_Wk1R clone() {
		return (PushNtc_Upd01_Wk1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PushNtc_Upd01_Wk1R createInstance() {
		return (PushNtc_Upd01_Wk1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PushNtc_Upd01_Wk1R getValues(String... names) {
		return (PushNtc_Upd01_Wk1R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Push notifications No. プッシュ通知ＮＯ.<p>
	 *
	 */
	public String push_ntc_no() {
		return getConstString(offset + 0, $push_ntc_no);
	}

	/**
	 * Push notifications No. プッシュ通知ＮＯ.<p>
	 *
	 */
	public void push_ntc_no(String value) {
		setConstString(offset + 0, $push_ntc_no, value);
	}


	/**
	 * Client type クライアント区分.<p>
	 *
	 */
	public String client_typ() {
		return getConstString(offset + 1, $client_typ);
	}

	/**
	 * Client type クライアント区分.<p>
	 *
	 */
	public void client_typ(String value) {
		setConstString(offset + 1, $client_typ, value);
	}


	/**
	 * Transition destination module ID 遷移先モジュールＩＤ.<p>
	 *
	 */
	public String trans_module_id() {
		return getConstString(offset + 2, $trans_module_id);
	}

	/**
	 * Transition destination module ID 遷移先モジュールＩＤ.<p>
	 *
	 */
	public void trans_module_id(String value) {
		setConstString(offset + 2, $trans_module_id, value);
	}


	/**
	 * Transition destination screen ID 遷移先画面ＩＤ.<p>
	 *
	 */
	public String trans_screen_id() {
		return getConstString(offset + 3, $trans_screen_id);
	}

	/**
	 * Transition destination screen ID 遷移先画面ＩＤ.<p>
	 *
	 */
	public void trans_screen_id(String value) {
		setConstString(offset + 3, $trans_screen_id, value);
	}


	/**
	 * Execute after transition button 遷移後実行ボタン.<p>
	 *
	 */
	public String trans_btn_path() {
		return getConstString(offset + 4, $trans_btn_path);
	}

	/**
	 * Execute after transition button 遷移後実行ボタン.<p>
	 *
	 */
	public void trans_btn_path(String value) {
		setConstString(offset + 4, $trans_btn_path, value);
	}


	public String getString(String name) {
		if ($push_ntc_no.equalsIgnoreCase(name)) {
			return push_ntc_no();
		}
		if ($client_typ.equalsIgnoreCase(name)) {
			return client_typ();
		}
		if ($trans_module_id.equalsIgnoreCase(name)) {
			return trans_module_id();
		}
		if ($trans_screen_id.equalsIgnoreCase(name)) {
			return trans_screen_id();
		}
		if ($trans_btn_path.equalsIgnoreCase(name)) {
			return trans_btn_path();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($push_ntc_no.equalsIgnoreCase(name)) {
			return push_ntc_no();
		}
		if ($client_typ.equalsIgnoreCase(name)) {
			return client_typ();
		}
		if ($trans_module_id.equalsIgnoreCase(name)) {
			return trans_module_id();
		}
		if ($trans_screen_id.equalsIgnoreCase(name)) {
			return trans_screen_id();
		}
		if ($trans_btn_path.equalsIgnoreCase(name)) {
			return trans_btn_path();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($push_ntc_no.equalsIgnoreCase(name)) {
			push_ntc_no(value);
			return;
		}
		if ($client_typ.equalsIgnoreCase(name)) {
			client_typ(value);
			return;
		}
		if ($trans_module_id.equalsIgnoreCase(name)) {
			trans_module_id(value);
			return;
		}
		if ($trans_screen_id.equalsIgnoreCase(name)) {
			trans_screen_id(value);
			return;
		}
		if ($trans_btn_path.equalsIgnoreCase(name)) {
			trans_btn_path(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($push_ntc_no.equalsIgnoreCase(name)) {
			push_ntc_no(value);
			return;
		}
		if ($client_typ.equalsIgnoreCase(name)) {
			client_typ(value);
			return;
		}
		if ($trans_module_id.equalsIgnoreCase(name)) {
			trans_module_id(value);
			return;
		}
		if ($trans_screen_id.equalsIgnoreCase(name)) {
			trans_screen_id(value);
			return;
		}
		if ($trans_btn_path.equalsIgnoreCase(name)) {
			trans_btn_path(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

