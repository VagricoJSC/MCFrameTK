package mcframe.serverMBBE.MBBEL5010;

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
 * ブロック"IfDataImp_Upd01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class IfDataImp_Upd01_CndR_MC_A extends MCConstRow {

	/**
	 * Process unit aggregation 処理単位まとめ.<p>
	 *
	 */
	public static final String $exe_unit_lump_flg = "exe_unit_lump_flg";
	/**
	 * IF update type ＩＦ更新区分.<p>
	 *
	 */
	public static final String $if_upd_typ = "if_upd_typ";
	/**
	 * Caller results import batch 呼出元実績一括受信バッチ.<p>
	 *
	 */
	public static final String $src_actlumprecv_flg = "src_actlumprecv_flg";
	/**
	 * Not update BF ＢＦ更新しない.<p>
	 *
	 */
	public static final String $not_bkf_upd_flg = "not_bkf_upd_flg";


	public static final MCMeta exe_unit_lump_flg_META = createCommonMeta($exe_unit_lump_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta if_upd_typ_META = createCommonMeta($if_upd_typ, mcframe.commonMA.meta.MA_META.IF_UPD_TYP);
	public static final MCMeta src_actlumprecv_flg_META = createCommonMeta($src_actlumprecv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_bkf_upd_flg_META = createCommonMeta($not_bkf_upd_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<IfDataImp_Upd01_CndR> constMetas = new ConstMetaList<IfDataImp_Upd01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			exe_unit_lump_flg_META,
			if_upd_typ_META,
			src_actlumprecv_flg_META,
			not_bkf_upd_flg_META
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
	protected IfDataImp_Upd01_CndR_MC_A(ConstMetaList<? extends IfDataImp_Upd01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IfDataImp_Upd01_CndR clone() {
		return (IfDataImp_Upd01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IfDataImp_Upd01_CndR createInstance() {
		return (IfDataImp_Upd01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IfDataImp_Upd01_CndR getValues(String... names) {
		return (IfDataImp_Upd01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Process unit aggregation 処理単位まとめ.<p>
	 *
	 */
	public boolean exe_unit_lump_flg() {
		return getConstBoolean(offset + 0, $exe_unit_lump_flg);
	}

	/**
	 * Process unit aggregation 処理単位まとめ.<p>
	 *
	 */
	public void exe_unit_lump_flg(boolean value) {
		setConstBoolean(offset + 0, $exe_unit_lump_flg, value);
	}


	/**
	 * IF update type ＩＦ更新区分.<p>
	 *
	 */
	public String if_upd_typ() {
		return getConstString(offset + 1, $if_upd_typ);
	}

	/**
	 * IF update type ＩＦ更新区分.<p>
	 *
	 */
	public void if_upd_typ(String value) {
		setConstString(offset + 1, $if_upd_typ, value);
	}


	/**
	 * Caller results import batch 呼出元実績一括受信バッチ.<p>
	 *
	 */
	public boolean src_actlumprecv_flg() {
		return getConstBoolean(offset + 2, $src_actlumprecv_flg);
	}

	/**
	 * Caller results import batch 呼出元実績一括受信バッチ.<p>
	 *
	 */
	public void src_actlumprecv_flg(boolean value) {
		setConstBoolean(offset + 2, $src_actlumprecv_flg, value);
	}


	/**
	 * Not update BF ＢＦ更新しない.<p>
	 *
	 */
	public boolean not_bkf_upd_flg() {
		return getConstBoolean(offset + 3, $not_bkf_upd_flg);
	}

	/**
	 * Not update BF ＢＦ更新しない.<p>
	 *
	 */
	public void not_bkf_upd_flg(boolean value) {
		setConstBoolean(offset + 3, $not_bkf_upd_flg, value);
	}


	public String getString(String name) {
		if ($if_upd_typ.equalsIgnoreCase(name)) {
			return if_upd_typ();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($exe_unit_lump_flg.equalsIgnoreCase(name)) {
			return exe_unit_lump_flg();
		}
		if ($src_actlumprecv_flg.equalsIgnoreCase(name)) {
			return src_actlumprecv_flg();
		}
		if ($not_bkf_upd_flg.equalsIgnoreCase(name)) {
			return not_bkf_upd_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($if_upd_typ.equalsIgnoreCase(name)) {
			return if_upd_typ();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($exe_unit_lump_flg.equalsIgnoreCase(name)) {
			return exe_unit_lump_flg();
		}
		if ($src_actlumprecv_flg.equalsIgnoreCase(name)) {
			return src_actlumprecv_flg();
		}
		if ($not_bkf_upd_flg.equalsIgnoreCase(name)) {
			return not_bkf_upd_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($if_upd_typ.equalsIgnoreCase(name)) {
			if_upd_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($exe_unit_lump_flg.equalsIgnoreCase(name)) {
			exe_unit_lump_flg(value);
			return;
		}
		if ($src_actlumprecv_flg.equalsIgnoreCase(name)) {
			src_actlumprecv_flg(value);
			return;
		}
		if ($not_bkf_upd_flg.equalsIgnoreCase(name)) {
			not_bkf_upd_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($if_upd_typ.equalsIgnoreCase(name)) {
			if_upd_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($exe_unit_lump_flg.equalsIgnoreCase(name)) {
			exe_unit_lump_flg(value);
			return;
		}
		if ($src_actlumprecv_flg.equalsIgnoreCase(name)) {
			src_actlumprecv_flg(value);
			return;
		}
		if ($not_bkf_upd_flg.equalsIgnoreCase(name)) {
			not_bkf_upd_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

