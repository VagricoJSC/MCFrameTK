package mcframe.clientMSBC.MSBCP1120;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"LossAct_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class LossAct_RsltR_MC_A extends MCConstRow {

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public static final String $inpt_peg_no = "inpt_peg_no";
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
	public static final String $loss_qty_p = "loss_qty_p";
	public static final String $cont_loss_qty_p = "cont_loss_qty_p";
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
	 * Loss result No. ロス実績ＮＯ.<p>
	 *
	 */
	public static final String $loss_act_no = "loss_act_no";
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
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public static final String $cont_fctr_rnd_typ = "cont_fctr_rnd_typ";
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public static final String $cont_fctr_dec_place = "cont_fctr_dec_place";
	public static final String $act_cont_fctr_p = "act_cont_fctr_p";
	public static final String $std_cont_fctr_p = "std_cont_fctr_p";

	public static final String $loss_qty = $loss_qty_p + ".qty";
	public static final String $cont_loss_qty = $cont_loss_qty_p + ".cont_qty";
	public static final String $act_cont_fctr = $act_cont_fctr_p + ".act_cont_fctr";
	public static final String $std_cont_fctr = $std_cont_fctr_p + ".std_cont_fctr";

	public static final MCMeta inpt_peg_no_META = createCommonMeta($inpt_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta loss_rsn_cd_META = createCommonMeta($loss_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta loss_rsn_nm_META = createCommonMeta($loss_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta loss_qty_p_META = createInnerRowMeta($loss_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta cont_loss_qty_p_META = createInnerRowMeta($cont_loss_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta fxd_loss_flg_META = createCommonMeta($fxd_loss_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_disp_flg_META = createCommonMeta($def_disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loss_act_no_META = createCommonMeta($loss_act_no, mcframe.commonMA.meta.MA_META.LOSS_ACT_NO);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.LOSS_ACT_INTR_RMRKS);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.LOSS_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.LOSS_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.LOSS_ACT_SUB_CHAR3);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta act_cont_fctr_p_META = createInnerRowMeta($act_cont_fctr_p, mcframe.clientMAUB.MAUBP5290.ActContFctrR.class);
	public static final MCMeta std_cont_fctr_p_META = createInnerRowMeta($std_cont_fctr_p, mcframe.clientMAUB.MAUBP5280.StdContFctrR.class);

	protected static final ConstMetaList<LossAct_RsltR> constMetas = new ConstMetaList<LossAct_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			inpt_peg_no_META,
			loss_rsn_cd_META,
			loss_rsn_nm_META,
			loss_qty_p_META,
			cont_loss_qty_p_META,
			fxd_loss_flg_META,
			def_disp_flg_META,
			loss_act_no_META,
			intr_rmrks_META,
			trd_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			cont_fctr_flg_META,
			cont_fctr_rnd_typ_META,
			cont_fctr_dec_place_META,
			act_cont_fctr_p_META,
			std_cont_fctr_p_META
		},
		new String[][]{
			{
				"loss_qty",
				"cont_loss_qty",
				"act_cont_fctr",
				"std_cont_fctr"
			},
			{
				$loss_qty,
				$cont_loss_qty,
				$act_cont_fctr,
				$std_cont_fctr
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

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
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
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
	protected LossAct_RsltR_MC_A(ConstMetaList<? extends LossAct_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LossAct_RsltR clone() {
		return (LossAct_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LossAct_RsltR createInstance() {
		return (LossAct_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LossAct_RsltR getValues(String... names) {
		return (LossAct_RsltR) super.getValues(names);
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
	 * Loss reason cd. ロス理由ＣＤ.<p>
	 *
	 */
	public String loss_rsn_cd() {
		return getConstString(offset + 1, $loss_rsn_cd);
	}

	/**
	 * Loss reason cd. ロス理由ＣＤ.<p>
	 *
	 */
	public void loss_rsn_cd(String value) {
		setConstString(offset + 1, $loss_rsn_cd, value);
	}


	/**
	 * Loss reason name ロス理由名.<p>
	 *
	 */
	public String loss_rsn_nm() {
		return getConstString(offset + 2, $loss_rsn_nm);
	}

	/**
	 * Loss reason name ロス理由名.<p>
	 *
	 */
	public void loss_rsn_nm(String value) {
		setConstString(offset + 2, $loss_rsn_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR loss_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 3, $loss_qty_p);
	}
	
	public void loss_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 3, $loss_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR cont_loss_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 4, $cont_loss_qty_p);
	}
	
	public void cont_loss_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 4, $cont_loss_qty_p, row);
	}


	/**
	 * Constant loss 固定ロス.<p>
	 *
	 */
	public boolean fxd_loss_flg() {
		return getConstBoolean(offset + 5, $fxd_loss_flg);
	}

	/**
	 * Constant loss 固定ロス.<p>
	 *
	 */
	public void fxd_loss_flg(boolean value) {
		setConstBoolean(offset + 5, $fxd_loss_flg, value);
	}


	/**
	 * Initial display 初期表示.<p>
	 *
	 */
	public boolean def_disp_flg() {
		return getConstBoolean(offset + 6, $def_disp_flg);
	}

	/**
	 * Initial display 初期表示.<p>
	 *
	 */
	public void def_disp_flg(boolean value) {
		setConstBoolean(offset + 6, $def_disp_flg, value);
	}


	/**
	 * Loss result No. ロス実績ＮＯ.<p>
	 *
	 */
	public String loss_act_no() {
		return getConstString(offset + 7, $loss_act_no);
	}

	/**
	 * Loss result No. ロス実績ＮＯ.<p>
	 *
	 */
	public void loss_act_no(String value) {
		setConstString(offset + 7, $loss_act_no, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 8, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 8, $intr_rmrks, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 9, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 9, $trd_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 10, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 10, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 11, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 11, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 12, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 12, $sub_char3, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 13, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 13, $cont_fctr_flg, value);
	}


	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 14, $cont_fctr_rnd_typ);
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 14, $cont_fctr_rnd_typ, value);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 15, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 15, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 15, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 15, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 15, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 15, $cont_fctr_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5290.ActContFctrR act_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5290.ActContFctrR) getConstInnerRow(offset + 16, $act_cont_fctr_p);
	}
	
	public void act_cont_fctr_p(mcframe.clientMAUB.MAUBP5290.ActContFctrR row){
		setConstInnerRow(offset + 16, $act_cont_fctr_p, row);
	}


	public mcframe.clientMAUB.MAUBP5280.StdContFctrR std_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5280.StdContFctrR) getConstInnerRow(offset + 17, $std_cont_fctr_p);
	}
	
	public void std_cont_fctr_p(mcframe.clientMAUB.MAUBP5280.StdContFctrR row){
		setConstInnerRow(offset + 17, $std_cont_fctr_p, row);
	}


	public String getString(String name) {
		if ($loss_rsn_cd.equalsIgnoreCase(name)) {
			return loss_rsn_cd();
		}
		if ($loss_rsn_nm.equalsIgnoreCase(name)) {
			return loss_rsn_nm();
		}
		if ($loss_act_no.equalsIgnoreCase(name)) {
			return loss_act_no();
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			return inpt_peg_no();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
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
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($loss_rsn_cd.equalsIgnoreCase(name)) {
			return loss_rsn_cd();
		}
		if ($loss_rsn_nm.equalsIgnoreCase(name)) {
			return loss_rsn_nm();
		}
		if ($loss_act_no.equalsIgnoreCase(name)) {
			return loss_act_no();
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			return inpt_peg_no();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
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
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($loss_rsn_cd.equalsIgnoreCase(name)) {
			loss_rsn_cd(value);
			return;
		}
		if ($loss_rsn_nm.equalsIgnoreCase(name)) {
			loss_rsn_nm(value);
			return;
		}
		if ($loss_act_no.equalsIgnoreCase(name)) {
			loss_act_no(value);
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($loss_rsn_cd.equalsIgnoreCase(name)) {
			loss_rsn_cd(value);
			return;
		}
		if ($loss_rsn_nm.equalsIgnoreCase(name)) {
			loss_rsn_nm(value);
			return;
		}
		if ($loss_act_no.equalsIgnoreCase(name)) {
			loss_act_no(value);
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($loss_qty_p.equalsIgnoreCase(name)) {
			return loss_qty_p();
		}
		if ($cont_loss_qty_p.equalsIgnoreCase(name)) {
			return cont_loss_qty_p();
		}
		if ($act_cont_fctr_p.equalsIgnoreCase(name)) {
			return act_cont_fctr_p();
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			return std_cont_fctr_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($loss_qty_p.equalsIgnoreCase(name)) {
			loss_qty_p(
				((MCContainerMeta) loss_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($cont_loss_qty_p.equalsIgnoreCase(name)) {
			cont_loss_qty_p(
				((MCContainerMeta) cont_loss_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($act_cont_fctr_p.equalsIgnoreCase(name)) {
			act_cont_fctr_p(
				((MCContainerMeta) act_cont_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5290.ActContFctrR.class, value)
			);
			return;
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			std_cont_fctr_p(
				((MCContainerMeta) std_cont_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5280.StdContFctrR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public MCNumber loss_qty() {
		return loss_qty_p().qty();
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(MCNumber value) {
		loss_qty_p().qty(value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(int value) {
		loss_qty_p().qty(value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(long value) {
		loss_qty_p().qty(value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(float value) {
		loss_qty_p().qty(value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(double value) {
		loss_qty_p().qty(value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public MCNumber cont_loss_qty() {
		return cont_loss_qty_p().cont_qty();
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(MCNumber value) {
		cont_loss_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(int value) {
		cont_loss_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(long value) {
		cont_loss_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(float value) {
		cont_loss_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(double value) {
		cont_loss_qty_p().cont_qty(value);
	}

	public MCNumber act_cont_fctr() {
		return act_cont_fctr_p().act_cont_fctr();
	}

	public void act_cont_fctr(MCNumber value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	public void act_cont_fctr(int value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	public void act_cont_fctr(long value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	public void act_cont_fctr(float value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	public void act_cont_fctr(double value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	public MCNumber std_cont_fctr() {
		return std_cont_fctr_p().std_cont_fctr();
	}

	public void std_cont_fctr(MCNumber value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(int value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(long value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(float value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(double value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

}

