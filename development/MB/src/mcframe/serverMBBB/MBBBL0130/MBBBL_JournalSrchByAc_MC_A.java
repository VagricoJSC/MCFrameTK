package mcframe.serverMBBB.MBBBL0130;

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
 * "MBBBL_JournalSrchByAc"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBBL_JournalSrchByAc_MC_A extends mcframe.serverMBUD.MBUDL5010.MBUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MBBB";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MBBBL0130";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MBBBL_JournalSrchByAc.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MB_MBBBL0130_Srch01_INFO;
		this.aSrch01 = ((MBBBL_JournalSrchByAc)this).new Srch01();
	}

	public static MBBBL_JournalSrchByAc.Srch01 crtSrch01() {
		MBBBL_JournalSrchByAc lgc = new MBBBL_JournalSrchByAc();
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
	public mcframe.serverMBBB.MBBBL0130.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMBBB.MBBBL0130.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBB.MBBBL0130.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMBBB.MBBBL0130.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBB.MBBBL0130.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMBBB.MBBBL0130.Srch01_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理をする<br>
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
		private final mcframe.serverMBBB.MBBBL0130.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBB.MBBBL0130.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBB.MBBBL0130.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMBBB.MBBBL0130.Srch01_RsltR.class);

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
			invoke((MBBBL_JournalSrchByAc)MBBBL_JournalSrchByAc_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBB.MBBBL0130.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMBBB.MBBBL0130.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBB.MBBBL0130.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMBBB.MBBBL0130.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBB.MBBBL0130.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMBBB.MBBBL0130.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>jnl_grp_no</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>ac_if_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_cnt_id</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_typ</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_if_flg</td></tr>
		 * 	<tr><td><br></td><td>slip_cnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_ac_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBB.MBBBL0130.Srch01_CndR
		 */
		public mcframe.serverMBBB.MBBBL0130.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>jnl_grp_no</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>ac_if_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_if_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slip_cnt_id</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_nm</td></tr>
		 * 	<tr><td><br></td><td>sub_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>sub_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>d_amt</td></tr>
		 * 	<tr><td><br></td><td>d_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>c_amt</td></tr>
		 * 	<tr><td><br></td><td>c_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>total_amt</td></tr>
		 * 	<tr><td><br></td><td>total_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>d_trd_amt</td></tr>
		 * 	<tr><td><br></td><td>d_trd_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>c_trd_amt</td></tr>
		 * 	<tr><td><br></td><td>c_trd_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>total_trd_amt</td></tr>
		 * 	<tr><td><br></td><td>total_trd_tax_amt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBB.MBBBL0130.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBBL_JournalSrchByAc)MBBBL_JournalSrchByAc_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}