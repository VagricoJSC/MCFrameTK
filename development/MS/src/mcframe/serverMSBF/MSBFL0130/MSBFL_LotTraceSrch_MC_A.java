package mcframe.serverMSBF.MSBFL0130;

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
 * "MSBFL_LotTraceSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBFL_LotTraceSrch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBF";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBFL0130";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBFL_LotTraceSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBFL0130_Srch01_INFO;
		this.aSrch01 = ((MSBFL_LotTraceSrch)this).new Srch01();
	}

	public static MSBFL_LotTraceSrch.Srch01 crtSrch01() {
		MSBFL_LotTraceSrch lgc = new MSBFL_LotTraceSrch();
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
	public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_CndR createSrch01_CndR(){
		return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_RsltR createSrch01_RsltR(){
		return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_RsltR.class);
	}
	protected MSBFL_LotTraceSrch.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MS_MSBFL0130_Srch02_INFO;
		this.aSrch02 = ((MSBFL_LotTraceSrch)this).new Srch02();
	}

	public static MSBFL_LotTraceSrch.Srch02 crtSrch02() {
		MSBFL_LotTraceSrch lgc = new MSBFL_LotTraceSrch();
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
	}

	protected void doSrch02() {
		aSrch02.call();
	};

	/**
	 * Srch02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_CndR createSrch02_CndR(){
		return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_CndR.create();
	}

	/**
	 * Srch02_RsltGrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGrR createSrch02_RsltGrR(){
		return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGrR.create();
	}

	/**
	 * Srch02_RsltGrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGrR> createSrch02_RsltGrL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGrR.class);
	}

	/**
	 * Srch02_RsltGiブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGiR createSrch02_RsltGiR(){
		return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGiR.create();
	}

	/**
	 * Srch02_RsltGiブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGiR> createSrch02_RsltGiL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGiR.class);
	}

	/**
	 * Srch02_RsltAprvJudgブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltAprvJudgR createSrch02_RsltAprvJudgR(){
		return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltAprvJudgR.create();
	}

	/**
	 * Srch02_RsltAprvJudgブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltAprvJudgR> createSrch02_RsltAprvJudgL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltAprvJudgR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * ロットトレース入庫情報・出庫情報を検索する<br>
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
		private final mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_CndR.create();
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_RsltR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBFL_LotTraceSrch)MSBFL_LotTraceSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_CndR createSrch01_CndR(){
			return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_RsltR createSrch01_RsltR(){
			return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_RsltR.class);
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
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>dupl_abl_flg</td></tr>
		 * 	<tr><td><br></td><td>not_mng_flg</td></tr>
		 * 	<tr><td><br></td><td>bottom_layer_only_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_CndR
		 */
		public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hrrchy</td></tr>
		 * 	<tr><td><br></td><td>extno</td></tr>
		 * 	<tr><td><br></td><td>par_extno</td></tr>
		 * 	<tr><td><br></td><td>loop_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_lot_no</td></tr>
		 * 	<tr><td><br></td><td>par_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>par_sno1</td></tr>
		 * 	<tr><td><br></td><td>par_sno2</td></tr>
		 * 	<tr><td><br></td><td>par_sno3</td></tr>
		 * 	<tr><td><br></td><td>par_sno4</td></tr>
		 * 	<tr><td><br></td><td>lot_rmrks</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_char4</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_char5</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_num1</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_num2</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_num3</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_num4</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_num5</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_dt4</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_dt5</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_flg1</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_flg2</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_flg3</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_flg4</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_flg5</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_LotTraceSrch)MSBFL_LotTraceSrch_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * ロットトレース入庫情報、ロットトレース出庫情報、承認情報、判定情報を検索する<br>
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
		private final mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGiR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltAprvJudgR> down2;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGrR.class);
			down1 = MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGiR.class);
			down2 = MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltAprvJudgR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBFL_LotTraceSrch)MSBFL_LotTraceSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_CndR createSrch02_CndR(){
			return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_CndR.create();
		}

		/**
		 * Srch02_RsltGrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGrR createSrch02_RsltGrR(){
			return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGrR.create();
		}

		/**
		 * Srch02_RsltGrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGrR> createSrch02_RsltGrL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGrR.class);
		}

		/**
		 * Srch02_RsltGiブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGiR createSrch02_RsltGiR(){
			return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGiR.create();
		}

		/**
		 * Srch02_RsltGiブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGiR> createSrch02_RsltGiL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGiR.class);
		}

		/**
		 * Srch02_RsltAprvJudgブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltAprvJudgR createSrch02_RsltAprvJudgR(){
			return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltAprvJudgR.create();
		}

		/**
		 * Srch02_RsltAprvJudgブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltAprvJudgR> createSrch02_RsltAprvJudgL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltAprvJudgR.class);
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
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>par_lot_no</td></tr>
		 * 	<tr><td><br></td><td>par_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>par_sno1</td></tr>
		 * 	<tr><td><br></td><td>par_sno2</td></tr>
		 * 	<tr><td><br></td><td>par_sno3</td></tr>
		 * 	<tr><td><br></td><td>par_sno4</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_CndR
		 */
		public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>io_act_typ</td></tr>
		 * 	<tr><td><br></td><td>io_act_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slip_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slip_schd_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>base_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dec_place</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>act_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>schd_act_typ</td></tr>
		 * 	<tr><td><br></td><td>schd_act_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>io_act_typ</td></tr>
		 * 	<tr><td><br></td><td>io_act_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slip_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slip_schd_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>base_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dec_place</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>act_dt</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>par_lot_no</td></tr>
		 * 	<tr><td><br></td><td>par_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>par_sno1</td></tr>
		 * 	<tr><td><br></td><td>par_sno2</td></tr>
		 * 	<tr><td><br></td><td>par_sno3</td></tr>
		 * 	<tr><td><br></td><td>par_sno4</td></tr>
		 * 	<tr><td><br></td><td>schd_act_typ</td></tr>
		 * 	<tr><td><br></td><td>schd_act_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGiR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ntfy_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_dt</td></tr>
		 * 	<tr><td><br></td><td>yield_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_judg_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_good_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_judg_rslt_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_judg_rslt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_dt</td></tr>
		 * 	<tr><td><br></td><td>plnt_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>plnt_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>plnt_base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_dt</td></tr>
		 * 	<tr><td><br></td><td>mrkt_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>mrkt_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>mrkt_base_unit_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltAprvJudgR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_LotTraceSrch)MSBFL_LotTraceSrch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}