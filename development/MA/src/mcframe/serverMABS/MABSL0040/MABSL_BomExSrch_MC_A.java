package mcframe.serverMABS.MABSL0040;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
import mcframe.serverMA.dbc.*;
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MABSL_BomExSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABSL_BomExSrch_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MABS";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MABSL0040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABSL_BomExSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABSL0040_Srch01_INFO;
		this.aSrch01 = ((MABSL_BomExSrch)this).new Srch01();
	}

	public static MABSL_BomExSrch.Srch01 crtSrch01() {
		MABSL_BomExSrch lgc = new MABSL_BomExSrch();
		lgc.initSrch01();
		return lgc.aSrch01;
	}

	protected void paramSrch01(MCParam p) {
		if (this.aSrch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch01.up0());
		p.addDownBlock(aSrch01.down0());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0040.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABS.MABSL0040.Srch01_CndR.create();
	}

	/**
	 * Srch01_Rslt0ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0040.Srch01_Rslt0R createSrch01_Rslt0R(){
		return mcframe.serverMABS.MABSL0040.Srch01_Rslt0R.create();
	}

	/**
	 * Srch01_Rslt0ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0040.Srch01_Rslt0R> createSrch01_Rslt0L(){
		return MCList.create(mcframe.serverMABS.MABSL0040.Srch01_Rslt0R.class);
	}
	protected MABSL_BomExSrch.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MA_MABSL0040_Srch02_INFO;
		this.aSrch02 = ((MABSL_BomExSrch)this).new Srch02();
	}

	public static MABSL_BomExSrch.Srch02 crtSrch02() {
		MABSL_BomExSrch lgc = new MABSL_BomExSrch();
		lgc.initSrch02();
		return lgc.aSrch02;
	}

	protected void paramSrch02(MCParam p) {
		if (this.aSrch02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch02.up0());
		p.addDownBlock(aSrch02.down0());
		p.addDownBlock(aSrch02.down1());
		p.addDownBlock(aSrch02.down2());
		p.addDownBlock(aSrch02.down3());
		p.addDownBlock(aSrch02.down4());
		p.addDownBlock(aSrch02.down5());
		p.addDownBlock(aSrch02.down6());
	}

	protected void doSrch02() {
		aSrch02.call();
	};

	/**
	 * Srch02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0040.Srch01_CndR createSrch02_CndR(){
		return mcframe.serverMABS.MABSL0040.Srch01_CndR.create();
	}

	/**
	 * Srch02_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0010.Srch01_RsltR createSrch02_Rslt1R(){
		return mcframe.serverMABS.MABSL0010.Srch01_RsltR.create();
	}

	/**
	 * Srch02_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0010.Srch01_RsltR> createSrch02_Rslt1L(){
		return MCList.create(mcframe.serverMABS.MABSL0010.Srch01_RsltR.class);
	}

	/**
	 * Srch02_Rslt2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0090.Srch01_RsltR createSrch02_Rslt2R(){
		return mcframe.serverMABS.MABSL0090.Srch01_RsltR.create();
	}

	/**
	 * Srch02_Rslt2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0090.Srch01_RsltR> createSrch02_Rslt2L(){
		return MCList.create(mcframe.serverMABS.MABSL0090.Srch01_RsltR.class);
	}

	/**
	 * Srch02_Rslt3ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0110.Srch01_RsltR createSrch02_Rslt3R(){
		return mcframe.serverMABS.MABSL0110.Srch01_RsltR.create();
	}

	/**
	 * Srch02_Rslt3ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0110.Srch01_RsltR> createSrch02_Rslt3L(){
		return MCList.create(mcframe.serverMABS.MABSL0110.Srch01_RsltR.class);
	}

	/**
	 * Srch02_Rslt4ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0150.Srch01_RsltR createSrch02_Rslt4R(){
		return mcframe.serverMABS.MABSL0150.Srch01_RsltR.create();
	}

	/**
	 * Srch02_Rslt4ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0150.Srch01_RsltR> createSrch02_Rslt4L(){
		return MCList.create(mcframe.serverMABS.MABSL0150.Srch01_RsltR.class);
	}

	/**
	 * Srch02_Rslt5ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0800.Srch01_RsltR createSrch02_Rslt5R(){
		return mcframe.serverMABS.MABSL0800.Srch01_RsltR.create();
	}

	/**
	 * Srch02_Rslt5ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0800.Srch01_RsltR> createSrch02_Rslt5L(){
		return MCList.create(mcframe.serverMABS.MABSL0800.Srch01_RsltR.class);
	}

	/**
	 * Srch02_Rslt6ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0170.Srch01_RsltR createSrch02_Rslt6R(){
		return mcframe.serverMABS.MABSL0170.Srch01_RsltR.create();
	}

	/**
	 * Srch02_Rslt6ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0170.Srch01_RsltR> createSrch02_Rslt6L(){
		return MCList.create(mcframe.serverMABS.MABSL0170.Srch01_RsltR.class);
	}

	/**
	 * Srch02_Rslt7ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0190.Srch01_Rslt1R createSrch02_Rslt7R(){
		return mcframe.serverMABS.MABSL0190.Srch01_Rslt1R.create();
	}

	/**
	 * Srch02_Rslt7ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0190.Srch01_Rslt1R> createSrch02_Rslt7L(){
		return MCList.create(mcframe.serverMABS.MABSL0190.Srch01_Rslt1R.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 展開情報を検索する<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLSearcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMABS.MABSL0040.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0040.Srch01_Rslt0R> down0;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAW_BOM_EX_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAW_BOM_EX_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAW_BOM_EX_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAW_BOM_EX_R> c0;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAW_BOM_EX_R> c0_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABS.MABSL0040.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABS.MABSL0040.Srch01_Rslt0R.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAW_BOM_EX_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MAW_BOM_EX_R>)c0.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAW_BOM_EX_R&gt;（{@link #c0_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MABSL_BomExSrch)MABSL_BomExSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0040.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABS.MABSL0040.Srch01_CndR.create();
		}

		/**
		 * Srch01_Rslt0ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0040.Srch01_Rslt0R createSrch01_Rslt0R(){
			return mcframe.serverMABS.MABSL0040.Srch01_Rslt0R.create();
		}

		/**
		 * Srch01_Rslt0ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0040.Srch01_Rslt0R> createSrch01_Rslt0L(){
			return MCList.create(mcframe.serverMABS.MABSL0040.Srch01_Rslt0R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>base_dt</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn_flg</td></tr>
		 * 	<tr><td><br></td><td>ph_ex_flg</td></tr>
		 * 	<tr><td><br></td><td>max_hrrchy</td></tr>
		 * 	<tr><td><br></td><td>base_qty</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABS.MABSL0040.Srch01_CndR
		 */
		public mcframe.serverMABS.MABSL0040.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bom_lvl</td></tr>
		 * 	<tr><td><br></td><td>extno</td></tr>
		 * 	<tr><td><br></td><td>par_extno</td></tr>
		 * 	<tr><td><br></td><td>bottom_flg</td></tr>
		 * 	<tr><td><br></td><td>loop_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>ph_flg</td></tr>
		 * 	<tr><td><br></td><td>ph_bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>sno_typ1</td></tr>
		 * 	<tr><td><br></td><td>sno_typ_nm1</td></tr>
		 * 	<tr><td><br></td><td>sno_typ2</td></tr>
		 * 	<tr><td><br></td><td>sno_typ_nm2</td></tr>
		 * 	<tr><td><br></td><td>sno_typ3</td></tr>
		 * 	<tr><td><br></td><td>sno_typ_nm3</td></tr>
		 * 	<tr><td><br></td><td>sno_typ4</td></tr>
		 * 	<tr><td><br></td><td>sno_typ_nm4</td></tr>
		 * 	<tr><td><br></td><td>min_sno1</td></tr>
		 * 	<tr><td><br></td><td>min_sno2</td></tr>
		 * 	<tr><td><br></td><td>min_sno3</td></tr>
		 * 	<tr><td><br></td><td>min_sno4</td></tr>
		 * 	<tr><td><br></td><td>max_sno1</td></tr>
		 * 	<tr><td><br></td><td>max_sno2</td></tr>
		 * 	<tr><td><br></td><td>max_sno3</td></tr>
		 * 	<tr><td><br></td><td>max_sno4</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>chd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_dec_place</td></tr>
		 * 	<tr><td><br></td><td>conv_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>conv_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>byprod_flg</td></tr>
		 * 	<tr><td><br></td><td>in_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>in_offst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>in_offst</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>inst_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>main_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_ctl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>chng_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_no_bom</td></tr>
		 * 	<tr><td><br></td><td>not_cost_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0040.Srch01_Rslt0R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_BomExSrch)MABSL_BomExSrch_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(){
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABS.MABSL0040.Srch01_Rslt0R> dest_Srch01_Rslt0, MCList<MAW_BOM_EX_R> src0_0){
			down_SELECT_c0_0(dest_Srch01_Rslt0, src0_0);
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_c0_0() {
			MCRowMapper map = new Map_down_SELECT_c0_0();
			return map;
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_c0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bom_lvl", "bom_lvl");
				addColumnPathMap("bottom_flg", "bottom_flg");
				addColumnPathMap("loop_flg", "loop_flg");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_nm", "itm_typ_nm");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("cont_fctr_flg", "cont_fctr_flg");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_nm", "oper_nm");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("ph_flg", "ph_flg");
				addColumnPathMap("ph_bom_ptn", "ph_bom_ptn");
				addColumnPathMap("alt_itm_flg", "alt_itm_flg");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("alt_grp_nm", "alt_grp_nm");
				addColumnPathMap("alt_itm_typ", "alt_itm_typ");
				addColumnPathMap("alt_itm_ratio", "alt_itm_ratio");
				addColumnPathMap("alt_alloc_prio", "alt_alloc_prio");
				addColumnPathMap("sno_typ1", "sno_typ1");
				addColumnPathMap("sno_typ2", "sno_typ2");
				addColumnPathMap("sno_typ3", "sno_typ3");
				addColumnPathMap("sno_typ4", "sno_typ4");
				addColumnPathMap("min_sno1", "min_sno1");
				addColumnPathMap("min_sno2", "min_sno2");
				addColumnPathMap("min_sno3", "min_sno3");
				addColumnPathMap("min_sno4", "min_sno4");
				addColumnPathMap("max_sno1", "max_sno1");
				addColumnPathMap("max_sno2", "max_sno2");
				addColumnPathMap("max_sno3", "max_sno3");
				addColumnPathMap("max_sno4", "max_sno4");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("chd_unit_cd", "chd_unit_cd");
				addColumnPathMap("chd_unit_nm", "chd_unit_nm");
				addColumnPathMap("chd_dec_place", "chd_dec_place");
				addColumnPathMap("par_inst_qty", "par_inst_qty");
				addColumnPathMap("chd_rqmt_qty", "chd_rqmt_qty");
				addColumnPathMap("chd_inpt_qty", "chd_inpt_qty");
				addColumnPathMap("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty");
				addColumnPathMap("byprod_flg", "byprod_flg");
				addColumnPathMap("in_offst_typ", "in_offst_typ");
				addColumnPathMap("in_offst", "in_offst");
				addColumnPathMap("bkf_typ", "bkf_typ");
				addColumnPathMap("inst_lot_fix_flg", "inst_lot_fix_flg");
				addColumnPathMap("lot_mix_flg", "lot_mix_flg");
				addColumnPathMap("sublot_mix_flg", "sublot_mix_flg");
				addColumnPathMap("alloc_ctl_typ", "alloc_ctl_typ");
				addColumnPathMap("main_itm_flg", "main_itm_flg");
				addColumnPathMap("yield_calc_flg", "yield_calc_flg");
				addColumnPathMap("inpt_ctl_typ", "inpt_ctl_typ");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("chng_no", "chng_no");
				addColumnPathMap("ext_sys_no_bom", "ext_sys_no_bom");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
			}
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_c0_0(mcframe.serverMABS.MABSL0040.Srch01_Rslt0R r_dest, MAW_BOM_EX_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABS.MABSL0040.Srch01_Rslt0R> dest, MCList<MAW_BOM_EX_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAW_BOM_EX_R r_src : src){
				mcframe.serverMABS.MABSL0040.Srch01_Rslt0R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 品目の詳細情報を検索する<br>
	 */
	abstract public class Srch02 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLSearcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMABS.MABSL0040.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0010.Srch01_RsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0090.Srch01_RsltR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0110.Srch01_RsltR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0150.Srch01_RsltR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0800.Srch01_RsltR> down4;
		/** このオペレーションからの下り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0170.Srch01_RsltR> down5;
		/** このオペレーションからの下り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0190.Srch01_Rslt1R> down6;
		
		/**
		 * 連携情報 SELECT_SUB1<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0010.MABSL_ItmDtlReg.Srch01 （{@link #c1}）<br>
		 */
		public final String SELECT_SUB1 = "SELECT_SUB1";

		/**
		 * 連携オペレーション c1<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0010.MABSL_ItmDtlReg.Srch01}<br>
		 * 第1 上りブロッククラス mcframe.serverMABS.MABSL0010.Srch01_CndR （{@link #c1_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0010.Srch01_RsltR&gt; （{@link #c1_down0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0010.MABSL_ItmDtlReg.Srch01 c1;
		// 連携ロジック上り
		public final mcframe.serverMABS.MABSL0010.Srch01_CndR c1_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMABS.MABSL0010.Srch01_RsltR> c1_down0;
		/**
		 * 連携情報 SELECT_SUB2<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0090.MABSL_ItmOperReg.Srch01 （{@link #c2}）<br>
		 */
		public final String SELECT_SUB2 = "SELECT_SUB2";

		/**
		 * 連携オペレーション c2<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0090.MABSL_ItmOperReg.Srch01}<br>
		 * 第1 上りブロッククラス mcframe.serverMABS.MABSL0090.Srch01_CndR （{@link #c2_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0090.Srch01_RsltR&gt; （{@link #c2_down0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0090.MABSL_ItmOperReg.Srch01 c2;
		// 連携ロジック上り
		public final mcframe.serverMABS.MABSL0090.Srch01_CndR c2_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMABS.MABSL0090.Srch01_RsltR> c2_down0;
		/**
		 * 連携情報 SELECT_SUB3<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0110.MABSL_OperWkCostReg.Srch01 （{@link #c3}）<br>
		 */
		public final String SELECT_SUB3 = "SELECT_SUB3";

		/**
		 * 連携オペレーション c3<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0110.MABSL_OperWkCostReg.Srch01}<br>
		 * 第1 上りブロッククラス mcframe.serverMABS.MABSL0110.Srch01_CndR （{@link #c3_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0110.Srch01_RsltR&gt; （{@link #c3_down0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0110.MABSL_OperWkCostReg.Srch01 c3;
		// 連携ロジック上り
		public final mcframe.serverMABS.MABSL0110.Srch01_CndR c3_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMABS.MABSL0110.Srch01_RsltR> c3_down0;
		/**
		 * 連携情報 SELECT_SUB4<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0150.MABSL_ItmStrgReg.Srch01 （{@link #c4}）<br>
		 */
		public final String SELECT_SUB4 = "SELECT_SUB4";

		/**
		 * 連携オペレーション c4<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0150.MABSL_ItmStrgReg.Srch01}<br>
		 * 第1 上りブロッククラス mcframe.serverMABS.MABSL0150.Srch01_CndR （{@link #c4_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0150.Srch01_RsltR&gt; （{@link #c4_down0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0150.MABSL_ItmStrgReg.Srch01 c4;
		// 連携ロジック上り
		public final mcframe.serverMABS.MABSL0150.Srch01_CndR c4_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMABS.MABSL0150.Srch01_RsltR> c4_down0;
		/**
		 * 連携情報 SELECT_SUB5<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0800.MABSL_StkRplReg.Srch01 （{@link #c5}）<br>
		 */
		public final String SELECT_SUB5 = "SELECT_SUB5";

		/**
		 * 連携オペレーション c5<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0800.MABSL_StkRplReg.Srch01}<br>
		 * 第1 上りブロッククラス mcframe.serverMABS.MABSL0800.Srch01_CndR （{@link #c5_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0800.Srch01_RsltR&gt; （{@link #c5_down0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0800.MABSL_StkRplReg.Srch01 c5;
		// 連携ロジック上り
		public final mcframe.serverMABS.MABSL0800.Srch01_CndR c5_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMABS.MABSL0800.Srch01_RsltR> c5_down0;
		/**
		 * 連携情報 SELECT_SUB6<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0170.MABSL_ItmInspPtnReg.Srch01 （{@link #c6}）<br>
		 */
		public final String SELECT_SUB6 = "SELECT_SUB6";

		/**
		 * 連携オペレーション c6<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0170.MABSL_ItmInspPtnReg.Srch01}<br>
		 * 第1 上りブロッククラス mcframe.serverMABS.MABSL0170.Srch01_CndR （{@link #c6_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0170.Srch01_RsltR&gt; （{@link #c6_down0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0170.MABSL_ItmInspPtnReg.Srch01 c6;
		// 連携ロジック上り
		public final mcframe.serverMABS.MABSL0170.Srch01_CndR c6_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMABS.MABSL0170.Srch01_RsltR> c6_down0;
		/**
		 * 連携情報 SELECT_SUB7<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0190.MABSL_ItmInspReg.Srch01 （{@link #c7}）<br>
		 */
		public final String SELECT_SUB7 = "SELECT_SUB7";

		/**
		 * 連携オペレーション c7<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0190.MABSL_ItmInspReg.Srch01}<br>
		 * 第1 上りブロッククラス mcframe.serverMABS.MABSL0190.Srch01_CndR （{@link #c7_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0190.Srch01_Rslt1R&gt; （{@link #c7_down0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0190.MABSL_ItmInspReg.Srch01 c7;
		// 連携ロジック上り
		public final mcframe.serverMABS.MABSL0190.Srch01_CndR c7_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMABS.MABSL0190.Srch01_Rslt1R> c7_down0;
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABS.MABSL0040.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABS.MABSL0010.Srch01_RsltR.class);
			down1 = MCList.create(mcframe.serverMABS.MABSL0090.Srch01_RsltR.class);
			down2 = MCList.create(mcframe.serverMABS.MABSL0110.Srch01_RsltR.class);
			down3 = MCList.create(mcframe.serverMABS.MABSL0150.Srch01_RsltR.class);
			down4 = MCList.create(mcframe.serverMABS.MABSL0800.Srch01_RsltR.class);
			down5 = MCList.create(mcframe.serverMABS.MABSL0170.Srch01_RsltR.class);
			down6 = MCList.create(mcframe.serverMABS.MABSL0190.Srch01_Rslt1R.class);

			// 連携オペレーションの初期化
			c1 = mcframe.serverMABS.MABSL0010.MABSL_ItmDtlReg.crtSrch01();
			c2 = mcframe.serverMABS.MABSL0090.MABSL_ItmOperReg.crtSrch01();
			c3 = mcframe.serverMABS.MABSL0110.MABSL_OperWkCostReg.crtSrch01();
			c4 = mcframe.serverMABS.MABSL0150.MABSL_ItmStrgReg.crtSrch01();
			c5 = mcframe.serverMABS.MABSL0800.MABSL_StkRplReg.crtSrch01();
			c6 = mcframe.serverMABS.MABSL0170.MABSL_ItmInspPtnReg.crtSrch01();
			c7 = mcframe.serverMABS.MABSL0190.MABSL_ItmInspReg.crtSrch01();
			
			// 連携オペレーションのコンテナ取得
			c1_up0 = (mcframe.serverMABS.MABSL0010.Srch01_CndR)c1.up(0);
			c1_down0 = (MCList<mcframe.serverMABS.MABSL0010.Srch01_RsltR>)c1.down(0);
			c2_up0 = (mcframe.serverMABS.MABSL0090.Srch01_CndR)c2.up(0);
			c2_down0 = (MCList<mcframe.serverMABS.MABSL0090.Srch01_RsltR>)c2.down(0);
			c3_up0 = (mcframe.serverMABS.MABSL0110.Srch01_CndR)c3.up(0);
			c3_down0 = (MCList<mcframe.serverMABS.MABSL0110.Srch01_RsltR>)c3.down(0);
			c4_up0 = (mcframe.serverMABS.MABSL0150.Srch01_CndR)c4.up(0);
			c4_down0 = (MCList<mcframe.serverMABS.MABSL0150.Srch01_RsltR>)c4.down(0);
			c5_up0 = (mcframe.serverMABS.MABSL0800.Srch01_CndR)c5.up(0);
			c5_down0 = (MCList<mcframe.serverMABS.MABSL0800.Srch01_RsltR>)c5.down(0);
			c6_up0 = (mcframe.serverMABS.MABSL0170.Srch01_CndR)c6.up(0);
			c6_down0 = (MCList<mcframe.serverMABS.MABSL0170.Srch01_RsltR>)c6.down(0);
			c7_up0 = (mcframe.serverMABS.MABSL0190.Srch01_CndR)c7.up(0);
			c7_down0 = (MCList<mcframe.serverMABS.MABSL0190.Srch01_Rslt1R>)c7.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT_SUB1, c1);
			appendOpe(SELECT_SUB2, c2);
			appendOpe(SELECT_SUB3, c3);
			appendOpe(SELECT_SUB4, c4);
			appendOpe(SELECT_SUB5, c5);
			appendOpe(SELECT_SUB6, c6);
			appendOpe(SELECT_SUB7, c7);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT_SUB1<br>
		 * up0() => mcframe.serverMABS.MABSL0010.Srch01_CndR （{@link #c1_up0}）<br>
		 * SELECT_SUB2<br>
		 * up0() => mcframe.serverMABS.MABSL0090.Srch01_CndR （{@link #c2_up0}）<br>
		 * SELECT_SUB3<br>
		 * up0() => mcframe.serverMABS.MABSL0110.Srch01_CndR （{@link #c3_up0}）<br>
		 * SELECT_SUB4<br>
		 * up0() => mcframe.serverMABS.MABSL0150.Srch01_CndR （{@link #c4_up0}）<br>
		 * SELECT_SUB5<br>
		 * up0() => mcframe.serverMABS.MABSL0800.Srch01_CndR （{@link #c5_up0}）<br>
		 * SELECT_SUB6<br>
		 * up0() => mcframe.serverMABS.MABSL0170.Srch01_CndR （{@link #c6_up0}）<br>
		 * SELECT_SUB7<br>
		 * up0() => mcframe.serverMABS.MABSL0190.Srch01_CndR （{@link #c7_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT_SUB1)) {
				up_SELECT_SUB1(c1_up0, up0());
			}
			if (key.equals(SELECT_SUB2)) {
				up_SELECT_SUB2(c2_up0, up0());
			}
			if (key.equals(SELECT_SUB3)) {
				up_SELECT_SUB3(c3_up0, up0());
			}
			if (key.equals(SELECT_SUB4)) {
				up_SELECT_SUB4(c4_up0, up0());
			}
			if (key.equals(SELECT_SUB5)) {
				up_SELECT_SUB5(c5_up0, up0());
			}
			if (key.equals(SELECT_SUB6)) {
				up_SELECT_SUB6(c6_up0, up0());
			}
			if (key.equals(SELECT_SUB7)) {
				up_SELECT_SUB7(c7_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT_SUB1<br>
		 * MCList&lt;mcframe.serverMABS.MABSL0010.Srch01_RsltR&gt;（{@link #c1_down0}）=> down0()<br>
		 * SELECT_SUB2<br>
		 * MCList&lt;mcframe.serverMABS.MABSL0090.Srch01_RsltR&gt;（{@link #c2_down0}）=> down1()<br>
		 * SELECT_SUB3<br>
		 * MCList&lt;mcframe.serverMABS.MABSL0110.Srch01_RsltR&gt;（{@link #c3_down0}）=> down2()<br>
		 * SELECT_SUB4<br>
		 * MCList&lt;mcframe.serverMABS.MABSL0150.Srch01_RsltR&gt;（{@link #c4_down0}）=> down3()<br>
		 * SELECT_SUB5<br>
		 * MCList&lt;mcframe.serverMABS.MABSL0800.Srch01_RsltR&gt;（{@link #c5_down0}）=> down4()<br>
		 * SELECT_SUB6<br>
		 * MCList&lt;mcframe.serverMABS.MABSL0170.Srch01_RsltR&gt;（{@link #c6_down0}）=> down5()<br>
		 * SELECT_SUB7<br>
		 * MCList&lt;mcframe.serverMABS.MABSL0190.Srch01_Rslt1R&gt;（{@link #c7_down0}）=> down6()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT_SUB1)) {
				down_SELECT_SUB1(down0(), c1_down0);
			}
			if (key.equals(SELECT_SUB2)) {
				down_SELECT_SUB2(down1(), c2_down0);
			}
			if (key.equals(SELECT_SUB3)) {
				down_SELECT_SUB3(down2(), c3_down0);
			}
			if (key.equals(SELECT_SUB4)) {
				down_SELECT_SUB4(down3(), c4_down0);
			}
			if (key.equals(SELECT_SUB5)) {
				down_SELECT_SUB5(down4(), c5_down0);
			}
			if (key.equals(SELECT_SUB6)) {
				down_SELECT_SUB6(down5(), c6_down0);
			}
			if (key.equals(SELECT_SUB7)) {
				down_SELECT_SUB7(down6(), c7_down0);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			if (i == 3) return down3();
			if (i == 4) return down4();
			if (i == 5) return down5();
			if (i == 6) return down6();
			return null;
		}

		public void exec() {
			clear();
			invoke((MABSL_BomExSrch)MABSL_BomExSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
			down5().clear();
			down6().clear();
		}
		/**
		 * Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0040.Srch01_CndR createSrch02_CndR(){
			return mcframe.serverMABS.MABSL0040.Srch01_CndR.create();
		}

		/**
		 * Srch02_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0010.Srch01_RsltR createSrch02_Rslt1R(){
			return mcframe.serverMABS.MABSL0010.Srch01_RsltR.create();
		}

		/**
		 * Srch02_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0010.Srch01_RsltR> createSrch02_Rslt1L(){
			return MCList.create(mcframe.serverMABS.MABSL0010.Srch01_RsltR.class);
		}

		/**
		 * Srch02_Rslt2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0090.Srch01_RsltR createSrch02_Rslt2R(){
			return mcframe.serverMABS.MABSL0090.Srch01_RsltR.create();
		}

		/**
		 * Srch02_Rslt2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0090.Srch01_RsltR> createSrch02_Rslt2L(){
			return MCList.create(mcframe.serverMABS.MABSL0090.Srch01_RsltR.class);
		}

		/**
		 * Srch02_Rslt3ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0110.Srch01_RsltR createSrch02_Rslt3R(){
			return mcframe.serverMABS.MABSL0110.Srch01_RsltR.create();
		}

		/**
		 * Srch02_Rslt3ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0110.Srch01_RsltR> createSrch02_Rslt3L(){
			return MCList.create(mcframe.serverMABS.MABSL0110.Srch01_RsltR.class);
		}

		/**
		 * Srch02_Rslt4ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0150.Srch01_RsltR createSrch02_Rslt4R(){
			return mcframe.serverMABS.MABSL0150.Srch01_RsltR.create();
		}

		/**
		 * Srch02_Rslt4ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0150.Srch01_RsltR> createSrch02_Rslt4L(){
			return MCList.create(mcframe.serverMABS.MABSL0150.Srch01_RsltR.class);
		}

		/**
		 * Srch02_Rslt5ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0800.Srch01_RsltR createSrch02_Rslt5R(){
			return mcframe.serverMABS.MABSL0800.Srch01_RsltR.create();
		}

		/**
		 * Srch02_Rslt5ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0800.Srch01_RsltR> createSrch02_Rslt5L(){
			return MCList.create(mcframe.serverMABS.MABSL0800.Srch01_RsltR.class);
		}

		/**
		 * Srch02_Rslt6ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0170.Srch01_RsltR createSrch02_Rslt6R(){
			return mcframe.serverMABS.MABSL0170.Srch01_RsltR.create();
		}

		/**
		 * Srch02_Rslt6ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0170.Srch01_RsltR> createSrch02_Rslt6L(){
			return MCList.create(mcframe.serverMABS.MABSL0170.Srch01_RsltR.class);
		}

		/**
		 * Srch02_Rslt7ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0190.Srch01_Rslt1R createSrch02_Rslt7R(){
			return mcframe.serverMABS.MABSL0190.Srch01_Rslt1R.create();
		}

		/**
		 * Srch02_Rslt7ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0190.Srch01_Rslt1R> createSrch02_Rslt7L(){
			return MCList.create(mcframe.serverMABS.MABSL0190.Srch01_Rslt1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>st_dt_to</td></tr>
		 * 	<tr><td><br></td><td>end_dt_fr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABS.MABSL0040.Srch01_CndR
		 */
		public mcframe.serverMABS.MABSL0040.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>rsrc_cd1</td></tr>
		 * 	<tr><td><br></td><td>rsrc_nm1</td></tr>
		 * 	<tr><td><br></td><td>rsrc_unit_nm1</td></tr>
		 * 	<tr><td><br></td><td>rsrc_cd2</td></tr>
		 * 	<tr><td><br></td><td>rsrc_nm2</td></tr>
		 * 	<tr><td><br></td><td>rsrc_unit_nm2</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>mfg_lt</td></tr>
		 * 	<tr><td><br></td><td>mfg_lt_add_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_lt</td></tr>
		 * 	<tr><td><br></td><td>purc_lt_add_qty</td></tr>
		 * 	<tr><td><br></td><td>accpt_insp_lt</td></tr>
		 * 	<tr><td><br></td><td>buf_lt</td></tr>
		 * 	<tr><td><br></td><td>ord_fix_pd</td></tr>
		 * 	<tr><td><br></td><td>sz_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>sz_day_week_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sz_week</td></tr>
		 * 	<tr><td><br></td><td>lot_sz_pd</td></tr>
		 * 	<tr><td><br></td><td>min_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>batch_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>max_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>max_order</td></tr>
		 * 	<tr><td><br></td><td>prio</td></tr>
		 * 	<tr><td><br></td><td>order_ratio</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>lot_issue_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_issue_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bkf_flg</td></tr>
		 * 	<tr><td><br></td><td>ln_stk_flg</td></tr>
		 * 	<tr><td><br></td><td>pre_po_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_rec_issue_flg</td></tr>
		 * 	<tr><td><br></td><td>no_mfg_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_lower_yield</td></tr>
		 * 	<tr><td><br></td><td>itm_std_yield</td></tr>
		 * 	<tr><td><br></td><td>itm_upper_yield</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>po_batch_flg</td></tr>
		 * 	<tr><td><br></td><td>rsrc_std_qty1</td></tr>
		 * 	<tr><td><br></td><td>rsrc_unit_qty1</td></tr>
		 * 	<tr><td><br></td><td>rsrc_std_qty2</td></tr>
		 * 	<tr><td><br></td><td>rsrc_unit_qty2</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>not_mrp_flg</td></tr>
		 * 	<tr><td><br></td><td>cost_ratio</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0010.Srch01_RsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_dec_place</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_lt</td></tr>
		 * 	<tr><td><br></td><td>oper_lt_add_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_offst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_offst</td></tr>
		 * 	<tr><td><br></td><td>oper_offst_add_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_std_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>unit_conv_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_ratio</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_grp</td></tr>
		 * 	<tr><td><br></td><td>oper_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>lmt_fr_dt_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_lower_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_std_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_upper_yield</td></tr>
		 * 	<tr><td><br></td><td>wip_rate</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>not_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0090.Srch01_RsltR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>fxd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_cost</td></tr>
		 * 	<tr><td><br></td><td>base_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_dec_place</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>not_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0110.Srch01_RsltR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>prio</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0150.Srch01_RsltR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>buf_qty</td></tr>
		 * 	<tr><td><br></td><td>rord_stk_qty</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_flg</td></tr>
		 * 	<tr><td><br></td><td>rord_rqst_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_sizing_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_gi_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_gi_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_gi_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_gi_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_gi_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_gi_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0800.Srch01_RsltR> down4() {
			return down4;
		}

		/**
		 * 下り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_mtd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_lt</td></tr>
		 * 	<tr><td><br></td><td>insp_std_no</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>spl_qty</td></tr>
		 * 	<tr><td><br></td><td>std_req_flg</td></tr>
		 * 	<tr><td><br></td><td>std_cnf_req_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0170.Srch01_RsltR> down5() {
			return down5;
		}

		/**
		 * 下り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第6ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>lmt_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>from_site_cd</td></tr>
		 * 	<tr><td><br></td><td>from_site_nm</td></tr>
		 * 	<tr><td><br></td><td>to_site_cd</td></tr>
		 * 	<tr><td><br></td><td>to_site_nm</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>no_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>no_mrkt_judg_flg</td></tr>
		 * 	<tr><td><br></td><td>no_plnt_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>no_insp_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_frm_typ</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_frm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>vld_pd</td></tr>
		 * 	<tr><td><br></td><td>lmt_pd</td></tr>
		 * 	<tr><td><br></td><td>lot_insp_vld_pd</td></tr>
		 * 	<tr><td><br></td><td>calc_pd_typ</td></tr>
		 * 	<tr><td><br></td><td>calc_pd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_insp_lmt_dt_frm_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_insp_lmt_dt_frm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_inst_issue_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_inst_issue_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_offst</td></tr>
		 * 	<tr><td><br></td><td>inst_rslt_issue_flg</td></tr>
		 * 	<tr><td><br></td><td>pre_insp_valid_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0190.Srch01_Rslt1R> down6() {
			return down6;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_BomExSrch)MABSL_BomExSrch_MC_A.this).info;
		}

		//-----------------------SELECT_SUB1専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB1の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB1(mcframe.serverMABS.MABSL0010.Srch01_CndR dest0_0, mcframe.serverMABS.MABSL0040.Srch01_CndR src_Srch02_Cnd){
			up_SELECT_SUB1_c1_0(dest0_0, src_Srch02_Cnd);
		}
		
		/**
		 * 連携処理SELECT_SUB1_c1の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SELECT_SUB1_c1_0() {
			MCRowMapper map = new Map_up_SELECT_SUB1_c1_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB1_c1の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SELECT_SUB1_c1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("nullval_wg_cd", "wg_cd");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("st_dt_to", "st_dt_to");
				addColumnPathMap("end_dt_fr", "end_dt_fr");
			}
		}

		/**
		 * 連携処理SELECT_SUB1_c1の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_SELECT_SUB1_c1_0(mcframe.serverMABS.MABSL0010.Srch01_CndR dest, mcframe.serverMABS.MABSL0040.Srch01_CndR src) {
			createMap_up_SELECT_SUB1_c1_0().copy(dest, src);
		}
		//-----------------------SELECT_SUB2専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB2の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB2(mcframe.serverMABS.MABSL0090.Srch01_CndR dest0_0, mcframe.serverMABS.MABSL0040.Srch01_CndR src_Srch02_Cnd){
			up_SELECT_SUB2_c2_0(dest0_0, src_Srch02_Cnd);
		}
		
		/**
		 * 連携処理SELECT_SUB2_c2の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SELECT_SUB2_c2_0() {
			MCRowMapper map = new Map_up_SELECT_SUB2_c2_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB2_c2の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SELECT_SUB2_c2_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("nullval_wg_cd", "wg_cd");
				addColumnPathMap("st_dt_to", "st_dt_to");
				addColumnPathMap("end_dt_fr", "end_dt_fr");
			}
		}

		/**
		 * 連携処理SELECT_SUB2_c2の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_SELECT_SUB2_c2_0(mcframe.serverMABS.MABSL0090.Srch01_CndR dest, mcframe.serverMABS.MABSL0040.Srch01_CndR src) {
			createMap_up_SELECT_SUB2_c2_0().copy(dest, src);
		}
		//-----------------------SELECT_SUB3専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB3の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB3(mcframe.serverMABS.MABSL0110.Srch01_CndR dest0_0, mcframe.serverMABS.MABSL0040.Srch01_CndR src_Srch02_Cnd){
			up_SELECT_SUB3_c3_0(dest0_0, src_Srch02_Cnd);
		}
		
		/**
		 * 連携処理SELECT_SUB3_c3の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SELECT_SUB3_c3_0() {
			MCRowMapper map = new Map_up_SELECT_SUB3_c3_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB3_c3の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SELECT_SUB3_c3_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("nullval_wg_cd", "wg_cd");
				addColumnPathMap("st_dt_to", "st_dt_to");
				addColumnPathMap("end_dt_fr", "end_dt_fr");
			}
		}

		/**
		 * 連携処理SELECT_SUB3_c3の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_SELECT_SUB3_c3_0(mcframe.serverMABS.MABSL0110.Srch01_CndR dest, mcframe.serverMABS.MABSL0040.Srch01_CndR src) {
			createMap_up_SELECT_SUB3_c3_0().copy(dest, src);
		}
		//-----------------------SELECT_SUB4専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB4の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB4(mcframe.serverMABS.MABSL0150.Srch01_CndR dest0_0, mcframe.serverMABS.MABSL0040.Srch01_CndR src_Srch02_Cnd){
			up_SELECT_SUB4_c4_0(dest0_0, src_Srch02_Cnd);
		}
		
		/**
		 * 連携処理SELECT_SUB4_c4の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SELECT_SUB4_c4_0() {
			MCRowMapper map = new Map_up_SELECT_SUB4_c4_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB4_c4の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SELECT_SUB4_c4_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("wg_cd", "wg_cd");
			}
		}

		/**
		 * 連携処理SELECT_SUB4_c4の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_SELECT_SUB4_c4_0(mcframe.serverMABS.MABSL0150.Srch01_CndR dest, mcframe.serverMABS.MABSL0040.Srch01_CndR src) {
			createMap_up_SELECT_SUB4_c4_0().copy(dest, src);
		}
		//-----------------------SELECT_SUB5専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB5の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB5(mcframe.serverMABS.MABSL0800.Srch01_CndR dest0_0, mcframe.serverMABS.MABSL0040.Srch01_CndR src_Srch02_Cnd){
			up_SELECT_SUB5_c5_0(dest0_0, src_Srch02_Cnd);
		}
		
		/**
		 * 連携処理SELECT_SUB5_c5の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SELECT_SUB5_c5_0() {
			MCRowMapper map = new Map_up_SELECT_SUB5_c5_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB5_c5の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SELECT_SUB5_c5_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("st_dt_to", "st_dt_to");
				addColumnPathMap("end_dt_fr", "end_dt_fr");
			}
		}

		/**
		 * 連携処理SELECT_SUB5_c5の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_SELECT_SUB5_c5_0(mcframe.serverMABS.MABSL0800.Srch01_CndR dest, mcframe.serverMABS.MABSL0040.Srch01_CndR src) {
			createMap_up_SELECT_SUB5_c5_0().copy(dest, src);
		}
		//-----------------------SELECT_SUB6専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB6の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB6(mcframe.serverMABS.MABSL0170.Srch01_CndR dest0_0, mcframe.serverMABS.MABSL0040.Srch01_CndR src_Srch02_Cnd){
			up_SELECT_SUB6_c6_0(dest0_0, src_Srch02_Cnd);
		}
		
		/**
		 * 連携処理SELECT_SUB6_c6の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SELECT_SUB6_c6_0() {
			MCRowMapper map = new Map_up_SELECT_SUB6_c6_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB6_c6の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SELECT_SUB6_c6_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("st_dt_to", "st_dt_to");
				addColumnPathMap("end_dt_fr", "end_dt_fr");
			}
		}

		/**
		 * 連携処理SELECT_SUB6_c6の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_SELECT_SUB6_c6_0(mcframe.serverMABS.MABSL0170.Srch01_CndR dest, mcframe.serverMABS.MABSL0040.Srch01_CndR src) {
			createMap_up_SELECT_SUB6_c6_0().copy(dest, src);
		}
		//-----------------------SELECT_SUB7専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB7の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB7(mcframe.serverMABS.MABSL0190.Srch01_CndR dest0_0, mcframe.serverMABS.MABSL0040.Srch01_CndR src_Srch02_Cnd){
			up_SELECT_SUB7_c7_0(dest0_0, src_Srch02_Cnd);
		}
		
		/**
		 * 連携処理SELECT_SUB7_c7の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SELECT_SUB7_c7_0() {
			MCRowMapper map = new Map_up_SELECT_SUB7_c7_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB7_c7の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SELECT_SUB7_c7_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("st_dt_to", "st_dt_to");
				addColumnPathMap("end_dt_fr", "end_dt_fr");
			}
		}

		/**
		 * 連携処理SELECT_SUB7_c7の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_SELECT_SUB7_c7_0(mcframe.serverMABS.MABSL0190.Srch01_CndR dest, mcframe.serverMABS.MABSL0040.Srch01_CndR src) {
			createMap_up_SELECT_SUB7_c7_0().copy(dest, src);
		}

		//-----------------------SELECT_SUB1専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB1の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB1(MCList<mcframe.serverMABS.MABSL0010.Srch01_RsltR> dest_Srch02_Rslt1, MCList<mcframe.serverMABS.MABSL0010.Srch01_RsltR> src0_0){
			down_SELECT_SUB1_c1_0(dest_Srch02_Rslt1, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB1_c1_0() {
			MCRowMapper map = new Map_down_SELECT_SUB1_c1_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB1_c1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("asset_mng_typ", "asset_mng_typ");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_nm", "itm_typ_nm");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("mfg_loc_cd", "mfg_loc_cd");
				addColumnPathMap("mfg_loc_nm", "mfg_loc_nm");
				addColumnPathMap("site_cd", "site_cd");
				addColumnPathMap("site_nm", "site_nm");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("sppl_nm", "sppl_nm");
				addColumnPathMap("maker_cd", "maker_cd");
				addColumnPathMap("maker_nm", "maker_nm");
				addColumnPathMap("rqst_loc_cd", "rqst_loc_cd");
				addColumnPathMap("rqst_loc_nm", "rqst_loc_nm");
				addColumnPathMap("rqst_loc_wg_cd", "rqst_loc_wg_cd");
				addColumnPathMap("rqst_loc_wg_nm", "rqst_loc_wg_nm");
				addColumnPathMap("loc_sppl_cd", "loc_sppl_cd");
				addColumnPathMap("rsrc_cd1", "rsrc_cd1");
				addColumnPathMap("rsrc_nm1", "rsrc_nm1");
				addColumnPathMap("rsrc_unit_nm1", "rsrc_unit_nm1");
				addColumnPathMap("rsrc_cd2", "rsrc_cd2");
				addColumnPathMap("rsrc_nm2", "rsrc_nm2");
				addColumnPathMap("rsrc_unit_nm2", "rsrc_unit_nm2");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("oper_ptn", "oper_ptn");
				addColumnPathMap("mfg_lt", "mfg_lt");
				addColumnPathMap("mfg_lt_add_qty", "mfg_lt_add_qty");
				addColumnPathMap("purc_lt", "purc_lt");
				addColumnPathMap("purc_lt_add_qty", "purc_lt_add_qty");
				addColumnPathMap("accpt_insp_lt", "accpt_insp_lt");
				addColumnPathMap("buf_lt", "buf_lt");
				addColumnPathMap("ord_fix_pd", "ord_fix_pd");
				addColumnPathMap("sz_day_week_typ", "sz_day_week_typ");
				addColumnPathMap("sz_day_week_typ_nm", "sz_day_week_typ_nm");
				addColumnPathMap("sz_week", "sz_week");
				addColumnPathMap("lot_sz_pd", "lot_sz_pd");
				addColumnPathMap("min_lot_qty", "min_lot_qty");
				addColumnPathMap("batch_lot_qty", "batch_lot_qty");
				addColumnPathMap("max_lot_qty", "max_lot_qty");
				addColumnPathMap("max_order", "max_order");
				addColumnPathMap("prio", "prio");
				addColumnPathMap("order_ratio", "order_ratio");
				addColumnPathMap("yield_schd_qty", "yield_schd_qty");
				addColumnPathMap("mfg_inst_qty", "mfg_inst_qty");
				addColumnPathMap("fxd_rqmt_qty", "fxd_rqmt_qty");
				addColumnPathMap("lot_issue_typ", "lot_issue_typ");
				addColumnPathMap("lot_issue_typ_nm", "lot_issue_typ_nm");
				addColumnPathMap("bkf_flg", "bkf_flg");
				addColumnPathMap("ln_stk_flg", "ln_stk_flg");
				addColumnPathMap("pre_po_tgt_flg", "pre_po_tgt_flg");
				addColumnPathMap("inst_rec_issue_flg", "inst_rec_issue_flg");
				addColumnPathMap("no_mfg_aprv_flg", "no_mfg_aprv_flg");
				addColumnPathMap("itm_lower_yield", "itm_lower_yield");
				addColumnPathMap("itm_std_yield", "itm_std_yield");
				addColumnPathMap("itm_upper_yield", "itm_upper_yield");
				addColumnPathMap("purc_id_typ", "purc_id_typ");
				addColumnPathMap("purc_id_typ_nm", "purc_id_typ_nm");
				addColumnPathMap("rqst_wg_cd", "rqst_wg_cd");
				addColumnPathMap("rqst_wg_nm", "rqst_wg_nm");
				addColumnPathMap("po_batch_flg", "po_batch_flg");
				addColumnPathMap("rsrc_std_qty1", "rsrc_std_qty1");
				addColumnPathMap("rsrc_unit_qty1", "rsrc_unit_qty1");
				addColumnPathMap("rsrc_std_qty2", "rsrc_std_qty2");
				addColumnPathMap("rsrc_unit_qty2", "rsrc_unit_qty2");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("not_mrp_flg", "not_mrp_flg");
				addColumnPathMap("cost_ratio", "cost_ratio");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("ins_func_nm", "ins_func_nm");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_func_nm", "upd_func_nm");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB1_c1_0(mcframe.serverMABS.MABSL0010.Srch01_RsltR r_dest, mcframe.serverMABS.MABSL0010.Srch01_RsltR r_src) {
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB1_c1_0(MCList<mcframe.serverMABS.MABSL0010.Srch01_RsltR> dest, MCList<mcframe.serverMABS.MABSL0010.Srch01_RsltR> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB1_c1_0();
			for(mcframe.serverMABS.MABSL0010.Srch01_RsltR r_src : src){
				mcframe.serverMABS.MABSL0010.Srch01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB1_c1_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB2専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB2の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB2(MCList<mcframe.serverMABS.MABSL0090.Srch01_RsltR> dest_Srch02_Rslt2, MCList<mcframe.serverMABS.MABSL0090.Srch01_RsltR> src0_0){
			down_SELECT_SUB2_c2_0(dest_Srch02_Rslt2, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB2_c2_0() {
			MCRowMapper map = new Map_down_SELECT_SUB2_c2_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB2_c2_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("itm_unit_cd", "itm_unit_cd");
				addColumnPathMap("itm_dec_place", "itm_dec_place");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_nm", "itm_typ_nm");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("oper_ptn", "oper_ptn");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_nm", "oper_nm");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("oper_lt", "oper_lt");
				addColumnPathMap("oper_lt_add_qty", "oper_lt_add_qty");
				addColumnPathMap("oper_offst_typ", "oper_offst_typ");
				addColumnPathMap("oper_offst_typ_nm", "oper_offst_typ_nm");
				addColumnPathMap("oper_offst", "oper_offst");
				addColumnPathMap("oper_offst_add_qty", "oper_offst_add_qty");
				addColumnPathMap("oper_unit_cd", "oper_unit_cd");
				addColumnPathMap("oper_unit_nm", "oper_unit_nm");
				addColumnPathMap("oper_std_qty", "oper_std_qty");
				addColumnPathMap("oper_conv_qty", "oper_conv_qty");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("unit_conv_rnd_typ", "unit_conv_rnd_typ");
				addColumnPathMap("unit_conv_rnd_typ_nm", "unit_conv_rnd_typ_nm");
				addColumnPathMap("yield_oper_flg", "yield_oper_flg");
				addColumnPathMap("yield_oper_ratio", "yield_oper_ratio");
				addColumnPathMap("oper_inst_grp", "oper_inst_grp");
				addColumnPathMap("oper_loc_cd", "oper_loc_cd");
				addColumnPathMap("oper_loc_nm", "oper_loc_nm");
				addColumnPathMap("lmt_fr_dt_flg", "lmt_fr_dt_flg");
				addColumnPathMap("oper_lower_yield", "oper_lower_yield");
				addColumnPathMap("oper_std_yield", "oper_std_yield");
				addColumnPathMap("oper_upper_yield", "oper_upper_yield");
				addColumnPathMap("wip_rate", "wip_rate");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("ins_func_nm", "ins_func_nm");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_func_nm", "upd_func_nm");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB2_c2_0(mcframe.serverMABS.MABSL0090.Srch01_RsltR r_dest, mcframe.serverMABS.MABSL0090.Srch01_RsltR r_src) {
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB2_c2_0(MCList<mcframe.serverMABS.MABSL0090.Srch01_RsltR> dest, MCList<mcframe.serverMABS.MABSL0090.Srch01_RsltR> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB2_c2_0();
			for(mcframe.serverMABS.MABSL0090.Srch01_RsltR r_src : src){
				mcframe.serverMABS.MABSL0090.Srch01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB2_c2_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB3専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB3の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB3(MCList<mcframe.serverMABS.MABSL0110.Srch01_RsltR> dest_Srch02_Rslt3, MCList<mcframe.serverMABS.MABSL0110.Srch01_RsltR> src0_0){
			down_SELECT_SUB3_c3_0(dest_Srch02_Rslt3, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB3_c3の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB3_c3_0() {
			MCRowMapper map = new Map_down_SELECT_SUB3_c3_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB3_c3の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB3_c3_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_nm", "itm_typ_nm");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("oper_ptn", "oper_ptn");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_nm", "oper_nm");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("wk_cost_cd", "wk_cost_cd");
				addColumnPathMap("wk_cost_nm", "wk_cost_nm");
				addColumnPathMap("wk_cost_unit_nm", "wk_cost_unit_nm");
				addColumnPathMap("wk_cost_unit_dec_place", "wk_cost_unit_dec_place");
				addColumnPathMap("wk_cost_unit_rnd_typ", "wk_cost_unit_rnd_typ");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("fxd_wk_cost", "fxd_wk_cost");
				addColumnPathMap("wk_cost", "wk_cost");
				addColumnPathMap("base_qty", "base_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_nm", "base_unit_nm");
				addColumnPathMap("itm_dec_place", "itm_dec_place");
				addColumnPathMap("wk_cost_calc_flg", "wk_cost_calc_flg");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("ins_func_nm", "ins_func_nm");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_func_nm", "upd_func_nm");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB3_c3の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB3_c3_0(mcframe.serverMABS.MABSL0110.Srch01_RsltR r_dest, mcframe.serverMABS.MABSL0110.Srch01_RsltR r_src) {
		}

		/**
		 * 連携処理SELECT_SUB3_c3の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB3_c3_0(MCList<mcframe.serverMABS.MABSL0110.Srch01_RsltR> dest, MCList<mcframe.serverMABS.MABSL0110.Srch01_RsltR> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB3_c3_0();
			for(mcframe.serverMABS.MABSL0110.Srch01_RsltR r_src : src){
				mcframe.serverMABS.MABSL0110.Srch01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB3_c3_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB4専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB4の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB4(MCList<mcframe.serverMABS.MABSL0150.Srch01_RsltR> dest_Srch02_Rslt4, MCList<mcframe.serverMABS.MABSL0150.Srch01_RsltR> src0_0){
			down_SELECT_SUB4_c4_0(dest_Srch02_Rslt4, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB4_c4の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB4_c4_0() {
			MCRowMapper map = new Map_down_SELECT_SUB4_c4_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB4_c4の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB4_c4_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_nm", "itm_typ_nm");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("loc_grp_cd", "loc_grp_cd");
				addColumnPathMap("loc_grp_nm", "loc_grp_nm");
				addColumnPathMap("prio", "prio");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("ins_func_nm", "ins_func_nm");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_func_nm", "upd_func_nm");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB4_c4の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB4_c4_0(mcframe.serverMABS.MABSL0150.Srch01_RsltR r_dest, mcframe.serverMABS.MABSL0150.Srch01_RsltR r_src) {
		}

		/**
		 * 連携処理SELECT_SUB4_c4の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB4_c4_0(MCList<mcframe.serverMABS.MABSL0150.Srch01_RsltR> dest, MCList<mcframe.serverMABS.MABSL0150.Srch01_RsltR> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB4_c4_0();
			for(mcframe.serverMABS.MABSL0150.Srch01_RsltR r_src : src){
				mcframe.serverMABS.MABSL0150.Srch01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB4_c4_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB5専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB5の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB5(MCList<mcframe.serverMABS.MABSL0800.Srch01_RsltR> dest_Srch02_Rslt5, MCList<mcframe.serverMABS.MABSL0800.Srch01_RsltR> src0_0){
			down_SELECT_SUB5_c5_0(dest_Srch02_Rslt5, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB5_c5の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB5_c5_0() {
			MCRowMapper map = new Map_down_SELECT_SUB5_c5_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB5_c5の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB5_c5_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_nm", "itm_typ_nm");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("buf_qty", "buf_qty");
				addColumnPathMap("rord_stk_qty", "rord_stk_qty");
				addColumnPathMap("gi_schd_flg", "gi_schd_flg");
				addColumnPathMap("rord_rqst_qty", "rord_rqst_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_nm", "base_unit_nm");
				addColumnPathMap("lot_sizing_flg", "lot_sizing_flg");
				addColumnPathMap("gi_loc_cd", "gi_loc_cd");
				addColumnPathMap("gi_loc_nm", "gi_loc_nm");
				addColumnPathMap("gi_str_ln_tgt_flg", "gi_str_ln_tgt_flg");
				addColumnPathMap("gi_str_ln_cd", "gi_str_ln_cd");
				addColumnPathMap("gi_str_ln_nm", "gi_str_ln_nm");
				addColumnPathMap("inpt_gi_loc_cd", "inpt_gi_loc_cd");
				addColumnPathMap("inpt_gi_loc_nm", "inpt_gi_loc_nm");
				addColumnPathMap("inpt_gi_str_ln_tgt_flg", "inpt_gi_str_ln_tgt_flg");
				addColumnPathMap("inpt_gi_str_ln_cd", "inpt_gi_str_ln_cd");
				addColumnPathMap("inpt_gi_str_ln_nm", "inpt_gi_str_ln_nm");
				addColumnPathMap("ship_gi_loc_cd", "ship_gi_loc_cd");
				addColumnPathMap("ship_gi_loc_nm", "ship_gi_loc_nm");
				addColumnPathMap("ship_gi_str_ln_tgt_flg", "ship_gi_str_ln_tgt_flg");
				addColumnPathMap("ship_gi_str_ln_cd", "ship_gi_str_ln_cd");
				addColumnPathMap("ship_gi_str_ln_nm", "ship_gi_str_ln_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("ins_func_nm", "ins_func_nm");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_func_nm", "upd_func_nm");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB5_c5の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB5_c5_0(mcframe.serverMABS.MABSL0800.Srch01_RsltR r_dest, mcframe.serverMABS.MABSL0800.Srch01_RsltR r_src) {
		}

		/**
		 * 連携処理SELECT_SUB5_c5の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB5_c5_0(MCList<mcframe.serverMABS.MABSL0800.Srch01_RsltR> dest, MCList<mcframe.serverMABS.MABSL0800.Srch01_RsltR> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB5_c5_0();
			for(mcframe.serverMABS.MABSL0800.Srch01_RsltR r_src : src){
				mcframe.serverMABS.MABSL0800.Srch01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB5_c5_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB6専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB6の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB6(MCList<mcframe.serverMABS.MABSL0170.Srch01_RsltR> dest_Srch02_Rslt6, MCList<mcframe.serverMABS.MABSL0170.Srch01_RsltR> src0_0){
			down_SELECT_SUB6_c6_0(dest_Srch02_Rslt6, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB6_c6の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB6_c6_0() {
			MCRowMapper map = new Map_down_SELECT_SUB6_c6_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB6_c6の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB6_c6_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_nm", "itm_typ_nm");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("insp_ptn_cd", "insp_ptn_cd");
				addColumnPathMap("insp_ptn_nm", "insp_ptn_nm");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("insp_mtd_typ", "insp_mtd_typ");
				addColumnPathMap("insp_mtd_typ_nm", "insp_mtd_typ_nm");
				addColumnPathMap("insp_lt", "insp_lt");
				addColumnPathMap("insp_std_no", "insp_std_no");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("spl_qty", "spl_qty");
				addColumnPathMap("std_req_flg", "std_req_flg");
				addColumnPathMap("std_cnf_req_flg", "std_cnf_req_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("ins_func_nm", "ins_func_nm");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_func_nm", "upd_func_nm");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB6_c6の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB6_c6_0(mcframe.serverMABS.MABSL0170.Srch01_RsltR r_dest, mcframe.serverMABS.MABSL0170.Srch01_RsltR r_src) {
		}

		/**
		 * 連携処理SELECT_SUB6_c6の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB6_c6_0(MCList<mcframe.serverMABS.MABSL0170.Srch01_RsltR> dest, MCList<mcframe.serverMABS.MABSL0170.Srch01_RsltR> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB6_c6_0();
			for(mcframe.serverMABS.MABSL0170.Srch01_RsltR r_src : src){
				mcframe.serverMABS.MABSL0170.Srch01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB6_c6_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB7専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB7の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB7(MCList<mcframe.serverMABS.MABSL0190.Srch01_Rslt1R> dest_Srch02_Rslt7, MCList<mcframe.serverMABS.MABSL0190.Srch01_Rslt1R> src0_0){
			down_SELECT_SUB7_c7_0(dest_Srch02_Rslt7, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB7_c7の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB7_c7_0() {
			MCRowMapper map = new Map_down_SELECT_SUB7_c7_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB7_c7の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB7_c7_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_nm", "itm_typ_nm");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("lmt_ctl_flg", "lmt_ctl_flg");
				addColumnPathMap("mfg_loc_cd", "mfg_loc_cd");
				addColumnPathMap("mfg_loc_nm", "mfg_loc_nm");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("sppl_nm", "sppl_nm");
				addColumnPathMap("maker_cd", "maker_cd");
				addColumnPathMap("maker_nm", "maker_nm");
				addColumnPathMap("from_site_cd", "from_site_cd");
				addColumnPathMap("from_site_nm", "from_site_nm");
				addColumnPathMap("to_site_cd", "to_site_cd");
				addColumnPathMap("to_site_nm", "to_site_nm");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("no_insp_flg", "no_insp_flg");
				addColumnPathMap("insp_ptn_cd", "insp_ptn_cd");
				addColumnPathMap("insp_ptn_nm", "insp_ptn_nm");
				addColumnPathMap("no_mrkt_judg_flg", "no_mrkt_judg_flg");
				addColumnPathMap("no_plnt_aprv_flg", "no_plnt_aprv_flg");
				addColumnPathMap("no_insp_aprv_flg", "no_insp_aprv_flg");
				addColumnPathMap("lmt_dt_frm_typ", "lmt_dt_frm_typ");
				addColumnPathMap("lmt_dt_frm_typ_nm", "lmt_dt_frm_typ_nm");
				addColumnPathMap("vld_pd", "vld_pd");
				addColumnPathMap("lmt_pd", "lmt_pd");
				addColumnPathMap("lot_insp_vld_pd", "lot_insp_vld_pd");
				addColumnPathMap("calc_pd_typ", "calc_pd_typ");
				addColumnPathMap("calc_pd_typ_nm", "calc_pd_typ_nm");
				addColumnPathMap("lot_insp_lmt_dt_frm_typ", "lot_insp_lmt_dt_frm_typ");
				addColumnPathMap("lot_insp_lmt_dt_frm_typ_nm", "lot_insp_lmt_dt_frm_typ_nm");
				addColumnPathMap("insp_inst_issue_typ", "insp_inst_issue_typ");
				addColumnPathMap("insp_inst_issue_typ_nm", "insp_inst_issue_typ_nm");
				addColumnPathMap("insp_offst", "insp_offst");
				addColumnPathMap("inst_rslt_issue_flg", "inst_rslt_issue_flg");
				addColumnPathMap("pre_insp_valid_flg", "pre_insp_valid_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("ins_func_nm", "ins_func_nm");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_func_nm", "upd_func_nm");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB7_c7の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB7_c7_0(mcframe.serverMABS.MABSL0190.Srch01_Rslt1R r_dest, mcframe.serverMABS.MABSL0190.Srch01_Rslt1R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB7_c7の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB7_c7_0(MCList<mcframe.serverMABS.MABSL0190.Srch01_Rslt1R> dest, MCList<mcframe.serverMABS.MABSL0190.Srch01_Rslt1R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB7_c7_0();
			for(mcframe.serverMABS.MABSL0190.Srch01_Rslt1R r_src : src){
				mcframe.serverMABS.MABSL0190.Srch01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB7_c7_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}

	//FMCB LOGIC_CONTROLLER END
}