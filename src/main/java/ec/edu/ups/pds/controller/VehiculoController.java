package ec.edu.ups.pds.controller;

import ec.edu.ups.pds.dto.VehiculoDTO;
import ec.edu.ups.pds.service.IVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/vehiculo")
public class VehiculoController {
    @Autowired
    private IVehiculoService vehiculoService;

    @PostMapping
    public ResponseEntity guardar(@RequestBody VehiculoDTO vehiculoDTO) {
        try {
            vehiculoService.guardar(vehiculoDTO);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }

    }
}
