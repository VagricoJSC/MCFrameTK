package mcframe.serverMBBC.MBBCL0010;

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
 * "MBBCL_AttachmentSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBCL_AttachmentSrch_MC_A extends mcframe.serverMBUD.MBUDL5010.MBUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MBBC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MBBCL0010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MBBCL_AttachmentSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MB_MBBCL0010_Srch01_INFO;
		this.aSrch01 = ((MBBCL_AttachmentSrch)this).new Srch01();
	}

	public static MBBCL_AttachmentSrch.Srch01 crtSrch01() {
		MBBCL_AttachmentSrch lgc = new MBBCL_AttachmentSrch();
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
	public mcframe.serverMBBC.MBBCL0010.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMBBC.MBBCL0010.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBC.MBBCL0010.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMBBC.MBBCL0010.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBC.MBBCL0010.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMBBC.MBBCL0010.Srch01_RsltR.class);
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
		private final mcframe.serverMBBC.MBBCL0010.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBC.MBBCL0010.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBC.MBBCL0010.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMBBC.MBBCL0010.Srch01_RsltR.class);

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
			invoke((MBBCL_AttachmentSrch)MBBCL_AttachmentSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBC.MBBCL0010.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMBBC.MBBCL0010.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBC.MBBCL0010.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMBBC.MBBCL0010.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBC.MBBCL0010.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMBBC.MBBCL0010.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>biz_typ</td></tr>
		 * 	<tr><td><br></td><td>report_id</td></tr>
		 * 	<tr><td><br></td><td>file_nm</td></tr>
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>amt_fr</td></tr>
		 * 	<tr><td><br></td><td>amt_to</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>disp_old_flg</td></tr>
		 * 	<tr><td><br></td><td>biz_key1</td></tr>
		 * 	<tr><td><br></td><td>biz_key2</td></tr>
		 * 	<tr><td><br></td><td>biz_key3</td></tr>
		 * 	<tr><td><br></td><td>biz_key4</td></tr>
		 * 	<tr><td><br></td><td>biz_key5</td></tr>
		 * 	<tr><td><br></td><td>biz_key6</td></tr>
		 * 	<tr><td><br></td><td>biz_key7</td></tr>
		 * 	<tr><td><br></td><td>biz_key8</td></tr>
		 * 	<tr><td><br></td><td>biz_key9</td></tr>
		 * 	<tr><td><br></td><td>biz_key10</td></tr>
		 * 	<tr><td><br></td><td>rmrks1</td></tr>
		 * 	<tr><td><br></td><td>rmrks2</td></tr>
		 * 	<tr><td><br></td><td>rmrks3</td></tr>
		 * 	<tr><td><br></td><td>rmrks4</td></tr>
		 * 	<tr><td><br></td><td>rmrks5</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr1</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr2</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr3</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr4</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr5</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr6</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr7</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr8</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr9</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr10</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr11</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr12</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr13</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr14</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr15</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr16</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr17</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr18</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr19</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr20</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBC.MBBCL0010.Srch01_CndR
		 */
		public mcframe.serverMBBC.MBBCL0010.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>edition</td></tr>
		 * 	<tr><td><br></td><td>file_path</td></tr>
		 * 	<tr><td><br></td><td>file_nm</td></tr>
		 * 	<tr><td><br></td><td>report_id</td></tr>
		 * 	<tr><td><br></td><td>report_nm</td></tr>
		 * 	<tr><td><br></td><td>biz_typ</td></tr>
		 * 	<tr><td><br></td><td>biz_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>biz_key1</td></tr>
		 * 	<tr><td><br></td><td>biz_key2</td></tr>
		 * 	<tr><td><br></td><td>biz_key3</td></tr>
		 * 	<tr><td><br></td><td>biz_key4</td></tr>
		 * 	<tr><td><br></td><td>biz_key5</td></tr>
		 * 	<tr><td><br></td><td>biz_key6</td></tr>
		 * 	<tr><td><br></td><td>biz_key7</td></tr>
		 * 	<tr><td><br></td><td>biz_key8</td></tr>
		 * 	<tr><td><br></td><td>biz_key9</td></tr>
		 * 	<tr><td><br></td><td>biz_key10</td></tr>
		 * 	<tr><td><br></td><td>dt</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_nm</td></tr>
		 * 	<tr><td><br></td><td>amt</td></tr>
		 * 	<tr><td><br></td><td>fs_flg</td></tr>
		 * 	<tr><td><br></td><td>doc_id</td></tr>
		 * 	<tr><td><br></td><td>preview_url</td></tr>
		 * 	<tr><td><br></td><td>rmrks1</td></tr>
		 * 	<tr><td><br></td><td>rmrks2</td></tr>
		 * 	<tr><td><br></td><td>rmrks3</td></tr>
		 * 	<tr><td><br></td><td>rmrks4</td></tr>
		 * 	<tr><td><br></td><td>rmrks5</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr1</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr2</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr3</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr4</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr5</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr6</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr7</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr8</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr9</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr10</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr11</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr12</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr13</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr14</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr15</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr16</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr17</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr18</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr19</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr20</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ_nm</td></tr>
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBC.MBBCL0010.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBCL_AttachmentSrch)MBBCL_AttachmentSrch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}