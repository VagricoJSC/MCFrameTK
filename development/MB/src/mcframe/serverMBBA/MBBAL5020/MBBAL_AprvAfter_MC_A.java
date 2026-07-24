package mcframe.serverMBBA.MBBAL5020;

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
 * "MBBAL_AprvAfter"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBAL_AprvAfter_MC_A extends mcframe.serverMBUD.MBUDL5010.MBUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MB";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MBBA";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MBBAL5020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MBBAL_AprvAfter.AprvAfter_Upd01 aAprvAfter_Upd01;

	protected void initAprvAfter_Upd01() {
		this.info = PDef.MB_MBBAL5020_AprvAfter_Upd01_INFO;
		this.aAprvAfter_Upd01 = ((MBBAL_AprvAfter)this).new AprvAfter_Upd01();
	}

	public static MBBAL_AprvAfter.AprvAfter_Upd01 crtAprvAfter_Upd01() {
		MBBAL_AprvAfter lgc = new MBBAL_AprvAfter();
		lgc.initAprvAfter_Upd01();
		return lgc.aAprvAfter_Upd01;
	}

	protected void paramAprvAfter_Upd01(MCParam p) {
		if (this.aAprvAfter_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAprvAfter_Upd01.up0());
	}

	protected void doAprvAfter_Upd01() {
		aAprvAfter_Upd01.call();
	};

	/**
	 * AprvAfter_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR createAprvAfter_Upd01_CndR(){
		return mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR.create();
	}

	/**
	 * AprvAfter_Upd01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR> createAprvAfter_Upd01_CndL(){
		return MCList.create(mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * AprvAfter_Upd01オペレーション.<p>
	 *
	 * 承認後処理のインターフェースとして機能する。<br>
	 */
	abstract public class AprvAfter_Upd01 extends MCOperation implements mcframe.serverMBBA.MBBAL5020.IfMBBAL_AprvAfter_AprvAfter_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AprvAfter_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR> up0;
		
		
		// コンストラクタ
		protected AprvAfter_Upd01() {
			
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
			invoke((MBBAL_AprvAfter)MBBAL_AprvAfter_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * AprvAfter_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR createAprvAfter_Upd01_CndR(){
			return mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR.create();
		}

		/**
		 * AprvAfter_Upd01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR> createAprvAfter_Upd01_CndL(){
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
			return ((MBBAL_AprvAfter)MBBAL_AprvAfter_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}