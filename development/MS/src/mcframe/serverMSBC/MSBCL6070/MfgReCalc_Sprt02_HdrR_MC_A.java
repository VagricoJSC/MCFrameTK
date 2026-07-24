package mcframe.serverMSBC.MSBCL6070;

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
 * ブロック"MfgReCalc_Sprt02_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgReCalc_Sprt02_HdrR_MC_A extends MCConstRow {

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public static final String $div_seq = "div_seq";
	/**
	 * Auto-create at receipt/purchase 入荷・仕入時自動作成.<p>
	 *
	 */
	public static final String $arr_purc_auto_reg_flg = "arr_purc_auto_reg_flg";
	/**
	 * Operation unit result 工程単位実績.<p>
	 *
	 */
	public static final String $oper_unit_flg = "oper_unit_flg";
	public static final String $base_unit_st_act_qty = "base_unit_st_act_qty";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta arr_purc_auto_reg_flg_META = createCommonMeta($arr_purc_auto_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_unit_flg_META = createCommonMeta($oper_unit_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_st_act_qty_META = createCommonMeta($base_unit_st_act_qty, mcframe.commonMA.meta.MA_META.QTY);

	protected static final ConstMetaList<MfgReCalc_Sprt02_HdrR> constMetas = new ConstMetaList<MfgReCalc_Sprt02_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			mfg_inst_no_META,
			div_seq_META,
			arr_purc_auto_reg_flg_META,
			oper_unit_flg_META,
			base_unit_st_act_qty_META
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
	protected MfgReCalc_Sprt02_HdrR_MC_A(ConstMetaList<? extends MfgReCalc_Sprt02_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgReCalc_Sprt02_HdrR clone() {
		return (MfgReCalc_Sprt02_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgReCalc_Sprt02_HdrR createInstance() {
		return (MfgReCalc_Sprt02_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgReCalc_Sprt02_HdrR getValues(String... names) {
		return (MfgReCalc_Sprt02_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 1, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 1, $mfg_inst_no, value);
	}


	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumber div_seq() {
		return getConstNumber(offset + 2, $div_seq);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		setConstNumber(offset + 2, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(int value) {
		setConstNumber(offset + 2, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(long value) {
		setConstNumber(offset + 2, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(float value) {
		setConstNumber(offset + 2, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(double value) {
		setConstNumber(offset + 2, $div_seq, value);
	}


	/**
	 * Auto-create at receipt/purchase 入荷・仕入時自動作成.<p>
	 *
	 */
	public boolean arr_purc_auto_reg_flg() {
		return getConstBoolean(offset + 3, $arr_purc_auto_reg_flg);
	}

	/**
	 * Auto-create at receipt/purchase 入荷・仕入時自動作成.<p>
	 *
	 */
	public void arr_purc_auto_reg_flg(boolean value) {
		setConstBoolean(offset + 3, $arr_purc_auto_reg_flg, value);
	}


	/**
	 * Operation unit result 工程単位実績.<p>
	 *
	 */
	public boolean oper_unit_flg() {
		return getConstBoolean(offset + 4, $oper_unit_flg);
	}

	/**
	 * Operation unit result 工程単位実績.<p>
	 *
	 */
	public void oper_unit_flg(boolean value) {
		setConstBoolean(offset + 4, $oper_unit_flg, value);
	}


	public MCNumber base_unit_st_act_qty() {
		return getConstNumber(offset + 5, $base_unit_st_act_qty);
	}

	public void base_unit_st_act_qty(MCNumber value) {
		setConstNumber(offset + 5, $base_unit_st_act_qty, value);
	}

	public void base_unit_st_act_qty(int value) {
		setConstNumber(offset + 5, $base_unit_st_act_qty, value);
	}

	public void base_unit_st_act_qty(long value) {
		setConstNumber(offset + 5, $base_unit_st_act_qty, value);
	}

	public void base_unit_st_act_qty(float value) {
		setConstNumber(offset + 5, $base_unit_st_act_qty, value);
	}

	public void base_unit_st_act_qty(double value) {
		setConstNumber(offset + 5, $base_unit_st_act_qty, value);
	}


	public String getString(String name) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			return base_unit_st_act_qty();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($arr_purc_auto_reg_flg.equalsIgnoreCase(name)) {
			return arr_purc_auto_reg_flg();
		}
		if ($oper_unit_flg.equalsIgnoreCase(name)) {
			return oper_unit_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			return base_unit_st_act_qty();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($arr_purc_auto_reg_flg.equalsIgnoreCase(name)) {
			return arr_purc_auto_reg_flg();
		}
		if ($oper_unit_flg.equalsIgnoreCase(name)) {
			return oper_unit_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($arr_purc_auto_reg_flg.equalsIgnoreCase(name)) {
			arr_purc_auto_reg_flg(value);
			return;
		}
		if ($oper_unit_flg.equalsIgnoreCase(name)) {
			oper_unit_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($arr_purc_auto_reg_flg.equalsIgnoreCase(name)) {
			arr_purc_auto_reg_flg(value);
			return;
		}
		if ($oper_unit_flg.equalsIgnoreCase(name)) {
			oper_unit_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

