package mcframe.serverMSBE.MSBEB0020;

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
 * "MSBEB_StkReallocBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEB_StkReallocBatch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBEB0020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEB_StkReallocBatch.StkRealloc_Upd01 aStkRealloc_Upd01;

	protected void initStkRealloc_Upd01() {
		this.info = PDef.MS_MSBEB0020_StkRealloc_Upd01_INFO;
		this.aStkRealloc_Upd01 = ((MSBEB_StkReallocBatch)this).new StkRealloc_Upd01();
	}

	public static MSBEB_StkReallocBatch.StkRealloc_Upd01 crtStkRealloc_Upd01() {
		MSBEB_StkReallocBatch lgc = new MSBEB_StkReallocBatch();
		lgc.initStkRealloc_Upd01();
		return lgc.aStkRealloc_Upd01;
	}

	protected void paramStkRealloc_Upd01(MCParam p) {
		if (this.aStkRealloc_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStkRealloc_Upd01.up0());
	}

	protected void doStkRealloc_Upd01() {
		aStkRealloc_Upd01.call();
	};

	/**
	 * StkRealloc_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_CndR createStkRealloc_Upd01_CndR(){
		return mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_CndR.create();
	}

	/**
	 * StkRealloc_Upd01_ShipSchdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_ShipSchdR createStkRealloc_Upd01_ShipSchdR(){
		return mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_ShipSchdR.create();
	}

	/**
	 * StkRealloc_Upd01_ShipSchdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_ShipSchdR> createStkRealloc_Upd01_ShipSchdL(){
		return MCList.create(mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_ShipSchdR.class);
	}
	protected MSBEB_StkReallocBatch.StkRealloc_Upd02 aStkRealloc_Upd02;

	protected void initStkRealloc_Upd02() {
		this.info = PDef.MS_MSBEB0020_StkRealloc_Upd02_INFO;
		this.aStkRealloc_Upd02 = ((MSBEB_StkReallocBatch)this).new StkRealloc_Upd02();
	}

	public static MSBEB_StkReallocBatch.StkRealloc_Upd02 crtStkRealloc_Upd02() {
		MSBEB_StkReallocBatch lgc = new MSBEB_StkReallocBatch();
		lgc.initStkRealloc_Upd02();
		return lgc.aStkRealloc_Upd02;
	}

	protected void paramStkRealloc_Upd02(MCParam p) {
		if (this.aStkRealloc_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStkRealloc_Upd02.up0());
		p.addDownBlock(aStkRealloc_Upd02.down0());
	}

	protected void doStkRealloc_Upd02() {
		aStkRealloc_Upd02.call();
	};

	/**
	 * StkRealloc_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_CndR createStkRealloc_Upd02_CndR(){
		return mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_CndR.create();
	}

	/**
	 * StkRealloc_Upd02_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_CndR> createStkRealloc_Upd02_CndL(){
		return MCList.create(mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_CndR.class);
	}

	/**
	 * StkRealloc_Upd02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd02_RsltR createStkRealloc_Upd02_RsltR(){
		return mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd02_RsltR.create();
	}

	/**
	 * StkRealloc_Upd02_ShipSchdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_ShipSchdR createStkRealloc_Upd02_ShipSchdR(){
		return mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_ShipSchdR.create();
	}

	/**
	 * StkRealloc_Upd02_ShipSchdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_ShipSchdR> createStkRealloc_Upd02_ShipSchdL(){
		return MCList.create(mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_ShipSchdR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * StkRealloc_Upd01オペレーション.<p>
	 *
	 * 在庫再引当バッチのメイン処理<br>
	 */
	abstract public class StkRealloc_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StkRealloc_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_CndR up0;
		/** [StkRealloc_Upd01_ShipSchd]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_ShipSchdR> aStkRealloc_Upd01_ShipSchd;
		
		
		// コンストラクタ
		protected StkRealloc_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_CndR.create();
			aStkRealloc_Upd01_ShipSchd = MCList.create(mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_ShipSchdR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEB_StkReallocBatch)MSBEB_StkReallocBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * StkRealloc_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_CndR createStkRealloc_Upd01_CndR(){
			return mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_CndR.create();
		}

		/**
		 * StkRealloc_Upd01_ShipSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_ShipSchdR createStkRealloc_Upd01_ShipSchdR(){
			return mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_ShipSchdR.create();
		}

		/**
		 * StkRealloc_Upd01_ShipSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_ShipSchdR> createStkRealloc_Upd01_ShipSchdL(){
			return MCList.create(mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_ShipSchdR.class);
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
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm_prio_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_CndR
		 */
		public mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_CndR up0() {
			return up0;
		}



		/**
		 * [StkRealloc_Upd01_ShipSchd]ブロックのコンテナaStkRealloc_Upd01_ShipSchdLを返します。
		 *
		 * @return StkRealloc_Upd01_ShipSchdL
		 */
		public MCList<mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_ShipSchdR> StkRealloc_Upd01_ShipSchd() {
			return aStkRealloc_Upd01_ShipSchd;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEB_StkReallocBatch)MSBEB_StkReallocBatch_MC_A.this).info;
		}


	}
	/**
	 * StkRealloc_Upd02オペレーション.<p>
	 *
	 * 在庫再引当バッチのスレッドごとの処理<br>
	 */
	abstract public class StkRealloc_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StkRealloc_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd02_RsltR down0;
		/** [StkRealloc_Upd02_ShipSchd]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_ShipSchdR> aStkRealloc_Upd02_ShipSchd;
		
		
		// コンストラクタ
		protected StkRealloc_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_CndR.class);
			down0 = mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd02_RsltR.create();
			aStkRealloc_Upd02_ShipSchd = MCList.create(mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_ShipSchdR.class);

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
			invoke((MSBEB_StkReallocBatch)MSBEB_StkReallocBatch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * StkRealloc_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_CndR createStkRealloc_Upd02_CndR(){
			return mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_CndR.create();
		}

		/**
		 * StkRealloc_Upd02_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_CndR> createStkRealloc_Upd02_CndL(){
			return MCList.create(mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_CndR.class);
		}

		/**
		 * StkRealloc_Upd02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd02_RsltR createStkRealloc_Upd02_RsltR(){
			return mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd02_RsltR.create();
		}

		/**
		 * StkRealloc_Upd02_ShipSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_ShipSchdR createStkRealloc_Upd02_ShipSchdR(){
			return mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_ShipSchdR.create();
		}

		/**
		 * StkRealloc_Upd02_ShipSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_ShipSchdR> createStkRealloc_Upd02_ShipSchdL(){
			return MCList.create(mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_ShipSchdR.class);
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
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm_prio_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>total_cnt</td></tr>
		 * 	<tr><td><br></td><td>all_alloc_cnt</td></tr>
		 * 	<tr><td><br></td><td>part_alloc_cnt</td></tr>
		 * 	<tr><td><br></td><td>non_alloc_cnt</td></tr>
		 * 	<tr><td><br></td><td>error_cnt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd02_RsltR
		 */
		public mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd02_RsltR down0() {
			return down0;
		}


		/**
		 * [StkRealloc_Upd02_ShipSchd]ブロックのコンテナaStkRealloc_Upd02_ShipSchdLを返します。
		 *
		 * @return StkRealloc_Upd02_ShipSchdL
		 */
		public MCList<mcframe.serverMSBE.MSBEB0020.StkRealloc_Upd01_ShipSchdR> StkRealloc_Upd02_ShipSchd() {
			return aStkRealloc_Upd02_ShipSchd;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEB_StkReallocBatch)MSBEB_StkReallocBatch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}