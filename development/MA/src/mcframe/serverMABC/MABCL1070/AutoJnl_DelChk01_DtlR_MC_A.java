package mcframe.serverMABC.MABCL1070;

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
 * ブロック"AutoJnl_DelChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class AutoJnl_DelChk01_DtlR_MC_A extends MCConstRow {

	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public static final String $ac_slip_typ = "ac_slip_typ";
	/**
	 * Auto-journal key cd. 自動仕訳キーＣＤ.<p>
	 *
	 */
	public static final String $auto_jnl_key_cd = "auto_jnl_key_cd";
	/**
	 * Auto-journal group 自動仕訳グループ.<p>
	 *
	 */
	public static final String $auto_jnl_grp = "auto_jnl_grp";
	/**
	 * Journal pattern cd. 仕訳パタンＣＤ.<p>
	 *
	 */
	public static final String $jnl_ptn_cd = "jnl_ptn_cd";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";


	public static final MCMeta ac_slip_typ_META = createCommonMeta($ac_slip_typ, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP);
	public static final MCMeta auto_jnl_key_cd_META = createCommonMeta($auto_jnl_key_cd, mcframe.commonMA.meta.MA_META.AUTO_JNL_KEY_CD);
	public static final MCMeta auto_jnl_grp_META = createCommonMeta($auto_jnl_grp, mcframe.commonMA.meta.MA_META.AUTO_JNL_GRP);
	public static final MCMeta jnl_ptn_cd_META = createCommonMeta($jnl_ptn_cd, mcframe.commonMA.meta.MA_META.JNL_PTN_CD);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<AutoJnl_DelChk01_DtlR> constMetas = new ConstMetaList<AutoJnl_DelChk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ac_slip_typ_META,
			auto_jnl_key_cd_META,
			auto_jnl_grp_META,
			jnl_ptn_cd_META,
			upd_cntr_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$ac_slip_typ, "E"},	// ac_slip_typ
				{$auto_jnl_grp, "E"},	// auto_jnl_grp
				{$jnl_ptn_cd, "E"}	// jnl_ptn_cd
			}
		))
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
	protected AutoJnl_DelChk01_DtlR_MC_A(ConstMetaList<? extends AutoJnl_DelChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AutoJnl_DelChk01_DtlR clone() {
		return (AutoJnl_DelChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AutoJnl_DelChk01_DtlR createInstance() {
		return (AutoJnl_DelChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AutoJnl_DelChk01_DtlR getValues(String... names) {
		return (AutoJnl_DelChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public String ac_slip_typ() {
		return getConstString(offset + 0, $ac_slip_typ);
	}

	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public void ac_slip_typ(String value) {
		setConstString(offset + 0, $ac_slip_typ, value);
	}


	/**
	 * Auto-journal key cd. 自動仕訳キーＣＤ.<p>
	 *
	 */
	public String auto_jnl_key_cd() {
		return getConstString(offset + 1, $auto_jnl_key_cd);
	}

	/**
	 * Auto-journal key cd. 自動仕訳キーＣＤ.<p>
	 *
	 */
	public void auto_jnl_key_cd(String value) {
		setConstString(offset + 1, $auto_jnl_key_cd, value);
	}


	/**
	 * Auto-journal group 自動仕訳グループ.<p>
	 *
	 */
	public String auto_jnl_grp() {
		return getConstString(offset + 2, $auto_jnl_grp);
	}

	/**
	 * Auto-journal group 自動仕訳グループ.<p>
	 *
	 */
	public void auto_jnl_grp(String value) {
		setConstString(offset + 2, $auto_jnl_grp, value);
	}


	/**
	 * Journal pattern cd. 仕訳パタンＣＤ.<p>
	 *
	 */
	public String jnl_ptn_cd() {
		return getConstString(offset + 3, $jnl_ptn_cd);
	}

	/**
	 * Journal pattern cd. 仕訳パタンＣＤ.<p>
	 *
	 */
	public void jnl_ptn_cd(String value) {
		setConstString(offset + 3, $jnl_ptn_cd, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 4, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 4, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 4, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 4, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 4, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 4, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($auto_jnl_key_cd.equalsIgnoreCase(name)) {
			return auto_jnl_key_cd();
		}
		if ($auto_jnl_grp.equalsIgnoreCase(name)) {
			return auto_jnl_grp();
		}
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			return jnl_ptn_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($auto_jnl_key_cd.equalsIgnoreCase(name)) {
			return auto_jnl_key_cd();
		}
		if ($auto_jnl_grp.equalsIgnoreCase(name)) {
			return auto_jnl_grp();
		}
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			return jnl_ptn_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($auto_jnl_key_cd.equalsIgnoreCase(name)) {
			auto_jnl_key_cd(value);
			return;
		}
		if ($auto_jnl_grp.equalsIgnoreCase(name)) {
			auto_jnl_grp(value);
			return;
		}
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			jnl_ptn_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($auto_jnl_key_cd.equalsIgnoreCase(name)) {
			auto_jnl_key_cd(value);
			return;
		}
		if ($auto_jnl_grp.equalsIgnoreCase(name)) {
			auto_jnl_grp(value);
			return;
		}
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			jnl_ptn_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

