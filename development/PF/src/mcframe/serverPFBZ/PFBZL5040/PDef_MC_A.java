package mcframe.serverPFBZ.PFBZL5040;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cn;

/**
 * [PFBZL_FileRecv]の入出力情報となる電文（上り・下り電文）と
 * 画面コンテナの間のデータ変換の定義を行うクラスです。
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズはできません。
 */
@SuppressWarnings({"all"})
abstract public class PDef_MC_A extends MCDef {
	public MCContainerDef getCustomDef(String id){
		if (id == null) {
			return null;
		} 
//FMCB GET_DEF START
		else if (id.equals("PF.PFBZL5040.Srch01.UP.BLOCK0")){
			return PF_PFBZL5040_Srch01_UP_BLOCK0();
		}
		else if (id.equals("PF.PFBZL5040.Srch01.DOWN.BLOCK0")){
			return PF_PFBZL5040_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("PF.PFBZL5040.Srch02.UP.BLOCK0")){
			return PF_PFBZL5040_Srch02_UP_BLOCK0();
		}
		else if (id.equals("PF.PFBZL5040.Srch02.DOWN.BLOCK0")){
			return PF_PFBZL5040_Srch02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo PF_PFBZL5040_Srch01_INFO = new MCOperationInfo("PF", "PFBZL5040", "Srch01", "000000", new PDef());

	public static MCContainerDef PF_PFBZL5040_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFBZL5040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef PF_PFBZL5040_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFBZL5040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("sdrvIf" + ".if_proc_typ", "if_proc_typ"),
				MCItemDef.create("sdrvIf" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("remote_dir", "remote_dir"),
				MCItemDef.create("local_dir", "local_dir"),
				MCItemDef.create("transfer_lock_typ", "transfer_lock_typ"),
				MCItemDef.create("sts_fsuffix", "sts_fsuffix"),
				MCItemDef.create("ftp_host", "ftp_host"),
				MCItemDef.create("ftp_user", "ftp_user"),
				MCItemDef.create("ftp_password", "ftp_password"),
				MCItemDef.create("ftp_port", "ftp_port"),
				MCItemDef.create("ftp_mode", "ftp_mode"),
				MCItemDef.create("ftp_opts", "ftp_opts"),
				MCItemDef.create("sftp_host", "sftp_host"),
				MCItemDef.create("sftp_user", "sftp_user"),
				MCItemDef.create("sftp_password", "sftp_password"),
				MCItemDef.create("sftp_port", "sftp_port"),
				MCItemDef.create("sftp_key_file_path", "sftp_key_file_path")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo PF_PFBZL5040_Srch02_INFO = new MCOperationInfo("PF", "PFBZL5040", "Srch02", "000000", new PDef());

	public static MCContainerDef PF_PFBZL5040_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFBZL5040", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef PF_PFBZL5040_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFBZL5040", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("sdrvIf" + ".if_proc_typ", "if_proc_typ"),
				MCItemDef.create("sdrvIf" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("local_dir", "local_dir"),
				MCItemDef.create("transfer_lock_typ", "transfer_lock_typ"),
				MCItemDef.create("sts_fsuffix", "sts_fsuffix")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

