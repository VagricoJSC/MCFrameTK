package mcframe.serverMSBC.MSBCL6080;

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
 * ブロック"MfgActIF_Del02_Ctrl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgActIF_Del02_CtrlR_MC_A extends MCConstRow {

	/**
	 * IF update type ＩＦ更新区分.<p>
	 *
	 */
	public static final String $if_upd_typ = "if_upd_typ";
	/**
	 * Check for update counter 更新カウンタチェック.<p>
	 *
	 */
	public static final String $upd_cntr_chk_flg = "upd_cntr_chk_flg";
	/**
	 * Caller batch process 呼出元バッチ処理.<p>
	 *
	 */
	public static final String $is_src_batch_flg = "is_src_batch_flg";
	/**
	 * Do not commit コミットしない.<p>
	 *
	 */
	public static final String $not_commit_flg = "not_commit_flg";


	public static final MCMeta if_upd_typ_META = createCommonMeta($if_upd_typ, mcframe.commonMA.meta.MA_META.IF_UPD_TYP);
	public static final MCMeta upd_cntr_chk_flg_META = createCommonMeta($upd_cntr_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_src_batch_flg_META = createCommonMeta($is_src_batch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_commit_flg_META = createCommonMeta($not_commit_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<MfgActIF_Del02_CtrlR> constMetas = new ConstMetaList<MfgActIF_Del02_CtrlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			if_upd_typ_META,
			upd_cntr_chk_flg_META,
			is_src_batch_flg_META,
			not_commit_flg_META
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
	protected MfgActIF_Del02_CtrlR_MC_A(ConstMetaList<? extends MfgActIF_Del02_CtrlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActIF_Del02_CtrlR clone() {
		return (MfgActIF_Del02_CtrlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActIF_Del02_CtrlR createInstance() {
		return (MfgActIF_Del02_CtrlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActIF_Del02_CtrlR getValues(String... names) {
		return (MfgActIF_Del02_CtrlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * IF update type ＩＦ更新区分.<p>
	 *
	 */
	public String if_upd_typ() {
		return getConstString(offset + 0, $if_upd_typ);
	}

	/**
	 * IF update type ＩＦ更新区分.<p>
	 *
	 */
	public void if_upd_typ(String value) {
		setConstString(offset + 0, $if_upd_typ, value);
	}


	/**
	 * Check for update counter 更新カウンタチェック.<p>
	 *
	 */
	public boolean upd_cntr_chk_flg() {
		return getConstBoolean(offset + 1, $upd_cntr_chk_flg);
	}

	/**
	 * Check for update counter 更新カウンタチェック.<p>
	 *
	 */
	public void upd_cntr_chk_flg(boolean value) {
		setConstBoolean(offset + 1, $upd_cntr_chk_flg, value);
	}


	/**
	 * Caller batch process 呼出元バッチ処理.<p>
	 *
	 */
	public boolean is_src_batch_flg() {
		return getConstBoolean(offset + 2, $is_src_batch_flg);
	}

	/**
	 * Caller batch process 呼出元バッチ処理.<p>
	 *
	 */
	public void is_src_batch_flg(boolean value) {
		setConstBoolean(offset + 2, $is_src_batch_flg, value);
	}


	/**
	 * Do not commit コミットしない.<p>
	 *
	 */
	public boolean not_commit_flg() {
		return getConstBoolean(offset + 3, $not_commit_flg);
	}

	/**
	 * Do not commit コミットしない.<p>
	 *
	 */
	public void not_commit_flg(boolean value) {
		setConstBoolean(offset + 3, $not_commit_flg, value);
	}


	public String getString(String name) {
		if ($if_upd_typ.equalsIgnoreCase(name)) {
			return if_upd_typ();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($upd_cntr_chk_flg.equalsIgnoreCase(name)) {
			return upd_cntr_chk_flg();
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			return is_src_batch_flg();
		}
		if ($not_commit_flg.equalsIgnoreCase(name)) {
			return not_commit_flg();
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
		if ($upd_cntr_chk_flg.equalsIgnoreCase(name)) {
			return upd_cntr_chk_flg();
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			return is_src_batch_flg();
		}
		if ($not_commit_flg.equalsIgnoreCase(name)) {
			return not_commit_flg();
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
		if ($upd_cntr_chk_flg.equalsIgnoreCase(name)) {
			upd_cntr_chk_flg(value);
			return;
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			is_src_batch_flg(value);
			return;
		}
		if ($not_commit_flg.equalsIgnoreCase(name)) {
			not_commit_flg(value);
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
		if ($upd_cntr_chk_flg.equalsIgnoreCase(name)) {
			upd_cntr_chk_flg(value);
			return;
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			is_src_batch_flg(value);
			return;
		}
		if ($not_commit_flg.equalsIgnoreCase(name)) {
			not_commit_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

