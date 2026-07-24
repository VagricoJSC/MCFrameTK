package mcframe.serverMSBG.MSBGL5110;

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
 * ブロック"NoteIf_Ins01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class NoteIf_Ins01_CndR_MC_A extends MCConstRow {

	/**
	 * Note management No. 手形管理ＮＯ.<p>
	 *
	 */
	public static final String $note_mng_no = "note_mng_no";
	/**
	 * Deletion flg. 削除フラグ.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	/**
	 * Payment received result flg. 入金実績フラグ.<p>
	 *
	 */
	public static final String $rcv_act_flg = "rcv_act_flg";


	public static final MCMeta note_mng_no_META = createCommonMeta($note_mng_no, mcframe.commonMA.meta.MA_META.NOTE_MNG_NO);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_act_flg_META = createCommonMeta($rcv_act_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<NoteIf_Ins01_CndR> constMetas = new ConstMetaList<NoteIf_Ins01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			note_mng_no_META,
			del_flg_META,
			rcv_act_flg_META
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
	protected NoteIf_Ins01_CndR_MC_A(ConstMetaList<? extends NoteIf_Ins01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public NoteIf_Ins01_CndR clone() {
		return (NoteIf_Ins01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public NoteIf_Ins01_CndR createInstance() {
		return (NoteIf_Ins01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public NoteIf_Ins01_CndR getValues(String... names) {
		return (NoteIf_Ins01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Note management No. 手形管理ＮＯ.<p>
	 *
	 */
	public String note_mng_no() {
		return getConstString(offset + 0, $note_mng_no);
	}

	/**
	 * Note management No. 手形管理ＮＯ.<p>
	 *
	 */
	public void note_mng_no(String value) {
		setConstString(offset + 0, $note_mng_no, value);
	}


	/**
	 * Deletion flg. 削除フラグ.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 1, $del_flg);
	}

	/**
	 * Deletion flg. 削除フラグ.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 1, $del_flg, value);
	}


	/**
	 * Payment received result flg. 入金実績フラグ.<p>
	 *
	 */
	public boolean rcv_act_flg() {
		return getConstBoolean(offset + 2, $rcv_act_flg);
	}

	/**
	 * Payment received result flg. 入金実績フラグ.<p>
	 *
	 */
	public void rcv_act_flg(boolean value) {
		setConstBoolean(offset + 2, $rcv_act_flg, value);
	}


	public String getString(String name) {
		if ($note_mng_no.equalsIgnoreCase(name)) {
			return note_mng_no();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($rcv_act_flg.equalsIgnoreCase(name)) {
			return rcv_act_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($note_mng_no.equalsIgnoreCase(name)) {
			return note_mng_no();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($rcv_act_flg.equalsIgnoreCase(name)) {
			return rcv_act_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($note_mng_no.equalsIgnoreCase(name)) {
			note_mng_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($rcv_act_flg.equalsIgnoreCase(name)) {
			rcv_act_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($note_mng_no.equalsIgnoreCase(name)) {
			note_mng_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($rcv_act_flg.equalsIgnoreCase(name)) {
			rcv_act_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

