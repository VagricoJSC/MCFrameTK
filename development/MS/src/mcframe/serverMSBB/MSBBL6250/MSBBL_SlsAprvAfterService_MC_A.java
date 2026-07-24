package mcframe.serverMSBB.MSBBL6250;

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
 * "MSBBL_SlsAprvAfterService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBL_SlsAprvAfterService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBB";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBBL6250";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBBL_SlsAprvAfterService.SlsAprvAfter_Upd01 aSlsAprvAfter_Upd01;

	protected void initSlsAprvAfter_Upd01() {
		this.info = PDef.MS_MSBBL6250_SlsAprvAfter_Upd01_INFO;
		this.aSlsAprvAfter_Upd01 = ((MSBBL_SlsAprvAfterService)this).new SlsAprvAfter_Upd01();
	}

	public static MSBBL_SlsAprvAfterService.SlsAprvAfter_Upd01 crtSlsAprvAfter_Upd01() {
		MSBBL_SlsAprvAfterService lgc = new MSBBL_SlsAprvAfterService();
		lgc.initSlsAprvAfter_Upd01();
		return lgc.aSlsAprvAfter_Upd01;
	}

	protected void paramSlsAprvAfter_Upd01(MCParam p) {
		if (this.aSlsAprvAfter_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlsAprvAfter_Upd01.up0());
	}

	protected void doSlsAprvAfter_Upd01() {
		aSlsAprvAfter_Upd01.call();
	};

	/**
	 * SlsAprvAfter_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR createSlsAprvAfter_Upd01_CndR(){
		return mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR.create();
	}

	/**
	 * SlsAprvAfter_Upd01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR> createSlsAprvAfter_Upd01_CndL(){
		return MCList.create(mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR.class);
	}
	protected MSBBL_SlsAprvAfterService.SlsAprvAfter_Upd02 aSlsAprvAfter_Upd02;

	protected void initSlsAprvAfter_Upd02() {
		this.info = PDef.MS_MSBBL6250_SlsAprvAfter_Upd02_INFO;
		this.aSlsAprvAfter_Upd02 = ((MSBBL_SlsAprvAfterService)this).new SlsAprvAfter_Upd02();
	}

	public static MSBBL_SlsAprvAfterService.SlsAprvAfter_Upd02 crtSlsAprvAfter_Upd02() {
		MSBBL_SlsAprvAfterService lgc = new MSBBL_SlsAprvAfterService();
		lgc.initSlsAprvAfter_Upd02();
		return lgc.aSlsAprvAfter_Upd02;
	}

	protected void paramSlsAprvAfter_Upd02(MCParam p) {
		if (this.aSlsAprvAfter_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlsAprvAfter_Upd02.up0());
	}

	protected void doSlsAprvAfter_Upd02() {
		aSlsAprvAfter_Upd02.call();
	};

	/**
	 * SlsAprvAfter_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR createSlsAprvAfter_Upd02_CndR(){
		return mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR.create();
	}

	/**
	 * SlsAprvAfter_Upd02_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR> createSlsAprvAfter_Upd02_CndL(){
		return MCList.create(mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR.class);
	}

	/**
	 * SlsAprvAfter_Upd02_ShipSchdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6250.SlsAprvAfter_Upd02_ShipSchdR createSlsAprvAfter_Upd02_ShipSchdR(){
		return mcframe.serverMSBB.MSBBL6250.SlsAprvAfter_Upd02_ShipSchdR.create();
	}

	/**
	 * SlsAprvAfter_Upd02_ShipSchdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6250.SlsAprvAfter_Upd02_ShipSchdR> createSlsAprvAfter_Upd02_ShipSchdL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6250.SlsAprvAfter_Upd02_ShipSchdR.class);
	}
	protected MSBBL_SlsAprvAfterService.SlsAprvAfter_Upd03 aSlsAprvAfter_Upd03;

	protected void initSlsAprvAfter_Upd03() {
		this.info = PDef.MS_MSBBL6250_SlsAprvAfter_Upd03_INFO;
		this.aSlsAprvAfter_Upd03 = ((MSBBL_SlsAprvAfterService)this).new SlsAprvAfter_Upd03();
	}

	public static MSBBL_SlsAprvAfterService.SlsAprvAfter_Upd03 crtSlsAprvAfter_Upd03() {
		MSBBL_SlsAprvAfterService lgc = new MSBBL_SlsAprvAfterService();
		lgc.initSlsAprvAfter_Upd03();
		return lgc.aSlsAprvAfter_Upd03;
	}

	protected void paramSlsAprvAfter_Upd03(MCParam p) {
		if (this.aSlsAprvAfter_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlsAprvAfter_Upd03.up0());
	}

	protected void doSlsAprvAfter_Upd03() {
		aSlsAprvAfter_Upd03.call();
	};

	/**
	 * SlsAprvAfter_Upd03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR createSlsAprvAfter_Upd03_CndR(){
		return mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR.create();
	}

	/**
	 * SlsAprvAfter_Upd03_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR> createSlsAprvAfter_Upd03_CndL(){
		return MCList.create(mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * SlsAprvAfter_Upd01オペレーション.<p>
	 *
	 * 見積に対して、承認もしくは承認取消が行われた際の処理を実施する。<br>
	 */
	abstract public class SlsAprvAfter_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMBBA.MBBAL5020.IfMBBAL_AprvAfter_AprvAfter_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlsAprvAfter_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR> up0;
		
		
		// コンストラクタ
		protected SlsAprvAfter_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR.class);

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
			invoke((MSBBL_SlsAprvAfterService)MSBBL_SlsAprvAfterService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SlsAprvAfter_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR createSlsAprvAfter_Upd01_CndR(){
			return mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR.create();
		}

		/**
		 * SlsAprvAfter_Upd01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR> createSlsAprvAfter_Upd01_CndL(){
			return MCList.create(mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>old_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>last_aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>last_aprv_tm</td></tr>
		 * 	<tr><td><br></td><td>src_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>src_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>src_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd1</td></tr>
		 * 	<tr><td><br></td><td>src_amt1</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd2</td></tr>
		 * 	<tr><td><br></td><td>src_amt2</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd3</td></tr>
		 * 	<tr><td><br></td><td>src_amt3</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key1</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key2</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key3</td></tr>
		 * 	<tr><td><br></td><td>aprv_src_no1</td></tr>
		 * 	<tr><td><br></td><td>aprv_src_no2</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsAprvAfterService)MSBBL_SlsAprvAfterService_MC_A.this).info;
		}


	}
	/**
	 * SlsAprvAfter_Upd02オペレーション.<p>
	 *
	 * 受注に対して、承認もしくは承認取消が行われた際の処理を実施する。<br>
	 */
	abstract public class SlsAprvAfter_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMBBA.MBBAL5020.IfMBBAL_AprvAfter_AprvAfter_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlsAprvAfter_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR> up0;
		/** [SlsAprvAfter_Upd02_ShipSchd]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6250.SlsAprvAfter_Upd02_ShipSchdR> aSlsAprvAfter_Upd02_ShipSchd;
		
		
		// コンストラクタ
		protected SlsAprvAfter_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR.class);
			aSlsAprvAfter_Upd02_ShipSchd = MCList.create(mcframe.serverMSBB.MSBBL6250.SlsAprvAfter_Upd02_ShipSchdR.class);

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
			invoke((MSBBL_SlsAprvAfterService)MSBBL_SlsAprvAfterService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SlsAprvAfter_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR createSlsAprvAfter_Upd02_CndR(){
			return mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR.create();
		}

		/**
		 * SlsAprvAfter_Upd02_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR> createSlsAprvAfter_Upd02_CndL(){
			return MCList.create(mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR.class);
		}

		/**
		 * SlsAprvAfter_Upd02_ShipSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6250.SlsAprvAfter_Upd02_ShipSchdR createSlsAprvAfter_Upd02_ShipSchdR(){
			return mcframe.serverMSBB.MSBBL6250.SlsAprvAfter_Upd02_ShipSchdR.create();
		}

		/**
		 * SlsAprvAfter_Upd02_ShipSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6250.SlsAprvAfter_Upd02_ShipSchdR> createSlsAprvAfter_Upd02_ShipSchdL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6250.SlsAprvAfter_Upd02_ShipSchdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>old_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>last_aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>last_aprv_tm</td></tr>
		 * 	<tr><td><br></td><td>src_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>src_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>src_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd1</td></tr>
		 * 	<tr><td><br></td><td>src_amt1</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd2</td></tr>
		 * 	<tr><td><br></td><td>src_amt2</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd3</td></tr>
		 * 	<tr><td><br></td><td>src_amt3</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key1</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key2</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key3</td></tr>
		 * 	<tr><td><br></td><td>aprv_src_no1</td></tr>
		 * 	<tr><td><br></td><td>aprv_src_no2</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR> up0() {
			return up0;
		}



		/**
		 * [SlsAprvAfter_Upd02_ShipSchd]ブロックのコンテナaSlsAprvAfter_Upd02_ShipSchdLを返します。
		 *
		 * @return SlsAprvAfter_Upd02_ShipSchdL
		 */
		public MCList<mcframe.serverMSBB.MSBBL6250.SlsAprvAfter_Upd02_ShipSchdR> SlsAprvAfter_Upd02_ShipSchd() {
			return aSlsAprvAfter_Upd02_ShipSchd;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsAprvAfterService)MSBBL_SlsAprvAfterService_MC_A.this).info;
		}


	}
	/**
	 * SlsAprvAfter_Upd03オペレーション.<p>
	 *
	 * 売上値引に対して、承認もしくは承認取消が行われた際の処理を実施する。<br>
	 */
	abstract public class SlsAprvAfter_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMBBA.MBBAL5020.IfMBBAL_AprvAfter_AprvAfter_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlsAprvAfter_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR> up0;
		
		
		// コンストラクタ
		protected SlsAprvAfter_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR.class);

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
			invoke((MSBBL_SlsAprvAfterService)MSBBL_SlsAprvAfterService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SlsAprvAfter_Upd03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR createSlsAprvAfter_Upd03_CndR(){
			return mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR.create();
		}

		/**
		 * SlsAprvAfter_Upd03_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR> createSlsAprvAfter_Upd03_CndL(){
			return MCList.create(mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>old_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>last_aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>last_aprv_tm</td></tr>
		 * 	<tr><td><br></td><td>src_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>src_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>src_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd1</td></tr>
		 * 	<tr><td><br></td><td>src_amt1</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd2</td></tr>
		 * 	<tr><td><br></td><td>src_amt2</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd3</td></tr>
		 * 	<tr><td><br></td><td>src_amt3</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key1</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key2</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key3</td></tr>
		 * 	<tr><td><br></td><td>aprv_src_no1</td></tr>
		 * 	<tr><td><br></td><td>aprv_src_no2</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsAprvAfterService)MSBBL_SlsAprvAfterService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}