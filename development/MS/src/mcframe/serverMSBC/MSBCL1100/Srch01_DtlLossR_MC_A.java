package mcframe.serverMSBC.MSBCL1100;

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
 * ブロック"Srch01_DtlLoss"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_DtlLossR_MC_A extends MCConstRow {

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public static final String $inpt_peg_no = "inpt_peg_no";
	/**
	 * Constant loss 固定ロス.<p>
	 *
	 */
	public static final String $fxd_loss_flg = "fxd_loss_flg";
	/**
	 * Initial display 初期表示.<p>
	 *
	 */
	public static final String $def_disp_flg = "def_disp_flg";
	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public static final String $inpt_schd_no = "inpt_schd_no";
	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public static final String $inpt_act_no = "inpt_act_no";
	/**
	 * Loss result No. ロス実績ＮＯ.<p>
	 *
	 */
	public static final String $loss_act_no = "loss_act_no";
	/**
	 * Loss reason cd. ロス理由ＣＤ.<p>
	 *
	 */
	public static final String $loss_rsn_cd = "loss_rsn_cd";
	/**
	 * Loss reason name ロス理由名.<p>
	 *
	 */
	public static final String $loss_rsn_nm = "loss_rsn_nm";
	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public static final String $loss_qty = "loss_qty";
	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public static final String $cont_loss_qty = "cont_loss_qty";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";


	public static final MCMeta inpt_peg_no_META = createCommonMeta($inpt_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta fxd_loss_flg_META = createCommonMeta($fxd_loss_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_disp_flg_META = createCommonMeta($def_disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_schd_no_META = createCommonMeta($inpt_schd_no, mcframe.commonMA.meta.MA_META.INPT_SCHD_NO);
	public static final MCMeta inpt_act_no_META = createCommonMeta($inpt_act_no, mcframe.commonMA.meta.MA_META.INPT_ACT_NO);
	public static final MCMeta loss_act_no_META = createCommonMeta($loss_act_no, mcframe.commonMA.meta.MA_META.LOSS_ACT_NO);
	public static final MCMeta loss_rsn_cd_META = createCommonMeta($loss_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta loss_rsn_nm_META = createCommonMeta($loss_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta loss_qty_META = createCommonMeta($loss_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cont_loss_qty_META = createCommonMeta($cont_loss_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.LOSS_ACT_INTR_RMRKS);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.LOSS_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.LOSS_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.LOSS_ACT_SUB_CHAR3);

	protected static final ConstMetaList<Srch01_DtlLossR> constMetas = new ConstMetaList<Srch01_DtlLossR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			inpt_peg_no_META,
			fxd_loss_flg_META,
			def_disp_flg_META,
			inpt_schd_no_META,
			inpt_act_no_META,
			loss_act_no_META,
			loss_rsn_cd_META,
			loss_rsn_nm_META,
			loss_qty_META,
			cont_loss_qty_META,
			intr_rmrks_META,
			trd_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
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
	protected Srch01_DtlLossR_MC_A(ConstMetaList<? extends Srch01_DtlLossR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlLossR clone() {
		return (Srch01_DtlLossR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlLossR createInstance() {
		return (Srch01_DtlLossR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlLossR getValues(String... names) {
		return (Srch01_DtlLossR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public MCNumber inpt_peg_no() {
		return getConstNumber(offset + 0, $inpt_peg_no);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void inpt_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $inpt_peg_no, value);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void inpt_peg_no(int value) {
		setConstNumber(offset + 0, $inpt_peg_no, value);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void inpt_peg_no(long value) {
		setConstNumber(offset + 0, $inpt_peg_no, value);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void inpt_peg_no(float value) {
		setConstNumber(offset + 0, $inpt_peg_no, value);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void inpt_peg_no(double value) {
		setConstNumber(offset + 0, $inpt_peg_no, value);
	}


	/**
	 * Constant loss 固定ロス.<p>
	 *
	 */
	public boolean fxd_loss_flg() {
		return getConstBoolean(offset + 1, $fxd_loss_flg);
	}

	/**
	 * Constant loss 固定ロス.<p>
	 *
	 */
	public void fxd_loss_flg(boolean value) {
		setConstBoolean(offset + 1, $fxd_loss_flg, value);
	}


	/**
	 * Initial display 初期表示.<p>
	 *
	 */
	public boolean def_disp_flg() {
		return getConstBoolean(offset + 2, $def_disp_flg);
	}

	/**
	 * Initial display 初期表示.<p>
	 *
	 */
	public void def_disp_flg(boolean value) {
		setConstBoolean(offset + 2, $def_disp_flg, value);
	}


	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public String inpt_schd_no() {
		return getConstString(offset + 3, $inpt_schd_no);
	}

	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public void inpt_schd_no(String value) {
		setConstString(offset + 3, $inpt_schd_no, value);
	}


	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public String inpt_act_no() {
		return getConstString(offset + 4, $inpt_act_no);
	}

	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public void inpt_act_no(String value) {
		setConstString(offset + 4, $inpt_act_no, value);
	}


	/**
	 * Loss result No. ロス実績ＮＯ.<p>
	 *
	 */
	public String loss_act_no() {
		return getConstString(offset + 5, $loss_act_no);
	}

	/**
	 * Loss result No. ロス実績ＮＯ.<p>
	 *
	 */
	public void loss_act_no(String value) {
		setConstString(offset + 5, $loss_act_no, value);
	}


	/**
	 * Loss reason cd. ロス理由ＣＤ.<p>
	 *
	 */
	public String loss_rsn_cd() {
		return getConstString(offset + 6, $loss_rsn_cd);
	}

	/**
	 * Loss reason cd. ロス理由ＣＤ.<p>
	 *
	 */
	public void loss_rsn_cd(String value) {
		setConstString(offset + 6, $loss_rsn_cd, value);
	}


	/**
	 * Loss reason name ロス理由名.<p>
	 *
	 */
	public String loss_rsn_nm() {
		return getConstString(offset + 7, $loss_rsn_nm);
	}

	/**
	 * Loss reason name ロス理由名.<p>
	 *
	 */
	public void loss_rsn_nm(String value) {
		setConstString(offset + 7, $loss_rsn_nm, value);
	}


	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public MCNumber loss_qty() {
		return getConstNumber(offset + 8, $loss_qty);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(MCNumber value) {
		setConstNumber(offset + 8, $loss_qty, value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(int value) {
		setConstNumber(offset + 8, $loss_qty, value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(long value) {
		setConstNumber(offset + 8, $loss_qty, value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(float value) {
		setConstNumber(offset + 8, $loss_qty, value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(double value) {
		setConstNumber(offset + 8, $loss_qty, value);
	}


	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public MCNumber cont_loss_qty() {
		return getConstNumber(offset + 9, $cont_loss_qty);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(MCNumber value) {
		setConstNumber(offset + 9, $cont_loss_qty, value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(int value) {
		setConstNumber(offset + 9, $cont_loss_qty, value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(long value) {
		setConstNumber(offset + 9, $cont_loss_qty, value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(float value) {
		setConstNumber(offset + 9, $cont_loss_qty, value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(double value) {
		setConstNumber(offset + 9, $cont_loss_qty, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 10, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 10, $intr_rmrks, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 11, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 11, $trd_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 12, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 12, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 13, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 13, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 14, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 14, $sub_char3, value);
	}


	public String getString(String name) {
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			return inpt_act_no();
		}
		if ($loss_act_no.equalsIgnoreCase(name)) {
			return loss_act_no();
		}
		if ($loss_rsn_cd.equalsIgnoreCase(name)) {
			return loss_rsn_cd();
		}
		if ($loss_rsn_nm.equalsIgnoreCase(name)) {
			return loss_rsn_nm();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			return inpt_peg_no();
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			return loss_qty();
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			return cont_loss_qty();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($fxd_loss_flg.equalsIgnoreCase(name)) {
			return fxd_loss_flg();
		}
		if ($def_disp_flg.equalsIgnoreCase(name)) {
			return def_disp_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			return inpt_act_no();
		}
		if ($loss_act_no.equalsIgnoreCase(name)) {
			return loss_act_no();
		}
		if ($loss_rsn_cd.equalsIgnoreCase(name)) {
			return loss_rsn_cd();
		}
		if ($loss_rsn_nm.equalsIgnoreCase(name)) {
			return loss_rsn_nm();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			return inpt_peg_no();
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			return loss_qty();
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			return cont_loss_qty();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($fxd_loss_flg.equalsIgnoreCase(name)) {
			return fxd_loss_flg();
		}
		if ($def_disp_flg.equalsIgnoreCase(name)) {
			return def_disp_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
			return;
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			inpt_act_no(value);
			return;
		}
		if ($loss_act_no.equalsIgnoreCase(name)) {
			loss_act_no(value);
			return;
		}
		if ($loss_rsn_cd.equalsIgnoreCase(name)) {
			loss_rsn_cd(value);
			return;
		}
		if ($loss_rsn_nm.equalsIgnoreCase(name)) {
			loss_rsn_nm(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($fxd_loss_flg.equalsIgnoreCase(name)) {
			fxd_loss_flg(value);
			return;
		}
		if ($def_disp_flg.equalsIgnoreCase(name)) {
			def_disp_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
			return;
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			inpt_act_no(value);
			return;
		}
		if ($loss_act_no.equalsIgnoreCase(name)) {
			loss_act_no(value);
			return;
		}
		if ($loss_rsn_cd.equalsIgnoreCase(name)) {
			loss_rsn_cd(value);
			return;
		}
		if ($loss_rsn_nm.equalsIgnoreCase(name)) {
			loss_rsn_nm(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($fxd_loss_flg.equalsIgnoreCase(name)) {
			fxd_loss_flg(value);
			return;
		}
		if ($def_disp_flg.equalsIgnoreCase(name)) {
			def_disp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

