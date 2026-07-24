package mcframe.serverMSBE.MSBEL0040;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MSBEL_AllocSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_AllocSrch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBEL0040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_AllocSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBEL0040_Srch01_INFO;
		this.aSrch01 = ((MSBEL_AllocSrch)this).new Srch01();
	}

	public static MSBEL_AllocSrch.Srch01 crtSrch01() {
		MSBEL_AllocSrch lgc = new MSBEL_AllocSrch();
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
		p.addDownBlock(aSrch01.down1());
		p.addDownBlock(aSrch01.down2());
		p.addDownBlock(aSrch01.down3());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL0040.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBE.MSBEL0040.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltQtyブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL0040.Srch01_RsltQtyR createSrch01_RsltQtyR(){
		return mcframe.serverMSBE.MSBEL0040.Srch01_RsltQtyR.create();
	}

	/**
	 * Srch01_RsltContFctrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL0040.Srch01_RsltContFctrR createSrch01_RsltContFctrR(){
		return mcframe.serverMSBE.MSBEL0040.Srch01_RsltContFctrR.create();
	}

	/**
	 * Srch01_RsltGrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR createSrch01_RsltGrR(){
		return mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR.create();
	}

	/**
	 * Srch01_RsltGrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR> createSrch01_RsltGrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR.class);
	}

	/**
	 * Srch01_RsltGiブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR createSrch01_RsltGiR(){
		return mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR.create();
	}

	/**
	 * Srch01_RsltGiブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR> createSrch01_RsltGiL(){
		return MCList.create(mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR.class);
	}

	/**
	 * Srch01_LnoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL0040.Srch01_LnoR createSrch01_LnoR(){
		return mcframe.serverMSBE.MSBEL0040.Srch01_LnoR.create();
	}

	/**
	 * Srch01_LnoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL0040.Srch01_LnoR> createSrch01_LnoL(){
		return MCList.create(mcframe.serverMSBE.MSBEL0040.Srch01_LnoR.class);
	}
	protected MSBEL_AllocSrch.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MS_MSBEL0040_Srch02_INFO;
		this.aSrch02 = ((MSBEL_AllocSrch)this).new Srch02();
	}

	public static MSBEL_AllocSrch.Srch02 crtSrch02() {
		MSBEL_AllocSrch lgc = new MSBEL_AllocSrch();
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
	}

	protected void doSrch02() {
		aSrch02.call();
	};

	/**
	 * Srch02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL0040.Srch01_CndR createSrch02_CndR(){
		return mcframe.serverMSBE.MSBEL0040.Srch01_CndR.create();
	}

	/**
	 * Srch02_RsltQtyブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL0040.Srch01_RsltQtyR createSrch02_RsltQtyR(){
		return mcframe.serverMSBE.MSBEL0040.Srch01_RsltQtyR.create();
	}

	/**
	 * Srch02_RsltContFctrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL0040.Srch01_RsltContFctrR createSrch02_RsltContFctrR(){
		return mcframe.serverMSBE.MSBEL0040.Srch01_RsltContFctrR.create();
	}

	/**
	 * Srch02_RsltGrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR createSrch02_RsltGrR(){
		return mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR.create();
	}

	/**
	 * Srch02_RsltGrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR> createSrch02_RsltGrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR.class);
	}

	/**
	 * Srch02_RsltGiブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR createSrch02_RsltGiR(){
		return mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR.create();
	}

	/**
	 * Srch02_RsltGiブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR> createSrch02_RsltGiL(){
		return MCList.create(mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR.class);
	}

	/**
	 * Srch02_LnoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL0040.Srch01_LnoR createSrch02_LnoR(){
		return mcframe.serverMSBE.MSBEL0040.Srch01_LnoR.create();
	}

	/**
	 * Srch02_LnoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL0040.Srch01_LnoR> createSrch02_LnoL(){
		return MCList.create(mcframe.serverMSBE.MSBEL0040.Srch01_LnoR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 在庫推移情報を検索する<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
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
		private final mcframe.serverMSBE.MSBEL0040.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL0040.Srch01_RsltQtyR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL0040.Srch01_RsltContFctrR down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR> down3;
		/** [Srch01_Lno]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL0040.Srch01_LnoR> aSrch01_Lno;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL0040.Srch01_CndR.create();
			down0 = mcframe.serverMSBE.MSBEL0040.Srch01_RsltQtyR.create();
			down1 = mcframe.serverMSBE.MSBEL0040.Srch01_RsltContFctrR.create();
			down2 = MCList.create(mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR.class);
			down3 = MCList.create(mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR.class);
			aSrch01_Lno = MCList.create(mcframe.serverMSBE.MSBEL0040.Srch01_LnoR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_AllocSrch)MSBEL_AllocSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL0040.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBE.MSBEL0040.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltQtyブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL0040.Srch01_RsltQtyR createSrch01_RsltQtyR(){
			return mcframe.serverMSBE.MSBEL0040.Srch01_RsltQtyR.create();
		}

		/**
		 * Srch01_RsltContFctrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL0040.Srch01_RsltContFctrR createSrch01_RsltContFctrR(){
			return mcframe.serverMSBE.MSBEL0040.Srch01_RsltContFctrR.create();
		}

		/**
		 * Srch01_RsltGrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR createSrch01_RsltGrR(){
			return mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR.create();
		}

		/**
		 * Srch01_RsltGrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR> createSrch01_RsltGrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR.class);
		}

		/**
		 * Srch01_RsltGiブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR createSrch01_RsltGiR(){
			return mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR.create();
		}

		/**
		 * Srch01_RsltGiブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR> createSrch01_RsltGiL(){
			return MCList.create(mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR.class);
		}

		/**
		 * Srch01_LnoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL0040.Srch01_LnoR createSrch01_LnoR(){
			return mcframe.serverMSBE.MSBEL0040.Srch01_LnoR.create();
		}

		/**
		 * Srch01_LnoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL0040.Srch01_LnoR> createSrch01_LnoL(){
			return MCList.create(mcframe.serverMSBE.MSBEL0040.Srch01_LnoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>gr_prcd</td></tr>
		 * 	<tr><td><br></td><td>gr_sts_opn_grp</td></tr>
		 * 	<tr><td><br></td><td>gr_sts_ordsav_grp</td></tr>
		 * 	<tr><td><br></td><td>gr_sts_fix_grp</td></tr>
		 * 	<tr><td><br></td><td>gr_sts_schd_grp</td></tr>
		 * 	<tr><td><br></td><td>gr_sts_ord_grp</td></tr>
		 * 	<tr><td><br></td><td>gr_act</td></tr>
		 * 	<tr><td><br></td><td>gi_prcd</td></tr>
		 * 	<tr><td><br></td><td>gi_sts_opn_grp</td></tr>
		 * 	<tr><td><br></td><td>gi_sts_ordsav_grp</td></tr>
		 * 	<tr><td><br></td><td>gi_sts_fix_grp</td></tr>
		 * 	<tr><td><br></td><td>gi_sts_schd_grp</td></tr>
		 * 	<tr><td><br></td><td>gi_sts_ord_grp</td></tr>
		 * 	<tr><td><br></td><td>gi_act</td></tr>
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * 	<tr><td><br></td><td>alloc_gi_flg</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL0040.Srch01_CndR
		 */
		public mcframe.serverMSBE.MSBEL0040.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>stk_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_qty2</td></tr>
		 * 	<tr><td><br></td><td>stk_qty3</td></tr>
		 * 	<tr><td><br></td><td>stk_qty4</td></tr>
		 * 	<tr><td><br></td><td>gr_qty</td></tr>
		 * 	<tr><td><br></td><td>gr_qty2</td></tr>
		 * 	<tr><td><br></td><td>gr_qty3</td></tr>
		 * 	<tr><td><br></td><td>gr_qty4</td></tr>
		 * 	<tr><td><br></td><td>gi_qty</td></tr>
		 * 	<tr><td><br></td><td>gi_qty2</td></tr>
		 * 	<tr><td><br></td><td>gi_qty3</td></tr>
		 * 	<tr><td><br></td><td>gi_qty4</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL0040.Srch01_RsltQtyR
		 */
		public mcframe.serverMSBE.MSBEL0040.Srch01_RsltQtyR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>stk_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_qty2</td></tr>
		 * 	<tr><td><br></td><td>stk_qty3</td></tr>
		 * 	<tr><td><br></td><td>stk_qty4</td></tr>
		 * 	<tr><td><br></td><td>gr_qty</td></tr>
		 * 	<tr><td><br></td><td>gr_qty2</td></tr>
		 * 	<tr><td><br></td><td>gr_qty3</td></tr>
		 * 	<tr><td><br></td><td>gr_qty4</td></tr>
		 * 	<tr><td><br></td><td>gi_qty</td></tr>
		 * 	<tr><td><br></td><td>gi_qty2</td></tr>
		 * 	<tr><td><br></td><td>gi_qty3</td></tr>
		 * 	<tr><td><br></td><td>gi_qty4</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL0040.Srch01_RsltContFctrR
		 */
		public mcframe.serverMSBE.MSBEL0040.Srch01_RsltContFctrR down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>schd_stk_typ</td></tr>
		 * 	<tr><td><br></td><td>schd_stk_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dt</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>grs_alloc_avl_qty</td></tr>
		 * 	<tr><td><br></td><td>io_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trn_typ</td></tr>
		 * 	<tr><td><br></td><td>trn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>io_act_typ</td></tr>
		 * 	<tr><td><br></td><td>io_act_typ_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>schd_stk_typ</td></tr>
		 * 	<tr><td><br></td><td>schd_stk_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dt</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>grs_alloc_avl_qty</td></tr>
		 * 	<tr><td><br></td><td>io_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trn_typ</td></tr>
		 * 	<tr><td><br></td><td>trn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>io_act_typ</td></tr>
		 * 	<tr><td><br></td><td>io_act_typ_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR> down3() {
			return down3;
		}


		/**
		 * [Srch01_Lno]ブロックのコンテナaSrch01_LnoLを返します。
		 *
		 * @return Srch01_LnoL
		 */
		public MCList<mcframe.serverMSBE.MSBEL0040.Srch01_LnoR> Srch01_Lno() {
			return aSrch01_Lno;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_AllocSrch)MSBEL_AllocSrch_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 引当状況を検索する<br>
	 */
	abstract public class Srch02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
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
		private final mcframe.serverMSBE.MSBEL0040.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL0040.Srch01_RsltQtyR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL0040.Srch01_RsltContFctrR down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL0040.Srch01_LnoR> down4;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL0040.Srch01_CndR.create();
			down0 = mcframe.serverMSBE.MSBEL0040.Srch01_RsltQtyR.create();
			down1 = mcframe.serverMSBE.MSBEL0040.Srch01_RsltContFctrR.create();
			down2 = MCList.create(mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR.class);
			down3 = MCList.create(mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR.class);
			down4 = MCList.create(mcframe.serverMSBE.MSBEL0040.Srch01_LnoR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_AllocSrch)MSBEL_AllocSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
		}
		/**
		 * Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL0040.Srch01_CndR createSrch02_CndR(){
			return mcframe.serverMSBE.MSBEL0040.Srch01_CndR.create();
		}

		/**
		 * Srch02_RsltQtyブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL0040.Srch01_RsltQtyR createSrch02_RsltQtyR(){
			return mcframe.serverMSBE.MSBEL0040.Srch01_RsltQtyR.create();
		}

		/**
		 * Srch02_RsltContFctrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL0040.Srch01_RsltContFctrR createSrch02_RsltContFctrR(){
			return mcframe.serverMSBE.MSBEL0040.Srch01_RsltContFctrR.create();
		}

		/**
		 * Srch02_RsltGrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR createSrch02_RsltGrR(){
			return mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR.create();
		}

		/**
		 * Srch02_RsltGrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR> createSrch02_RsltGrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR.class);
		}

		/**
		 * Srch02_RsltGiブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR createSrch02_RsltGiR(){
			return mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR.create();
		}

		/**
		 * Srch02_RsltGiブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR> createSrch02_RsltGiL(){
			return MCList.create(mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR.class);
		}

		/**
		 * Srch02_LnoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL0040.Srch01_LnoR createSrch02_LnoR(){
			return mcframe.serverMSBE.MSBEL0040.Srch01_LnoR.create();
		}

		/**
		 * Srch02_LnoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL0040.Srch01_LnoR> createSrch02_LnoL(){
			return MCList.create(mcframe.serverMSBE.MSBEL0040.Srch01_LnoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt</td></tr>
		 * 	<tr><td><br></td><td>gr_prcd</td></tr>
		 * 	<tr><td><br></td><td>gr_sts_opn_grp</td></tr>
		 * 	<tr><td><br></td><td>gr_sts_ordsav_grp</td></tr>
		 * 	<tr><td><br></td><td>gr_sts_fix_grp</td></tr>
		 * 	<tr><td><br></td><td>gr_sts_schd_grp</td></tr>
		 * 	<tr><td><br></td><td>gr_sts_ord_grp</td></tr>
		 * 	<tr><td><br></td><td>gr_act</td></tr>
		 * 	<tr><td><br></td><td>gi_prcd</td></tr>
		 * 	<tr><td><br></td><td>gi_sts_opn_grp</td></tr>
		 * 	<tr><td><br></td><td>gi_sts_ordsav_grp</td></tr>
		 * 	<tr><td><br></td><td>gi_sts_fix_grp</td></tr>
		 * 	<tr><td><br></td><td>gi_sts_schd_grp</td></tr>
		 * 	<tr><td><br></td><td>gi_sts_ord_grp</td></tr>
		 * 	<tr><td><br></td><td>gi_act</td></tr>
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * 	<tr><td><br></td><td>avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>except_invld_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>except_alloc_wait_flg</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL0040.Srch01_CndR
		 */
		public mcframe.serverMSBE.MSBEL0040.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>stk_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_qty2</td></tr>
		 * 	<tr><td><br></td><td>stk_qty3</td></tr>
		 * 	<tr><td><br></td><td>stk_qty4</td></tr>
		 * 	<tr><td><br></td><td>gr_qty</td></tr>
		 * 	<tr><td><br></td><td>gr_qty2</td></tr>
		 * 	<tr><td><br></td><td>gr_qty3</td></tr>
		 * 	<tr><td><br></td><td>gr_qty4</td></tr>
		 * 	<tr><td><br></td><td>gi_qty</td></tr>
		 * 	<tr><td><br></td><td>gi_qty2</td></tr>
		 * 	<tr><td><br></td><td>gi_qty3</td></tr>
		 * 	<tr><td><br></td><td>gi_qty4</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL0040.Srch01_RsltQtyR
		 */
		public mcframe.serverMSBE.MSBEL0040.Srch01_RsltQtyR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>stk_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_qty2</td></tr>
		 * 	<tr><td><br></td><td>stk_qty3</td></tr>
		 * 	<tr><td><br></td><td>stk_qty4</td></tr>
		 * 	<tr><td><br></td><td>gr_qty</td></tr>
		 * 	<tr><td><br></td><td>gr_qty2</td></tr>
		 * 	<tr><td><br></td><td>gr_qty3</td></tr>
		 * 	<tr><td><br></td><td>gr_qty4</td></tr>
		 * 	<tr><td><br></td><td>gi_qty</td></tr>
		 * 	<tr><td><br></td><td>gi_qty2</td></tr>
		 * 	<tr><td><br></td><td>gi_qty3</td></tr>
		 * 	<tr><td><br></td><td>gi_qty4</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL0040.Srch01_RsltContFctrR
		 */
		public mcframe.serverMSBE.MSBEL0040.Srch01_RsltContFctrR down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>schd_stk_typ</td></tr>
		 * 	<tr><td><br></td><td>schd_stk_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dt</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>asst_typ</td></tr>
		 * 	<tr><td><br></td><td>asst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>lot_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>lot_wait_qty</td></tr>
		 * 	<tr><td><br></td><td>lot_alloc_avl_qty</td></tr>
		 * 	<tr><td><br></td><td>not_lot_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>not_lot_wait_qty</td></tr>
		 * 	<tr><td><br></td><td>not_lot_alloc_avl_qty</td></tr>
		 * 	<tr><td><br></td><td>lg_lot_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>lg_lot_wait_qty</td></tr>
		 * 	<tr><td><br></td><td>lg_lot_alloc_avl_qty</td></tr>
		 * 	<tr><td><br></td><td>lg_not_lot_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>lg_not_lot_wait_qty</td></tr>
		 * 	<tr><td><br></td><td>lg_not_lot_alloc_avl_qty</td></tr>
		 * 	<tr><td><br></td><td>grs_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>grs_wait_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>wait_qty</td></tr>
		 * 	<tr><td><br></td><td>grs_alloc_avl_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>act_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>act_cont_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>act_cont_wait_qty</td></tr>
		 * 	<tr><td><br></td><td>act_cont_alloc_avl_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_wait_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_alloc_avl_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>lot_seq</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_to</td></tr>
		 * 	<tr><td><br></td><td>stop_dt</td></tr>
		 * 	<tr><td><br></td><td>rel_dt</td></tr>
		 * 	<tr><td><br></td><td>alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>loc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>io_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>io_schd_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_seq</td></tr>
		 * 	<tr><td><br></td><td>overdue_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>another_loc_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>abnormal_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>lno</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>schd_stk_typ</td></tr>
		 * 	<tr><td><br></td><td>schd_stk_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dt</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>asst_typ</td></tr>
		 * 	<tr><td><br></td><td>asst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>lot_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>lot_wait_qty</td></tr>
		 * 	<tr><td><br></td><td>lot_alloc_avl_qty</td></tr>
		 * 	<tr><td><br></td><td>not_lot_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>not_lot_wait_qty</td></tr>
		 * 	<tr><td><br></td><td>not_lot_alloc_avl_qty</td></tr>
		 * 	<tr><td><br></td><td>lg_lot_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>lg_lot_wait_qty</td></tr>
		 * 	<tr><td><br></td><td>lg_lot_alloc_avl_qty</td></tr>
		 * 	<tr><td><br></td><td>lg_not_lot_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>lg_not_lot_wait_qty</td></tr>
		 * 	<tr><td><br></td><td>lg_not_lot_alloc_avl_qty</td></tr>
		 * 	<tr><td><br></td><td>grs_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>grs_wait_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>wait_qty</td></tr>
		 * 	<tr><td><br></td><td>grs_alloc_avl_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>act_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>act_cont_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>act_cont_wait_qty</td></tr>
		 * 	<tr><td><br></td><td>act_cont_alloc_avl_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_wait_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_alloc_avl_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>lot_seq</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_to</td></tr>
		 * 	<tr><td><br></td><td>stop_dt</td></tr>
		 * 	<tr><td><br></td><td>rel_dt</td></tr>
		 * 	<tr><td><br></td><td>alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>loc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>io_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>io_schd_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_seq</td></tr>
		 * 	<tr><td><br></td><td>overdue_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>another_loc_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>abnormal_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>lno</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL0040.Srch01_RsltGrR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>gi_lno</td></tr>
		 * 	<tr><td><br></td><td>gr_lno</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL0040.Srch01_LnoR> down4() {
			return down4;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_AllocSrch)MSBEL_AllocSrch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}