package mcframe.serverMBBC.MBBCL5020;

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
 * ブロック"Attach_Copy01_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Attach_Copy01_HdrR_MC_A extends MCConstRow {

	/**
	 * Message queue ID メッセージキューＩＤ.<p>
	 *
	 */
	public static final String $msg_queue_id = "msg_queue_id";
	/**
	 * Retry リトライ.<p>
	 *
	 */
	public static final String $retry_flg = "retry_flg";


	public static final MCMeta msg_queue_id_META = createCommonMeta($msg_queue_id, mcframe.commonMA.meta.MA_META.MSG_QUEUE_ID);
	public static final MCMeta retry_flg_META = createCommonMeta($retry_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Attach_Copy01_HdrR> constMetas = new ConstMetaList<Attach_Copy01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			msg_queue_id_META,
			retry_flg_META
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
	protected Attach_Copy01_HdrR_MC_A(ConstMetaList<? extends Attach_Copy01_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Attach_Copy01_HdrR clone() {
		return (Attach_Copy01_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Attach_Copy01_HdrR createInstance() {
		return (Attach_Copy01_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Attach_Copy01_HdrR getValues(String... names) {
		return (Attach_Copy01_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Message queue ID メッセージキューＩＤ.<p>
	 *
	 */
	public String msg_queue_id() {
		return getConstString(offset + 0, $msg_queue_id);
	}

	/**
	 * Message queue ID メッセージキューＩＤ.<p>
	 *
	 */
	public void msg_queue_id(String value) {
		setConstString(offset + 0, $msg_queue_id, value);
	}


	/**
	 * Retry リトライ.<p>
	 *
	 */
	public boolean retry_flg() {
		return getConstBoolean(offset + 1, $retry_flg);
	}

	/**
	 * Retry リトライ.<p>
	 *
	 */
	public void retry_flg(boolean value) {
		setConstBoolean(offset + 1, $retry_flg, value);
	}


	public String getString(String name) {
		if ($msg_queue_id.equalsIgnoreCase(name)) {
			return msg_queue_id();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($retry_flg.equalsIgnoreCase(name)) {
			return retry_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($msg_queue_id.equalsIgnoreCase(name)) {
			return msg_queue_id();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($retry_flg.equalsIgnoreCase(name)) {
			return retry_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($msg_queue_id.equalsIgnoreCase(name)) {
			msg_queue_id(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($retry_flg.equalsIgnoreCase(name)) {
			retry_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($msg_queue_id.equalsIgnoreCase(name)) {
			msg_queue_id(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($retry_flg.equalsIgnoreCase(name)) {
			retry_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

